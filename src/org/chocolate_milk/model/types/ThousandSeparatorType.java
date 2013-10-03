/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ThousandSeparatorType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration ThousandSeparatorType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum ThousandSeparatorType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant COMMA
     */
    COMMA("Comma"),
    /**
     * Constant PERIOD
     */
    PERIOD("Period"),
    /**
     * Constant SPACE
     */
    SPACE("Space"),
    /**
     * Constant APOSTROPHE
     */
    APOSTROPHE("Apostrophe");

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
    private static final java.util.Map<java.lang.String, ThousandSeparatorType> enumConstants = new java.util.HashMap<java.lang.String, ThousandSeparatorType>();


    static {
        for (ThousandSeparatorType c: ThousandSeparatorType.values()) {
            ThousandSeparatorType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ThousandSeparatorType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.ThousandSeparatorType fromValue(
            final java.lang.String value) {
        ThousandSeparatorType c = ThousandSeparatorType.enumConstants.get(value);
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
