/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DepositRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DepositRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DepositRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCore.
     */
    private org.chocolate_milk.model.TxnCore _txnCore;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _depositToAccountRef.
     */
    private org.chocolate_milk.model.DepositToAccountRef _depositToAccountRef;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _depositTotal.
     */
    private java.lang.String _depositTotal;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _depositTotalInHomeCurrency.
     */
    private java.lang.String _depositTotalInHomeCurrency;

    /**
     * Field _cashBackInfoRet.
     */
    private org.chocolate_milk.model.CashBackInfoRet _cashBackInfoRet;

    /**
     * Field _depositLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.DepositLineRet> _depositLineRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DepositRet() {
        super();
        this._depositLineRetList = new java.util.ArrayList<org.chocolate_milk.model.DepositLineRet>();
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
     * @param vDepositLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDepositLineRet(
            final org.chocolate_milk.model.DepositLineRet vDepositLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._depositLineRetList.add(vDepositLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vDepositLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDepositLineRet(
            final int index,
            final org.chocolate_milk.model.DepositLineRet vDepositLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._depositLineRetList.add(index, vDepositLineRet);
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
     * Method enumerateDepositLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DepositLineRet> enumerateDepositLineRet(
    ) {
        return java.util.Collections.enumeration(this._depositLineRetList);
    }

    /**
     * Returns the value of field 'cashBackInfoRet'.
     * 
     * @return the value of field 'CashBackInfoRet'.
     */
    public org.chocolate_milk.model.CashBackInfoRet getCashBackInfoRet(
    ) {
        return this._cashBackInfoRet;
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
     * Method getDepositLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.DepositLineRet at the given index
     */
    public org.chocolate_milk.model.DepositLineRet getDepositLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._depositLineRetList.size()) {
            throw new IndexOutOfBoundsException("getDepositLineRet: Index value '" + index + "' not in range [0.." + (this._depositLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DepositLineRet) _depositLineRetList.get(index);
    }

    /**
     * Method getDepositLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DepositLineRet[] getDepositLineRet(
    ) {
        org.chocolate_milk.model.DepositLineRet[] array = new org.chocolate_milk.model.DepositLineRet[0];
        return (org.chocolate_milk.model.DepositLineRet[]) this._depositLineRetList.toArray(array);
    }

    /**
     * Method getDepositLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getDepositLineRetCount(
    ) {
        return this._depositLineRetList.size();
    }

    /**
     * Returns the value of field 'depositToAccountRef'.
     * 
     * @return the value of field 'DepositToAccountRef'.
     */
    public org.chocolate_milk.model.DepositToAccountRef getDepositToAccountRef(
    ) {
        return this._depositToAccountRef;
    }

    /**
     * Returns the value of field 'depositTotal'.
     * 
     * @return the value of field 'DepositTotal'.
     */
    public java.lang.String getDepositTotal(
    ) {
        return this._depositTotal;
    }

    /**
     * Returns the value of field 'depositTotalInHomeCurrency'.
     * 
     * @return the value of field 'DepositTotalInHomeCurrency'.
     */
    public java.lang.String getDepositTotalInHomeCurrency(
    ) {
        return this._depositTotalInHomeCurrency;
    }

    /**
     * Returns the value of field 'exchangeRate'.
     * 
     * @return the value of field 'ExchangeRate'.
     */
    public java.lang.String getExchangeRate(
    ) {
        return this._exchangeRate;
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
     * Method iterateDepositLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DepositLineRet> iterateDepositLineRet(
    ) {
        return this._depositLineRetList.iterator();
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
    public void removeAllDepositLineRet(
    ) {
        this._depositLineRetList.clear();
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
     * Method removeDepositLineRet.
     * 
     * @param vDepositLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeDepositLineRet(
            final org.chocolate_milk.model.DepositLineRet vDepositLineRet) {
        boolean removed = _depositLineRetList.remove(vDepositLineRet);
        return removed;
    }

    /**
     * Method removeDepositLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DepositLineRet removeDepositLineRetAt(
            final int index) {
        java.lang.Object obj = this._depositLineRetList.remove(index);
        return (org.chocolate_milk.model.DepositLineRet) obj;
    }

    /**
     * Sets the value of field 'cashBackInfoRet'.
     * 
     * @param cashBackInfoRet the value of field 'cashBackInfoRet'.
     */
    public void setCashBackInfoRet(
            final org.chocolate_milk.model.CashBackInfoRet cashBackInfoRet) {
        this._cashBackInfoRet = cashBackInfoRet;
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
     * @param vDepositLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDepositLineRet(
            final int index,
            final org.chocolate_milk.model.DepositLineRet vDepositLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._depositLineRetList.size()) {
            throw new IndexOutOfBoundsException("setDepositLineRet: Index value '" + index + "' not in range [0.." + (this._depositLineRetList.size() - 1) + "]");
        }

        this._depositLineRetList.set(index, vDepositLineRet);
    }

    /**
     * 
     * 
     * @param vDepositLineRetArray
     */
    public void setDepositLineRet(
            final org.chocolate_milk.model.DepositLineRet[] vDepositLineRetArray) {
        //-- copy array
        _depositLineRetList.clear();

        for (int i = 0; i < vDepositLineRetArray.length; i++) {
                this._depositLineRetList.add(vDepositLineRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'depositToAccountRef'.
     * 
     * @param depositToAccountRef the value of field
     * 'depositToAccountRef'.
     */
    public void setDepositToAccountRef(
            final org.chocolate_milk.model.DepositToAccountRef depositToAccountRef) {
        this._depositToAccountRef = depositToAccountRef;
    }

    /**
     * Sets the value of field 'depositTotal'.
     * 
     * @param depositTotal the value of field 'depositTotal'.
     */
    public void setDepositTotal(
            final java.lang.String depositTotal) {
        this._depositTotal = depositTotal;
    }

    /**
     * Sets the value of field 'depositTotalInHomeCurrency'.
     * 
     * @param depositTotalInHomeCurrency the value of field
     * 'depositTotalInHomeCurrency'.
     */
    public void setDepositTotalInHomeCurrency(
            final java.lang.String depositTotalInHomeCurrency) {
        this._depositTotalInHomeCurrency = depositTotalInHomeCurrency;
    }

    /**
     * Sets the value of field 'exchangeRate'.
     * 
     * @param exchangeRate the value of field 'exchangeRate'.
     */
    public void setExchangeRate(
            final java.lang.String exchangeRate) {
        this._exchangeRate = exchangeRate;
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
     * @return the unmarshaled org.chocolate_milk.model.DepositRet
     */
    public static org.chocolate_milk.model.DepositRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DepositRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DepositRet.class, reader);
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
