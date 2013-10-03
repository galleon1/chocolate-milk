/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptModChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesReceiptModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.SalesReceiptModChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptModChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.SalesReceiptModChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSalesReceiptModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesReceiptModChoiceItem(
            final org.chocolate_milk.model.SalesReceiptModChoiceItem vSalesReceiptModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vSalesReceiptModChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesReceiptModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesReceiptModChoiceItem(
            final int index,
            final org.chocolate_milk.model.SalesReceiptModChoiceItem vSalesReceiptModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vSalesReceiptModChoiceItem);
    }

    /**
     * Method enumerateSalesReceiptModChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SalesReceiptModChoiceItem> enumerateSalesReceiptModChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getSalesReceiptModChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.SalesReceiptModChoiceItem at the
     * given index
     */
    public org.chocolate_milk.model.SalesReceiptModChoiceItem getSalesReceiptModChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getSalesReceiptModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SalesReceiptModChoiceItem) _items.get(index);
    }

    /**
     * Method getSalesReceiptModChoiceItem.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SalesReceiptModChoiceItem[] getSalesReceiptModChoiceItem(
    ) {
        org.chocolate_milk.model.SalesReceiptModChoiceItem[] array = new org.chocolate_milk.model.SalesReceiptModChoiceItem[0];
        return (org.chocolate_milk.model.SalesReceiptModChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getSalesReceiptModChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getSalesReceiptModChoiceItemCount(
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
     * Method iterateSalesReceiptModChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SalesReceiptModChoiceItem> iterateSalesReceiptModChoiceItem(
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
    public void removeAllSalesReceiptModChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeSalesReceiptModChoiceItem.
     * 
     * @param vSalesReceiptModChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeSalesReceiptModChoiceItem(
            final org.chocolate_milk.model.SalesReceiptModChoiceItem vSalesReceiptModChoiceItem) {
        boolean removed = _items.remove(vSalesReceiptModChoiceItem);
        return removed;
    }

    /**
     * Method removeSalesReceiptModChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SalesReceiptModChoiceItem removeSalesReceiptModChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.SalesReceiptModChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesReceiptModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSalesReceiptModChoiceItem(
            final int index,
            final org.chocolate_milk.model.SalesReceiptModChoiceItem vSalesReceiptModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setSalesReceiptModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vSalesReceiptModChoiceItem);
    }

    /**
     * 
     * 
     * @param vSalesReceiptModChoiceItemArray
     */
    public void setSalesReceiptModChoiceItem(
            final org.chocolate_milk.model.SalesReceiptModChoiceItem[] vSalesReceiptModChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vSalesReceiptModChoiceItemArray.length; i++) {
                this._items.add(vSalesReceiptModChoiceItemArray[i]);
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
     * org.chocolate_milk.model.SalesReceiptModChoice
     */
    public static org.chocolate_milk.model.SalesReceiptModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesReceiptModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesReceiptModChoice.class, reader);
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
