/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ColDesc.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ColDesc.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ColDesc implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _colID.
     */
    private long _colID;

    /**
     * keeps track of state for field: _colID
     */
    private boolean _has_colID;

    /**
     * Field _dataType.
     */
    private org.chocolate_milk.model.types.ColDescDataTypeType _dataType;

    /**
     * Field _colTitleList.
     */
    private java.util.List<org.chocolate_milk.model.ColTitle> _colTitleList;

    /**
     * Field _colType.
     */
    private org.chocolate_milk.model.types.ColTypeType _colType;


      //----------------/
     //- Constructors -/
    //----------------/

    public ColDesc() {
        super();
        this._colTitleList = new java.util.ArrayList<org.chocolate_milk.model.ColTitle>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vColTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColTitle(
            final org.chocolate_milk.model.ColTitle vColTitle)
    throws java.lang.IndexOutOfBoundsException {
        this._colTitleList.add(vColTitle);
    }

    /**
     * 
     * 
     * @param index
     * @param vColTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColTitle(
            final int index,
            final org.chocolate_milk.model.ColTitle vColTitle)
    throws java.lang.IndexOutOfBoundsException {
        this._colTitleList.add(index, vColTitle);
    }

    /**
     */
    public void deleteColID(
    ) {
        this._has_colID= false;
    }

    /**
     * Method enumerateColTitle.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ColTitle> enumerateColTitle(
    ) {
        return java.util.Collections.enumeration(this._colTitleList);
    }

    /**
     * Returns the value of field 'colID'.
     * 
     * @return the value of field 'ColID'.
     */
    public long getColID(
    ) {
        return this._colID;
    }

    /**
     * Method getColTitle.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.ColTitle
     * at the given index
     */
    public org.chocolate_milk.model.ColTitle getColTitle(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colTitleList.size()) {
            throw new IndexOutOfBoundsException("getColTitle: Index value '" + index + "' not in range [0.." + (this._colTitleList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ColTitle) _colTitleList.get(index);
    }

    /**
     * Method getColTitle.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ColTitle[] getColTitle(
    ) {
        org.chocolate_milk.model.ColTitle[] array = new org.chocolate_milk.model.ColTitle[0];
        return (org.chocolate_milk.model.ColTitle[]) this._colTitleList.toArray(array);
    }

    /**
     * Method getColTitleCount.
     * 
     * @return the size of this collection
     */
    public int getColTitleCount(
    ) {
        return this._colTitleList.size();
    }

    /**
     * Returns the value of field 'colType'.
     * 
     * @return the value of field 'ColType'.
     */
    public org.chocolate_milk.model.types.ColTypeType getColType(
    ) {
        return this._colType;
    }

    /**
     * Returns the value of field 'dataType'.
     * 
     * @return the value of field 'DataType'.
     */
    public org.chocolate_milk.model.types.ColDescDataTypeType getDataType(
    ) {
        return this._dataType;
    }

    /**
     * Method hasColID.
     * 
     * @return true if at least one ColID has been added
     */
    public boolean hasColID(
    ) {
        return this._has_colID;
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
     * Method iterateColTitle.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ColTitle> iterateColTitle(
    ) {
        return this._colTitleList.iterator();
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
    public void removeAllColTitle(
    ) {
        this._colTitleList.clear();
    }

    /**
     * Method removeColTitle.
     * 
     * @param vColTitle
     * @return true if the object was removed from the collection.
     */
    public boolean removeColTitle(
            final org.chocolate_milk.model.ColTitle vColTitle) {
        boolean removed = _colTitleList.remove(vColTitle);
        return removed;
    }

    /**
     * Method removeColTitleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ColTitle removeColTitleAt(
            final int index) {
        java.lang.Object obj = this._colTitleList.remove(index);
        return (org.chocolate_milk.model.ColTitle) obj;
    }

    /**
     * Sets the value of field 'colID'.
     * 
     * @param colID the value of field 'colID'.
     */
    public void setColID(
            final long colID) {
        this._colID = colID;
        this._has_colID = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vColTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setColTitle(
            final int index,
            final org.chocolate_milk.model.ColTitle vColTitle)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colTitleList.size()) {
            throw new IndexOutOfBoundsException("setColTitle: Index value '" + index + "' not in range [0.." + (this._colTitleList.size() - 1) + "]");
        }

        this._colTitleList.set(index, vColTitle);
    }

    /**
     * 
     * 
     * @param vColTitleArray
     */
    public void setColTitle(
            final org.chocolate_milk.model.ColTitle[] vColTitleArray) {
        //-- copy array
        _colTitleList.clear();

        for (int i = 0; i < vColTitleArray.length; i++) {
                this._colTitleList.add(vColTitleArray[i]);
        }
    }

    /**
     * Sets the value of field 'colType'.
     * 
     * @param colType the value of field 'colType'.
     */
    public void setColType(
            final org.chocolate_milk.model.types.ColTypeType colType) {
        this._colType = colType;
    }

    /**
     * Sets the value of field 'dataType'.
     * 
     * @param dataType the value of field 'dataType'.
     */
    public void setDataType(
            final org.chocolate_milk.model.types.ColDescDataTypeType dataType) {
        this._dataType = dataType;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ColDesc
     */
    public static org.chocolate_milk.model.ColDesc unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ColDesc) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ColDesc.class, reader);
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
