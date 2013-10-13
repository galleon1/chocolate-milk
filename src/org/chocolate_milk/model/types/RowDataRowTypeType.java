/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: RowDataRowTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration RowDataRowTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum RowDataRowTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ACCOUNT
     */
    ACCOUNT("account"),
    /**
     * Constant CLASS
     */
    CLASS("class"),
    /**
     * Constant CUSTOMER
     */
    CUSTOMER("customer"),
    /**
     * Constant CUSTOMERMESSAGE
     */
    CUSTOMERMESSAGE("customerMessage"),
    /**
     * Constant CUSTOMERTYPE
     */
    CUSTOMERTYPE("customerType"),
    /**
     * Constant EMPLOYEE
     */
    EMPLOYEE("employee"),
    /**
     * Constant ITEM
     */
    ITEM("item"),
    /**
     * Constant JOBTYPE
     */
    JOBTYPE("jobType"),
    /**
     * Constant LABEL
     */
    LABEL("label"),
    /**
     * Constant MEMORIZEDTXN
     */
    MEMORIZEDTXN("memorizedTxn"),
    /**
     * Constant MEMORIZEDREPORT
     */
    MEMORIZEDREPORT("memorizedReport"),
    /**
     * Constant NAME
     */
    NAME("name"),
    /**
     * Constant OTHERNAME
     */
    OTHERNAME("otherName"),
    /**
     * Constant PAYMENTMETHOD
     */
    PAYMENTMETHOD("paymentMethod"),
    /**
     * Constant PAYROLLITEM
     */
    PAYROLLITEM("payrollItem"),
    /**
     * Constant SALESREP
     */
    SALESREP("salesRep"),
    /**
     * Constant SALESTAXCODE
     */
    SALESTAXCODE("salesTaxCode"),
    /**
     * Constant SHIPMETHOD
     */
    SHIPMETHOD("shipMethod"),
    /**
     * Constant STATE
     */
    STATE("state"),
    /**
     * Constant STYLE
     */
    STYLE("style"),
    /**
     * Constant TERMS
     */
    TERMS("terms"),
    /**
     * Constant TODO
     */
    TODO("toDo"),
    /**
     * Constant VENDOR
     */
    VENDOR("vendor"),
    /**
     * Constant VENDORTYPE
     */
    VENDORTYPE("vendorType");

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
    private static final java.util.Map<java.lang.String, RowDataRowTypeType> enumConstants = new java.util.HashMap<java.lang.String, RowDataRowTypeType>();


    static {
        for (RowDataRowTypeType c: RowDataRowTypeType.values()) {
            RowDataRowTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private RowDataRowTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.RowDataRowTypeType fromValue(
            final java.lang.String value) {
        RowDataRowTypeType c = RowDataRowTypeType.enumConstants.get(value);
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
