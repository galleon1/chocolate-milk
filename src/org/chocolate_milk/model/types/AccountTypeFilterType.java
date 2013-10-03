/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AccountTypeFilterType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration AccountTypeFilterType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum AccountTypeFilterType {


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
     * Constant ALLOWEDFOR1099
     */
    ALLOWEDFOR1099("AllowedFor1099"),
    /**
     * Constant APANDSALESTAX
     */
    APANDSALESTAX("APAndSalesTax"),
    /**
     * Constant APORCREDITCARD
     */
    APORCREDITCARD("APOrCreditCard"),
    /**
     * Constant ARANDAP
     */
    ARANDAP("ARAndAP"),
    /**
     * Constant ASSET
     */
    ASSET("Asset"),
    /**
     * Constant BALANCESHEET
     */
    BALANCESHEET("BalanceSheet"),
    /**
     * Constant BANK
     */
    BANK("Bank"),
    /**
     * Constant BANKANDARANDAPANDUF
     */
    BANKANDARANDAPANDUF("BankAndARAndAPAndUF"),
    /**
     * Constant BANKANDUF
     */
    BANKANDUF("BankAndUF"),
    /**
     * Constant COSTOFSALES
     */
    COSTOFSALES("CostOfSales"),
    /**
     * Constant CREDITCARD
     */
    CREDITCARD("CreditCard"),
    /**
     * Constant CURRENTASSET
     */
    CURRENTASSET("CurrentAsset"),
    /**
     * Constant CURRENTASSETANDEXPENSE
     */
    CURRENTASSETANDEXPENSE("CurrentAssetAndExpense"),
    /**
     * Constant CURRENTLIABILITY
     */
    CURRENTLIABILITY("CurrentLiability"),
    /**
     * Constant EQUITY
     */
    EQUITY("Equity"),
    /**
     * Constant EQUITYANDINCOMEANDEXPENSE
     */
    EQUITYANDINCOMEANDEXPENSE("EquityAndIncomeAndExpense"),
    /**
     * Constant EXPENSEANDOTHEREXPENSE
     */
    EXPENSEANDOTHEREXPENSE("ExpenseAndOtherExpense"),
    /**
     * Constant FIXEDASSET
     */
    FIXEDASSET("FixedAsset"),
    /**
     * Constant INCOMEANDEXPENSE
     */
    INCOMEANDEXPENSE("IncomeAndExpense"),
    /**
     * Constant INCOMEANDOTHERINCOME
     */
    INCOMEANDOTHERINCOME("IncomeAndOtherIncome"),
    /**
     * Constant LIABILITY
     */
    LIABILITY("Liability"),
    /**
     * Constant LIABILITYANDEQUITY
     */
    LIABILITYANDEQUITY("LiabilityAndEquity"),
    /**
     * Constant LONGTERMLIABILITY
     */
    LONGTERMLIABILITY("LongTermLiability"),
    /**
     * Constant NONPOSTING
     */
    NONPOSTING("NonPosting"),
    /**
     * Constant ORDINARYEXPENSE
     */
    ORDINARYEXPENSE("OrdinaryExpense"),
    /**
     * Constant ORDINARYINCOME
     */
    ORDINARYINCOME("OrdinaryIncome"),
    /**
     * Constant ORDINARYINCOMEANDCOGS
     */
    ORDINARYINCOMEANDCOGS("OrdinaryIncomeAndCOGS"),
    /**
     * Constant ORDINARYINCOMEANDEXPENSE
     */
    ORDINARYINCOMEANDEXPENSE("OrdinaryIncomeAndExpense"),
    /**
     * Constant OTHERASSET
     */
    OTHERASSET("OtherAsset"),
    /**
     * Constant OTHERCURRENTASSET
     */
    OTHERCURRENTASSET("OtherCurrentAsset"),
    /**
     * Constant OTHERCURRENTLIABILITY
     */
    OTHERCURRENTLIABILITY("OtherCurrentLiability"),
    /**
     * Constant OTHEREXPENSE
     */
    OTHEREXPENSE("OtherExpense"),
    /**
     * Constant OTHERINCOME
     */
    OTHERINCOME("OtherIncome"),
    /**
     * Constant OTHERINCOMEOREXPENSE
     */
    OTHERINCOMEOREXPENSE("OtherIncomeOrExpense");

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
    private static final java.util.Map<java.lang.String, AccountTypeFilterType> enumConstants = new java.util.HashMap<java.lang.String, AccountTypeFilterType>();


    static {
        for (AccountTypeFilterType c: AccountTypeFilterType.values()) {
            AccountTypeFilterType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private AccountTypeFilterType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.AccountTypeFilterType fromValue(
            final java.lang.String value) {
        AccountTypeFilterType c = AccountTypeFilterType.enumConstants.get(value);
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
