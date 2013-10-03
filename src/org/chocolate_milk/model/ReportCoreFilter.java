/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportCoreFilter.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportCoreFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ReportCoreFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportCoreFilterChoice.
     */
    private org.chocolate_milk.model.ReportCoreFilterChoice _reportCoreFilterChoice;

    /**
     * Field _reportAccountFilter.
     */
    private org.chocolate_milk.model.ReportAccountFilter _reportAccountFilter;

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
     * Field _reportTxnTypeFilter.
     */
    private org.chocolate_milk.model.ReportTxnTypeFilter _reportTxnTypeFilter;

    /**
     * Field _reportCoreFilterChoice2.
     */
    private org.chocolate_milk.model.ReportCoreFilterChoice2 _reportCoreFilterChoice2;

    /**
     * Field _reportDetailLevelFilter.
     */
    private org.chocolate_milk.model.types.ReportDetailLevelFilterType _reportDetailLevelFilter = org.chocolate_milk.model.types.ReportDetailLevelFilterType.fromValue("All");

    /**
     * Field _reportPostingStatusFilter.
     */
    private org.chocolate_milk.model.types.ReportPostingStatusFilterType _reportPostingStatusFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportCoreFilter() {
        super();
        setReportDetailLevelFilter(org.chocolate_milk.model.types.ReportDetailLevelFilterType.fromValue("All"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'reportAccountFilter'.
     * 
     * @return the value of field 'ReportAccountFilter'.
     */
    public org.chocolate_milk.model.ReportAccountFilter getReportAccountFilter(
    ) {
        return this._reportAccountFilter;
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
     * Returns the value of field 'reportCoreFilterChoice'.
     * 
     * @return the value of field 'ReportCoreFilterChoice'.
     */
    public org.chocolate_milk.model.ReportCoreFilterChoice getReportCoreFilterChoice(
    ) {
        return this._reportCoreFilterChoice;
    }

    /**
     * Returns the value of field 'reportCoreFilterChoice2'.
     * 
     * @return the value of field 'ReportCoreFilterChoice2'.
     */
    public org.chocolate_milk.model.ReportCoreFilterChoice2 getReportCoreFilterChoice2(
    ) {
        return this._reportCoreFilterChoice2;
    }

    /**
     * Returns the value of field 'reportDetailLevelFilter'.
     * 
     * @return the value of field 'ReportDetailLevelFilter'.
     */
    public org.chocolate_milk.model.types.ReportDetailLevelFilterType getReportDetailLevelFilter(
    ) {
        return this._reportDetailLevelFilter;
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
     * Returns the value of field 'reportPostingStatusFilter'.
     * 
     * @return the value of field 'ReportPostingStatusFilter'.
     */
    public org.chocolate_milk.model.types.ReportPostingStatusFilterType getReportPostingStatusFilter(
    ) {
        return this._reportPostingStatusFilter;
    }

    /**
     * Returns the value of field 'reportTxnTypeFilter'.
     * 
     * @return the value of field 'ReportTxnTypeFilter'.
     */
    public org.chocolate_milk.model.ReportTxnTypeFilter getReportTxnTypeFilter(
    ) {
        return this._reportTxnTypeFilter;
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
     * Sets the value of field 'reportAccountFilter'.
     * 
     * @param reportAccountFilter the value of field
     * 'reportAccountFilter'.
     */
    public void setReportAccountFilter(
            final org.chocolate_milk.model.ReportAccountFilter reportAccountFilter) {
        this._reportAccountFilter = reportAccountFilter;
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
     * Sets the value of field 'reportCoreFilterChoice'.
     * 
     * @param reportCoreFilterChoice the value of field
     * 'reportCoreFilterChoice'.
     */
    public void setReportCoreFilterChoice(
            final org.chocolate_milk.model.ReportCoreFilterChoice reportCoreFilterChoice) {
        this._reportCoreFilterChoice = reportCoreFilterChoice;
    }

    /**
     * Sets the value of field 'reportCoreFilterChoice2'.
     * 
     * @param reportCoreFilterChoice2 the value of field
     * 'reportCoreFilterChoice2'.
     */
    public void setReportCoreFilterChoice2(
            final org.chocolate_milk.model.ReportCoreFilterChoice2 reportCoreFilterChoice2) {
        this._reportCoreFilterChoice2 = reportCoreFilterChoice2;
    }

    /**
     * Sets the value of field 'reportDetailLevelFilter'.
     * 
     * @param reportDetailLevelFilter the value of field
     * 'reportDetailLevelFilter'.
     */
    public void setReportDetailLevelFilter(
            final org.chocolate_milk.model.types.ReportDetailLevelFilterType reportDetailLevelFilter) {
        this._reportDetailLevelFilter = reportDetailLevelFilter;
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
     * Sets the value of field 'reportPostingStatusFilter'.
     * 
     * @param reportPostingStatusFilter the value of field
     * 'reportPostingStatusFilter'.
     */
    public void setReportPostingStatusFilter(
            final org.chocolate_milk.model.types.ReportPostingStatusFilterType reportPostingStatusFilter) {
        this._reportPostingStatusFilter = reportPostingStatusFilter;
    }

    /**
     * Sets the value of field 'reportTxnTypeFilter'.
     * 
     * @param reportTxnTypeFilter the value of field
     * 'reportTxnTypeFilter'.
     */
    public void setReportTxnTypeFilter(
            final org.chocolate_milk.model.ReportTxnTypeFilter reportTxnTypeFilter) {
        this._reportTxnTypeFilter = reportTxnTypeFilter;
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
     * org.chocolate_milk.model.ReportCoreFilter
     */
    public static org.chocolate_milk.model.ReportCoreFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReportCoreFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReportCoreFilter.class, reader);
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
