/*
 * The abstractclient provides the
 * xml handling features common to
 * all the specific client versions
 */
package org.chocolate_milk.controller;

import org.chocolate_milk.Constants;
import org.chocolate_milk.model.QBXML;
import org.chocolate_milk.model.QBXMLMsgsRq;
import org.chocolate_milk.model.QBXMLMsgsRs;
import org.chocolate_milk.model.QBXMLSequence;
import org.chocolate_milk.model.QBXMLSequenceChoice;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.XMLContext;

import java.io.StringReader;
import java.io.StringWriter;


/**
 * The abstract client marshalls and unmarshalls xml to java objects
 * 
 * @author ryan
 */
public abstract class AbstractClient implements Client {


    
    //Preloads the XML model to make marshalling and
    //unmarshalling faster.
    //this can take quite awhile to run
    //but it only happens once...
    static {
        Runnable backgroundLoader = new Runnable() {

            public void run() {
                try {
                    getContext().addPackage("org.chocolate_milk.model");

                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println(e.getMessage());

                }
            }
        };

        Thread myThread = new Thread(backgroundLoader);
        myThread.setDaemon(true);
        myThread.start();

    }

    /*
     *
     * Converts a QBXML request object to a String, sends the string to quickbooks
     * and then reads the string response from quickbooks and returns a QBXML object response
     *
     */

    public QBXML exchangeXML(QBXML qbxml) throws Exception {

        
        StringWriter stringWriter = new StringWriter();
        
        Marshaller marshaller = getContext().createMarshaller();
        
        marshaller.addProcessingInstruction("qbxml", "version=\"" + qbxmlVersion + "\""); //WRONG VERSION NUMBER? BIG HEADACHES, spurious errors
        marshaller.setWriter(stringWriter);
        marshaller.marshal(qbxml);

        String request = stringWriter.toString();

        String xml = exchangeXML(request);

        StringReader reader = new StringReader(xml);
        
        Unmarshaller unmarshaller = getContext().createUnmarshaller();

        QBXML response = (QBXML) unmarshaller.unmarshal(reader);

        return response;
    }



    /*
     *  Convenience method to create a QBXML request
     *
     */

    public QBXMLMsgsRs exchangeXML(QBXMLMsgsRq request) throws Exception {

        QBXML qbxml = new QBXML();

        QBXMLSequence qbxmlsequence = new QBXMLSequence();

        qbxml.setQBXMLSequence(qbxmlsequence);

        QBXMLSequenceChoice seqChoice = new QBXMLSequenceChoice();

        qbxmlsequence.setQBXMLSequenceChoice(seqChoice);

        seqChoice.setQBXMLMsgsRq(request);

        QBXML qbxmlRs = exchangeXML(qbxml);

        return qbxmlRs.getQBXMLSequence2().getQBXMLSequence2Choice().getQBXMLMsgsRs();

    }

    

    /*
     * XMLContext stores information about our object model and then provides factories to create marhallers and
     * unmarshallers
     * 
     */
    private static XMLContext context = new XMLContext();


    /**
     * @return the context
     */
    public static XMLContext getContext() {
        return context;
    }

    /**
     * @param aContext the context to set
     */
    public static void setContext(XMLContext aContext) {
        context = aContext;

    }


    /*
     * True when connected to quickbooks
     */
    private boolean open;
    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean isOpen) {
        open = isOpen;
    }


    protected String qbxmlVersion=Constants.CONSTANTS.DEFAULT_QBXML_VERSION.getProperty();
    /**
     * @return the qbxml Version
     */
    public String getQbxmlVersion() {
        return qbxmlVersion;
    }

    /**
     * @param qbxmlServer the qbxmlVersion Number to set
     */
    public void setQbxmlVersion(String qbxmlVersion) {
        this.qbxmlVersion = qbxmlVersion;
    }
    
}
