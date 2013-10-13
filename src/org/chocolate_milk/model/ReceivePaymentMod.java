/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReceivePaymentMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReceivePaymentMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ReceivePaymentMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCoreMod.
     */
    private org.chocolate_milk.model.TxnCoreMod _txnCoreMod;

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
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

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
     * Field _creditCardTxnInfoMod.
     */
    private org.chocolate_milk.model.CreditCardTxnInfoMod _creditCardTxnInfoMod;

    /**
     * Field _appliedToTxnModList.
     */
    private java.util.List<org.chocolate_milk.model.AppliedToTxnMod> _appliedToTxnModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReceivePaymentMod() {
        super();
        this._appliedToTxnModList = new java.util.ArrayList<org.chocolate_milk.model.AppliedToTxnMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAppliedToTxnMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnMod(
            final org.chocolate_milk.model.AppliedToTxnMod vAppliedToTxnMod)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnModList.add(vAppliedToTxnMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnMod(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnMod vAppliedToTxnMod)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnModList.add(index, vAppliedToTxnMod);
    }

    /**
     * Method enumerateAppliedToTxnMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.AppliedToTxnMod> enumerateAppliedToTxnMod(
    ) {
        return java.util.Collections.enumeration(this._appliedToTxnModList);
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
     * Method getAppliedToTxnMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.AppliedToTxnMod at the given index
     */
    public org.chocolate_milk.model.AppliedToTxnMod getAppliedToTxnMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnModList.size()) {
            throw new IndexOutOfBoundsException("getAppliedToTxnMod: Index value '" + index + "' not in range [0.." + (this._appliedToTxnModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.AppliedToTxnMod) _appliedToTxnModList.get(index);
    }

    /**
     * Method getAppliedToTxnMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.AppliedToTxnMod[] getAppliedToTxnMod(
    ) {
        org.chocolate_milk.model.AppliedToTxnMod[] array = new org.chocolate_milk.model.AppliedToTxnMod[0];
        return (org.chocolate_milk.model.AppliedToTxnMod[]) this._appliedToTxnModList.toArray(array);
    }

    /**
     * Method getAppliedToTxnModCount.
     * 
     * @return the size of this collection
     */
    public int getAppliedToTxnModCount(
    ) {
        return this._appliedToTxnModList.size();
    }

    /**
     * Returns the value of field 'creditCardTxnInfoMod'.
     * 
     * @return the value of field 'CreditCardTxnInfoMod'.
     */
    public org.chocolate_milk.model.CreditCardTxnInfoMod getCreditCardTxnInfoMod(
    ) {
        return this._creditCardTxnInfoMod;
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
     * Returns the value of field 'depositToAccountRef'.
     * 
     * @return the value of field 'DepositToAccountRef'.
     */
    public org.chocolate_milk.model.DepositToAccountRef getDepositToAccountRef(
    ) {
        return this._depositToAccountRef;
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
     * Returns the value of field 'totalAmount'.
     * 
     * @return the value of field 'TotalAmount'.
     */
    public java.lang.String getTotalAmount(
    ) {
        return this._totalAmount;
    }

    /**
     * Returns the value of field 'txnCoreMod'.
     * 
     * @return the value of field 'TxnCoreMod'.
     */
    public org.chocolate_milk.model.TxnCoreMod getTxnCoreMod(
    ) {
        return this._txnCoreMod;
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
     * Method iterateAppliedToTxnMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.AppliedToTxnMod> iterateAppliedToTxnMod(
    ) {
        return this._appliedToTxnModList.iterator();
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
    public void removeAllAppliedToTxnMod(
    ) {
        this._appliedToTxnModList.clear();
    }

    /**
     * Method removeAppliedToTxnMod.
     * 
     * @param vAppliedToTxnMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeAppliedToTxnMod(
            final org.chocolate_milk.model.AppliedToTxnMod vAppliedToTxnMod) {
        boolean removed = _appliedToTxnModList.remove(vAppliedToTxnMod);
        return removed;
    }

    /**
     * Method removeAppliedToTxnModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.AppliedToTxnMod removeAppliedToTxnModAt(
            final int index) {
        java.lang.Object obj = this._appliedToTxnModList.remove(index);
        return (org.chocolate_milk.model.AppliedToTxnMod) obj;
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
     * @param vAppliedToTxnMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAppliedToTxnMod(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnMod vAppliedToTxnMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnModList.size()) {
            throw new IndexOutOfBoundsException("setAppliedToTxnMod: Index value '" + index + "' not in range [0.." + (this._appliedToTxnModList.size() - 1) + "]");
        }

        this._appliedToTxnModList.set(index, vAppliedToTxnMod);
    }

    /**
     * 
     * 
     * @param vAppliedToTxnModArray
     */
    public void setAppliedToTxnMod(
            final org.chocolate_milk.model.AppliedToTxnMod[] vAppliedToTxnModArray) {
        //-- copy array
        _appliedToTxnModList.clear();

        for (int i = 0; i < vAppliedToTxnModArray.length; i++) {
                this._appliedToTxnModList.add(vAppliedToTxnModArray[i]);
        }
    }

    /**
     * Sets the value of field 'creditCardTxnInfoMod'.
     * 
     * @param creditCardTxnInfoMod the value of field
     * 'creditCardTxnInfoMod'.
     */
    public void setCreditCardTxnInfoMod(
            final org.chocolate_milk.model.CreditCardTxnInfoMod creditCardTxnInfoMod) {
        this._creditCardTxnInfoMod = creditCardTxnInfoMod;
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
     * Sets the value of field 'totalAmount'.
     * 
     * @param totalAmount the value of field 'totalAmount'.
     */
    public void setTotalAmount(
            final java.lang.String totalAmount) {
        this._totalAmount = totalAmount;
    }

    /**
     * Sets the value of field 'txnCoreMod'.
     * 
     * @param txnCoreMod the value of field 'txnCoreMod'.
     */
    public void setTxnCoreMod(
            final org.chocolate_milk.model.TxnCoreMod txnCoreMod) {
        this._txnCoreMod = txnCoreMod;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.ReceivePaymentMod
     */
    public static org.chocolate_milk.model.ReceivePaymentMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReceivePaymentMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReceivePaymentMod.class, reader);
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
