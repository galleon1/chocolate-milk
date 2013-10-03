/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TimeReportQuery.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TimeReportQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TimeReportQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _timeReportType.
     */
    private org.chocolate_milk.model.types.TimeReportTypeType _timeReportType;

    /**
     * Field _displayReport.
     */
    private java.lang.String _displayReport;

    /**
     * Field _timeReportQueryChoice.
     */
    private org.chocolate_milk.model.TimeReportQueryChoice _timeReportQueryChoice;

    /**
     * Field _reportEntityFilter.
     */
    private org.chocolate_milk.model.ReportEntityFilter _reportEntityFilter;

    /**
     * Field _reportItemFilter.
     */
    private org.chocolate_milk.model.ReportItemFilter _reportItemFilter;

    /**
     * Field _reportClassFilter.
     */
    private org.chocolate_milk.model.ReportClassFilter _reportClassFilter;

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

    public TimeReportQuery() {
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
     * Returns the value of field 'reportClassFilter'.
     * 
     * @return the value of field 'ReportClassFilter'.
     */
    public org.chocolate_milk.model.ReportClassFilter getReportClassFilter(
    ) {
        return this._reportClassFilter;
    }

    /**
     * Returns the value of field 'reportEntityFilter'.
     * 
     * @return the value of field 'ReportEntityFilter'.
     */
    public org.chocolate_milk.model.ReportEntityFilter getReportEntityFilter(
    ) {
        return this._reportEntityFilter;
    }

    /**
     * Returns the value of field 'reportItemFilter'.
     * 
     * @return the value of field 'ReportItemFilter'.
     */
    public org.chocolate_milk.model.ReportItemFilter getReportItemFilter(
    ) {
        return this._reportItemFilter;
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
     * Returns the value of field 'timeReportQueryChoice'.
     * 
     * @return the value of field 'TimeReportQueryChoice'.
     */
    public org.chocolate_milk.model.TimeReportQueryChoice getTimeReportQueryChoice(
    ) {
        return this._timeReportQueryChoice;
    }

    /**
     * Returns the value of field 'timeReportType'.
     * 
     * @return the value of field 'TimeReportType'.
     */
    public org.chocolate_milk.model.types.TimeReportTypeType getTimeReportType(
    ) {
        return this._timeReportType;
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
     * Sets the value of field 'reportClassFilter'.
     * 
     * @param reportClassFilter the value of field
     * 'reportClassFilter'.
     */
    public void setReportClassFilter(
            final org.chocolate_milk.model.ReportClassFilter reportClassFilter) {
        this._reportClassFilter = reportClassFilter;
    }

    /**
     * Sets the value of field 'reportEntityFilter'.
     * 
     * @param reportEntityFilter the value of field
     * 'reportEntityFilter'.
     */
    public void setReportEntityFilter(
            final org.chocolate_milk.model.ReportEntityFilter reportEntityFilter) {
        this._reportEntityFilter = reportEntityFilter;
    }

    /**
     * Sets the value of field 'reportItemFilter'.
     * 
     * @param reportItemFilter the value of field 'reportItemFilter'
     */
    public void setReportItemFilter(
            final org.chocolate_milk.model.ReportItemFilter reportItemFilter) {
        this._reportItemFilter = reportItemFilter;
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
     * Sets the value of field 'timeReportQueryChoice'.
     * 
     * @param timeReportQueryChoice the value of field
     * 'timeReportQueryChoice'.
     */
    public void setTimeReportQueryChoice(
            final org.chocolate_milk.model.TimeReportQueryChoice timeReportQueryChoice) {
        this._timeReportQueryChoice = timeReportQueryChoice;
    }

    /**
     * Sets the value of field 'timeReportType'.
     * 
     * @param timeReportType the value of field 'timeReportType'.
     */
    public void setTimeReportType(
            final org.chocolate_milk.model.types.TimeReportTypeType timeReportType) {
        this._timeReportType = timeReportType;
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
     * org.chocolate_milk.model.TimeReportQuery
     */
    public static org.chocolate_milk.model.TimeReportQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TimeReportQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TimeReportQuery.class, reader);
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
