/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CheckModChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CheckModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CheckModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.CheckModChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckModChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.CheckModChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCheckModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCheckModChoiceItem(
            final org.chocolate_milk.model.CheckModChoiceItem vCheckModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vCheckModChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vCheckModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCheckModChoiceItem(
            final int index,
            final org.chocolate_milk.model.CheckModChoiceItem vCheckModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vCheckModChoiceItem);
    }

    /**
     * Method enumerateCheckModChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CheckModChoiceItem> enumerateCheckModChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getCheckModChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CheckModChoiceItem at the given inde
     */
    public org.chocolate_milk.model.CheckModChoiceItem getCheckModChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getCheckModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CheckModChoiceItem) _items.get(index);
    }

    /**
     * Method getCheckModChoiceItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CheckModChoiceItem[] getCheckModChoiceItem(
    ) {
        org.chocolate_milk.model.CheckModChoiceItem[] array = new org.chocolate_milk.model.CheckModChoiceItem[0];
        return (org.chocolate_milk.model.CheckModChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getCheckModChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getCheckModChoiceItemCount(
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
     * Method iterateCheckModChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CheckModChoiceItem> iterateCheckModChoiceItem(
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
    public void removeAllCheckModChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeCheckModChoiceItem.
     * 
     * @param vCheckModChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeCheckModChoiceItem(
            final org.chocolate_milk.model.CheckModChoiceItem vCheckModChoiceItem) {
        boolean removed = _items.remove(vCheckModChoiceItem);
        return removed;
    }

    /**
     * Method removeCheckModChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CheckModChoiceItem removeCheckModChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.CheckModChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCheckModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCheckModChoiceItem(
            final int index,
            final org.chocolate_milk.model.CheckModChoiceItem vCheckModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setCheckModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vCheckModChoiceItem);
    }

    /**
     * 
     * 
     * @param vCheckModChoiceItemArray
     */
    public void setCheckModChoiceItem(
            final org.chocolate_milk.model.CheckModChoiceItem[] vCheckModChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vCheckModChoiceItemArray.length; i++) {
                this._items.add(vCheckModChoiceItemArray[i]);
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
     * org.chocolate_milk.model.CheckModChoice
     */
    public static org.chocolate_milk.model.CheckModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CheckModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CheckModChoice.class, reader);
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
