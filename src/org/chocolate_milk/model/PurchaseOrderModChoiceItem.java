/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PurchaseOrderModChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PurchaseOrderModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PurchaseOrderModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _purchaseOrderLineMod.
     */
    private org.chocolate_milk.model.PurchaseOrderLineMod _purchaseOrderLineMod;

    /**
     * Field _purchaseOrderLineGroupMod.
     */
    private org.chocolate_milk.model.PurchaseOrderLineGroupMod _purchaseOrderLineGroupMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public PurchaseOrderModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'purchaseOrderLineGroupMod'.
     * 
     * @return the value of field 'PurchaseOrderLineGroupMod'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineGroupMod getPurchaseOrderLineGroupMod(
    ) {
        return this._purchaseOrderLineGroupMod;
    }

    /**
     * Returns the value of field 'purchaseOrderLineMod'.
     * 
     * @return the value of field 'PurchaseOrderLineMod'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineMod getPurchaseOrderLineMod(
    ) {
        return this._purchaseOrderLineMod;
    }

    /**
     * Sets the value of field 'purchaseOrderLineGroupMod'.
     * 
     * @param purchaseOrderLineGroupMod the value of field
     * 'purchaseOrderLineGroupMod'.
     */
    public void setPurchaseOrderLineGroupMod(
            final org.chocolate_milk.model.PurchaseOrderLineGroupMod purchaseOrderLineGroupMod) {
        this._purchaseOrderLineGroupMod = purchaseOrderLineGroupMod;
    }

    /**
     * Sets the value of field 'purchaseOrderLineMod'.
     * 
     * @param purchaseOrderLineMod the value of field
     * 'purchaseOrderLineMod'.
     */
    public void setPurchaseOrderLineMod(
            final org.chocolate_milk.model.PurchaseOrderLineMod purchaseOrderLineMod) {
        this._purchaseOrderLineMod = purchaseOrderLineMod;
    }

}
