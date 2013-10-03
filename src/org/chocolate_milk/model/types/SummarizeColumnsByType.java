/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SummarizeColumnsByType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration SummarizeColumnsByType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum SummarizeColumnsByType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ACCOUNT
     */
    ACCOUNT("Account"),
    /**
     * Constant BALANCESHEET
     */
    BALANCESHEET("BalanceSheet"),
    /**
     * Constant CLASS
     */
    CLASS("Class"),
    /**
     * Constant CUSTOMER
     */
    CUSTOMER("Customer"),
    /**
     * Constant CUSTOMERTYPE
     */
    CUSTOMERTYPE("CustomerType"),
    /**
     * Constant DAY
     */
    DAY("Day"),
    /**
     * Constant EMPLOYEE
     */
    EMPLOYEE("Employee"),
    /**
     * Constant FOURWEEK
     */
    FOURWEEK("FourWeek"),
    /**
     * Constant HALFMONTH
     */
    HALFMONTH("HalfMonth"),
    /**
     * Constant INCOMESTATEMENT
     */
    INCOMESTATEMENT("IncomeStatement"),
    /**
     * Constant ITEMDETAIL
     */
    ITEMDETAIL("ItemDetail"),
    /**
     * Constant ITEMTYPE
     */
    ITEMTYPE("ItemType"),
    /**
     * Constant MONTH
     */
    MONTH("Month"),
    /**
     * Constant PAYEE
     */
    PAYEE("Payee"),
    /**
     * Constant PAYMENTMETHOD
     */
    PAYMENTMETHOD("PaymentMethod"),
    /**
     * Constant PAYROLLITEMDETAIL
     */
    PAYROLLITEMDETAIL("PayrollItemDetail"),
    /**
     * Constant PAYROLLYTDDETAIL
     */
    PAYROLLYTDDETAIL("PayrollYtdDetail"),
    /**
     * Constant QUARTER
     */
    QUARTER("Quarter"),
    /**
     * Constant SALESREP
     */
    SALESREP("SalesRep"),
    /**
     * Constant SALESTAXCODE
     */
    SALESTAXCODE("SalesTaxCode"),
    /**
     * Constant SHIPMETHOD
     */
    SHIPMETHOD("ShipMethod"),
    /**
     * Constant TERMS
     */
    TERMS("Terms"),
    /**
     * Constant TOTALONLY
     */
    TOTALONLY("TotalOnly"),
    /**
     * Constant TWOWEEK
     */
    TWOWEEK("TwoWeek"),
    /**
     * Constant VENDOR
     */
    VENDOR("Vendor"),
    /**
     * Constant VENDORTYPE
     */
    VENDORTYPE("VendorType"),
    /**
     * Constant WEEK
     */
    WEEK("Week"),
    /**
     * Constant YEAR
     */
    YEAR("Year");

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
    private static final java.util.Map<java.lang.String, SummarizeColumnsByType> enumConstants = new java.util.HashMap<java.lang.String, SummarizeColumnsByType>();


    static {
        for (SummarizeColumnsByType c: SummarizeColumnsByType.values()) {
            SummarizeColumnsByType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private SummarizeColumnsByType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.SummarizeColumnsByType fromValue(
            final java.lang.String value) {
        SummarizeColumnsByType c = SummarizeColumnsByType.enumConstants.get(value);
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
