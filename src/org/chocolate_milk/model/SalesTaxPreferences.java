/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxPreferences.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxPreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesTaxPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultItemSalesTaxRef.
     */
    private org.chocolate_milk.model.DefaultItemSalesTaxRef _defaultItemSalesTaxRef;

    /**
     * Field _paySalesTax.
     */
    private org.chocolate_milk.model.types.PaySalesTaxType _paySalesTax;

    /**
     * Field _defaultTaxableSalesTaxCodeRef.
     */
    private org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef _defaultTaxableSalesTaxCodeRef;

    /**
     * Field _defaultNonTaxableSalesTaxCodeRef.
     */
    private org.chocolate_milk.model.DefaultNonTaxableSalesTaxCodeRef _defaultNonTaxableSalesTaxCodeRef;

    /**
     * Field _isUsingVendorTaxCode.
     */
    private java.lang.String _isUsingVendorTaxCode;

    /**
     * Field _isUsingCustomerTaxCode.
     */
    private java.lang.String _isUsingCustomerTaxCode;

    /**
     * Field _isUsingAmountsIncludeTax.
     */
    private java.lang.String _isUsingAmountsIncludeTax;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'defaultItemSalesTaxRef'.
     * 
     * @return the value of field 'DefaultItemSalesTaxRef'.
     */
    public org.chocolate_milk.model.DefaultItemSalesTaxRef getDefaultItemSalesTaxRef(
    ) {
        return this._defaultItemSalesTaxRef;
    }

    /**
     * Returns the value of field
     * 'defaultNonTaxableSalesTaxCodeRef'.
     * 
     * @return the value of field 'DefaultNonTaxableSalesTaxCodeRef'
     */
    public org.chocolate_milk.model.DefaultNonTaxableSalesTaxCodeRef getDefaultNonTaxableSalesTaxCodeRef(
    ) {
        return this._defaultNonTaxableSalesTaxCodeRef;
    }

    /**
     * Returns the value of field 'defaultTaxableSalesTaxCodeRef'.
     * 
     * @return the value of field 'DefaultTaxableSalesTaxCodeRef'.
     */
    public org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef getDefaultTaxableSalesTaxCodeRef(
    ) {
        return this._defaultTaxableSalesTaxCodeRef;
    }

    /**
     * Returns the value of field 'isUsingAmountsIncludeTax'.
     * 
     * @return the value of field 'IsUsingAmountsIncludeTax'.
     */
    public java.lang.String getIsUsingAmountsIncludeTax(
    ) {
        return this._isUsingAmountsIncludeTax;
    }

    /**
     * Returns the value of field 'isUsingCustomerTaxCode'.
     * 
     * @return the value of field 'IsUsingCustomerTaxCode'.
     */
    public java.lang.String getIsUsingCustomerTaxCode(
    ) {
        return this._isUsingCustomerTaxCode;
    }

    /**
     * Returns the value of field 'isUsingVendorTaxCode'.
     * 
     * @return the value of field 'IsUsingVendorTaxCode'.
     */
    public java.lang.String getIsUsingVendorTaxCode(
    ) {
        return this._isUsingVendorTaxCode;
    }

    /**
     * Returns the value of field 'paySalesTax'.
     * 
     * @return the value of field 'PaySalesTax'.
     */
    public org.chocolate_milk.model.types.PaySalesTaxType getPaySalesTax(
    ) {
        return this._paySalesTax;
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
     * Sets the value of field 'defaultItemSalesTaxRef'.
     * 
     * @param defaultItemSalesTaxRef the value of field
     * 'defaultItemSalesTaxRef'.
     */
    public void setDefaultItemSalesTaxRef(
            final org.chocolate_milk.model.DefaultItemSalesTaxRef defaultItemSalesTaxRef) {
        this._defaultItemSalesTaxRef = defaultItemSalesTaxRef;
    }

    /**
     * Sets the value of field 'defaultNonTaxableSalesTaxCodeRef'.
     * 
     * @param defaultNonTaxableSalesTaxCodeRef the value of field
     * 'defaultNonTaxableSalesTaxCodeRef'.
     */
    public void setDefaultNonTaxableSalesTaxCodeRef(
            final org.chocolate_milk.model.DefaultNonTaxableSalesTaxCodeRef defaultNonTaxableSalesTaxCodeRef) {
        this._defaultNonTaxableSalesTaxCodeRef = defaultNonTaxableSalesTaxCodeRef;
    }

    /**
     * Sets the value of field 'defaultTaxableSalesTaxCodeRef'.
     * 
     * @param defaultTaxableSalesTaxCodeRef the value of field
     * 'defaultTaxableSalesTaxCodeRef'.
     */
    public void setDefaultTaxableSalesTaxCodeRef(
            final org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef defaultTaxableSalesTaxCodeRef) {
        this._defaultTaxableSalesTaxCodeRef = defaultTaxableSalesTaxCodeRef;
    }

    /**
     * Sets the value of field 'isUsingAmountsIncludeTax'.
     * 
     * @param isUsingAmountsIncludeTax the value of field
     * 'isUsingAmountsIncludeTax'.
     */
    public void setIsUsingAmountsIncludeTax(
            final java.lang.String isUsingAmountsIncludeTax) {
        this._isUsingAmountsIncludeTax = isUsingAmountsIncludeTax;
    }

    /**
     * Sets the value of field 'isUsingCustomerTaxCode'.
     * 
     * @param isUsingCustomerTaxCode the value of field
     * 'isUsingCustomerTaxCode'.
     */
    public void setIsUsingCustomerTaxCode(
            final java.lang.String isUsingCustomerTaxCode) {
        this._isUsingCustomerTaxCode = isUsingCustomerTaxCode;
    }

    /**
     * Sets the value of field 'isUsingVendorTaxCode'.
     * 
     * @param isUsingVendorTaxCode the value of field
     * 'isUsingVendorTaxCode'.
     */
    public void setIsUsingVendorTaxCode(
            final java.lang.String isUsingVendorTaxCode) {
        this._isUsingVendorTaxCode = isUsingVendorTaxCode;
    }

    /**
     * Sets the value of field 'paySalesTax'.
     * 
     * @param paySalesTax the value of field 'paySalesTax'.
     */
    public void setPaySalesTax(
            final org.chocolate_milk.model.types.PaySalesTaxType paySalesTax) {
        this._paySalesTax = paySalesTax;
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
     * org.chocolate_milk.model.SalesTaxPreferences
     */
    public static org.chocolate_milk.model.SalesTaxPreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesTaxPreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesTaxPreferences.class, reader);
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
