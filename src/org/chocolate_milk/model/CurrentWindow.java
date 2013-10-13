/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CurrentWindow.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CurrentWindow.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CurrentWindow implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _txnTypeID.
     */
    private org.chocolate_milk.model.TxnTypeID _txnTypeID;

    /**
     * Field _listTypeID.
     */
    private org.chocolate_milk.model.ListTypeID _listTypeID;


      //----------------/
     //- Constructors -/
    //----------------/

    public CurrentWindow() {
        super();
    }


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
     * Returns the value of field 'listTypeID'.
     * 
     * @return the value of field 'ListTypeID'.
     */
    public org.chocolate_milk.model.ListTypeID getListTypeID(
    ) {
        return this._listTypeID;
    }

    /**
     * Returns the value of field 'txnTypeID'.
     * 
     * @return the value of field 'TxnTypeID'.
     */
    public org.chocolate_milk.model.TxnTypeID getTxnTypeID(
    ) {
        return this._txnTypeID;
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
     * Sets the value of field 'listTypeID'.
     * 
     * @param listTypeID the value of field 'listTypeID'.
     */
    public void setListTypeID(
            final org.chocolate_milk.model.ListTypeID listTypeID) {
        this._listTypeID = listTypeID;
        this._choiceValue = listTypeID;
    }

    /**
     * Sets the value of field 'txnTypeID'.
     * 
     * @param txnTypeID the value of field 'txnTypeID'.
     */
    public void setTxnTypeID(
            final org.chocolate_milk.model.TxnTypeID txnTypeID) {
        this._txnTypeID = txnTypeID;
        this._choiceValue = txnTypeID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.CurrentWindo
     */
    public static org.chocolate_milk.model.CurrentWindow unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CurrentWindow) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CurrentWindow.class, reader);
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
