/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CheckAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CheckAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CheckAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _accountRef.
     */
    private org.chocolate_milk.model.AccountRef _accountRef;

    /**
     * Field _payeeEntityRef.
     */
    private org.chocolate_milk.model.PayeeEntityRef _payeeEntityRef;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _address.
     */
    private org.chocolate_milk.model.Address _address;

    /**
     * Field _isToBePrinted.
     */
    private java.lang.String _isToBePrinted;

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
     * Field _applyCheckToTxnAddList.
     */
    private java.util.List<org.chocolate_milk.model.ApplyCheckToTxnAdd> _applyCheckToTxnAddList;

    /**
     * Field _expenseLineAddList.
     */
    private java.util.List<org.chocolate_milk.model.ExpenseLineAdd> _expenseLineAddList;

    /**
     * Field _checkAddChoice.
     */
    private org.chocolate_milk.model.CheckAddChoice _checkAddChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckAdd() {
        super();
        this._applyCheckToTxnAddList = new java.util.ArrayList<org.chocolate_milk.model.ApplyCheckToTxnAdd>();
        this._expenseLineAddList = new java.util.ArrayList<org.chocolate_milk.model.ExpenseLineAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vApplyCheckToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addApplyCheckToTxnAdd(
            final org.chocolate_milk.model.ApplyCheckToTxnAdd vApplyCheckToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._applyCheckToTxnAddList.add(vApplyCheckToTxnAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vApplyCheckToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addApplyCheckToTxnAdd(
            final int index,
            final org.chocolate_milk.model.ApplyCheckToTxnAdd vApplyCheckToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._applyCheckToTxnAddList.add(index, vApplyCheckToTxnAdd);
    }

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
     * Method enumerateApplyCheckToTxnAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ApplyCheckToTxnAdd> enumerateApplyCheckToTxnAdd(
    ) {
        return java.util.Collections.enumeration(this._applyCheckToTxnAddList);
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
     * Returns the value of field 'accountRef'.
     * 
     * @return the value of field 'AccountRef'.
     */
    public org.chocolate_milk.model.AccountRef getAccountRef(
    ) {
        return this._accountRef;
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
     * Method getApplyCheckToTxnAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ApplyCheckToTxnAdd at the given inde
     */
    public org.chocolate_milk.model.ApplyCheckToTxnAdd getApplyCheckToTxnAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._applyCheckToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("getApplyCheckToTxnAdd: Index value '" + index + "' not in range [0.." + (this._applyCheckToTxnAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ApplyCheckToTxnAdd) _applyCheckToTxnAddList.get(index);
    }

    /**
     * Method getApplyCheckToTxnAdd.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ApplyCheckToTxnAdd[] getApplyCheckToTxnAdd(
    ) {
        org.chocolate_milk.model.ApplyCheckToTxnAdd[] array = new org.chocolate_milk.model.ApplyCheckToTxnAdd[0];
        return (org.chocolate_milk.model.ApplyCheckToTxnAdd[]) this._applyCheckToTxnAddList.toArray(array);
    }

    /**
     * Method getApplyCheckToTxnAddCount.
     * 
     * @return the size of this collection
     */
    public int getApplyCheckToTxnAddCount(
    ) {
        return this._applyCheckToTxnAddList.size();
    }

    /**
     * Returns the value of field 'checkAddChoice'.
     * 
     * @return the value of field 'CheckAddChoice'.
     */
    public org.chocolate_milk.model.CheckAddChoice getCheckAddChoice(
    ) {
        return this._checkAddChoice;
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
     * Returns the value of field 'isToBePrinted'.
     * 
     * @return the value of field 'IsToBePrinted'.
     */
    public java.lang.String getIsToBePrinted(
    ) {
        return this._isToBePrinted;
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
     * Returns the value of field 'salesTaxCodeRef'.
     * 
     * @return the value of field 'SalesTaxCodeRef'.
     */
    public org.chocolate_milk.model.SalesTaxCodeRef getSalesTaxCodeRef(
    ) {
        return this._salesTaxCodeRef;
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
     * Method iterateApplyCheckToTxnAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ApplyCheckToTxnAdd> iterateApplyCheckToTxnAdd(
    ) {
        return this._applyCheckToTxnAddList.iterator();
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
    public void removeAllApplyCheckToTxnAdd(
    ) {
        this._applyCheckToTxnAddList.clear();
    }

    /**
     */
    public void removeAllExpenseLineAdd(
    ) {
        this._expenseLineAddList.clear();
    }

    /**
     * Method removeApplyCheckToTxnAdd.
     * 
     * @param vApplyCheckToTxnAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeApplyCheckToTxnAdd(
            final org.chocolate_milk.model.ApplyCheckToTxnAdd vApplyCheckToTxnAdd) {
        boolean removed = _applyCheckToTxnAddList.remove(vApplyCheckToTxnAdd);
        return removed;
    }

    /**
     * Method removeApplyCheckToTxnAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ApplyCheckToTxnAdd removeApplyCheckToTxnAddAt(
            final int index) {
        java.lang.Object obj = this._applyCheckToTxnAddList.remove(index);
        return (org.chocolate_milk.model.ApplyCheckToTxnAdd) obj;
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
     * Sets the value of field 'accountRef'.
     * 
     * @param accountRef the value of field 'accountRef'.
     */
    public void setAccountRef(
            final org.chocolate_milk.model.AccountRef accountRef) {
        this._accountRef = accountRef;
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
     * 
     * 
     * @param index
     * @param vApplyCheckToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setApplyCheckToTxnAdd(
            final int index,
            final org.chocolate_milk.model.ApplyCheckToTxnAdd vApplyCheckToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._applyCheckToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("setApplyCheckToTxnAdd: Index value '" + index + "' not in range [0.." + (this._applyCheckToTxnAddList.size() - 1) + "]");
        }

        this._applyCheckToTxnAddList.set(index, vApplyCheckToTxnAdd);
    }

    /**
     * 
     * 
     * @param vApplyCheckToTxnAddArray
     */
    public void setApplyCheckToTxnAdd(
            final org.chocolate_milk.model.ApplyCheckToTxnAdd[] vApplyCheckToTxnAddArray) {
        //-- copy array
        _applyCheckToTxnAddList.clear();

        for (int i = 0; i < vApplyCheckToTxnAddArray.length; i++) {
                this._applyCheckToTxnAddList.add(vApplyCheckToTxnAddArray[i]);
        }
    }

    /**
     * Sets the value of field 'checkAddChoice'.
     * 
     * @param checkAddChoice the value of field 'checkAddChoice'.
     */
    public void setCheckAddChoice(
            final org.chocolate_milk.model.CheckAddChoice checkAddChoice) {
        this._checkAddChoice = checkAddChoice;
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
     * Sets the value of field 'isToBePrinted'.
     * 
     * @param isToBePrinted the value of field 'isToBePrinted'.
     */
    public void setIsToBePrinted(
            final java.lang.String isToBePrinted) {
        this._isToBePrinted = isToBePrinted;
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
     * Sets the value of field 'salesTaxCodeRef'.
     * 
     * @param salesTaxCodeRef the value of field 'salesTaxCodeRef'.
     */
    public void setSalesTaxCodeRef(
            final org.chocolate_milk.model.SalesTaxCodeRef salesTaxCodeRef) {
        this._salesTaxCodeRef = salesTaxCodeRef;
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
     * @return the unmarshaled org.chocolate_milk.model.CheckAdd
     */
    public static org.chocolate_milk.model.CheckAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CheckAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CheckAdd.class, reader);
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
