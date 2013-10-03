/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CheckRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CheckRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CheckRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCore.
     */
    private org.chocolate_milk.model.TxnCore _txnCore;

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
     * Field _amount.
     */
    private java.lang.String _amount;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _amountInHomeCurrency.
     */
    private java.lang.String _amountInHomeCurrency;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _address.
     */
    private org.chocolate_milk.model.Address _address;

    /**
     * Field _addressBlock.
     */
    private org.chocolate_milk.model.AddressBlock _addressBlock;

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
     * Field _linkedTxnList.
     */
    private java.util.List<org.chocolate_milk.model.LinkedTxn> _linkedTxnList;

    /**
     * Field _expenseLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.ExpenseLineRet> _expenseLineRetList;

    /**
     * Field _checkRetChoice.
     */
    private org.chocolate_milk.model.CheckRetChoice _checkRetChoice;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckRet() {
        super();
        this._linkedTxnList = new java.util.ArrayList<org.chocolate_milk.model.LinkedTxn>();
        this._expenseLineRetList = new java.util.ArrayList<org.chocolate_milk.model.ExpenseLineRet>();
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
     * @param vExpenseLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpenseLineRet(
            final org.chocolate_milk.model.ExpenseLineRet vExpenseLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._expenseLineRetList.add(vExpenseLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vExpenseLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpenseLineRet(
            final int index,
            final org.chocolate_milk.model.ExpenseLineRet vExpenseLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._expenseLineRetList.add(index, vExpenseLineRet);
    }

    /**
     * 
     * 
     * @param vLinkedTxn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLinkedTxn(
            final org.chocolate_milk.model.LinkedTxn vLinkedTxn)
    throws java.lang.IndexOutOfBoundsException {
        this._linkedTxnList.add(vLinkedTxn);
    }

    /**
     * 
     * 
     * @param index
     * @param vLinkedTxn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLinkedTxn(
            final int index,
            final org.chocolate_milk.model.LinkedTxn vLinkedTxn)
    throws java.lang.IndexOutOfBoundsException {
        this._linkedTxnList.add(index, vLinkedTxn);
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
     * Method enumerateExpenseLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ExpenseLineRet> enumerateExpenseLineRet(
    ) {
        return java.util.Collections.enumeration(this._expenseLineRetList);
    }

    /**
     * Method enumerateLinkedTxn.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.LinkedTxn> enumerateLinkedTxn(
    ) {
        return java.util.Collections.enumeration(this._linkedTxnList);
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
     * Returns the value of field 'addressBlock'.
     * 
     * @return the value of field 'AddressBlock'.
     */
    public org.chocolate_milk.model.AddressBlock getAddressBlock(
    ) {
        return this._addressBlock;
    }

    /**
     * Returns the value of field 'amount'.
     * 
     * @return the value of field 'Amount'.
     */
    public java.lang.String getAmount(
    ) {
        return this._amount;
    }

    /**
     * Returns the value of field 'amountInHomeCurrency'.
     * 
     * @return the value of field 'AmountInHomeCurrency'.
     */
    public java.lang.String getAmountInHomeCurrency(
    ) {
        return this._amountInHomeCurrency;
    }

    /**
     * Returns the value of field 'checkRetChoice'.
     * 
     * @return the value of field 'CheckRetChoice'.
     */
    public org.chocolate_milk.model.CheckRetChoice getCheckRetChoice(
    ) {
        return this._checkRetChoice;
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
     * Returns the value of field 'exchangeRate'.
     * 
     * @return the value of field 'ExchangeRate'.
     */
    public java.lang.String getExchangeRate(
    ) {
        return this._exchangeRate;
    }

    /**
     * Method getExpenseLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ExpenseLineRet at the given index
     */
    public org.chocolate_milk.model.ExpenseLineRet getExpenseLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expenseLineRetList.size()) {
            throw new IndexOutOfBoundsException("getExpenseLineRet: Index value '" + index + "' not in range [0.." + (this._expenseLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ExpenseLineRet) _expenseLineRetList.get(index);
    }

    /**
     * Method getExpenseLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ExpenseLineRet[] getExpenseLineRet(
    ) {
        org.chocolate_milk.model.ExpenseLineRet[] array = new org.chocolate_milk.model.ExpenseLineRet[0];
        return (org.chocolate_milk.model.ExpenseLineRet[]) this._expenseLineRetList.toArray(array);
    }

    /**
     * Method getExpenseLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getExpenseLineRetCount(
    ) {
        return this._expenseLineRetList.size();
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
     * Method getLinkedTxn.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.LinkedTxn
     * at the given index
     */
    public org.chocolate_milk.model.LinkedTxn getLinkedTxn(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._linkedTxnList.size()) {
            throw new IndexOutOfBoundsException("getLinkedTxn: Index value '" + index + "' not in range [0.." + (this._linkedTxnList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.LinkedTxn) _linkedTxnList.get(index);
    }

    /**
     * Method getLinkedTxn.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.LinkedTxn[] getLinkedTxn(
    ) {
        org.chocolate_milk.model.LinkedTxn[] array = new org.chocolate_milk.model.LinkedTxn[0];
        return (org.chocolate_milk.model.LinkedTxn[]) this._linkedTxnList.toArray(array);
    }

    /**
     * Method getLinkedTxnCount.
     * 
     * @return the size of this collection
     */
    public int getLinkedTxnCount(
    ) {
        return this._linkedTxnList.size();
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
     * Returns the value of field 'txnCore'.
     * 
     * @return the value of field 'TxnCore'.
     */
    public org.chocolate_milk.model.TxnCore getTxnCore(
    ) {
        return this._txnCore;
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
     * Method iterateExpenseLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ExpenseLineRet> iterateExpenseLineRet(
    ) {
        return this._expenseLineRetList.iterator();
    }

    /**
     * Method iterateLinkedTxn.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.LinkedTxn> iterateLinkedTxn(
    ) {
        return this._linkedTxnList.iterator();
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
    public void removeAllExpenseLineRet(
    ) {
        this._expenseLineRetList.clear();
    }

    /**
     */
    public void removeAllLinkedTxn(
    ) {
        this._linkedTxnList.clear();
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
     * Method removeExpenseLineRet.
     * 
     * @param vExpenseLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeExpenseLineRet(
            final org.chocolate_milk.model.ExpenseLineRet vExpenseLineRet) {
        boolean removed = _expenseLineRetList.remove(vExpenseLineRet);
        return removed;
    }

    /**
     * Method removeExpenseLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ExpenseLineRet removeExpenseLineRetAt(
            final int index) {
        java.lang.Object obj = this._expenseLineRetList.remove(index);
        return (org.chocolate_milk.model.ExpenseLineRet) obj;
    }

    /**
     * Method removeLinkedTxn.
     * 
     * @param vLinkedTxn
     * @return true if the object was removed from the collection.
     */
    public boolean removeLinkedTxn(
            final org.chocolate_milk.model.LinkedTxn vLinkedTxn) {
        boolean removed = _linkedTxnList.remove(vLinkedTxn);
        return removed;
    }

    /**
     * Method removeLinkedTxnAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.LinkedTxn removeLinkedTxnAt(
            final int index) {
        java.lang.Object obj = this._linkedTxnList.remove(index);
        return (org.chocolate_milk.model.LinkedTxn) obj;
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
     * Sets the value of field 'addressBlock'.
     * 
     * @param addressBlock the value of field 'addressBlock'.
     */
    public void setAddressBlock(
            final org.chocolate_milk.model.AddressBlock addressBlock) {
        this._addressBlock = addressBlock;
    }

    /**
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(
            final java.lang.String amount) {
        this._amount = amount;
    }

    /**
     * Sets the value of field 'amountInHomeCurrency'.
     * 
     * @param amountInHomeCurrency the value of field
     * 'amountInHomeCurrency'.
     */
    public void setAmountInHomeCurrency(
            final java.lang.String amountInHomeCurrency) {
        this._amountInHomeCurrency = amountInHomeCurrency;
    }

    /**
     * Sets the value of field 'checkRetChoice'.
     * 
     * @param checkRetChoice the value of field 'checkRetChoice'.
     */
    public void setCheckRetChoice(
            final org.chocolate_milk.model.CheckRetChoice checkRetChoice) {
        this._checkRetChoice = checkRetChoice;
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
     * @param vExpenseLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExpenseLineRet(
            final int index,
            final org.chocolate_milk.model.ExpenseLineRet vExpenseLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expenseLineRetList.size()) {
            throw new IndexOutOfBoundsException("setExpenseLineRet: Index value '" + index + "' not in range [0.." + (this._expenseLineRetList.size() - 1) + "]");
        }

        this._expenseLineRetList.set(index, vExpenseLineRet);
    }

    /**
     * 
     * 
     * @param vExpenseLineRetArray
     */
    public void setExpenseLineRet(
            final org.chocolate_milk.model.ExpenseLineRet[] vExpenseLineRetArray) {
        //-- copy array
        _expenseLineRetList.clear();

        for (int i = 0; i < vExpenseLineRetArray.length; i++) {
                this._expenseLineRetList.add(vExpenseLineRetArray[i]);
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
     * 
     * 
     * @param index
     * @param vLinkedTxn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLinkedTxn(
            final int index,
            final org.chocolate_milk.model.LinkedTxn vLinkedTxn)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._linkedTxnList.size()) {
            throw new IndexOutOfBoundsException("setLinkedTxn: Index value '" + index + "' not in range [0.." + (this._linkedTxnList.size() - 1) + "]");
        }

        this._linkedTxnList.set(index, vLinkedTxn);
    }

    /**
     * 
     * 
     * @param vLinkedTxnArray
     */
    public void setLinkedTxn(
            final org.chocolate_milk.model.LinkedTxn[] vLinkedTxnArray) {
        //-- copy array
        _linkedTxnList.clear();

        for (int i = 0; i < vLinkedTxnArray.length; i++) {
                this._linkedTxnList.add(vLinkedTxnArray[i]);
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
     * Sets the value of field 'txnCore'.
     * 
     * @param txnCore the value of field 'txnCore'.
     */
    public void setTxnCore(
            final org.chocolate_milk.model.TxnCore txnCore) {
        this._txnCore = txnCore;
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
     * @return the unmarshaled org.chocolate_milk.model.CheckRet
     */
    public static org.chocolate_milk.model.CheckRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CheckRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CheckRet.class, reader);
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
