/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CustomDetailReportQuery.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CustomDetailReportQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CustomDetailReportQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _customDetailReportType.
     */
    private org.chocolate_milk.model.types.CustomDetailReportTypeType _customDetailReportType;

    /**
     * Field _displayReport.
     */
    private java.lang.String _displayReport;

    /**
     * Field _reportCoreFilter.
     */
    private org.chocolate_milk.model.ReportCoreFilter _reportCoreFilter;

    /**
     * Field _summarizeRowsBy.
     */
    private org.chocolate_milk.model.types.SummarizeRowsByType _summarizeRowsBy;

    /**
     * Field _includeColumnList.
     */
    private java.util.List<org.chocolate_milk.model.types.IncludeColumnType> _includeColumnList;

    /**
     * Field _includeAccounts.
     */
    private org.chocolate_milk.model.types.IncludeAccountsType _includeAccounts;

    /**
     * Field _reportOpenBalanceAsOf.
     */
    private org.chocolate_milk.model.types.ReportOpenBalanceAsOfType _reportOpenBalanceAsOf = org.chocolate_milk.model.types.ReportOpenBalanceAsOfType.fromValue("Today");

    /**
     * Field _reportBasis.
     */
    private org.chocolate_milk.model.types.ReportBasisType _reportBasis = org.chocolate_milk.model.types.ReportBasisType.fromValue("None");


      //----------------/
     //- Constructors -/
    //----------------/

    public CustomDetailReportQuery() {
        super();
        this._includeColumnList = new java.util.ArrayList<org.chocolate_milk.model.types.IncludeColumnType>();
        setReportOpenBalanceAsOf(org.chocolate_milk.model.types.ReportOpenBalanceAsOfType.fromValue("Today"));
        setReportBasis(org.chocolate_milk.model.types.ReportBasisType.fromValue("None"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIncludeColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeColumn(
            final org.chocolate_milk.model.types.IncludeColumnType vIncludeColumn)
    throws java.lang.IndexOutOfBoundsException {
        this._includeColumnList.add(vIncludeColumn);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeColumn(
            final int index,
            final org.chocolate_milk.model.types.IncludeColumnType vIncludeColumn)
    throws java.lang.IndexOutOfBoundsException {
        this._includeColumnList.add(index, vIncludeColumn);
    }

    /**
     * Method enumerateIncludeColumn.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.IncludeColumnType> enumerateIncludeColumn(
    ) {
        return java.util.Collections.enumeration(this._includeColumnList);
    }

    /**
     * Returns the value of field 'customDetailReportType'.
     * 
     * @return the value of field 'CustomDetailReportType'.
     */
    public org.chocolate_milk.model.types.CustomDetailReportTypeType getCustomDetailReportType(
    ) {
        return this._customDetailReportType;
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
     * Returns the value of field 'includeAccounts'.
     * 
     * @return the value of field 'IncludeAccounts'.
     */
    public org.chocolate_milk.model.types.IncludeAccountsType getIncludeAccounts(
    ) {
        return this._includeAccounts;
    }

    /**
     * Method getIncludeColumn.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.IncludeColumnType at the
     * given index
     */
    public org.chocolate_milk.model.types.IncludeColumnType getIncludeColumn(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeColumnList.size()) {
            throw new IndexOutOfBoundsException("getIncludeColumn: Index value '" + index + "' not in range [0.." + (this._includeColumnList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.IncludeColumnType) _includeColumnList.get(index);
    }

    /**
     * Method getIncludeColumn.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.IncludeColumnType[] getIncludeColumn(
    ) {
        org.chocolate_milk.model.types.IncludeColumnType[] array = new org.chocolate_milk.model.types.IncludeColumnType[0];
        return (org.chocolate_milk.model.types.IncludeColumnType[]) this._includeColumnList.toArray(array);
    }

    /**
     * Method getIncludeColumnCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeColumnCount(
    ) {
        return this._includeColumnList.size();
    }

    /**
     * Returns the value of field 'reportBasis'.
     * 
     * @return the value of field 'ReportBasis'.
     */
    public org.chocolate_milk.model.types.ReportBasisType getReportBasis(
    ) {
        return this._reportBasis;
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
     * Returns the value of field 'reportOpenBalanceAsOf'.
     * 
     * @return the value of field 'ReportOpenBalanceAsOf'.
     */
    public org.chocolate_milk.model.types.ReportOpenBalanceAsOfType getReportOpenBalanceAsOf(
    ) {
        return this._reportOpenBalanceAsOf;
    }

    /**
     * Returns the value of field 'summarizeRowsBy'.
     * 
     * @return the value of field 'SummarizeRowsBy'.
     */
    public org.chocolate_milk.model.types.SummarizeRowsByType getSummarizeRowsBy(
    ) {
        return this._summarizeRowsBy;
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
     * Method iterateIncludeColumn.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.IncludeColumnType> iterateIncludeColumn(
    ) {
        return this._includeColumnList.iterator();
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
     */
    public void removeAllIncludeColumn(
    ) {
        this._includeColumnList.clear();
    }

    /**
     * Method removeIncludeColumn.
     * 
     * @param vIncludeColumn
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeColumn(
            final org.chocolate_milk.model.types.IncludeColumnType vIncludeColumn) {
        boolean removed = _includeColumnList.remove(vIncludeColumn);
        return removed;
    }

    /**
     * Method removeIncludeColumnAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.IncludeColumnType removeIncludeColumnAt(
            final int index) {
        java.lang.Object obj = this._includeColumnList.remove(index);
        return (org.chocolate_milk.model.types.IncludeColumnType) obj;
    }

    /**
     * Sets the value of field 'customDetailReportType'.
     * 
     * @param customDetailReportType the value of field
     * 'customDetailReportType'.
     */
    public void setCustomDetailReportType(
            final org.chocolate_milk.model.types.CustomDetailReportTypeType customDetailReportType) {
        this._customDetailReportType = customDetailReportType;
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
     * Sets the value of field 'includeAccounts'.
     * 
     * @param includeAccounts the value of field 'includeAccounts'.
     */
    public void setIncludeAccounts(
            final org.chocolate_milk.model.types.IncludeAccountsType includeAccounts) {
        this._includeAccounts = includeAccounts;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeColumn(
            final int index,
            final org.chocolate_milk.model.types.IncludeColumnType vIncludeColumn)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeColumnList.size()) {
            throw new IndexOutOfBoundsException("setIncludeColumn: Index value '" + index + "' not in range [0.." + (this._includeColumnList.size() - 1) + "]");
        }

        this._includeColumnList.set(index, vIncludeColumn);
    }

    /**
     * 
     * 
     * @param vIncludeColumnArray
     */
    public void setIncludeColumn(
            final org.chocolate_milk.model.types.IncludeColumnType[] vIncludeColumnArray) {
        //-- copy array
        _includeColumnList.clear();

        for (int i = 0; i < vIncludeColumnArray.length; i++) {
                this._includeColumnList.add(vIncludeColumnArray[i]);
        }
    }

    /**
     * Sets the value of field 'reportBasis'.
     * 
     * @param reportBasis the value of field 'reportBasis'.
     */
    public void setReportBasis(
            final org.chocolate_milk.model.types.ReportBasisType reportBasis) {
        this._reportBasis = reportBasis;
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
     * Sets the value of field 'reportOpenBalanceAsOf'.
     * 
     * @param reportOpenBalanceAsOf the value of field
     * 'reportOpenBalanceAsOf'.
     */
    public void setReportOpenBalanceAsOf(
            final org.chocolate_milk.model.types.ReportOpenBalanceAsOfType reportOpenBalanceAsOf) {
        this._reportOpenBalanceAsOf = reportOpenBalanceAsOf;
    }

    /**
     * Sets the value of field 'summarizeRowsBy'.
     * 
     * @param summarizeRowsBy the value of field 'summarizeRowsBy'.
     */
    public void setSummarizeRowsBy(
            final org.chocolate_milk.model.types.SummarizeRowsByType summarizeRowsBy) {
        this._summarizeRowsBy = summarizeRowsBy;
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
     * org.chocolate_milk.model.CustomDetailReportQuery
     */
    public static org.chocolate_milk.model.CustomDetailReportQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CustomDetailReportQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CustomDetailReportQuery.class, reader);
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
