/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Form1099CategoryAccountMappingRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Form1099CategoryAccountMappingRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class Form1099CategoryAccountMappingRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isFiling1099Misc.
     */
    private java.lang.String _isFiling1099Misc;

    /**
     * Field _categoryAccountMappingList.
     */
    private java.util.List<org.chocolate_milk.model.CategoryAccountMapping> _categoryAccountMappingList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Form1099CategoryAccountMappingRet() {
        super();
        this._categoryAccountMappingList = new java.util.ArrayList<org.chocolate_milk.model.CategoryAccountMapping>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCategoryAccountMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategoryAccountMapping(
            final org.chocolate_milk.model.CategoryAccountMapping vCategoryAccountMapping)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryAccountMappingList.add(vCategoryAccountMapping);
    }

    /**
     * 
     * 
     * @param index
     * @param vCategoryAccountMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategoryAccountMapping(
            final int index,
            final org.chocolate_milk.model.CategoryAccountMapping vCategoryAccountMapping)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryAccountMappingList.add(index, vCategoryAccountMapping);
    }

    /**
     * Method enumerateCategoryAccountMapping.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CategoryAccountMapping> enumerateCategoryAccountMapping(
    ) {
        return java.util.Collections.enumeration(this._categoryAccountMappingList);
    }

    /**
     * Method getCategoryAccountMapping.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CategoryAccountMapping at the given
     * index
     */
    public org.chocolate_milk.model.CategoryAccountMapping getCategoryAccountMapping(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryAccountMappingList.size()) {
            throw new IndexOutOfBoundsException("getCategoryAccountMapping: Index value '" + index + "' not in range [0.." + (this._categoryAccountMappingList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CategoryAccountMapping) _categoryAccountMappingList.get(index);
    }

    /**
     * Method getCategoryAccountMapping.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CategoryAccountMapping[] getCategoryAccountMapping(
    ) {
        org.chocolate_milk.model.CategoryAccountMapping[] array = new org.chocolate_milk.model.CategoryAccountMapping[0];
        return (org.chocolate_milk.model.CategoryAccountMapping[]) this._categoryAccountMappingList.toArray(array);
    }

    /**
     * Method getCategoryAccountMappingCount.
     * 
     * @return the size of this collection
     */
    public int getCategoryAccountMappingCount(
    ) {
        return this._categoryAccountMappingList.size();
    }

    /**
     * Returns the value of field 'isFiling1099Misc'.
     * 
     * @return the value of field 'IsFiling1099Misc'.
     */
    public java.lang.String getIsFiling1099Misc(
    ) {
        return this._isFiling1099Misc;
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
     * Method iterateCategoryAccountMapping.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CategoryAccountMapping> iterateCategoryAccountMapping(
    ) {
        return this._categoryAccountMappingList.iterator();
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
    public void removeAllCategoryAccountMapping(
    ) {
        this._categoryAccountMappingList.clear();
    }

    /**
     * Method removeCategoryAccountMapping.
     * 
     * @param vCategoryAccountMapping
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategoryAccountMapping(
            final org.chocolate_milk.model.CategoryAccountMapping vCategoryAccountMapping) {
        boolean removed = _categoryAccountMappingList.remove(vCategoryAccountMapping);
        return removed;
    }

    /**
     * Method removeCategoryAccountMappingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CategoryAccountMapping removeCategoryAccountMappingAt(
            final int index) {
        java.lang.Object obj = this._categoryAccountMappingList.remove(index);
        return (org.chocolate_milk.model.CategoryAccountMapping) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCategoryAccountMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategoryAccountMapping(
            final int index,
            final org.chocolate_milk.model.CategoryAccountMapping vCategoryAccountMapping)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryAccountMappingList.size()) {
            throw new IndexOutOfBoundsException("setCategoryAccountMapping: Index value '" + index + "' not in range [0.." + (this._categoryAccountMappingList.size() - 1) + "]");
        }

        this._categoryAccountMappingList.set(index, vCategoryAccountMapping);
    }

    /**
     * 
     * 
     * @param vCategoryAccountMappingArray
     */
    public void setCategoryAccountMapping(
            final org.chocolate_milk.model.CategoryAccountMapping[] vCategoryAccountMappingArray) {
        //-- copy array
        _categoryAccountMappingList.clear();

        for (int i = 0; i < vCategoryAccountMappingArray.length; i++) {
                this._categoryAccountMappingList.add(vCategoryAccountMappingArray[i]);
        }
    }

    /**
     * Sets the value of field 'isFiling1099Misc'.
     * 
     * @param isFiling1099Misc the value of field 'isFiling1099Misc'
     */
    public void setIsFiling1099Misc(
            final java.lang.String isFiling1099Misc) {
        this._isFiling1099Misc = isFiling1099Misc;
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
     * org.chocolate_milk.model.Form1099CategoryAccountMappingRet
     */
    public static org.chocolate_milk.model.Form1099CategoryAccountMappingRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.Form1099CategoryAccountMappingRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.Form1099CategoryAccountMappingRet.class, reader);
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
