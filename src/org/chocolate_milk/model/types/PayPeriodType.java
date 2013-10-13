/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PayPeriodType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration PayPeriodType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum PayPeriodType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant DAILY
     */
    DAILY("Daily"),
    /**
     * Constant WEEKLY
     */
    WEEKLY("Weekly"),
    /**
     * Constant BIWEEKLY
     */
    BIWEEKLY("Biweekly"),
    /**
     * Constant SEMIMONTHLY
     */
    SEMIMONTHLY("Semimonthly"),
    /**
     * Constant MONTHLY
     */
    MONTHLY("Monthly"),
    /**
     * Constant QUARTERLY
     */
    QUARTERLY("Quarterly"),
    /**
     * Constant YEARLY
     */
    YEARLY("Yearly");

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
    private static final java.util.Map<java.lang.String, PayPeriodType> enumConstants = new java.util.HashMap<java.lang.String, PayPeriodType>();


    static {
        for (PayPeriodType c: PayPeriodType.values()) {
            PayPeriodType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private PayPeriodType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.PayPeriodType fromValue(
            final java.lang.String value) {
        PayPeriodType c = PayPeriodType.enumConstants.get(value);
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
