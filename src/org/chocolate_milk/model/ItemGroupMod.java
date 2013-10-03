/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemGroupMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemGroupMod implements java.io.Serializable {


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
     * Field _itemDesc.
     */
    private java.lang.String _itemDesc;

    /**
     * Field _unitOfMeasureSetRef.
     */
    private org.chocolate_milk.model.UnitOfMeasureSetRef _unitOfMeasureSetRef;

    /**
     * Field _forceUOMChange.
     */
    private java.lang.String _forceUOMChange;

    /**
     * Field _isPrintItemsInGroup.
     */
    private java.lang.String _isPrintItemsInGroup;

    /**
     * Field _itemGroupModChoice.
     */
    private org.chocolate_milk.model.ItemGroupModChoice _itemGroupModChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemGroupMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'forceUOMChange'.
     * 
     * @return the value of field 'ForceUOMChange'.
     */
    public java.lang.String getForceUOMChange(
    ) {
        return this._forceUOMChange;
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
     * Returns the value of field 'isPrintItemsInGroup'.
     * 
     * @return the value of field 'IsPrintItemsInGroup'.
     */
    public java.lang.String getIsPrintItemsInGroup(
    ) {
        return this._isPrintItemsInGroup;
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
     * Returns the value of field 'itemGroupModChoice'.
     * 
     * @return the value of field 'ItemGroupModChoice'.
     */
    public org.chocolate_milk.model.ItemGroupModChoice getItemGroupModChoice(
    ) {
        return this._itemGroupModChoice;
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
     * Returns the value of field 'unitOfMeasureSetRef'.
     * 
     * @return the value of field 'UnitOfMeasureSetRef'.
     */
    public org.chocolate_milk.model.UnitOfMeasureSetRef getUnitOfMeasureSetRef(
    ) {
        return this._unitOfMeasureSetRef;
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
     * Sets the value of field 'forceUOMChange'.
     * 
     * @param forceUOMChange the value of field 'forceUOMChange'.
     */
    public void setForceUOMChange(
            final java.lang.String forceUOMChange) {
        this._forceUOMChange = forceUOMChange;
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
     * Sets the value of field 'isPrintItemsInGroup'.
     * 
     * @param isPrintItemsInGroup the value of field
     * 'isPrintItemsInGroup'.
     */
    public void setIsPrintItemsInGroup(
            final java.lang.String isPrintItemsInGroup) {
        this._isPrintItemsInGroup = isPrintItemsInGroup;
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
     * Sets the value of field 'itemGroupModChoice'.
     * 
     * @param itemGroupModChoice the value of field
     * 'itemGroupModChoice'.
     */
    public void setItemGroupModChoice(
            final org.chocolate_milk.model.ItemGroupModChoice itemGroupModChoice) {
        this._itemGroupModChoice = itemGroupModChoice;
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
     * Sets the value of field 'unitOfMeasureSetRef'.
     * 
     * @param unitOfMeasureSetRef the value of field
     * 'unitOfMeasureSetRef'.
     */
    public void setUnitOfMeasureSetRef(
            final org.chocolate_milk.model.UnitOfMeasureSetRef unitOfMeasureSetRef) {
        this._unitOfMeasureSetRef = unitOfMeasureSetRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ItemGroupMod
     */
    public static org.chocolate_milk.model.ItemGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemGroupMod.class, reader);
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
