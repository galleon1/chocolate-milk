/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardChargeRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardChargeRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CreditCardChargeRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemLineRet.
     */
    private org.chocolate_milk.model.ItemLineRet _itemLineRet;

    /**
     * Field _itemGroupLineRet.
     */
    private org.chocolate_milk.model.ItemGroupLineRet _itemGroupLineRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardChargeRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemGroupLineRet'.
     * 
     * @return the value of field 'ItemGroupLineRet'.
     */
    public org.chocolate_milk.model.ItemGroupLineRet getItemGroupLineRet(
    ) {
        return this._itemGroupLineRet;
    }

    /**
     * Returns the value of field 'itemLineRet'.
     * 
     * @return the value of field 'ItemLineRet'.
     */
    public org.chocolate_milk.model.ItemLineRet getItemLineRet(
    ) {
        return this._itemLineRet;
    }

    /**
     * Sets the value of field 'itemGroupLineRet'.
     * 
     * @param itemGroupLineRet the value of field 'itemGroupLineRet'
     */
    public void setItemGroupLineRet(
            final org.chocolate_milk.model.ItemGroupLineRet itemGroupLineRet) {
        this._itemGroupLineRet = itemGroupLineRet;
    }

    /**
     * Sets the value of field 'itemLineRet'.
     * 
     * @param itemLineRet the value of field 'itemLineRet'.
     */
    public void setItemLineRet(
            final org.chocolate_milk.model.ItemLineRet itemLineRet) {
        this._itemLineRet = itemLineRet;
    }

}
