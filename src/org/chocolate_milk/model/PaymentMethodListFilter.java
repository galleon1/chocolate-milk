/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PaymentMethodListFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PaymentMethodListFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PaymentMethodListFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listFilter.
     */
    private org.chocolate_milk.model.ListFilter _listFilter;

    /**
     * Field _paymentMethodTypeList.
     */
    private java.util.List<org.chocolate_milk.model.types.PaymentMethodTypeType> _paymentMethodTypeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PaymentMethodListFilter() {
        super();
        this._paymentMethodTypeList = new java.util.ArrayList<org.chocolate_milk.model.types.PaymentMethodTypeType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPaymentMethodType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPaymentMethodType(
            final org.chocolate_milk.model.types.PaymentMethodTypeType vPaymentMethodType)
    throws java.lang.IndexOutOfBoundsException {
        this._paymentMethodTypeList.add(vPaymentMethodType);
    }

    /**
     * 
     * 
     * @param index
     * @param vPaymentMethodType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPaymentMethodType(
            final int index,
            final org.chocolate_milk.model.types.PaymentMethodTypeType vPaymentMethodType)
    throws java.lang.IndexOutOfBoundsException {
        this._paymentMethodTypeList.add(index, vPaymentMethodType);
    }

    /**
     * Method enumeratePaymentMethodType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.PaymentMethodTypeType> enumeratePaymentMethodType(
    ) {
        return java.util.Collections.enumeration(this._paymentMethodTypeList);
    }

    /**
     * Returns the value of field 'listFilter'.
     * 
     * @return the value of field 'ListFilter'.
     */
    public org.chocolate_milk.model.ListFilter getListFilter(
    ) {
        return this._listFilter;
    }

    /**
     * Method getPaymentMethodType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.PaymentMethodTypeType at the
     * given index
     */
    public org.chocolate_milk.model.types.PaymentMethodTypeType getPaymentMethodType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._paymentMethodTypeList.size()) {
            throw new IndexOutOfBoundsException("getPaymentMethodType: Index value '" + index + "' not in range [0.." + (this._paymentMethodTypeList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.PaymentMethodTypeType) _paymentMethodTypeList.get(index);
    }

    /**
     * Method getPaymentMethodType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.PaymentMethodTypeType[] getPaymentMethodType(
    ) {
        org.chocolate_milk.model.types.PaymentMethodTypeType[] array = new org.chocolate_milk.model.types.PaymentMethodTypeType[0];
        return (org.chocolate_milk.model.types.PaymentMethodTypeType[]) this._paymentMethodTypeList.toArray(array);
    }

    /**
     * Method getPaymentMethodTypeCount.
     * 
     * @return the size of this collection
     */
    public int getPaymentMethodTypeCount(
    ) {
        return this._paymentMethodTypeList.size();
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
     * Method iteratePaymentMethodType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.PaymentMethodTypeType> iteratePaymentMethodType(
    ) {
        return this._paymentMethodTypeList.iterator();
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
    public void removeAllPaymentMethodType(
    ) {
        this._paymentMethodTypeList.clear();
    }

    /**
     * Method removePaymentMethodType.
     * 
     * @param vPaymentMethodType
     * @return true if the object was removed from the collection.
     */
    public boolean removePaymentMethodType(
            final org.chocolate_milk.model.types.PaymentMethodTypeType vPaymentMethodType) {
        boolean removed = _paymentMethodTypeList.remove(vPaymentMethodType);
        return removed;
    }

    /**
     * Method removePaymentMethodTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.PaymentMethodTypeType removePaymentMethodTypeAt(
            final int index) {
        java.lang.Object obj = this._paymentMethodTypeList.remove(index);
        return (org.chocolate_milk.model.types.PaymentMethodTypeType) obj;
    }

    /**
     * Sets the value of field 'listFilter'.
     * 
     * @param listFilter the value of field 'listFilter'.
     */
    public void setListFilter(
            final org.chocolate_milk.model.ListFilter listFilter) {
        this._listFilter = listFilter;
    }

    /**
     * 
     * 
     * @param index
     * @param vPaymentMethodType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPaymentMethodType(
            final int index,
            final org.chocolate_milk.model.types.PaymentMethodTypeType vPaymentMethodType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._paymentMethodTypeList.size()) {
            throw new IndexOutOfBoundsException("setPaymentMethodType: Index value '" + index + "' not in range [0.." + (this._paymentMethodTypeList.size() - 1) + "]");
        }

        this._paymentMethodTypeList.set(index, vPaymentMethodType);
    }

    /**
     * 
     * 
     * @param vPaymentMethodTypeArray
     */
    public void setPaymentMethodType(
            final org.chocolate_milk.model.types.PaymentMethodTypeType[] vPaymentMethodTypeArray) {
        //-- copy array
        _paymentMethodTypeList.clear();

        for (int i = 0; i < vPaymentMethodTypeArray.length; i++) {
                this._paymentMethodTypeList.add(vPaymentMethodTypeArray[i]);
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
     * org.chocolate_milk.model.PaymentMethodListFilter
     */
    public static org.chocolate_milk.model.PaymentMethodListFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PaymentMethodListFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PaymentMethodListFilter.class, reader);
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
