/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration DataExtTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum DataExtTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant AMTTYPE
     */
    AMTTYPE("AMTTYPE"),
    /**
     * Constant DATETIMETYPE
     */
    DATETIMETYPE("DATETIMETYPE"),
    /**
     * Constant INTTYPE
     */
    INTTYPE("INTTYPE"),
    /**
     * Constant PERCENTTYPE
     */
    PERCENTTYPE("PERCENTTYPE"),
    /**
     * Constant PRICETYPE
     */
    PRICETYPE("PRICETYPE"),
    /**
     * Constant QUANTYPE
     */
    QUANTYPE("QUANTYPE"),
    /**
     * Constant STR1024TYPE
     */
    STR1024TYPE("STR1024TYPE"),
    /**
     * Constant STR255TYPE
     */
    STR255TYPE("STR255TYPE");

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
    private static final java.util.Map<java.lang.String, DataExtTypeType> enumConstants = new java.util.HashMap<java.lang.String, DataExtTypeType>();


    static {
        for (DataExtTypeType c: DataExtTypeType.values()) {
            DataExtTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private DataExtTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.DataExtTypeType fromValue(
            final java.lang.String value) {
        DataExtTypeType c = DataExtTypeType.enumConstants.get(value);
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
