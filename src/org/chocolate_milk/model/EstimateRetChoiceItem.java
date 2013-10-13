/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EstimateRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _estimateLineRet.
     */
    private org.chocolate_milk.model.EstimateLineRet _estimateLineRet;

    /**
     * Field _estimateLineGroupRet.
     */
    private org.chocolate_milk.model.EstimateLineGroupRet _estimateLineGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'estimateLineGroupRet'.
     * 
     * @return the value of field 'EstimateLineGroupRet'.
     */
    public org.chocolate_milk.model.EstimateLineGroupRet getEstimateLineGroupRet(
    ) {
        return this._estimateLineGroupRet;
    }

    /**
     * Returns the value of field 'estimateLineRet'.
     * 
     * @return the value of field 'EstimateLineRet'.
     */
    public org.chocolate_milk.model.EstimateLineRet getEstimateLineRet(
    ) {
        return this._estimateLineRet;
    }

    /**
     * Sets the value of field 'estimateLineGroupRet'.
     * 
     * @param estimateLineGroupRet the value of field
     * 'estimateLineGroupRet'.
     */
    public void setEstimateLineGroupRet(
            final org.chocolate_milk.model.EstimateLineGroupRet estimateLineGroupRet) {
        this._estimateLineGroupRet = estimateLineGroupRet;
    }

    /**
     * Sets the value of field 'estimateLineRet'.
     * 
     * @param estimateLineRet the value of field 'estimateLineRet'.
     */
    public void setEstimateLineRet(
            final org.chocolate_milk.model.EstimateLineRet estimateLineRet) {
        this._estimateLineRet = estimateLineRet;
    }

}
