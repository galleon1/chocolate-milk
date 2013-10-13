/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ReportRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportTitle.
     */
    private java.lang.String _reportTitle;

    /**
     * Field _reportSubtitle.
     */
    private java.lang.String _reportSubtitle;

    /**
     * Field _reportBasis.
     */
    private org.chocolate_milk.model.types.ReportBasisType _reportBasis = org.chocolate_milk.model.types.ReportBasisType.fromValue("None");

    /**
     * Field _numRows.
     */
    private long _numRows;

    /**
     * keeps track of state for field: _numRows
     */
    private boolean _has_numRows;

    /**
     * Field _numColumns.
     */
    private long _numColumns;

    /**
     * keeps track of state for field: _numColumns
     */
    private boolean _has_numColumns;

    /**
     * Field _numColTitleRows.
     */
    private long _numColTitleRows;

    /**
     * keeps track of state for field: _numColTitleRows
     */
    private boolean _has_numColTitleRows;

    /**
     * Field _colDescList.
     */
    private java.util.List<org.chocolate_milk.model.ColDesc> _colDescList;

    /**
     * Field _reportData.
     */
    private org.chocolate_milk.model.ReportData _reportData;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportRet() {
        super();
        setReportBasis(org.chocolate_milk.model.types.ReportBasisType.fromValue("None"));
        this._colDescList = new java.util.ArrayList<org.chocolate_milk.model.ColDesc>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vColDesc
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColDesc(
            final org.chocolate_milk.model.ColDesc vColDesc)
    throws java.lang.IndexOutOfBoundsException {
        this._colDescList.add(vColDesc);
    }

    /**
     * 
     * 
     * @param index
     * @param vColDesc
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColDesc(
            final int index,
            final org.chocolate_milk.model.ColDesc vColDesc)
    throws java.lang.IndexOutOfBoundsException {
        this._colDescList.add(index, vColDesc);
    }

    /**
     */
    public void deleteNumColTitleRows(
    ) {
        this._has_numColTitleRows= false;
    }

    /**
     */
    public void deleteNumColumns(
    ) {
        this._has_numColumns= false;
    }

    /**
     */
    public void deleteNumRows(
    ) {
        this._has_numRows= false;
    }

    /**
     * Method enumerateColDesc.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ColDesc> enumerateColDesc(
    ) {
        return java.util.Collections.enumeration(this._colDescList);
    }

    /**
     * Method getColDesc.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.ColDesc at
     * the given index
     */
    public org.chocolate_milk.model.ColDesc getColDesc(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colDescList.size()) {
            throw new IndexOutOfBoundsException("getColDesc: Index value '" + index + "' not in range [0.." + (this._colDescList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ColDesc) _colDescList.get(index);
    }

    /**
     * Method getColDesc.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ColDesc[] getColDesc(
    ) {
        org.chocolate_milk.model.ColDesc[] array = new org.chocolate_milk.model.ColDesc[0];
        return (org.chocolate_milk.model.ColDesc[]) this._colDescList.toArray(array);
    }

    /**
     * Method getColDescCount.
     * 
     * @return the size of this collection
     */
    public int getColDescCount(
    ) {
        return this._colDescList.size();
    }

    /**
     * Returns the value of field 'numColTitleRows'.
     * 
     * @return the value of field 'NumColTitleRows'.
     */
    public long getNumColTitleRows(
    ) {
        return this._numColTitleRows;
    }

    /**
     * Returns the value of field 'numColumns'.
     * 
     * @return the value of field 'NumColumns'.
     */
    public long getNumColumns(
    ) {
        return this._numColumns;
    }

    /**
     * Returns the value of field 'numRows'.
     * 
     * @return the value of field 'NumRows'.
     */
    public long getNumRows(
    ) {
        return this._numRows;
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
     * Returns the value of field 'reportData'.
     * 
     * @return the value of field 'ReportData'.
     */
    public org.chocolate_milk.model.ReportData getReportData(
    ) {
        return this._reportData;
    }

    /**
     * Returns the value of field 'reportSubtitle'.
     * 
     * @return the value of field 'ReportSubtitle'.
     */
    public java.lang.String getReportSubtitle(
    ) {
        return this._reportSubtitle;
    }

    /**
     * Returns the value of field 'reportTitle'.
     * 
     * @return the value of field 'ReportTitle'.
     */
    public java.lang.String getReportTitle(
    ) {
        return this._reportTitle;
    }

    /**
     * Method hasNumColTitleRows.
     * 
     * @return true if at least one NumColTitleRows has been added
     */
    public boolean hasNumColTitleRows(
    ) {
        return this._has_numColTitleRows;
    }

    /**
     * Method hasNumColumns.
     * 
     * @return true if at least one NumColumns has been added
     */
    public boolean hasNumColumns(
    ) {
        return this._has_numColumns;
    }

    /**
     * Method hasNumRows.
     * 
     * @return true if at least one NumRows has been added
     */
    public boolean hasNumRows(
    ) {
        return this._has_numRows;
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
     * Method iterateColDesc.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ColDesc> iterateColDesc(
    ) {
        return this._colDescList.iterator();
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
    public void removeAllColDesc(
    ) {
        this._colDescList.clear();
    }

    /**
     * Method removeColDesc.
     * 
     * @param vColDesc
     * @return true if the object was removed from the collection.
     */
    public boolean removeColDesc(
            final org.chocolate_milk.model.ColDesc vColDesc) {
        boolean removed = _colDescList.remove(vColDesc);
        return removed;
    }

    /**
     * Method removeColDescAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ColDesc removeColDescAt(
            final int index) {
        java.lang.Object obj = this._colDescList.remove(index);
        return (org.chocolate_milk.model.ColDesc) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vColDesc
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setColDesc(
            final int index,
            final org.chocolate_milk.model.ColDesc vColDesc)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colDescList.size()) {
            throw new IndexOutOfBoundsException("setColDesc: Index value '" + index + "' not in range [0.." + (this._colDescList.size() - 1) + "]");
        }

        this._colDescList.set(index, vColDesc);
    }

    /**
     * 
     * 
     * @param vColDescArray
     */
    public void setColDesc(
            final org.chocolate_milk.model.ColDesc[] vColDescArray) {
        //-- copy array
        _colDescList.clear();

        for (int i = 0; i < vColDescArray.length; i++) {
                this._colDescList.add(vColDescArray[i]);
        }
    }

    /**
     * Sets the value of field 'numColTitleRows'.
     * 
     * @param numColTitleRows the value of field 'numColTitleRows'.
     */
    public void setNumColTitleRows(
            final long numColTitleRows) {
        this._numColTitleRows = numColTitleRows;
        this._has_numColTitleRows = true;
    }

    /**
     * Sets the value of field 'numColumns'.
     * 
     * @param numColumns the value of field 'numColumns'.
     */
    public void setNumColumns(
            final long numColumns) {
        this._numColumns = numColumns;
        this._has_numColumns = true;
    }

    /**
     * Sets the value of field 'numRows'.
     * 
     * @param numRows the value of field 'numRows'.
     */
    public void setNumRows(
            final long numRows) {
        this._numRows = numRows;
        this._has_numRows = true;
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
     * Sets the value of field 'reportData'.
     * 
     * @param reportData the value of field 'reportData'.
     */
    public void setReportData(
            final org.chocolate_milk.model.ReportData reportData) {
        this._reportData = reportData;
    }

    /**
     * Sets the value of field 'reportSubtitle'.
     * 
     * @param reportSubtitle the value of field 'reportSubtitle'.
     */
    public void setReportSubtitle(
            final java.lang.String reportSubtitle) {
        this._reportSubtitle = reportSubtitle;
    }

    /**
     * Sets the value of field 'reportTitle'.
     * 
     * @param reportTitle the value of field 'reportTitle'.
     */
    public void setReportTitle(
            final java.lang.String reportTitle) {
        this._reportTitle = reportTitle;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ReportRet
     */
    public static org.chocolate_milk.model.ReportRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReportRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReportRet.class, reader);
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
