/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditMemoModChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditMemoModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditMemoModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditMemoLineMod.
     */
    private org.chocolate_milk.model.CreditMemoLineMod _creditMemoLineMod;

    /**
     * Field _creditMemoLineGroupMod.
     */
    private org.chocolate_milk.model.CreditMemoLineGroupMod _creditMemoLineGroupMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditMemoModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'creditMemoLineGroupMod'.
     * 
     * @return the value of field 'CreditMemoLineGroupMod'.
     */
    public org.chocolate_milk.model.CreditMemoLineGroupMod getCreditMemoLineGroupMod(
    ) {
        return this._creditMemoLineGroupMod;
    }

    /**
     * Returns the value of field 'creditMemoLineMod'.
     * 
     * @return the value of field 'CreditMemoLineMod'.
     */
    public org.chocolate_milk.model.CreditMemoLineMod getCreditMemoLineMod(
    ) {
        return this._creditMemoLineMod;
    }

    /**
     * Sets the value of field 'creditMemoLineGroupMod'.
     * 
     * @param creditMemoLineGroupMod the value of field
     * 'creditMemoLineGroupMod'.
     */
    public void setCreditMemoLineGroupMod(
            final org.chocolate_milk.model.CreditMemoLineGroupMod creditMemoLineGroupMod) {
        this._creditMemoLineGroupMod = creditMemoLineGroupMod;
    }

    /**
     * Sets the value of field 'creditMemoLineMod'.
     * 
     * @param creditMemoLineMod the value of field
     * 'creditMemoLineMod'.
     */
    public void setCreditMemoLineMod(
            final org.chocolate_milk.model.CreditMemoLineMod creditMemoLineMod) {
        this._creditMemoLineMod = creditMemoLineMod;
    }

}
