/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: GeneralDetailReportTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration GeneralDetailReportTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum GeneralDetailReportTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant VALUE_0
     */
    VALUE_0("1099Detail"),
    /**
     * Constant VALUE_1
     */
    VALUE_1("AuditTrail"),
    /**
     * Constant VALUE_2
     */
    VALUE_2("BalanceSheetDetail"),
    /**
     * Constant VALUE_3
     */
    VALUE_3("CheckDetail"),
    /**
     * Constant VALUE_4
     */
    VALUE_4("CustomerBalanceDetail"),
    /**
     * Constant VALUE_5
     */
    VALUE_5("DepositDetail"),
    /**
     * Constant VALUE_6
     */
    VALUE_6("EstimatesByJob"),
    /**
     * Constant VALUE_7
     */
    VALUE_7("ExpenseByVendorDetail"),
    /**
     * Constant VALUE_8
     */
    VALUE_8("GeneralLedger"),
    /**
     * Constant VALUE_9
     */
    VALUE_9("IncomeByCustomerDetail"),
    /**
     * Constant VALUE_10
     */
    VALUE_10("IncomeTaxDetail"),
    /**
     * Constant VALUE_11
     */
    VALUE_11("InventoryValuationDetail"),
    /**
     * Constant VALUE_12
     */
    VALUE_12("JobProgressInvoicesVsEstimates"),
    /**
     * Constant VALUE_13
     */
    VALUE_13("Journal"),
    /**
     * Constant VALUE_14
     */
    VALUE_14("MissingChecks"),
    /**
     * Constant VALUE_15
     */
    VALUE_15("OpenInvoices"),
    /**
     * Constant VALUE_16
     */
    VALUE_16("OpenPOs"),
    /**
     * Constant VALUE_17
     */
    VALUE_17("OpenPOsByJob"),
    /**
     * Constant VALUE_18
     */
    VALUE_18("OpenSalesOrderByCustomer"),
    /**
     * Constant VALUE_19
     */
    VALUE_19("OpenSalesOrderByItem"),
    /**
     * Constant VALUE_20
     */
    VALUE_20("PendingSales"),
    /**
     * Constant VALUE_21
     */
    VALUE_21("ProfitAndLossDetail"),
    /**
     * Constant VALUE_22
     */
    VALUE_22("PurchaseByItemDetail"),
    /**
     * Constant VALUE_23
     */
    VALUE_23("PurchaseByVendorDetail"),
    /**
     * Constant VALUE_24
     */
    VALUE_24("SalesByCustomerDetail"),
    /**
     * Constant VALUE_25
     */
    VALUE_25("SalesByItemDetail"),
    /**
     * Constant VALUE_26
     */
    VALUE_26("SalesByRepDetail"),
    /**
     * Constant VALUE_27
     */
    VALUE_27("TxnDetailByAccount"),
    /**
     * Constant VALUE_28
     */
    VALUE_28("TxnListByCustomer"),
    /**
     * Constant VALUE_29
     */
    VALUE_29("TxnListByDate"),
    /**
     * Constant VALUE_30
     */
    VALUE_30("TxnListByVendor"),
    /**
     * Constant VALUE_31
     */
    VALUE_31("UnpaidBillsDetail"),
    /**
     * Constant VALUE_32
     */
    VALUE_32("UnbilledCostsByJob"),
    /**
     * Constant VALUE_33
     */
    VALUE_33("VendorBalanceDetail");

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
    private static final java.util.Map<java.lang.String, GeneralDetailReportTypeType> enumConstants = new java.util.HashMap<java.lang.String, GeneralDetailReportTypeType>();


    static {
        for (GeneralDetailReportTypeType c: GeneralDetailReportTypeType.values()) {
            GeneralDetailReportTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private GeneralDetailReportTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.GeneralDetailReportTypeType fromValue(
            final java.lang.String value) {
        GeneralDetailReportTypeType c = GeneralDetailReportTypeType.enumConstants.get(value);
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
