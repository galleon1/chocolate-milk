/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesOrderRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesOrderRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesOrderRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesOrderLineRet.
     */
    private org.chocolate_milk.model.SalesOrderLineRet _salesOrderLineRet;

    /**
     * Field _salesOrderLineGroupRet.
     */
    private org.chocolate_milk.model.SalesOrderLineGroupRet _salesOrderLineGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesOrderRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesOrderLineGroupRet'.
     * 
     * @return the value of field 'SalesOrderLineGroupRet'.
     */
    public org.chocolate_milk.model.SalesOrderLineGroupRet getSalesOrderLineGroupRet(
    ) {
        return this._salesOrderLineGroupRet;
    }

    /**
     * Returns the value of field 'salesOrderLineRet'.
     * 
     * @return the value of field 'SalesOrderLineRet'.
     */
    public org.chocolate_milk.model.SalesOrderLineRet getSalesOrderLineRet(
    ) {
        return this._salesOrderLineRet;
    }

    /**
     * Sets the value of field 'salesOrderLineGroupRet'.
     * 
     * @param salesOrderLineGroupRet the value of field
     * 'salesOrderLineGroupRet'.
     */
    public void setSalesOrderLineGroupRet(
            final org.chocolate_milk.model.SalesOrderLineGroupRet salesOrderLineGroupRet) {
        this._salesOrderLineGroupRet = salesOrderLineGroupRet;
    }

    /**
     * Sets the value of field 'salesOrderLineRet'.
     * 
     * @param salesOrderLineRet the value of field
     * 'salesOrderLineRet'.
     */
    public void setSalesOrderLineRet(
            final org.chocolate_milk.model.SalesOrderLineRet salesOrderLineRet) {
        this._salesOrderLineRet = salesOrderLineRet;
    }

}
