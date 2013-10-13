/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JournalEntryMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JournalEntryMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class JournalEntryMod implements java.io.Serializable {


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
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _isAdjustment.
     */
    private java.lang.String _isAdjustment;

    /**
     * Field _isAmountsEnteredInHomeCurrency.
     */
    private java.lang.String _isAmountsEnteredInHomeCurrency;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _journalLineModList.
     */
    private java.util.List<org.chocolate_milk.model.JournalLineMod> _journalLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public JournalEntryMod() {
        super();
        this._journalLineModList = new java.util.ArrayList<org.chocolate_milk.model.JournalLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vJournalLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJournalLineMod(
            final org.chocolate_milk.model.JournalLineMod vJournalLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._journalLineModList.add(vJournalLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vJournalLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJournalLineMod(
            final int index,
            final org.chocolate_milk.model.JournalLineMod vJournalLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._journalLineModList.add(index, vJournalLineMod);
    }

    /**
     * Method enumerateJournalLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.JournalLineMod> enumerateJournalLineMod(
    ) {
        return java.util.Collections.enumeration(this._journalLineModList);
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
     * Returns the value of field 'exchangeRate'.
     * 
     * @return the value of field 'ExchangeRate'.
     */
    public java.lang.String getExchangeRate(
    ) {
        return this._exchangeRate;
    }

    /**
     * Returns the value of field 'isAdjustment'.
     * 
     * @return the value of field 'IsAdjustment'.
     */
    public java.lang.String getIsAdjustment(
    ) {
        return this._isAdjustment;
    }

    /**
     * Returns the value of field 'isAmountsEnteredInHomeCurrency'.
     * 
     * @return the value of field 'IsAmountsEnteredInHomeCurrency'.
     */
    public java.lang.String getIsAmountsEnteredInHomeCurrency(
    ) {
        return this._isAmountsEnteredInHomeCurrency;
    }

    /**
     * Method getJournalLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.JournalLineMod at the given index
     */
    public org.chocolate_milk.model.JournalLineMod getJournalLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._journalLineModList.size()) {
            throw new IndexOutOfBoundsException("getJournalLineMod: Index value '" + index + "' not in range [0.." + (this._journalLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.JournalLineMod) _journalLineModList.get(index);
    }

    /**
     * Method getJournalLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.JournalLineMod[] getJournalLineMod(
    ) {
        org.chocolate_milk.model.JournalLineMod[] array = new org.chocolate_milk.model.JournalLineMod[0];
        return (org.chocolate_milk.model.JournalLineMod[]) this._journalLineModList.toArray(array);
    }

    /**
     * Method getJournalLineModCount.
     * 
     * @return the size of this collection
     */
    public int getJournalLineModCount(
    ) {
        return this._journalLineModList.size();
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
     * Method iterateJournalLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.JournalLineMod> iterateJournalLineMod(
    ) {
        return this._journalLineModList.iterator();
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
    public void removeAllJournalLineMod(
    ) {
        this._journalLineModList.clear();
    }

    /**
     * Method removeJournalLineMod.
     * 
     * @param vJournalLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeJournalLineMod(
            final org.chocolate_milk.model.JournalLineMod vJournalLineMod) {
        boolean removed = _journalLineModList.remove(vJournalLineMod);
        return removed;
    }

    /**
     * Method removeJournalLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.JournalLineMod removeJournalLineModAt(
            final int index) {
        java.lang.Object obj = this._journalLineModList.remove(index);
        return (org.chocolate_milk.model.JournalLineMod) obj;
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
     * Sets the value of field 'exchangeRate'.
     * 
     * @param exchangeRate the value of field 'exchangeRate'.
     */
    public void setExchangeRate(
            final java.lang.String exchangeRate) {
        this._exchangeRate = exchangeRate;
    }

    /**
     * Sets the value of field 'isAdjustment'.
     * 
     * @param isAdjustment the value of field 'isAdjustment'.
     */
    public void setIsAdjustment(
            final java.lang.String isAdjustment) {
        this._isAdjustment = isAdjustment;
    }

    /**
     * Sets the value of field 'isAmountsEnteredInHomeCurrency'.
     * 
     * @param isAmountsEnteredInHomeCurrency the value of field
     * 'isAmountsEnteredInHomeCurrency'.
     */
    public void setIsAmountsEnteredInHomeCurrency(
            final java.lang.String isAmountsEnteredInHomeCurrency) {
        this._isAmountsEnteredInHomeCurrency = isAmountsEnteredInHomeCurrency;
    }

    /**
     * 
     * 
     * @param index
     * @param vJournalLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJournalLineMod(
            final int index,
            final org.chocolate_milk.model.JournalLineMod vJournalLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._journalLineModList.size()) {
            throw new IndexOutOfBoundsException("setJournalLineMod: Index value '" + index + "' not in range [0.." + (this._journalLineModList.size() - 1) + "]");
        }

        this._journalLineModList.set(index, vJournalLineMod);
    }

    /**
     * 
     * 
     * @param vJournalLineModArray
     */
    public void setJournalLineMod(
            final org.chocolate_milk.model.JournalLineMod[] vJournalLineModArray) {
        //-- copy array
        _journalLineModList.clear();

        for (int i = 0; i < vJournalLineModArray.length; i++) {
                this._journalLineModList.add(vJournalLineModArray[i]);
        }
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
     * @return the unmarshaled
     * org.chocolate_milk.model.JournalEntryMod
     */
    public static org.chocolate_milk.model.JournalEntryMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JournalEntryMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JournalEntryMod.class, reader);
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
