/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CompanyFileEvent.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CompanyFileEvent.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CompanyFileEvent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _companyFileEventOperation.
     */
    private org.chocolate_milk.model.types.CompanyFileEventOperationType _companyFileEventOperation;

    /**
     * Field _isNewCompany.
     */
    private java.lang.String _isNewCompany;

    /**
     * Field _isAutomaticLogin.
     */
    private java.lang.String _isAutomaticLogin;


      //----------------/
     //- Constructors -/
    //----------------/

    public CompanyFileEvent() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'companyFileEventOperation'.
     * 
     * @return the value of field 'CompanyFileEventOperation'.
     */
    public org.chocolate_milk.model.types.CompanyFileEventOperationType getCompanyFileEventOperation(
    ) {
        return this._companyFileEventOperation;
    }

    /**
     * Returns the value of field 'isAutomaticLogin'.
     * 
     * @return the value of field 'IsAutomaticLogin'.
     */
    public java.lang.String getIsAutomaticLogin(
    ) {
        return this._isAutomaticLogin;
    }

    /**
     * Returns the value of field 'isNewCompany'.
     * 
     * @return the value of field 'IsNewCompany'.
     */
    public java.lang.String getIsNewCompany(
    ) {
        return this._isNewCompany;
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
     * Sets the value of field 'companyFileEventOperation'.
     * 
     * @param companyFileEventOperation the value of field
     * 'companyFileEventOperation'.
     */
    public void setCompanyFileEventOperation(
            final org.chocolate_milk.model.types.CompanyFileEventOperationType companyFileEventOperation) {
        this._companyFileEventOperation = companyFileEventOperation;
    }

    /**
     * Sets the value of field 'isAutomaticLogin'.
     * 
     * @param isAutomaticLogin the value of field 'isAutomaticLogin'
     */
    public void setIsAutomaticLogin(
            final java.lang.String isAutomaticLogin) {
        this._isAutomaticLogin = isAutomaticLogin;
    }

    /**
     * Sets the value of field 'isNewCompany'.
     * 
     * @param isNewCompany the value of field 'isNewCompany'.
     */
    public void setIsNewCompany(
            final java.lang.String isNewCompany) {
        this._isNewCompany = isNewCompany;
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
     * org.chocolate_milk.model.CompanyFileEvent
     */
    public static org.chocolate_milk.model.CompanyFileEvent unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CompanyFileEvent) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CompanyFileEvent.class, reader);
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
