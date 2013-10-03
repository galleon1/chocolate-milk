/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: FirstDayOfWeekType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration FirstDayOfWeekType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum FirstDayOfWeekType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant MONDAY
     */
    MONDAY("Monday"),
    /**
     * Constant TUESDAY
     */
    TUESDAY("Tuesday"),
    /**
     * Constant WEDNESDAY
     */
    WEDNESDAY("Wednesday"),
    /**
     * Constant THURSDAY
     */
    THURSDAY("Thursday"),
    /**
     * Constant FRIDAY
     */
    FRIDAY("Friday"),
    /**
     * Constant SATURDAY
     */
    SATURDAY("Saturday"),
    /**
     * Constant SUNDAY
     */
    SUNDAY("Sunday");

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
    private static final java.util.Map<java.lang.String, FirstDayOfWeekType> enumConstants = new java.util.HashMap<java.lang.String, FirstDayOfWeekType>();


    static {
        for (FirstDayOfWeekType c: FirstDayOfWeekType.values()) {
            FirstDayOfWeekType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private FirstDayOfWeekType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.FirstDayOfWeekType fromValue(
            final java.lang.String value) {
        FirstDayOfWeekType c = FirstDayOfWeekType.enumConstants.get(value);
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
