/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CompanyFileEventSubscription.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CompanyFileEventSubscription.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CompanyFileEventSubscription implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _companyFileEventOperationList.
     */
    private java.util.List<org.chocolate_milk.model.types.CompanyFileEventOperationType> _companyFileEventOperationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CompanyFileEventSubscription() {
        super();
        this._companyFileEventOperationList = new java.util.ArrayList<org.chocolate_milk.model.types.CompanyFileEventOperationType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCompanyFileEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCompanyFileEventOperation(
            final org.chocolate_milk.model.types.CompanyFileEventOperationType vCompanyFileEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        this._companyFileEventOperationList.add(vCompanyFileEventOperation);
    }

    /**
     * 
     * 
     * @param index
     * @param vCompanyFileEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCompanyFileEventOperation(
            final int index,
            final org.chocolate_milk.model.types.CompanyFileEventOperationType vCompanyFileEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        this._companyFileEventOperationList.add(index, vCompanyFileEventOperation);
    }

    /**
     * Method enumerateCompanyFileEventOperation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.CompanyFileEventOperationType> enumerateCompanyFileEventOperation(
    ) {
        return java.util.Collections.enumeration(this._companyFileEventOperationList);
    }

    /**
     * Method getCompanyFileEventOperation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.CompanyFileEventOperationType
     * at the given index
     */
    public org.chocolate_milk.model.types.CompanyFileEventOperationType getCompanyFileEventOperation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._companyFileEventOperationList.size()) {
            throw new IndexOutOfBoundsException("getCompanyFileEventOperation: Index value '" + index + "' not in range [0.." + (this._companyFileEventOperationList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.CompanyFileEventOperationType) _companyFileEventOperationList.get(index);
    }

    /**
     * Method getCompanyFileEventOperation.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.CompanyFileEventOperationType[] getCompanyFileEventOperation(
    ) {
        org.chocolate_milk.model.types.CompanyFileEventOperationType[] array = new org.chocolate_milk.model.types.CompanyFileEventOperationType[0];
        return (org.chocolate_milk.model.types.CompanyFileEventOperationType[]) this._companyFileEventOperationList.toArray(array);
    }

    /**
     * Method getCompanyFileEventOperationCount.
     * 
     * @return the size of this collection
     */
    public int getCompanyFileEventOperationCount(
    ) {
        return this._companyFileEventOperationList.size();
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
     * Method iterateCompanyFileEventOperation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.CompanyFileEventOperationType> iterateCompanyFileEventOperation(
    ) {
        return this._companyFileEventOperationList.iterator();
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
    public void removeAllCompanyFileEventOperation(
    ) {
        this._companyFileEventOperationList.clear();
    }

    /**
     * Method removeCompanyFileEventOperation.
     * 
     * @param vCompanyFileEventOperation
     * @return true if the object was removed from the collection.
     */
    public boolean removeCompanyFileEventOperation(
            final org.chocolate_milk.model.types.CompanyFileEventOperationType vCompanyFileEventOperation) {
        boolean removed = _companyFileEventOperationList.remove(vCompanyFileEventOperation);
        return removed;
    }

    /**
     * Method removeCompanyFileEventOperationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.CompanyFileEventOperationType removeCompanyFileEventOperationAt(
            final int index) {
        java.lang.Object obj = this._companyFileEventOperationList.remove(index);
        return (org.chocolate_milk.model.types.CompanyFileEventOperationType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCompanyFileEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCompanyFileEventOperation(
            final int index,
            final org.chocolate_milk.model.types.CompanyFileEventOperationType vCompanyFileEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._companyFileEventOperationList.size()) {
            throw new IndexOutOfBoundsException("setCompanyFileEventOperation: Index value '" + index + "' not in range [0.." + (this._companyFileEventOperationList.size() - 1) + "]");
        }

        this._companyFileEventOperationList.set(index, vCompanyFileEventOperation);
    }

    /**
     * 
     * 
     * @param vCompanyFileEventOperationArray
     */
    public void setCompanyFileEventOperation(
            final org.chocolate_milk.model.types.CompanyFileEventOperationType[] vCompanyFileEventOperationArray) {
        //-- copy array
        _companyFileEventOperationList.clear();

        for (int i = 0; i < vCompanyFileEventOperationArray.length; i++) {
                this._companyFileEventOperationList.add(vCompanyFileEventOperationArray[i]);
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
     * org.chocolate_milk.model.CompanyFileEventSubscription
     */
    public static org.chocolate_milk.model.CompanyFileEventSubscription unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CompanyFileEventSubscription) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CompanyFileEventSubscription.class, reader);
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
