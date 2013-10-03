/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillModChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class BillModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.BillModChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillModChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.BillModChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBillModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillModChoiceItem(
            final org.chocolate_milk.model.BillModChoiceItem vBillModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vBillModChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vBillModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillModChoiceItem(
            final int index,
            final org.chocolate_milk.model.BillModChoiceItem vBillModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vBillModChoiceItem);
    }

    /**
     * Method enumerateBillModChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.BillModChoiceItem> enumerateBillModChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getBillModChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.BillModChoiceItem at the given index
     */
    public org.chocolate_milk.model.BillModChoiceItem getBillModChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getBillModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.BillModChoiceItem) _items.get(index);
    }

    /**
     * Method getBillModChoiceItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.BillModChoiceItem[] getBillModChoiceItem(
    ) {
        org.chocolate_milk.model.BillModChoiceItem[] array = new org.chocolate_milk.model.BillModChoiceItem[0];
        return (org.chocolate_milk.model.BillModChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getBillModChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getBillModChoiceItemCount(
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
     * Method iterateBillModChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.BillModChoiceItem> iterateBillModChoiceItem(
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
    public void removeAllBillModChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeBillModChoiceItem.
     * 
     * @param vBillModChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeBillModChoiceItem(
            final org.chocolate_milk.model.BillModChoiceItem vBillModChoiceItem) {
        boolean removed = _items.remove(vBillModChoiceItem);
        return removed;
    }

    /**
     * Method removeBillModChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.BillModChoiceItem removeBillModChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.BillModChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBillModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBillModChoiceItem(
            final int index,
            final org.chocolate_milk.model.BillModChoiceItem vBillModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setBillModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vBillModChoiceItem);
    }

    /**
     * 
     * 
     * @param vBillModChoiceItemArray
     */
    public void setBillModChoiceItem(
            final org.chocolate_milk.model.BillModChoiceItem[] vBillModChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vBillModChoiceItemArray.length; i++) {
                this._items.add(vBillModChoiceItemArray[i]);
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
     * @return the unmarshaled org.chocolate_milk.model.BillModChoic
     */
    public static org.chocolate_milk.model.BillModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillModChoice.class, reader);
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
