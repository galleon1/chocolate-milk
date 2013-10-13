/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Form1099CategoryAccountMappingQuery.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Form1099CategoryAccountMappingQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class Form1099CategoryAccountMappingQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mappingCategoryList.
     */
    private java.util.List<org.chocolate_milk.model.types.MappingCategoryType> _mappingCategoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Form1099CategoryAccountMappingQuery() {
        super();
        this._mappingCategoryList = new java.util.ArrayList<org.chocolate_milk.model.types.MappingCategoryType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMappingCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMappingCategory(
            final org.chocolate_milk.model.types.MappingCategoryType vMappingCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingCategoryList.add(vMappingCategory);
    }

    /**
     * 
     * 
     * @param index
     * @param vMappingCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMappingCategory(
            final int index,
            final org.chocolate_milk.model.types.MappingCategoryType vMappingCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingCategoryList.add(index, vMappingCategory);
    }

    /**
     * Method enumerateMappingCategory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.MappingCategoryType> enumerateMappingCategory(
    ) {
        return java.util.Collections.enumeration(this._mappingCategoryList);
    }

    /**
     * Method getMappingCategory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.MappingCategoryType at the
     * given index
     */
    public org.chocolate_milk.model.types.MappingCategoryType getMappingCategory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingCategoryList.size()) {
            throw new IndexOutOfBoundsException("getMappingCategory: Index value '" + index + "' not in range [0.." + (this._mappingCategoryList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.MappingCategoryType) _mappingCategoryList.get(index);
    }

    /**
     * Method getMappingCategory.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.MappingCategoryType[] getMappingCategory(
    ) {
        org.chocolate_milk.model.types.MappingCategoryType[] array = new org.chocolate_milk.model.types.MappingCategoryType[0];
        return (org.chocolate_milk.model.types.MappingCategoryType[]) this._mappingCategoryList.toArray(array);
    }

    /**
     * Method getMappingCategoryCount.
     * 
     * @return the size of this collection
     */
    public int getMappingCategoryCount(
    ) {
        return this._mappingCategoryList.size();
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
     * Method iterateMappingCategory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.MappingCategoryType> iterateMappingCategory(
    ) {
        return this._mappingCategoryList.iterator();
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
    public void removeAllMappingCategory(
    ) {
        this._mappingCategoryList.clear();
    }

    /**
     * Method removeMappingCategory.
     * 
     * @param vMappingCategory
     * @return true if the object was removed from the collection.
     */
    public boolean removeMappingCategory(
            final org.chocolate_milk.model.types.MappingCategoryType vMappingCategory) {
        boolean removed = _mappingCategoryList.remove(vMappingCategory);
        return removed;
    }

    /**
     * Method removeMappingCategoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.MappingCategoryType removeMappingCategoryAt(
            final int index) {
        java.lang.Object obj = this._mappingCategoryList.remove(index);
        return (org.chocolate_milk.model.types.MappingCategoryType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMappingCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMappingCategory(
            final int index,
            final org.chocolate_milk.model.types.MappingCategoryType vMappingCategory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingCategoryList.size()) {
            throw new IndexOutOfBoundsException("setMappingCategory: Index value '" + index + "' not in range [0.." + (this._mappingCategoryList.size() - 1) + "]");
        }

        this._mappingCategoryList.set(index, vMappingCategory);
    }

    /**
     * 
     * 
     * @param vMappingCategoryArray
     */
    public void setMappingCategory(
            final org.chocolate_milk.model.types.MappingCategoryType[] vMappingCategoryArray) {
        //-- copy array
        _mappingCategoryList.clear();

        for (int i = 0; i < vMappingCategoryArray.length; i++) {
                this._mappingCategoryList.add(vMappingCategoryArray[i]);
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
     * org.chocolate_milk.model.Form1099CategoryAccountMappingQuery
     */
    public static org.chocolate_milk.model.Form1099CategoryAccountMappingQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.Form1099CategoryAccountMappingQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.Form1099CategoryAccountMappingQuery.class, reader);
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
