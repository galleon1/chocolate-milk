/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevelPerItemCurrency.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevelPerItemCurrency.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class PriceLevelPerItemCurrency implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _priceLevelPerItemList.
     */
    private java.util.List<org.chocolate_milk.model.PriceLevelPerItem> _priceLevelPerItemList;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevelPerItemCurrency() {
        super();
        this._priceLevelPerItemList = new java.util.ArrayList<org.chocolate_milk.model.PriceLevelPerItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPriceLevelPerItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPriceLevelPerItem(
            final org.chocolate_milk.model.PriceLevelPerItem vPriceLevelPerItem)
    throws java.lang.IndexOutOfBoundsException {
        this._priceLevelPerItemList.add(vPriceLevelPerItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vPriceLevelPerItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPriceLevelPerItem(
            final int index,
            final org.chocolate_milk.model.PriceLevelPerItem vPriceLevelPerItem)
    throws java.lang.IndexOutOfBoundsException {
        this._priceLevelPerItemList.add(index, vPriceLevelPerItem);
    }

    /**
     * Method enumeratePriceLevelPerItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.PriceLevelPerItem> enumeratePriceLevelPerItem(
    ) {
        return java.util.Collections.enumeration(this._priceLevelPerItemList);
    }

    /**
     * Returns the value of field 'currencyRef'.
     * 
     * @return the value of field 'CurrencyRef'.
     */
    public org.chocolate_milk.model.CurrencyRef getCurrencyRef(
    ) {
        return this._currencyRef;
    }

    /**
     * Method getPriceLevelPerItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.PriceLevelPerItem at the given index
     */
    public org.chocolate_milk.model.PriceLevelPerItem getPriceLevelPerItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._priceLevelPerItemList.size()) {
            throw new IndexOutOfBoundsException("getPriceLevelPerItem: Index value '" + index + "' not in range [0.." + (this._priceLevelPerItemList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.PriceLevelPerItem) _priceLevelPerItemList.get(index);
    }

    /**
     * Method getPriceLevelPerItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.PriceLevelPerItem[] getPriceLevelPerItem(
    ) {
        org.chocolate_milk.model.PriceLevelPerItem[] array = new org.chocolate_milk.model.PriceLevelPerItem[0];
        return (org.chocolate_milk.model.PriceLevelPerItem[]) this._priceLevelPerItemList.toArray(array);
    }

    /**
     * Method getPriceLevelPerItemCount.
     * 
     * @return the size of this collection
     */
    public int getPriceLevelPerItemCount(
    ) {
        return this._priceLevelPerItemList.size();
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
     * Method iteratePriceLevelPerItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.PriceLevelPerItem> iteratePriceLevelPerItem(
    ) {
        return this._priceLevelPerItemList.iterator();
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
    public void removeAllPriceLevelPerItem(
    ) {
        this._priceLevelPerItemList.clear();
    }

    /**
     * Method removePriceLevelPerItem.
     * 
     * @param vPriceLevelPerItem
     * @return true if the object was removed from the collection.
     */
    public boolean removePriceLevelPerItem(
            final org.chocolate_milk.model.PriceLevelPerItem vPriceLevelPerItem) {
        boolean removed = _priceLevelPerItemList.remove(vPriceLevelPerItem);
        return removed;
    }

    /**
     * Method removePriceLevelPerItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.PriceLevelPerItem removePriceLevelPerItemAt(
            final int index) {
        java.lang.Object obj = this._priceLevelPerItemList.remove(index);
        return (org.chocolate_milk.model.PriceLevelPerItem) obj;
    }

    /**
     * Sets the value of field 'currencyRef'.
     * 
     * @param currencyRef the value of field 'currencyRef'.
     */
    public void setCurrencyRef(
            final org.chocolate_milk.model.CurrencyRef currencyRef) {
        this._currencyRef = currencyRef;
    }

    /**
     * 
     * 
     * @param index
     * @param vPriceLevelPerItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPriceLevelPerItem(
            final int index,
            final org.chocolate_milk.model.PriceLevelPerItem vPriceLevelPerItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._priceLevelPerItemList.size()) {
            throw new IndexOutOfBoundsException("setPriceLevelPerItem: Index value '" + index + "' not in range [0.." + (this._priceLevelPerItemList.size() - 1) + "]");
        }

        this._priceLevelPerItemList.set(index, vPriceLevelPerItem);
    }

    /**
     * 
     * 
     * @param vPriceLevelPerItemArray
     */
    public void setPriceLevelPerItem(
            final org.chocolate_milk.model.PriceLevelPerItem[] vPriceLevelPerItemArray) {
        //-- copy array
        _priceLevelPerItemList.clear();

        for (int i = 0; i < vPriceLevelPerItemArray.length; i++) {
                this._priceLevelPerItemList.add(vPriceLevelPerItemArray[i]);
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
     * org.chocolate_milk.model.PriceLevelPerItemCurrency
     */
    public static org.chocolate_milk.model.PriceLevelPerItemCurrency unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevelPerItemCurrency) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevelPerItemCurrency.class, reader);
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
