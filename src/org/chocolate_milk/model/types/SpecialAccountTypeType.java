/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SpecialAccountTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration SpecialAccountTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum SpecialAccountTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ACCOUNTSPAYABLE
     */
    ACCOUNTSPAYABLE("AccountsPayable"),
    /**
     * Constant ACCOUNTSRECEIVABLE
     */
    ACCOUNTSRECEIVABLE("AccountsReceivable"),
    /**
     * Constant CONDENSEITEMADJUSTMENTEXPENSES
     */
    CONDENSEITEMADJUSTMENTEXPENSES("CondenseItemAdjustmentExpenses"),
    /**
     * Constant COSTOFGOODSSOLD
     */
    COSTOFGOODSSOLD("CostOfGoodsSold"),
    /**
     * Constant DIRECTDEPOSITLIABILITIES
     */
    DIRECTDEPOSITLIABILITIES("DirectDepositLiabilities"),
    /**
     * Constant ESTIMATES
     */
    ESTIMATES("Estimates"),
    /**
     * Constant EXCHANGEGAINLOSS
     */
    EXCHANGEGAINLOSS("ExchangeGainLoss"),
    /**
     * Constant INVENTORYASSETS
     */
    INVENTORYASSETS("InventoryAssets"),
    /**
     * Constant OPENINGBALANCEEQUITY
     */
    OPENINGBALANCEEQUITY("OpeningBalanceEquity"),
    /**
     * Constant PAYROLLEXPENSES
     */
    PAYROLLEXPENSES("PayrollExpenses"),
    /**
     * Constant PAYROLLLIABILITIES
     */
    PAYROLLLIABILITIES("PayrollLiabilities"),
    /**
     * Constant PETTYCASH
     */
    PETTYCASH("PettyCash"),
    /**
     * Constant PURCHASEORDERS
     */
    PURCHASEORDERS("PurchaseOrders"),
    /**
     * Constant RECONCILIATIONDIFFERENCES
     */
    RECONCILIATIONDIFFERENCES("ReconciliationDifferences"),
    /**
     * Constant RETAINEDEARNINGS
     */
    RETAINEDEARNINGS("RetainedEarnings"),
    /**
     * Constant SALESORDERS
     */
    SALESORDERS("SalesOrders"),
    /**
     * Constant SALESTAXPAYABLE
     */
    SALESTAXPAYABLE("SalesTaxPayable"),
    /**
     * Constant UNCATEGORIZEDEXPENSES
     */
    UNCATEGORIZEDEXPENSES("UncategorizedExpenses"),
    /**
     * Constant UNCATEGORIZEDINCOME
     */
    UNCATEGORIZEDINCOME("UncategorizedIncome"),
    /**
     * Constant UNDEPOSITEDFUNDS
     */
    UNDEPOSITEDFUNDS("UndepositedFunds");

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
    private static final java.util.Map<java.lang.String, SpecialAccountTypeType> enumConstants = new java.util.HashMap<java.lang.String, SpecialAccountTypeType>();


    static {
        for (SpecialAccountTypeType c: SpecialAccountTypeType.values()) {
            SpecialAccountTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private SpecialAccountTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.SpecialAccountTypeType fromValue(
            final java.lang.String value) {
        SpecialAccountTypeType c = SpecialAccountTypeType.enumConstants.get(value);
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
