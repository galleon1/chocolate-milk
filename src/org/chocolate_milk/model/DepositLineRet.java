/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DepositLineRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DepositLineRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DepositLineRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnType.
     */
    private org.chocolate_milk.model.types.TxnTypeType _txnType;

    /**
     * Field _txnID.
     */
    private java.lang.String _txnID;

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _paymentTxnLineID.
     */
    private java.lang.String _paymentTxnLineID;

    /**
     * Field _depositInfoRet.
     */
    private org.chocolate_milk.model.DepositInfoRet _depositInfoRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public DepositLineRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'depositInfoRet'.
     * 
     * @return the value of field 'DepositInfoRet'.
     */
    public org.chocolate_milk.model.DepositInfoRet getDepositInfoRet(
    ) {
        return this._depositInfoRet;
    }

    /**
     * Returns the value of field 'paymentTxnLineID'.
     * 
     * @return the value of field 'PaymentTxnLineID'.
     */
    public java.lang.String getPaymentTxnLineID(
    ) {
        return this._paymentTxnLineID;
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
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public java.lang.String getTxnLineID(
    ) {
        return this._txnLineID;
    }

    /**
     * Returns the value of field 'txnType'.
     * 
     * @return the value of field 'TxnType'.
     */
    public org.chocolate_milk.model.types.TxnTypeType getTxnType(
    ) {
        return this._txnType;
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
     * Sets the value of field 'depositInfoRet'.
     * 
     * @param depositInfoRet the value of field 'depositInfoRet'.
     */
    public void setDepositInfoRet(
            final org.chocolate_milk.model.DepositInfoRet depositInfoRet) {
        this._depositInfoRet = depositInfoRet;
    }

    /**
     * Sets the value of field 'paymentTxnLineID'.
     * 
     * @param paymentTxnLineID the value of field 'paymentTxnLineID'
     */
    public void setPaymentTxnLineID(
            final java.lang.String paymentTxnLineID) {
        this._paymentTxnLineID = paymentTxnLineID;
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
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final java.lang.String txnLineID) {
        this._txnLineID = txnLineID;
    }

    /**
     * Sets the value of field 'txnType'.
     * 
     * @param txnType the value of field 'txnType'.
     */
    public void setTxnType(
            final org.chocolate_milk.model.types.TxnTypeType txnType) {
        this._txnType = txnType;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.DepositLineRet
     */
    public static org.chocolate_milk.model.DepositLineRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DepositLineRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DepositLineRet.class, reader);
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
