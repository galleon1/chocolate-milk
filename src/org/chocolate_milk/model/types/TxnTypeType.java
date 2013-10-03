/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration TxnTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum TxnTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ARREFUNDCREDITCARD
     */
    ARREFUNDCREDITCARD("ARRefundCreditCard"),
    /**
     * Constant BILL
     */
    BILL("Bill"),
    /**
     * Constant BILLPAYMENTCHECK
     */
    BILLPAYMENTCHECK("BillPaymentCheck"),
    /**
     * Constant BILLPAYMENTCREDITCARD
     */
    BILLPAYMENTCREDITCARD("BillPaymentCreditCard"),
    /**
     * Constant BUILDASSEMBLY
     */
    BUILDASSEMBLY("BuildAssembly"),
    /**
     * Constant CHARGE
     */
    CHARGE("Charge"),
    /**
     * Constant CHECK
     */
    CHECK("Check"),
    /**
     * Constant CREDITCARDCHARGE
     */
    CREDITCARDCHARGE("CreditCardCharge"),
    /**
     * Constant CREDITCARDCREDIT
     */
    CREDITCARDCREDIT("CreditCardCredit"),
    /**
     * Constant CREDITMEMO
     */
    CREDITMEMO("CreditMemo"),
    /**
     * Constant DEPOSIT
     */
    DEPOSIT("Deposit"),
    /**
     * Constant ESTIMATE
     */
    ESTIMATE("Estimate"),
    /**
     * Constant INVENTORYADJUSTMENT
     */
    INVENTORYADJUSTMENT("InventoryAdjustment"),
    /**
     * Constant INVOICE
     */
    INVOICE("Invoice"),
    /**
     * Constant ITEMRECEIPT
     */
    ITEMRECEIPT("ItemReceipt"),
    /**
     * Constant JOURNALENTRY
     */
    JOURNALENTRY("JournalEntry"),
    /**
     * Constant LIABILITYADJUSTMENT
     */
    LIABILITYADJUSTMENT("LiabilityAdjustment"),
    /**
     * Constant PAYCHECK
     */
    PAYCHECK("Paycheck"),
    /**
     * Constant PAYROLLLIABILITYCHECK
     */
    PAYROLLLIABILITYCHECK("PayrollLiabilityCheck"),
    /**
     * Constant PURCHASEORDER
     */
    PURCHASEORDER("PurchaseOrder"),
    /**
     * Constant RECEIVEPAYMENT
     */
    RECEIVEPAYMENT("ReceivePayment"),
    /**
     * Constant SALESORDER
     */
    SALESORDER("SalesOrder"),
    /**
     * Constant SALESRECEIPT
     */
    SALESRECEIPT("SalesReceipt"),
    /**
     * Constant SALESTAXPAYMENTCHECK
     */
    SALESTAXPAYMENTCHECK("SalesTaxPaymentCheck"),
    /**
     * Constant TRANSFER
     */
    TRANSFER("Transfer"),
    /**
     * Constant VENDORCREDIT
     */
    VENDORCREDIT("VendorCredit"),
    /**
     * Constant YTDADJUSTMENT
     */
    YTDADJUSTMENT("YTDAdjustment");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, TxnTypeType> enumConstants = new java.util.HashMap<java.lang.String, TxnTypeType>();


    static {
        for (TxnTypeType c: TxnTypeType.values()) {
            TxnTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private TxnTypeType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.chocolate_milk.model.types.TxnTypeType fromValue(
            final java.lang.String value) {
        TxnTypeType c = TxnTypeType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
