/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CurrentAppAccessRights.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CurrentAppAccessRights.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CurrentAppAccessRights implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isAutomaticLoginAllowed.
     */
    private java.lang.String _isAutomaticLoginAllowed;

    /**
     * Field _automaticLoginUserName.
     */
    private java.lang.String _automaticLoginUserName;

    /**
     * Field _isPersonalDataAccessAllowed.
     */
    private java.lang.String _isPersonalDataAccessAllowed;


      //----------------/
     //- Constructors -/
    //----------------/

    public CurrentAppAccessRights() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'automaticLoginUserName'.
     * 
     * @return the value of field 'AutomaticLoginUserName'.
     */
    public java.lang.String getAutomaticLoginUserName(
    ) {
        return this._automaticLoginUserName;
    }

    /**
     * Returns the value of field 'isAutomaticLoginAllowed'.
     * 
     * @return the value of field 'IsAutomaticLoginAllowed'.
     */
    public java.lang.String getIsAutomaticLoginAllowed(
    ) {
        return this._isAutomaticLoginAllowed;
    }

    /**
     * Returns the value of field 'isPersonalDataAccessAllowed'.
     * 
     * @return the value of field 'IsPersonalDataAccessAllowed'.
     */
    public java.lang.String getIsPersonalDataAccessAllowed(
    ) {
        return this._isPersonalDataAccessAllowed;
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
     * Sets the value of field 'automaticLoginUserName'.
     * 
     * @param automaticLoginUserName the value of field
     * 'automaticLoginUserName'.
     */
    public void setAutomaticLoginUserName(
            final java.lang.String automaticLoginUserName) {
        this._automaticLoginUserName = automaticLoginUserName;
    }

    /**
     * Sets the value of field 'isAutomaticLoginAllowed'.
     * 
     * @param isAutomaticLoginAllowed the value of field
     * 'isAutomaticLoginAllowed'.
     */
    public void setIsAutomaticLoginAllowed(
            final java.lang.String isAutomaticLoginAllowed) {
        this._isAutomaticLoginAllowed = isAutomaticLoginAllowed;
    }

    /**
     * Sets the value of field 'isPersonalDataAccessAllowed'.
     * 
     * @param isPersonalDataAccessAllowed the value of field
     * 'isPersonalDataAccessAllowed'.
     */
    public void setIsPersonalDataAccessAllowed(
            final java.lang.String isPersonalDataAccessAllowed) {
        this._isPersonalDataAccessAllowed = isPersonalDataAccessAllowed;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.CurrentAppAccessRights
     */
    public static org.chocolate_milk.model.CurrentAppAccessRights unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CurrentAppAccessRights) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CurrentAppAccessRights.class, reader);
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
