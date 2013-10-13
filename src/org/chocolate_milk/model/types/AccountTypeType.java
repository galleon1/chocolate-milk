/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AccountTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration AccountTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum AccountTypeType {


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
     * Constant BANK
     */
    BANK("Bank"),
    /**
     * Constant COSTOFGOODSSOLD
     */
    COSTOFGOODSSOLD("CostOfGoodsSold"),
    /**
     * Constant CREDITCARD
     */
    CREDITCARD("CreditCard"),
    /**
     * Constant EQUITY
     */
    EQUITY("Equity"),
    /**
     * Constant EXPENSE
     */
    EXPENSE("Expense"),
    /**
     * Constant FIXEDASSET
     */
    FIXEDASSET("FixedAsset"),
    /**
     * Constant INCOME
     */
    INCOME("Income"),
    /**
     * Constant LONGTERMLIABILITY
     */
    LONGTERMLIABILITY("LongTermLiability"),
    /**
     * Constant NONPOSTING
     */
    NONPOSTING("NonPosting"),
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
    OTHERINCOME("OtherIncome");

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
    private static final java.util.Map<java.lang.String, AccountTypeType> enumConstants = new java.util.HashMap<java.lang.String, AccountTypeType>();


    static {
        for (AccountTypeType c: AccountTypeType.values()) {
            AccountTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private AccountTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.AccountTypeType fromValue(
            final java.lang.String value) {
        AccountTypeType c = AccountTypeType.enumConstants.get(value);
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
