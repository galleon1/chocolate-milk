/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXML.java,v 1.2 2010-05-24 21:39:09 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXML.
 * 
 * @version $Revision: 1.2 $ $Date: 2010-05-24 21:39:09 $
 */
@SuppressWarnings("serial")
public class QBXML implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _QBXMLSequence.
     */
    private org.chocolate_milk.model.QBXMLSequence _QBXMLSequence;

    /**
     * Field _QBXMLSequence2.
     */
    private org.chocolate_milk.model.QBXMLSequence2 _QBXMLSequence2;


      //----------------/
     //- Constructors -/
    //----------------/

    //public QBXML() {
      //  super();
    //}


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'QBXMLSequence'.
     * 
     * @return the value of field 'QBXMLSequence'.
     */
    public org.chocolate_milk.model.QBXMLSequence getQBXMLSequence(
    ) {
        return this._QBXMLSequence;
    }

    /**
     * Returns the value of field 'QBXMLSequence2'.
     * 
     * @return the value of field 'QBXMLSequence2'.
     */
    public org.chocolate_milk.model.QBXMLSequence2 getQBXMLSequence2(
    ) {
        return this._QBXMLSequence2;
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
     * Sets the value of field 'QBXMLSequence'.
     * 
     * @param QBXMLSequence the value of field 'QBXMLSequence'.
     */
    public void setQBXMLSequence(
            final org.chocolate_milk.model.QBXMLSequence QBXMLSequence) {
        this._QBXMLSequence = QBXMLSequence;
        this._choiceValue = QBXMLSequence;
    }

    /**
     * Sets the value of field 'QBXMLSequence2'.
     * 
     * @param QBXMLSequence2 the value of field 'QBXMLSequence2'.
     */
    public void setQBXMLSequence2(
            final org.chocolate_milk.model.QBXMLSequence2 QBXMLSequence2) {
        this._QBXMLSequence2 = QBXMLSequence2;
        this._choiceValue = QBXMLSequence2;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.QBXML
     */
    public static org.chocolate_milk.model.QBXML unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXML) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXML.class, reader);
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
