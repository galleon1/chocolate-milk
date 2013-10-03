/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BillAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.BillAddChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillAddChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.BillAddChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBillAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillAddChoiceItem(
            final org.chocolate_milk.model.BillAddChoiceItem vBillAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vBillAddChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vBillAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.BillAddChoiceItem vBillAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vBillAddChoiceItem);
    }

    /**
     * Method enumerateBillAddChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.BillAddChoiceItem> enumerateBillAddChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getBillAddChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.BillAddChoiceItem at the given index
     */
    public org.chocolate_milk.model.BillAddChoiceItem getBillAddChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getBillAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.BillAddChoiceItem) _items.get(index);
    }

    /**
     * Method getBillAddChoiceItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.BillAddChoiceItem[] getBillAddChoiceItem(
    ) {
        org.chocolate_milk.model.BillAddChoiceItem[] array = new org.chocolate_milk.model.BillAddChoiceItem[0];
        return (org.chocolate_milk.model.BillAddChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getBillAddChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getBillAddChoiceItemCount(
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
     * Method iterateBillAddChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.BillAddChoiceItem> iterateBillAddChoiceItem(
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
    public void removeAllBillAddChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeBillAddChoiceItem.
     * 
     * @param vBillAddChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeBillAddChoiceItem(
            final org.chocolate_milk.model.BillAddChoiceItem vBillAddChoiceItem) {
        boolean removed = _items.remove(vBillAddChoiceItem);
        return removed;
    }

    /**
     * Method removeBillAddChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.BillAddChoiceItem removeBillAddChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.BillAddChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBillAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBillAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.BillAddChoiceItem vBillAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setBillAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vBillAddChoiceItem);
    }

    /**
     * 
     * 
     * @param vBillAddChoiceItemArray
     */
    public void setBillAddChoiceItem(
            final org.chocolate_milk.model.BillAddChoiceItem[] vBillAddChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vBillAddChoiceItemArray.length; i++) {
                this._items.add(vBillAddChoiceItemArray[i]);
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
     * @return the unmarshaled org.chocolate_milk.model.BillAddChoic
     */
    public static org.chocolate_milk.model.BillAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillAddChoice.class, reader);
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
