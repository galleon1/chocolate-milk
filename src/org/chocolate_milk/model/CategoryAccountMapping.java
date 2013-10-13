/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CategoryAccountMapping.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CategoryAccountMapping.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CategoryAccountMapping implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mappingCategory.
     */
    private org.chocolate_milk.model.types.MappingCategoryType _mappingCategory;

    /**
     * Field _accountRefList.
     */
    private java.util.List<org.chocolate_milk.model.AccountRef> _accountRefList;

    /**
     * Field _threshold.
     */
    private java.lang.String _threshold;


      //----------------/
     //- Constructors -/
    //----------------/

    public CategoryAccountMapping() {
        super();
        this._accountRefList = new java.util.ArrayList<org.chocolate_milk.model.AccountRef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAccountRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccountRef(
            final org.chocolate_milk.model.AccountRef vAccountRef)
    throws java.lang.IndexOutOfBoundsException {
        this._accountRefList.add(vAccountRef);
    }

    /**
     * 
     * 
     * @param index
     * @param vAccountRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccountRef(
            final int index,
            final org.chocolate_milk.model.AccountRef vAccountRef)
    throws java.lang.IndexOutOfBoundsException {
        this._accountRefList.add(index, vAccountRef);
    }

    /**
     * Method enumerateAccountRef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.AccountRef> enumerateAccountRef(
    ) {
        return java.util.Collections.enumeration(this._accountRefList);
    }

    /**
     * Method getAccountRef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.AccountRef
     * at the given index
     */
    public org.chocolate_milk.model.AccountRef getAccountRef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accountRefList.size()) {
            throw new IndexOutOfBoundsException("getAccountRef: Index value '" + index + "' not in range [0.." + (this._accountRefList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.AccountRef) _accountRefList.get(index);
    }

    /**
     * Method getAccountRef.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.AccountRef[] getAccountRef(
    ) {
        org.chocolate_milk.model.AccountRef[] array = new org.chocolate_milk.model.AccountRef[0];
        return (org.chocolate_milk.model.AccountRef[]) this._accountRefList.toArray(array);
    }

    /**
     * Method getAccountRefCount.
     * 
     * @return the size of this collection
     */
    public int getAccountRefCount(
    ) {
        return this._accountRefList.size();
    }

    /**
     * Returns the value of field 'mappingCategory'.
     * 
     * @return the value of field 'MappingCategory'.
     */
    public org.chocolate_milk.model.types.MappingCategoryType getMappingCategory(
    ) {
        return this._mappingCategory;
    }

    /**
     * Returns the value of field 'threshold'.
     * 
     * @return the value of field 'Threshold'.
     */
    public java.lang.String getThreshold(
    ) {
        return this._threshold;
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
     * Method iterateAccountRef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.AccountRef> iterateAccountRef(
    ) {
        return this._accountRefList.iterator();
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
     * Method removeAccountRef.
     * 
     * @param vAccountRef
     * @return true if the object was removed from the collection.
     */
    public boolean removeAccountRef(
            final org.chocolate_milk.model.AccountRef vAccountRef) {
        boolean removed = _accountRefList.remove(vAccountRef);
        return removed;
    }

    /**
     * Method removeAccountRefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.AccountRef removeAccountRefAt(
            final int index) {
        java.lang.Object obj = this._accountRefList.remove(index);
        return (org.chocolate_milk.model.AccountRef) obj;
    }

    /**
     */
    public void removeAllAccountRef(
    ) {
        this._accountRefList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vAccountRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAccountRef(
            final int index,
            final org.chocolate_milk.model.AccountRef vAccountRef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accountRefList.size()) {
            throw new IndexOutOfBoundsException("setAccountRef: Index value '" + index + "' not in range [0.." + (this._accountRefList.size() - 1) + "]");
        }

        this._accountRefList.set(index, vAccountRef);
    }

    /**
     * 
     * 
     * @param vAccountRefArray
     */
    public void setAccountRef(
            final org.chocolate_milk.model.AccountRef[] vAccountRefArray) {
        //-- copy array
        _accountRefList.clear();

        for (int i = 0; i < vAccountRefArray.length; i++) {
                this._accountRefList.add(vAccountRefArray[i]);
        }
    }

    /**
     * Sets the value of field 'mappingCategory'.
     * 
     * @param mappingCategory the value of field 'mappingCategory'.
     */
    public void setMappingCategory(
            final org.chocolate_milk.model.types.MappingCategoryType mappingCategory) {
        this._mappingCategory = mappingCategory;
    }

    /**
     * Sets the value of field 'threshold'.
     * 
     * @param threshold the value of field 'threshold'.
     */
    public void setThreshold(
            final java.lang.String threshold) {
        this._threshold = threshold;
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
     * org.chocolate_milk.model.CategoryAccountMapping
     */
    public static org.chocolate_milk.model.CategoryAccountMapping unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CategoryAccountMapping) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CategoryAccountMapping.class, reader);
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
