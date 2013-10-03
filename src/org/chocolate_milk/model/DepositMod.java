/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DepositMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DepositMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DepositMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCoreMod.
     */
    private org.chocolate_milk.model.TxnCoreMod _txnCoreMod;

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
     * Field _cashBackInfoMod.
     */
    private org.chocolate_milk.model.CashBackInfoMod _cashBackInfoMod;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _depositLineModList.
     */
    private java.util.List<org.chocolate_milk.model.DepositLineMod> _depositLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DepositMod() {
        super();
        this._depositLineModList = new java.util.ArrayList<org.chocolate_milk.model.DepositLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDepositLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDepositLineMod(
            final org.chocolate_milk.model.DepositLineMod vDepositLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._depositLineModList.add(vDepositLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vDepositLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDepositLineMod(
            final int index,
            final org.chocolate_milk.model.DepositLineMod vDepositLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._depositLineModList.add(index, vDepositLineMod);
    }

    /**
     * Method enumerateDepositLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DepositLineMod> enumerateDepositLineMod(
    ) {
        return java.util.Collections.enumeration(this._depositLineModList);
    }

    /**
     * Returns the value of field 'cashBackInfoMod'.
     * 
     * @return the value of field 'CashBackInfoMod'.
     */
    public org.chocolate_milk.model.CashBackInfoMod getCashBackInfoMod(
    ) {
        return this._cashBackInfoMod;
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
     * Method getDepositLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.DepositLineMod at the given index
     */
    public org.chocolate_milk.model.DepositLineMod getDepositLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._depositLineModList.size()) {
            throw new IndexOutOfBoundsException("getDepositLineMod: Index value '" + index + "' not in range [0.." + (this._depositLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DepositLineMod) _depositLineModList.get(index);
    }

    /**
     * Method getDepositLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DepositLineMod[] getDepositLineMod(
    ) {
        org.chocolate_milk.model.DepositLineMod[] array = new org.chocolate_milk.model.DepositLineMod[0];
        return (org.chocolate_milk.model.DepositLineMod[]) this._depositLineModList.toArray(array);
    }

    /**
     * Method getDepositLineModCount.
     * 
     * @return the size of this collection
     */
    public int getDepositLineModCount(
    ) {
        return this._depositLineModList.size();
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
     * Returns the value of field 'txnCoreMod'.
     * 
     * @return the value of field 'TxnCoreMod'.
     */
    public org.chocolate_milk.model.TxnCoreMod getTxnCoreMod(
    ) {
        return this._txnCoreMod;
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
     * Method iterateDepositLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DepositLineMod> iterateDepositLineMod(
    ) {
        return this._depositLineModList.iterator();
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
    public void removeAllDepositLineMod(
    ) {
        this._depositLineModList.clear();
    }

    /**
     * Method removeDepositLineMod.
     * 
     * @param vDepositLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeDepositLineMod(
            final org.chocolate_milk.model.DepositLineMod vDepositLineMod) {
        boolean removed = _depositLineModList.remove(vDepositLineMod);
        return removed;
    }

    /**
     * Method removeDepositLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DepositLineMod removeDepositLineModAt(
            final int index) {
        java.lang.Object obj = this._depositLineModList.remove(index);
        return (org.chocolate_milk.model.DepositLineMod) obj;
    }

    /**
     * Sets the value of field 'cashBackInfoMod'.
     * 
     * @param cashBackInfoMod the value of field 'cashBackInfoMod'.
     */
    public void setCashBackInfoMod(
            final org.chocolate_milk.model.CashBackInfoMod cashBackInfoMod) {
        this._cashBackInfoMod = cashBackInfoMod;
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
     * @param vDepositLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDepositLineMod(
            final int index,
            final org.chocolate_milk.model.DepositLineMod vDepositLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._depositLineModList.size()) {
            throw new IndexOutOfBoundsException("setDepositLineMod: Index value '" + index + "' not in range [0.." + (this._depositLineModList.size() - 1) + "]");
        }

        this._depositLineModList.set(index, vDepositLineMod);
    }

    /**
     * 
     * 
     * @param vDepositLineModArray
     */
    public void setDepositLineMod(
            final org.chocolate_milk.model.DepositLineMod[] vDepositLineModArray) {
        //-- copy array
        _depositLineModList.clear();

        for (int i = 0; i < vDepositLineModArray.length; i++) {
                this._depositLineModList.add(vDepositLineModArray[i]);
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
     * Sets the value of field 'txnCoreMod'.
     * 
     * @param txnCoreMod the value of field 'txnCoreMod'.
     */
    public void setTxnCoreMod(
            final org.chocolate_milk.model.TxnCoreMod txnCoreMod) {
        this._txnCoreMod = txnCoreMod;
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
     * @return the unmarshaled org.chocolate_milk.model.DepositMod
     */
    public static org.chocolate_milk.model.DepositMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DepositMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DepositMod.class, reader);
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
