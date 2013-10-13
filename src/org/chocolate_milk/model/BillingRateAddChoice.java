/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillingRateAddChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillingRateAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class BillingRateAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fixedBillingRate.
     */
    private java.lang.String _fixedBillingRate;

    /**
     * Field _billingRatePerItemList.
     */
    private java.util.List<org.chocolate_milk.model.BillingRatePerItem> _billingRatePerItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillingRateAddChoice() {
        super();
        this._billingRatePerItemList = new java.util.ArrayList<org.chocolate_milk.model.BillingRatePerItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBillingRatePerItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillingRatePerItem(
            final org.chocolate_milk.model.BillingRatePerItem vBillingRatePerItem)
    throws java.lang.IndexOutOfBoundsException {
        this._billingRatePerItemList.add(vBillingRatePerItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vBillingRatePerItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillingRatePerItem(
            final int index,
            final org.chocolate_milk.model.BillingRatePerItem vBillingRatePerItem)
    throws java.lang.IndexOutOfBoundsException {
        this._billingRatePerItemList.add(index, vBillingRatePerItem);
    }

    /**
     * Method enumerateBillingRatePerItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.BillingRatePerItem> enumerateBillingRatePerItem(
    ) {
        return java.util.Collections.enumeration(this._billingRatePerItemList);
    }

    /**
     * Method getBillingRatePerItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.BillingRatePerItem at the given inde
     */
    public org.chocolate_milk.model.BillingRatePerItem getBillingRatePerItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._billingRatePerItemList.size()) {
            throw new IndexOutOfBoundsException("getBillingRatePerItem: Index value '" + index + "' not in range [0.." + (this._billingRatePerItemList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.BillingRatePerItem) _billingRatePerItemList.get(index);
    }

    /**
     * Method getBillingRatePerItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.BillingRatePerItem[] getBillingRatePerItem(
    ) {
        org.chocolate_milk.model.BillingRatePerItem[] array = new org.chocolate_milk.model.BillingRatePerItem[0];
        return (org.chocolate_milk.model.BillingRatePerItem[]) this._billingRatePerItemList.toArray(array);
    }

    /**
     * Method getBillingRatePerItemCount.
     * 
     * @return the size of this collection
     */
    public int getBillingRatePerItemCount(
    ) {
        return this._billingRatePerItemList.size();
    }

    /**
     * Returns the value of field 'fixedBillingRate'.
     * 
     * @return the value of field 'FixedBillingRate'.
     */
    public java.lang.String getFixedBillingRate(
    ) {
        return this._fixedBillingRate;
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
     * Method iterateBillingRatePerItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.BillingRatePerItem> iterateBillingRatePerItem(
    ) {
        return this._billingRatePerItemList.iterator();
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
    public void removeAllBillingRatePerItem(
    ) {
        this._billingRatePerItemList.clear();
    }

    /**
     * Method removeBillingRatePerItem.
     * 
     * @param vBillingRatePerItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeBillingRatePerItem(
            final org.chocolate_milk.model.BillingRatePerItem vBillingRatePerItem) {
        boolean removed = _billingRatePerItemList.remove(vBillingRatePerItem);
        return removed;
    }

    /**
     * Method removeBillingRatePerItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.BillingRatePerItem removeBillingRatePerItemAt(
            final int index) {
        java.lang.Object obj = this._billingRatePerItemList.remove(index);
        return (org.chocolate_milk.model.BillingRatePerItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBillingRatePerItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBillingRatePerItem(
            final int index,
            final org.chocolate_milk.model.BillingRatePerItem vBillingRatePerItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._billingRatePerItemList.size()) {
            throw new IndexOutOfBoundsException("setBillingRatePerItem: Index value '" + index + "' not in range [0.." + (this._billingRatePerItemList.size() - 1) + "]");
        }

        this._billingRatePerItemList.set(index, vBillingRatePerItem);
    }

    /**
     * 
     * 
     * @param vBillingRatePerItemArray
     */
    public void setBillingRatePerItem(
            final org.chocolate_milk.model.BillingRatePerItem[] vBillingRatePerItemArray) {
        //-- copy array
        _billingRatePerItemList.clear();

        for (int i = 0; i < vBillingRatePerItemArray.length; i++) {
                this._billingRatePerItemList.add(vBillingRatePerItemArray[i]);
        }
    }

    /**
     * Sets the value of field 'fixedBillingRate'.
     * 
     * @param fixedBillingRate the value of field 'fixedBillingRate'
     */
    public void setFixedBillingRate(
            final java.lang.String fixedBillingRate) {
        this._fixedBillingRate = fixedBillingRate;
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
     * org.chocolate_milk.model.BillingRateAddChoice
     */
    public static org.chocolate_milk.model.BillingRateAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillingRateAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillingRateAddChoice.class, reader);
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
