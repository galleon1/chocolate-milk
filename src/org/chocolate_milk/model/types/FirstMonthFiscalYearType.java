/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: FirstMonthFiscalYearType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration FirstMonthFiscalYearType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum FirstMonthFiscalYearType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant JANUARY
     */
    JANUARY("January"),
    /**
     * Constant FEBRUARY
     */
    FEBRUARY("February"),
    /**
     * Constant MARCH
     */
    MARCH("March"),
    /**
     * Constant APRIL
     */
    APRIL("April"),
    /**
     * Constant MAY
     */
    MAY("May"),
    /**
     * Constant JUNE
     */
    JUNE("June"),
    /**
     * Constant JULY
     */
    JULY("July"),
    /**
     * Constant AUGUST
     */
    AUGUST("August"),
    /**
     * Constant SEPTEMBER
     */
    SEPTEMBER("September"),
    /**
     * Constant OCTOBER
     */
    OCTOBER("October"),
    /**
     * Constant NOVEMBER
     */
    NOVEMBER("November"),
    /**
     * Constant DECEMBER
     */
    DECEMBER("December");

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
    private static final java.util.Map<java.lang.String, FirstMonthFiscalYearType> enumConstants = new java.util.HashMap<java.lang.String, FirstMonthFiscalYearType>();


    static {
        for (FirstMonthFiscalYearType c: FirstMonthFiscalYearType.values()) {
            FirstMonthFiscalYearType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private FirstMonthFiscalYearType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.FirstMonthFiscalYearType fromValue(
            final java.lang.String value) {
        FirstMonthFiscalYearType c = FirstMonthFiscalYearType.enumConstants.get(value);
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
