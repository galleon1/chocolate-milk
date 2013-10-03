/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListDeletedQuery.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListDeletedQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ListDeletedQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listDelTypeList.
     */
    private java.util.List<org.chocolate_milk.model.types.ListDelTypeType> _listDelTypeList;

    /**
     * Field _deletedDateRangeFilter.
     */
    private org.chocolate_milk.model.DeletedDateRangeFilter _deletedDateRangeFilter;

    /**
     * Field _includeRetElementList.
     */
    private java.util.List<java.lang.String> _includeRetElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListDeletedQuery() {
        super();
        this._listDelTypeList = new java.util.ArrayList<org.chocolate_milk.model.types.ListDelTypeType>();
        this._includeRetElementList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(index, vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param vListDelType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListDelType(
            final org.chocolate_milk.model.types.ListDelTypeType vListDelType)
    throws java.lang.IndexOutOfBoundsException {
        this._listDelTypeList.add(vListDelType);
    }

    /**
     * 
     * 
     * @param index
     * @param vListDelType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListDelType(
            final int index,
            final org.chocolate_milk.model.types.ListDelTypeType vListDelType)
    throws java.lang.IndexOutOfBoundsException {
        this._listDelTypeList.add(index, vListDelType);
    }

    /**
     * Method enumerateIncludeRetElement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateIncludeRetElement(
    ) {
        return java.util.Collections.enumeration(this._includeRetElementList);
    }

    /**
     * Method enumerateListDelType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.ListDelTypeType> enumerateListDelType(
    ) {
        return java.util.Collections.enumeration(this._listDelTypeList);
    }

    /**
     * Returns the value of field 'deletedDateRangeFilter'.
     * 
     * @return the value of field 'DeletedDateRangeFilter'.
     */
    public org.chocolate_milk.model.DeletedDateRangeFilter getDeletedDateRangeFilter(
    ) {
        return this._deletedDateRangeFilter;
    }

    /**
     * Method getIncludeRetElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeRetElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        return (java.lang.String) _includeRetElementList.get(index);
    }

    /**
     * Method getIncludeRetElement.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeRetElement(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeRetElementList.toArray(array);
    }

    /**
     * Method getIncludeRetElementCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRetElementCount(
    ) {
        return this._includeRetElementList.size();
    }

    /**
     * Method getListDelType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.ListDelTypeType at the given
     * index
     */
    public org.chocolate_milk.model.types.ListDelTypeType getListDelType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listDelTypeList.size()) {
            throw new IndexOutOfBoundsException("getListDelType: Index value '" + index + "' not in range [0.." + (this._listDelTypeList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.ListDelTypeType) _listDelTypeList.get(index);
    }

    /**
     * Method getListDelType.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.ListDelTypeType[] getListDelType(
    ) {
        org.chocolate_milk.model.types.ListDelTypeType[] array = new org.chocolate_milk.model.types.ListDelTypeType[0];
        return (org.chocolate_milk.model.types.ListDelTypeType[]) this._listDelTypeList.toArray(array);
    }

    /**
     * Method getListDelTypeCount.
     * 
     * @return the size of this collection
     */
    public int getListDelTypeCount(
    ) {
        return this._listDelTypeList.size();
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
     * Method iterateIncludeRetElement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateIncludeRetElement(
    ) {
        return this._includeRetElementList.iterator();
    }

    /**
     * Method iterateListDelType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.ListDelTypeType> iterateListDelType(
    ) {
        return this._listDelTypeList.iterator();
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
    public void removeAllIncludeRetElement(
    ) {
        this._includeRetElementList.clear();
    }

    /**
     */
    public void removeAllListDelType(
    ) {
        this._listDelTypeList.clear();
    }

    /**
     * Method removeIncludeRetElement.
     * 
     * @param vIncludeRetElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRetElement(
            final java.lang.String vIncludeRetElement) {
        boolean removed = _includeRetElementList.remove(vIncludeRetElement);
        return removed;
    }

    /**
     * Method removeIncludeRetElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeRetElementAt(
            final int index) {
        java.lang.Object obj = this._includeRetElementList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeListDelType.
     * 
     * @param vListDelType
     * @return true if the object was removed from the collection.
     */
    public boolean removeListDelType(
            final org.chocolate_milk.model.types.ListDelTypeType vListDelType) {
        boolean removed = _listDelTypeList.remove(vListDelType);
        return removed;
    }

    /**
     * Method removeListDelTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.ListDelTypeType removeListDelTypeAt(
            final int index) {
        java.lang.Object obj = this._listDelTypeList.remove(index);
        return (org.chocolate_milk.model.types.ListDelTypeType) obj;
    }

    /**
     * Sets the value of field 'deletedDateRangeFilter'.
     * 
     * @param deletedDateRangeFilter the value of field
     * 'deletedDateRangeFilter'.
     */
    public void setDeletedDateRangeFilter(
            final org.chocolate_milk.model.DeletedDateRangeFilter deletedDateRangeFilter) {
        this._deletedDateRangeFilter = deletedDateRangeFilter;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        this._includeRetElementList.set(index, vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param vIncludeRetElementArray
     */
    public void setIncludeRetElement(
            final java.lang.String[] vIncludeRetElementArray) {
        //-- copy array
        _includeRetElementList.clear();

        for (int i = 0; i < vIncludeRetElementArray.length; i++) {
                this._includeRetElementList.add(vIncludeRetElementArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vListDelType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setListDelType(
            final int index,
            final org.chocolate_milk.model.types.ListDelTypeType vListDelType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listDelTypeList.size()) {
            throw new IndexOutOfBoundsException("setListDelType: Index value '" + index + "' not in range [0.." + (this._listDelTypeList.size() - 1) + "]");
        }

        this._listDelTypeList.set(index, vListDelType);
    }

    /**
     * 
     * 
     * @param vListDelTypeArray
     */
    public void setListDelType(
            final org.chocolate_milk.model.types.ListDelTypeType[] vListDelTypeArray) {
        //-- copy array
        _listDelTypeList.clear();

        for (int i = 0; i < vListDelTypeArray.length; i++) {
                this._listDelTypeList.add(vListDelTypeArray[i]);
        }
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
     * org.chocolate_milk.model.ListDeletedQuery
     */
    public static org.chocolate_milk.model.ListDeletedQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListDeletedQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListDeletedQuery.class, reader);
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
