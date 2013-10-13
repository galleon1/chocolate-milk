/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CategoryAccountMappingMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CategoryAccountMappingMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CategoryAccountMappingMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mappingCategory.
     */
    private org.chocolate_milk.model.types.MappingCategoryType _mappingCategory;

    /**
     * Field _mappingAccountList.
     */
    private java.util.List<org.chocolate_milk.model.MappingAccount> _mappingAccountList;

    /**
     * Field _threshold.
     */
    private java.lang.String _threshold;


      //----------------/
     //- Constructors -/
    //----------------/

    public CategoryAccountMappingMod() {
        super();
        this._mappingAccountList = new java.util.ArrayList<org.chocolate_milk.model.MappingAccount>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMappingAccount
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMappingAccount(
            final org.chocolate_milk.model.MappingAccount vMappingAccount)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingAccountList.add(vMappingAccount);
    }

    /**
     * 
     * 
     * @param index
     * @param vMappingAccount
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMappingAccount(
            final int index,
            final org.chocolate_milk.model.MappingAccount vMappingAccount)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingAccountList.add(index, vMappingAccount);
    }

    /**
     * Method enumerateMappingAccount.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.MappingAccount> enumerateMappingAccount(
    ) {
        return java.util.Collections.enumeration(this._mappingAccountList);
    }

    /**
     * Method getMappingAccount.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.MappingAccount at the given index
     */
    public org.chocolate_milk.model.MappingAccount getMappingAccount(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingAccountList.size()) {
            throw new IndexOutOfBoundsException("getMappingAccount: Index value '" + index + "' not in range [0.." + (this._mappingAccountList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.MappingAccount) _mappingAccountList.get(index);
    }

    /**
     * Method getMappingAccount.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.MappingAccount[] getMappingAccount(
    ) {
        org.chocolate_milk.model.MappingAccount[] array = new org.chocolate_milk.model.MappingAccount[0];
        return (org.chocolate_milk.model.MappingAccount[]) this._mappingAccountList.toArray(array);
    }

    /**
     * Method getMappingAccountCount.
     * 
     * @return the size of this collection
     */
    public int getMappingAccountCount(
    ) {
        return this._mappingAccountList.size();
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
     * Method iterateMappingAccount.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.MappingAccount> iterateMappingAccount(
    ) {
        return this._mappingAccountList.iterator();
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
    public void removeAllMappingAccount(
    ) {
        this._mappingAccountList.clear();
    }

    /**
     * Method removeMappingAccount.
     * 
     * @param vMappingAccount
     * @return true if the object was removed from the collection.
     */
    public boolean removeMappingAccount(
            final org.chocolate_milk.model.MappingAccount vMappingAccount) {
        boolean removed = _mappingAccountList.remove(vMappingAccount);
        return removed;
    }

    /**
     * Method removeMappingAccountAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.MappingAccount removeMappingAccountAt(
            final int index) {
        java.lang.Object obj = this._mappingAccountList.remove(index);
        return (org.chocolate_milk.model.MappingAccount) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMappingAccount
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMappingAccount(
            final int index,
            final org.chocolate_milk.model.MappingAccount vMappingAccount)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingAccountList.size()) {
            throw new IndexOutOfBoundsException("setMappingAccount: Index value '" + index + "' not in range [0.." + (this._mappingAccountList.size() - 1) + "]");
        }

        this._mappingAccountList.set(index, vMappingAccount);
    }

    /**
     * 
     * 
     * @param vMappingAccountArray
     */
    public void setMappingAccount(
            final org.chocolate_milk.model.MappingAccount[] vMappingAccountArray) {
        //-- copy array
        _mappingAccountList.clear();

        for (int i = 0; i < vMappingAccountArray.length; i++) {
                this._mappingAccountList.add(vMappingAccountArray[i]);
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
     * org.chocolate_milk.model.CategoryAccountMappingMod
     */
    public static org.chocolate_milk.model.CategoryAccountMappingMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CategoryAccountMappingMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CategoryAccountMappingMod.class, reader);
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
