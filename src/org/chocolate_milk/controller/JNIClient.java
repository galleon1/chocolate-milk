/*
 * JNIClient connects to the quickbooks dll file
 */

package org.chocolate_milk.controller;

import java.util.ArrayList;
import org.chocolate_milk.controller.jacob.*;
import org.chocolate_milk.Constants.CONSTANTS;

public class JNIClient extends AbstractClient  {


    protected boolean error=false;
    protected ArrayList<String> errorList=new ArrayList<String>();
    
    //Loads the jacob dll from jar if necessary
    private static final NativeLibraryLoader loader = new NativeLibraryLoader();

    
   
    /* Use overloaded constructor instead.
     * No arg constructor uses sensible defaults;
     * Mostly for testing.  
     *
     */
    public JNIClient() {
        
        connection = new JNIConnection(CONSTANTS.DEFAULT_APPID.getProperty(), CONSTANTS.DEFAULT_APPNAME.getProperty());
        connection.setFileMode(FileModeE.openDoNotCare);
        connection.setFileOpen(false);


    }



    /*
     *  Overloaded constructor takes details to open connection;
     *
     *  == The string fileName should be like this "C:\\QB\\MyQBCompany.qbw" and
     *  NOT like this "C:\QB\MyQBCompany.qbw"
     *
     *  == The int fileModeE should be taken from a static value in org.chocolate_milk.controller.jacob.FileModeE
     *  == The appId is something you can set to identify your Application to Quickbooks
     *  == The appName is something you can set to identy your Application to Users of Quickbooks
     */
    public JNIClient(String fileName, int fileModeE, String appId, String appName) {
       
        connection= new JNIConnection();
        connection.setFileName(fileName);
        connection.setFileMode( fileModeE );
        connection.setAppId(appId);
        connection.setAppName(appName);
    }


   
    /*
     * Open method opens a connection AND a session to quickbooks.
     *
     */
    public void open() throws Exception {

        try {

            getConnection().open();
            setOpen(true);

        } catch (Exception e) {
            setError(true);
            errorList.add(e.getMessage());
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }

    }

    
    /*
     *Closes connection and session to quickbooks
     *
     */
    public void close() {

        if (connection != null && connection.isFileOpen()) {

            connection.close();
            
        }
    }

   
 
    /*
     *
     *  Param String qbxml request to send to quickbooks
     *  Returns a qbxml string response from quickbooks
     */
    public String exchangeXML(String xmlRequest) throws Exception {

        return getConnection().exchangeXML(xmlRequest);

    }

    
    /*
     * The JNIConnection wraps quickbooks qbxmlrp library
     */
    private JNIConnection connection;

    /**
     * @return the connection
     */
    public JNIConnection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(JNIConnection connection) {
        this.connection = connection;
    }

    /**
     * @return the error
     */
    public boolean isError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     * @return the errorList
     */
    public ArrayList<String> getErrorList() {
        return errorList;
    }

    /**
     * @param errorList the errorList to set
     */
    public void setErrorList(ArrayList<String> errorList) {
        this.errorList = errorList;
    }

    

   
}
