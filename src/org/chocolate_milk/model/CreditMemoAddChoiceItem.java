/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditMemoAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditMemoAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditMemoAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditMemoLineAdd.
     */
    private org.chocolate_milk.model.CreditMemoLineAdd _creditMemoLineAdd;

    /**
     * Field _creditMemoLineGroupAdd.
     */
    private org.chocolate_milk.model.CreditMemoLineGroupAdd _creditMemoLineGroupAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditMemoAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'creditMemoLineAdd'.
     * 
     * @return the value of field 'CreditMemoLineAdd'.
     */
    public org.chocolate_milk.model.CreditMemoLineAdd getCreditMemoLineAdd(
    ) {
        return this._creditMemoLineAdd;
    }

    /**
     * Returns the value of field 'creditMemoLineGroupAdd'.
     * 
     * @return the value of field 'CreditMemoLineGroupAdd'.
     */
    public org.chocolate_milk.model.CreditMemoLineGroupAdd getCreditMemoLineGroupAdd(
    ) {
        return this._creditMemoLineGroupAdd;
    }

    /**
     * Sets the value of field 'creditMemoLineAdd'.
     * 
     * @param creditMemoLineAdd the value of field
     * 'creditMemoLineAdd'.
     */
    public void setCreditMemoLineAdd(
            final org.chocolate_milk.model.CreditMemoLineAdd creditMemoLineAdd) {
        this._creditMemoLineAdd = creditMemoLineAdd;
    }

    /**
     * Sets the value of field 'creditMemoLineGroupAdd'.
     * 
     * @param creditMemoLineGroupAdd the value of field
     * 'creditMemoLineGroupAdd'.
     */
    public void setCreditMemoLineGroupAdd(
            final org.chocolate_milk.model.CreditMemoLineGroupAdd creditMemoLineGroupAdd) {
        this._creditMemoLineGroupAdd = creditMemoLineGroupAdd;
    }

}
