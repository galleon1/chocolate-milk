/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EntityQueryRsTypeChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EntityQueryRsTypeChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EntityQueryRsTypeChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.EntityQueryRsTypeChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityQueryRsTypeChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.EntityQueryRsTypeChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntityQueryRsTypeChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityQueryRsTypeChoiceItem(
            final org.chocolate_milk.model.EntityQueryRsTypeChoiceItem vEntityQueryRsTypeChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vEntityQueryRsTypeChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityQueryRsTypeChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityQueryRsTypeChoiceItem(
            final int index,
            final org.chocolate_milk.model.EntityQueryRsTypeChoiceItem vEntityQueryRsTypeChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vEntityQueryRsTypeChoiceItem);
    }

    /**
     * Method enumerateEntityQueryRsTypeChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.EntityQueryRsTypeChoiceItem> enumerateEntityQueryRsTypeChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getEntityQueryRsTypeChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.EntityQueryRsTypeChoiceItem at the
     * given index
     */
    public org.chocolate_milk.model.EntityQueryRsTypeChoiceItem getEntityQueryRsTypeChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getEntityQueryRsTypeChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.EntityQueryRsTypeChoiceItem) _items.get(index);
    }

    /**
     * Method getEntityQueryRsTypeChoiceItem.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.EntityQueryRsTypeChoiceItem[] getEntityQueryRsTypeChoiceItem(
    ) {
        org.chocolate_milk.model.EntityQueryRsTypeChoiceItem[] array = new org.chocolate_milk.model.EntityQueryRsTypeChoiceItem[0];
        return (org.chocolate_milk.model.EntityQueryRsTypeChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getEntityQueryRsTypeChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getEntityQueryRsTypeChoiceItemCount(
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
     * Method iterateEntityQueryRsTypeChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.EntityQueryRsTypeChoiceItem> iterateEntityQueryRsTypeChoiceItem(
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
    public void removeAllEntityQueryRsTypeChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeEntityQueryRsTypeChoiceItem.
     * 
     * @param vEntityQueryRsTypeChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntityQueryRsTypeChoiceItem(
            final org.chocolate_milk.model.EntityQueryRsTypeChoiceItem vEntityQueryRsTypeChoiceItem) {
        boolean removed = _items.remove(vEntityQueryRsTypeChoiceItem);
        return removed;
    }

    /**
     * Method removeEntityQueryRsTypeChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.EntityQueryRsTypeChoiceItem removeEntityQueryRsTypeChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.EntityQueryRsTypeChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityQueryRsTypeChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntityQueryRsTypeChoiceItem(
            final int index,
            final org.chocolate_milk.model.EntityQueryRsTypeChoiceItem vEntityQueryRsTypeChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setEntityQueryRsTypeChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vEntityQueryRsTypeChoiceItem);
    }

    /**
     * 
     * 
     * @param vEntityQueryRsTypeChoiceItemArray
     */
    public void setEntityQueryRsTypeChoiceItem(
            final org.chocolate_milk.model.EntityQueryRsTypeChoiceItem[] vEntityQueryRsTypeChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vEntityQueryRsTypeChoiceItemArray.length; i++) {
                this._items.add(vEntityQueryRsTypeChoiceItemArray[i]);
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
     * org.chocolate_milk.model.EntityQueryRsTypeChoice
     */
    public static org.chocolate_milk.model.EntityQueryRsTypeChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EntityQueryRsTypeChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EntityQueryRsTypeChoice.class, reader);
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
