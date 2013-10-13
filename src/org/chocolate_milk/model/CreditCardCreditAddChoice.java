/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardCreditAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardCreditAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CreditCardCreditAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.CreditCardCreditAddChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardCreditAddChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.CreditCardCreditAddChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCreditCardCreditAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditCardCreditAddChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditAddChoiceItem vCreditCardCreditAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vCreditCardCreditAddChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditCardCreditAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditCardCreditAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.CreditCardCreditAddChoiceItem vCreditCardCreditAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vCreditCardCreditAddChoiceItem);
    }

    /**
     * Method enumerateCreditCardCreditAddChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CreditCardCreditAddChoiceItem> enumerateCreditCardCreditAddChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getCreditCardCreditAddChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CreditCardCreditAddChoiceItem at
     * the given index
     */
    public org.chocolate_milk.model.CreditCardCreditAddChoiceItem getCreditCardCreditAddChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getCreditCardCreditAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CreditCardCreditAddChoiceItem) _items.get(index);
    }

    /**
     * Method getCreditCardCreditAddChoiceItem.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CreditCardCreditAddChoiceItem[] getCreditCardCreditAddChoiceItem(
    ) {
        org.chocolate_milk.model.CreditCardCreditAddChoiceItem[] array = new org.chocolate_milk.model.CreditCardCreditAddChoiceItem[0];
        return (org.chocolate_milk.model.CreditCardCreditAddChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getCreditCardCreditAddChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getCreditCardCreditAddChoiceItemCount(
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
     * Method iterateCreditCardCreditAddChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CreditCardCreditAddChoiceItem> iterateCreditCardCreditAddChoiceItem(
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
    public void removeAllCreditCardCreditAddChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeCreditCardCreditAddChoiceItem.
     * 
     * @param vCreditCardCreditAddChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeCreditCardCreditAddChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditAddChoiceItem vCreditCardCreditAddChoiceItem) {
        boolean removed = _items.remove(vCreditCardCreditAddChoiceItem);
        return removed;
    }

    /**
     * Method removeCreditCardCreditAddChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CreditCardCreditAddChoiceItem removeCreditCardCreditAddChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.CreditCardCreditAddChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditCardCreditAddChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCreditCardCreditAddChoiceItem(
            final int index,
            final org.chocolate_milk.model.CreditCardCreditAddChoiceItem vCreditCardCreditAddChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setCreditCardCreditAddChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vCreditCardCreditAddChoiceItem);
    }

    /**
     * 
     * 
     * @param vCreditCardCreditAddChoiceItemArray
     */
    public void setCreditCardCreditAddChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditAddChoiceItem[] vCreditCardCreditAddChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vCreditCardCreditAddChoiceItemArray.length; i++) {
                this._items.add(vCreditCardCreditAddChoiceItemArray[i]);
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
     * org.chocolate_milk.model.CreditCardCreditAddChoice
     */
    public static org.chocolate_milk.model.CreditCardCreditAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardCreditAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardCreditAddChoice.class, reader);
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
