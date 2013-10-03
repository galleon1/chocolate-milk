/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemInventoryAssemblyModChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemInventoryAssemblyModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemInventoryAssemblyModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _clearItemsInGroup.
     */
    private java.lang.String _clearItemsInGroup;

    /**
     * Field _itemInventoryAssemblyLineList.
     */
    private java.util.List<org.chocolate_milk.model.ItemInventoryAssemblyLine> _itemInventoryAssemblyLineList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemInventoryAssemblyModChoice() {
        super();
        this._itemInventoryAssemblyLineList = new java.util.ArrayList<org.chocolate_milk.model.ItemInventoryAssemblyLine>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemInventoryAssemblyLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemInventoryAssemblyLine(
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemInventoryAssemblyLineList.add(vItemInventoryAssemblyLine);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemInventoryAssemblyLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemInventoryAssemblyLine(
            final int index,
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemInventoryAssemblyLineList.add(index, vItemInventoryAssemblyLine);
    }

    /**
     * Method enumerateItemInventoryAssemblyLine.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemInventoryAssemblyLine> enumerateItemInventoryAssemblyLine(
    ) {
        return java.util.Collections.enumeration(this._itemInventoryAssemblyLineList);
    }

    /**
     * Returns the value of field 'clearItemsInGroup'.
     * 
     * @return the value of field 'ClearItemsInGroup'.
     */
    public java.lang.String getClearItemsInGroup(
    ) {
        return this._clearItemsInGroup;
    }

    /**
     * Method getItemInventoryAssemblyLine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemInventoryAssemblyLine at the
     * given index
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyLine getItemInventoryAssemblyLine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemInventoryAssemblyLineList.size()) {
            throw new IndexOutOfBoundsException("getItemInventoryAssemblyLine: Index value '" + index + "' not in range [0.." + (this._itemInventoryAssemblyLineList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemInventoryAssemblyLine) _itemInventoryAssemblyLineList.get(index);
    }

    /**
     * Method getItemInventoryAssemblyLine.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyLine[] getItemInventoryAssemblyLine(
    ) {
        org.chocolate_milk.model.ItemInventoryAssemblyLine[] array = new org.chocolate_milk.model.ItemInventoryAssemblyLine[0];
        return (org.chocolate_milk.model.ItemInventoryAssemblyLine[]) this._itemInventoryAssemblyLineList.toArray(array);
    }

    /**
     * Method getItemInventoryAssemblyLineCount.
     * 
     * @return the size of this collection
     */
    public int getItemInventoryAssemblyLineCount(
    ) {
        return this._itemInventoryAssemblyLineList.size();
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
     * Method iterateItemInventoryAssemblyLine.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemInventoryAssemblyLine> iterateItemInventoryAssemblyLine(
    ) {
        return this._itemInventoryAssemblyLineList.iterator();
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
    public void removeAllItemInventoryAssemblyLine(
    ) {
        this._itemInventoryAssemblyLineList.clear();
    }

    /**
     * Method removeItemInventoryAssemblyLine.
     * 
     * @param vItemInventoryAssemblyLine
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemInventoryAssemblyLine(
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine) {
        boolean removed = _itemInventoryAssemblyLineList.remove(vItemInventoryAssemblyLine);
        return removed;
    }

    /**
     * Method removeItemInventoryAssemblyLineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyLine removeItemInventoryAssemblyLineAt(
            final int index) {
        java.lang.Object obj = this._itemInventoryAssemblyLineList.remove(index);
        return (org.chocolate_milk.model.ItemInventoryAssemblyLine) obj;
    }

    /**
     * Sets the value of field 'clearItemsInGroup'.
     * 
     * @param clearItemsInGroup the value of field
     * 'clearItemsInGroup'.
     */
    public void setClearItemsInGroup(
            final java.lang.String clearItemsInGroup) {
        this._clearItemsInGroup = clearItemsInGroup;
    }

    /**
     * 
     * 
     * @param index
     * @param vItemInventoryAssemblyLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemInventoryAssemblyLine(
            final int index,
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemInventoryAssemblyLineList.size()) {
            throw new IndexOutOfBoundsException("setItemInventoryAssemblyLine: Index value '" + index + "' not in range [0.." + (this._itemInventoryAssemblyLineList.size() - 1) + "]");
        }

        this._itemInventoryAssemblyLineList.set(index, vItemInventoryAssemblyLine);
    }

    /**
     * 
     * 
     * @param vItemInventoryAssemblyLineArray
     */
    public void setItemInventoryAssemblyLine(
            final org.chocolate_milk.model.ItemInventoryAssemblyLine[] vItemInventoryAssemblyLineArray) {
        //-- copy array
        _itemInventoryAssemblyLineList.clear();

        for (int i = 0; i < vItemInventoryAssemblyLineArray.length; i++) {
                this._itemInventoryAssemblyLineList.add(vItemInventoryAssemblyLineArray[i]);
        }
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
     * org.chocolate_milk.model.ItemInventoryAssemblyModChoice
     */
    public static org.chocolate_milk.model.ItemInventoryAssemblyModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemInventoryAssemblyModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemInventoryAssemblyModChoice.class, reader);
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
