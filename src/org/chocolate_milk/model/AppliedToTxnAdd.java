/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AppliedToTxnAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AppliedToTxnAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class AppliedToTxnAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnID.
     */
    private org.chocolate_milk.model.AppliedToTxnAddTxnID _txnID;

    /**
     * Field _paymentAmount.
     */
    private java.lang.String _paymentAmount;

    /**
     * Field _txnLineDetailList.
     */
    private java.util.List<org.chocolate_milk.model.TxnLineDetail> _txnLineDetailList;

    /**
     * Field _setCreditList.
     */
    private java.util.List<org.chocolate_milk.model.SetCredit> _setCreditList;

    /**
     * Field _discountAmount.
     */
    private java.lang.String _discountAmount;

    /**
     * Field _discountAccountRef.
     */
    private org.chocolate_milk.model.DiscountAccountRef _discountAccountRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public AppliedToTxnAdd() {
        super();
        this._txnLineDetailList = new java.util.ArrayList<org.chocolate_milk.model.TxnLineDetail>();
        this._setCreditList = new java.util.ArrayList<org.chocolate_milk.model.SetCredit>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSetCredit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSetCredit(
            final org.chocolate_milk.model.SetCredit vSetCredit)
    throws java.lang.IndexOutOfBoundsException {
        this._setCreditList.add(vSetCredit);
    }

    /**
     * 
     * 
     * @param index
     * @param vSetCredit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSetCredit(
            final int index,
            final org.chocolate_milk.model.SetCredit vSetCredit)
    throws java.lang.IndexOutOfBoundsException {
        this._setCreditList.add(index, vSetCredit);
    }

    /**
     * 
     * 
     * @param vTxnLineDetail
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnLineDetail(
            final org.chocolate_milk.model.TxnLineDetail vTxnLineDetail)
    throws java.lang.IndexOutOfBoundsException {
        this._txnLineDetailList.add(vTxnLineDetail);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnLineDetail
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnLineDetail(
            final int index,
            final org.chocolate_milk.model.TxnLineDetail vTxnLineDetail)
    throws java.lang.IndexOutOfBoundsException {
        this._txnLineDetailList.add(index, vTxnLineDetail);
    }

    /**
     * Method enumerateSetCredit.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SetCredit> enumerateSetCredit(
    ) {
        return java.util.Collections.enumeration(this._setCreditList);
    }

    /**
     * Method enumerateTxnLineDetail.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.TxnLineDetail> enumerateTxnLineDetail(
    ) {
        return java.util.Collections.enumeration(this._txnLineDetailList);
    }

    /**
     * Returns the value of field 'discountAccountRef'.
     * 
     * @return the value of field 'DiscountAccountRef'.
     */
    public org.chocolate_milk.model.DiscountAccountRef getDiscountAccountRef(
    ) {
        return this._discountAccountRef;
    }

    /**
     * Returns the value of field 'discountAmount'.
     * 
     * @return the value of field 'DiscountAmount'.
     */
    public java.lang.String getDiscountAmount(
    ) {
        return this._discountAmount;
    }

    /**
     * Returns the value of field 'paymentAmount'.
     * 
     * @return the value of field 'PaymentAmount'.
     */
    public java.lang.String getPaymentAmount(
    ) {
        return this._paymentAmount;
    }

    /**
     * Method getSetCredit.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.SetCredit
     * at the given index
     */
    public org.chocolate_milk.model.SetCredit getSetCredit(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._setCreditList.size()) {
            throw new IndexOutOfBoundsException("getSetCredit: Index value '" + index + "' not in range [0.." + (this._setCreditList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SetCredit) _setCreditList.get(index);
    }

    /**
     * Method getSetCredit.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SetCredit[] getSetCredit(
    ) {
        org.chocolate_milk.model.SetCredit[] array = new org.chocolate_milk.model.SetCredit[0];
        return (org.chocolate_milk.model.SetCredit[]) this._setCreditList.toArray(array);
    }

    /**
     * Method getSetCreditCount.
     * 
     * @return the size of this collection
     */
    public int getSetCreditCount(
    ) {
        return this._setCreditList.size();
    }

    /**
     * Returns the value of field 'txnID'.
     * 
     * @return the value of field 'TxnID'.
     */
    public org.chocolate_milk.model.AppliedToTxnAddTxnID getTxnID(
    ) {
        return this._txnID;
    }

    /**
     * Method getTxnLineDetail.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.TxnLineDetail at the given index
     */
    public org.chocolate_milk.model.TxnLineDetail getTxnLineDetail(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnLineDetailList.size()) {
            throw new IndexOutOfBoundsException("getTxnLineDetail: Index value '" + index + "' not in range [0.." + (this._txnLineDetailList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.TxnLineDetail) _txnLineDetailList.get(index);
    }

    /**
     * Method getTxnLineDetail.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.TxnLineDetail[] getTxnLineDetail(
    ) {
        org.chocolate_milk.model.TxnLineDetail[] array = new org.chocolate_milk.model.TxnLineDetail[0];
        return (org.chocolate_milk.model.TxnLineDetail[]) this._txnLineDetailList.toArray(array);
    }

    /**
     * Method getTxnLineDetailCount.
     * 
     * @return the size of this collection
     */
    public int getTxnLineDetailCount(
    ) {
        return this._txnLineDetailList.size();
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
     * Method iterateSetCredit.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SetCredit> iterateSetCredit(
    ) {
        return this._setCreditList.iterator();
    }

    /**
     * Method iterateTxnLineDetail.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.TxnLineDetail> iterateTxnLineDetail(
    ) {
        return this._txnLineDetailList.iterator();
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
    public void removeAllSetCredit(
    ) {
        this._setCreditList.clear();
    }

    /**
     */
    public void removeAllTxnLineDetail(
    ) {
        this._txnLineDetailList.clear();
    }

    /**
     * Method removeSetCredit.
     * 
     * @param vSetCredit
     * @return true if the object was removed from the collection.
     */
    public boolean removeSetCredit(
            final org.chocolate_milk.model.SetCredit vSetCredit) {
        boolean removed = _setCreditList.remove(vSetCredit);
        return removed;
    }

    /**
     * Method removeSetCreditAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SetCredit removeSetCreditAt(
            final int index) {
        java.lang.Object obj = this._setCreditList.remove(index);
        return (org.chocolate_milk.model.SetCredit) obj;
    }

    /**
     * Method removeTxnLineDetail.
     * 
     * @param vTxnLineDetail
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnLineDetail(
            final org.chocolate_milk.model.TxnLineDetail vTxnLineDetail) {
        boolean removed = _txnLineDetailList.remove(vTxnLineDetail);
        return removed;
    }

    /**
     * Method removeTxnLineDetailAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.TxnLineDetail removeTxnLineDetailAt(
            final int index) {
        java.lang.Object obj = this._txnLineDetailList.remove(index);
        return (org.chocolate_milk.model.TxnLineDetail) obj;
    }

    /**
     * Sets the value of field 'discountAccountRef'.
     * 
     * @param discountAccountRef the value of field
     * 'discountAccountRef'.
     */
    public void setDiscountAccountRef(
            final org.chocolate_milk.model.DiscountAccountRef discountAccountRef) {
        this._discountAccountRef = discountAccountRef;
    }

    /**
     * Sets the value of field 'discountAmount'.
     * 
     * @param discountAmount the value of field 'discountAmount'.
     */
    public void setDiscountAmount(
            final java.lang.String discountAmount) {
        this._discountAmount = discountAmount;
    }

    /**
     * Sets the value of field 'paymentAmount'.
     * 
     * @param paymentAmount the value of field 'paymentAmount'.
     */
    public void setPaymentAmount(
            final java.lang.String paymentAmount) {
        this._paymentAmount = paymentAmount;
    }

    /**
     * 
     * 
     * @param index
     * @param vSetCredit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSetCredit(
            final int index,
            final org.chocolate_milk.model.SetCredit vSetCredit)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._setCreditList.size()) {
            throw new IndexOutOfBoundsException("setSetCredit: Index value '" + index + "' not in range [0.." + (this._setCreditList.size() - 1) + "]");
        }

        this._setCreditList.set(index, vSetCredit);
    }

    /**
     * 
     * 
     * @param vSetCreditArray
     */
    public void setSetCredit(
            final org.chocolate_milk.model.SetCredit[] vSetCreditArray) {
        //-- copy array
        _setCreditList.clear();

        for (int i = 0; i < vSetCreditArray.length; i++) {
                this._setCreditList.add(vSetCreditArray[i]);
        }
    }

    /**
     * Sets the value of field 'txnID'.
     * 
     * @param txnID the value of field 'txnID'.
     */
    public void setTxnID(
            final org.chocolate_milk.model.AppliedToTxnAddTxnID txnID) {
        this._txnID = txnID;
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnLineDetail
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnLineDetail(
            final int index,
            final org.chocolate_milk.model.TxnLineDetail vTxnLineDetail)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnLineDetailList.size()) {
            throw new IndexOutOfBoundsException("setTxnLineDetail: Index value '" + index + "' not in range [0.." + (this._txnLineDetailList.size() - 1) + "]");
        }

        this._txnLineDetailList.set(index, vTxnLineDetail);
    }

    /**
     * 
     * 
     * @param vTxnLineDetailArray
     */
    public void setTxnLineDetail(
            final org.chocolate_milk.model.TxnLineDetail[] vTxnLineDetailArray) {
        //-- copy array
        _txnLineDetailList.clear();

        for (int i = 0; i < vTxnLineDetailArray.length; i++) {
                this._txnLineDetailList.add(vTxnLineDetailArray[i]);
        }
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
     * org.chocolate_milk.model.AppliedToTxnAdd
     */
    public static org.chocolate_milk.model.AppliedToTxnAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.AppliedToTxnAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.AppliedToTxnAdd.class, reader);
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
