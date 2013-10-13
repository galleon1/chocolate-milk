/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CheckRetChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CheckRetChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CheckRetChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.CheckRetChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckRetChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.CheckRetChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCheckRetChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCheckRetChoiceItem(
            final org.chocolate_milk.model.CheckRetChoiceItem vCheckRetChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vCheckRetChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vCheckRetChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCheckRetChoiceItem(
            final int index,
            final org.chocolate_milk.model.CheckRetChoiceItem vCheckRetChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vCheckRetChoiceItem);
    }

    /**
     * Method enumerateCheckRetChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CheckRetChoiceItem> enumerateCheckRetChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getCheckRetChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CheckRetChoiceItem at the given inde
     */
    public org.chocolate_milk.model.CheckRetChoiceItem getCheckRetChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getCheckRetChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CheckRetChoiceItem) _items.get(index);
    }

    /**
     * Method getCheckRetChoiceItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CheckRetChoiceItem[] getCheckRetChoiceItem(
    ) {
        org.chocolate_milk.model.CheckRetChoiceItem[] array = new org.chocolate_milk.model.CheckRetChoiceItem[0];
        return (org.chocolate_milk.model.CheckRetChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getCheckRetChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getCheckRetChoiceItemCount(
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
     * Method iterateCheckRetChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CheckRetChoiceItem> iterateCheckRetChoiceItem(
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
    public void removeAllCheckRetChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeCheckRetChoiceItem.
     * 
     * @param vCheckRetChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeCheckRetChoiceItem(
            final org.chocolate_milk.model.CheckRetChoiceItem vCheckRetChoiceItem) {
        boolean removed = _items.remove(vCheckRetChoiceItem);
        return removed;
    }

    /**
     * Method removeCheckRetChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CheckRetChoiceItem removeCheckRetChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.CheckRetChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCheckRetChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCheckRetChoiceItem(
            final int index,
            final org.chocolate_milk.model.CheckRetChoiceItem vCheckRetChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setCheckRetChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vCheckRetChoiceItem);
    }

    /**
     * 
     * 
     * @param vCheckRetChoiceItemArray
     */
    public void setCheckRetChoiceItem(
            final org.chocolate_milk.model.CheckRetChoiceItem[] vCheckRetChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vCheckRetChoiceItemArray.length; i++) {
                this._items.add(vCheckRetChoiceItemArray[i]);
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
     * org.chocolate_milk.model.CheckRetChoice
     */
    public static org.chocolate_milk.model.CheckRetChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CheckRetChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CheckRetChoice.class, reader);
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
