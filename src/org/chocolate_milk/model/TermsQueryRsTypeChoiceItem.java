/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TermsQueryRsTypeChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TermsQueryRsTypeChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class TermsQueryRsTypeChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _standardTermsRet.
     */
    private org.chocolate_milk.model.StandardTermsRet _standardTermsRet;

    /**
     * Field _dateDrivenTermsRet.
     */
    private org.chocolate_milk.model.DateDrivenTermsRet _dateDrivenTermsRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public TermsQueryRsTypeChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dateDrivenTermsRet'.
     * 
     * @return the value of field 'DateDrivenTermsRet'.
     */
    public org.chocolate_milk.model.DateDrivenTermsRet getDateDrivenTermsRet(
    ) {
        return this._dateDrivenTermsRet;
    }

    /**
     * Returns the value of field 'standardTermsRet'.
     * 
     * @return the value of field 'StandardTermsRet'.
     */
    public org.chocolate_milk.model.StandardTermsRet getStandardTermsRet(
    ) {
        return this._standardTermsRet;
    }

    /**
     * Sets the value of field 'dateDrivenTermsRet'.
     * 
     * @param dateDrivenTermsRet the value of field
     * 'dateDrivenTermsRet'.
     */
    public void setDateDrivenTermsRet(
            final org.chocolate_milk.model.DateDrivenTermsRet dateDrivenTermsRet) {
        this._dateDrivenTermsRet = dateDrivenTermsRet;
    }

    /**
     * Sets the value of field 'standardTermsRet'.
     * 
     * @param standardTermsRet the value of field 'standardTermsRet'
     */
    public void setStandardTermsRet(
            final org.chocolate_milk.model.StandardTermsRet standardTermsRet) {
        this._standardTermsRet = standardTermsRet;
    }

}
