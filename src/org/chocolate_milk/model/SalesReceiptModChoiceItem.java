/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptModChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesReceiptModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesReceiptLineMod.
     */
    private org.chocolate_milk.model.SalesReceiptLineMod _salesReceiptLineMod;

    /**
     * Field _salesReceiptLineGroupMod.
     */
    private org.chocolate_milk.model.SalesReceiptLineGroupMod _salesReceiptLineGroupMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesReceiptLineGroupMod'.
     * 
     * @return the value of field 'SalesReceiptLineGroupMod'.
     */
    public org.chocolate_milk.model.SalesReceiptLineGroupMod getSalesReceiptLineGroupMod(
    ) {
        return this._salesReceiptLineGroupMod;
    }

    /**
     * Returns the value of field 'salesReceiptLineMod'.
     * 
     * @return the value of field 'SalesReceiptLineMod'.
     */
    public org.chocolate_milk.model.SalesReceiptLineMod getSalesReceiptLineMod(
    ) {
        return this._salesReceiptLineMod;
    }

    /**
     * Sets the value of field 'salesReceiptLineGroupMod'.
     * 
     * @param salesReceiptLineGroupMod the value of field
     * 'salesReceiptLineGroupMod'.
     */
    public void setSalesReceiptLineGroupMod(
            final org.chocolate_milk.model.SalesReceiptLineGroupMod salesReceiptLineGroupMod) {
        this._salesReceiptLineGroupMod = salesReceiptLineGroupMod;
    }

    /**
     * Sets the value of field 'salesReceiptLineMod'.
     * 
     * @param salesReceiptLineMod the value of field
     * 'salesReceiptLineMod'.
     */
    public void setSalesReceiptLineMod(
            final org.chocolate_milk.model.SalesReceiptLineMod salesReceiptLineMod) {
        this._salesReceiptLineMod = salesReceiptLineMod;
    }

}
