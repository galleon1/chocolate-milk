/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AgingReportQuery.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AgingReportQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class AgingReportQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _agingReportType.
     */
    private org.chocolate_milk.model.types.AgingReportTypeType _agingReportType;

    /**
     * Field _displayReport.
     */
    private java.lang.String _displayReport;

    /**
     * Field _reportCoreFilter.
     */
    private org.chocolate_milk.model.ReportCoreFilter _reportCoreFilter;

    /**
     * Field _includeColumnList.
     */
    private java.util.List<org.chocolate_milk.model.types.IncludeColumnType> _includeColumnList;

    /**
     * Field _includeAccounts.
     */
    private org.chocolate_milk.model.types.IncludeAccountsType _includeAccounts;

    /**
     * Field _reportAgingAsOf.
     */
    private org.chocolate_milk.model.types.ReportAgingAsOfType _reportAgingAsOf = org.chocolate_milk.model.types.ReportAgingAsOfType.fromValue("ReportEndDate");


      //----------------/
     //- Constructors -/
    //----------------/

    public AgingReportQuery() {
        super();
        this._includeColumnList = new java.util.ArrayList<org.chocolate_milk.model.types.IncludeColumnType>();
        setReportAgingAsOf(org.chocolate_milk.model.types.ReportAgingAsOfType.fromValue("ReportEndDate"));
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
     * Returns the value of field 'agingReportType'.
     * 
     * @return the value of field 'AgingReportType'.
     */
    public org.chocolate_milk.model.types.AgingReportTypeType getAgingReportType(
    ) {
        return this._agingReportType;
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
     * Returns the value of field 'reportAgingAsOf'.
     * 
     * @return the value of field 'ReportAgingAsOf'.
     */
    public org.chocolate_milk.model.types.ReportAgingAsOfType getReportAgingAsOf(
    ) {
        return this._reportAgingAsOf;
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
     * Sets the value of field 'agingReportType'.
     * 
     * @param agingReportType the value of field 'agingReportType'.
     */
    public void setAgingReportType(
            final org.chocolate_milk.model.types.AgingReportTypeType agingReportType) {
        this._agingReportType = agingReportType;
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
     * Sets the value of field 'reportAgingAsOf'.
     * 
     * @param reportAgingAsOf the value of field 'reportAgingAsOf'.
     */
    public void setReportAgingAsOf(
            final org.chocolate_milk.model.types.ReportAgingAsOfType reportAgingAsOf) {
        this._reportAgingAsOf = reportAgingAsOf;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.AgingReportQuery
     */
    public static org.chocolate_milk.model.AgingReportQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.AgingReportQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.AgingReportQuery.class, reader);
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
