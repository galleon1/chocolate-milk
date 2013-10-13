/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JournalDebitLine.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JournalDebitLine.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class JournalDebitLine implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _accountRef.
     */
    private org.chocolate_milk.model.AccountRef _accountRef;

    /**
     * Field _amount.
     */
    private java.lang.String _amount;

    /**
     * Field _taxAmount.
     */
    private java.lang.String _taxAmount;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _entityRef.
     */
    private org.chocolate_milk.model.EntityRef _entityRef;

    /**
     * Field _classRef.
     */
    private org.chocolate_milk.model.ClassRef _classRef;

    /**
     * Field _itemSalesTaxRef.
     */
    private org.chocolate_milk.model.ItemSalesTaxRef _itemSalesTaxRef;

    /**
     * Field _billableStatus.
     */
    private org.chocolate_milk.model.types.BillableStatusType _billableStatus;


      //----------------/
     //- Constructors -/
    //----------------/

    public JournalDebitLine() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'accountRef'.
     * 
     * @return the value of field 'AccountRef'.
     */
    public org.chocolate_milk.model.AccountRef getAccountRef(
    ) {
        return this._accountRef;
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
     * Returns the value of field 'billableStatus'.
     * 
     * @return the value of field 'BillableStatus'.
     */
    public org.chocolate_milk.model.types.BillableStatusType getBillableStatus(
    ) {
        return this._billableStatus;
    }

    /**
     * Returns the value of field 'classRef'.
     * 
     * @return the value of field 'ClassRef'.
     */
    public org.chocolate_milk.model.ClassRef getClassRef(
    ) {
        return this._classRef;
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
     * Returns the value of field 'entityRef'.
     * 
     * @return the value of field 'EntityRef'.
     */
    public org.chocolate_milk.model.EntityRef getEntityRef(
    ) {
        return this._entityRef;
    }

    /**
     * Returns the value of field 'itemSalesTaxRef'.
     * 
     * @return the value of field 'ItemSalesTaxRef'.
     */
    public org.chocolate_milk.model.ItemSalesTaxRef getItemSalesTaxRef(
    ) {
        return this._itemSalesTaxRef;
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
     * Returns the value of field 'taxAmount'.
     * 
     * @return the value of field 'TaxAmount'.
     */
    public java.lang.String getTaxAmount(
    ) {
        return this._taxAmount;
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
     * Sets the value of field 'accountRef'.
     * 
     * @param accountRef the value of field 'accountRef'.
     */
    public void setAccountRef(
            final org.chocolate_milk.model.AccountRef accountRef) {
        this._accountRef = accountRef;
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
     * Sets the value of field 'billableStatus'.
     * 
     * @param billableStatus the value of field 'billableStatus'.
     */
    public void setBillableStatus(
            final org.chocolate_milk.model.types.BillableStatusType billableStatus) {
        this._billableStatus = billableStatus;
    }

    /**
     * Sets the value of field 'classRef'.
     * 
     * @param classRef the value of field 'classRef'.
     */
    public void setClassRef(
            final org.chocolate_milk.model.ClassRef classRef) {
        this._classRef = classRef;
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
     * Sets the value of field 'entityRef'.
     * 
     * @param entityRef the value of field 'entityRef'.
     */
    public void setEntityRef(
            final org.chocolate_milk.model.EntityRef entityRef) {
        this._entityRef = entityRef;
    }

    /**
     * Sets the value of field 'itemSalesTaxRef'.
     * 
     * @param itemSalesTaxRef the value of field 'itemSalesTaxRef'.
     */
    public void setItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef itemSalesTaxRef) {
        this._itemSalesTaxRef = itemSalesTaxRef;
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
     * Sets the value of field 'taxAmount'.
     * 
     * @param taxAmount the value of field 'taxAmount'.
     */
    public void setTaxAmount(
            final java.lang.String taxAmount) {
        this._taxAmount = taxAmount;
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
     * org.chocolate_milk.model.JournalDebitLine
     */
    public static org.chocolate_milk.model.JournalDebitLine unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JournalDebitLine) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JournalDebitLine.class, reader);
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
