/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillPaymentCreditCardAdd.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillPaymentCreditCardAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BillPaymentCreditCardAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _payeeEntityRef.
     */
    private org.chocolate_milk.model.PayeeEntityRef _payeeEntityRef;

    /**
     * Field _APAccountRef.
     */
    private org.chocolate_milk.model.APAccountRef _APAccountRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _creditCardAccountRef.
     */
    private org.chocolate_milk.model.CreditCardAccountRef _creditCardAccountRef;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _appliedToTxnAddList.
     */
    private java.util.List<org.chocolate_milk.model.AppliedToTxnAdd> _appliedToTxnAddList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillPaymentCreditCardAdd() {
        super();
        this._appliedToTxnAddList = new java.util.ArrayList<org.chocolate_milk.model.AppliedToTxnAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnAdd(
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnAddList.add(vAppliedToTxnAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnAdd(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnAddList.add(index, vAppliedToTxnAdd);
    }

    /**
     * Method enumerateAppliedToTxnAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.AppliedToTxnAdd> enumerateAppliedToTxnAdd(
    ) {
        return java.util.Collections.enumeration(this._appliedToTxnAddList);
    }

    /**
     * Returns the value of field 'APAccountRef'.
     * 
     * @return the value of field 'APAccountRef'.
     */
    public org.chocolate_milk.model.APAccountRef getAPAccountRef(
    ) {
        return this._APAccountRef;
    }

    /**
     * Method getAppliedToTxnAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.AppliedToTxnAdd at the given index
     */
    public org.chocolate_milk.model.AppliedToTxnAdd getAppliedToTxnAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("getAppliedToTxnAdd: Index value '" + index + "' not in range [0.." + (this._appliedToTxnAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.AppliedToTxnAdd) _appliedToTxnAddList.get(index);
    }

    /**
     * Method getAppliedToTxnAdd.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.AppliedToTxnAdd[] getAppliedToTxnAdd(
    ) {
        org.chocolate_milk.model.AppliedToTxnAdd[] array = new org.chocolate_milk.model.AppliedToTxnAdd[0];
        return (org.chocolate_milk.model.AppliedToTxnAdd[]) this._appliedToTxnAddList.toArray(array);
    }

    /**
     * Method getAppliedToTxnAddCount.
     * 
     * @return the size of this collection
     */
    public int getAppliedToTxnAddCount(
    ) {
        return this._appliedToTxnAddList.size();
    }

    /**
     * Returns the value of field 'creditCardAccountRef'.
     * 
     * @return the value of field 'CreditCardAccountRef'.
     */
    public org.chocolate_milk.model.CreditCardAccountRef getCreditCardAccountRef(
    ) {
        return this._creditCardAccountRef;
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
     * Returns the value of field 'payeeEntityRef'.
     * 
     * @return the value of field 'PayeeEntityRef'.
     */
    public org.chocolate_milk.model.PayeeEntityRef getPayeeEntityRef(
    ) {
        return this._payeeEntityRef;
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
     * Method iterateAppliedToTxnAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.AppliedToTxnAdd> iterateAppliedToTxnAdd(
    ) {
        return this._appliedToTxnAddList.iterator();
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
    public void removeAllAppliedToTxnAdd(
    ) {
        this._appliedToTxnAddList.clear();
    }

    /**
     * Method removeAppliedToTxnAdd.
     * 
     * @param vAppliedToTxnAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeAppliedToTxnAdd(
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd) {
        boolean removed = _appliedToTxnAddList.remove(vAppliedToTxnAdd);
        return removed;
    }

    /**
     * Method removeAppliedToTxnAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.AppliedToTxnAdd removeAppliedToTxnAddAt(
            final int index) {
        java.lang.Object obj = this._appliedToTxnAddList.remove(index);
        return (org.chocolate_milk.model.AppliedToTxnAdd) obj;
    }

    /**
     * Sets the value of field 'APAccountRef'.
     * 
     * @param APAccountRef the value of field 'APAccountRef'.
     */
    public void setAPAccountRef(
            final org.chocolate_milk.model.APAccountRef APAccountRef) {
        this._APAccountRef = APAccountRef;
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAppliedToTxnAdd(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("setAppliedToTxnAdd: Index value '" + index + "' not in range [0.." + (this._appliedToTxnAddList.size() - 1) + "]");
        }

        this._appliedToTxnAddList.set(index, vAppliedToTxnAdd);
    }

    /**
     * 
     * 
     * @param vAppliedToTxnAddArray
     */
    public void setAppliedToTxnAdd(
            final org.chocolate_milk.model.AppliedToTxnAdd[] vAppliedToTxnAddArray) {
        //-- copy array
        _appliedToTxnAddList.clear();

        for (int i = 0; i < vAppliedToTxnAddArray.length; i++) {
                this._appliedToTxnAddList.add(vAppliedToTxnAddArray[i]);
        }
    }

    /**
     * Sets the value of field 'creditCardAccountRef'.
     * 
     * @param creditCardAccountRef the value of field
     * 'creditCardAccountRef'.
     */
    public void setCreditCardAccountRef(
            final org.chocolate_milk.model.CreditCardAccountRef creditCardAccountRef) {
        this._creditCardAccountRef = creditCardAccountRef;
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
     * Sets the value of field 'payeeEntityRef'.
     * 
     * @param payeeEntityRef the value of field 'payeeEntityRef'.
     */
    public void setPayeeEntityRef(
            final org.chocolate_milk.model.PayeeEntityRef payeeEntityRef) {
        this._payeeEntityRef = payeeEntityRef;
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
     * org.chocolate_milk.model.BillPaymentCreditCardAdd
     */
    public static org.chocolate_milk.model.BillPaymentCreditCardAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillPaymentCreditCardAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillPaymentCreditCardAdd.class, reader);
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
