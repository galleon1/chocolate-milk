/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CustomSummaryReportQueryRqType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CustomSummaryReportQueryRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class CustomSummaryReportQueryRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _customSummaryReportQuery.
     */
    private org.chocolate_milk.model.CustomSummaryReportQuery _customSummaryReportQuery;


      //----------------/
     //- Constructors -/
    //----------------/

    public CustomSummaryReportQueryRqType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'customSummaryReportQuery'.
     * 
     * @return the value of field 'CustomSummaryReportQuery'.
     */
    public org.chocolate_milk.model.CustomSummaryReportQuery getCustomSummaryReportQuery(
    ) {
        return this._customSummaryReportQuery;
    }

    /**
     * Returns the value of field 'requestID'.
     * 
     * @return the value of field 'RequestID'.
     */
    public java.lang.String getRequestID(
    ) {
        return this._requestID;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Sets the value of field 'customSummaryReportQuery'.
     * 
     * @param customSummaryReportQuery the value of field
     * 'customSummaryReportQuery'.
     */
    public void setCustomSummaryReportQuery(
            final org.chocolate_milk.model.CustomSummaryReportQuery customSummaryReportQuery) {
        this._customSummaryReportQuery = customSummaryReportQuery;
    }

    /**
     * Sets the value of field 'requestID'.
     * 
     * @param requestID the value of field 'requestID'.
     */
    public void setRequestID(
            final java.lang.String requestID) {
        this._requestID = requestID;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
