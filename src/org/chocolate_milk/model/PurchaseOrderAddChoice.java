/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PurchaseOrderAddChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PurchaseOrderAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PurchaseOrderAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.PurchaseOrderAddChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public PurchaseOrderAddChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.PurchaseOrderAddChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPurchaseOrderAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPurchaseOrderAddChoiceItem(
            final org.chocolate_milk.model.PurchaseOrderAddChoiceItem vPurchaseOrderAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vPurchaseOrderAddChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vPurchaseOrderAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPurchaseOrderAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.PurchaseOrderAddChoiceItem vPurchaseOrderAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vPurchaseOrderAddChoiceItem);
    }

    /**
     * Method enumeratePurchaseOrderAddChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.PurchaseOrderAddChoiceItem> enumeratePurchaseOrderAddChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getPurchaseOrderAddChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.PurchaseOrderAddChoiceItem at the
     * given index
     */
    public org.chocolate_milk.model.PurchaseOrderAddChoiceItem getPurchaseOrderAddChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getPurchaseOrderAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.PurchaseOrderAddChoiceItem) _items.get(index);
    }

    /**
     * Method getPurchaseOrderAddChoiceItem.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.PurchaseOrderAddChoiceItem[] getPurchaseOrderAddChoiceItem(
    ) {
        org.chocolate_milk.model.PurchaseOrderAddChoiceItem[] array = new org.chocolate_milk.model.PurchaseOrderAddChoiceItem[0];
        return (org.chocolate_milk.model.PurchaseOrderAddChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getPurchaseOrderAddChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getPurchaseOrderAddChoiceItemCount(
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
     * Method iteratePurchaseOrderAddChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.PurchaseOrderAddChoiceItem> iteratePurchaseOrderAddChoiceItem(
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
    public void removeAllPurchaseOrderAddChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removePurchaseOrderAddChoiceItem.
     * 
     * @param vPurchaseOrderAddChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removePurchaseOrderAddChoiceItem(
            final org.chocolate_milk.model.PurchaseOrderAddChoiceItem vPurchaseOrderAddChoiceItem) {
        boolean removed = _items.remove(vPurchaseOrderAddChoiceItem);
        return removed;
    }

    /**
     * Method removePurchaseOrderAddChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.PurchaseOrderAddChoiceItem removePurchaseOrderAddChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.PurchaseOrderAddChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vPurchaseOrderAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPurchaseOrderAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.PurchaseOrderAddChoiceItem vPurchaseOrderAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setPurchaseOrderAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vPurchaseOrderAddChoiceItem);
    }

    /**
     * 
     * 
     * @param vPurchaseOrderAddChoiceItemArray
     */
    public void setPurchaseOrderAddChoiceItem(
            final org.chocolate_milk.model.PurchaseOrderAddChoiceItem[] vPurchaseOrderAddChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vPurchaseOrderAddChoiceItemArray.length; i++) {
                this._items.add(vPurchaseOrderAddChoiceItemArray[i]);
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
     * org.chocolate_milk.model.PurchaseOrderAddChoice
     */
    public static org.chocolate_milk.model.PurchaseOrderAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PurchaseOrderAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PurchaseOrderAddChoice.class, reader);
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
