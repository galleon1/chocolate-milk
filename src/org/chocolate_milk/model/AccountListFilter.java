/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AccountListFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AccountListFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class AccountListFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listFilter.
     */
    private org.chocolate_milk.model.ListFilter _listFilter;

    /**
     * Field _accountTypeList.
     */
    private java.util.List<org.chocolate_milk.model.types.AccountTypeType> _accountTypeList;

    /**
     * Field _currencyFilter.
     */
    private org.chocolate_milk.model.CurrencyFilter _currencyFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public AccountListFilter() {
        super();
        this._accountTypeList = new java.util.ArrayList<org.chocolate_milk.model.types.AccountTypeType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAccountType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccountType(
            final org.chocolate_milk.model.types.AccountTypeType vAccountType)
    throws java.lang.IndexOutOfBoundsException {
        this._accountTypeList.add(vAccountType);
    }

    /**
     * 
     * 
     * @param index
     * @param vAccountType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccountType(
            final int index,
            final org.chocolate_milk.model.types.AccountTypeType vAccountType)
    throws java.lang.IndexOutOfBoundsException {
        this._accountTypeList.add(index, vAccountType);
    }

    /**
     * Method enumerateAccountType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.AccountTypeType> enumerateAccountType(
    ) {
        return java.util.Collections.enumeration(this._accountTypeList);
    }

    /**
     * Method getAccountType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.AccountTypeType at the given
     * index
     */
    public org.chocolate_milk.model.types.AccountTypeType getAccountType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accountTypeList.size()) {
            throw new IndexOutOfBoundsException("getAccountType: Index value '" + index + "' not in range [0.." + (this._accountTypeList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.AccountTypeType) _accountTypeList.get(index);
    }

    /**
     * Method getAccountType.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.AccountTypeType[] getAccountType(
    ) {
        org.chocolate_milk.model.types.AccountTypeType[] array = new org.chocolate_milk.model.types.AccountTypeType[0];
        return (org.chocolate_milk.model.types.AccountTypeType[]) this._accountTypeList.toArray(array);
    }

    /**
     * Method getAccountTypeCount.
     * 
     * @return the size of this collection
     */
    public int getAccountTypeCount(
    ) {
        return this._accountTypeList.size();
    }

    /**
     * Returns the value of field 'currencyFilter'.
     * 
     * @return the value of field 'CurrencyFilter'.
     */
    public org.chocolate_milk.model.CurrencyFilter getCurrencyFilter(
    ) {
        return this._currencyFilter;
    }

    /**
     * Returns the value of field 'listFilter'.
     * 
     * @return the value of field 'ListFilter'.
     */
    public org.chocolate_milk.model.ListFilter getListFilter(
    ) {
        return this._listFilter;
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
     * Method iterateAccountType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.AccountTypeType> iterateAccountType(
    ) {
        return this._accountTypeList.iterator();
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
     * Method removeAccountType.
     * 
     * @param vAccountType
     * @return true if the object was removed from the collection.
     */
    public boolean removeAccountType(
            final org.chocolate_milk.model.types.AccountTypeType vAccountType) {
        boolean removed = _accountTypeList.remove(vAccountType);
        return removed;
    }

    /**
     * Method removeAccountTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.AccountTypeType removeAccountTypeAt(
            final int index) {
        java.lang.Object obj = this._accountTypeList.remove(index);
        return (org.chocolate_milk.model.types.AccountTypeType) obj;
    }

    /**
     */
    public void removeAllAccountType(
    ) {
        this._accountTypeList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vAccountType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAccountType(
            final int index,
            final org.chocolate_milk.model.types.AccountTypeType vAccountType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accountTypeList.size()) {
            throw new IndexOutOfBoundsException("setAccountType: Index value '" + index + "' not in range [0.." + (this._accountTypeList.size() - 1) + "]");
        }

        this._accountTypeList.set(index, vAccountType);
    }

    /**
     * 
     * 
     * @param vAccountTypeArray
     */
    public void setAccountType(
            final org.chocolate_milk.model.types.AccountTypeType[] vAccountTypeArray) {
        //-- copy array
        _accountTypeList.clear();

        for (int i = 0; i < vAccountTypeArray.length; i++) {
                this._accountTypeList.add(vAccountTypeArray[i]);
        }
    }

    /**
     * Sets the value of field 'currencyFilter'.
     * 
     * @param currencyFilter the value of field 'currencyFilter'.
     */
    public void setCurrencyFilter(
            final org.chocolate_milk.model.CurrencyFilter currencyFilter) {
        this._currencyFilter = currencyFilter;
    }

    /**
     * Sets the value of field 'listFilter'.
     * 
     * @param listFilter the value of field 'listFilter'.
     */
    public void setListFilter(
            final org.chocolate_milk.model.ListFilter listFilter) {
        this._listFilter = listFilter;
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
     * org.chocolate_milk.model.AccountListFilter
     */
    public static org.chocolate_milk.model.AccountListFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.AccountListFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.AccountListFilter.class, reader);
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
