/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration ListTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum ListTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ACCOUNT
     */
    ACCOUNT("Account"),
    /**
     * Constant CLASS
     */
    CLASS("Class"),
    /**
     * Constant CUSTOMER
     */
    CUSTOMER("Customer"),
    /**
     * Constant CUSTOMERMSG
     */
    CUSTOMERMSG("CustomerMsg"),
    /**
     * Constant CUSTOMERTYPE
     */
    CUSTOMERTYPE("CustomerType"),
    /**
     * Constant DATEDRIVENTERMS
     */
    DATEDRIVENTERMS("DateDrivenTerms"),
    /**
     * Constant EMPLOYEE
     */
    EMPLOYEE("Employee"),
    /**
     * Constant ITEMDISCOUNT
     */
    ITEMDISCOUNT("ItemDiscount"),
    /**
     * Constant ITEMFIXEDASSET
     */
    ITEMFIXEDASSET("ItemFixedAsset"),
    /**
     * Constant ITEMGROUP
     */
    ITEMGROUP("ItemGroup"),
    /**
     * Constant ITEMINVENTORY
     */
    ITEMINVENTORY("ItemInventory"),
    /**
     * Constant ITEMINVENTORYASSEMBLY
     */
    ITEMINVENTORYASSEMBLY("ItemInventoryAssembly"),
    /**
     * Constant ITEMNONINVENTORY
     */
    ITEMNONINVENTORY("ItemNonInventory"),
    /**
     * Constant ITEMOTHERCHARGE
     */
    ITEMOTHERCHARGE("ItemOtherCharge"),
    /**
     * Constant ITEMPAYMENT
     */
    ITEMPAYMENT("ItemPayment"),
    /**
     * Constant ITEMSALESTAX
     */
    ITEMSALESTAX("ItemSalesTax"),
    /**
     * Constant ITEMSALESTAXGROUP
     */
    ITEMSALESTAXGROUP("ItemSalesTaxGroup"),
    /**
     * Constant ITEMSERVICE
     */
    ITEMSERVICE("ItemService"),
    /**
     * Constant ITEMSUBTOTAL
     */
    ITEMSUBTOTAL("ItemSubtotal"),
    /**
     * Constant JOBTYPE
     */
    JOBTYPE("JobType"),
    /**
     * Constant OTHERNAME
     */
    OTHERNAME("OtherName"),
    /**
     * Constant PAYMENTMETHOD
     */
    PAYMENTMETHOD("PaymentMethod"),
    /**
     * Constant PRICELEVEL
     */
    PRICELEVEL("PriceLevel"),
    /**
     * Constant SALESREP
     */
    SALESREP("SalesRep"),
    /**
     * Constant SALESTAXCODE
     */
    SALESTAXCODE("SalesTaxCode"),
    /**
     * Constant SHIPMETHOD
     */
    SHIPMETHOD("ShipMethod"),
    /**
     * Constant STANDARDTERMS
     */
    STANDARDTERMS("StandardTerms"),
    /**
     * Constant TODO
     */
    TODO("ToDo"),
    /**
     * Constant VENDOR
     */
    VENDOR("Vendor"),
    /**
     * Constant VENDORTYPE
     */
    VENDORTYPE("VendorType");

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
    private static final java.util.Map<java.lang.String, ListTypeType> enumConstants = new java.util.HashMap<java.lang.String, ListTypeType>();


    static {
        for (ListTypeType c: ListTypeType.values()) {
            ListTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ListTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.ListTypeType fromValue(
            final java.lang.String value) {
        ListTypeType c = ListTypeType.enumConstants.get(value);
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
