/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VendorCreditAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VendorCreditAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class VendorCreditAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.VendorCreditAddChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public VendorCreditAddChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.VendorCreditAddChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vVendorCreditAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVendorCreditAddChoiceItem(
            final org.chocolate_milk.model.VendorCreditAddChoiceItem vVendorCreditAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vVendorCreditAddChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vVendorCreditAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVendorCreditAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.VendorCreditAddChoiceItem vVendorCreditAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vVendorCreditAddChoiceItem);
    }

    /**
     * Method enumerateVendorCreditAddChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.VendorCreditAddChoiceItem> enumerateVendorCreditAddChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getVendorCreditAddChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.VendorCreditAddChoiceItem at the
     * given index
     */
    public org.chocolate_milk.model.VendorCreditAddChoiceItem getVendorCreditAddChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getVendorCreditAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.VendorCreditAddChoiceItem) _items.get(index);
    }

    /**
     * Method getVendorCreditAddChoiceItem.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.VendorCreditAddChoiceItem[] getVendorCreditAddChoiceItem(
    ) {
        org.chocolate_milk.model.VendorCreditAddChoiceItem[] array = new org.chocolate_milk.model.VendorCreditAddChoiceItem[0];
        return (org.chocolate_milk.model.VendorCreditAddChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getVendorCreditAddChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getVendorCreditAddChoiceItemCount(
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
     * Method iterateVendorCreditAddChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.VendorCreditAddChoiceItem> iterateVendorCreditAddChoiceItem(
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
    public void removeAllVendorCreditAddChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeVendorCreditAddChoiceItem.
     * 
     * @param vVendorCreditAddChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeVendorCreditAddChoiceItem(
            final org.chocolate_milk.model.VendorCreditAddChoiceItem vVendorCreditAddChoiceItem) {
        boolean removed = _items.remove(vVendorCreditAddChoiceItem);
        return removed;
    }

    /**
     * Method removeVendorCreditAddChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.VendorCreditAddChoiceItem removeVendorCreditAddChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.VendorCreditAddChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vVendorCreditAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setVendorCreditAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.VendorCreditAddChoiceItem vVendorCreditAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setVendorCreditAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vVendorCreditAddChoiceItem);
    }

    /**
     * 
     * 
     * @param vVendorCreditAddChoiceItemArray
     */
    public void setVendorCreditAddChoiceItem(
            final org.chocolate_milk.model.VendorCreditAddChoiceItem[] vVendorCreditAddChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vVendorCreditAddChoiceItemArray.length; i++) {
                this._items.add(vVendorCreditAddChoiceItemArray[i]);
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
     * org.chocolate_milk.model.VendorCreditAddChoice
     */
    public static org.chocolate_milk.model.VendorCreditAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VendorCreditAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VendorCreditAddChoice.class, reader);
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
