/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: OtherNameMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class OtherNameMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class OtherNameMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listCoreMod.
     */
    private org.chocolate_milk.model.ListCoreMod _listCoreMod;

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
     * Field _salutation.
     */
    private java.lang.String _salutation;

    /**
     * Field _firstName.
     */
    private java.lang.String _firstName;

    /**
     * Field _middleName.
     */
    private java.lang.String _middleName;

    /**
     * Field _lastName.
     */
    private java.lang.String _lastName;

    /**
     * Field _otherNameAddress.
     */
    private org.chocolate_milk.model.OtherNameAddress _otherNameAddress;

    /**
     * Field _phone.
     */
    private java.lang.String _phone;

    /**
     * Field _altPhone.
     */
    private java.lang.String _altPhone;

    /**
     * Field _fax.
     */
    private java.lang.String _fax;

    /**
     * Field _email.
     */
    private java.lang.String _email;

    /**
     * Field _contact.
     */
    private java.lang.String _contact;

    /**
     * Field _altContact.
     */
    private java.lang.String _altContact;

    /**
     * Field _accountNumber.
     */
    private java.lang.String _accountNumber;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;


      //----------------/
     //- Constructors -/
    //----------------/

    public OtherNameMod() {
        super();
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
     * Returns the value of field 'altContact'.
     * 
     * @return the value of field 'AltContact'.
     */
    public java.lang.String getAltContact(
    ) {
        return this._altContact;
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
     * Returns the value of field 'companyName'.
     * 
     * @return the value of field 'CompanyName'.
     */
    public java.lang.String getCompanyName(
    ) {
        return this._companyName;
    }

    /**
     * Returns the value of field 'contact'.
     * 
     * @return the value of field 'Contact'.
     */
    public java.lang.String getContact(
    ) {
        return this._contact;
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
     * Returns the value of field 'firstName'.
     * 
     * @return the value of field 'FirstName'.
     */
    public java.lang.String getFirstName(
    ) {
        return this._firstName;
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
     * Returns the value of field 'lastName'.
     * 
     * @return the value of field 'LastName'.
     */
    public java.lang.String getLastName(
    ) {
        return this._lastName;
    }

    /**
     * Returns the value of field 'listCoreMod'.
     * 
     * @return the value of field 'ListCoreMod'.
     */
    public org.chocolate_milk.model.ListCoreMod getListCoreMod(
    ) {
        return this._listCoreMod;
    }

    /**
     * Returns the value of field 'middleName'.
     * 
     * @return the value of field 'MiddleName'.
     */
    public java.lang.String getMiddleName(
    ) {
        return this._middleName;
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
     * Returns the value of field 'otherNameAddress'.
     * 
     * @return the value of field 'OtherNameAddress'.
     */
    public org.chocolate_milk.model.OtherNameAddress getOtherNameAddress(
    ) {
        return this._otherNameAddress;
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
     * Returns the value of field 'salutation'.
     * 
     * @return the value of field 'Salutation'.
     */
    public java.lang.String getSalutation(
    ) {
        return this._salutation;
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
     * Sets the value of field 'altContact'.
     * 
     * @param altContact the value of field 'altContact'.
     */
    public void setAltContact(
            final java.lang.String altContact) {
        this._altContact = altContact;
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
     * Sets the value of field 'companyName'.
     * 
     * @param companyName the value of field 'companyName'.
     */
    public void setCompanyName(
            final java.lang.String companyName) {
        this._companyName = companyName;
    }

    /**
     * Sets the value of field 'contact'.
     * 
     * @param contact the value of field 'contact'.
     */
    public void setContact(
            final java.lang.String contact) {
        this._contact = contact;
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
     * Sets the value of field 'firstName'.
     * 
     * @param firstName the value of field 'firstName'.
     */
    public void setFirstName(
            final java.lang.String firstName) {
        this._firstName = firstName;
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
     * Sets the value of field 'lastName'.
     * 
     * @param lastName the value of field 'lastName'.
     */
    public void setLastName(
            final java.lang.String lastName) {
        this._lastName = lastName;
    }

    /**
     * Sets the value of field 'listCoreMod'.
     * 
     * @param listCoreMod the value of field 'listCoreMod'.
     */
    public void setListCoreMod(
            final org.chocolate_milk.model.ListCoreMod listCoreMod) {
        this._listCoreMod = listCoreMod;
    }

    /**
     * Sets the value of field 'middleName'.
     * 
     * @param middleName the value of field 'middleName'.
     */
    public void setMiddleName(
            final java.lang.String middleName) {
        this._middleName = middleName;
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
     * Sets the value of field 'otherNameAddress'.
     * 
     * @param otherNameAddress the value of field 'otherNameAddress'
     */
    public void setOtherNameAddress(
            final org.chocolate_milk.model.OtherNameAddress otherNameAddress) {
        this._otherNameAddress = otherNameAddress;
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
     * Sets the value of field 'salutation'.
     * 
     * @param salutation the value of field 'salutation'.
     */
    public void setSalutation(
            final java.lang.String salutation) {
        this._salutation = salutation;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.OtherNameMod
     */
    public static org.chocolate_milk.model.OtherNameMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.OtherNameMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.OtherNameMod.class, reader);
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
