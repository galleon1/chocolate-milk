/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxCodeMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxCodeMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesTaxCodeMod implements java.io.Serializable {


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
     * Field _isTaxable.
     */
    private java.lang.String _isTaxable;

    /**
     * Field _desc.
     */
    private java.lang.String _desc;

    /**
     * Field _itemPurchaseTaxRef.
     */
    private org.chocolate_milk.model.ItemPurchaseTaxRef _itemPurchaseTaxRef;

    /**
     * Field _itemSalesTaxRef.
     */
    private org.chocolate_milk.model.ItemSalesTaxRef _itemSalesTaxRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxCodeMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'Desc'.
     */
    public java.lang.String getDesc(
    ) {
        return this._desc;
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
     * Returns the value of field 'isTaxable'.
     * 
     * @return the value of field 'IsTaxable'.
     */
    public java.lang.String getIsTaxable(
    ) {
        return this._isTaxable;
    }

    /**
     * Returns the value of field 'itemPurchaseTaxRef'.
     * 
     * @return the value of field 'ItemPurchaseTaxRef'.
     */
    public org.chocolate_milk.model.ItemPurchaseTaxRef getItemPurchaseTaxRef(
    ) {
        return this._itemPurchaseTaxRef;
    }

    /**
     * Returns the value of field 'itemSalesTaxRef'.
     * 
     * @return the value of field 'ItemSalesTaxRef'.
     */
    public org.chocolate_milk.model.ItemSalesTaxRef getItemSalesTaxRef(
    ) {
        return this._itemSalesTaxRef;
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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(
            final java.lang.String desc) {
        this._desc = desc;
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
     * Sets the value of field 'isTaxable'.
     * 
     * @param isTaxable the value of field 'isTaxable'.
     */
    public void setIsTaxable(
            final java.lang.String isTaxable) {
        this._isTaxable = isTaxable;
    }

    /**
     * Sets the value of field 'itemPurchaseTaxRef'.
     * 
     * @param itemPurchaseTaxRef the value of field
     * 'itemPurchaseTaxRef'.
     */
    public void setItemPurchaseTaxRef(
            final org.chocolate_milk.model.ItemPurchaseTaxRef itemPurchaseTaxRef) {
        this._itemPurchaseTaxRef = itemPurchaseTaxRef;
    }

    /**
     * Sets the value of field 'itemSalesTaxRef'.
     * 
     * @param itemSalesTaxRef the value of field 'itemSalesTaxRef'.
     */
    public void setItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef itemSalesTaxRef) {
        this._itemSalesTaxRef = itemSalesTaxRef;
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
     * org.chocolate_milk.model.SalesTaxCodeMod
     */
    public static org.chocolate_milk.model.SalesTaxCodeMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesTaxCodeMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesTaxCodeMod.class, reader);
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
