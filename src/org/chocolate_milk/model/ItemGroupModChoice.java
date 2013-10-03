/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemGroupModChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemGroupModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemGroupModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _clearItemsInGroup.
     */
    private java.lang.String _clearItemsInGroup;

    /**
     * Field _itemGroupLineList.
     */
    private java.util.List<org.chocolate_milk.model.ItemGroupLine> _itemGroupLineList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemGroupModChoice() {
        super();
        this._itemGroupLineList = new java.util.ArrayList<org.chocolate_milk.model.ItemGroupLine>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemGroupLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemGroupLine(
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemGroupLineList.add(vItemGroupLine);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemGroupLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemGroupLine(
            final int index,
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemGroupLineList.add(index, vItemGroupLine);
    }

    /**
     * Method enumerateItemGroupLine.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemGroupLine> enumerateItemGroupLine(
    ) {
        return java.util.Collections.enumeration(this._itemGroupLineList);
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
     * Method getItemGroupLine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemGroupLine at the given index
     */
    public org.chocolate_milk.model.ItemGroupLine getItemGroupLine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemGroupLineList.size()) {
            throw new IndexOutOfBoundsException("getItemGroupLine: Index value '" + index + "' not in range [0.." + (this._itemGroupLineList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemGroupLine) _itemGroupLineList.get(index);
    }

    /**
     * Method getItemGroupLine.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemGroupLine[] getItemGroupLine(
    ) {
        org.chocolate_milk.model.ItemGroupLine[] array = new org.chocolate_milk.model.ItemGroupLine[0];
        return (org.chocolate_milk.model.ItemGroupLine[]) this._itemGroupLineList.toArray(array);
    }

    /**
     * Method getItemGroupLineCount.
     * 
     * @return the size of this collection
     */
    public int getItemGroupLineCount(
    ) {
        return this._itemGroupLineList.size();
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
     * Method iterateItemGroupLine.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemGroupLine> iterateItemGroupLine(
    ) {
        return this._itemGroupLineList.iterator();
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
    public void removeAllItemGroupLine(
    ) {
        this._itemGroupLineList.clear();
    }

    /**
     * Method removeItemGroupLine.
     * 
     * @param vItemGroupLine
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemGroupLine(
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine) {
        boolean removed = _itemGroupLineList.remove(vItemGroupLine);
        return removed;
    }

    /**
     * Method removeItemGroupLineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemGroupLine removeItemGroupLineAt(
            final int index) {
        java.lang.Object obj = this._itemGroupLineList.remove(index);
        return (org.chocolate_milk.model.ItemGroupLine) obj;
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
     * @param vItemGroupLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemGroupLine(
            final int index,
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemGroupLineList.size()) {
            throw new IndexOutOfBoundsException("setItemGroupLine: Index value '" + index + "' not in range [0.." + (this._itemGroupLineList.size() - 1) + "]");
        }

        this._itemGroupLineList.set(index, vItemGroupLine);
    }

    /**
     * 
     * 
     * @param vItemGroupLineArray
     */
    public void setItemGroupLine(
            final org.chocolate_milk.model.ItemGroupLine[] vItemGroupLineArray) {
        //-- copy array
        _itemGroupLineList.clear();

        for (int i = 0; i < vItemGroupLineArray.length; i++) {
                this._itemGroupLineList.add(vItemGroupLineArray[i]);
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
     * org.chocolate_milk.model.ItemGroupModChoice
     */
    public static org.chocolate_milk.model.ItemGroupModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemGroupModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemGroupModChoice.class, reader);
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
