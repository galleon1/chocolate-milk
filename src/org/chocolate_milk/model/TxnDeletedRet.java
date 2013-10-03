/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnDeletedRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnDeletedRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class TxnDeletedRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnDelType.
     */
    private org.chocolate_milk.model.types.TxnDelTypeType _txnDelType;

    /**
     * Field _txnID.
     */
    private java.lang.String _txnID;

    /**
     * Field _timeCreated.
     */
    private java.lang.String _timeCreated;

    /**
     * Field _timeDeleted.
     */
    private java.lang.String _timeDeleted;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnDeletedRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Returns the value of field 'timeCreated'.
     * 
     * @return the value of field 'TimeCreated'.
     */
    public java.lang.String getTimeCreated(
    ) {
        return this._timeCreated;
    }

    /**
     * Returns the value of field 'timeDeleted'.
     * 
     * @return the value of field 'TimeDeleted'.
     */
    public java.lang.String getTimeDeleted(
    ) {
        return this._timeDeleted;
    }

    /**
     * Returns the value of field 'txnDelType'.
     * 
     * @return the value of field 'TxnDelType'.
     */
    public org.chocolate_milk.model.types.TxnDelTypeType getTxnDelType(
    ) {
        return this._txnDelType;
    }

    /**
     * Returns the value of field 'txnID'.
     * 
     * @return the value of field 'TxnID'.
     */
    public java.lang.String getTxnID(
    ) {
        return this._txnID;
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
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * Sets the value of field 'timeCreated'.
     * 
     * @param timeCreated the value of field 'timeCreated'.
     */
    public void setTimeCreated(
            final java.lang.String timeCreated) {
        this._timeCreated = timeCreated;
    }

    /**
     * Sets the value of field 'timeDeleted'.
     * 
     * @param timeDeleted the value of field 'timeDeleted'.
     */
    public void setTimeDeleted(
            final java.lang.String timeDeleted) {
        this._timeDeleted = timeDeleted;
    }

    /**
     * Sets the value of field 'txnDelType'.
     * 
     * @param txnDelType the value of field 'txnDelType'.
     */
    public void setTxnDelType(
            final org.chocolate_milk.model.types.TxnDelTypeType txnDelType) {
        this._txnDelType = txnDelType;
    }

    /**
     * Sets the value of field 'txnID'.
     * 
     * @param txnID the value of field 'txnID'.
     */
    public void setTxnID(
            final java.lang.String txnID) {
        this._txnID = txnID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.TxnDeletedRe
     */
    public static org.chocolate_milk.model.TxnDeletedRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnDeletedRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnDeletedRet.class, reader);
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
