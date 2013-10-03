/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SubtotalRow.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SubtotalRow.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SubtotalRow implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _rowNumber.
     */
    private long _rowNumber;

    /**
     * keeps track of state for field: _rowNumber
     */
    private boolean _has_rowNumber;

    /**
     * Field _rowData.
     */
    private org.chocolate_milk.model.RowData _rowData;

    /**
     * Field _colDataList.
     */
    private java.util.List<org.chocolate_milk.model.ColData> _colDataList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubtotalRow() {
        super();
        this._colDataList = new java.util.ArrayList<org.chocolate_milk.model.ColData>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vColData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColData(
            final org.chocolate_milk.model.ColData vColData)
    throws java.lang.IndexOutOfBoundsException {
        this._colDataList.add(vColData);
    }

    /**
     * 
     * 
     * @param index
     * @param vColData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColData(
            final int index,
            final org.chocolate_milk.model.ColData vColData)
    throws java.lang.IndexOutOfBoundsException {
        this._colDataList.add(index, vColData);
    }

    /**
     */
    public void deleteRowNumber(
    ) {
        this._has_rowNumber= false;
    }

    /**
     * Method enumerateColData.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ColData> enumerateColData(
    ) {
        return java.util.Collections.enumeration(this._colDataList);
    }

    /**
     * Method getColData.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.ColData at
     * the given index
     */
    public org.chocolate_milk.model.ColData getColData(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colDataList.size()) {
            throw new IndexOutOfBoundsException("getColData: Index value '" + index + "' not in range [0.." + (this._colDataList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ColData) _colDataList.get(index);
    }

    /**
     * Method getColData.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ColData[] getColData(
    ) {
        org.chocolate_milk.model.ColData[] array = new org.chocolate_milk.model.ColData[0];
        return (org.chocolate_milk.model.ColData[]) this._colDataList.toArray(array);
    }

    /**
     * Method getColDataCount.
     * 
     * @return the size of this collection
     */
    public int getColDataCount(
    ) {
        return this._colDataList.size();
    }

    /**
     * Returns the value of field 'rowData'.
     * 
     * @return the value of field 'RowData'.
     */
    public org.chocolate_milk.model.RowData getRowData(
    ) {
        return this._rowData;
    }

    /**
     * Returns the value of field 'rowNumber'.
     * 
     * @return the value of field 'RowNumber'.
     */
    public long getRowNumber(
    ) {
        return this._rowNumber;
    }

    /**
     * Method hasRowNumber.
     * 
     * @return true if at least one RowNumber has been added
     */
    public boolean hasRowNumber(
    ) {
        return this._has_rowNumber;
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
     * Method iterateColData.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ColData> iterateColData(
    ) {
        return this._colDataList.iterator();
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
    public void removeAllColData(
    ) {
        this._colDataList.clear();
    }

    /**
     * Method removeColData.
     * 
     * @param vColData
     * @return true if the object was removed from the collection.
     */
    public boolean removeColData(
            final org.chocolate_milk.model.ColData vColData) {
        boolean removed = _colDataList.remove(vColData);
        return removed;
    }

    /**
     * Method removeColDataAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ColData removeColDataAt(
            final int index) {
        java.lang.Object obj = this._colDataList.remove(index);
        return (org.chocolate_milk.model.ColData) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vColData
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setColData(
            final int index,
            final org.chocolate_milk.model.ColData vColData)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colDataList.size()) {
            throw new IndexOutOfBoundsException("setColData: Index value '" + index + "' not in range [0.." + (this._colDataList.size() - 1) + "]");
        }

        this._colDataList.set(index, vColData);
    }

    /**
     * 
     * 
     * @param vColDataArray
     */
    public void setColData(
            final org.chocolate_milk.model.ColData[] vColDataArray) {
        //-- copy array
        _colDataList.clear();

        for (int i = 0; i < vColDataArray.length; i++) {
                this._colDataList.add(vColDataArray[i]);
        }
    }

    /**
     * Sets the value of field 'rowData'.
     * 
     * @param rowData the value of field 'rowData'.
     */
    public void setRowData(
            final org.chocolate_milk.model.RowData rowData) {
        this._rowData = rowData;
    }

    /**
     * Sets the value of field 'rowNumber'.
     * 
     * @param rowNumber the value of field 'rowNumber'.
     */
    public void setRowNumber(
            final long rowNumber) {
        this._rowNumber = rowNumber;
        this._has_rowNumber = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.SubtotalRow
     */
    public static org.chocolate_milk.model.SubtotalRow unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SubtotalRow) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SubtotalRow.class, reader);
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
