/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PaymentLine.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PaymentLine.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PaymentLine implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _paymentTxnID.
     */
    private org.chocolate_milk.model.PaymentLinePaymentTxnID _paymentTxnID;

    /**
     * Field _paymentTxnLineID.
     */
    private org.chocolate_milk.model.PaymentLinePaymentTxnLineID _paymentTxnLineID;

    /**
     * Field _overrideMemo.
     */
    private java.lang.String _overrideMemo;

    /**
     * Field _overrideCheckNumber.
     */
    private java.lang.String _overrideCheckNumber;

    /**
     * Field _overrideClassRef.
     */
    private org.chocolate_milk.model.OverrideClassRef _overrideClassRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public PaymentLine() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'overrideCheckNumber'.
     * 
     * @return the value of field 'OverrideCheckNumber'.
     */
    public java.lang.String getOverrideCheckNumber(
    ) {
        return this._overrideCheckNumber;
    }

    /**
     * Returns the value of field 'overrideClassRef'.
     * 
     * @return the value of field 'OverrideClassRef'.
     */
    public org.chocolate_milk.model.OverrideClassRef getOverrideClassRef(
    ) {
        return this._overrideClassRef;
    }

    /**
     * Returns the value of field 'overrideMemo'.
     * 
     * @return the value of field 'OverrideMemo'.
     */
    public java.lang.String getOverrideMemo(
    ) {
        return this._overrideMemo;
    }

    /**
     * Returns the value of field 'paymentTxnID'.
     * 
     * @return the value of field 'PaymentTxnID'.
     */
    public org.chocolate_milk.model.PaymentLinePaymentTxnID getPaymentTxnID(
    ) {
        return this._paymentTxnID;
    }

    /**
     * Returns the value of field 'paymentTxnLineID'.
     * 
     * @return the value of field 'PaymentTxnLineID'.
     */
    public org.chocolate_milk.model.PaymentLinePaymentTxnLineID getPaymentTxnLineID(
    ) {
        return this._paymentTxnLineID;
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
     * Sets the value of field 'overrideCheckNumber'.
     * 
     * @param overrideCheckNumber the value of field
     * 'overrideCheckNumber'.
     */
    public void setOverrideCheckNumber(
            final java.lang.String overrideCheckNumber) {
        this._overrideCheckNumber = overrideCheckNumber;
    }

    /**
     * Sets the value of field 'overrideClassRef'.
     * 
     * @param overrideClassRef the value of field 'overrideClassRef'
     */
    public void setOverrideClassRef(
            final org.chocolate_milk.model.OverrideClassRef overrideClassRef) {
        this._overrideClassRef = overrideClassRef;
    }

    /**
     * Sets the value of field 'overrideMemo'.
     * 
     * @param overrideMemo the value of field 'overrideMemo'.
     */
    public void setOverrideMemo(
            final java.lang.String overrideMemo) {
        this._overrideMemo = overrideMemo;
    }

    /**
     * Sets the value of field 'paymentTxnID'.
     * 
     * @param paymentTxnID the value of field 'paymentTxnID'.
     */
    public void setPaymentTxnID(
            final org.chocolate_milk.model.PaymentLinePaymentTxnID paymentTxnID) {
        this._paymentTxnID = paymentTxnID;
    }

    /**
     * Sets the value of field 'paymentTxnLineID'.
     * 
     * @param paymentTxnLineID the value of field 'paymentTxnLineID'
     */
    public void setPaymentTxnLineID(
            final org.chocolate_milk.model.PaymentLinePaymentTxnLineID paymentTxnLineID) {
        this._paymentTxnLineID = paymentTxnLineID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.PaymentLine
     */
    public static org.chocolate_milk.model.PaymentLine unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PaymentLine) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PaymentLine.class, reader);
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
