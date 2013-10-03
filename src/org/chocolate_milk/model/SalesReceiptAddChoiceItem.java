/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesReceiptAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesReceiptLineAdd.
     */
    private org.chocolate_milk.model.SalesReceiptLineAdd _salesReceiptLineAdd;

    /**
     * Field _salesReceiptLineGroupAdd.
     */
    private org.chocolate_milk.model.SalesReceiptLineGroupAdd _salesReceiptLineGroupAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesReceiptLineAdd'.
     * 
     * @return the value of field 'SalesReceiptLineAdd'.
     */
    public org.chocolate_milk.model.SalesReceiptLineAdd getSalesReceiptLineAdd(
    ) {
        return this._salesReceiptLineAdd;
    }

    /**
     * Returns the value of field 'salesReceiptLineGroupAdd'.
     * 
     * @return the value of field 'SalesReceiptLineGroupAdd'.
     */
    public org.chocolate_milk.model.SalesReceiptLineGroupAdd getSalesReceiptLineGroupAdd(
    ) {
        return this._salesReceiptLineGroupAdd;
    }

    /**
     * Sets the value of field 'salesReceiptLineAdd'.
     * 
     * @param salesReceiptLineAdd the value of field
     * 'salesReceiptLineAdd'.
     */
    public void setSalesReceiptLineAdd(
            final org.chocolate_milk.model.SalesReceiptLineAdd salesReceiptLineAdd) {
        this._salesReceiptLineAdd = salesReceiptLineAdd;
    }

    /**
     * Sets the value of field 'salesReceiptLineGroupAdd'.
     * 
     * @param salesReceiptLineGroupAdd the value of field
     * 'salesReceiptLineGroupAdd'.
     */
    public void setSalesReceiptLineGroupAdd(
            final org.chocolate_milk.model.SalesReceiptLineGroupAdd salesReceiptLineGroupAdd) {
        this._salesReceiptLineGroupAdd = salesReceiptLineGroupAdd;
    }

}
