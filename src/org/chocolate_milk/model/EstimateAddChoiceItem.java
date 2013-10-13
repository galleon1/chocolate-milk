/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EstimateAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _estimateLineAdd.
     */
    private org.chocolate_milk.model.EstimateLineAdd _estimateLineAdd;

    /**
     * Field _estimateLineGroupAdd.
     */
    private org.chocolate_milk.model.EstimateLineGroupAdd _estimateLineGroupAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'estimateLineAdd'.
     * 
     * @return the value of field 'EstimateLineAdd'.
     */
    public org.chocolate_milk.model.EstimateLineAdd getEstimateLineAdd(
    ) {
        return this._estimateLineAdd;
    }

    /**
     * Returns the value of field 'estimateLineGroupAdd'.
     * 
     * @return the value of field 'EstimateLineGroupAdd'.
     */
    public org.chocolate_milk.model.EstimateLineGroupAdd getEstimateLineGroupAdd(
    ) {
        return this._estimateLineGroupAdd;
    }

    /**
     * Sets the value of field 'estimateLineAdd'.
     * 
     * @param estimateLineAdd the value of field 'estimateLineAdd'.
     */
    public void setEstimateLineAdd(
            final org.chocolate_milk.model.EstimateLineAdd estimateLineAdd) {
        this._estimateLineAdd = estimateLineAdd;
    }

    /**
     * Sets the value of field 'estimateLineGroupAdd'.
     * 
     * @param estimateLineGroupAdd the value of field
     * 'estimateLineGroupAdd'.
     */
    public void setEstimateLineGroupAdd(
            final org.chocolate_milk.model.EstimateLineGroupAdd estimateLineGroupAdd) {
        this._estimateLineGroupAdd = estimateLineGroupAdd;
    }

}
