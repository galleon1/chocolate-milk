/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BudgetSummaryReportQuery.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BudgetSummaryReportQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BudgetSummaryReportQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _budgetSummaryReportType.
     */
    private org.chocolate_milk.model.types.BudgetSummaryReportTypeType _budgetSummaryReportType;

    /**
     * Field _displayReport.
     */
    private java.lang.String _displayReport;

    /**
     * Field _fiscalYear.
     */
    private long _fiscalYear;

    /**
     * keeps track of state for field: _fiscalYear
     */
    private boolean _has_fiscalYear;

    /**
     * Field _budgetCriterion.
     */
    private org.chocolate_milk.model.types.BudgetCriterionType _budgetCriterion;

    /**
     * Field _summarizeBudgetColumnsBy.
     */
    private org.chocolate_milk.model.types.SummarizeBudgetColumnsByType _summarizeBudgetColumnsBy;

    /**
     * Field _summarizeBudgetRowsBy.
     */
    private org.chocolate_milk.model.types.SummarizeBudgetRowsByType _summarizeBudgetRowsBy;


      //----------------/
     //- Constructors -/
    //----------------/

    public BudgetSummaryReportQuery() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteFiscalYear(
    ) {
        this._has_fiscalYear= false;
    }

    /**
     * Returns the value of field 'budgetCriterion'.
     * 
     * @return the value of field 'BudgetCriterion'.
     */
    public org.chocolate_milk.model.types.BudgetCriterionType getBudgetCriterion(
    ) {
        return this._budgetCriterion;
    }

    /**
     * Returns the value of field 'budgetSummaryReportType'.
     * 
     * @return the value of field 'BudgetSummaryReportType'.
     */
    public org.chocolate_milk.model.types.BudgetSummaryReportTypeType getBudgetSummaryReportType(
    ) {
        return this._budgetSummaryReportType;
    }

    /**
     * Returns the value of field 'displayReport'.
     * 
     * @return the value of field 'DisplayReport'.
     */
    public java.lang.String getDisplayReport(
    ) {
        return this._displayReport;
    }

    /**
     * Returns the value of field 'fiscalYear'.
     * 
     * @return the value of field 'FiscalYear'.
     */
    public long getFiscalYear(
    ) {
        return this._fiscalYear;
    }

    /**
     * Returns the value of field 'summarizeBudgetColumnsBy'.
     * 
     * @return the value of field 'SummarizeBudgetColumnsBy'.
     */
    public org.chocolate_milk.model.types.SummarizeBudgetColumnsByType getSummarizeBudgetColumnsBy(
    ) {
        return this._summarizeBudgetColumnsBy;
    }

    /**
     * Returns the value of field 'summarizeBudgetRowsBy'.
     * 
     * @return the value of field 'SummarizeBudgetRowsBy'.
     */
    public org.chocolate_milk.model.types.SummarizeBudgetRowsByType getSummarizeBudgetRowsBy(
    ) {
        return this._summarizeBudgetRowsBy;
    }

    /**
     * Method hasFiscalYear.
     * 
     * @return true if at least one FiscalYear has been added
     */
    public boolean hasFiscalYear(
    ) {
        return this._has_fiscalYear;
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
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'budgetCriterion'.
     * 
     * @param budgetCriterion the value of field 'budgetCriterion'.
     */
    public void setBudgetCriterion(
            final org.chocolate_milk.model.types.BudgetCriterionType budgetCriterion) {
        this._budgetCriterion = budgetCriterion;
    }

    /**
     * Sets the value of field 'budgetSummaryReportType'.
     * 
     * @param budgetSummaryReportType the value of field
     * 'budgetSummaryReportType'.
     */
    public void setBudgetSummaryReportType(
            final org.chocolate_milk.model.types.BudgetSummaryReportTypeType budgetSummaryReportType) {
        this._budgetSummaryReportType = budgetSummaryReportType;
    }

    /**
     * Sets the value of field 'displayReport'.
     * 
     * @param displayReport the value of field 'displayReport'.
     */
    public void setDisplayReport(
            final java.lang.String displayReport) {
        this._displayReport = displayReport;
    }

    /**
     * Sets the value of field 'fiscalYear'.
     * 
     * @param fiscalYear the value of field 'fiscalYear'.
     */
    public void setFiscalYear(
            final long fiscalYear) {
        this._fiscalYear = fiscalYear;
        this._has_fiscalYear = true;
    }

    /**
     * Sets the value of field 'summarizeBudgetColumnsBy'.
     * 
     * @param summarizeBudgetColumnsBy the value of field
     * 'summarizeBudgetColumnsBy'.
     */
    public void setSummarizeBudgetColumnsBy(
            final org.chocolate_milk.model.types.SummarizeBudgetColumnsByType summarizeBudgetColumnsBy) {
        this._summarizeBudgetColumnsBy = summarizeBudgetColumnsBy;
    }

    /**
     * Sets the value of field 'summarizeBudgetRowsBy'.
     * 
     * @param summarizeBudgetRowsBy the value of field
     * 'summarizeBudgetRowsBy'.
     */
    public void setSummarizeBudgetRowsBy(
            final org.chocolate_milk.model.types.SummarizeBudgetRowsByType summarizeBudgetRowsBy) {
        this._summarizeBudgetRowsBy = summarizeBudgetRowsBy;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.BudgetSummaryReportQuery
     */
    public static org.chocolate_milk.model.BudgetSummaryReportQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BudgetSummaryReportQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BudgetSummaryReportQuery.class, reader);
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
