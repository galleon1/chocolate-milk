/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesOrderAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesOrderAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesOrderAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesOrderLineAdd.
     */
    private org.chocolate_milk.model.SalesOrderLineAdd _salesOrderLineAdd;

    /**
     * Field _salesOrderLineGroupAdd.
     */
    private org.chocolate_milk.model.SalesOrderLineGroupAdd _salesOrderLineGroupAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesOrderAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesOrderLineAdd'.
     * 
     * @return the value of field 'SalesOrderLineAdd'.
     */
    public org.chocolate_milk.model.SalesOrderLineAdd getSalesOrderLineAdd(
    ) {
        return this._salesOrderLineAdd;
    }

    /**
     * Returns the value of field 'salesOrderLineGroupAdd'.
     * 
     * @return the value of field 'SalesOrderLineGroupAdd'.
     */
    public org.chocolate_milk.model.SalesOrderLineGroupAdd getSalesOrderLineGroupAdd(
    ) {
        return this._salesOrderLineGroupAdd;
    }

    /**
     * Sets the value of field 'salesOrderLineAdd'.
     * 
     * @param salesOrderLineAdd the value of field
     * 'salesOrderLineAdd'.
     */
    public void setSalesOrderLineAdd(
            final org.chocolate_milk.model.SalesOrderLineAdd salesOrderLineAdd) {
        this._salesOrderLineAdd = salesOrderLineAdd;
    }

    /**
     * Sets the value of field 'salesOrderLineGroupAdd'.
     * 
     * @param salesOrderLineGroupAdd the value of field
     * 'salesOrderLineGroupAdd'.
     */
    public void setSalesOrderLineGroupAdd(
            final org.chocolate_milk.model.SalesOrderLineGroupAdd salesOrderLineGroupAdd) {
        this._salesOrderLineGroupAdd = salesOrderLineGroupAdd;
    }

}
