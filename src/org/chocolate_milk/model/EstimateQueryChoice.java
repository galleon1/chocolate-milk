/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateQueryChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateQueryChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EstimateQueryChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnIDList.
     */
    private java.util.List<java.lang.String> _txnIDList;

    /**
     * Field _refNumberList.
     */
    private java.util.List<java.lang.String> _refNumberList;

    /**
     * Field _refNumberCaseSensitiveList.
     */
    private java.util.List<java.lang.String> _refNumberCaseSensitiveList;

    /**
     * Field _txnFilter.
     */
    private org.chocolate_milk.model.TxnFilter _txnFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateQueryChoice() {
        super();
        this._txnIDList = new java.util.ArrayList<java.lang.String>();
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
     * 
     * 
     * @param vTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnID(
            final java.lang.String vTxnID)
    throws java.lang.IndexOutOfBoundsException {
        this._txnIDList.add(vTxnID);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnID(
            final int index,
            final java.lang.String vTxnID)
    throws java.lang.IndexOutOfBoundsException {
        this._txnIDList.add(index, vTxnID);
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
     * Method enumerateTxnID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateTxnID(
    ) {
        return java.util.Collections.enumeration(this._txnIDList);
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
     * Returns the value of field 'txnFilter'.
     * 
     * @return the value of field 'TxnFilter'.
     */
    public org.chocolate_milk.model.TxnFilter getTxnFilter(
    ) {
        return this._txnFilter;
    }

    /**
     * Method getTxnID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getTxnID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnIDList.size()) {
            throw new IndexOutOfBoundsException("getTxnID: Index value '" + index + "' not in range [0.." + (this._txnIDList.size() - 1) + "]");
        }

        return (java.lang.String) _txnIDList.get(index);
    }

    /**
     * Method getTxnID.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getTxnID(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._txnIDList.toArray(array);
    }

    /**
     * Method getTxnIDCount.
     * 
     * @return the size of this collection
     */
    public int getTxnIDCount(
    ) {
        return this._txnIDList.size();
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
     * Method iterateTxnID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateTxnID(
    ) {
        return this._txnIDList.iterator();
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
     */
    public void removeAllTxnID(
    ) {
        this._txnIDList.clear();
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
     * Method removeTxnID.
     * 
     * @param vTxnID
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnID(
            final java.lang.String vTxnID) {
        boolean removed = _txnIDList.remove(vTxnID);
        return removed;
    }

    /**
     * Method removeTxnIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeTxnIDAt(
            final int index) {
        java.lang.Object obj = this._txnIDList.remove(index);
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
     * Sets the value of field 'txnFilter'.
     * 
     * @param txnFilter the value of field 'txnFilter'.
     */
    public void setTxnFilter(
            final org.chocolate_milk.model.TxnFilter txnFilter) {
        this._txnFilter = txnFilter;
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnID(
            final int index,
            final java.lang.String vTxnID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnIDList.size()) {
            throw new IndexOutOfBoundsException("setTxnID: Index value '" + index + "' not in range [0.." + (this._txnIDList.size() - 1) + "]");
        }

        this._txnIDList.set(index, vTxnID);
    }

    /**
     * 
     * 
     * @param vTxnIDArray
     */
    public void setTxnID(
            final java.lang.String[] vTxnIDArray) {
        //-- copy array
        _txnIDList.clear();

        for (int i = 0; i < vTxnIDArray.length; i++) {
                this._txnIDList.add(vTxnIDArray[i]);
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
     * org.chocolate_milk.model.EstimateQueryChoice
     */
    public static org.chocolate_milk.model.EstimateQueryChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateQueryChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateQueryChoice.class, reader);
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
