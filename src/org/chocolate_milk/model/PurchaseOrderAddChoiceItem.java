/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PurchaseOrderAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PurchaseOrderAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class PurchaseOrderAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _purchaseOrderLineAdd.
     */
    private org.chocolate_milk.model.PurchaseOrderLineAdd _purchaseOrderLineAdd;

    /**
     * Field _purchaseOrderLineGroupAdd.
     */
    private org.chocolate_milk.model.PurchaseOrderLineGroupAdd _purchaseOrderLineGroupAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public PurchaseOrderAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'purchaseOrderLineAdd'.
     * 
     * @return the value of field 'PurchaseOrderLineAdd'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineAdd getPurchaseOrderLineAdd(
    ) {
        return this._purchaseOrderLineAdd;
    }

    /**
     * Returns the value of field 'purchaseOrderLineGroupAdd'.
     * 
     * @return the value of field 'PurchaseOrderLineGroupAdd'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineGroupAdd getPurchaseOrderLineGroupAdd(
    ) {
        return this._purchaseOrderLineGroupAdd;
    }

    /**
     * Sets the value of field 'purchaseOrderLineAdd'.
     * 
     * @param purchaseOrderLineAdd the value of field
     * 'purchaseOrderLineAdd'.
     */
    public void setPurchaseOrderLineAdd(
            final org.chocolate_milk.model.PurchaseOrderLineAdd purchaseOrderLineAdd) {
        this._purchaseOrderLineAdd = purchaseOrderLineAdd;
    }

    /**
     * Sets the value of field 'purchaseOrderLineGroupAdd'.
     * 
     * @param purchaseOrderLineGroupAdd the value of field
     * 'purchaseOrderLineGroupAdd'.
     */
    public void setPurchaseOrderLineGroupAdd(
            final org.chocolate_milk.model.PurchaseOrderLineGroupAdd purchaseOrderLineGroupAdd) {
        this._purchaseOrderLineGroupAdd = purchaseOrderLineGroupAdd;
    }

}
