/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SpecialItemTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration SpecialItemTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum SpecialItemTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant FINANCECHARGE
     */
    FINANCECHARGE("FinanceCharge"),
    /**
     * Constant REIMBURSABLEEXPENSEGROUP
     */
    REIMBURSABLEEXPENSEGROUP("ReimbursableExpenseGroup"),
    /**
     * Constant REIMBURSABLEEXPENSESUBTOTAL
     */
    REIMBURSABLEEXPENSESUBTOTAL("ReimbursableExpenseSubtotal");

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
    private static final java.util.Map<java.lang.String, SpecialItemTypeType> enumConstants = new java.util.HashMap<java.lang.String, SpecialItemTypeType>();


    static {
        for (SpecialItemTypeType c: SpecialItemTypeType.values()) {
            SpecialItemTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private SpecialItemTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.SpecialItemTypeType fromValue(
            final java.lang.String value) {
        SpecialItemTypeType c = SpecialItemTypeType.enumConstants.get(value);
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
