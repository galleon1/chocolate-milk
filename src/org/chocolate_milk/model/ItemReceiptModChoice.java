/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemReceiptModChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemReceiptModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemReceiptModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.ItemReceiptModChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemReceiptModChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.ItemReceiptModChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemReceiptModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemReceiptModChoiceItem(
            final org.chocolate_milk.model.ItemReceiptModChoiceItem vItemReceiptModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vItemReceiptModChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemReceiptModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemReceiptModChoiceItem(
            final int index,
            final org.chocolate_milk.model.ItemReceiptModChoiceItem vItemReceiptModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vItemReceiptModChoiceItem);
    }

    /**
     * Method enumerateItemReceiptModChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemReceiptModChoiceItem> enumerateItemReceiptModChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getItemReceiptModChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemReceiptModChoiceItem at the
     * given index
     */
    public org.chocolate_milk.model.ItemReceiptModChoiceItem getItemReceiptModChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getItemReceiptModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemReceiptModChoiceItem) _items.get(index);
    }

    /**
     * Method getItemReceiptModChoiceItem.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemReceiptModChoiceItem[] getItemReceiptModChoiceItem(
    ) {
        org.chocolate_milk.model.ItemReceiptModChoiceItem[] array = new org.chocolate_milk.model.ItemReceiptModChoiceItem[0];
        return (org.chocolate_milk.model.ItemReceiptModChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getItemReceiptModChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getItemReceiptModChoiceItemCount(
    ) {
        return this._items.size();
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
     * Method iterateItemReceiptModChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemReceiptModChoiceItem> iterateItemReceiptModChoiceItem(
    ) {
        return this._items.iterator();
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
    public void removeAllItemReceiptModChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeItemReceiptModChoiceItem.
     * 
     * @param vItemReceiptModChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemReceiptModChoiceItem(
            final org.chocolate_milk.model.ItemReceiptModChoiceItem vItemReceiptModChoiceItem) {
        boolean removed = _items.remove(vItemReceiptModChoiceItem);
        return removed;
    }

    /**
     * Method removeItemReceiptModChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemReceiptModChoiceItem removeItemReceiptModChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.ItemReceiptModChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vItemReceiptModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemReceiptModChoiceItem(
            final int index,
            final org.chocolate_milk.model.ItemReceiptModChoiceItem vItemReceiptModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setItemReceiptModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vItemReceiptModChoiceItem);
    }

    /**
     * 
     * 
     * @param vItemReceiptModChoiceItemArray
     */
    public void setItemReceiptModChoiceItem(
            final org.chocolate_milk.model.ItemReceiptModChoiceItem[] vItemReceiptModChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vItemReceiptModChoiceItemArray.length; i++) {
                this._items.add(vItemReceiptModChoiceItemArray[i]);
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
     * org.chocolate_milk.model.ItemReceiptModChoice
     */
    public static org.chocolate_milk.model.ItemReceiptModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemReceiptModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemReceiptModChoice.class, reader);
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
