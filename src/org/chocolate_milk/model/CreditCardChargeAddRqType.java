/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardChargeAddRqType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardChargeAddRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class CreditCardChargeAddRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _creditCardChargeAdd.
     */
    private org.chocolate_milk.model.CreditCardChargeAdd _creditCardChargeAdd;

    /**
     * Field _includeRetElementList.
     */
    private java.util.List<java.lang.String> _includeRetElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardChargeAddRqType() {
        super();
        this._includeRetElementList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(index, vIncludeRetElement);
    }

    /**
     * Method enumerateIncludeRetElement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateIncludeRetElement(
    ) {
        return java.util.Collections.enumeration(this._includeRetElementList);
    }

    /**
     * Returns the value of field 'creditCardChargeAdd'.
     * 
     * @return the value of field 'CreditCardChargeAdd'.
     */
    public org.chocolate_milk.model.CreditCardChargeAdd getCreditCardChargeAdd(
    ) {
        return this._creditCardChargeAdd;
    }

    /**
     * Method getIncludeRetElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeRetElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        return (java.lang.String) _includeRetElementList.get(index);
    }

    /**
     * Method getIncludeRetElement.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeRetElement(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeRetElementList.toArray(array);
    }

    /**
     * Method getIncludeRetElementCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRetElementCount(
    ) {
        return this._includeRetElementList.size();
    }

    /**
     * Returns the value of field 'requestID'.
     * 
     * @return the value of field 'RequestID'.
     */
    public java.lang.String getRequestID(
    ) {
        return this._requestID;
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
     * Method iterateIncludeRetElement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateIncludeRetElement(
    ) {
        return this._includeRetElementList.iterator();
    }

    /**
     */
    public void removeAllIncludeRetElement(
    ) {
        this._includeRetElementList.clear();
    }

    /**
     * Method removeIncludeRetElement.
     * 
     * @param vIncludeRetElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRetElement(
            final java.lang.String vIncludeRetElement) {
        boolean removed = _includeRetElementList.remove(vIncludeRetElement);
        return removed;
    }

    /**
     * Method removeIncludeRetElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeRetElementAt(
            final int index) {
        java.lang.Object obj = this._includeRetElementList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'creditCardChargeAdd'.
     * 
     * @param creditCardChargeAdd the value of field
     * 'creditCardChargeAdd'.
     */
    public void setCreditCardChargeAdd(
            final org.chocolate_milk.model.CreditCardChargeAdd creditCardChargeAdd) {
        this._creditCardChargeAdd = creditCardChargeAdd;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        this._includeRetElementList.set(index, vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param vIncludeRetElementArray
     */
    public void setIncludeRetElement(
            final java.lang.String[] vIncludeRetElementArray) {
        //-- copy array
        _includeRetElementList.clear();

        for (int i = 0; i < vIncludeRetElementArray.length; i++) {
                this._includeRetElementList.add(vIncludeRetElementArray[i]);
        }
    }

    /**
     * Sets the value of field 'requestID'.
     * 
     * @param requestID the value of field 'requestID'.
     */
    public void setRequestID(
            final java.lang.String requestID) {
        this._requestID = requestID;
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
