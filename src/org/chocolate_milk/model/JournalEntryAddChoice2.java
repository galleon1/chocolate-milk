/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JournalEntryAddChoice2.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JournalEntryAddChoice2.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class JournalEntryAddChoice2 implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.JournalEntryAddChoice2Item> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public JournalEntryAddChoice2() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.JournalEntryAddChoice2Item>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vJournalEntryAddChoice2Item
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJournalEntryAddChoice2Item(
            final org.chocolate_milk.model.JournalEntryAddChoice2Item vJournalEntryAddChoice2Item)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vJournalEntryAddChoice2Item);
    }

    /**
     * 
     * 
     * @param index
     * @param vJournalEntryAddChoice2Item
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJournalEntryAddChoice2Item(
            final int index,
            final org.chocolate_milk.model.JournalEntryAddChoice2Item vJournalEntryAddChoice2Item)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vJournalEntryAddChoice2Item);
    }

    /**
     * Method enumerateJournalEntryAddChoice2Item.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.JournalEntryAddChoice2Item> enumerateJournalEntryAddChoice2Item(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getJournalEntryAddChoice2Item.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.JournalEntryAddChoice2Item at the
     * given index
     */
    public org.chocolate_milk.model.JournalEntryAddChoice2Item getJournalEntryAddChoice2Item(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getJournalEntryAddChoice2Item: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.JournalEntryAddChoice2Item) _items.get(index);
    }

    /**
     * Method getJournalEntryAddChoice2Item.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.JournalEntryAddChoice2Item[] getJournalEntryAddChoice2Item(
    ) {
        org.chocolate_milk.model.JournalEntryAddChoice2Item[] array = new org.chocolate_milk.model.JournalEntryAddChoice2Item[0];
        return (org.chocolate_milk.model.JournalEntryAddChoice2Item[]) this._items.toArray(array);
    }

    /**
     * Method getJournalEntryAddChoice2ItemCount.
     * 
     * @return the size of this collection
     */
    public int getJournalEntryAddChoice2ItemCount(
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
     * Method iterateJournalEntryAddChoice2Item.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.JournalEntryAddChoice2Item> iterateJournalEntryAddChoice2Item(
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
    public void removeAllJournalEntryAddChoice2Item(
    ) {
        this._items.clear();
    }

    /**
     * Method removeJournalEntryAddChoice2Item.
     * 
     * @param vJournalEntryAddChoice2Item
     * @return true if the object was removed from the collection.
     */
    public boolean removeJournalEntryAddChoice2Item(
            final org.chocolate_milk.model.JournalEntryAddChoice2Item vJournalEntryAddChoice2Item) {
        boolean removed = _items.remove(vJournalEntryAddChoice2Item);
        return removed;
    }

    /**
     * Method removeJournalEntryAddChoice2ItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.JournalEntryAddChoice2Item removeJournalEntryAddChoice2ItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.JournalEntryAddChoice2Item) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vJournalEntryAddChoice2Item
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJournalEntryAddChoice2Item(
            final int index,
            final org.chocolate_milk.model.JournalEntryAddChoice2Item vJournalEntryAddChoice2Item)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setJournalEntryAddChoice2Item: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vJournalEntryAddChoice2Item);
    }

    /**
     * 
     * 
     * @param vJournalEntryAddChoice2ItemArray
     */
    public void setJournalEntryAddChoice2Item(
            final org.chocolate_milk.model.JournalEntryAddChoice2Item[] vJournalEntryAddChoice2ItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vJournalEntryAddChoice2ItemArray.length; i++) {
                this._items.add(vJournalEntryAddChoice2ItemArray[i]);
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
     * org.chocolate_milk.model.JournalEntryAddChoice2
     */
    public static org.chocolate_milk.model.JournalEntryAddChoice2 unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JournalEntryAddChoice2) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JournalEntryAddChoice2.class, reader);
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
