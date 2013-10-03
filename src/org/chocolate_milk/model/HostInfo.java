/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: HostInfo.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class HostInfo.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class HostInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _productName.
     */
    private java.lang.String _productName;

    /**
     * Field _majorVersion.
     */
    private java.lang.String _majorVersion;

    /**
     * Field _minorVersion.
     */
    private java.lang.String _minorVersion;

    /**
     * Field _country.
     */
    private java.lang.String _country;


      //----------------/
     //- Constructors -/
    //----------------/

    public HostInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'country'.
     * 
     * @return the value of field 'Country'.
     */
    public java.lang.String getCountry(
    ) {
        return this._country;
    }

    /**
     * Returns the value of field 'majorVersion'.
     * 
     * @return the value of field 'MajorVersion'.
     */
    public java.lang.String getMajorVersion(
    ) {
        return this._majorVersion;
    }

    /**
     * Returns the value of field 'minorVersion'.
     * 
     * @return the value of field 'MinorVersion'.
     */
    public java.lang.String getMinorVersion(
    ) {
        return this._minorVersion;
    }

    /**
     * Returns the value of field 'productName'.
     * 
     * @return the value of field 'ProductName'.
     */
    public java.lang.String getProductName(
    ) {
        return this._productName;
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
     * Sets the value of field 'country'.
     * 
     * @param country the value of field 'country'.
     */
    public void setCountry(
            final java.lang.String country) {
        this._country = country;
    }

    /**
     * Sets the value of field 'majorVersion'.
     * 
     * @param majorVersion the value of field 'majorVersion'.
     */
    public void setMajorVersion(
            final java.lang.String majorVersion) {
        this._majorVersion = majorVersion;
    }

    /**
     * Sets the value of field 'minorVersion'.
     * 
     * @param minorVersion the value of field 'minorVersion'.
     */
    public void setMinorVersion(
            final java.lang.String minorVersion) {
        this._minorVersion = minorVersion;
    }

    /**
     * Sets the value of field 'productName'.
     * 
     * @param productName the value of field 'productName'.
     */
    public void setProductName(
            final java.lang.String productName) {
        this._productName = productName;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.HostInfo
     */
    public static org.chocolate_milk.model.HostInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.HostInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.HostInfo.class, reader);
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
