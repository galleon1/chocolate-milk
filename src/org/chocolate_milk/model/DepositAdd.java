/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DepositAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DepositAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DepositAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

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
     * Field _cashBackInfoAdd.
     */
    private org.chocolate_milk.model.CashBackInfoAdd _cashBackInfoAdd;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _depositLineAddList.
     */
    private java.util.List<org.chocolate_milk.model.DepositLineAdd> _depositLineAddList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DepositAdd() {
        super();
        this._depositLineAddList = new java.util.ArrayList<org.chocolate_milk.model.DepositLineAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDepositLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDepositLineAdd(
            final org.chocolate_milk.model.DepositLineAdd vDepositLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._depositLineAddList.add(vDepositLineAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vDepositLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDepositLineAdd(
            final int index,
            final org.chocolate_milk.model.DepositLineAdd vDepositLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._depositLineAddList.add(index, vDepositLineAdd);
    }

    /**
     * Method enumerateDepositLineAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DepositLineAdd> enumerateDepositLineAdd(
    ) {
        return java.util.Collections.enumeration(this._depositLineAddList);
    }

    /**
     * Returns the value of field 'cashBackInfoAdd'.
     * 
     * @return the value of field 'CashBackInfoAdd'.
     */
    public org.chocolate_milk.model.CashBackInfoAdd getCashBackInfoAdd(
    ) {
        return this._cashBackInfoAdd;
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
     * Returns the value of field 'defMacro'.
     * 
     * @return the value of field 'DefMacro'.
     */
    public java.lang.String getDefMacro(
    ) {
        return this._defMacro;
    }

    /**
     * Method getDepositLineAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.DepositLineAdd at the given index
     */
    public org.chocolate_milk.model.DepositLineAdd getDepositLineAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._depositLineAddList.size()) {
            throw new IndexOutOfBoundsException("getDepositLineAdd: Index value '" + index + "' not in range [0.." + (this._depositLineAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DepositLineAdd) _depositLineAddList.get(index);
    }

    /**
     * Method getDepositLineAdd.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DepositLineAdd[] getDepositLineAdd(
    ) {
        org.chocolate_milk.model.DepositLineAdd[] array = new org.chocolate_milk.model.DepositLineAdd[0];
        return (org.chocolate_milk.model.DepositLineAdd[]) this._depositLineAddList.toArray(array);
    }

    /**
     * Method getDepositLineAddCount.
     * 
     * @return the size of this collection
     */
    public int getDepositLineAddCount(
    ) {
        return this._depositLineAddList.size();
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
     * Method iterateDepositLineAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DepositLineAdd> iterateDepositLineAdd(
    ) {
        return this._depositLineAddList.iterator();
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
    public void removeAllDepositLineAdd(
    ) {
        this._depositLineAddList.clear();
    }

    /**
     * Method removeDepositLineAdd.
     * 
     * @param vDepositLineAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeDepositLineAdd(
            final org.chocolate_milk.model.DepositLineAdd vDepositLineAdd) {
        boolean removed = _depositLineAddList.remove(vDepositLineAdd);
        return removed;
    }

    /**
     * Method removeDepositLineAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DepositLineAdd removeDepositLineAddAt(
            final int index) {
        java.lang.Object obj = this._depositLineAddList.remove(index);
        return (org.chocolate_milk.model.DepositLineAdd) obj;
    }

    /**
     * Sets the value of field 'cashBackInfoAdd'.
     * 
     * @param cashBackInfoAdd the value of field 'cashBackInfoAdd'.
     */
    public void setCashBackInfoAdd(
            final org.chocolate_milk.model.CashBackInfoAdd cashBackInfoAdd) {
        this._cashBackInfoAdd = cashBackInfoAdd;
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
     * Sets the value of field 'defMacro'.
     * 
     * @param defMacro the value of field 'defMacro'.
     */
    public void setDefMacro(
            final java.lang.String defMacro) {
        this._defMacro = defMacro;
    }

    /**
     * 
     * 
     * @param index
     * @param vDepositLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDepositLineAdd(
            final int index,
            final org.chocolate_milk.model.DepositLineAdd vDepositLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._depositLineAddList.size()) {
            throw new IndexOutOfBoundsException("setDepositLineAdd: Index value '" + index + "' not in range [0.." + (this._depositLineAddList.size() - 1) + "]");
        }

        this._depositLineAddList.set(index, vDepositLineAdd);
    }

    /**
     * 
     * 
     * @param vDepositLineAddArray
     */
    public void setDepositLineAdd(
            final org.chocolate_milk.model.DepositLineAdd[] vDepositLineAddArray) {
        //-- copy array
        _depositLineAddList.clear();

        for (int i = 0; i < vDepositLineAddArray.length; i++) {
                this._depositLineAddList.add(vDepositLineAddArray[i]);
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
     * @return the unmarshaled org.chocolate_milk.model.DepositAdd
     */
    public static org.chocolate_milk.model.DepositAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DepositAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DepositAdd.class, reader);
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
