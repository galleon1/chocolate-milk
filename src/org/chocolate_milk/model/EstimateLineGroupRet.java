/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateLineGroupRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateLineGroupRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EstimateLineGroupRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _txnLineGroupCoreRet.
     */
    private org.chocolate_milk.model.TxnLineGroupCoreRet _txnLineGroupCoreRet;

    /**
     * Field _isPrintItemsInGroup.
     */
    private java.lang.String _isPrintItemsInGroup;

    /**
     * Field _totalAmount.
     */
    private java.lang.String _totalAmount;

    /**
     * Field _estimateLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.EstimateLineRet> _estimateLineRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateLineGroupRet() {
        super();
        this._estimateLineRetList = new java.util.ArrayList<org.chocolate_milk.model.EstimateLineRet>();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(vDataExtRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(index, vDataExtRet);
    }

    /**
     * 
     * 
     * @param vEstimateLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateLineRet(
            final org.chocolate_milk.model.EstimateLineRet vEstimateLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._estimateLineRetList.add(vEstimateLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateLineRet(
            final int index,
            final org.chocolate_milk.model.EstimateLineRet vEstimateLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._estimateLineRetList.add(index, vEstimateLineRet);
    }

    /**
     * Method enumerateDataExtRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DataExtRet> enumerateDataExtRet(
    ) {
        return java.util.Collections.enumeration(this._dataExtRetList);
    }

    /**
     * Method enumerateEstimateLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.EstimateLineRet> enumerateEstimateLineRet(
    ) {
        return java.util.Collections.enumeration(this._estimateLineRetList);
    }

    /**
     * Method getDataExtRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.DataExtRet
     * at the given index
     */
    public org.chocolate_milk.model.DataExtRet getDataExtRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("getDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DataExtRet) _dataExtRetList.get(index);
    }

    /**
     * Method getDataExtRet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DataExtRet[] getDataExtRet(
    ) {
        org.chocolate_milk.model.DataExtRet[] array = new org.chocolate_milk.model.DataExtRet[0];
        return (org.chocolate_milk.model.DataExtRet[]) this._dataExtRetList.toArray(array);
    }

    /**
     * Method getDataExtRetCount.
     * 
     * @return the size of this collection
     */
    public int getDataExtRetCount(
    ) {
        return this._dataExtRetList.size();
    }

    /**
     * Method getEstimateLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.EstimateLineRet at the given index
     */
    public org.chocolate_milk.model.EstimateLineRet getEstimateLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._estimateLineRetList.size()) {
            throw new IndexOutOfBoundsException("getEstimateLineRet: Index value '" + index + "' not in range [0.." + (this._estimateLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.EstimateLineRet) _estimateLineRetList.get(index);
    }

    /**
     * Method getEstimateLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.EstimateLineRet[] getEstimateLineRet(
    ) {
        org.chocolate_milk.model.EstimateLineRet[] array = new org.chocolate_milk.model.EstimateLineRet[0];
        return (org.chocolate_milk.model.EstimateLineRet[]) this._estimateLineRetList.toArray(array);
    }

    /**
     * Method getEstimateLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getEstimateLineRetCount(
    ) {
        return this._estimateLineRetList.size();
    }

    /**
     * Returns the value of field 'isPrintItemsInGroup'.
     * 
     * @return the value of field 'IsPrintItemsInGroup'.
     */
    public java.lang.String getIsPrintItemsInGroup(
    ) {
        return this._isPrintItemsInGroup;
    }

    /**
     * Returns the value of field 'totalAmount'.
     * 
     * @return the value of field 'TotalAmount'.
     */
    public java.lang.String getTotalAmount(
    ) {
        return this._totalAmount;
    }

    /**
     * Returns the value of field 'txnLineGroupCoreRet'.
     * 
     * @return the value of field 'TxnLineGroupCoreRet'.
     */
    public org.chocolate_milk.model.TxnLineGroupCoreRet getTxnLineGroupCoreRet(
    ) {
        return this._txnLineGroupCoreRet;
    }

    /**
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public java.lang.String getTxnLineID(
    ) {
        return this._txnLineID;
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
     * Method iterateDataExtRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DataExtRet> iterateDataExtRet(
    ) {
        return this._dataExtRetList.iterator();
    }

    /**
     * Method iterateEstimateLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.EstimateLineRet> iterateEstimateLineRet(
    ) {
        return this._estimateLineRetList.iterator();
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
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
    }

    /**
     */
    public void removeAllEstimateLineRet(
    ) {
        this._estimateLineRetList.clear();
    }

    /**
     * Method removeDataExtRet.
     * 
     * @param vDataExtRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet) {
        boolean removed = _dataExtRetList.remove(vDataExtRet);
        return removed;
    }

    /**
     * Method removeDataExtRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DataExtRet removeDataExtRetAt(
            final int index) {
        java.lang.Object obj = this._dataExtRetList.remove(index);
        return (org.chocolate_milk.model.DataExtRet) obj;
    }

    /**
     * Method removeEstimateLineRet.
     * 
     * @param vEstimateLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeEstimateLineRet(
            final org.chocolate_milk.model.EstimateLineRet vEstimateLineRet) {
        boolean removed = _estimateLineRetList.remove(vEstimateLineRet);
        return removed;
    }

    /**
     * Method removeEstimateLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.EstimateLineRet removeEstimateLineRetAt(
            final int index) {
        java.lang.Object obj = this._estimateLineRetList.remove(index);
        return (org.chocolate_milk.model.EstimateLineRet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("setDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        this._dataExtRetList.set(index, vDataExtRet);
    }

    /**
     * 
     * 
     * @param vDataExtRetArray
     */
    public void setDataExtRet(
            final org.chocolate_milk.model.DataExtRet[] vDataExtRetArray) {
        //-- copy array
        _dataExtRetList.clear();

        for (int i = 0; i < vDataExtRetArray.length; i++) {
                this._dataExtRetList.add(vDataExtRetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEstimateLineRet(
            final int index,
            final org.chocolate_milk.model.EstimateLineRet vEstimateLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._estimateLineRetList.size()) {
            throw new IndexOutOfBoundsException("setEstimateLineRet: Index value '" + index + "' not in range [0.." + (this._estimateLineRetList.size() - 1) + "]");
        }

        this._estimateLineRetList.set(index, vEstimateLineRet);
    }

    /**
     * 
     * 
     * @param vEstimateLineRetArray
     */
    public void setEstimateLineRet(
            final org.chocolate_milk.model.EstimateLineRet[] vEstimateLineRetArray) {
        //-- copy array
        _estimateLineRetList.clear();

        for (int i = 0; i < vEstimateLineRetArray.length; i++) {
                this._estimateLineRetList.add(vEstimateLineRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'isPrintItemsInGroup'.
     * 
     * @param isPrintItemsInGroup the value of field
     * 'isPrintItemsInGroup'.
     */
    public void setIsPrintItemsInGroup(
            final java.lang.String isPrintItemsInGroup) {
        this._isPrintItemsInGroup = isPrintItemsInGroup;
    }

    /**
     * Sets the value of field 'totalAmount'.
     * 
     * @param totalAmount the value of field 'totalAmount'.
     */
    public void setTotalAmount(
            final java.lang.String totalAmount) {
        this._totalAmount = totalAmount;
    }

    /**
     * Sets the value of field 'txnLineGroupCoreRet'.
     * 
     * @param txnLineGroupCoreRet the value of field
     * 'txnLineGroupCoreRet'.
     */
    public void setTxnLineGroupCoreRet(
            final org.chocolate_milk.model.TxnLineGroupCoreRet txnLineGroupCoreRet) {
        this._txnLineGroupCoreRet = txnLineGroupCoreRet;
    }

    /**
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final java.lang.String txnLineID) {
        this._txnLineID = txnLineID;
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
     * org.chocolate_milk.model.EstimateLineGroupRet
     */
    public static org.chocolate_milk.model.EstimateLineGroupRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateLineGroupRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateLineGroupRet.class, reader);
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
