/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesReceiptAdd implements java.io.Serializable {


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
     * Field _isPending.
     */
    private java.lang.String _isPending;

    /**
     * Field _checkNumber.
     */
    private java.lang.String _checkNumber;

    /**
     * Field _paymentMethodRef.
     */
    private org.chocolate_milk.model.PaymentMethodRef _paymentMethodRef;

    /**
     * Field _dueDate.
     */
    private java.lang.String _dueDate;

    /**
     * Field _salesRepRef.
     */
    private org.chocolate_milk.model.SalesRepRef _salesRepRef;

    /**
     * Field _shipDate.
     */
    private java.lang.String _shipDate;

    /**
     * Field _shipMethodRef.
     */
    private org.chocolate_milk.model.ShipMethodRef _shipMethodRef;

    /**
     * Field _FOB.
     */
    private java.lang.String _FOB;

    /**
     * Field _itemSalesTaxRef.
     */
    private org.chocolate_milk.model.ItemSalesTaxRef _itemSalesTaxRef;

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
     * Field _depositToAccountRef.
     */
    private org.chocolate_milk.model.DepositToAccountRef _depositToAccountRef;

    /**
     * Field _creditCardTxnInfo.
     */
    private org.chocolate_milk.model.CreditCardTxnInfo _creditCardTxnInfo;

    /**
     * Field _other.
     */
    private java.lang.String _other;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _salesReceiptAddChoice.
     */
    private org.chocolate_milk.model.SalesReceiptAddChoice _salesReceiptAddChoice;

    /**
     * Field _discountLineAdd.
     */
    private org.chocolate_milk.model.DiscountLineAdd _discountLineAdd;

    /**
     * Field _salesTaxLineAdd.
     */
    private org.chocolate_milk.model.SalesTaxLineAdd _salesTaxLineAdd;

    /**
     * Field _shippingLineAdd.
     */
    private org.chocolate_milk.model.ShippingLineAdd _shippingLineAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptAdd() {
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
     * Returns the value of field 'checkNumber'.
     * 
     * @return the value of field 'CheckNumber'.
     */
    public java.lang.String getCheckNumber(
    ) {
        return this._checkNumber;
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
     * Returns the value of field 'creditCardTxnInfo'.
     * 
     * @return the value of field 'CreditCardTxnInfo'.
     */
    public org.chocolate_milk.model.CreditCardTxnInfo getCreditCardTxnInfo(
    ) {
        return this._creditCardTxnInfo;
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
     * Returns the value of field 'depositToAccountRef'.
     * 
     * @return the value of field 'DepositToAccountRef'.
     */
    public org.chocolate_milk.model.DepositToAccountRef getDepositToAccountRef(
    ) {
        return this._depositToAccountRef;
    }

    /**
     * Returns the value of field 'discountLineAdd'.
     * 
     * @return the value of field 'DiscountLineAdd'.
     */
    public org.chocolate_milk.model.DiscountLineAdd getDiscountLineAdd(
    ) {
        return this._discountLineAdd;
    }

    /**
     * Returns the value of field 'dueDate'.
     * 
     * @return the value of field 'DueDate'.
     */
    public java.lang.String getDueDate(
    ) {
        return this._dueDate;
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
     * Returns the value of field 'FOB'.
     * 
     * @return the value of field 'FOB'.
     */
    public java.lang.String getFOB(
    ) {
        return this._FOB;
    }

    /**
     * Returns the value of field 'isPending'.
     * 
     * @return the value of field 'IsPending'.
     */
    public java.lang.String getIsPending(
    ) {
        return this._isPending;
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
     * Returns the value of field 'paymentMethodRef'.
     * 
     * @return the value of field 'PaymentMethodRef'.
     */
    public org.chocolate_milk.model.PaymentMethodRef getPaymentMethodRef(
    ) {
        return this._paymentMethodRef;
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
     * Returns the value of field 'salesReceiptAddChoice'.
     * 
     * @return the value of field 'SalesReceiptAddChoice'.
     */
    public org.chocolate_milk.model.SalesReceiptAddChoice getSalesReceiptAddChoice(
    ) {
        return this._salesReceiptAddChoice;
    }

    /**
     * Returns the value of field 'salesRepRef'.
     * 
     * @return the value of field 'SalesRepRef'.
     */
    public org.chocolate_milk.model.SalesRepRef getSalesRepRef(
    ) {
        return this._salesRepRef;
    }

    /**
     * Returns the value of field 'salesTaxLineAdd'.
     * 
     * @return the value of field 'SalesTaxLineAdd'.
     */
    public org.chocolate_milk.model.SalesTaxLineAdd getSalesTaxLineAdd(
    ) {
        return this._salesTaxLineAdd;
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
     * Returns the value of field 'shippingLineAdd'.
     * 
     * @return the value of field 'ShippingLineAdd'.
     */
    public org.chocolate_milk.model.ShippingLineAdd getShippingLineAdd(
    ) {
        return this._shippingLineAdd;
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
     * Sets the value of field 'checkNumber'.
     * 
     * @param checkNumber the value of field 'checkNumber'.
     */
    public void setCheckNumber(
            final java.lang.String checkNumber) {
        this._checkNumber = checkNumber;
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
     * Sets the value of field 'creditCardTxnInfo'.
     * 
     * @param creditCardTxnInfo the value of field
     * 'creditCardTxnInfo'.
     */
    public void setCreditCardTxnInfo(
            final org.chocolate_milk.model.CreditCardTxnInfo creditCardTxnInfo) {
        this._creditCardTxnInfo = creditCardTxnInfo;
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
     * Sets the value of field 'discountLineAdd'.
     * 
     * @param discountLineAdd the value of field 'discountLineAdd'.
     */
    public void setDiscountLineAdd(
            final org.chocolate_milk.model.DiscountLineAdd discountLineAdd) {
        this._discountLineAdd = discountLineAdd;
    }

    /**
     * Sets the value of field 'dueDate'.
     * 
     * @param dueDate the value of field 'dueDate'.
     */
    public void setDueDate(
            final java.lang.String dueDate) {
        this._dueDate = dueDate;
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
     * Sets the value of field 'FOB'.
     * 
     * @param FOB the value of field 'FOB'.
     */
    public void setFOB(
            final java.lang.String FOB) {
        this._FOB = FOB;
    }

    /**
     * Sets the value of field 'isPending'.
     * 
     * @param isPending the value of field 'isPending'.
     */
    public void setIsPending(
            final java.lang.String isPending) {
        this._isPending = isPending;
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
     * Sets the value of field 'paymentMethodRef'.
     * 
     * @param paymentMethodRef the value of field 'paymentMethodRef'
     */
    public void setPaymentMethodRef(
            final org.chocolate_milk.model.PaymentMethodRef paymentMethodRef) {
        this._paymentMethodRef = paymentMethodRef;
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
     * Sets the value of field 'salesReceiptAddChoice'.
     * 
     * @param salesReceiptAddChoice the value of field
     * 'salesReceiptAddChoice'.
     */
    public void setSalesReceiptAddChoice(
            final org.chocolate_milk.model.SalesReceiptAddChoice salesReceiptAddChoice) {
        this._salesReceiptAddChoice = salesReceiptAddChoice;
    }

    /**
     * Sets the value of field 'salesRepRef'.
     * 
     * @param salesRepRef the value of field 'salesRepRef'.
     */
    public void setSalesRepRef(
            final org.chocolate_milk.model.SalesRepRef salesRepRef) {
        this._salesRepRef = salesRepRef;
    }

    /**
     * Sets the value of field 'salesTaxLineAdd'.
     * 
     * @param salesTaxLineAdd the value of field 'salesTaxLineAdd'.
     */
    public void setSalesTaxLineAdd(
            final org.chocolate_milk.model.SalesTaxLineAdd salesTaxLineAdd) {
        this._salesTaxLineAdd = salesTaxLineAdd;
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
     * Sets the value of field 'shippingLineAdd'.
     * 
     * @param shippingLineAdd the value of field 'shippingLineAdd'.
     */
    public void setShippingLineAdd(
            final org.chocolate_milk.model.ShippingLineAdd shippingLineAdd) {
        this._shippingLineAdd = shippingLineAdd;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.SalesReceiptAdd
     */
    public static org.chocolate_milk.model.SalesReceiptAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesReceiptAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesReceiptAdd.class, reader);
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
