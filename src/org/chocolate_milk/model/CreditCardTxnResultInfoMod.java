/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardTxnResultInfoMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardTxnResultInfoMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CreditCardTxnResultInfoMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resultCode.
     */
    private long _resultCode;

    /**
     * keeps track of state for field: _resultCode
     */
    private boolean _has_resultCode;

    /**
     * Field _resultMessage.
     */
    private java.lang.String _resultMessage;

    /**
     * Field _creditCardTransID.
     */
    private java.lang.String _creditCardTransID;

    /**
     * Field _merchantAccountNumber.
     */
    private java.lang.String _merchantAccountNumber;

    /**
     * Field _authorizationCode.
     */
    private java.lang.String _authorizationCode;

    /**
     * Field _AVSStreet.
     */
    private org.chocolate_milk.model.types.AVSStreetType _AVSStreet;

    /**
     * Field _AVSZip.
     */
    private org.chocolate_milk.model.types.AVSZipType _AVSZip;

    /**
     * Field _cardSecurityCodeMatch.
     */
    private org.chocolate_milk.model.types.CardSecurityCodeMatchType _cardSecurityCodeMatch;

    /**
     * Field _reconBatchID.
     */
    private java.lang.String _reconBatchID;

    /**
     * Field _paymentGroupingCode.
     */
    private long _paymentGroupingCode;

    /**
     * keeps track of state for field: _paymentGroupingCode
     */
    private boolean _has_paymentGroupingCode;

    /**
     * Field _paymentStatus.
     */
    private org.chocolate_milk.model.types.PaymentStatusType _paymentStatus;

    /**
     * Field _txnAuthorizationTime.
     */
    private java.lang.String _txnAuthorizationTime;

    /**
     * Field _txnAuthorizationStamp.
     */
    private long _txnAuthorizationStamp;

    /**
     * keeps track of state for field: _txnAuthorizationStamp
     */
    private boolean _has_txnAuthorizationStamp;

    /**
     * Field _clientTransID.
     */
    private java.lang.String _clientTransID;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardTxnResultInfoMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deletePaymentGroupingCode(
    ) {
        this._has_paymentGroupingCode= false;
    }

    /**
     */
    public void deleteResultCode(
    ) {
        this._has_resultCode= false;
    }

    /**
     */
    public void deleteTxnAuthorizationStamp(
    ) {
        this._has_txnAuthorizationStamp= false;
    }

    /**
     * Returns the value of field 'AVSStreet'.
     * 
     * @return the value of field 'AVSStreet'.
     */
    public org.chocolate_milk.model.types.AVSStreetType getAVSStreet(
    ) {
        return this._AVSStreet;
    }

    /**
     * Returns the value of field 'AVSZip'.
     * 
     * @return the value of field 'AVSZip'.
     */
    public org.chocolate_milk.model.types.AVSZipType getAVSZip(
    ) {
        return this._AVSZip;
    }

    /**
     * Returns the value of field 'authorizationCode'.
     * 
     * @return the value of field 'AuthorizationCode'.
     */
    public java.lang.String getAuthorizationCode(
    ) {
        return this._authorizationCode;
    }

    /**
     * Returns the value of field 'cardSecurityCodeMatch'.
     * 
     * @return the value of field 'CardSecurityCodeMatch'.
     */
    public org.chocolate_milk.model.types.CardSecurityCodeMatchType getCardSecurityCodeMatch(
    ) {
        return this._cardSecurityCodeMatch;
    }

    /**
     * Returns the value of field 'clientTransID'.
     * 
     * @return the value of field 'ClientTransID'.
     */
    public java.lang.String getClientTransID(
    ) {
        return this._clientTransID;
    }

    /**
     * Returns the value of field 'creditCardTransID'.
     * 
     * @return the value of field 'CreditCardTransID'.
     */
    public java.lang.String getCreditCardTransID(
    ) {
        return this._creditCardTransID;
    }

    /**
     * Returns the value of field 'merchantAccountNumber'.
     * 
     * @return the value of field 'MerchantAccountNumber'.
     */
    public java.lang.String getMerchantAccountNumber(
    ) {
        return this._merchantAccountNumber;
    }

    /**
     * Returns the value of field 'paymentGroupingCode'.
     * 
     * @return the value of field 'PaymentGroupingCode'.
     */
    public long getPaymentGroupingCode(
    ) {
        return this._paymentGroupingCode;
    }

    /**
     * Returns the value of field 'paymentStatus'.
     * 
     * @return the value of field 'PaymentStatus'.
     */
    public org.chocolate_milk.model.types.PaymentStatusType getPaymentStatus(
    ) {
        return this._paymentStatus;
    }

    /**
     * Returns the value of field 'reconBatchID'.
     * 
     * @return the value of field 'ReconBatchID'.
     */
    public java.lang.String getReconBatchID(
    ) {
        return this._reconBatchID;
    }

    /**
     * Returns the value of field 'resultCode'.
     * 
     * @return the value of field 'ResultCode'.
     */
    public long getResultCode(
    ) {
        return this._resultCode;
    }

    /**
     * Returns the value of field 'resultMessage'.
     * 
     * @return the value of field 'ResultMessage'.
     */
    public java.lang.String getResultMessage(
    ) {
        return this._resultMessage;
    }

    /**
     * Returns the value of field 'txnAuthorizationStamp'.
     * 
     * @return the value of field 'TxnAuthorizationStamp'.
     */
    public long getTxnAuthorizationStamp(
    ) {
        return this._txnAuthorizationStamp;
    }

    /**
     * Returns the value of field 'txnAuthorizationTime'.
     * 
     * @return the value of field 'TxnAuthorizationTime'.
     */
    public java.lang.String getTxnAuthorizationTime(
    ) {
        return this._txnAuthorizationTime;
    }

    /**
     * Method hasPaymentGroupingCode.
     * 
     * @return true if at least one PaymentGroupingCode has been
     * added
     */
    public boolean hasPaymentGroupingCode(
    ) {
        return this._has_paymentGroupingCode;
    }

    /**
     * Method hasResultCode.
     * 
     * @return true if at least one ResultCode has been added
     */
    public boolean hasResultCode(
    ) {
        return this._has_resultCode;
    }

    /**
     * Method hasTxnAuthorizationStamp.
     * 
     * @return true if at least one TxnAuthorizationStamp has been
     * added
     */
    public boolean hasTxnAuthorizationStamp(
    ) {
        return this._has_txnAuthorizationStamp;
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
     * Sets the value of field 'AVSStreet'.
     * 
     * @param AVSStreet the value of field 'AVSStreet'.
     */
    public void setAVSStreet(
            final org.chocolate_milk.model.types.AVSStreetType AVSStreet) {
        this._AVSStreet = AVSStreet;
    }

    /**
     * Sets the value of field 'AVSZip'.
     * 
     * @param AVSZip the value of field 'AVSZip'.
     */
    public void setAVSZip(
            final org.chocolate_milk.model.types.AVSZipType AVSZip) {
        this._AVSZip = AVSZip;
    }

    /**
     * Sets the value of field 'authorizationCode'.
     * 
     * @param authorizationCode the value of field
     * 'authorizationCode'.
     */
    public void setAuthorizationCode(
            final java.lang.String authorizationCode) {
        this._authorizationCode = authorizationCode;
    }

    /**
     * Sets the value of field 'cardSecurityCodeMatch'.
     * 
     * @param cardSecurityCodeMatch the value of field
     * 'cardSecurityCodeMatch'.
     */
    public void setCardSecurityCodeMatch(
            final org.chocolate_milk.model.types.CardSecurityCodeMatchType cardSecurityCodeMatch) {
        this._cardSecurityCodeMatch = cardSecurityCodeMatch;
    }

    /**
     * Sets the value of field 'clientTransID'.
     * 
     * @param clientTransID the value of field 'clientTransID'.
     */
    public void setClientTransID(
            final java.lang.String clientTransID) {
        this._clientTransID = clientTransID;
    }

    /**
     * Sets the value of field 'creditCardTransID'.
     * 
     * @param creditCardTransID the value of field
     * 'creditCardTransID'.
     */
    public void setCreditCardTransID(
            final java.lang.String creditCardTransID) {
        this._creditCardTransID = creditCardTransID;
    }

    /**
     * Sets the value of field 'merchantAccountNumber'.
     * 
     * @param merchantAccountNumber the value of field
     * 'merchantAccountNumber'.
     */
    public void setMerchantAccountNumber(
            final java.lang.String merchantAccountNumber) {
        this._merchantAccountNumber = merchantAccountNumber;
    }

    /**
     * Sets the value of field 'paymentGroupingCode'.
     * 
     * @param paymentGroupingCode the value of field
     * 'paymentGroupingCode'.
     */
    public void setPaymentGroupingCode(
            final long paymentGroupingCode) {
        this._paymentGroupingCode = paymentGroupingCode;
        this._has_paymentGroupingCode = true;
    }

    /**
     * Sets the value of field 'paymentStatus'.
     * 
     * @param paymentStatus the value of field 'paymentStatus'.
     */
    public void setPaymentStatus(
            final org.chocolate_milk.model.types.PaymentStatusType paymentStatus) {
        this._paymentStatus = paymentStatus;
    }

    /**
     * Sets the value of field 'reconBatchID'.
     * 
     * @param reconBatchID the value of field 'reconBatchID'.
     */
    public void setReconBatchID(
            final java.lang.String reconBatchID) {
        this._reconBatchID = reconBatchID;
    }

    /**
     * Sets the value of field 'resultCode'.
     * 
     * @param resultCode the value of field 'resultCode'.
     */
    public void setResultCode(
            final long resultCode) {
        this._resultCode = resultCode;
        this._has_resultCode = true;
    }

    /**
     * Sets the value of field 'resultMessage'.
     * 
     * @param resultMessage the value of field 'resultMessage'.
     */
    public void setResultMessage(
            final java.lang.String resultMessage) {
        this._resultMessage = resultMessage;
    }

    /**
     * Sets the value of field 'txnAuthorizationStamp'.
     * 
     * @param txnAuthorizationStamp the value of field
     * 'txnAuthorizationStamp'.
     */
    public void setTxnAuthorizationStamp(
            final long txnAuthorizationStamp) {
        this._txnAuthorizationStamp = txnAuthorizationStamp;
        this._has_txnAuthorizationStamp = true;
    }

    /**
     * Sets the value of field 'txnAuthorizationTime'.
     * 
     * @param txnAuthorizationTime the value of field
     * 'txnAuthorizationTime'.
     */
    public void setTxnAuthorizationTime(
            final java.lang.String txnAuthorizationTime) {
        this._txnAuthorizationTime = txnAuthorizationTime;
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
     * org.chocolate_milk.model.CreditCardTxnResultInfoMod
     */
    public static org.chocolate_milk.model.CreditCardTxnResultInfoMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardTxnResultInfoMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardTxnResultInfoMod.class, reader);
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
