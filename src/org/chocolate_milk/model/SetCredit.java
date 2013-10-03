/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SetCredit.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SetCredit.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SetCredit implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditTxnID.
     */
    private org.chocolate_milk.model.SetCreditCreditTxnID _creditTxnID;

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _appliedAmount.
     */
    private java.lang.String _appliedAmount;


      //----------------/
     //- Constructors -/
    //----------------/

    public SetCredit() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appliedAmount'.
     * 
     * @return the value of field 'AppliedAmount'.
     */
    public java.lang.String getAppliedAmount(
    ) {
        return this._appliedAmount;
    }

    /**
     * Returns the value of field 'creditTxnID'.
     * 
     * @return the value of field 'CreditTxnID'.
     */
    public org.chocolate_milk.model.SetCreditCreditTxnID getCreditTxnID(
    ) {
        return this._creditTxnID;
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
     * Sets the value of field 'appliedAmount'.
     * 
     * @param appliedAmount the value of field 'appliedAmount'.
     */
    public void setAppliedAmount(
            final java.lang.String appliedAmount) {
        this._appliedAmount = appliedAmount;
    }

    /**
     * Sets the value of field 'creditTxnID'.
     * 
     * @param creditTxnID the value of field 'creditTxnID'.
     */
    public void setCreditTxnID(
            final org.chocolate_milk.model.SetCreditCreditTxnID creditTxnID) {
        this._creditTxnID = creditTxnID;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.SetCredit
     */
    public static org.chocolate_milk.model.SetCredit unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SetCredit) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SetCredit.class, reader);
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
