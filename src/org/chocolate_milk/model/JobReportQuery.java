/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JobReportQuery.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JobReportQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class JobReportQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _jobReportType.
     */
    private org.chocolate_milk.model.types.JobReportTypeType _jobReportType;

    /**
     * Field _displayReport.
     */
    private java.lang.String _displayReport;

    /**
     * Field _reportCoreFilter.
     */
    private org.chocolate_milk.model.ReportCoreFilter _reportCoreFilter;

    /**
     * Field _summarizeColumnsBy.
     */
    private org.chocolate_milk.model.types.SummarizeColumnsByType _summarizeColumnsBy;

    /**
     * Field _includeSubcolumns.
     */
    private java.lang.String _includeSubcolumns;


      //----------------/
     //- Constructors -/
    //----------------/

    public JobReportQuery() {
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
     * Returns the value of field 'jobReportType'.
     * 
     * @return the value of field 'JobReportType'.
     */
    public org.chocolate_milk.model.types.JobReportTypeType getJobReportType(
    ) {
        return this._jobReportType;
    }

    /**
     * Returns the value of field 'reportCoreFilter'.
     * 
     * @return the value of field 'ReportCoreFilter'.
     */
    public org.chocolate_milk.model.ReportCoreFilter getReportCoreFilter(
    ) {
        return this._reportCoreFilter;
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
     * Sets the value of field 'jobReportType'.
     * 
     * @param jobReportType the value of field 'jobReportType'.
     */
    public void setJobReportType(
            final org.chocolate_milk.model.types.JobReportTypeType jobReportType) {
        this._jobReportType = jobReportType;
    }

    /**
     * Sets the value of field 'reportCoreFilter'.
     * 
     * @param reportCoreFilter the value of field 'reportCoreFilter'
     */
    public void setReportCoreFilter(
            final org.chocolate_milk.model.ReportCoreFilter reportCoreFilter) {
        this._reportCoreFilter = reportCoreFilter;
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
     * org.chocolate_milk.model.JobReportQuery
     */
    public static org.chocolate_milk.model.JobReportQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JobReportQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JobReportQuery.class, reader);
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
