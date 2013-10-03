/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillableStatusType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration BillableStatusType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum BillableStatusType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant BILLABLE
     */
    BILLABLE("Billable"),
    /**
     * Constant NOTBILLABLE
     */
    NOTBILLABLE("NotBillable"),
    /**
     * Constant HASBEENBILLED
     */
    HASBEENBILLED("HasBeenBilled");

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
    private static final java.util.Map<java.lang.String, BillableStatusType> enumConstants = new java.util.HashMap<java.lang.String, BillableStatusType>();


    static {
        for (BillableStatusType c: BillableStatusType.values()) {
            BillableStatusType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private BillableStatusType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.BillableStatusType fromValue(
            final java.lang.String value) {
        BillableStatusType c = BillableStatusType.enumConstants.get(value);
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
