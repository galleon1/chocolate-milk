/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardChargeModChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardChargeModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditCardChargeModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemLineMod.
     */
    private org.chocolate_milk.model.ItemLineMod _itemLineMod;

    /**
     * Field _itemGroupLineMod.
     */
    private org.chocolate_milk.model.ItemGroupLineMod _itemGroupLineMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardChargeModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemGroupLineMod'.
     * 
     * @return the value of field 'ItemGroupLineMod'.
     */
    public org.chocolate_milk.model.ItemGroupLineMod getItemGroupLineMod(
    ) {
        return this._itemGroupLineMod;
    }

    /**
     * Returns the value of field 'itemLineMod'.
     * 
     * @return the value of field 'ItemLineMod'.
     */
    public org.chocolate_milk.model.ItemLineMod getItemLineMod(
    ) {
        return this._itemLineMod;
    }

    /**
     * Sets the value of field 'itemGroupLineMod'.
     * 
     * @param itemGroupLineMod the value of field 'itemGroupLineMod'
     */
    public void setItemGroupLineMod(
            final org.chocolate_milk.model.ItemGroupLineMod itemGroupLineMod) {
        this._itemGroupLineMod = itemGroupLineMod;
    }

    /**
     * Sets the value of field 'itemLineMod'.
     * 
     * @param itemLineMod the value of field 'itemLineMod'.
     */
    public void setItemLineMod(
            final org.chocolate_milk.model.ItemLineMod itemLineMod) {
        this._itemLineMod = itemLineMod;
    }

}
