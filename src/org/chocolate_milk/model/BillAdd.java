/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class BillAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _vendorRef.
     */
    private org.chocolate_milk.model.VendorRef _vendorRef;

    /**
     * Field _APAccountRef.
     */
    private org.chocolate_milk.model.APAccountRef _APAccountRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _dueDate.
     */
    private java.lang.String _dueDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _termsRef.
     */
    private org.chocolate_milk.model.TermsRef _termsRef;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _isTaxIncluded.
     */
    private java.lang.String _isTaxIncluded;

    /**
     * Field _salesTaxCodeRef.
     */
    private org.chocolate_milk.model.SalesTaxCodeRef _salesTaxCodeRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _linkToTxnIDList.
     */
    private java.util.List<java.lang.String> _linkToTxnIDList;

    /**
     * Field _expenseLineAddList.
     */
    private java.util.List<org.chocolate_milk.model.ExpenseLineAdd> _expenseLineAddList;

    /**
     * Field _billAddChoice.
     */
    private org.chocolate_milk.model.BillAddChoice _billAddChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillAdd() {
        super();
        this._linkToTxnIDList = new java.util.ArrayList<java.lang.String>();
        this._expenseLineAddList = new java.util.ArrayList<org.chocolate_milk.model.ExpenseLineAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExpenseLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpenseLineAdd(
            final org.chocolate_milk.model.ExpenseLineAdd vExpenseLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._expenseLineAddList.add(vExpenseLineAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vExpenseLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpenseLineAdd(
            final int index,
            final org.chocolate_milk.model.ExpenseLineAdd vExpenseLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._expenseLineAddList.add(index, vExpenseLineAdd);
    }

    /**
     * 
     * 
     * @param vLinkToTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLinkToTxnID(
            final java.lang.String vLinkToTxnID)
    throws java.lang.IndexOutOfBoundsException {
        this._linkToTxnIDList.add(vLinkToTxnID);
    }

    /**
     * 
     * 
     * @param index
     * @param vLinkToTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLinkToTxnID(
            final int index,
            final java.lang.String vLinkToTxnID)
    throws java.lang.IndexOutOfBoundsException {
        this._linkToTxnIDList.add(index, vLinkToTxnID);
    }

    /**
     * Method enumerateExpenseLineAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ExpenseLineAdd> enumerateExpenseLineAdd(
    ) {
        return java.util.Collections.enumeration(this._expenseLineAddList);
    }

    /**
     * Method enumerateLinkToTxnID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateLinkToTxnID(
    ) {
        return java.util.Collections.enumeration(this._linkToTxnIDList);
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
     * Returns the value of field 'billAddChoice'.
     * 
     * @return the value of field 'BillAddChoice'.
     */
    public org.chocolate_milk.model.BillAddChoice getBillAddChoice(
    ) {
        return this._billAddChoice;
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
     * Returns the value of field 'dueDate'.
     * 
     * @return the value of field 'DueDate'.
     */
    public java.lang.String getDueDate(
    ) {
        return this._dueDate;
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
     * Method getExpenseLineAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ExpenseLineAdd at the given index
     */
    public org.chocolate_milk.model.ExpenseLineAdd getExpenseLineAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expenseLineAddList.size()) {
            throw new IndexOutOfBoundsException("getExpenseLineAdd: Index value '" + index + "' not in range [0.." + (this._expenseLineAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ExpenseLineAdd) _expenseLineAddList.get(index);
    }

    /**
     * Method getExpenseLineAdd.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ExpenseLineAdd[] getExpenseLineAdd(
    ) {
        org.chocolate_milk.model.ExpenseLineAdd[] array = new org.chocolate_milk.model.ExpenseLineAdd[0];
        return (org.chocolate_milk.model.ExpenseLineAdd[]) this._expenseLineAddList.toArray(array);
    }

    /**
     * Method getExpenseLineAddCount.
     * 
     * @return the size of this collection
     */
    public int getExpenseLineAddCount(
    ) {
        return this._expenseLineAddList.size();
    }

    /**
     * Returns the value of field 'isTaxIncluded'.
     * 
     * @return the value of field 'IsTaxIncluded'.
     */
    public java.lang.String getIsTaxIncluded(
    ) {
        return this._isTaxIncluded;
    }

    /**
     * Method getLinkToTxnID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getLinkToTxnID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._linkToTxnIDList.size()) {
            throw new IndexOutOfBoundsException("getLinkToTxnID: Index value '" + index + "' not in range [0.." + (this._linkToTxnIDList.size() - 1) + "]");
        }

        return (java.lang.String) _linkToTxnIDList.get(index);
    }

    /**
     * Method getLinkToTxnID.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getLinkToTxnID(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._linkToTxnIDList.toArray(array);
    }

    /**
     * Method getLinkToTxnIDCount.
     * 
     * @return the size of this collection
     */
    public int getLinkToTxnIDCount(
    ) {
        return this._linkToTxnIDList.size();
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
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Returns the value of field 'salesTaxCodeRef'.
     * 
     * @return the value of field 'SalesTaxCodeRef'.
     */
    public org.chocolate_milk.model.SalesTaxCodeRef getSalesTaxCodeRef(
    ) {
        return this._salesTaxCodeRef;
    }

    /**
     * Returns the value of field 'termsRef'.
     * 
     * @return the value of field 'TermsRef'.
     */
    public org.chocolate_milk.model.TermsRef getTermsRef(
    ) {
        return this._termsRef;
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
     * Returns the value of field 'vendorRef'.
     * 
     * @return the value of field 'VendorRef'.
     */
    public org.chocolate_milk.model.VendorRef getVendorRef(
    ) {
        return this._vendorRef;
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
     * Method iterateExpenseLineAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ExpenseLineAdd> iterateExpenseLineAdd(
    ) {
        return this._expenseLineAddList.iterator();
    }

    /**
     * Method iterateLinkToTxnID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateLinkToTxnID(
    ) {
        return this._linkToTxnIDList.iterator();
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
    public void removeAllExpenseLineAdd(
    ) {
        this._expenseLineAddList.clear();
    }

    /**
     */
    public void removeAllLinkToTxnID(
    ) {
        this._linkToTxnIDList.clear();
    }

    /**
     * Method removeExpenseLineAdd.
     * 
     * @param vExpenseLineAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeExpenseLineAdd(
            final org.chocolate_milk.model.ExpenseLineAdd vExpenseLineAdd) {
        boolean removed = _expenseLineAddList.remove(vExpenseLineAdd);
        return removed;
    }

    /**
     * Method removeExpenseLineAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ExpenseLineAdd removeExpenseLineAddAt(
            final int index) {
        java.lang.Object obj = this._expenseLineAddList.remove(index);
        return (org.chocolate_milk.model.ExpenseLineAdd) obj;
    }

    /**
     * Method removeLinkToTxnID.
     * 
     * @param vLinkToTxnID
     * @return true if the object was removed from the collection.
     */
    public boolean removeLinkToTxnID(
            final java.lang.String vLinkToTxnID) {
        boolean removed = _linkToTxnIDList.remove(vLinkToTxnID);
        return removed;
    }

    /**
     * Method removeLinkToTxnIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeLinkToTxnIDAt(
            final int index) {
        java.lang.Object obj = this._linkToTxnIDList.remove(index);
        return (java.lang.String) obj;
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
     * Sets the value of field 'billAddChoice'.
     * 
     * @param billAddChoice the value of field 'billAddChoice'.
     */
    public void setBillAddChoice(
            final org.chocolate_milk.model.BillAddChoice billAddChoice) {
        this._billAddChoice = billAddChoice;
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
     * Sets the value of field 'dueDate'.
     * 
     * @param dueDate the value of field 'dueDate'.
     */
    public void setDueDate(
            final java.lang.String dueDate) {
        this._dueDate = dueDate;
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
     * 
     * 
     * @param index
     * @param vExpenseLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExpenseLineAdd(
            final int index,
            final org.chocolate_milk.model.ExpenseLineAdd vExpenseLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expenseLineAddList.size()) {
            throw new IndexOutOfBoundsException("setExpenseLineAdd: Index value '" + index + "' not in range [0.." + (this._expenseLineAddList.size() - 1) + "]");
        }

        this._expenseLineAddList.set(index, vExpenseLineAdd);
    }

    /**
     * 
     * 
     * @param vExpenseLineAddArray
     */
    public void setExpenseLineAdd(
            final org.chocolate_milk.model.ExpenseLineAdd[] vExpenseLineAddArray) {
        //-- copy array
        _expenseLineAddList.clear();

        for (int i = 0; i < vExpenseLineAddArray.length; i++) {
                this._expenseLineAddList.add(vExpenseLineAddArray[i]);
        }
    }

    /**
     * Sets the value of field 'isTaxIncluded'.
     * 
     * @param isTaxIncluded the value of field 'isTaxIncluded'.
     */
    public void setIsTaxIncluded(
            final java.lang.String isTaxIncluded) {
        this._isTaxIncluded = isTaxIncluded;
    }

    /**
     * 
     * 
     * @param index
     * @param vLinkToTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLinkToTxnID(
            final int index,
            final java.lang.String vLinkToTxnID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._linkToTxnIDList.size()) {
            throw new IndexOutOfBoundsException("setLinkToTxnID: Index value '" + index + "' not in range [0.." + (this._linkToTxnIDList.size() - 1) + "]");
        }

        this._linkToTxnIDList.set(index, vLinkToTxnID);
    }

    /**
     * 
     * 
     * @param vLinkToTxnIDArray
     */
    public void setLinkToTxnID(
            final java.lang.String[] vLinkToTxnIDArray) {
        //-- copy array
        _linkToTxnIDList.clear();

        for (int i = 0; i < vLinkToTxnIDArray.length; i++) {
                this._linkToTxnIDList.add(vLinkToTxnIDArray[i]);
        }
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
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * Sets the value of field 'salesTaxCodeRef'.
     * 
     * @param salesTaxCodeRef the value of field 'salesTaxCodeRef'.
     */
    public void setSalesTaxCodeRef(
            final org.chocolate_milk.model.SalesTaxCodeRef salesTaxCodeRef) {
        this._salesTaxCodeRef = salesTaxCodeRef;
    }

    /**
     * Sets the value of field 'termsRef'.
     * 
     * @param termsRef the value of field 'termsRef'.
     */
    public void setTermsRef(
            final org.chocolate_milk.model.TermsRef termsRef) {
        this._termsRef = termsRef;
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
     * Sets the value of field 'vendorRef'.
     * 
     * @param vendorRef the value of field 'vendorRef'.
     */
    public void setVendorRef(
            final org.chocolate_milk.model.VendorRef vendorRef) {
        this._vendorRef = vendorRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.BillAdd
     */
    public static org.chocolate_milk.model.BillAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillAdd.class, reader);
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
