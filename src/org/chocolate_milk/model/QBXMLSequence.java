/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSequence.java,v 1.2 2010-05-24 21:39:09 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLSequence.
 * 
 * @version $Revision: 1.2 $ $Date: 2010-05-24 21:39:09 $
 */
@SuppressWarnings("serial")
public class QBXMLSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _signonMsgsRq.
     */
    private org.chocolate_milk.model.SignonMsgsRq _signonMsgsRq;

    /**
     * Field _QBXMLSequenceChoice.
     */
    private org.chocolate_milk.model.QBXMLSequenceChoice _QBXMLSequenceChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    //public QBXMLSequence() {
     //   super();
    //}


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'QBXMLSequenceChoice'.
     * 
     * @return the value of field 'QBXMLSequenceChoice'.
     */
    public org.chocolate_milk.model.QBXMLSequenceChoice getQBXMLSequenceChoice(
    ) {
        return this._QBXMLSequenceChoice;
    }

    /**
     * Returns the value of field 'signonMsgsRq'.
     * 
     * @return the value of field 'SignonMsgsRq'.
     */
    public org.chocolate_milk.model.SignonMsgsRq getSignonMsgsRq(
    ) {
        return this._signonMsgsRq;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'QBXMLSequenceChoice'.
     * 
     * @param QBXMLSequenceChoice the value of field
     * 'QBXMLSequenceChoice'.
     */
    public void setQBXMLSequenceChoice(
            final org.chocolate_milk.model.QBXMLSequenceChoice QBXMLSequenceChoice) {
        this._QBXMLSequenceChoice = QBXMLSequenceChoice;
    }

    /**
     * Sets the value of field 'signonMsgsRq'.
     * 
     * @param signonMsgsRq the value of field 'signonMsgsRq'.
     */
    public void setSignonMsgsRq(
            final org.chocolate_milk.model.SignonMsgsRq signonMsgsRq) {
        this._signonMsgsRq = signonMsgsRq;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.QBXMLSequenc
     */
    public static org.chocolate_milk.model.QBXMLSequence unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXMLSequence) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXMLSequence.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
