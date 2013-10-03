/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VendorAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VendorAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class VendorAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _companyName.
     */
    private java.lang.String _companyName;

    /**
     * Field _personName.
     */
    private org.chocolate_milk.model.PersonName _personName;

    /**
     * Field _vendorAddress.
     */
    private org.chocolate_milk.model.VendorAddress _vendorAddress;

    /**
     * Field _commInfo.
     */
    private org.chocolate_milk.model.CommInfo _commInfo;

    /**
     * Field _nameOnCheck.
     */
    private java.lang.String _nameOnCheck;

    /**
     * Field _accountNumber.
     */
    private java.lang.String _accountNumber;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;

    /**
     * Field _vendorTypeRef.
     */
    private org.chocolate_milk.model.VendorTypeRef _vendorTypeRef;

    /**
     * Field _termsRef.
     */
    private org.chocolate_milk.model.TermsRef _termsRef;

    /**
     * Field _creditLimit.
     */
    private java.lang.String _creditLimit;

    /**
     * Field _vendorTaxIdent.
     */
    private java.lang.String _vendorTaxIdent;

    /**
     * Field _isVendorEligibleFor1099.
     */
    private java.lang.String _isVendorEligibleFor1099;

    /**
     * Field _openBalance.
     */
    private java.lang.String _openBalance;

    /**
     * Field _openBalanceDate.
     */
    private java.lang.String _openBalanceDate;

    /**
     * Field _billingRateRef.
     */
    private org.chocolate_milk.model.BillingRateRef _billingRateRef;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;

    /**
     * Field _salesTaxCodeRef.
     */
    private org.chocolate_milk.model.SalesTaxCodeRef _salesTaxCodeRef;

    /**
     * Field _salesTaxCountry.
     */
    private org.chocolate_milk.model.types.SalesTaxCountryType _salesTaxCountry = org.chocolate_milk.model.types.SalesTaxCountryType.fromValue("Canada");

    /**
     * Field _isSalesTaxAgency.
     */
    private java.lang.String _isSalesTaxAgency;

    /**
     * Field _salesTaxReturnRef.
     */
    private org.chocolate_milk.model.SalesTaxReturnRef _salesTaxReturnRef;

    /**
     * Field _taxRegistrationNumber.
     */
    private java.lang.String _taxRegistrationNumber;

    /**
     * Field _reportingPeriod.
     */
    private org.chocolate_milk.model.types.ReportingPeriodType _reportingPeriod = org.chocolate_milk.model.types.ReportingPeriodType.fromValue("Quarterly");

    /**
     * Field _isTaxTrackedOnPurchases.
     */
    private java.lang.String _isTaxTrackedOnPurchases;

    /**
     * Field _taxOnPurchasesAccountRef.
     */
    private org.chocolate_milk.model.TaxOnPurchasesAccountRef _taxOnPurchasesAccountRef;

    /**
     * Field _isTaxTrackedOnSales.
     */
    private java.lang.String _isTaxTrackedOnSales;

    /**
     * Field _taxOnSalesAccountRef.
     */
    private org.chocolate_milk.model.TaxOnSalesAccountRef _taxOnSalesAccountRef;

    /**
     * Field _isTaxOnTax.
     */
    private java.lang.String _isTaxOnTax;

    /**
     * Field _prefillAccountRefList.
     */
    private java.util.List<org.chocolate_milk.model.PrefillAccountRef> _prefillAccountRefList;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public VendorAdd() {
        super();
        setSalesTaxCountry(org.chocolate_milk.model.types.SalesTaxCountryType.fromValue("Canada"));
        setReportingPeriod(org.chocolate_milk.model.types.ReportingPeriodType.fromValue("Quarterly"));
        this._prefillAccountRefList = new java.util.ArrayList<org.chocolate_milk.model.PrefillAccountRef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPrefillAccountRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPrefillAccountRef(
            final org.chocolate_milk.model.PrefillAccountRef vPrefillAccountRef)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._prefillAccountRefList.size() >= 3) {
            throw new IndexOutOfBoundsException("addPrefillAccountRef has a maximum of 3");
        }

        this._prefillAccountRefList.add(vPrefillAccountRef);
    }

    /**
     * 
     * 
     * @param index
     * @param vPrefillAccountRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPrefillAccountRef(
            final int index,
            final org.chocolate_milk.model.PrefillAccountRef vPrefillAccountRef)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._prefillAccountRefList.size() >= 3) {
            throw new IndexOutOfBoundsException("addPrefillAccountRef has a maximum of 3");
        }

        this._prefillAccountRefList.add(index, vPrefillAccountRef);
    }

    /**
     * Method enumeratePrefillAccountRef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.PrefillAccountRef> enumeratePrefillAccountRef(
    ) {
        return java.util.Collections.enumeration(this._prefillAccountRefList);
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
     * Returns the value of field 'billingRateRef'.
     * 
     * @return the value of field 'BillingRateRef'.
     */
    public org.chocolate_milk.model.BillingRateRef getBillingRateRef(
    ) {
        return this._billingRateRef;
    }

    /**
     * Returns the value of field 'commInfo'.
     * 
     * @return the value of field 'CommInfo'.
     */
    public org.chocolate_milk.model.CommInfo getCommInfo(
    ) {
        return this._commInfo;
    }

    /**
     * Returns the value of field 'companyName'.
     * 
     * @return the value of field 'CompanyName'.
     */
    public java.lang.String getCompanyName(
    ) {
        return this._companyName;
    }

    /**
     * Returns the value of field 'creditLimit'.
     * 
     * @return the value of field 'CreditLimit'.
     */
    public java.lang.String getCreditLimit(
    ) {
        return this._creditLimit;
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
     * Returns the value of field 'externalGUID'.
     * 
     * @return the value of field 'ExternalGUID'.
     */
    public java.lang.String getExternalGUID(
    ) {
        return this._externalGUID;
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
     * Returns the value of field 'isSalesTaxAgency'.
     * 
     * @return the value of field 'IsSalesTaxAgency'.
     */
    public java.lang.String getIsSalesTaxAgency(
    ) {
        return this._isSalesTaxAgency;
    }

    /**
     * Returns the value of field 'isTaxOnTax'.
     * 
     * @return the value of field 'IsTaxOnTax'.
     */
    public java.lang.String getIsTaxOnTax(
    ) {
        return this._isTaxOnTax;
    }

    /**
     * Returns the value of field 'isTaxTrackedOnPurchases'.
     * 
     * @return the value of field 'IsTaxTrackedOnPurchases'.
     */
    public java.lang.String getIsTaxTrackedOnPurchases(
    ) {
        return this._isTaxTrackedOnPurchases;
    }

    /**
     * Returns the value of field 'isTaxTrackedOnSales'.
     * 
     * @return the value of field 'IsTaxTrackedOnSales'.
     */
    public java.lang.String getIsTaxTrackedOnSales(
    ) {
        return this._isTaxTrackedOnSales;
    }

    /**
     * Returns the value of field 'isVendorEligibleFor1099'.
     * 
     * @return the value of field 'IsVendorEligibleFor1099'.
     */
    public java.lang.String getIsVendorEligibleFor1099(
    ) {
        return this._isVendorEligibleFor1099;
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
     * Returns the value of field 'nameOnCheck'.
     * 
     * @return the value of field 'NameOnCheck'.
     */
    public java.lang.String getNameOnCheck(
    ) {
        return this._nameOnCheck;
    }

    /**
     * Returns the value of field 'notes'.
     * 
     * @return the value of field 'Notes'.
     */
    public java.lang.String getNotes(
    ) {
        return this._notes;
    }

    /**
     * Returns the value of field 'openBalance'.
     * 
     * @return the value of field 'OpenBalance'.
     */
    public java.lang.String getOpenBalance(
    ) {
        return this._openBalance;
    }

    /**
     * Returns the value of field 'openBalanceDate'.
     * 
     * @return the value of field 'OpenBalanceDate'.
     */
    public java.lang.String getOpenBalanceDate(
    ) {
        return this._openBalanceDate;
    }

    /**
     * Returns the value of field 'personName'.
     * 
     * @return the value of field 'PersonName'.
     */
    public org.chocolate_milk.model.PersonName getPersonName(
    ) {
        return this._personName;
    }

    /**
     * Method getPrefillAccountRef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.PrefillAccountRef at the given index
     */
    public org.chocolate_milk.model.PrefillAccountRef getPrefillAccountRef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._prefillAccountRefList.size()) {
            throw new IndexOutOfBoundsException("getPrefillAccountRef: Index value '" + index + "' not in range [0.." + (this._prefillAccountRefList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.PrefillAccountRef) _prefillAccountRefList.get(index);
    }

    /**
     * Method getPrefillAccountRef.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.PrefillAccountRef[] getPrefillAccountRef(
    ) {
        org.chocolate_milk.model.PrefillAccountRef[] array = new org.chocolate_milk.model.PrefillAccountRef[0];
        return (org.chocolate_milk.model.PrefillAccountRef[]) this._prefillAccountRefList.toArray(array);
    }

    /**
     * Method getPrefillAccountRefCount.
     * 
     * @return the size of this collection
     */
    public int getPrefillAccountRefCount(
    ) {
        return this._prefillAccountRefList.size();
    }

    /**
     * Returns the value of field 'reportingPeriod'.
     * 
     * @return the value of field 'ReportingPeriod'.
     */
    public org.chocolate_milk.model.types.ReportingPeriodType getReportingPeriod(
    ) {
        return this._reportingPeriod;
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
     * Returns the value of field 'salesTaxCountry'.
     * 
     * @return the value of field 'SalesTaxCountry'.
     */
    public org.chocolate_milk.model.types.SalesTaxCountryType getSalesTaxCountry(
    ) {
        return this._salesTaxCountry;
    }

    /**
     * Returns the value of field 'salesTaxReturnRef'.
     * 
     * @return the value of field 'SalesTaxReturnRef'.
     */
    public org.chocolate_milk.model.SalesTaxReturnRef getSalesTaxReturnRef(
    ) {
        return this._salesTaxReturnRef;
    }

    /**
     * Returns the value of field 'taxOnPurchasesAccountRef'.
     * 
     * @return the value of field 'TaxOnPurchasesAccountRef'.
     */
    public org.chocolate_milk.model.TaxOnPurchasesAccountRef getTaxOnPurchasesAccountRef(
    ) {
        return this._taxOnPurchasesAccountRef;
    }

    /**
     * Returns the value of field 'taxOnSalesAccountRef'.
     * 
     * @return the value of field 'TaxOnSalesAccountRef'.
     */
    public org.chocolate_milk.model.TaxOnSalesAccountRef getTaxOnSalesAccountRef(
    ) {
        return this._taxOnSalesAccountRef;
    }

    /**
     * Returns the value of field 'taxRegistrationNumber'.
     * 
     * @return the value of field 'TaxRegistrationNumber'.
     */
    public java.lang.String getTaxRegistrationNumber(
    ) {
        return this._taxRegistrationNumber;
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
     * Returns the value of field 'vendorAddress'.
     * 
     * @return the value of field 'VendorAddress'.
     */
    public org.chocolate_milk.model.VendorAddress getVendorAddress(
    ) {
        return this._vendorAddress;
    }

    /**
     * Returns the value of field 'vendorTaxIdent'.
     * 
     * @return the value of field 'VendorTaxIdent'.
     */
    public java.lang.String getVendorTaxIdent(
    ) {
        return this._vendorTaxIdent;
    }

    /**
     * Returns the value of field 'vendorTypeRef'.
     * 
     * @return the value of field 'VendorTypeRef'.
     */
    public org.chocolate_milk.model.VendorTypeRef getVendorTypeRef(
    ) {
        return this._vendorTypeRef;
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
     * Method iteratePrefillAccountRef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.PrefillAccountRef> iteratePrefillAccountRef(
    ) {
        return this._prefillAccountRefList.iterator();
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
    public void removeAllPrefillAccountRef(
    ) {
        this._prefillAccountRefList.clear();
    }

    /**
     * Method removePrefillAccountRef.
     * 
     * @param vPrefillAccountRef
     * @return true if the object was removed from the collection.
     */
    public boolean removePrefillAccountRef(
            final org.chocolate_milk.model.PrefillAccountRef vPrefillAccountRef) {
        boolean removed = _prefillAccountRefList.remove(vPrefillAccountRef);
        return removed;
    }

    /**
     * Method removePrefillAccountRefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.PrefillAccountRef removePrefillAccountRefAt(
            final int index) {
        java.lang.Object obj = this._prefillAccountRefList.remove(index);
        return (org.chocolate_milk.model.PrefillAccountRef) obj;
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
     * Sets the value of field 'billingRateRef'.
     * 
     * @param billingRateRef the value of field 'billingRateRef'.
     */
    public void setBillingRateRef(
            final org.chocolate_milk.model.BillingRateRef billingRateRef) {
        this._billingRateRef = billingRateRef;
    }

    /**
     * Sets the value of field 'commInfo'.
     * 
     * @param commInfo the value of field 'commInfo'.
     */
    public void setCommInfo(
            final org.chocolate_milk.model.CommInfo commInfo) {
        this._commInfo = commInfo;
    }

    /**
     * Sets the value of field 'companyName'.
     * 
     * @param companyName the value of field 'companyName'.
     */
    public void setCompanyName(
            final java.lang.String companyName) {
        this._companyName = companyName;
    }

    /**
     * Sets the value of field 'creditLimit'.
     * 
     * @param creditLimit the value of field 'creditLimit'.
     */
    public void setCreditLimit(
            final java.lang.String creditLimit) {
        this._creditLimit = creditLimit;
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
     * Sets the value of field 'externalGUID'.
     * 
     * @param externalGUID the value of field 'externalGUID'.
     */
    public void setExternalGUID(
            final java.lang.String externalGUID) {
        this._externalGUID = externalGUID;
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
     * Sets the value of field 'isSalesTaxAgency'.
     * 
     * @param isSalesTaxAgency the value of field 'isSalesTaxAgency'
     */
    public void setIsSalesTaxAgency(
            final java.lang.String isSalesTaxAgency) {
        this._isSalesTaxAgency = isSalesTaxAgency;
    }

    /**
     * Sets the value of field 'isTaxOnTax'.
     * 
     * @param isTaxOnTax the value of field 'isTaxOnTax'.
     */
    public void setIsTaxOnTax(
            final java.lang.String isTaxOnTax) {
        this._isTaxOnTax = isTaxOnTax;
    }

    /**
     * Sets the value of field 'isTaxTrackedOnPurchases'.
     * 
     * @param isTaxTrackedOnPurchases the value of field
     * 'isTaxTrackedOnPurchases'.
     */
    public void setIsTaxTrackedOnPurchases(
            final java.lang.String isTaxTrackedOnPurchases) {
        this._isTaxTrackedOnPurchases = isTaxTrackedOnPurchases;
    }

    /**
     * Sets the value of field 'isTaxTrackedOnSales'.
     * 
     * @param isTaxTrackedOnSales the value of field
     * 'isTaxTrackedOnSales'.
     */
    public void setIsTaxTrackedOnSales(
            final java.lang.String isTaxTrackedOnSales) {
        this._isTaxTrackedOnSales = isTaxTrackedOnSales;
    }

    /**
     * Sets the value of field 'isVendorEligibleFor1099'.
     * 
     * @param isVendorEligibleFor1099 the value of field
     * 'isVendorEligibleFor1099'.
     */
    public void setIsVendorEligibleFor1099(
            final java.lang.String isVendorEligibleFor1099) {
        this._isVendorEligibleFor1099 = isVendorEligibleFor1099;
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
     * Sets the value of field 'nameOnCheck'.
     * 
     * @param nameOnCheck the value of field 'nameOnCheck'.
     */
    public void setNameOnCheck(
            final java.lang.String nameOnCheck) {
        this._nameOnCheck = nameOnCheck;
    }

    /**
     * Sets the value of field 'notes'.
     * 
     * @param notes the value of field 'notes'.
     */
    public void setNotes(
            final java.lang.String notes) {
        this._notes = notes;
    }

    /**
     * Sets the value of field 'openBalance'.
     * 
     * @param openBalance the value of field 'openBalance'.
     */
    public void setOpenBalance(
            final java.lang.String openBalance) {
        this._openBalance = openBalance;
    }

    /**
     * Sets the value of field 'openBalanceDate'.
     * 
     * @param openBalanceDate the value of field 'openBalanceDate'.
     */
    public void setOpenBalanceDate(
            final java.lang.String openBalanceDate) {
        this._openBalanceDate = openBalanceDate;
    }

    /**
     * Sets the value of field 'personName'.
     * 
     * @param personName the value of field 'personName'.
     */
    public void setPersonName(
            final org.chocolate_milk.model.PersonName personName) {
        this._personName = personName;
    }

    /**
     * 
     * 
     * @param index
     * @param vPrefillAccountRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPrefillAccountRef(
            final int index,
            final org.chocolate_milk.model.PrefillAccountRef vPrefillAccountRef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._prefillAccountRefList.size()) {
            throw new IndexOutOfBoundsException("setPrefillAccountRef: Index value '" + index + "' not in range [0.." + (this._prefillAccountRefList.size() - 1) + "]");
        }

        this._prefillAccountRefList.set(index, vPrefillAccountRef);
    }

    /**
     * 
     * 
     * @param vPrefillAccountRefArray
     */
    public void setPrefillAccountRef(
            final org.chocolate_milk.model.PrefillAccountRef[] vPrefillAccountRefArray) {
        //-- copy array
        _prefillAccountRefList.clear();

        for (int i = 0; i < vPrefillAccountRefArray.length; i++) {
                this._prefillAccountRefList.add(vPrefillAccountRefArray[i]);
        }
    }

    /**
     * Sets the value of field 'reportingPeriod'.
     * 
     * @param reportingPeriod the value of field 'reportingPeriod'.
     */
    public void setReportingPeriod(
            final org.chocolate_milk.model.types.ReportingPeriodType reportingPeriod) {
        this._reportingPeriod = reportingPeriod;
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
     * Sets the value of field 'salesTaxCountry'.
     * 
     * @param salesTaxCountry the value of field 'salesTaxCountry'.
     */
    public void setSalesTaxCountry(
            final org.chocolate_milk.model.types.SalesTaxCountryType salesTaxCountry) {
        this._salesTaxCountry = salesTaxCountry;
    }

    /**
     * Sets the value of field 'salesTaxReturnRef'.
     * 
     * @param salesTaxReturnRef the value of field
     * 'salesTaxReturnRef'.
     */
    public void setSalesTaxReturnRef(
            final org.chocolate_milk.model.SalesTaxReturnRef salesTaxReturnRef) {
        this._salesTaxReturnRef = salesTaxReturnRef;
    }

    /**
     * Sets the value of field 'taxOnPurchasesAccountRef'.
     * 
     * @param taxOnPurchasesAccountRef the value of field
     * 'taxOnPurchasesAccountRef'.
     */
    public void setTaxOnPurchasesAccountRef(
            final org.chocolate_milk.model.TaxOnPurchasesAccountRef taxOnPurchasesAccountRef) {
        this._taxOnPurchasesAccountRef = taxOnPurchasesAccountRef;
    }

    /**
     * Sets the value of field 'taxOnSalesAccountRef'.
     * 
     * @param taxOnSalesAccountRef the value of field
     * 'taxOnSalesAccountRef'.
     */
    public void setTaxOnSalesAccountRef(
            final org.chocolate_milk.model.TaxOnSalesAccountRef taxOnSalesAccountRef) {
        this._taxOnSalesAccountRef = taxOnSalesAccountRef;
    }

    /**
     * Sets the value of field 'taxRegistrationNumber'.
     * 
     * @param taxRegistrationNumber the value of field
     * 'taxRegistrationNumber'.
     */
    public void setTaxRegistrationNumber(
            final java.lang.String taxRegistrationNumber) {
        this._taxRegistrationNumber = taxRegistrationNumber;
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
     * Sets the value of field 'vendorAddress'.
     * 
     * @param vendorAddress the value of field 'vendorAddress'.
     */
    public void setVendorAddress(
            final org.chocolate_milk.model.VendorAddress vendorAddress) {
        this._vendorAddress = vendorAddress;
    }

    /**
     * Sets the value of field 'vendorTaxIdent'.
     * 
     * @param vendorTaxIdent the value of field 'vendorTaxIdent'.
     */
    public void setVendorTaxIdent(
            final java.lang.String vendorTaxIdent) {
        this._vendorTaxIdent = vendorTaxIdent;
    }

    /**
     * Sets the value of field 'vendorTypeRef'.
     * 
     * @param vendorTypeRef the value of field 'vendorTypeRef'.
     */
    public void setVendorTypeRef(
            final org.chocolate_milk.model.VendorTypeRef vendorTypeRef) {
        this._vendorTypeRef = vendorTypeRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.VendorAdd
     */
    public static org.chocolate_milk.model.VendorAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VendorAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VendorAdd.class, reader);
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
