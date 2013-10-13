/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CustomerAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CustomerAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CustomerAdd implements java.io.Serializable {


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
     * Field _parentRef.
     */
    private org.chocolate_milk.model.ParentRef _parentRef;

    /**
     * Field _companyName.
     */
    private java.lang.String _companyName;

    /**
     * Field _personName.
     */
    private org.chocolate_milk.model.PersonName _personName;

    /**
     * Field _billAddress.
     */
    private org.chocolate_milk.model.BillAddress _billAddress;

    /**
     * Field _shipAddress.
     */
    private org.chocolate_milk.model.ShipAddress _shipAddress;

    /**
     * Field _printAs.
     */
    private java.lang.String _printAs;

    /**
     * Field _commInfo.
     */
    private org.chocolate_milk.model.CommInfo _commInfo;

    /**
     * Field _customerTypeRef.
     */
    private org.chocolate_milk.model.CustomerTypeRef _customerTypeRef;

    /**
     * Field _termsRef.
     */
    private org.chocolate_milk.model.TermsRef _termsRef;

    /**
     * Field _salesRepRef.
     */
    private org.chocolate_milk.model.SalesRepRef _salesRepRef;

    /**
     * Field _openBalance.
     */
    private java.lang.String _openBalance;

    /**
     * Field _openBalanceDate.
     */
    private java.lang.String _openBalanceDate;

    /**
     * Field _salesTaxCodeRef.
     */
    private org.chocolate_milk.model.SalesTaxCodeRef _salesTaxCodeRef;

    /**
     * Field _itemSalesTaxRef.
     */
    private org.chocolate_milk.model.ItemSalesTaxRef _itemSalesTaxRef;

    /**
     * Field _salesTaxCountry.
     */
    private org.chocolate_milk.model.types.SalesTaxCountryType _salesTaxCountry = org.chocolate_milk.model.types.SalesTaxCountryType.fromValue("Canada");

    /**
     * Field _resaleNumber.
     */
    private java.lang.String _resaleNumber;

    /**
     * Field _accountNumber.
     */
    private java.lang.String _accountNumber;

    /**
     * Field _creditLimit.
     */
    private java.lang.String _creditLimit;

    /**
     * Field _preferredPaymentMethodRef.
     */
    private org.chocolate_milk.model.PreferredPaymentMethodRef _preferredPaymentMethodRef;

    /**
     * Field _creditCardInfo.
     */
    private org.chocolate_milk.model.CreditCardInfo _creditCardInfo;

    /**
     * Field _jobStatus.
     */
    private org.chocolate_milk.model.types.JobStatusType _jobStatus = org.chocolate_milk.model.types.JobStatusType.fromValue("None");

    /**
     * Field _jobStartDate.
     */
    private java.lang.String _jobStartDate;

    /**
     * Field _jobProjectedEndDate.
     */
    private java.lang.String _jobProjectedEndDate;

    /**
     * Field _jobEndDate.
     */
    private java.lang.String _jobEndDate;

    /**
     * Field _jobDesc.
     */
    private java.lang.String _jobDesc;

    /**
     * Field _jobTypeRef.
     */
    private org.chocolate_milk.model.JobTypeRef _jobTypeRef;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;

    /**
     * Field _isStatementWithParent.
     */
    private java.lang.String _isStatementWithParent;

    /**
     * Field _deliveryMethod.
     */
    private org.chocolate_milk.model.types.DeliveryMethodType _deliveryMethod = org.chocolate_milk.model.types.DeliveryMethodType.fromValue("Print");

    /**
     * Field _priceLevelRef.
     */
    private org.chocolate_milk.model.PriceLevelRef _priceLevelRef;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;

    /**
     * Field _taxRegistrationNumber.
     */
    private java.lang.String _taxRegistrationNumber;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public CustomerAdd() {
        super();
        setSalesTaxCountry(org.chocolate_milk.model.types.SalesTaxCountryType.fromValue("Canada"));
        setJobStatus(org.chocolate_milk.model.types.JobStatusType.fromValue("None"));
        setDeliveryMethod(org.chocolate_milk.model.types.DeliveryMethodType.fromValue("Print"));
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'billAddress'.
     * 
     * @return the value of field 'BillAddress'.
     */
    public org.chocolate_milk.model.BillAddress getBillAddress(
    ) {
        return this._billAddress;
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
     * Returns the value of field 'creditCardInfo'.
     * 
     * @return the value of field 'CreditCardInfo'.
     */
    public org.chocolate_milk.model.CreditCardInfo getCreditCardInfo(
    ) {
        return this._creditCardInfo;
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
     * Returns the value of field 'customerTypeRef'.
     * 
     * @return the value of field 'CustomerTypeRef'.
     */
    public org.chocolate_milk.model.CustomerTypeRef getCustomerTypeRef(
    ) {
        return this._customerTypeRef;
    }

    /**
     * Returns the value of field 'deliveryMethod'.
     * 
     * @return the value of field 'DeliveryMethod'.
     */
    public org.chocolate_milk.model.types.DeliveryMethodType getDeliveryMethod(
    ) {
        return this._deliveryMethod;
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
     * Returns the value of field 'isStatementWithParent'.
     * 
     * @return the value of field 'IsStatementWithParent'.
     */
    public java.lang.String getIsStatementWithParent(
    ) {
        return this._isStatementWithParent;
    }

    /**
     * Returns the value of field 'itemSalesTaxRef'.
     * 
     * @return the value of field 'ItemSalesTaxRef'.
     */
    public org.chocolate_milk.model.ItemSalesTaxRef getItemSalesTaxRef(
    ) {
        return this._itemSalesTaxRef;
    }

    /**
     * Returns the value of field 'jobDesc'.
     * 
     * @return the value of field 'JobDesc'.
     */
    public java.lang.String getJobDesc(
    ) {
        return this._jobDesc;
    }

    /**
     * Returns the value of field 'jobEndDate'.
     * 
     * @return the value of field 'JobEndDate'.
     */
    public java.lang.String getJobEndDate(
    ) {
        return this._jobEndDate;
    }

    /**
     * Returns the value of field 'jobProjectedEndDate'.
     * 
     * @return the value of field 'JobProjectedEndDate'.
     */
    public java.lang.String getJobProjectedEndDate(
    ) {
        return this._jobProjectedEndDate;
    }

    /**
     * Returns the value of field 'jobStartDate'.
     * 
     * @return the value of field 'JobStartDate'.
     */
    public java.lang.String getJobStartDate(
    ) {
        return this._jobStartDate;
    }

    /**
     * Returns the value of field 'jobStatus'.
     * 
     * @return the value of field 'JobStatus'.
     */
    public org.chocolate_milk.model.types.JobStatusType getJobStatus(
    ) {
        return this._jobStatus;
    }

    /**
     * Returns the value of field 'jobTypeRef'.
     * 
     * @return the value of field 'JobTypeRef'.
     */
    public org.chocolate_milk.model.JobTypeRef getJobTypeRef(
    ) {
        return this._jobTypeRef;
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
     * Returns the value of field 'parentRef'.
     * 
     * @return the value of field 'ParentRef'.
     */
    public org.chocolate_milk.model.ParentRef getParentRef(
    ) {
        return this._parentRef;
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
     * Returns the value of field 'preferredPaymentMethodRef'.
     * 
     * @return the value of field 'PreferredPaymentMethodRef'.
     */
    public org.chocolate_milk.model.PreferredPaymentMethodRef getPreferredPaymentMethodRef(
    ) {
        return this._preferredPaymentMethodRef;
    }

    /**
     * Returns the value of field 'priceLevelRef'.
     * 
     * @return the value of field 'PriceLevelRef'.
     */
    public org.chocolate_milk.model.PriceLevelRef getPriceLevelRef(
    ) {
        return this._priceLevelRef;
    }

    /**
     * Returns the value of field 'printAs'.
     * 
     * @return the value of field 'PrintAs'.
     */
    public java.lang.String getPrintAs(
    ) {
        return this._printAs;
    }

    /**
     * Returns the value of field 'resaleNumber'.
     * 
     * @return the value of field 'ResaleNumber'.
     */
    public java.lang.String getResaleNumber(
    ) {
        return this._resaleNumber;
    }

    /**
     * Returns the value of field 'salesRepRef'.
     * 
     * @return the value of field 'SalesRepRef'.
     */
    public org.chocolate_milk.model.SalesRepRef getSalesRepRef(
    ) {
        return this._salesRepRef;
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
     * Returns the value of field 'shipAddress'.
     * 
     * @return the value of field 'ShipAddress'.
     */
    public org.chocolate_milk.model.ShipAddress getShipAddress(
    ) {
        return this._shipAddress;
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
     * Sets the value of field 'accountNumber'.
     * 
     * @param accountNumber the value of field 'accountNumber'.
     */
    public void setAccountNumber(
            final java.lang.String accountNumber) {
        this._accountNumber = accountNumber;
    }

    /**
     * Sets the value of field 'billAddress'.
     * 
     * @param billAddress the value of field 'billAddress'.
     */
    public void setBillAddress(
            final org.chocolate_milk.model.BillAddress billAddress) {
        this._billAddress = billAddress;
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
     * Sets the value of field 'creditCardInfo'.
     * 
     * @param creditCardInfo the value of field 'creditCardInfo'.
     */
    public void setCreditCardInfo(
            final org.chocolate_milk.model.CreditCardInfo creditCardInfo) {
        this._creditCardInfo = creditCardInfo;
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
     * Sets the value of field 'customerTypeRef'.
     * 
     * @param customerTypeRef the value of field 'customerTypeRef'.
     */
    public void setCustomerTypeRef(
            final org.chocolate_milk.model.CustomerTypeRef customerTypeRef) {
        this._customerTypeRef = customerTypeRef;
    }

    /**
     * Sets the value of field 'deliveryMethod'.
     * 
     * @param deliveryMethod the value of field 'deliveryMethod'.
     */
    public void setDeliveryMethod(
            final org.chocolate_milk.model.types.DeliveryMethodType deliveryMethod) {
        this._deliveryMethod = deliveryMethod;
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
     * Sets the value of field 'isStatementWithParent'.
     * 
     * @param isStatementWithParent the value of field
     * 'isStatementWithParent'.
     */
    public void setIsStatementWithParent(
            final java.lang.String isStatementWithParent) {
        this._isStatementWithParent = isStatementWithParent;
    }

    /**
     * Sets the value of field 'itemSalesTaxRef'.
     * 
     * @param itemSalesTaxRef the value of field 'itemSalesTaxRef'.
     */
    public void setItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef itemSalesTaxRef) {
        this._itemSalesTaxRef = itemSalesTaxRef;
    }

    /**
     * Sets the value of field 'jobDesc'.
     * 
     * @param jobDesc the value of field 'jobDesc'.
     */
    public void setJobDesc(
            final java.lang.String jobDesc) {
        this._jobDesc = jobDesc;
    }

    /**
     * Sets the value of field 'jobEndDate'.
     * 
     * @param jobEndDate the value of field 'jobEndDate'.
     */
    public void setJobEndDate(
            final java.lang.String jobEndDate) {
        this._jobEndDate = jobEndDate;
    }

    /**
     * Sets the value of field 'jobProjectedEndDate'.
     * 
     * @param jobProjectedEndDate the value of field
     * 'jobProjectedEndDate'.
     */
    public void setJobProjectedEndDate(
            final java.lang.String jobProjectedEndDate) {
        this._jobProjectedEndDate = jobProjectedEndDate;
    }

    /**
     * Sets the value of field 'jobStartDate'.
     * 
     * @param jobStartDate the value of field 'jobStartDate'.
     */
    public void setJobStartDate(
            final java.lang.String jobStartDate) {
        this._jobStartDate = jobStartDate;
    }

    /**
     * Sets the value of field 'jobStatus'.
     * 
     * @param jobStatus the value of field 'jobStatus'.
     */
    public void setJobStatus(
            final org.chocolate_milk.model.types.JobStatusType jobStatus) {
        this._jobStatus = jobStatus;
    }

    /**
     * Sets the value of field 'jobTypeRef'.
     * 
     * @param jobTypeRef the value of field 'jobTypeRef'.
     */
    public void setJobTypeRef(
            final org.chocolate_milk.model.JobTypeRef jobTypeRef) {
        this._jobTypeRef = jobTypeRef;
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
     * Sets the value of field 'parentRef'.
     * 
     * @param parentRef the value of field 'parentRef'.
     */
    public void setParentRef(
            final org.chocolate_milk.model.ParentRef parentRef) {
        this._parentRef = parentRef;
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
     * Sets the value of field 'preferredPaymentMethodRef'.
     * 
     * @param preferredPaymentMethodRef the value of field
     * 'preferredPaymentMethodRef'.
     */
    public void setPreferredPaymentMethodRef(
            final org.chocolate_milk.model.PreferredPaymentMethodRef preferredPaymentMethodRef) {
        this._preferredPaymentMethodRef = preferredPaymentMethodRef;
    }

    /**
     * Sets the value of field 'priceLevelRef'.
     * 
     * @param priceLevelRef the value of field 'priceLevelRef'.
     */
    public void setPriceLevelRef(
            final org.chocolate_milk.model.PriceLevelRef priceLevelRef) {
        this._priceLevelRef = priceLevelRef;
    }

    /**
     * Sets the value of field 'printAs'.
     * 
     * @param printAs the value of field 'printAs'.
     */
    public void setPrintAs(
            final java.lang.String printAs) {
        this._printAs = printAs;
    }

    /**
     * Sets the value of field 'resaleNumber'.
     * 
     * @param resaleNumber the value of field 'resaleNumber'.
     */
    public void setResaleNumber(
            final java.lang.String resaleNumber) {
        this._resaleNumber = resaleNumber;
    }

    /**
     * Sets the value of field 'salesRepRef'.
     * 
     * @param salesRepRef the value of field 'salesRepRef'.
     */
    public void setSalesRepRef(
            final org.chocolate_milk.model.SalesRepRef salesRepRef) {
        this._salesRepRef = salesRepRef;
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
     * Sets the value of field 'shipAddress'.
     * 
     * @param shipAddress the value of field 'shipAddress'.
     */
    public void setShipAddress(
            final org.chocolate_milk.model.ShipAddress shipAddress) {
        this._shipAddress = shipAddress;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.CustomerAdd
     */
    public static org.chocolate_milk.model.CustomerAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CustomerAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CustomerAdd.class, reader);
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
