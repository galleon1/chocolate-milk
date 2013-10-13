/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SignonDesktopRqType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SignonDesktopRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class SignonDesktopRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _clientDateTime.
     */
    private java.lang.String _clientDateTime;

    /**
     * Field _DLogin.
     */
    private org.chocolate_milk.model.DLogin _DLogin;

    /**
     * Field _installationID.
     */
    private java.lang.String _installationID;

    /**
     * Field _language.
     */
    private java.lang.String _language;

    /**
     * Field _appID.
     */
    private java.lang.String _appID;

    /**
     * Field _appVer.
     */
    private java.lang.String _appVer;


      //----------------/
     //- Constructors -/
    //----------------/

    public SignonDesktopRqType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appID'.
     * 
     * @return the value of field 'AppID'.
     */
    public java.lang.String getAppID(
    ) {
        return this._appID;
    }

    /**
     * Returns the value of field 'appVer'.
     * 
     * @return the value of field 'AppVer'.
     */
    public java.lang.String getAppVer(
    ) {
        return this._appVer;
    }

    /**
     * Returns the value of field 'clientDateTime'.
     * 
     * @return the value of field 'ClientDateTime'.
     */
    public java.lang.String getClientDateTime(
    ) {
        return this._clientDateTime;
    }

    /**
     * Returns the value of field 'DLogin'.
     * 
     * @return the value of field 'DLogin'.
     */
    public org.chocolate_milk.model.DLogin getDLogin(
    ) {
        return this._DLogin;
    }

    /**
     * Returns the value of field 'installationID'.
     * 
     * @return the value of field 'InstallationID'.
     */
    public java.lang.String getInstallationID(
    ) {
        return this._installationID;
    }

    /**
     * Returns the value of field 'language'.
     * 
     * @return the value of field 'Language'.
     */
    public java.lang.String getLanguage(
    ) {
        return this._language;
    }

    /**
     * Returns the value of field 'requestID'.
     * 
     * @return the value of field 'RequestID'.
     */
    public java.lang.String getRequestID(
    ) {
        return this._requestID;
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
     * Sets the value of field 'appID'.
     * 
     * @param appID the value of field 'appID'.
     */
    public void setAppID(
            final java.lang.String appID) {
        this._appID = appID;
    }

    /**
     * Sets the value of field 'appVer'.
     * 
     * @param appVer the value of field 'appVer'.
     */
    public void setAppVer(
            final java.lang.String appVer) {
        this._appVer = appVer;
    }

    /**
     * Sets the value of field 'clientDateTime'.
     * 
     * @param clientDateTime the value of field 'clientDateTime'.
     */
    public void setClientDateTime(
            final java.lang.String clientDateTime) {
        this._clientDateTime = clientDateTime;
    }

    /**
     * Sets the value of field 'DLogin'.
     * 
     * @param DLogin the value of field 'DLogin'.
     */
    public void setDLogin(
            final org.chocolate_milk.model.DLogin DLogin) {
        this._DLogin = DLogin;
    }

    /**
     * Sets the value of field 'installationID'.
     * 
     * @param installationID the value of field 'installationID'.
     */
    public void setInstallationID(
            final java.lang.String installationID) {
        this._installationID = installationID;
    }

    /**
     * Sets the value of field 'language'.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(
            final java.lang.String language) {
        this._language = language;
    }

    /**
     * Sets the value of field 'requestID'.
     * 
     * @param requestID the value of field 'requestID'.
     */
    public void setRequestID(
            final java.lang.String requestID) {
        this._requestID = requestID;
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
