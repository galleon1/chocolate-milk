/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CompanyRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CompanyRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CompanyRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isSampleCompany.
     */
    private java.lang.String _isSampleCompany;

    /**
     * Field _companyName.
     */
    private java.lang.String _companyName;

    /**
     * Field _legalCompanyName.
     */
    private java.lang.String _legalCompanyName;

    /**
     * Field _address.
     */
    private org.chocolate_milk.model.Address _address;

    /**
     * Field _addressBlock.
     */
    private org.chocolate_milk.model.AddressBlock _addressBlock;

    /**
     * Field _legalAddress.
     */
    private org.chocolate_milk.model.LegalAddress _legalAddress;

    /**
     * Field _companyAddressForCustomer.
     */
    private org.chocolate_milk.model.CompanyAddressForCustomer _companyAddressForCustomer;

    /**
     * Field _companyAddressBlockForCustomer.
     */
    private org.chocolate_milk.model.CompanyAddressBlockForCustomer _companyAddressBlockForCustomer;

    /**
     * Field _phone.
     */
    private java.lang.String _phone;

    /**
     * Field _fax.
     */
    private java.lang.String _fax;

    /**
     * Field _email.
     */
    private java.lang.String _email;

    /**
     * Field _companyEmailForCustomer.
     */
    private java.lang.String _companyEmailForCustomer;

    /**
     * Field _companyWebSite.
     */
    private java.lang.String _companyWebSite;

    /**
     * Field _firstMonthFiscalYear.
     */
    private org.chocolate_milk.model.types.FirstMonthFiscalYearType _firstMonthFiscalYear;

    /**
     * Field _firstMonthIncomeTaxYear.
     */
    private org.chocolate_milk.model.types.FirstMonthIncomeTaxYearType _firstMonthIncomeTaxYear;

    /**
     * Field _companyType.
     */
    private java.lang.String _companyType;

    /**
     * Field _EIN.
     */
    private java.lang.String _EIN;

    /**
     * Field _SSN.
     */
    private java.lang.String _SSN;

    /**
     * Field _taxForm.
     */
    private org.chocolate_milk.model.types.TaxFormType _taxForm;

    /**
     * Field _subscribedServices.
     */
    private org.chocolate_milk.model.SubscribedServices _subscribedServices;

    /**
     * Field _accountantCopy.
     */
    private org.chocolate_milk.model.AccountantCopy _accountantCopy;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CompanyRet() {
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
     * Returns the value of field 'accountantCopy'.
     * 
     * @return the value of field 'AccountantCopy'.
     */
    public org.chocolate_milk.model.AccountantCopy getAccountantCopy(
    ) {
        return this._accountantCopy;
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
     * Returns the value of field 'companyAddressBlockForCustomer'.
     * 
     * @return the value of field 'CompanyAddressBlockForCustomer'.
     */
    public org.chocolate_milk.model.CompanyAddressBlockForCustomer getCompanyAddressBlockForCustomer(
    ) {
        return this._companyAddressBlockForCustomer;
    }

    /**
     * Returns the value of field 'companyAddressForCustomer'.
     * 
     * @return the value of field 'CompanyAddressForCustomer'.
     */
    public org.chocolate_milk.model.CompanyAddressForCustomer getCompanyAddressForCustomer(
    ) {
        return this._companyAddressForCustomer;
    }

    /**
     * Returns the value of field 'companyEmailForCustomer'.
     * 
     * @return the value of field 'CompanyEmailForCustomer'.
     */
    public java.lang.String getCompanyEmailForCustomer(
    ) {
        return this._companyEmailForCustomer;
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
     * Returns the value of field 'companyType'.
     * 
     * @return the value of field 'CompanyType'.
     */
    public java.lang.String getCompanyType(
    ) {
        return this._companyType;
    }

    /**
     * Returns the value of field 'companyWebSite'.
     * 
     * @return the value of field 'CompanyWebSite'.
     */
    public java.lang.String getCompanyWebSite(
    ) {
        return this._companyWebSite;
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
     * Returns the value of field 'EIN'.
     * 
     * @return the value of field 'EIN'.
     */
    public java.lang.String getEIN(
    ) {
        return this._EIN;
    }

    /**
     * Returns the value of field 'email'.
     * 
     * @return the value of field 'Email'.
     */
    public java.lang.String getEmail(
    ) {
        return this._email;
    }

    /**
     * Returns the value of field 'fax'.
     * 
     * @return the value of field 'Fax'.
     */
    public java.lang.String getFax(
    ) {
        return this._fax;
    }

    /**
     * Returns the value of field 'firstMonthFiscalYear'.
     * 
     * @return the value of field 'FirstMonthFiscalYear'.
     */
    public org.chocolate_milk.model.types.FirstMonthFiscalYearType getFirstMonthFiscalYear(
    ) {
        return this._firstMonthFiscalYear;
    }

    /**
     * Returns the value of field 'firstMonthIncomeTaxYear'.
     * 
     * @return the value of field 'FirstMonthIncomeTaxYear'.
     */
    public org.chocolate_milk.model.types.FirstMonthIncomeTaxYearType getFirstMonthIncomeTaxYear(
    ) {
        return this._firstMonthIncomeTaxYear;
    }

    /**
     * Returns the value of field 'isSampleCompany'.
     * 
     * @return the value of field 'IsSampleCompany'.
     */
    public java.lang.String getIsSampleCompany(
    ) {
        return this._isSampleCompany;
    }

    /**
     * Returns the value of field 'legalAddress'.
     * 
     * @return the value of field 'LegalAddress'.
     */
    public org.chocolate_milk.model.LegalAddress getLegalAddress(
    ) {
        return this._legalAddress;
    }

    /**
     * Returns the value of field 'legalCompanyName'.
     * 
     * @return the value of field 'LegalCompanyName'.
     */
    public java.lang.String getLegalCompanyName(
    ) {
        return this._legalCompanyName;
    }

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'Phone'.
     */
    public java.lang.String getPhone(
    ) {
        return this._phone;
    }

    /**
     * Returns the value of field 'SSN'.
     * 
     * @return the value of field 'SSN'.
     */
    public java.lang.String getSSN(
    ) {
        return this._SSN;
    }

    /**
     * Returns the value of field 'subscribedServices'.
     * 
     * @return the value of field 'SubscribedServices'.
     */
    public org.chocolate_milk.model.SubscribedServices getSubscribedServices(
    ) {
        return this._subscribedServices;
    }

    /**
     * Returns the value of field 'taxForm'.
     * 
     * @return the value of field 'TaxForm'.
     */
    public org.chocolate_milk.model.types.TaxFormType getTaxForm(
    ) {
        return this._taxForm;
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
     * Sets the value of field 'accountantCopy'.
     * 
     * @param accountantCopy the value of field 'accountantCopy'.
     */
    public void setAccountantCopy(
            final org.chocolate_milk.model.AccountantCopy accountantCopy) {
        this._accountantCopy = accountantCopy;
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
     * Sets the value of field 'companyAddressBlockForCustomer'.
     * 
     * @param companyAddressBlockForCustomer the value of field
     * 'companyAddressBlockForCustomer'.
     */
    public void setCompanyAddressBlockForCustomer(
            final org.chocolate_milk.model.CompanyAddressBlockForCustomer companyAddressBlockForCustomer) {
        this._companyAddressBlockForCustomer = companyAddressBlockForCustomer;
    }

    /**
     * Sets the value of field 'companyAddressForCustomer'.
     * 
     * @param companyAddressForCustomer the value of field
     * 'companyAddressForCustomer'.
     */
    public void setCompanyAddressForCustomer(
            final org.chocolate_milk.model.CompanyAddressForCustomer companyAddressForCustomer) {
        this._companyAddressForCustomer = companyAddressForCustomer;
    }

    /**
     * Sets the value of field 'companyEmailForCustomer'.
     * 
     * @param companyEmailForCustomer the value of field
     * 'companyEmailForCustomer'.
     */
    public void setCompanyEmailForCustomer(
            final java.lang.String companyEmailForCustomer) {
        this._companyEmailForCustomer = companyEmailForCustomer;
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
     * Sets the value of field 'companyType'.
     * 
     * @param companyType the value of field 'companyType'.
     */
    public void setCompanyType(
            final java.lang.String companyType) {
        this._companyType = companyType;
    }

    /**
     * Sets the value of field 'companyWebSite'.
     * 
     * @param companyWebSite the value of field 'companyWebSite'.
     */
    public void setCompanyWebSite(
            final java.lang.String companyWebSite) {
        this._companyWebSite = companyWebSite;
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
     * Sets the value of field 'EIN'.
     * 
     * @param EIN the value of field 'EIN'.
     */
    public void setEIN(
            final java.lang.String EIN) {
        this._EIN = EIN;
    }

    /**
     * Sets the value of field 'email'.
     * 
     * @param email the value of field 'email'.
     */
    public void setEmail(
            final java.lang.String email) {
        this._email = email;
    }

    /**
     * Sets the value of field 'fax'.
     * 
     * @param fax the value of field 'fax'.
     */
    public void setFax(
            final java.lang.String fax) {
        this._fax = fax;
    }

    /**
     * Sets the value of field 'firstMonthFiscalYear'.
     * 
     * @param firstMonthFiscalYear the value of field
     * 'firstMonthFiscalYear'.
     */
    public void setFirstMonthFiscalYear(
            final org.chocolate_milk.model.types.FirstMonthFiscalYearType firstMonthFiscalYear) {
        this._firstMonthFiscalYear = firstMonthFiscalYear;
    }

    /**
     * Sets the value of field 'firstMonthIncomeTaxYear'.
     * 
     * @param firstMonthIncomeTaxYear the value of field
     * 'firstMonthIncomeTaxYear'.
     */
    public void setFirstMonthIncomeTaxYear(
            final org.chocolate_milk.model.types.FirstMonthIncomeTaxYearType firstMonthIncomeTaxYear) {
        this._firstMonthIncomeTaxYear = firstMonthIncomeTaxYear;
    }

    /**
     * Sets the value of field 'isSampleCompany'.
     * 
     * @param isSampleCompany the value of field 'isSampleCompany'.
     */
    public void setIsSampleCompany(
            final java.lang.String isSampleCompany) {
        this._isSampleCompany = isSampleCompany;
    }

    /**
     * Sets the value of field 'legalAddress'.
     * 
     * @param legalAddress the value of field 'legalAddress'.
     */
    public void setLegalAddress(
            final org.chocolate_milk.model.LegalAddress legalAddress) {
        this._legalAddress = legalAddress;
    }

    /**
     * Sets the value of field 'legalCompanyName'.
     * 
     * @param legalCompanyName the value of field 'legalCompanyName'
     */
    public void setLegalCompanyName(
            final java.lang.String legalCompanyName) {
        this._legalCompanyName = legalCompanyName;
    }

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
     */
    public void setPhone(
            final java.lang.String phone) {
        this._phone = phone;
    }

    /**
     * Sets the value of field 'SSN'.
     * 
     * @param SSN the value of field 'SSN'.
     */
    public void setSSN(
            final java.lang.String SSN) {
        this._SSN = SSN;
    }

    /**
     * Sets the value of field 'subscribedServices'.
     * 
     * @param subscribedServices the value of field
     * 'subscribedServices'.
     */
    public void setSubscribedServices(
            final org.chocolate_milk.model.SubscribedServices subscribedServices) {
        this._subscribedServices = subscribedServices;
    }

    /**
     * Sets the value of field 'taxForm'.
     * 
     * @param taxForm the value of field 'taxForm'.
     */
    public void setTaxForm(
            final org.chocolate_milk.model.types.TaxFormType taxForm) {
        this._taxForm = taxForm;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.CompanyRet
     */
    public static org.chocolate_milk.model.CompanyRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CompanyRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CompanyRet.class, reader);
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
