/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxPaymentCheckRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxPaymentCheckRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesTaxPaymentCheckRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCore.
     */
    private org.chocolate_milk.model.TxnCore _txnCore;

    /**
     * Field _payeeEntityRef.
     */
    private org.chocolate_milk.model.PayeeEntityRef _payeeEntityRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _bankAccountRef.
     */
    private org.chocolate_milk.model.BankAccountRef _bankAccountRef;

    /**
     * Field _amount.
     */
    private java.lang.String _amount;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _address.
     */
    private org.chocolate_milk.model.Address _address;

    /**
     * Field _addressBlock.
     */
    private org.chocolate_milk.model.AddressBlock _addressBlock;

    /**
     * Field _isToBePrinted.
     */
    private java.lang.String _isToBePrinted;

    /**
     * Field _salesTaxPaymentCheckLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.SalesTaxPaymentCheckLineRet> _salesTaxPaymentCheckLineRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxPaymentCheckRet() {
        super();
        this._salesTaxPaymentCheckLineRetList = new java.util.ArrayList<org.chocolate_milk.model.SalesTaxPaymentCheckLineRet>();
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
     * @param vSalesTaxPaymentCheckLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesTaxPaymentCheckLineRet(
            final org.chocolate_milk.model.SalesTaxPaymentCheckLineRet vSalesTaxPaymentCheckLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._salesTaxPaymentCheckLineRetList.add(vSalesTaxPaymentCheckLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesTaxPaymentCheckLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesTaxPaymentCheckLineRet(
            final int index,
            final org.chocolate_milk.model.SalesTaxPaymentCheckLineRet vSalesTaxPaymentCheckLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._salesTaxPaymentCheckLineRetList.add(index, vSalesTaxPaymentCheckLineRet);
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
     * Method enumerateSalesTaxPaymentCheckLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SalesTaxPaymentCheckLineRet> enumerateSalesTaxPaymentCheckLineRet(
    ) {
        return java.util.Collections.enumeration(this._salesTaxPaymentCheckLineRetList);
    }

    /**
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'Address'.
     */
    public org.chocolate_milk.model.Address getAddress(
    ) {
        return this._address;
    }

    /**
     * Returns the value of field 'addressBlock'.
     * 
     * @return the value of field 'AddressBlock'.
     */
    public org.chocolate_milk.model.AddressBlock getAddressBlock(
    ) {
        return this._addressBlock;
    }

    /**
     * Returns the value of field 'amount'.
     * 
     * @return the value of field 'Amount'.
     */
    public java.lang.String getAmount(
    ) {
        return this._amount;
    }

    /**
     * Returns the value of field 'bankAccountRef'.
     * 
     * @return the value of field 'BankAccountRef'.
     */
    public org.chocolate_milk.model.BankAccountRef getBankAccountRef(
    ) {
        return this._bankAccountRef;
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
     * Returns the value of field 'isToBePrinted'.
     * 
     * @return the value of field 'IsToBePrinted'.
     */
    public java.lang.String getIsToBePrinted(
    ) {
        return this._isToBePrinted;
    }

    /**
     * Returns the value of field 'memo'.
     * 
     * @return the value of field 'Memo'.
     */
    public java.lang.String getMemo(
    ) {
        return this._memo;
    }

    /**
     * Returns the value of field 'payeeEntityRef'.
     * 
     * @return the value of field 'PayeeEntityRef'.
     */
    public org.chocolate_milk.model.PayeeEntityRef getPayeeEntityRef(
    ) {
        return this._payeeEntityRef;
    }

    /**
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Method getSalesTaxPaymentCheckLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.SalesTaxPaymentCheckLineRet at the
     * given index
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckLineRet getSalesTaxPaymentCheckLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesTaxPaymentCheckLineRetList.size()) {
            throw new IndexOutOfBoundsException("getSalesTaxPaymentCheckLineRet: Index value '" + index + "' not in range [0.." + (this._salesTaxPaymentCheckLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SalesTaxPaymentCheckLineRet) _salesTaxPaymentCheckLineRetList.get(index);
    }

    /**
     * Method getSalesTaxPaymentCheckLineRet.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckLineRet[] getSalesTaxPaymentCheckLineRet(
    ) {
        org.chocolate_milk.model.SalesTaxPaymentCheckLineRet[] array = new org.chocolate_milk.model.SalesTaxPaymentCheckLineRet[0];
        return (org.chocolate_milk.model.SalesTaxPaymentCheckLineRet[]) this._salesTaxPaymentCheckLineRetList.toArray(array);
    }

    /**
     * Method getSalesTaxPaymentCheckLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getSalesTaxPaymentCheckLineRetCount(
    ) {
        return this._salesTaxPaymentCheckLineRetList.size();
    }

    /**
     * Returns the value of field 'txnCore'.
     * 
     * @return the value of field 'TxnCore'.
     */
    public org.chocolate_milk.model.TxnCore getTxnCore(
    ) {
        return this._txnCore;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
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
     * Method iterateSalesTaxPaymentCheckLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SalesTaxPaymentCheckLineRet> iterateSalesTaxPaymentCheckLineRet(
    ) {
        return this._salesTaxPaymentCheckLineRetList.iterator();
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
    public void removeAllSalesTaxPaymentCheckLineRet(
    ) {
        this._salesTaxPaymentCheckLineRetList.clear();
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
     * Method removeSalesTaxPaymentCheckLineRet.
     * 
     * @param vSalesTaxPaymentCheckLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeSalesTaxPaymentCheckLineRet(
            final org.chocolate_milk.model.SalesTaxPaymentCheckLineRet vSalesTaxPaymentCheckLineRet) {
        boolean removed = _salesTaxPaymentCheckLineRetList.remove(vSalesTaxPaymentCheckLineRet);
        return removed;
    }

    /**
     * Method removeSalesTaxPaymentCheckLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckLineRet removeSalesTaxPaymentCheckLineRetAt(
            final int index) {
        java.lang.Object obj = this._salesTaxPaymentCheckLineRetList.remove(index);
        return (org.chocolate_milk.model.SalesTaxPaymentCheckLineRet) obj;
    }

    /**
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
     */
    public void setAddress(
            final org.chocolate_milk.model.Address address) {
        this._address = address;
    }

    /**
     * Sets the value of field 'addressBlock'.
     * 
     * @param addressBlock the value of field 'addressBlock'.
     */
    public void setAddressBlock(
            final org.chocolate_milk.model.AddressBlock addressBlock) {
        this._addressBlock = addressBlock;
    }

    /**
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(
            final java.lang.String amount) {
        this._amount = amount;
    }

    /**
     * Sets the value of field 'bankAccountRef'.
     * 
     * @param bankAccountRef the value of field 'bankAccountRef'.
     */
    public void setBankAccountRef(
            final org.chocolate_milk.model.BankAccountRef bankAccountRef) {
        this._bankAccountRef = bankAccountRef;
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
     * Sets the value of field 'isToBePrinted'.
     * 
     * @param isToBePrinted the value of field 'isToBePrinted'.
     */
    public void setIsToBePrinted(
            final java.lang.String isToBePrinted) {
        this._isToBePrinted = isToBePrinted;
    }

    /**
     * Sets the value of field 'memo'.
     * 
     * @param memo the value of field 'memo'.
     */
    public void setMemo(
            final java.lang.String memo) {
        this._memo = memo;
    }

    /**
     * Sets the value of field 'payeeEntityRef'.
     * 
     * @param payeeEntityRef the value of field 'payeeEntityRef'.
     */
    public void setPayeeEntityRef(
            final org.chocolate_milk.model.PayeeEntityRef payeeEntityRef) {
        this._payeeEntityRef = payeeEntityRef;
    }

    /**
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesTaxPaymentCheckLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSalesTaxPaymentCheckLineRet(
            final int index,
            final org.chocolate_milk.model.SalesTaxPaymentCheckLineRet vSalesTaxPaymentCheckLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesTaxPaymentCheckLineRetList.size()) {
            throw new IndexOutOfBoundsException("setSalesTaxPaymentCheckLineRet: Index value '" + index + "' not in range [0.." + (this._salesTaxPaymentCheckLineRetList.size() - 1) + "]");
        }

        this._salesTaxPaymentCheckLineRetList.set(index, vSalesTaxPaymentCheckLineRet);
    }

    /**
     * 
     * 
     * @param vSalesTaxPaymentCheckLineRetArray
     */
    public void setSalesTaxPaymentCheckLineRet(
            final org.chocolate_milk.model.SalesTaxPaymentCheckLineRet[] vSalesTaxPaymentCheckLineRetArray) {
        //-- copy array
        _salesTaxPaymentCheckLineRetList.clear();

        for (int i = 0; i < vSalesTaxPaymentCheckLineRetArray.length; i++) {
                this._salesTaxPaymentCheckLineRetList.add(vSalesTaxPaymentCheckLineRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'txnCore'.
     * 
     * @param txnCore the value of field 'txnCore'.
     */
    public void setTxnCore(
            final org.chocolate_milk.model.TxnCore txnCore) {
        this._txnCore = txnCore;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
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
     * org.chocolate_milk.model.SalesTaxPaymentCheckRet
     */
    public static org.chocolate_milk.model.SalesTaxPaymentCheckRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesTaxPaymentCheckRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesTaxPaymentCheckRet.class, reader);
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
