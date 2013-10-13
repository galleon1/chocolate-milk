/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PayrollSummaryReportQuery.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PayrollSummaryReportQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class PayrollSummaryReportQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _payrollSummaryReportType.
     */
    private org.chocolate_milk.model.types.PayrollSummaryReportTypeType _payrollSummaryReportType;

    /**
     * Field _displayReport.
     */
    private java.lang.String _displayReport;

    /**
     * Field _payrollReportCoreFilter.
     */
    private org.chocolate_milk.model.PayrollReportCoreFilter _payrollReportCoreFilter;

    /**
     * Field _summarizeColumnsBy.
     */
    private org.chocolate_milk.model.types.SummarizeColumnsByType _summarizeColumnsBy;

    /**
     * Field _includeSubcolumns.
     */
    private java.lang.String _includeSubcolumns;

    /**
     * Field _selectionCriteriaSummary.
     */
    private org.chocolate_milk.model.SelectionCriteriaSummary _selectionCriteriaSummary;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayrollSummaryReportQuery() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'includeSubcolumns'.
     * 
     * @return the value of field 'IncludeSubcolumns'.
     */
    public java.lang.String getIncludeSubcolumns(
    ) {
        return this._includeSubcolumns;
    }

    /**
     * Returns the value of field 'payrollReportCoreFilter'.
     * 
     * @return the value of field 'PayrollReportCoreFilter'.
     */
    public org.chocolate_milk.model.PayrollReportCoreFilter getPayrollReportCoreFilter(
    ) {
        return this._payrollReportCoreFilter;
    }

    /**
     * Returns the value of field 'payrollSummaryReportType'.
     * 
     * @return the value of field 'PayrollSummaryReportType'.
     */
    public org.chocolate_milk.model.types.PayrollSummaryReportTypeType getPayrollSummaryReportType(
    ) {
        return this._payrollSummaryReportType;
    }

    /**
     * Returns the value of field 'selectionCriteriaSummary'.
     * 
     * @return the value of field 'SelectionCriteriaSummary'.
     */
    public org.chocolate_milk.model.SelectionCriteriaSummary getSelectionCriteriaSummary(
    ) {
        return this._selectionCriteriaSummary;
    }

    /**
     * Returns the value of field 'summarizeColumnsBy'.
     * 
     * @return the value of field 'SummarizeColumnsBy'.
     */
    public org.chocolate_milk.model.types.SummarizeColumnsByType getSummarizeColumnsBy(
    ) {
        return this._summarizeColumnsBy;
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
     * Sets the value of field 'displayReport'.
     * 
     * @param displayReport the value of field 'displayReport'.
     */
    public void setDisplayReport(
            final java.lang.String displayReport) {
        this._displayReport = displayReport;
    }

    /**
     * Sets the value of field 'includeSubcolumns'.
     * 
     * @param includeSubcolumns the value of field
     * 'includeSubcolumns'.
     */
    public void setIncludeSubcolumns(
            final java.lang.String includeSubcolumns) {
        this._includeSubcolumns = includeSubcolumns;
    }

    /**
     * Sets the value of field 'payrollReportCoreFilter'.
     * 
     * @param payrollReportCoreFilter the value of field
     * 'payrollReportCoreFilter'.
     */
    public void setPayrollReportCoreFilter(
            final org.chocolate_milk.model.PayrollReportCoreFilter payrollReportCoreFilter) {
        this._payrollReportCoreFilter = payrollReportCoreFilter;
    }

    /**
     * Sets the value of field 'payrollSummaryReportType'.
     * 
     * @param payrollSummaryReportType the value of field
     * 'payrollSummaryReportType'.
     */
    public void setPayrollSummaryReportType(
            final org.chocolate_milk.model.types.PayrollSummaryReportTypeType payrollSummaryReportType) {
        this._payrollSummaryReportType = payrollSummaryReportType;
    }

    /**
     * Sets the value of field 'selectionCriteriaSummary'.
     * 
     * @param selectionCriteriaSummary the value of field
     * 'selectionCriteriaSummary'.
     */
    public void setSelectionCriteriaSummary(
            final org.chocolate_milk.model.SelectionCriteriaSummary selectionCriteriaSummary) {
        this._selectionCriteriaSummary = selectionCriteriaSummary;
    }

    /**
     * Sets the value of field 'summarizeColumnsBy'.
     * 
     * @param summarizeColumnsBy the value of field
     * 'summarizeColumnsBy'.
     */
    public void setSummarizeColumnsBy(
            final org.chocolate_milk.model.types.SummarizeColumnsByType summarizeColumnsBy) {
        this._summarizeColumnsBy = summarizeColumnsBy;
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
     * org.chocolate_milk.model.PayrollSummaryReportQuery
     */
    public static org.chocolate_milk.model.PayrollSummaryReportQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PayrollSummaryReportQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PayrollSummaryReportQuery.class, reader);
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
