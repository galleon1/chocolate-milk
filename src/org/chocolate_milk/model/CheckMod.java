/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CheckMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CheckMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CheckMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCoreMod.
     */
    private org.chocolate_milk.model.TxnCoreMod _txnCoreMod;

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
     * Field _applyCheckToTxnModList.
     */
    private java.util.List<org.chocolate_milk.model.ApplyCheckToTxnMod> _applyCheckToTxnModList;

    /**
     * Field _clearExpenseLines.
     */
    private java.lang.String _clearExpenseLines;

    /**
     * Field _expenseLineModList.
     */
    private java.util.List<org.chocolate_milk.model.ExpenseLineMod> _expenseLineModList;

    /**
     * Field _clearItemLines.
     */
    private java.lang.String _clearItemLines;

    /**
     * Field _checkModChoice.
     */
    private org.chocolate_milk.model.CheckModChoice _checkModChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckMod() {
        super();
        this._applyCheckToTxnModList = new java.util.ArrayList<org.chocolate_milk.model.ApplyCheckToTxnMod>();
        this._expenseLineModList = new java.util.ArrayList<org.chocolate_milk.model.ExpenseLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vApplyCheckToTxnMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addApplyCheckToTxnMod(
            final org.chocolate_milk.model.ApplyCheckToTxnMod vApplyCheckToTxnMod)
    throws java.lang.IndexOutOfBoundsException {
        this._applyCheckToTxnModList.add(vApplyCheckToTxnMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vApplyCheckToTxnMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addApplyCheckToTxnMod(
            final int index,
            final org.chocolate_milk.model.ApplyCheckToTxnMod vApplyCheckToTxnMod)
    throws java.lang.IndexOutOfBoundsException {
        this._applyCheckToTxnModList.add(index, vApplyCheckToTxnMod);
    }

    /**
     * 
     * 
     * @param vExpenseLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpenseLineMod(
            final org.chocolate_milk.model.ExpenseLineMod vExpenseLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._expenseLineModList.add(vExpenseLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vExpenseLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpenseLineMod(
            final int index,
            final org.chocolate_milk.model.ExpenseLineMod vExpenseLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._expenseLineModList.add(index, vExpenseLineMod);
    }

    /**
     * Method enumerateApplyCheckToTxnMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ApplyCheckToTxnMod> enumerateApplyCheckToTxnMod(
    ) {
        return java.util.Collections.enumeration(this._applyCheckToTxnModList);
    }

    /**
     * Method enumerateExpenseLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ExpenseLineMod> enumerateExpenseLineMod(
    ) {
        return java.util.Collections.enumeration(this._expenseLineModList);
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
     * Method getApplyCheckToTxnMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ApplyCheckToTxnMod at the given inde
     */
    public org.chocolate_milk.model.ApplyCheckToTxnMod getApplyCheckToTxnMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._applyCheckToTxnModList.size()) {
            throw new IndexOutOfBoundsException("getApplyCheckToTxnMod: Index value '" + index + "' not in range [0.." + (this._applyCheckToTxnModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ApplyCheckToTxnMod) _applyCheckToTxnModList.get(index);
    }

    /**
     * Method getApplyCheckToTxnMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ApplyCheckToTxnMod[] getApplyCheckToTxnMod(
    ) {
        org.chocolate_milk.model.ApplyCheckToTxnMod[] array = new org.chocolate_milk.model.ApplyCheckToTxnMod[0];
        return (org.chocolate_milk.model.ApplyCheckToTxnMod[]) this._applyCheckToTxnModList.toArray(array);
    }

    /**
     * Method getApplyCheckToTxnModCount.
     * 
     * @return the size of this collection
     */
    public int getApplyCheckToTxnModCount(
    ) {
        return this._applyCheckToTxnModList.size();
    }

    /**
     * Returns the value of field 'checkModChoice'.
     * 
     * @return the value of field 'CheckModChoice'.
     */
    public org.chocolate_milk.model.CheckModChoice getCheckModChoice(
    ) {
        return this._checkModChoice;
    }

    /**
     * Returns the value of field 'clearExpenseLines'.
     * 
     * @return the value of field 'ClearExpenseLines'.
     */
    public java.lang.String getClearExpenseLines(
    ) {
        return this._clearExpenseLines;
    }

    /**
     * Returns the value of field 'clearItemLines'.
     * 
     * @return the value of field 'ClearItemLines'.
     */
    public java.lang.String getClearItemLines(
    ) {
        return this._clearItemLines;
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
     * Method getExpenseLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ExpenseLineMod at the given index
     */
    public org.chocolate_milk.model.ExpenseLineMod getExpenseLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expenseLineModList.size()) {
            throw new IndexOutOfBoundsException("getExpenseLineMod: Index value '" + index + "' not in range [0.." + (this._expenseLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ExpenseLineMod) _expenseLineModList.get(index);
    }

    /**
     * Method getExpenseLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ExpenseLineMod[] getExpenseLineMod(
    ) {
        org.chocolate_milk.model.ExpenseLineMod[] array = new org.chocolate_milk.model.ExpenseLineMod[0];
        return (org.chocolate_milk.model.ExpenseLineMod[]) this._expenseLineModList.toArray(array);
    }

    /**
     * Method getExpenseLineModCount.
     * 
     * @return the size of this collection
     */
    public int getExpenseLineModCount(
    ) {
        return this._expenseLineModList.size();
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
     * Method iterateApplyCheckToTxnMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ApplyCheckToTxnMod> iterateApplyCheckToTxnMod(
    ) {
        return this._applyCheckToTxnModList.iterator();
    }

    /**
     * Method iterateExpenseLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ExpenseLineMod> iterateExpenseLineMod(
    ) {
        return this._expenseLineModList.iterator();
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
    public void removeAllApplyCheckToTxnMod(
    ) {
        this._applyCheckToTxnModList.clear();
    }

    /**
     */
    public void removeAllExpenseLineMod(
    ) {
        this._expenseLineModList.clear();
    }

    /**
     * Method removeApplyCheckToTxnMod.
     * 
     * @param vApplyCheckToTxnMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeApplyCheckToTxnMod(
            final org.chocolate_milk.model.ApplyCheckToTxnMod vApplyCheckToTxnMod) {
        boolean removed = _applyCheckToTxnModList.remove(vApplyCheckToTxnMod);
        return removed;
    }

    /**
     * Method removeApplyCheckToTxnModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ApplyCheckToTxnMod removeApplyCheckToTxnModAt(
            final int index) {
        java.lang.Object obj = this._applyCheckToTxnModList.remove(index);
        return (org.chocolate_milk.model.ApplyCheckToTxnMod) obj;
    }

    /**
     * Method removeExpenseLineMod.
     * 
     * @param vExpenseLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeExpenseLineMod(
            final org.chocolate_milk.model.ExpenseLineMod vExpenseLineMod) {
        boolean removed = _expenseLineModList.remove(vExpenseLineMod);
        return removed;
    }

    /**
     * Method removeExpenseLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ExpenseLineMod removeExpenseLineModAt(
            final int index) {
        java.lang.Object obj = this._expenseLineModList.remove(index);
        return (org.chocolate_milk.model.ExpenseLineMod) obj;
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
     * @param vApplyCheckToTxnMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setApplyCheckToTxnMod(
            final int index,
            final org.chocolate_milk.model.ApplyCheckToTxnMod vApplyCheckToTxnMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._applyCheckToTxnModList.size()) {
            throw new IndexOutOfBoundsException("setApplyCheckToTxnMod: Index value '" + index + "' not in range [0.." + (this._applyCheckToTxnModList.size() - 1) + "]");
        }

        this._applyCheckToTxnModList.set(index, vApplyCheckToTxnMod);
    }

    /**
     * 
     * 
     * @param vApplyCheckToTxnModArray
     */
    public void setApplyCheckToTxnMod(
            final org.chocolate_milk.model.ApplyCheckToTxnMod[] vApplyCheckToTxnModArray) {
        //-- copy array
        _applyCheckToTxnModList.clear();

        for (int i = 0; i < vApplyCheckToTxnModArray.length; i++) {
                this._applyCheckToTxnModList.add(vApplyCheckToTxnModArray[i]);
        }
    }

    /**
     * Sets the value of field 'checkModChoice'.
     * 
     * @param checkModChoice the value of field 'checkModChoice'.
     */
    public void setCheckModChoice(
            final org.chocolate_milk.model.CheckModChoice checkModChoice) {
        this._checkModChoice = checkModChoice;
    }

    /**
     * Sets the value of field 'clearExpenseLines'.
     * 
     * @param clearExpenseLines the value of field
     * 'clearExpenseLines'.
     */
    public void setClearExpenseLines(
            final java.lang.String clearExpenseLines) {
        this._clearExpenseLines = clearExpenseLines;
    }

    /**
     * Sets the value of field 'clearItemLines'.
     * 
     * @param clearItemLines the value of field 'clearItemLines'.
     */
    public void setClearItemLines(
            final java.lang.String clearItemLines) {
        this._clearItemLines = clearItemLines;
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
     * @param vExpenseLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExpenseLineMod(
            final int index,
            final org.chocolate_milk.model.ExpenseLineMod vExpenseLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expenseLineModList.size()) {
            throw new IndexOutOfBoundsException("setExpenseLineMod: Index value '" + index + "' not in range [0.." + (this._expenseLineModList.size() - 1) + "]");
        }

        this._expenseLineModList.set(index, vExpenseLineMod);
    }

    /**
     * 
     * 
     * @param vExpenseLineModArray
     */
    public void setExpenseLineMod(
            final org.chocolate_milk.model.ExpenseLineMod[] vExpenseLineModArray) {
        //-- copy array
        _expenseLineModList.clear();

        for (int i = 0; i < vExpenseLineModArray.length; i++) {
                this._expenseLineModList.add(vExpenseLineModArray[i]);
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
     * @return the unmarshaled org.chocolate_milk.model.CheckMod
     */
    public static org.chocolate_milk.model.CheckMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CheckMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CheckMod.class, reader);
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
