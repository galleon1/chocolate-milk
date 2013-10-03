/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesOrderAdd.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesOrderAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesOrderAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _customerRef.
     */
    private org.chocolate_milk.model.CustomerRef _customerRef;

    /**
     * Field _classRef.
     */
    private org.chocolate_milk.model.ClassRef _classRef;

    /**
     * Field _templateRef.
     */
    private org.chocolate_milk.model.TemplateRef _templateRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _billAddress.
     */
    private org.chocolate_milk.model.BillAddress _billAddress;

    /**
     * Field _shipAddress.
     */
    private org.chocolate_milk.model.ShipAddress _shipAddress;

    /**
     * Field _txnFieldsCore.
     */
    private org.chocolate_milk.model.TxnFieldsCore _txnFieldsCore;

    /**
     * Field _shipDate.
     */
    private java.lang.String _shipDate;

    /**
     * Field _shipMethodRef.
     */
    private org.chocolate_milk.model.ShipMethodRef _shipMethodRef;

    /**
     * Field _itemSalesTaxRef.
     */
    private org.chocolate_milk.model.ItemSalesTaxRef _itemSalesTaxRef;

    /**
     * Field _isManuallyClosed.
     */
    private java.lang.String _isManuallyClosed;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _customerMsgRef.
     */
    private org.chocolate_milk.model.CustomerMsgRef _customerMsgRef;

    /**
     * Field _isToBePrinted.
     */
    private java.lang.String _isToBePrinted;

    /**
     * Field _isToBeEmailed.
     */
    private java.lang.String _isToBeEmailed;

    /**
     * Field _isTaxIncluded.
     */
    private java.lang.String _isTaxIncluded;

    /**
     * Field _customerSalesTaxCodeRef.
     */
    private org.chocolate_milk.model.CustomerSalesTaxCodeRef _customerSalesTaxCodeRef;

    /**
     * Field _other.
     */
    private java.lang.String _other;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _salesOrderAddChoice.
     */
    private org.chocolate_milk.model.SalesOrderAddChoice _salesOrderAddChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesOrderAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'billAddress'.
     * 
     * @return the value of field 'BillAddress'.
     */
    public org.chocolate_milk.model.BillAddress getBillAddress(
    ) {
        return this._billAddress;
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
     * Returns the value of field 'customerMsgRef'.
     * 
     * @return the value of field 'CustomerMsgRef'.
     */
    public org.chocolate_milk.model.CustomerMsgRef getCustomerMsgRef(
    ) {
        return this._customerMsgRef;
    }

    /**
     * Returns the value of field 'customerRef'.
     * 
     * @return the value of field 'CustomerRef'.
     */
    public org.chocolate_milk.model.CustomerRef getCustomerRef(
    ) {
        return this._customerRef;
    }

    /**
     * Returns the value of field 'customerSalesTaxCodeRef'.
     * 
     * @return the value of field 'CustomerSalesTaxCodeRef'.
     */
    public org.chocolate_milk.model.CustomerSalesTaxCodeRef getCustomerSalesTaxCodeRef(
    ) {
        return this._customerSalesTaxCodeRef;
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
     * Returns the value of field 'exchangeRate'.
     * 
     * @return the value of field 'ExchangeRate'.
     */
    public java.lang.String getExchangeRate(
    ) {
        return this._exchangeRate;
    }

    /**
     * Returns the value of field 'isManuallyClosed'.
     * 
     * @return the value of field 'IsManuallyClosed'.
     */
    public java.lang.String getIsManuallyClosed(
    ) {
        return this._isManuallyClosed;
    }

    /**
     * Returns the value of field 'isTaxIncluded'.
     * 
     * @return the value of field 'IsTaxIncluded'.
     */
    public java.lang.String getIsTaxIncluded(
    ) {
        return this._isTaxIncluded;
    }

    /**
     * Returns the value of field 'isToBeEmailed'.
     * 
     * @return the value of field 'IsToBeEmailed'.
     */
    public java.lang.String getIsToBeEmailed(
    ) {
        return this._isToBeEmailed;
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
     * Returns the value of field 'other'.
     * 
     * @return the value of field 'Other'.
     */
    public java.lang.String getOther(
    ) {
        return this._other;
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
     * Returns the value of field 'salesOrderAddChoice'.
     * 
     * @return the value of field 'SalesOrderAddChoice'.
     */
    public org.chocolate_milk.model.SalesOrderAddChoice getSalesOrderAddChoice(
    ) {
        return this._salesOrderAddChoice;
    }

    /**
     * Returns the value of field 'shipAddress'.
     * 
     * @return the value of field 'ShipAddress'.
     */
    public org.chocolate_milk.model.ShipAddress getShipAddress(
    ) {
        return this._shipAddress;
    }

    /**
     * Returns the value of field 'shipDate'.
     * 
     * @return the value of field 'ShipDate'.
     */
    public java.lang.String getShipDate(
    ) {
        return this._shipDate;
    }

    /**
     * Returns the value of field 'shipMethodRef'.
     * 
     * @return the value of field 'ShipMethodRef'.
     */
    public org.chocolate_milk.model.ShipMethodRef getShipMethodRef(
    ) {
        return this._shipMethodRef;
    }

    /**
     * Returns the value of field 'templateRef'.
     * 
     * @return the value of field 'TemplateRef'.
     */
    public org.chocolate_milk.model.TemplateRef getTemplateRef(
    ) {
        return this._templateRef;
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
     * Returns the value of field 'txnFieldsCore'.
     * 
     * @return the value of field 'TxnFieldsCore'.
     */
    public org.chocolate_milk.model.TxnFieldsCore getTxnFieldsCore(
    ) {
        return this._txnFieldsCore;
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
     * Sets the value of field 'billAddress'.
     * 
     * @param billAddress the value of field 'billAddress'.
     */
    public void setBillAddress(
            final org.chocolate_milk.model.BillAddress billAddress) {
        this._billAddress = billAddress;
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
     * Sets the value of field 'customerMsgRef'.
     * 
     * @param customerMsgRef the value of field 'customerMsgRef'.
     */
    public void setCustomerMsgRef(
            final org.chocolate_milk.model.CustomerMsgRef customerMsgRef) {
        this._customerMsgRef = customerMsgRef;
    }

    /**
     * Sets the value of field 'customerRef'.
     * 
     * @param customerRef the value of field 'customerRef'.
     */
    public void setCustomerRef(
            final org.chocolate_milk.model.CustomerRef customerRef) {
        this._customerRef = customerRef;
    }

    /**
     * Sets the value of field 'customerSalesTaxCodeRef'.
     * 
     * @param customerSalesTaxCodeRef the value of field
     * 'customerSalesTaxCodeRef'.
     */
    public void setCustomerSalesTaxCodeRef(
            final org.chocolate_milk.model.CustomerSalesTaxCodeRef customerSalesTaxCodeRef) {
        this._customerSalesTaxCodeRef = customerSalesTaxCodeRef;
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
     * Sets the value of field 'exchangeRate'.
     * 
     * @param exchangeRate the value of field 'exchangeRate'.
     */
    public void setExchangeRate(
            final java.lang.String exchangeRate) {
        this._exchangeRate = exchangeRate;
    }

    /**
     * Sets the value of field 'isManuallyClosed'.
     * 
     * @param isManuallyClosed the value of field 'isManuallyClosed'
     */
    public void setIsManuallyClosed(
            final java.lang.String isManuallyClosed) {
        this._isManuallyClosed = isManuallyClosed;
    }

    /**
     * Sets the value of field 'isTaxIncluded'.
     * 
     * @param isTaxIncluded the value of field 'isTaxIncluded'.
     */
    public void setIsTaxIncluded(
            final java.lang.String isTaxIncluded) {
        this._isTaxIncluded = isTaxIncluded;
    }

    /**
     * Sets the value of field 'isToBeEmailed'.
     * 
     * @param isToBeEmailed the value of field 'isToBeEmailed'.
     */
    public void setIsToBeEmailed(
            final java.lang.String isToBeEmailed) {
        this._isToBeEmailed = isToBeEmailed;
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
     * Sets the value of field 'other'.
     * 
     * @param other the value of field 'other'.
     */
    public void setOther(
            final java.lang.String other) {
        this._other = other;
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
     * Sets the value of field 'salesOrderAddChoice'.
     * 
     * @param salesOrderAddChoice the value of field
     * 'salesOrderAddChoice'.
     */
    public void setSalesOrderAddChoice(
            final org.chocolate_milk.model.SalesOrderAddChoice salesOrderAddChoice) {
        this._salesOrderAddChoice = salesOrderAddChoice;
    }

    /**
     * Sets the value of field 'shipAddress'.
     * 
     * @param shipAddress the value of field 'shipAddress'.
     */
    public void setShipAddress(
            final org.chocolate_milk.model.ShipAddress shipAddress) {
        this._shipAddress = shipAddress;
    }

    /**
     * Sets the value of field 'shipDate'.
     * 
     * @param shipDate the value of field 'shipDate'.
     */
    public void setShipDate(
            final java.lang.String shipDate) {
        this._shipDate = shipDate;
    }

    /**
     * Sets the value of field 'shipMethodRef'.
     * 
     * @param shipMethodRef the value of field 'shipMethodRef'.
     */
    public void setShipMethodRef(
            final org.chocolate_milk.model.ShipMethodRef shipMethodRef) {
        this._shipMethodRef = shipMethodRef;
    }

    /**
     * Sets the value of field 'templateRef'.
     * 
     * @param templateRef the value of field 'templateRef'.
     */
    public void setTemplateRef(
            final org.chocolate_milk.model.TemplateRef templateRef) {
        this._templateRef = templateRef;
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
     * Sets the value of field 'txnFieldsCore'.
     * 
     * @param txnFieldsCore the value of field 'txnFieldsCore'.
     */
    public void setTxnFieldsCore(
            final org.chocolate_milk.model.TxnFieldsCore txnFieldsCore) {
        this._txnFieldsCore = txnFieldsCore;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.SalesOrderAd
     */
    public static org.chocolate_milk.model.SalesOrderAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesOrderAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesOrderAdd.class, reader);
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
