/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: COMCallbackInfo.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class COMCallbackInfo.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class COMCallbackInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _appName.
     */
    private java.lang.String _appName;

    /**
     * Field _COMCallbackInfoChoice.
     */
    private org.chocolate_milk.model.COMCallbackInfoChoice _COMCallbackInfoChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public COMCallbackInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appName'.
     * 
     * @return the value of field 'AppName'.
     */
    public java.lang.String getAppName(
    ) {
        return this._appName;
    }

    /**
     * Returns the value of field 'COMCallbackInfoChoice'.
     * 
     * @return the value of field 'COMCallbackInfoChoice'.
     */
    public org.chocolate_milk.model.COMCallbackInfoChoice getCOMCallbackInfoChoice(
    ) {
        return this._COMCallbackInfoChoice;
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
     * Sets the value of field 'appName'.
     * 
     * @param appName the value of field 'appName'.
     */
    public void setAppName(
            final java.lang.String appName) {
        this._appName = appName;
    }

    /**
     * Sets the value of field 'COMCallbackInfoChoice'.
     * 
     * @param COMCallbackInfoChoice the value of field
     * 'COMCallbackInfoChoice'.
     */
    public void setCOMCallbackInfoChoice(
            final org.chocolate_milk.model.COMCallbackInfoChoice COMCallbackInfoChoice) {
        this._COMCallbackInfoChoice = COMCallbackInfoChoice;
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
     * org.chocolate_milk.model.COMCallbackInfo
     */
    public static org.chocolate_milk.model.COMCallbackInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.COMCallbackInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.COMCallbackInfo.class, reader);
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
