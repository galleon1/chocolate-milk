/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PurchaseOrderRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PurchaseOrderRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PurchaseOrderRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _purchaseOrderLineRet.
     */
    private org.chocolate_milk.model.PurchaseOrderLineRet _purchaseOrderLineRet;

    /**
     * Field _purchaseOrderLineGroupRet.
     */
    private org.chocolate_milk.model.PurchaseOrderLineGroupRet _purchaseOrderLineGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public PurchaseOrderRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'purchaseOrderLineGroupRet'.
     * 
     * @return the value of field 'PurchaseOrderLineGroupRet'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineGroupRet getPurchaseOrderLineGroupRet(
    ) {
        return this._purchaseOrderLineGroupRet;
    }

    /**
     * Returns the value of field 'purchaseOrderLineRet'.
     * 
     * @return the value of field 'PurchaseOrderLineRet'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineRet getPurchaseOrderLineRet(
    ) {
        return this._purchaseOrderLineRet;
    }

    /**
     * Sets the value of field 'purchaseOrderLineGroupRet'.
     * 
     * @param purchaseOrderLineGroupRet the value of field
     * 'purchaseOrderLineGroupRet'.
     */
    public void setPurchaseOrderLineGroupRet(
            final org.chocolate_milk.model.PurchaseOrderLineGroupRet purchaseOrderLineGroupRet) {
        this._purchaseOrderLineGroupRet = purchaseOrderLineGroupRet;
    }

    /**
     * Sets the value of field 'purchaseOrderLineRet'.
     * 
     * @param purchaseOrderLineRet the value of field
     * 'purchaseOrderLineRet'.
     */
    public void setPurchaseOrderLineRet(
            final org.chocolate_milk.model.PurchaseOrderLineRet purchaseOrderLineRet) {
        this._purchaseOrderLineRet = purchaseOrderLineRet;
    }

}
