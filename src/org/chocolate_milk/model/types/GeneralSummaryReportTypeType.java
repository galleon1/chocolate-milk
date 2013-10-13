/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: GeneralSummaryReportTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration GeneralSummaryReportTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum GeneralSummaryReportTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant BALANCESHEETPREVYEARCOMP
     */
    BALANCESHEETPREVYEARCOMP("BalanceSheetPrevYearComp"),
    /**
     * Constant BALANCESHEETSTANDARD
     */
    BALANCESHEETSTANDARD("BalanceSheetStandard"),
    /**
     * Constant BALANCESHEETSUMMARY
     */
    BALANCESHEETSUMMARY("BalanceSheetSummary"),
    /**
     * Constant CUSTOMERBALANCESUMMARY
     */
    CUSTOMERBALANCESUMMARY("CustomerBalanceSummary"),
    /**
     * Constant EXPENSEBYVENDORSUMMARY
     */
    EXPENSEBYVENDORSUMMARY("ExpenseByVendorSummary"),
    /**
     * Constant INCOMEBYCUSTOMERSUMMARY
     */
    INCOMEBYCUSTOMERSUMMARY("IncomeByCustomerSummary"),
    /**
     * Constant INVENTORYSTOCKSTATUSBYITEM
     */
    INVENTORYSTOCKSTATUSBYITEM("InventoryStockStatusByItem"),
    /**
     * Constant INVENTORYSTOCKSTATUSBYVENDOR
     */
    INVENTORYSTOCKSTATUSBYVENDOR("InventoryStockStatusByVendor"),
    /**
     * Constant INCOMETAXSUMMARY
     */
    INCOMETAXSUMMARY("IncomeTaxSummary"),
    /**
     * Constant INVENTORYVALUATIONSUMMARY
     */
    INVENTORYVALUATIONSUMMARY("InventoryValuationSummary"),
    /**
     * Constant PHYSICALINVENTORYWORKSHEET
     */
    PHYSICALINVENTORYWORKSHEET("PhysicalInventoryWorksheet"),
    /**
     * Constant PROFITANDLOSSBYCLASS
     */
    PROFITANDLOSSBYCLASS("ProfitAndLossByClass"),
    /**
     * Constant PROFITANDLOSSBYJOB
     */
    PROFITANDLOSSBYJOB("ProfitAndLossByJob"),
    /**
     * Constant PROFITANDLOSSPREVYEARCOMP
     */
    PROFITANDLOSSPREVYEARCOMP("ProfitAndLossPrevYearComp"),
    /**
     * Constant PROFITANDLOSSSTANDARD
     */
    PROFITANDLOSSSTANDARD("ProfitAndLossStandard"),
    /**
     * Constant PROFITANDLOSSYTDCOMP
     */
    PROFITANDLOSSYTDCOMP("ProfitAndLossYTDComp"),
    /**
     * Constant PURCHASEBYITEMSUMMARY
     */
    PURCHASEBYITEMSUMMARY("PurchaseByItemSummary"),
    /**
     * Constant PURCHASEBYVENDORSUMMARY
     */
    PURCHASEBYVENDORSUMMARY("PurchaseByVendorSummary"),
    /**
     * Constant SALESBYCUSTOMERSUMMARY
     */
    SALESBYCUSTOMERSUMMARY("SalesByCustomerSummary"),
    /**
     * Constant SALESBYITEMSUMMARY
     */
    SALESBYITEMSUMMARY("SalesByItemSummary"),
    /**
     * Constant SALESBYREPSUMMARY
     */
    SALESBYREPSUMMARY("SalesByRepSummary"),
    /**
     * Constant SALESTAXLIABILITY
     */
    SALESTAXLIABILITY("SalesTaxLiability"),
    /**
     * Constant SALESTAXREVENUESUMMARY
     */
    SALESTAXREVENUESUMMARY("SalesTaxRevenueSummary"),
    /**
     * Constant TRIALBALANCE
     */
    TRIALBALANCE("TrialBalance"),
    /**
     * Constant VENDORBALANCESUMMARY
     */
    VENDORBALANCESUMMARY("VendorBalanceSummary");

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
    private static final java.util.Map<java.lang.String, GeneralSummaryReportTypeType> enumConstants = new java.util.HashMap<java.lang.String, GeneralSummaryReportTypeType>();


    static {
        for (GeneralSummaryReportTypeType c: GeneralSummaryReportTypeType.values()) {
            GeneralSummaryReportTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private GeneralSummaryReportTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.GeneralSummaryReportTypeType fromValue(
            final java.lang.String value) {
        GeneralSummaryReportTypeType c = GeneralSummaryReportTypeType.enumConstants.get(value);
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
