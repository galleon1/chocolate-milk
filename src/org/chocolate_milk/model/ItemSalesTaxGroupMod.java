/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemSalesTaxGroupMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemSalesTaxGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ItemSalesTaxGroupMod implements java.io.Serializable {


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
     * Field _itemSalesTaxRefList.
     */
    private java.util.List<org.chocolate_milk.model.ItemSalesTaxRef> _itemSalesTaxRefList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemSalesTaxGroupMod() {
        super();
        this._itemSalesTaxRefList = new java.util.ArrayList<org.chocolate_milk.model.ItemSalesTaxRef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemSalesTaxRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef vItemSalesTaxRef)
    throws java.lang.IndexOutOfBoundsException {
        this._itemSalesTaxRefList.add(vItemSalesTaxRef);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemSalesTaxRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemSalesTaxRef(
            final int index,
            final org.chocolate_milk.model.ItemSalesTaxRef vItemSalesTaxRef)
    throws java.lang.IndexOutOfBoundsException {
        this._itemSalesTaxRefList.add(index, vItemSalesTaxRef);
    }

    /**
     * Method enumerateItemSalesTaxRef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemSalesTaxRef> enumerateItemSalesTaxRef(
    ) {
        return java.util.Collections.enumeration(this._itemSalesTaxRefList);
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
     * Method getItemSalesTaxRef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemSalesTaxRef at the given index
     */
    public org.chocolate_milk.model.ItemSalesTaxRef getItemSalesTaxRef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemSalesTaxRefList.size()) {
            throw new IndexOutOfBoundsException("getItemSalesTaxRef: Index value '" + index + "' not in range [0.." + (this._itemSalesTaxRefList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemSalesTaxRef) _itemSalesTaxRefList.get(index);
    }

    /**
     * Method getItemSalesTaxRef.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemSalesTaxRef[] getItemSalesTaxRef(
    ) {
        org.chocolate_milk.model.ItemSalesTaxRef[] array = new org.chocolate_milk.model.ItemSalesTaxRef[0];
        return (org.chocolate_milk.model.ItemSalesTaxRef[]) this._itemSalesTaxRefList.toArray(array);
    }

    /**
     * Method getItemSalesTaxRefCount.
     * 
     * @return the size of this collection
     */
    public int getItemSalesTaxRefCount(
    ) {
        return this._itemSalesTaxRefList.size();
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
     * Method iterateItemSalesTaxRef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemSalesTaxRef> iterateItemSalesTaxRef(
    ) {
        return this._itemSalesTaxRefList.iterator();
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
     */
    public void removeAllItemSalesTaxRef(
    ) {
        this._itemSalesTaxRefList.clear();
    }

    /**
     * Method removeItemSalesTaxRef.
     * 
     * @param vItemSalesTaxRef
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef vItemSalesTaxRef) {
        boolean removed = _itemSalesTaxRefList.remove(vItemSalesTaxRef);
        return removed;
    }

    /**
     * Method removeItemSalesTaxRefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemSalesTaxRef removeItemSalesTaxRefAt(
            final int index) {
        java.lang.Object obj = this._itemSalesTaxRefList.remove(index);
        return (org.chocolate_milk.model.ItemSalesTaxRef) obj;
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
     * 
     * 
     * @param index
     * @param vItemSalesTaxRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemSalesTaxRef(
            final int index,
            final org.chocolate_milk.model.ItemSalesTaxRef vItemSalesTaxRef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemSalesTaxRefList.size()) {
            throw new IndexOutOfBoundsException("setItemSalesTaxRef: Index value '" + index + "' not in range [0.." + (this._itemSalesTaxRefList.size() - 1) + "]");
        }

        this._itemSalesTaxRefList.set(index, vItemSalesTaxRef);
    }

    /**
     * 
     * 
     * @param vItemSalesTaxRefArray
     */
    public void setItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef[] vItemSalesTaxRefArray) {
        //-- copy array
        _itemSalesTaxRefList.clear();

        for (int i = 0; i < vItemSalesTaxRefArray.length; i++) {
                this._itemSalesTaxRefList.add(vItemSalesTaxRefArray[i]);
        }
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
     * org.chocolate_milk.model.ItemSalesTaxGroupMod
     */
    public static org.chocolate_milk.model.ItemSalesTaxGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemSalesTaxGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemSalesTaxGroupMod.class, reader);
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
