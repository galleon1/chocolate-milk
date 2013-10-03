/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesReceiptRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesReceiptLineRet.
     */
    private org.chocolate_milk.model.SalesReceiptLineRet _salesReceiptLineRet;

    /**
     * Field _salesReceiptLineGroupRet.
     */
    private org.chocolate_milk.model.SalesReceiptLineGroupRet _salesReceiptLineGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesReceiptLineGroupRet'.
     * 
     * @return the value of field 'SalesReceiptLineGroupRet'.
     */
    public org.chocolate_milk.model.SalesReceiptLineGroupRet getSalesReceiptLineGroupRet(
    ) {
        return this._salesReceiptLineGroupRet;
    }

    /**
     * Returns the value of field 'salesReceiptLineRet'.
     * 
     * @return the value of field 'SalesReceiptLineRet'.
     */
    public org.chocolate_milk.model.SalesReceiptLineRet getSalesReceiptLineRet(
    ) {
        return this._salesReceiptLineRet;
    }

    /**
     * Sets the value of field 'salesReceiptLineGroupRet'.
     * 
     * @param salesReceiptLineGroupRet the value of field
     * 'salesReceiptLineGroupRet'.
     */
    public void setSalesReceiptLineGroupRet(
            final org.chocolate_milk.model.SalesReceiptLineGroupRet salesReceiptLineGroupRet) {
        this._salesReceiptLineGroupRet = salesReceiptLineGroupRet;
    }

    /**
     * Sets the value of field 'salesReceiptLineRet'.
     * 
     * @param salesReceiptLineRet the value of field
     * 'salesReceiptLineRet'.
     */
    public void setSalesReceiptLineRet(
            final org.chocolate_milk.model.SalesReceiptLineRet salesReceiptLineRet) {
        this._salesReceiptLineRet = salesReceiptLineRet;
    }

}
