/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesReceiptRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCore.
     */
    private org.chocolate_milk.model.TxnCore _txnCore;

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
     * Field _billAddressBlock.
     */
    private org.chocolate_milk.model.BillAddressBlock _billAddressBlock;

    /**
     * Field _shipAddress.
     */
    private org.chocolate_milk.model.ShipAddress _shipAddress;

    /**
     * Field _shipAddressBlock.
     */
    private org.chocolate_milk.model.ShipAddressBlock _shipAddressBlock;

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
     * Field _subtotal.
     */
    private java.lang.String _subtotal;

    /**
     * Field _salesTaxData.
     */
    private org.chocolate_milk.model.SalesTaxData _salesTaxData;

    /**
     * Field _totalAmount.
     */
    private java.lang.String _totalAmount;

    /**
     * Field _currencyRef.
     */
    private org.chocolate_milk.model.CurrencyRef _currencyRef;

    /**
     * Field _exchangeRate.
     */
    private java.lang.String _exchangeRate;

    /**
     * Field _totalAmountInHomeCurrency.
     */
    private java.lang.String _totalAmountInHomeCurrency;

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
     * Field _salesReceiptRetChoice.
     */
    private org.chocolate_milk.model.SalesReceiptRetChoice _salesReceiptRetChoice;

    /**
     * Field _discountLineRet.
     */
    private org.chocolate_milk.model.DiscountLineRet _discountLineRet;

    /**
     * Field _salesTaxLineRet.
     */
    private org.chocolate_milk.model.SalesTaxLineRet _salesTaxLineRet;

    /**
     * Field _shippingLineRet.
     */
    private org.chocolate_milk.model.ShippingLineRet _shippingLineRet;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptRet() {
        super();
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
     * Returns the value of field 'billAddress'.
     * 
     * @return the value of field 'BillAddress'.
     */
    public org.chocolate_milk.model.BillAddress getBillAddress(
    ) {
        return this._billAddress;
    }

    /**
     * Returns the value of field 'billAddressBlock'.
     * 
     * @return the value of field 'BillAddressBlock'.
     */
    public org.chocolate_milk.model.BillAddressBlock getBillAddressBlock(
    ) {
        return this._billAddressBlock;
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
     * Returns the value of field 'currencyRef'.
     * 
     * @return the value of field 'CurrencyRef'.
     */
    public org.chocolate_milk.model.CurrencyRef getCurrencyRef(
    ) {
        return this._currencyRef;
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
     * Returns the value of field 'depositToAccountRef'.
     * 
     * @return the value of field 'DepositToAccountRef'.
     */
    public org.chocolate_milk.model.DepositToAccountRef getDepositToAccountRef(
    ) {
        return this._depositToAccountRef;
    }

    /**
     * Returns the value of field 'discountLineRet'.
     * 
     * @return the value of field 'DiscountLineRet'.
     */
    public org.chocolate_milk.model.DiscountLineRet getDiscountLineRet(
    ) {
        return this._discountLineRet;
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
     * Returns the value of field 'salesReceiptRetChoice'.
     * 
     * @return the value of field 'SalesReceiptRetChoice'.
     */
    public org.chocolate_milk.model.SalesReceiptRetChoice getSalesReceiptRetChoice(
    ) {
        return this._salesReceiptRetChoice;
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
     * Returns the value of field 'salesTaxData'.
     * 
     * @return the value of field 'SalesTaxData'.
     */
    public org.chocolate_milk.model.SalesTaxData getSalesTaxData(
    ) {
        return this._salesTaxData;
    }

    /**
     * Returns the value of field 'salesTaxLineRet'.
     * 
     * @return the value of field 'SalesTaxLineRet'.
     */
    public org.chocolate_milk.model.SalesTaxLineRet getSalesTaxLineRet(
    ) {
        return this._salesTaxLineRet;
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
     * Returns the value of field 'shipAddressBlock'.
     * 
     * @return the value of field 'ShipAddressBlock'.
     */
    public org.chocolate_milk.model.ShipAddressBlock getShipAddressBlock(
    ) {
        return this._shipAddressBlock;
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
     * Returns the value of field 'shippingLineRet'.
     * 
     * @return the value of field 'ShippingLineRet'.
     */
    public org.chocolate_milk.model.ShippingLineRet getShippingLineRet(
    ) {
        return this._shippingLineRet;
    }

    /**
     * Returns the value of field 'subtotal'.
     * 
     * @return the value of field 'Subtotal'.
     */
    public java.lang.String getSubtotal(
    ) {
        return this._subtotal;
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
     * Returns the value of field 'totalAmount'.
     * 
     * @return the value of field 'TotalAmount'.
     */
    public java.lang.String getTotalAmount(
    ) {
        return this._totalAmount;
    }

    /**
     * Returns the value of field 'totalAmountInHomeCurrency'.
     * 
     * @return the value of field 'TotalAmountInHomeCurrency'.
     */
    public java.lang.String getTotalAmountInHomeCurrency(
    ) {
        return this._totalAmountInHomeCurrency;
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
     * Sets the value of field 'billAddress'.
     * 
     * @param billAddress the value of field 'billAddress'.
     */
    public void setBillAddress(
            final org.chocolate_milk.model.BillAddress billAddress) {
        this._billAddress = billAddress;
    }

    /**
     * Sets the value of field 'billAddressBlock'.
     * 
     * @param billAddressBlock the value of field 'billAddressBlock'
     */
    public void setBillAddressBlock(
            final org.chocolate_milk.model.BillAddressBlock billAddressBlock) {
        this._billAddressBlock = billAddressBlock;
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
     * Sets the value of field 'currencyRef'.
     * 
     * @param currencyRef the value of field 'currencyRef'.
     */
    public void setCurrencyRef(
            final org.chocolate_milk.model.CurrencyRef currencyRef) {
        this._currencyRef = currencyRef;
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
     * Sets the value of field 'discountLineRet'.
     * 
     * @param discountLineRet the value of field 'discountLineRet'.
     */
    public void setDiscountLineRet(
            final org.chocolate_milk.model.DiscountLineRet discountLineRet) {
        this._discountLineRet = discountLineRet;
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
     * Sets the value of field 'salesReceiptRetChoice'.
     * 
     * @param salesReceiptRetChoice the value of field
     * 'salesReceiptRetChoice'.
     */
    public void setSalesReceiptRetChoice(
            final org.chocolate_milk.model.SalesReceiptRetChoice salesReceiptRetChoice) {
        this._salesReceiptRetChoice = salesReceiptRetChoice;
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
     * Sets the value of field 'salesTaxData'.
     * 
     * @param salesTaxData the value of field 'salesTaxData'.
     */
    public void setSalesTaxData(
            final org.chocolate_milk.model.SalesTaxData salesTaxData) {
        this._salesTaxData = salesTaxData;
    }

    /**
     * Sets the value of field 'salesTaxLineRet'.
     * 
     * @param salesTaxLineRet the value of field 'salesTaxLineRet'.
     */
    public void setSalesTaxLineRet(
            final org.chocolate_milk.model.SalesTaxLineRet salesTaxLineRet) {
        this._salesTaxLineRet = salesTaxLineRet;
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
     * Sets the value of field 'shipAddressBlock'.
     * 
     * @param shipAddressBlock the value of field 'shipAddressBlock'
     */
    public void setShipAddressBlock(
            final org.chocolate_milk.model.ShipAddressBlock shipAddressBlock) {
        this._shipAddressBlock = shipAddressBlock;
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
     * Sets the value of field 'shippingLineRet'.
     * 
     * @param shippingLineRet the value of field 'shippingLineRet'.
     */
    public void setShippingLineRet(
            final org.chocolate_milk.model.ShippingLineRet shippingLineRet) {
        this._shippingLineRet = shippingLineRet;
    }

    /**
     * Sets the value of field 'subtotal'.
     * 
     * @param subtotal the value of field 'subtotal'.
     */
    public void setSubtotal(
            final java.lang.String subtotal) {
        this._subtotal = subtotal;
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
     * Sets the value of field 'totalAmount'.
     * 
     * @param totalAmount the value of field 'totalAmount'.
     */
    public void setTotalAmount(
            final java.lang.String totalAmount) {
        this._totalAmount = totalAmount;
    }

    /**
     * Sets the value of field 'totalAmountInHomeCurrency'.
     * 
     * @param totalAmountInHomeCurrency the value of field
     * 'totalAmountInHomeCurrency'.
     */
    public void setTotalAmountInHomeCurrency(
            final java.lang.String totalAmountInHomeCurrency) {
        this._totalAmountInHomeCurrency = totalAmountInHomeCurrency;
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
     * org.chocolate_milk.model.SalesReceiptRet
     */
    public static org.chocolate_milk.model.SalesReceiptRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesReceiptRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesReceiptRet.class, reader);
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
