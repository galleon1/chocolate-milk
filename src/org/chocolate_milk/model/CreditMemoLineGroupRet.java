/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditMemoLineGroupRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditMemoLineGroupRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditMemoLineGroupRet implements java.io.Serializable {


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
     * Field _serviceDate.
     */
    private java.lang.String _serviceDate;

    /**
     * Field _creditMemoLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.CreditMemoLineRet> _creditMemoLineRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditMemoLineGroupRet() {
        super();
        this._creditMemoLineRetList = new java.util.ArrayList<org.chocolate_milk.model.CreditMemoLineRet>();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCreditMemoLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditMemoLineRet(
            final org.chocolate_milk.model.CreditMemoLineRet vCreditMemoLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._creditMemoLineRetList.add(vCreditMemoLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditMemoLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditMemoLineRet(
            final int index,
            final org.chocolate_milk.model.CreditMemoLineRet vCreditMemoLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._creditMemoLineRetList.add(index, vCreditMemoLineRet);
    }

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
     * Method enumerateCreditMemoLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CreditMemoLineRet> enumerateCreditMemoLineRet(
    ) {
        return java.util.Collections.enumeration(this._creditMemoLineRetList);
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
     * Method getCreditMemoLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CreditMemoLineRet at the given index
     */
    public org.chocolate_milk.model.CreditMemoLineRet getCreditMemoLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._creditMemoLineRetList.size()) {
            throw new IndexOutOfBoundsException("getCreditMemoLineRet: Index value '" + index + "' not in range [0.." + (this._creditMemoLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CreditMemoLineRet) _creditMemoLineRetList.get(index);
    }

    /**
     * Method getCreditMemoLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CreditMemoLineRet[] getCreditMemoLineRet(
    ) {
        org.chocolate_milk.model.CreditMemoLineRet[] array = new org.chocolate_milk.model.CreditMemoLineRet[0];
        return (org.chocolate_milk.model.CreditMemoLineRet[]) this._creditMemoLineRetList.toArray(array);
    }

    /**
     * Method getCreditMemoLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getCreditMemoLineRetCount(
    ) {
        return this._creditMemoLineRetList.size();
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
     * Returns the value of field 'isPrintItemsInGroup'.
     * 
     * @return the value of field 'IsPrintItemsInGroup'.
     */
    public java.lang.String getIsPrintItemsInGroup(
    ) {
        return this._isPrintItemsInGroup;
    }

    /**
     * Returns the value of field 'serviceDate'.
     * 
     * @return the value of field 'ServiceDate'.
     */
    public java.lang.String getServiceDate(
    ) {
        return this._serviceDate;
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
     * Method iterateCreditMemoLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CreditMemoLineRet> iterateCreditMemoLineRet(
    ) {
        return this._creditMemoLineRetList.iterator();
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
    public void removeAllCreditMemoLineRet(
    ) {
        this._creditMemoLineRetList.clear();
    }

    /**
     */
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
    }

    /**
     * Method removeCreditMemoLineRet.
     * 
     * @param vCreditMemoLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeCreditMemoLineRet(
            final org.chocolate_milk.model.CreditMemoLineRet vCreditMemoLineRet) {
        boolean removed = _creditMemoLineRetList.remove(vCreditMemoLineRet);
        return removed;
    }

    /**
     * Method removeCreditMemoLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CreditMemoLineRet removeCreditMemoLineRetAt(
            final int index) {
        java.lang.Object obj = this._creditMemoLineRetList.remove(index);
        return (org.chocolate_milk.model.CreditMemoLineRet) obj;
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
     * 
     * 
     * @param index
     * @param vCreditMemoLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCreditMemoLineRet(
            final int index,
            final org.chocolate_milk.model.CreditMemoLineRet vCreditMemoLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._creditMemoLineRetList.size()) {
            throw new IndexOutOfBoundsException("setCreditMemoLineRet: Index value '" + index + "' not in range [0.." + (this._creditMemoLineRetList.size() - 1) + "]");
        }

        this._creditMemoLineRetList.set(index, vCreditMemoLineRet);
    }

    /**
     * 
     * 
     * @param vCreditMemoLineRetArray
     */
    public void setCreditMemoLineRet(
            final org.chocolate_milk.model.CreditMemoLineRet[] vCreditMemoLineRetArray) {
        //-- copy array
        _creditMemoLineRetList.clear();

        for (int i = 0; i < vCreditMemoLineRetArray.length; i++) {
                this._creditMemoLineRetList.add(vCreditMemoLineRetArray[i]);
        }
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
     * Sets the value of field 'serviceDate'.
     * 
     * @param serviceDate the value of field 'serviceDate'.
     */
    public void setServiceDate(
            final java.lang.String serviceDate) {
        this._serviceDate = serviceDate;
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
     * org.chocolate_milk.model.CreditMemoLineGroupRet
     */
    public static org.chocolate_milk.model.CreditMemoLineGroupRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditMemoLineGroupRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditMemoLineGroupRet.class, reader);
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
