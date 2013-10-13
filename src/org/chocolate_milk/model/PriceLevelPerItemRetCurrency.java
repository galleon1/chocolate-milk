/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevelPerItemRetCurrency.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevelPerItemRetCurrency.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PriceLevelPerItemRetCurrency implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _priceLevelPerItemRetList.
     */
    private java.util.List<org.chocolate_milk.model.PriceLevelPerItemRet> _priceLevelPerItemRetList;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevelPerItemRetCurrency() {
        super();
        this._priceLevelPerItemRetList = new java.util.ArrayList<org.chocolate_milk.model.PriceLevelPerItemRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPriceLevelPerItemRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPriceLevelPerItemRet(
            final org.chocolate_milk.model.PriceLevelPerItemRet vPriceLevelPerItemRet)
    throws java.lang.IndexOutOfBoundsException {
        this._priceLevelPerItemRetList.add(vPriceLevelPerItemRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vPriceLevelPerItemRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPriceLevelPerItemRet(
            final int index,
            final org.chocolate_milk.model.PriceLevelPerItemRet vPriceLevelPerItemRet)
    throws java.lang.IndexOutOfBoundsException {
        this._priceLevelPerItemRetList.add(index, vPriceLevelPerItemRet);
    }

    /**
     * Method enumeratePriceLevelPerItemRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.PriceLevelPerItemRet> enumeratePriceLevelPerItemRet(
    ) {
        return java.util.Collections.enumeration(this._priceLevelPerItemRetList);
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
     * Method getPriceLevelPerItemRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.PriceLevelPerItemRet at the given
     * index
     */
    public org.chocolate_milk.model.PriceLevelPerItemRet getPriceLevelPerItemRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._priceLevelPerItemRetList.size()) {
            throw new IndexOutOfBoundsException("getPriceLevelPerItemRet: Index value '" + index + "' not in range [0.." + (this._priceLevelPerItemRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.PriceLevelPerItemRet) _priceLevelPerItemRetList.get(index);
    }

    /**
     * Method getPriceLevelPerItemRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.PriceLevelPerItemRet[] getPriceLevelPerItemRet(
    ) {
        org.chocolate_milk.model.PriceLevelPerItemRet[] array = new org.chocolate_milk.model.PriceLevelPerItemRet[0];
        return (org.chocolate_milk.model.PriceLevelPerItemRet[]) this._priceLevelPerItemRetList.toArray(array);
    }

    /**
     * Method getPriceLevelPerItemRetCount.
     * 
     * @return the size of this collection
     */
    public int getPriceLevelPerItemRetCount(
    ) {
        return this._priceLevelPerItemRetList.size();
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
     * Method iteratePriceLevelPerItemRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.PriceLevelPerItemRet> iteratePriceLevelPerItemRet(
    ) {
        return this._priceLevelPerItemRetList.iterator();
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
    public void removeAllPriceLevelPerItemRet(
    ) {
        this._priceLevelPerItemRetList.clear();
    }

    /**
     * Method removePriceLevelPerItemRet.
     * 
     * @param vPriceLevelPerItemRet
     * @return true if the object was removed from the collection.
     */
    public boolean removePriceLevelPerItemRet(
            final org.chocolate_milk.model.PriceLevelPerItemRet vPriceLevelPerItemRet) {
        boolean removed = _priceLevelPerItemRetList.remove(vPriceLevelPerItemRet);
        return removed;
    }

    /**
     * Method removePriceLevelPerItemRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.PriceLevelPerItemRet removePriceLevelPerItemRetAt(
            final int index) {
        java.lang.Object obj = this._priceLevelPerItemRetList.remove(index);
        return (org.chocolate_milk.model.PriceLevelPerItemRet) obj;
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
     * @param vPriceLevelPerItemRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPriceLevelPerItemRet(
            final int index,
            final org.chocolate_milk.model.PriceLevelPerItemRet vPriceLevelPerItemRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._priceLevelPerItemRetList.size()) {
            throw new IndexOutOfBoundsException("setPriceLevelPerItemRet: Index value '" + index + "' not in range [0.." + (this._priceLevelPerItemRetList.size() - 1) + "]");
        }

        this._priceLevelPerItemRetList.set(index, vPriceLevelPerItemRet);
    }

    /**
     * 
     * 
     * @param vPriceLevelPerItemRetArray
     */
    public void setPriceLevelPerItemRet(
            final org.chocolate_milk.model.PriceLevelPerItemRet[] vPriceLevelPerItemRetArray) {
        //-- copy array
        _priceLevelPerItemRetList.clear();

        for (int i = 0; i < vPriceLevelPerItemRetArray.length; i++) {
                this._priceLevelPerItemRetList.add(vPriceLevelPerItemRetArray[i]);
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
     * org.chocolate_milk.model.PriceLevelPerItemRetCurrency
     */
    public static org.chocolate_milk.model.PriceLevelPerItemRetCurrency unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevelPerItemRetCurrency) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevelPerItemRetCurrency.class, reader);
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
