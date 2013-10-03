/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InvoiceLineGroupRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InvoiceLineGroupRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class InvoiceLineGroupRet implements java.io.Serializable {


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
     * Field _invoiceLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.InvoiceLineRet> _invoiceLineRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public InvoiceLineGroupRet() {
        super();
        this._invoiceLineRetList = new java.util.ArrayList<org.chocolate_milk.model.InvoiceLineRet>();
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
     * @param vInvoiceLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInvoiceLineRet(
            final org.chocolate_milk.model.InvoiceLineRet vInvoiceLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._invoiceLineRetList.add(vInvoiceLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vInvoiceLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInvoiceLineRet(
            final int index,
            final org.chocolate_milk.model.InvoiceLineRet vInvoiceLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._invoiceLineRetList.add(index, vInvoiceLineRet);
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
     * Method enumerateInvoiceLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.InvoiceLineRet> enumerateInvoiceLineRet(
    ) {
        return java.util.Collections.enumeration(this._invoiceLineRetList);
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
     * Method getInvoiceLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.InvoiceLineRet at the given index
     */
    public org.chocolate_milk.model.InvoiceLineRet getInvoiceLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._invoiceLineRetList.size()) {
            throw new IndexOutOfBoundsException("getInvoiceLineRet: Index value '" + index + "' not in range [0.." + (this._invoiceLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.InvoiceLineRet) _invoiceLineRetList.get(index);
    }

    /**
     * Method getInvoiceLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.InvoiceLineRet[] getInvoiceLineRet(
    ) {
        org.chocolate_milk.model.InvoiceLineRet[] array = new org.chocolate_milk.model.InvoiceLineRet[0];
        return (org.chocolate_milk.model.InvoiceLineRet[]) this._invoiceLineRetList.toArray(array);
    }

    /**
     * Method getInvoiceLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getInvoiceLineRetCount(
    ) {
        return this._invoiceLineRetList.size();
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
     * Method iterateInvoiceLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.InvoiceLineRet> iterateInvoiceLineRet(
    ) {
        return this._invoiceLineRetList.iterator();
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
    public void removeAllInvoiceLineRet(
    ) {
        this._invoiceLineRetList.clear();
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
     * Method removeInvoiceLineRet.
     * 
     * @param vInvoiceLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeInvoiceLineRet(
            final org.chocolate_milk.model.InvoiceLineRet vInvoiceLineRet) {
        boolean removed = _invoiceLineRetList.remove(vInvoiceLineRet);
        return removed;
    }

    /**
     * Method removeInvoiceLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.InvoiceLineRet removeInvoiceLineRetAt(
            final int index) {
        java.lang.Object obj = this._invoiceLineRetList.remove(index);
        return (org.chocolate_milk.model.InvoiceLineRet) obj;
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
     * @param vInvoiceLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInvoiceLineRet(
            final int index,
            final org.chocolate_milk.model.InvoiceLineRet vInvoiceLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._invoiceLineRetList.size()) {
            throw new IndexOutOfBoundsException("setInvoiceLineRet: Index value '" + index + "' not in range [0.." + (this._invoiceLineRetList.size() - 1) + "]");
        }

        this._invoiceLineRetList.set(index, vInvoiceLineRet);
    }

    /**
     * 
     * 
     * @param vInvoiceLineRetArray
     */
    public void setInvoiceLineRet(
            final org.chocolate_milk.model.InvoiceLineRet[] vInvoiceLineRetArray) {
        //-- copy array
        _invoiceLineRetList.clear();

        for (int i = 0; i < vInvoiceLineRetArray.length; i++) {
                this._invoiceLineRetList.add(vInvoiceLineRetArray[i]);
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
     * org.chocolate_milk.model.InvoiceLineGroupRet
     */
    public static org.chocolate_milk.model.InvoiceLineGroupRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.InvoiceLineGroupRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.InvoiceLineGroupRet.class, reader);
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
