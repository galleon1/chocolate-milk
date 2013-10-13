/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EstimateAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.EstimateAddChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateAddChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.EstimateAddChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEstimateAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateAddChoiceItem(
            final org.chocolate_milk.model.EstimateAddChoiceItem vEstimateAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vEstimateAddChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.EstimateAddChoiceItem vEstimateAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vEstimateAddChoiceItem);
    }

    /**
     * Method enumerateEstimateAddChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.EstimateAddChoiceItem> enumerateEstimateAddChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getEstimateAddChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.EstimateAddChoiceItem at the given
     * index
     */
    public org.chocolate_milk.model.EstimateAddChoiceItem getEstimateAddChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getEstimateAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.EstimateAddChoiceItem) _items.get(index);
    }

    /**
     * Method getEstimateAddChoiceItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.EstimateAddChoiceItem[] getEstimateAddChoiceItem(
    ) {
        org.chocolate_milk.model.EstimateAddChoiceItem[] array = new org.chocolate_milk.model.EstimateAddChoiceItem[0];
        return (org.chocolate_milk.model.EstimateAddChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getEstimateAddChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getEstimateAddChoiceItemCount(
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
     * Method iterateEstimateAddChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.EstimateAddChoiceItem> iterateEstimateAddChoiceItem(
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
    public void removeAllEstimateAddChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeEstimateAddChoiceItem.
     * 
     * @param vEstimateAddChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeEstimateAddChoiceItem(
            final org.chocolate_milk.model.EstimateAddChoiceItem vEstimateAddChoiceItem) {
        boolean removed = _items.remove(vEstimateAddChoiceItem);
        return removed;
    }

    /**
     * Method removeEstimateAddChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.EstimateAddChoiceItem removeEstimateAddChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.EstimateAddChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEstimateAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.EstimateAddChoiceItem vEstimateAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setEstimateAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vEstimateAddChoiceItem);
    }

    /**
     * 
     * 
     * @param vEstimateAddChoiceItemArray
     */
    public void setEstimateAddChoiceItem(
            final org.chocolate_milk.model.EstimateAddChoiceItem[] vEstimateAddChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vEstimateAddChoiceItemArray.length; i++) {
                this._items.add(vEstimateAddChoiceItemArray[i]);
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
     * org.chocolate_milk.model.EstimateAddChoice
     */
    public static org.chocolate_milk.model.EstimateAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateAddChoice.class, reader);
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
