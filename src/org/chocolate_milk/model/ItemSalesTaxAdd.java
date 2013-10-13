/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemSalesTaxAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemSalesTaxAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemSalesTaxAdd implements java.io.Serializable {


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
     * Field _itemDesc.
     */
    private java.lang.String _itemDesc;

    /**
     * Field _taxRate.
     */
    private java.lang.String _taxRate;

    /**
     * Field _taxVendorRef.
     */
    private org.chocolate_milk.model.TaxVendorRef _taxVendorRef;

    /**
     * Field _salesTaxReturnLineRef.
     */
    private org.chocolate_milk.model.SalesTaxReturnLineRef _salesTaxReturnLineRef;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemSalesTaxAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'itemDesc'.
     * 
     * @return the value of field 'ItemDesc'.
     */
    public java.lang.String getItemDesc(
    ) {
        return this._itemDesc;
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
     * Returns the value of field 'salesTaxReturnLineRef'.
     * 
     * @return the value of field 'SalesTaxReturnLineRef'.
     */
    public org.chocolate_milk.model.SalesTaxReturnLineRef getSalesTaxReturnLineRef(
    ) {
        return this._salesTaxReturnLineRef;
    }

    /**
     * Returns the value of field 'taxRate'.
     * 
     * @return the value of field 'TaxRate'.
     */
    public java.lang.String getTaxRate(
    ) {
        return this._taxRate;
    }

    /**
     * Returns the value of field 'taxVendorRef'.
     * 
     * @return the value of field 'TaxVendorRef'.
     */
    public org.chocolate_milk.model.TaxVendorRef getTaxVendorRef(
    ) {
        return this._taxVendorRef;
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
     * Sets the value of field 'externalGUID'.
     * 
     * @param externalGUID the value of field 'externalGUID'.
     */
    public void setExternalGUID(
            final java.lang.String externalGUID) {
        this._externalGUID = externalGUID;
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
     * Sets the value of field 'itemDesc'.
     * 
     * @param itemDesc the value of field 'itemDesc'.
     */
    public void setItemDesc(
            final java.lang.String itemDesc) {
        this._itemDesc = itemDesc;
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
     * Sets the value of field 'salesTaxReturnLineRef'.
     * 
     * @param salesTaxReturnLineRef the value of field
     * 'salesTaxReturnLineRef'.
     */
    public void setSalesTaxReturnLineRef(
            final org.chocolate_milk.model.SalesTaxReturnLineRef salesTaxReturnLineRef) {
        this._salesTaxReturnLineRef = salesTaxReturnLineRef;
    }

    /**
     * Sets the value of field 'taxRate'.
     * 
     * @param taxRate the value of field 'taxRate'.
     */
    public void setTaxRate(
            final java.lang.String taxRate) {
        this._taxRate = taxRate;
    }

    /**
     * Sets the value of field 'taxVendorRef'.
     * 
     * @param taxVendorRef the value of field 'taxVendorRef'.
     */
    public void setTaxVendorRef(
            final org.chocolate_milk.model.TaxVendorRef taxVendorRef) {
        this._taxVendorRef = taxVendorRef;
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
     * org.chocolate_milk.model.ItemSalesTaxAdd
     */
    public static org.chocolate_milk.model.ItemSalesTaxAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemSalesTaxAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemSalesTaxAdd.class, reader);
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
