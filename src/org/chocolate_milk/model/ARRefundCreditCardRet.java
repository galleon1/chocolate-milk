/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ARRefundCreditCardRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ARRefundCreditCardRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ARRefundCreditCardRet implements java.io.Serializable {


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
     * Field _refundFromAccountRef.
     */
    private org.chocolate_milk.model.RefundFromAccountRef _refundFromAccountRef;

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
     * Field _address.
     */
    private org.chocolate_milk.model.Address _address;

    /**
     * Field _addressBlock.
     */
    private org.chocolate_milk.model.AddressBlock _addressBlock;

    /**
     * Field _paymentMethodRef.
     */
    private org.chocolate_milk.model.PaymentMethodRef _paymentMethodRef;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _creditCardTxnInfo.
     */
    private org.chocolate_milk.model.CreditCardTxnInfo _creditCardTxnInfo;

    /**
     * Field _refundAppliedToTxnRetList.
     */
    private java.util.List<org.chocolate_milk.model.RefundAppliedToTxnRet> _refundAppliedToTxnRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ARRefundCreditCardRet() {
        super();
        this._refundAppliedToTxnRetList = new java.util.ArrayList<org.chocolate_milk.model.RefundAppliedToTxnRet>();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * 
     * 
     * @param vRefundAppliedToTxnRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefundAppliedToTxnRet(
            final org.chocolate_milk.model.RefundAppliedToTxnRet vRefundAppliedToTxnRet)
    throws java.lang.IndexOutOfBoundsException {
        this._refundAppliedToTxnRetList.add(vRefundAppliedToTxnRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRefundAppliedToTxnRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefundAppliedToTxnRet(
            final int index,
            final org.chocolate_milk.model.RefundAppliedToTxnRet vRefundAppliedToTxnRet)
    throws java.lang.IndexOutOfBoundsException {
        this._refundAppliedToTxnRetList.add(index, vRefundAppliedToTxnRet);
    }

    /**
     */
    public void deleteTxnNumber(
    ) {
        this._has_txnNumber= false;
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
     * Method enumerateRefundAppliedToTxnRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.RefundAppliedToTxnRet> enumerateRefundAppliedToTxnRet(
    ) {
        return java.util.Collections.enumeration(this._refundAppliedToTxnRetList);
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
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'Address'.
     */
    public org.chocolate_milk.model.Address getAddress(
    ) {
        return this._address;
    }

    /**
     * Returns the value of field 'addressBlock'.
     * 
     * @return the value of field 'AddressBlock'.
     */
    public org.chocolate_milk.model.AddressBlock getAddressBlock(
    ) {
        return this._addressBlock;
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
     * Returns the value of field 'editSequence'.
     * 
     * @return the value of field 'EditSequence'.
     */
    public java.lang.String getEditSequence(
    ) {
        return this._editSequence;
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
     * Method getRefundAppliedToTxnRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.RefundAppliedToTxnRet at the given
     * index
     */
    public org.chocolate_milk.model.RefundAppliedToTxnRet getRefundAppliedToTxnRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refundAppliedToTxnRetList.size()) {
            throw new IndexOutOfBoundsException("getRefundAppliedToTxnRet: Index value '" + index + "' not in range [0.." + (this._refundAppliedToTxnRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.RefundAppliedToTxnRet) _refundAppliedToTxnRetList.get(index);
    }

    /**
     * Method getRefundAppliedToTxnRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.RefundAppliedToTxnRet[] getRefundAppliedToTxnRet(
    ) {
        org.chocolate_milk.model.RefundAppliedToTxnRet[] array = new org.chocolate_milk.model.RefundAppliedToTxnRet[0];
        return (org.chocolate_milk.model.RefundAppliedToTxnRet[]) this._refundAppliedToTxnRetList.toArray(array);
    }

    /**
     * Method getRefundAppliedToTxnRetCount.
     * 
     * @return the size of this collection
     */
    public int getRefundAppliedToTxnRetCount(
    ) {
        return this._refundAppliedToTxnRetList.size();
    }

    /**
     * Returns the value of field 'refundFromAccountRef'.
     * 
     * @return the value of field 'RefundFromAccountRef'.
     */
    public org.chocolate_milk.model.RefundFromAccountRef getRefundFromAccountRef(
    ) {
        return this._refundFromAccountRef;
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
     * Method iterateRefundAppliedToTxnRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.RefundAppliedToTxnRet> iterateRefundAppliedToTxnRet(
    ) {
        return this._refundAppliedToTxnRetList.iterator();
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
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
    }

    /**
     */
    public void removeAllRefundAppliedToTxnRet(
    ) {
        this._refundAppliedToTxnRetList.clear();
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
     * Method removeRefundAppliedToTxnRet.
     * 
     * @param vRefundAppliedToTxnRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRefundAppliedToTxnRet(
            final org.chocolate_milk.model.RefundAppliedToTxnRet vRefundAppliedToTxnRet) {
        boolean removed = _refundAppliedToTxnRetList.remove(vRefundAppliedToTxnRet);
        return removed;
    }

    /**
     * Method removeRefundAppliedToTxnRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.RefundAppliedToTxnRet removeRefundAppliedToTxnRetAt(
            final int index) {
        java.lang.Object obj = this._refundAppliedToTxnRetList.remove(index);
        return (org.chocolate_milk.model.RefundAppliedToTxnRet) obj;
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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
     */
    public void setAddress(
            final org.chocolate_milk.model.Address address) {
        this._address = address;
    }

    /**
     * Sets the value of field 'addressBlock'.
     * 
     * @param addressBlock the value of field 'addressBlock'.
     */
    public void setAddressBlock(
            final org.chocolate_milk.model.AddressBlock addressBlock) {
        this._addressBlock = addressBlock;
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
     * Sets the value of field 'editSequence'.
     * 
     * @param editSequence the value of field 'editSequence'.
     */
    public void setEditSequence(
            final java.lang.String editSequence) {
        this._editSequence = editSequence;
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
     * 
     * 
     * @param index
     * @param vRefundAppliedToTxnRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRefundAppliedToTxnRet(
            final int index,
            final org.chocolate_milk.model.RefundAppliedToTxnRet vRefundAppliedToTxnRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refundAppliedToTxnRetList.size()) {
            throw new IndexOutOfBoundsException("setRefundAppliedToTxnRet: Index value '" + index + "' not in range [0.." + (this._refundAppliedToTxnRetList.size() - 1) + "]");
        }

        this._refundAppliedToTxnRetList.set(index, vRefundAppliedToTxnRet);
    }

    /**
     * 
     * 
     * @param vRefundAppliedToTxnRetArray
     */
    public void setRefundAppliedToTxnRet(
            final org.chocolate_milk.model.RefundAppliedToTxnRet[] vRefundAppliedToTxnRetArray) {
        //-- copy array
        _refundAppliedToTxnRetList.clear();

        for (int i = 0; i < vRefundAppliedToTxnRetArray.length; i++) {
                this._refundAppliedToTxnRetList.add(vRefundAppliedToTxnRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'refundFromAccountRef'.
     * 
     * @param refundFromAccountRef the value of field
     * 'refundFromAccountRef'.
     */
    public void setRefundFromAccountRef(
            final org.chocolate_milk.model.RefundFromAccountRef refundFromAccountRef) {
        this._refundFromAccountRef = refundFromAccountRef;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.ARRefundCreditCardRet
     */
    public static org.chocolate_milk.model.ARRefundCreditCardRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ARRefundCreditCardRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ARRefundCreditCardRet.class, reader);
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
