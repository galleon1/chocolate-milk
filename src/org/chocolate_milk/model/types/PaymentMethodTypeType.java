/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PaymentMethodTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration PaymentMethodTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum PaymentMethodTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant AMERICANEXPRESS
     */
    AMERICANEXPRESS("AmericanExpress"),
    /**
     * Constant CASH
     */
    CASH("Cash"),
    /**
     * Constant CHECK
     */
    CHECK("Check"),
    /**
     * Constant DEBITCARD
     */
    DEBITCARD("DebitCard"),
    /**
     * Constant DISCOVER
     */
    DISCOVER("Discover"),
    /**
     * Constant ECHECK
     */
    ECHECK("ECheck"),
    /**
     * Constant GIFTCARD
     */
    GIFTCARD("GiftCard"),
    /**
     * Constant MASTERCARD
     */
    MASTERCARD("MasterCard"),
    /**
     * Constant OTHER
     */
    OTHER("Other"),
    /**
     * Constant OTHERCREDITCARD
     */
    OTHERCREDITCARD("OtherCreditCard"),
    /**
     * Constant VISA
     */
    VISA("Visa");

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
    private static final java.util.Map<java.lang.String, PaymentMethodTypeType> enumConstants = new java.util.HashMap<java.lang.String, PaymentMethodTypeType>();


    static {
        for (PaymentMethodTypeType c: PaymentMethodTypeType.values()) {
            PaymentMethodTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private PaymentMethodTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.PaymentMethodTypeType fromValue(
            final java.lang.String value) {
        PaymentMethodTypeType c = PaymentMethodTypeType.enumConstants.get(value);
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
