/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class BillMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCoreMod.
     */
    private org.chocolate_milk.model.TxnCoreMod _txnCoreMod;

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
     * Field _billModChoice.
     */
    private org.chocolate_milk.model.BillModChoice _billModChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillMod() {
        super();
        this._expenseLineModList = new java.util.ArrayList<org.chocolate_milk.model.ExpenseLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'APAccountRef'.
     * 
     * @return the value of field 'APAccountRef'.
     */
    public org.chocolate_milk.model.APAccountRef getAPAccountRef(
    ) {
        return this._APAccountRef;
    }

    /**
     * Returns the value of field 'billModChoice'.
     * 
     * @return the value of field 'BillModChoice'.
     */
    public org.chocolate_milk.model.BillModChoice getBillModChoice(
    ) {
        return this._billModChoice;
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
    public void removeAllExpenseLineMod(
    ) {
        this._expenseLineModList.clear();
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
     * Sets the value of field 'APAccountRef'.
     * 
     * @param APAccountRef the value of field 'APAccountRef'.
     */
    public void setAPAccountRef(
            final org.chocolate_milk.model.APAccountRef APAccountRef) {
        this._APAccountRef = APAccountRef;
    }

    /**
     * Sets the value of field 'billModChoice'.
     * 
     * @param billModChoice the value of field 'billModChoice'.
     */
    public void setBillModChoice(
            final org.chocolate_milk.model.BillModChoice billModChoice) {
        this._billModChoice = billModChoice;
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
     * @return the unmarshaled org.chocolate_milk.model.BillMod
     */
    public static org.chocolate_milk.model.BillMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillMod.class, reader);
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
