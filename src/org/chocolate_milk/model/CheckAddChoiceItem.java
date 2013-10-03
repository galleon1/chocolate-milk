/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CheckAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CheckAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CheckAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemLineAdd.
     */
    private org.chocolate_milk.model.ItemLineAdd _itemLineAdd;

    /**
     * Field _itemGroupLineAdd.
     */
    private org.chocolate_milk.model.ItemGroupLineAdd _itemGroupLineAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public CheckAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemGroupLineAdd'.
     * 
     * @return the value of field 'ItemGroupLineAdd'.
     */
    public org.chocolate_milk.model.ItemGroupLineAdd getItemGroupLineAdd(
    ) {
        return this._itemGroupLineAdd;
    }

    /**
     * Returns the value of field 'itemLineAdd'.
     * 
     * @return the value of field 'ItemLineAdd'.
     */
    public org.chocolate_milk.model.ItemLineAdd getItemLineAdd(
    ) {
        return this._itemLineAdd;
    }

    /**
     * Sets the value of field 'itemGroupLineAdd'.
     * 
     * @param itemGroupLineAdd the value of field 'itemGroupLineAdd'
     */
    public void setItemGroupLineAdd(
            final org.chocolate_milk.model.ItemGroupLineAdd itemGroupLineAdd) {
        this._itemGroupLineAdd = itemGroupLineAdd;
    }

    /**
     * Sets the value of field 'itemLineAdd'.
     * 
     * @param itemLineAdd the value of field 'itemLineAdd'.
     */
    public void setItemLineAdd(
            final org.chocolate_milk.model.ItemLineAdd itemLineAdd) {
        this._itemLineAdd = itemLineAdd;
    }

}
