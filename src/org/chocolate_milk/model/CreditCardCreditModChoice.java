/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardCreditModChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardCreditModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditCardCreditModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.CreditCardCreditModChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardCreditModChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.CreditCardCreditModChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCreditCardCreditModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditCardCreditModChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditModChoiceItem vCreditCardCreditModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vCreditCardCreditModChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditCardCreditModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditCardCreditModChoiceItem(
            final int index,
            final org.chocolate_milk.model.CreditCardCreditModChoiceItem vCreditCardCreditModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vCreditCardCreditModChoiceItem);
    }

    /**
     * Method enumerateCreditCardCreditModChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CreditCardCreditModChoiceItem> enumerateCreditCardCreditModChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getCreditCardCreditModChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CreditCardCreditModChoiceItem at
     * the given index
     */
    public org.chocolate_milk.model.CreditCardCreditModChoiceItem getCreditCardCreditModChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getCreditCardCreditModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CreditCardCreditModChoiceItem) _items.get(index);
    }

    /**
     * Method getCreditCardCreditModChoiceItem.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CreditCardCreditModChoiceItem[] getCreditCardCreditModChoiceItem(
    ) {
        org.chocolate_milk.model.CreditCardCreditModChoiceItem[] array = new org.chocolate_milk.model.CreditCardCreditModChoiceItem[0];
        return (org.chocolate_milk.model.CreditCardCreditModChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getCreditCardCreditModChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getCreditCardCreditModChoiceItemCount(
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
     * Method iterateCreditCardCreditModChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CreditCardCreditModChoiceItem> iterateCreditCardCreditModChoiceItem(
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
    public void removeAllCreditCardCreditModChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeCreditCardCreditModChoiceItem.
     * 
     * @param vCreditCardCreditModChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeCreditCardCreditModChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditModChoiceItem vCreditCardCreditModChoiceItem) {
        boolean removed = _items.remove(vCreditCardCreditModChoiceItem);
        return removed;
    }

    /**
     * Method removeCreditCardCreditModChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CreditCardCreditModChoiceItem removeCreditCardCreditModChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.CreditCardCreditModChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditCardCreditModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCreditCardCreditModChoiceItem(
            final int index,
            final org.chocolate_milk.model.CreditCardCreditModChoiceItem vCreditCardCreditModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setCreditCardCreditModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vCreditCardCreditModChoiceItem);
    }

    /**
     * 
     * 
     * @param vCreditCardCreditModChoiceItemArray
     */
    public void setCreditCardCreditModChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditModChoiceItem[] vCreditCardCreditModChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vCreditCardCreditModChoiceItemArray.length; i++) {
                this._items.add(vCreditCardCreditModChoiceItemArray[i]);
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
     * org.chocolate_milk.model.CreditCardCreditModChoice
     */
    public static org.chocolate_milk.model.CreditCardCreditModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardCreditModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardCreditModChoice.class, reader);
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
