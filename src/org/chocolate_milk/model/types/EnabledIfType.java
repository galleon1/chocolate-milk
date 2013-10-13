/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EnabledIfType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration EnabledIfType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum EnabledIfType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ACCOUNTANTCOPYEXISTS
     */
    ACCOUNTANTCOPYEXISTS("AccountantCopyExists"),
    /**
     * Constant ASSEMBLYITEMSENABLED
     */
    ASSEMBLYITEMSENABLED("AssemblyItemsEnabled"),
    /**
     * Constant CLASSESENABLED
     */
    CLASSESENABLED("ClassesEnabled"),
    /**
     * Constant ESTIMATESENABLED
     */
    ESTIMATESENABLED("EstimatesEnabled"),
    /**
     * Constant HASCUSTOMERS
     */
    HASCUSTOMERS("HasCustomers"),
    /**
     * Constant HASVENDORS
     */
    HASVENDORS("HasVendors"),
    /**
     * Constant INVENTORYENABLED
     */
    INVENTORYENABLED("InventoryEnabled"),
    /**
     * Constant ISACCOUNTANTCOPY
     */
    ISACCOUNTANTCOPY("IsAccountantCopy"),
    /**
     * Constant MULTIUSERMODE
     */
    MULTIUSERMODE("MultiUserMode"),
    /**
     * Constant PAYROLLENABLED
     */
    PAYROLLENABLED("PayrollEnabled"),
    /**
     * Constant PRICELEVELSENABLED
     */
    PRICELEVELSENABLED("PriceLevelsEnabled"),
    /**
     * Constant SALESORDERSENABLED
     */
    SALESORDERSENABLED("SalesOrdersEnabled"),
    /**
     * Constant SALESTAXENABLED
     */
    SALESTAXENABLED("SalesTaxEnabled"),
    /**
     * Constant TIMETRACKINGENABLED
     */
    TIMETRACKINGENABLED("TimeTrackingEnabled");

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
    private static final java.util.Map<java.lang.String, EnabledIfType> enumConstants = new java.util.HashMap<java.lang.String, EnabledIfType>();


    static {
        for (EnabledIfType c: EnabledIfType.values()) {
            EnabledIfType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private EnabledIfType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.EnabledIfType fromValue(
            final java.lang.String value) {
        EnabledIfType c = EnabledIfType.enumConstants.get(value);
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
