/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: MappingCategoryType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration MappingCategoryType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum MappingCategoryType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant BOX1
     */
    BOX1("BOX1"),
    /**
     * Constant BOX2
     */
    BOX2("BOX2"),
    /**
     * Constant BOX3
     */
    BOX3("BOX3"),
    /**
     * Constant BOX4
     */
    BOX4("BOX4"),
    /**
     * Constant BOX5
     */
    BOX5("BOX5"),
    /**
     * Constant BOX6
     */
    BOX6("BOX6"),
    /**
     * Constant BOX7
     */
    BOX7("BOX7"),
    /**
     * Constant BOX8
     */
    BOX8("BOX8"),
    /**
     * Constant BOX9
     */
    BOX9("BOX9"),
    /**
     * Constant BOX10
     */
    BOX10("BOX10"),
    /**
     * Constant BOX13
     */
    BOX13("BOX13"),
    /**
     * Constant BOX14
     */
    BOX14("BOX14");

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
    private static final java.util.Map<java.lang.String, MappingCategoryType> enumConstants = new java.util.HashMap<java.lang.String, MappingCategoryType>();


    static {
        for (MappingCategoryType c: MappingCategoryType.values()) {
            MappingCategoryType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private MappingCategoryType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.MappingCategoryType fromValue(
            final java.lang.String value) {
        MappingCategoryType c = MappingCategoryType.enumConstants.get(value);
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
