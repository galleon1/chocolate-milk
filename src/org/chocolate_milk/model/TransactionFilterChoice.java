/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TransactionFilterChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TransactionFilterChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class TransactionFilterChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _refNumberList.
     */
    private java.util.List<java.lang.String> _refNumberList;

    /**
     * Field _refNumberCaseSensitiveList.
     */
    private java.util.List<java.lang.String> _refNumberCaseSensitiveList;

    /**
     * Field _refNumberFilter.
     */
    private org.chocolate_milk.model.RefNumberFilter _refNumberFilter;

    /**
     * Field _refNumberRangeFilter.
     */
    private org.chocolate_milk.model.RefNumberRangeFilter _refNumberRangeFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public TransactionFilterChoice() {
        super();
        this._refNumberList = new java.util.ArrayList<java.lang.String>();
        this._refNumberCaseSensitiveList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRefNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefNumber(
            final java.lang.String vRefNumber)
    throws java.lang.IndexOutOfBoundsException {
        this._refNumberList.add(vRefNumber);
    }

    /**
     * 
     * 
     * @param index
     * @param vRefNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefNumber(
            final int index,
            final java.lang.String vRefNumber)
    throws java.lang.IndexOutOfBoundsException {
        this._refNumberList.add(index, vRefNumber);
    }

    /**
     * 
     * 
     * @param vRefNumberCaseSensitive
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefNumberCaseSensitive(
            final java.lang.String vRefNumberCaseSensitive)
    throws java.lang.IndexOutOfBoundsException {
        this._refNumberCaseSensitiveList.add(vRefNumberCaseSensitive);
    }

    /**
     * 
     * 
     * @param index
     * @param vRefNumberCaseSensitive
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRefNumberCaseSensitive(
            final int index,
            final java.lang.String vRefNumberCaseSensitive)
    throws java.lang.IndexOutOfBoundsException {
        this._refNumberCaseSensitiveList.add(index, vRefNumberCaseSensitive);
    }

    /**
     * Method enumerateRefNumber.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateRefNumber(
    ) {
        return java.util.Collections.enumeration(this._refNumberList);
    }

    /**
     * Method enumerateRefNumberCaseSensitive.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateRefNumberCaseSensitive(
    ) {
        return java.util.Collections.enumeration(this._refNumberCaseSensitiveList);
    }

    /**
     * Method getRefNumber.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getRefNumber(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refNumberList.size()) {
            throw new IndexOutOfBoundsException("getRefNumber: Index value '" + index + "' not in range [0.." + (this._refNumberList.size() - 1) + "]");
        }

        return (java.lang.String) _refNumberList.get(index);
    }

    /**
     * Method getRefNumber.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getRefNumber(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._refNumberList.toArray(array);
    }

    /**
     * Method getRefNumberCaseSensitive.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getRefNumberCaseSensitive(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refNumberCaseSensitiveList.size()) {
            throw new IndexOutOfBoundsException("getRefNumberCaseSensitive: Index value '" + index + "' not in range [0.." + (this._refNumberCaseSensitiveList.size() - 1) + "]");
        }

        return (java.lang.String) _refNumberCaseSensitiveList.get(index);
    }

    /**
     * Method getRefNumberCaseSensitive.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getRefNumberCaseSensitive(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._refNumberCaseSensitiveList.toArray(array);
    }

    /**
     * Method getRefNumberCaseSensitiveCount.
     * 
     * @return the size of this collection
     */
    public int getRefNumberCaseSensitiveCount(
    ) {
        return this._refNumberCaseSensitiveList.size();
    }

    /**
     * Method getRefNumberCount.
     * 
     * @return the size of this collection
     */
    public int getRefNumberCount(
    ) {
        return this._refNumberList.size();
    }

    /**
     * Returns the value of field 'refNumberFilter'.
     * 
     * @return the value of field 'RefNumberFilter'.
     */
    public org.chocolate_milk.model.RefNumberFilter getRefNumberFilter(
    ) {
        return this._refNumberFilter;
    }

    /**
     * Returns the value of field 'refNumberRangeFilter'.
     * 
     * @return the value of field 'RefNumberRangeFilter'.
     */
    public org.chocolate_milk.model.RefNumberRangeFilter getRefNumberRangeFilter(
    ) {
        return this._refNumberRangeFilter;
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
     * Method iterateRefNumber.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateRefNumber(
    ) {
        return this._refNumberList.iterator();
    }

    /**
     * Method iterateRefNumberCaseSensitive.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateRefNumberCaseSensitive(
    ) {
        return this._refNumberCaseSensitiveList.iterator();
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
    public void removeAllRefNumber(
    ) {
        this._refNumberList.clear();
    }

    /**
     */
    public void removeAllRefNumberCaseSensitive(
    ) {
        this._refNumberCaseSensitiveList.clear();
    }

    /**
     * Method removeRefNumber.
     * 
     * @param vRefNumber
     * @return true if the object was removed from the collection.
     */
    public boolean removeRefNumber(
            final java.lang.String vRefNumber) {
        boolean removed = _refNumberList.remove(vRefNumber);
        return removed;
    }

    /**
     * Method removeRefNumberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeRefNumberAt(
            final int index) {
        java.lang.Object obj = this._refNumberList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeRefNumberCaseSensitive.
     * 
     * @param vRefNumberCaseSensitive
     * @return true if the object was removed from the collection.
     */
    public boolean removeRefNumberCaseSensitive(
            final java.lang.String vRefNumberCaseSensitive) {
        boolean removed = _refNumberCaseSensitiveList.remove(vRefNumberCaseSensitive);
        return removed;
    }

    /**
     * Method removeRefNumberCaseSensitiveAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeRefNumberCaseSensitiveAt(
            final int index) {
        java.lang.Object obj = this._refNumberCaseSensitiveList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRefNumber
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRefNumber(
            final int index,
            final java.lang.String vRefNumber)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refNumberList.size()) {
            throw new IndexOutOfBoundsException("setRefNumber: Index value '" + index + "' not in range [0.." + (this._refNumberList.size() - 1) + "]");
        }

        this._refNumberList.set(index, vRefNumber);
    }

    /**
     * 
     * 
     * @param vRefNumberArray
     */
    public void setRefNumber(
            final java.lang.String[] vRefNumberArray) {
        //-- copy array
        _refNumberList.clear();

        for (int i = 0; i < vRefNumberArray.length; i++) {
                this._refNumberList.add(vRefNumberArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRefNumberCaseSensitive
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRefNumberCaseSensitive(
            final int index,
            final java.lang.String vRefNumberCaseSensitive)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._refNumberCaseSensitiveList.size()) {
            throw new IndexOutOfBoundsException("setRefNumberCaseSensitive: Index value '" + index + "' not in range [0.." + (this._refNumberCaseSensitiveList.size() - 1) + "]");
        }

        this._refNumberCaseSensitiveList.set(index, vRefNumberCaseSensitive);
    }

    /**
     * 
     * 
     * @param vRefNumberCaseSensitiveArray
     */
    public void setRefNumberCaseSensitive(
            final java.lang.String[] vRefNumberCaseSensitiveArray) {
        //-- copy array
        _refNumberCaseSensitiveList.clear();

        for (int i = 0; i < vRefNumberCaseSensitiveArray.length; i++) {
                this._refNumberCaseSensitiveList.add(vRefNumberCaseSensitiveArray[i]);
        }
    }

    /**
     * Sets the value of field 'refNumberFilter'.
     * 
     * @param refNumberFilter the value of field 'refNumberFilter'.
     */
    public void setRefNumberFilter(
            final org.chocolate_milk.model.RefNumberFilter refNumberFilter) {
        this._refNumberFilter = refNumberFilter;
    }

    /**
     * Sets the value of field 'refNumberRangeFilter'.
     * 
     * @param refNumberRangeFilter the value of field
     * 'refNumberRangeFilter'.
     */
    public void setRefNumberRangeFilter(
            final org.chocolate_milk.model.RefNumberRangeFilter refNumberRangeFilter) {
        this._refNumberRangeFilter = refNumberRangeFilter;
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
     * org.chocolate_milk.model.TransactionFilterChoice
     */
    public static org.chocolate_milk.model.TransactionFilterChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TransactionFilterChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TransactionFilterChoice.class, reader);
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
