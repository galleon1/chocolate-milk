/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AccountRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AccountRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class AccountRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listCore.
     */
    private org.chocolate_milk.model.ListCore _listCore;

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _fullName.
     */
    private java.lang.String _fullName;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _parentRef.
     */
    private org.chocolate_milk.model.ParentRef _parentRef;

    /**
     * Field _sublevel.
     */
    private long _sublevel;

    /**
     * keeps track of state for field: _sublevel
     */
    private boolean _has_sublevel;

    /**
     * Field _accountType.
     */
    private org.chocolate_milk.model.types.AccountTypeType _accountType;

    /**
     * Field _detailAccountType.
     */
    private org.chocolate_milk.model.types.DetailAccountTypeType _detailAccountType;

    /**
     * Field _specialAccountType.
     */
    private org.chocolate_milk.model.types.SpecialAccountTypeType _specialAccountType;

    /**
     * Field _isTaxAccount.
     */
    private java.lang.String _isTaxAccount;

    /**
     * Field _accountNumber.
     */
    private java.lang.String _accountNumber;

    /**
     * Field _bankNumber.
     */
    private java.lang.String _bankNumber;

    /**
     * Field _lastCheckNumber.
     */
    private java.lang.String _lastCheckNumber;

    /**
     * Field _desc.
     */
    private java.lang.String _desc;

    /**
     * Field _balance.
     */
    private java.lang.String _balance;

    /**
     * Field _totalBalance.
     */
    private java.lang.String _totalBalance;

    /**
     * Field _salesTaxCodeRef.
     */
    private org.chocolate_milk.model.SalesTaxCodeRef _salesTaxCodeRef;

    /**
     * Field _taxLineInfoRet.
     */
    private org.chocolate_milk.model.TaxLineInfoRet _taxLineInfoRet;

    /**
     * Field _cashFlowClassification.
     */
    private org.chocolate_milk.model.types.CashFlowClassificationType _cashFlowClassification;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AccountRet() {
        super();
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
     */
    public void deleteSublevel(
    ) {
        this._has_sublevel= false;
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
     * Returns the value of field 'accountNumber'.
     * 
     * @return the value of field 'AccountNumber'.
     */
    public java.lang.String getAccountNumber(
    ) {
        return this._accountNumber;
    }

    /**
     * Returns the value of field 'accountType'.
     * 
     * @return the value of field 'AccountType'.
     */
    public org.chocolate_milk.model.types.AccountTypeType getAccountType(
    ) {
        return this._accountType;
    }

    /**
     * Returns the value of field 'balance'.
     * 
     * @return the value of field 'Balance'.
     */
    public java.lang.String getBalance(
    ) {
        return this._balance;
    }

    /**
     * Returns the value of field 'bankNumber'.
     * 
     * @return the value of field 'BankNumber'.
     */
    public java.lang.String getBankNumber(
    ) {
        return this._bankNumber;
    }

    /**
     * Returns the value of field 'cashFlowClassification'.
     * 
     * @return the value of field 'CashFlowClassification'.
     */
    public org.chocolate_milk.model.types.CashFlowClassificationType getCashFlowClassification(
    ) {
        return this._cashFlowClassification;
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
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'Desc'.
     */
    public java.lang.String getDesc(
    ) {
        return this._desc;
    }

    /**
     * Returns the value of field 'detailAccountType'.
     * 
     * @return the value of field 'DetailAccountType'.
     */
    public org.chocolate_milk.model.types.DetailAccountTypeType getDetailAccountType(
    ) {
        return this._detailAccountType;
    }

    /**
     * Returns the value of field 'fullName'.
     * 
     * @return the value of field 'FullName'.
     */
    public java.lang.String getFullName(
    ) {
        return this._fullName;
    }

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'isTaxAccount'.
     * 
     * @return the value of field 'IsTaxAccount'.
     */
    public java.lang.String getIsTaxAccount(
    ) {
        return this._isTaxAccount;
    }

    /**
     * Returns the value of field 'lastCheckNumber'.
     * 
     * @return the value of field 'LastCheckNumber'.
     */
    public java.lang.String getLastCheckNumber(
    ) {
        return this._lastCheckNumber;
    }

    /**
     * Returns the value of field 'listCore'.
     * 
     * @return the value of field 'ListCore'.
     */
    public org.chocolate_milk.model.ListCore getListCore(
    ) {
        return this._listCore;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'parentRef'.
     * 
     * @return the value of field 'ParentRef'.
     */
    public org.chocolate_milk.model.ParentRef getParentRef(
    ) {
        return this._parentRef;
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
     * Returns the value of field 'specialAccountType'.
     * 
     * @return the value of field 'SpecialAccountType'.
     */
    public org.chocolate_milk.model.types.SpecialAccountTypeType getSpecialAccountType(
    ) {
        return this._specialAccountType;
    }

    /**
     * Returns the value of field 'sublevel'.
     * 
     * @return the value of field 'Sublevel'.
     */
    public long getSublevel(
    ) {
        return this._sublevel;
    }

    /**
     * Returns the value of field 'taxLineInfoRet'.
     * 
     * @return the value of field 'TaxLineInfoRet'.
     */
    public org.chocolate_milk.model.TaxLineInfoRet getTaxLineInfoRet(
    ) {
        return this._taxLineInfoRet;
    }

    /**
     * Returns the value of field 'totalBalance'.
     * 
     * @return the value of field 'TotalBalance'.
     */
    public java.lang.String getTotalBalance(
    ) {
        return this._totalBalance;
    }

    /**
     * Method hasSublevel.
     * 
     * @return true if at least one Sublevel has been added
     */
    public boolean hasSublevel(
    ) {
        return this._has_sublevel;
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
     * Sets the value of field 'accountNumber'.
     * 
     * @param accountNumber the value of field 'accountNumber'.
     */
    public void setAccountNumber(
            final java.lang.String accountNumber) {
        this._accountNumber = accountNumber;
    }

    /**
     * Sets the value of field 'accountType'.
     * 
     * @param accountType the value of field 'accountType'.
     */
    public void setAccountType(
            final org.chocolate_milk.model.types.AccountTypeType accountType) {
        this._accountType = accountType;
    }

    /**
     * Sets the value of field 'balance'.
     * 
     * @param balance the value of field 'balance'.
     */
    public void setBalance(
            final java.lang.String balance) {
        this._balance = balance;
    }

    /**
     * Sets the value of field 'bankNumber'.
     * 
     * @param bankNumber the value of field 'bankNumber'.
     */
    public void setBankNumber(
            final java.lang.String bankNumber) {
        this._bankNumber = bankNumber;
    }

    /**
     * Sets the value of field 'cashFlowClassification'.
     * 
     * @param cashFlowClassification the value of field
     * 'cashFlowClassification'.
     */
    public void setCashFlowClassification(
            final org.chocolate_milk.model.types.CashFlowClassificationType cashFlowClassification) {
        this._cashFlowClassification = cashFlowClassification;
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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(
            final java.lang.String desc) {
        this._desc = desc;
    }

    /**
     * Sets the value of field 'detailAccountType'.
     * 
     * @param detailAccountType the value of field
     * 'detailAccountType'.
     */
    public void setDetailAccountType(
            final org.chocolate_milk.model.types.DetailAccountTypeType detailAccountType) {
        this._detailAccountType = detailAccountType;
    }

    /**
     * Sets the value of field 'fullName'.
     * 
     * @param fullName the value of field 'fullName'.
     */
    public void setFullName(
            final java.lang.String fullName) {
        this._fullName = fullName;
    }

    /**
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'isTaxAccount'.
     * 
     * @param isTaxAccount the value of field 'isTaxAccount'.
     */
    public void setIsTaxAccount(
            final java.lang.String isTaxAccount) {
        this._isTaxAccount = isTaxAccount;
    }

    /**
     * Sets the value of field 'lastCheckNumber'.
     * 
     * @param lastCheckNumber the value of field 'lastCheckNumber'.
     */
    public void setLastCheckNumber(
            final java.lang.String lastCheckNumber) {
        this._lastCheckNumber = lastCheckNumber;
    }

    /**
     * Sets the value of field 'listCore'.
     * 
     * @param listCore the value of field 'listCore'.
     */
    public void setListCore(
            final org.chocolate_milk.model.ListCore listCore) {
        this._listCore = listCore;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'parentRef'.
     * 
     * @param parentRef the value of field 'parentRef'.
     */
    public void setParentRef(
            final org.chocolate_milk.model.ParentRef parentRef) {
        this._parentRef = parentRef;
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
     * Sets the value of field 'specialAccountType'.
     * 
     * @param specialAccountType the value of field
     * 'specialAccountType'.
     */
    public void setSpecialAccountType(
            final org.chocolate_milk.model.types.SpecialAccountTypeType specialAccountType) {
        this._specialAccountType = specialAccountType;
    }

    /**
     * Sets the value of field 'sublevel'.
     * 
     * @param sublevel the value of field 'sublevel'.
     */
    public void setSublevel(
            final long sublevel) {
        this._sublevel = sublevel;
        this._has_sublevel = true;
    }

    /**
     * Sets the value of field 'taxLineInfoRet'.
     * 
     * @param taxLineInfoRet the value of field 'taxLineInfoRet'.
     */
    public void setTaxLineInfoRet(
            final org.chocolate_milk.model.TaxLineInfoRet taxLineInfoRet) {
        this._taxLineInfoRet = taxLineInfoRet;
    }

    /**
     * Sets the value of field 'totalBalance'.
     * 
     * @param totalBalance the value of field 'totalBalance'.
     */
    public void setTotalBalance(
            final java.lang.String totalBalance) {
        this._totalBalance = totalBalance;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.AccountRet
     */
    public static org.chocolate_milk.model.AccountRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.AccountRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.AccountRet.class, reader);
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
