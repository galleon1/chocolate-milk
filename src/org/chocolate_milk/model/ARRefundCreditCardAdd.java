/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ARRefundCreditCardAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ARRefundCreditCardAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ARRefundCreditCardAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

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
     * Field _address.
     */
    private org.chocolate_milk.model.Address _address;

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
     * Field _refundAppliedToTxnAddList.
     */
    private java.util.List<org.chocolate_milk.model.RefundAppliedToTxnAdd> _refundAppliedToTxnAddList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ARRefundCreditCardAdd() {
        super();
        this._refundAppliedToTxnAddList = new java.util.ArrayList<org.chocolate_milk.model.RefundAppliedToTxnAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRefundAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefundAppliedToTxnAdd(
            final org.chocolate_milk.model.RefundAppliedToTxnAdd vRefundAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._refundAppliedToTxnAddList.add(vRefundAppliedToTxnAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vRefundAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefundAppliedToTxnAdd(
            final int index,
            final org.chocolate_milk.model.RefundAppliedToTxnAdd vRefundAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._refundAppliedToTxnAddList.add(index, vRefundAppliedToTxnAdd);
    }

    /**
     * Method enumerateRefundAppliedToTxnAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.RefundAppliedToTxnAdd> enumerateRefundAppliedToTxnAdd(
    ) {
        return java.util.Collections.enumeration(this._refundAppliedToTxnAddList);
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
     * Returns the value of field 'defMacro'.
     * 
     * @return the value of field 'DefMacro'.
     */
    public java.lang.String getDefMacro(
    ) {
        return this._defMacro;
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
     * Method getRefundAppliedToTxnAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.RefundAppliedToTxnAdd at the given
     * index
     */
    public org.chocolate_milk.model.RefundAppliedToTxnAdd getRefundAppliedToTxnAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refundAppliedToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("getRefundAppliedToTxnAdd: Index value '" + index + "' not in range [0.." + (this._refundAppliedToTxnAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.RefundAppliedToTxnAdd) _refundAppliedToTxnAddList.get(index);
    }

    /**
     * Method getRefundAppliedToTxnAdd.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.RefundAppliedToTxnAdd[] getRefundAppliedToTxnAdd(
    ) {
        org.chocolate_milk.model.RefundAppliedToTxnAdd[] array = new org.chocolate_milk.model.RefundAppliedToTxnAdd[0];
        return (org.chocolate_milk.model.RefundAppliedToTxnAdd[]) this._refundAppliedToTxnAddList.toArray(array);
    }

    /**
     * Method getRefundAppliedToTxnAddCount.
     * 
     * @return the size of this collection
     */
    public int getRefundAppliedToTxnAddCount(
    ) {
        return this._refundAppliedToTxnAddList.size();
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
     * Method iterateRefundAppliedToTxnAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.RefundAppliedToTxnAdd> iterateRefundAppliedToTxnAdd(
    ) {
        return this._refundAppliedToTxnAddList.iterator();
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
    public void removeAllRefundAppliedToTxnAdd(
    ) {
        this._refundAppliedToTxnAddList.clear();
    }

    /**
     * Method removeRefundAppliedToTxnAdd.
     * 
     * @param vRefundAppliedToTxnAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeRefundAppliedToTxnAdd(
            final org.chocolate_milk.model.RefundAppliedToTxnAdd vRefundAppliedToTxnAdd) {
        boolean removed = _refundAppliedToTxnAddList.remove(vRefundAppliedToTxnAdd);
        return removed;
    }

    /**
     * Method removeRefundAppliedToTxnAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.RefundAppliedToTxnAdd removeRefundAppliedToTxnAddAt(
            final int index) {
        java.lang.Object obj = this._refundAppliedToTxnAddList.remove(index);
        return (org.chocolate_milk.model.RefundAppliedToTxnAdd) obj;
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
     * Sets the value of field 'defMacro'.
     * 
     * @param defMacro the value of field 'defMacro'.
     */
    public void setDefMacro(
            final java.lang.String defMacro) {
        this._defMacro = defMacro;
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
     * @param vRefundAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRefundAppliedToTxnAdd(
            final int index,
            final org.chocolate_milk.model.RefundAppliedToTxnAdd vRefundAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refundAppliedToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("setRefundAppliedToTxnAdd: Index value '" + index + "' not in range [0.." + (this._refundAppliedToTxnAddList.size() - 1) + "]");
        }

        this._refundAppliedToTxnAddList.set(index, vRefundAppliedToTxnAdd);
    }

    /**
     * 
     * 
     * @param vRefundAppliedToTxnAddArray
     */
    public void setRefundAppliedToTxnAdd(
            final org.chocolate_milk.model.RefundAppliedToTxnAdd[] vRefundAppliedToTxnAddArray) {
        //-- copy array
        _refundAppliedToTxnAddList.clear();

        for (int i = 0; i < vRefundAppliedToTxnAddArray.length; i++) {
                this._refundAppliedToTxnAddList.add(vRefundAppliedToTxnAddArray[i]);
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
     * org.chocolate_milk.model.ARRefundCreditCardAdd
     */
    public static org.chocolate_milk.model.ARRefundCreditCardAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ARRefundCreditCardAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ARRefundCreditCardAdd.class, reader);
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
