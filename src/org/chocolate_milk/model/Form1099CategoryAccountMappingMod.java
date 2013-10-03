/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Form1099CategoryAccountMappingMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Form1099CategoryAccountMappingMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class Form1099CategoryAccountMappingMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isFiling1099Misc.
     */
    private java.lang.String _isFiling1099Misc;

    /**
     * Field _categoryAccountMappingModList.
     */
    private java.util.List<org.chocolate_milk.model.CategoryAccountMappingMod> _categoryAccountMappingModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Form1099CategoryAccountMappingMod() {
        super();
        this._categoryAccountMappingModList = new java.util.ArrayList<org.chocolate_milk.model.CategoryAccountMappingMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCategoryAccountMappingMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategoryAccountMappingMod(
            final org.chocolate_milk.model.CategoryAccountMappingMod vCategoryAccountMappingMod)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryAccountMappingModList.add(vCategoryAccountMappingMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vCategoryAccountMappingMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategoryAccountMappingMod(
            final int index,
            final org.chocolate_milk.model.CategoryAccountMappingMod vCategoryAccountMappingMod)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryAccountMappingModList.add(index, vCategoryAccountMappingMod);
    }

    /**
     * Method enumerateCategoryAccountMappingMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CategoryAccountMappingMod> enumerateCategoryAccountMappingMod(
    ) {
        return java.util.Collections.enumeration(this._categoryAccountMappingModList);
    }

    /**
     * Method getCategoryAccountMappingMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CategoryAccountMappingMod at the
     * given index
     */
    public org.chocolate_milk.model.CategoryAccountMappingMod getCategoryAccountMappingMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryAccountMappingModList.size()) {
            throw new IndexOutOfBoundsException("getCategoryAccountMappingMod: Index value '" + index + "' not in range [0.." + (this._categoryAccountMappingModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CategoryAccountMappingMod) _categoryAccountMappingModList.get(index);
    }

    /**
     * Method getCategoryAccountMappingMod.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CategoryAccountMappingMod[] getCategoryAccountMappingMod(
    ) {
        org.chocolate_milk.model.CategoryAccountMappingMod[] array = new org.chocolate_milk.model.CategoryAccountMappingMod[0];
        return (org.chocolate_milk.model.CategoryAccountMappingMod[]) this._categoryAccountMappingModList.toArray(array);
    }

    /**
     * Method getCategoryAccountMappingModCount.
     * 
     * @return the size of this collection
     */
    public int getCategoryAccountMappingModCount(
    ) {
        return this._categoryAccountMappingModList.size();
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
     * Method iterateCategoryAccountMappingMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CategoryAccountMappingMod> iterateCategoryAccountMappingMod(
    ) {
        return this._categoryAccountMappingModList.iterator();
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
    public void removeAllCategoryAccountMappingMod(
    ) {
        this._categoryAccountMappingModList.clear();
    }

    /**
     * Method removeCategoryAccountMappingMod.
     * 
     * @param vCategoryAccountMappingMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategoryAccountMappingMod(
            final org.chocolate_milk.model.CategoryAccountMappingMod vCategoryAccountMappingMod) {
        boolean removed = _categoryAccountMappingModList.remove(vCategoryAccountMappingMod);
        return removed;
    }

    /**
     * Method removeCategoryAccountMappingModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CategoryAccountMappingMod removeCategoryAccountMappingModAt(
            final int index) {
        java.lang.Object obj = this._categoryAccountMappingModList.remove(index);
        return (org.chocolate_milk.model.CategoryAccountMappingMod) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCategoryAccountMappingMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategoryAccountMappingMod(
            final int index,
            final org.chocolate_milk.model.CategoryAccountMappingMod vCategoryAccountMappingMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryAccountMappingModList.size()) {
            throw new IndexOutOfBoundsException("setCategoryAccountMappingMod: Index value '" + index + "' not in range [0.." + (this._categoryAccountMappingModList.size() - 1) + "]");
        }

        this._categoryAccountMappingModList.set(index, vCategoryAccountMappingMod);
    }

    /**
     * 
     * 
     * @param vCategoryAccountMappingModArray
     */
    public void setCategoryAccountMappingMod(
            final org.chocolate_milk.model.CategoryAccountMappingMod[] vCategoryAccountMappingModArray) {
        //-- copy array
        _categoryAccountMappingModList.clear();

        for (int i = 0; i < vCategoryAccountMappingModArray.length; i++) {
                this._categoryAccountMappingModList.add(vCategoryAccountMappingModArray[i]);
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
     * org.chocolate_milk.model.Form1099CategoryAccountMappingMod
     */
    public static org.chocolate_milk.model.Form1099CategoryAccountMappingMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.Form1099CategoryAccountMappingMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.Form1099CategoryAccountMappingMod.class, reader);
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
