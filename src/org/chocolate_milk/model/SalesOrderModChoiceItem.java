/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesOrderModChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesOrderModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesOrderModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesOrderLineMod.
     */
    private org.chocolate_milk.model.SalesOrderLineMod _salesOrderLineMod;

    /**
     * Field _salesOrderLineGroupMod.
     */
    private org.chocolate_milk.model.SalesOrderLineGroupMod _salesOrderLineGroupMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesOrderModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesOrderLineGroupMod'.
     * 
     * @return the value of field 'SalesOrderLineGroupMod'.
     */
    public org.chocolate_milk.model.SalesOrderLineGroupMod getSalesOrderLineGroupMod(
    ) {
        return this._salesOrderLineGroupMod;
    }

    /**
     * Returns the value of field 'salesOrderLineMod'.
     * 
     * @return the value of field 'SalesOrderLineMod'.
     */
    public org.chocolate_milk.model.SalesOrderLineMod getSalesOrderLineMod(
    ) {
        return this._salesOrderLineMod;
    }

    /**
     * Sets the value of field 'salesOrderLineGroupMod'.
     * 
     * @param salesOrderLineGroupMod the value of field
     * 'salesOrderLineGroupMod'.
     */
    public void setSalesOrderLineGroupMod(
            final org.chocolate_milk.model.SalesOrderLineGroupMod salesOrderLineGroupMod) {
        this._salesOrderLineGroupMod = salesOrderLineGroupMod;
    }

    /**
     * Sets the value of field 'salesOrderLineMod'.
     * 
     * @param salesOrderLineMod the value of field
     * 'salesOrderLineMod'.
     */
    public void setSalesOrderLineMod(
            final org.chocolate_milk.model.SalesOrderLineMod salesOrderLineMod) {
        this._salesOrderLineMod = salesOrderLineMod;
    }

}
