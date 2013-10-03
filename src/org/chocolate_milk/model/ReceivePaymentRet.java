/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReceivePaymentRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReceivePaymentRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ReceivePaymentRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnID.
     */
    private java.lang.String _txnID;

    /**
     * Field _timeCreated.
     */
    private java.lang.String _timeCreated;

    /**
     * Field _timeModified.
     */
    private java.lang.String _timeModified;

    /**
     * Field _editSequence.
     */
    private java.lang.String _editSequence;

    /**
     * Field _txnNumber.
     */
    private long _txnNumber;

    /**
     * keeps track of state for field: _txnNumber
     */
    private boolean _has_txnNumber;

    /**
     * Field _customerRef.
     */
    private org.chocolate_milk.model.CustomerRef _customerRef;

    /**
     * Field _ARAccountRef.
     */
    private org.chocolate_milk.model.ARAccountRef _ARAccountRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _totalAmount.
     */
    private java.lang.String _totalAmount;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _totalAmountInHomeCurrency.
     */
    private java.lang.String _totalAmountInHomeCurrency;

    /**
     * Field _paymentMethodRef.
     */
    private org.chocolate_milk.model.PaymentMethodRef _paymentMethodRef;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _depositToAccountRef.
     */
    private org.chocolate_milk.model.DepositToAccountRef _depositToAccountRef;

    /**
     * Field _creditCardTxnInfo.
     */
    private org.chocolate_milk.model.CreditCardTxnInfo _creditCardTxnInfo;

    /**
     * Field _unusedPayment.
     */
    private java.lang.String _unusedPayment;

    /**
     * Field _unusedCredits.
     */
    private java.lang.String _unusedCredits;

    /**
     * Field _appliedToTxnRetList.
     */
    private java.util.List<org.chocolate_milk.model.AppliedToTxnRet> _appliedToTxnRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReceivePaymentRet() {
        super();
        this._appliedToTxnRetList = new java.util.ArrayList<org.chocolate_milk.model.AppliedToTxnRet>();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAppliedToTxnRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnRet(
            final org.chocolate_milk.model.AppliedToTxnRet vAppliedToTxnRet)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnRetList.add(vAppliedToTxnRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnRet(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnRet vAppliedToTxnRet)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnRetList.add(index, vAppliedToTxnRet);
    }

    /**
     * 
     * 
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(vDataExtRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(index, vDataExtRet);
    }

    /**
     */
    public void deleteTxnNumber(
    ) {
        this._has_txnNumber= false;
    }

    /**
     * Method enumerateAppliedToTxnRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.AppliedToTxnRet> enumerateAppliedToTxnRet(
    ) {
        return java.util.Collections.enumeration(this._appliedToTxnRetList);
    }

    /**
     * Method enumerateDataExtRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DataExtRet> enumerateDataExtRet(
    ) {
        return java.util.Collections.enumeration(this._dataExtRetList);
    }

    /**
     * Returns the value of field 'ARAccountRef'.
     * 
     * @return the value of field 'ARAccountRef'.
     */
    public org.chocolate_milk.model.ARAccountRef getARAccountRef(
    ) {
        return this._ARAccountRef;
    }

    /**
     * Method getAppliedToTxnRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.AppliedToTxnRet at the given index
     */
    public org.chocolate_milk.model.AppliedToTxnRet getAppliedToTxnRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnRetList.size()) {
            throw new IndexOutOfBoundsException("getAppliedToTxnRet: Index value '" + index + "' not in range [0.." + (this._appliedToTxnRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.AppliedToTxnRet) _appliedToTxnRetList.get(index);
    }

    /**
     * Method getAppliedToTxnRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.AppliedToTxnRet[] getAppliedToTxnRet(
    ) {
        org.chocolate_milk.model.AppliedToTxnRet[] array = new org.chocolate_milk.model.AppliedToTxnRet[0];
        return (org.chocolate_milk.model.AppliedToTxnRet[]) this._appliedToTxnRetList.toArray(array);
    }

    /**
     * Method getAppliedToTxnRetCount.
     * 
     * @return the size of this collection
     */
    public int getAppliedToTxnRetCount(
    ) {
        return this._appliedToTxnRetList.size();
    }

    /**
     * Returns the value of field 'creditCardTxnInfo'.
     * 
     * @return the value of field 'CreditCardTxnInfo'.
     */
    public org.chocolate_milk.model.CreditCardTxnInfo getCreditCardTxnInfo(
    ) {
        return this._creditCardTxnInfo;
    }

    /**
     * Returns the value of field 'currencyRef'.
     * 
     * @return the value of field 'CurrencyRef'.
     */
    public org.chocolate_milk.model.CurrencyRef getCurrencyRef(
    ) {
        return this._currencyRef;
    }

    /**
     * Returns the value of field 'customerRef'.
     * 
     * @return the value of field 'CustomerRef'.
     */
    public org.chocolate_milk.model.CustomerRef getCustomerRef(
    ) {
        return this._customerRef;
    }

    /**
     * Method getDataExtRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.DataExtRet
     * at the given index
     */
    public org.chocolate_milk.model.DataExtRet getDataExtRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("getDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DataExtRet) _dataExtRetList.get(index);
    }

    /**
     * Method getDataExtRet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DataExtRet[] getDataExtRet(
    ) {
        org.chocolate_milk.model.DataExtRet[] array = new org.chocolate_milk.model.DataExtRet[0];
        return (org.chocolate_milk.model.DataExtRet[]) this._dataExtRetList.toArray(array);
    }

    /**
     * Method getDataExtRetCount.
     * 
     * @return the size of this collection
     */
    public int getDataExtRetCount(
    ) {
        return this._dataExtRetList.size();
    }

    /**
     * Returns the value of field 'depositToAccountRef'.
     * 
     * @return the value of field 'DepositToAccountRef'.
     */
    public org.chocolate_milk.model.DepositToAccountRef getDepositToAccountRef(
    ) {
        return this._depositToAccountRef;
    }

    /**
     * Returns the value of field 'editSequence'.
     * 
     * @return the value of field 'EditSequence'.
     */
    public java.lang.String getEditSequence(
    ) {
        return this._editSequence;
    }

    /**
     * Returns the value of field 'exchangeRate'.
     * 
     * @return the value of field 'ExchangeRate'.
     */
    public java.lang.String getExchangeRate(
    ) {
        return this._exchangeRate;
    }

    /**
     * Returns the value of field 'memo'.
     * 
     * @return the value of field 'Memo'.
     */
    public java.lang.String getMemo(
    ) {
        return this._memo;
    }

    /**
     * Returns the value of field 'paymentMethodRef'.
     * 
     * @return the value of field 'PaymentMethodRef'.
     */
    public org.chocolate_milk.model.PaymentMethodRef getPaymentMethodRef(
    ) {
        return this._paymentMethodRef;
    }

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
     * Returns the value of field 'timeModified'.
     * 
     * @return the value of field 'TimeModified'.
     */
    public java.lang.String getTimeModified(
    ) {
        return this._timeModified;
    }

    /**
     * Returns the value of field 'totalAmount'.
     * 
     * @return the value of field 'TotalAmount'.
     */
    public java.lang.String getTotalAmount(
    ) {
        return this._totalAmount;
    }

    /**
     * Returns the value of field 'totalAmountInHomeCurrency'.
     * 
     * @return the value of field 'TotalAmountInHomeCurrency'.
     */
    public java.lang.String getTotalAmountInHomeCurrency(
    ) {
        return this._totalAmountInHomeCurrency;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
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
     * Returns the value of field 'txnNumber'.
     * 
     * @return the value of field 'TxnNumber'.
     */
    public long getTxnNumber(
    ) {
        return this._txnNumber;
    }

    /**
     * Returns the value of field 'unusedCredits'.
     * 
     * @return the value of field 'UnusedCredits'.
     */
    public java.lang.String getUnusedCredits(
    ) {
        return this._unusedCredits;
    }

    /**
     * Returns the value of field 'unusedPayment'.
     * 
     * @return the value of field 'UnusedPayment'.
     */
    public java.lang.String getUnusedPayment(
    ) {
        return this._unusedPayment;
    }

    /**
     * Method hasTxnNumber.
     * 
     * @return true if at least one TxnNumber has been added
     */
    public boolean hasTxnNumber(
    ) {
        return this._has_txnNumber;
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
     * Method iterateAppliedToTxnRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.AppliedToTxnRet> iterateAppliedToTxnRet(
    ) {
        return this._appliedToTxnRetList.iterator();
    }

    /**
     * Method iterateDataExtRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DataExtRet> iterateDataExtRet(
    ) {
        return this._dataExtRetList.iterator();
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
     */
    public void removeAllAppliedToTxnRet(
    ) {
        this._appliedToTxnRetList.clear();
    }

    /**
     */
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
    }

    /**
     * Method removeAppliedToTxnRet.
     * 
     * @param vAppliedToTxnRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeAppliedToTxnRet(
            final org.chocolate_milk.model.AppliedToTxnRet vAppliedToTxnRet) {
        boolean removed = _appliedToTxnRetList.remove(vAppliedToTxnRet);
        return removed;
    }

    /**
     * Method removeAppliedToTxnRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.AppliedToTxnRet removeAppliedToTxnRetAt(
            final int index) {
        java.lang.Object obj = this._appliedToTxnRetList.remove(index);
        return (org.chocolate_milk.model.AppliedToTxnRet) obj;
    }

    /**
     * Method removeDataExtRet.
     * 
     * @param vDataExtRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet) {
        boolean removed = _dataExtRetList.remove(vDataExtRet);
        return removed;
    }

    /**
     * Method removeDataExtRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DataExtRet removeDataExtRetAt(
            final int index) {
        java.lang.Object obj = this._dataExtRetList.remove(index);
        return (org.chocolate_milk.model.DataExtRet) obj;
    }

    /**
     * Sets the value of field 'ARAccountRef'.
     * 
     * @param ARAccountRef the value of field 'ARAccountRef'.
     */
    public void setARAccountRef(
            final org.chocolate_milk.model.ARAccountRef ARAccountRef) {
        this._ARAccountRef = ARAccountRef;
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAppliedToTxnRet(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnRet vAppliedToTxnRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnRetList.size()) {
            throw new IndexOutOfBoundsException("setAppliedToTxnRet: Index value '" + index + "' not in range [0.." + (this._appliedToTxnRetList.size() - 1) + "]");
        }

        this._appliedToTxnRetList.set(index, vAppliedToTxnRet);
    }

    /**
     * 
     * 
     * @param vAppliedToTxnRetArray
     */
    public void setAppliedToTxnRet(
            final org.chocolate_milk.model.AppliedToTxnRet[] vAppliedToTxnRetArray) {
        //-- copy array
        _appliedToTxnRetList.clear();

        for (int i = 0; i < vAppliedToTxnRetArray.length; i++) {
                this._appliedToTxnRetList.add(vAppliedToTxnRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'creditCardTxnInfo'.
     * 
     * @param creditCardTxnInfo the value of field
     * 'creditCardTxnInfo'.
     */
    public void setCreditCardTxnInfo(
            final org.chocolate_milk.model.CreditCardTxnInfo creditCardTxnInfo) {
        this._creditCardTxnInfo = creditCardTxnInfo;
    }

    /**
     * Sets the value of field 'currencyRef'.
     * 
     * @param currencyRef the value of field 'currencyRef'.
     */
    public void setCurrencyRef(
            final org.chocolate_milk.model.CurrencyRef currencyRef) {
        this._currencyRef = currencyRef;
    }

    /**
     * Sets the value of field 'customerRef'.
     * 
     * @param customerRef the value of field 'customerRef'.
     */
    public void setCustomerRef(
            final org.chocolate_milk.model.CustomerRef customerRef) {
        this._customerRef = customerRef;
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("setDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        this._dataExtRetList.set(index, vDataExtRet);
    }

    /**
     * 
     * 
     * @param vDataExtRetArray
     */
    public void setDataExtRet(
            final org.chocolate_milk.model.DataExtRet[] vDataExtRetArray) {
        //-- copy array
        _dataExtRetList.clear();

        for (int i = 0; i < vDataExtRetArray.length; i++) {
                this._dataExtRetList.add(vDataExtRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'depositToAccountRef'.
     * 
     * @param depositToAccountRef the value of field
     * 'depositToAccountRef'.
     */
    public void setDepositToAccountRef(
            final org.chocolate_milk.model.DepositToAccountRef depositToAccountRef) {
        this._depositToAccountRef = depositToAccountRef;
    }

    /**
     * Sets the value of field 'editSequence'.
     * 
     * @param editSequence the value of field 'editSequence'.
     */
    public void setEditSequence(
            final java.lang.String editSequence) {
        this._editSequence = editSequence;
    }

    /**
     * Sets the value of field 'exchangeRate'.
     * 
     * @param exchangeRate the value of field 'exchangeRate'.
     */
    public void setExchangeRate(
            final java.lang.String exchangeRate) {
        this._exchangeRate = exchangeRate;
    }

    /**
     * Sets the value of field 'memo'.
     * 
     * @param memo the value of field 'memo'.
     */
    public void setMemo(
            final java.lang.String memo) {
        this._memo = memo;
    }

    /**
     * Sets the value of field 'paymentMethodRef'.
     * 
     * @param paymentMethodRef the value of field 'paymentMethodRef'
     */
    public void setPaymentMethodRef(
            final org.chocolate_milk.model.PaymentMethodRef paymentMethodRef) {
        this._paymentMethodRef = paymentMethodRef;
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
     * Sets the value of field 'timeModified'.
     * 
     * @param timeModified the value of field 'timeModified'.
     */
    public void setTimeModified(
            final java.lang.String timeModified) {
        this._timeModified = timeModified;
    }

    /**
     * Sets the value of field 'totalAmount'.
     * 
     * @param totalAmount the value of field 'totalAmount'.
     */
    public void setTotalAmount(
            final java.lang.String totalAmount) {
        this._totalAmount = totalAmount;
    }

    /**
     * Sets the value of field 'totalAmountInHomeCurrency'.
     * 
     * @param totalAmountInHomeCurrency the value of field
     * 'totalAmountInHomeCurrency'.
     */
    public void setTotalAmountInHomeCurrency(
            final java.lang.String totalAmountInHomeCurrency) {
        this._totalAmountInHomeCurrency = totalAmountInHomeCurrency;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
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
     * Sets the value of field 'txnNumber'.
     * 
     * @param txnNumber the value of field 'txnNumber'.
     */
    public void setTxnNumber(
            final long txnNumber) {
        this._txnNumber = txnNumber;
        this._has_txnNumber = true;
    }

    /**
     * Sets the value of field 'unusedCredits'.
     * 
     * @param unusedCredits the value of field 'unusedCredits'.
     */
    public void setUnusedCredits(
            final java.lang.String unusedCredits) {
        this._unusedCredits = unusedCredits;
    }

    /**
     * Sets the value of field 'unusedPayment'.
     * 
     * @param unusedPayment the value of field 'unusedPayment'.
     */
    public void setUnusedPayment(
            final java.lang.String unusedPayment) {
        this._unusedPayment = unusedPayment;
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
     * org.chocolate_milk.model.ReceivePaymentRet
     */
    public static org.chocolate_milk.model.ReceivePaymentRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReceivePaymentRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReceivePaymentRet.class, reader);
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
