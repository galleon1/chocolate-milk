/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditMemoRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditMemoRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditMemoRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditMemoLineRet.
     */
    private org.chocolate_milk.model.CreditMemoLineRet _creditMemoLineRet;

    /**
     * Field _creditMemoLineGroupRet.
     */
    private org.chocolate_milk.model.CreditMemoLineGroupRet _creditMemoLineGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditMemoRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'creditMemoLineGroupRet'.
     * 
     * @return the value of field 'CreditMemoLineGroupRet'.
     */
    public org.chocolate_milk.model.CreditMemoLineGroupRet getCreditMemoLineGroupRet(
    ) {
        return this._creditMemoLineGroupRet;
    }

    /**
     * Returns the value of field 'creditMemoLineRet'.
     * 
     * @return the value of field 'CreditMemoLineRet'.
     */
    public org.chocolate_milk.model.CreditMemoLineRet getCreditMemoLineRet(
    ) {
        return this._creditMemoLineRet;
    }

    /**
     * Sets the value of field 'creditMemoLineGroupRet'.
     * 
     * @param creditMemoLineGroupRet the value of field
     * 'creditMemoLineGroupRet'.
     */
    public void setCreditMemoLineGroupRet(
            final org.chocolate_milk.model.CreditMemoLineGroupRet creditMemoLineGroupRet) {
        this._creditMemoLineGroupRet = creditMemoLineGroupRet;
    }

    /**
     * Sets the value of field 'creditMemoLineRet'.
     * 
     * @param creditMemoLineRet the value of field
     * 'creditMemoLineRet'.
     */
    public void setCreditMemoLineRet(
            final org.chocolate_milk.model.CreditMemoLineRet creditMemoLineRet) {
        this._creditMemoLineRet = creditMemoLineRet;
    }

}
