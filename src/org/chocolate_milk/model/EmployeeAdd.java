/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EmployeeAdd.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EmployeeAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EmployeeAdd implements java.io.Serializable {


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
     * Field _personName.
     */
    private org.chocolate_milk.model.PersonName _personName;

    /**
     * Field _employeeAddress.
     */
    private org.chocolate_milk.model.EmployeeAddress _employeeAddress;

    /**
     * Field _printAs.
     */
    private java.lang.String _printAs;

    /**
     * Field _phone.
     */
    private java.lang.String _phone;

    /**
     * Field _mobile.
     */
    private java.lang.String _mobile;

    /**
     * Field _pager.
     */
    private java.lang.String _pager;

    /**
     * Field _pagerPIN.
     */
    private java.lang.String _pagerPIN;

    /**
     * Field _altPhone.
     */
    private java.lang.String _altPhone;

    /**
     * Field _fax.
     */
    private java.lang.String _fax;

    /**
     * Field _SSN.
     */
    private java.lang.String _SSN;

    /**
     * Field _email.
     */
    private java.lang.String _email;

    /**
     * Field _employeeType.
     */
    private org.chocolate_milk.model.types.EmployeeTypeType _employeeType = org.chocolate_milk.model.types.EmployeeTypeType.fromValue("Regular");

    /**
     * Field _gender.
     */
    private org.chocolate_milk.model.types.GenderType _gender;

    /**
     * Field _hiredDate.
     */
    private java.lang.String _hiredDate;

    /**
     * Field _releasedDate.
     */
    private java.lang.String _releasedDate;

    /**
     * Field _birthDate.
     */
    private java.lang.String _birthDate;

    /**
     * Field _accountNumber.
     */
    private java.lang.String _accountNumber;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;

    /**
     * Field _billingRateRef.
     */
    private org.chocolate_milk.model.BillingRateRef _billingRateRef;

    /**
     * Field _employeePayrollInfo.
     */
    private org.chocolate_milk.model.EmployeePayrollInfo _employeePayrollInfo;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;


      //----------------/
     //- Constructors -/
    //----------------/

    public EmployeeAdd() {
        super();
        setEmployeeType(org.chocolate_milk.model.types.EmployeeTypeType.fromValue("Regular"));
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
     * Returns the value of field 'altPhone'.
     * 
     * @return the value of field 'AltPhone'.
     */
    public java.lang.String getAltPhone(
    ) {
        return this._altPhone;
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
     * Returns the value of field 'birthDate'.
     * 
     * @return the value of field 'BirthDate'.
     */
    public java.lang.String getBirthDate(
    ) {
        return this._birthDate;
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
     * Returns the value of field 'employeeAddress'.
     * 
     * @return the value of field 'EmployeeAddress'.
     */
    public org.chocolate_milk.model.EmployeeAddress getEmployeeAddress(
    ) {
        return this._employeeAddress;
    }

    /**
     * Returns the value of field 'employeePayrollInfo'.
     * 
     * @return the value of field 'EmployeePayrollInfo'.
     */
    public org.chocolate_milk.model.EmployeePayrollInfo getEmployeePayrollInfo(
    ) {
        return this._employeePayrollInfo;
    }

    /**
     * Returns the value of field 'employeeType'.
     * 
     * @return the value of field 'EmployeeType'.
     */
    public org.chocolate_milk.model.types.EmployeeTypeType getEmployeeType(
    ) {
        return this._employeeType;
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
     * Returns the value of field 'fax'.
     * 
     * @return the value of field 'Fax'.
     */
    public java.lang.String getFax(
    ) {
        return this._fax;
    }

    /**
     * Returns the value of field 'gender'.
     * 
     * @return the value of field 'Gender'.
     */
    public org.chocolate_milk.model.types.GenderType getGender(
    ) {
        return this._gender;
    }

    /**
     * Returns the value of field 'hiredDate'.
     * 
     * @return the value of field 'HiredDate'.
     */
    public java.lang.String getHiredDate(
    ) {
        return this._hiredDate;
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
     * Returns the value of field 'mobile'.
     * 
     * @return the value of field 'Mobile'.
     */
    public java.lang.String getMobile(
    ) {
        return this._mobile;
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
     * Returns the value of field 'pager'.
     * 
     * @return the value of field 'Pager'.
     */
    public java.lang.String getPager(
    ) {
        return this._pager;
    }

    /**
     * Returns the value of field 'pagerPIN'.
     * 
     * @return the value of field 'PagerPIN'.
     */
    public java.lang.String getPagerPIN(
    ) {
        return this._pagerPIN;
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
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'Phone'.
     */
    public java.lang.String getPhone(
    ) {
        return this._phone;
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
     * Returns the value of field 'releasedDate'.
     * 
     * @return the value of field 'ReleasedDate'.
     */
    public java.lang.String getReleasedDate(
    ) {
        return this._releasedDate;
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
     * Sets the value of field 'altPhone'.
     * 
     * @param altPhone the value of field 'altPhone'.
     */
    public void setAltPhone(
            final java.lang.String altPhone) {
        this._altPhone = altPhone;
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
     * Sets the value of field 'birthDate'.
     * 
     * @param birthDate the value of field 'birthDate'.
     */
    public void setBirthDate(
            final java.lang.String birthDate) {
        this._birthDate = birthDate;
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
     * Sets the value of field 'employeeAddress'.
     * 
     * @param employeeAddress the value of field 'employeeAddress'.
     */
    public void setEmployeeAddress(
            final org.chocolate_milk.model.EmployeeAddress employeeAddress) {
        this._employeeAddress = employeeAddress;
    }

    /**
     * Sets the value of field 'employeePayrollInfo'.
     * 
     * @param employeePayrollInfo the value of field
     * 'employeePayrollInfo'.
     */
    public void setEmployeePayrollInfo(
            final org.chocolate_milk.model.EmployeePayrollInfo employeePayrollInfo) {
        this._employeePayrollInfo = employeePayrollInfo;
    }

    /**
     * Sets the value of field 'employeeType'.
     * 
     * @param employeeType the value of field 'employeeType'.
     */
    public void setEmployeeType(
            final org.chocolate_milk.model.types.EmployeeTypeType employeeType) {
        this._employeeType = employeeType;
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
     * Sets the value of field 'fax'.
     * 
     * @param fax the value of field 'fax'.
     */
    public void setFax(
            final java.lang.String fax) {
        this._fax = fax;
    }

    /**
     * Sets the value of field 'gender'.
     * 
     * @param gender the value of field 'gender'.
     */
    public void setGender(
            final org.chocolate_milk.model.types.GenderType gender) {
        this._gender = gender;
    }

    /**
     * Sets the value of field 'hiredDate'.
     * 
     * @param hiredDate the value of field 'hiredDate'.
     */
    public void setHiredDate(
            final java.lang.String hiredDate) {
        this._hiredDate = hiredDate;
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
     * Sets the value of field 'mobile'.
     * 
     * @param mobile the value of field 'mobile'.
     */
    public void setMobile(
            final java.lang.String mobile) {
        this._mobile = mobile;
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
     * Sets the value of field 'pager'.
     * 
     * @param pager the value of field 'pager'.
     */
    public void setPager(
            final java.lang.String pager) {
        this._pager = pager;
    }

    /**
     * Sets the value of field 'pagerPIN'.
     * 
     * @param pagerPIN the value of field 'pagerPIN'.
     */
    public void setPagerPIN(
            final java.lang.String pagerPIN) {
        this._pagerPIN = pagerPIN;
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
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
     */
    public void setPhone(
            final java.lang.String phone) {
        this._phone = phone;
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
     * Sets the value of field 'releasedDate'.
     * 
     * @param releasedDate the value of field 'releasedDate'.
     */
    public void setReleasedDate(
            final java.lang.String releasedDate) {
        this._releasedDate = releasedDate;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.EmployeeAdd
     */
    public static org.chocolate_milk.model.EmployeeAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EmployeeAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EmployeeAdd.class, reader);
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
