/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: UnitOfMeasureTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration UnitOfMeasureTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum UnitOfMeasureTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant AREA
     */
    AREA("Area"),
    /**
     * Constant COUNT
     */
    COUNT("Count"),
    /**
     * Constant LENGTH
     */
    LENGTH("Length"),
    /**
     * Constant OTHER
     */
    OTHER("Other"),
    /**
     * Constant TIME
     */
    TIME("Time"),
    /**
     * Constant VOLUME
     */
    VOLUME("Volume"),
    /**
     * Constant WEIGHT
     */
    WEIGHT("Weight");

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
    private static final java.util.Map<java.lang.String, UnitOfMeasureTypeType> enumConstants = new java.util.HashMap<java.lang.String, UnitOfMeasureTypeType>();


    static {
        for (UnitOfMeasureTypeType c: UnitOfMeasureTypeType.values()) {
            UnitOfMeasureTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private UnitOfMeasureTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.UnitOfMeasureTypeType fromValue(
            final java.lang.String value) {
        UnitOfMeasureTypeType c = UnitOfMeasureTypeType.enumConstants.get(value);
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
