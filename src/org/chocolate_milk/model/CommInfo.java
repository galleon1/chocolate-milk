/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CommInfo.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CommInfo.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CommInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

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


      //----------------/
     //- Constructors -/
    //----------------/

    public CommInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'mobile'.
     * 
     * @return the value of field 'Mobile'.
     */
    public java.lang.String getMobile(
    ) {
        return this._mobile;
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
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'Phone'.
     */
    public java.lang.String getPhone(
    ) {
        return this._phone;
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
     * Sets the value of field 'mobile'.
     * 
     * @param mobile the value of field 'mobile'.
     */
    public void setMobile(
            final java.lang.String mobile) {
        this._mobile = mobile;
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
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
     */
    public void setPhone(
            final java.lang.String phone) {
        this._phone = phone;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.CommInfo
     */
    public static org.chocolate_milk.model.CommInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CommInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CommInfo.class, reader);
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
