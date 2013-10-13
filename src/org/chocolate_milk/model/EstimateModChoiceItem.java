/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateModChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EstimateModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _estimateLineMod.
     */
    private org.chocolate_milk.model.EstimateLineMod _estimateLineMod;

    /**
     * Field _estimateLineGroupMod.
     */
    private org.chocolate_milk.model.EstimateLineGroupMod _estimateLineGroupMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'estimateLineGroupMod'.
     * 
     * @return the value of field 'EstimateLineGroupMod'.
     */
    public org.chocolate_milk.model.EstimateLineGroupMod getEstimateLineGroupMod(
    ) {
        return this._estimateLineGroupMod;
    }

    /**
     * Returns the value of field 'estimateLineMod'.
     * 
     * @return the value of field 'EstimateLineMod'.
     */
    public org.chocolate_milk.model.EstimateLineMod getEstimateLineMod(
    ) {
        return this._estimateLineMod;
    }

    /**
     * Sets the value of field 'estimateLineGroupMod'.
     * 
     * @param estimateLineGroupMod the value of field
     * 'estimateLineGroupMod'.
     */
    public void setEstimateLineGroupMod(
            final org.chocolate_milk.model.EstimateLineGroupMod estimateLineGroupMod) {
        this._estimateLineGroupMod = estimateLineGroupMod;
    }

    /**
     * Sets the value of field 'estimateLineMod'.
     * 
     * @param estimateLineMod the value of field 'estimateLineMod'.
     */
    public void setEstimateLineMod(
            final org.chocolate_milk.model.EstimateLineMod estimateLineMod) {
        this._estimateLineMod = estimateLineMod;
    }

}
