/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TaxFormType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration TaxFormType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum TaxFormType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant FORM1040
     */
    FORM1040("Form1040"),
    /**
     * Constant FORM1065
     */
    FORM1065("Form1065"),
    /**
     * Constant FORM1120
     */
    FORM1120("Form1120"),
    /**
     * Constant FORM1120S
     */
    FORM1120S("Form1120S"),
    /**
     * Constant FORM990
     */
    FORM990("Form990"),
    /**
     * Constant FORM990PF
     */
    FORM990PF("Form990PF"),
    /**
     * Constant FORM990T
     */
    FORM990T("Form990T"),
    /**
     * Constant OTHERORNONE
     */
    OTHERORNONE("OtherOrNone");

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
    private static final java.util.Map<java.lang.String, TaxFormType> enumConstants = new java.util.HashMap<java.lang.String, TaxFormType>();


    static {
        for (TaxFormType c: TaxFormType.values()) {
            TaxFormType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private TaxFormType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.TaxFormType fromValue(
            final java.lang.String value) {
        TaxFormType c = TaxFormType.enumConstants.get(value);
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
