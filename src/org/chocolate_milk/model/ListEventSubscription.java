/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListEventSubscription.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListEventSubscription.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ListEventSubscription implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listEventTypeList.
     */
    private java.util.List<org.chocolate_milk.model.types.ListEventTypeType> _listEventTypeList;

    /**
     * Field _listEventOperationList.
     */
    private java.util.List<org.chocolate_milk.model.types.ListEventOperationType> _listEventOperationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListEventSubscription() {
        super();
        this._listEventTypeList = new java.util.ArrayList<org.chocolate_milk.model.types.ListEventTypeType>();
        this._listEventOperationList = new java.util.ArrayList<org.chocolate_milk.model.types.ListEventOperationType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vListEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListEventOperation(
            final org.chocolate_milk.model.types.ListEventOperationType vListEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        this._listEventOperationList.add(vListEventOperation);
    }

    /**
     * 
     * 
     * @param index
     * @param vListEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListEventOperation(
            final int index,
            final org.chocolate_milk.model.types.ListEventOperationType vListEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        this._listEventOperationList.add(index, vListEventOperation);
    }

    /**
     * 
     * 
     * @param vListEventType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListEventType(
            final org.chocolate_milk.model.types.ListEventTypeType vListEventType)
    throws java.lang.IndexOutOfBoundsException {
        this._listEventTypeList.add(vListEventType);
    }

    /**
     * 
     * 
     * @param index
     * @param vListEventType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListEventType(
            final int index,
            final org.chocolate_milk.model.types.ListEventTypeType vListEventType)
    throws java.lang.IndexOutOfBoundsException {
        this._listEventTypeList.add(index, vListEventType);
    }

    /**
     * Method enumerateListEventOperation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.ListEventOperationType> enumerateListEventOperation(
    ) {
        return java.util.Collections.enumeration(this._listEventOperationList);
    }

    /**
     * Method enumerateListEventType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.ListEventTypeType> enumerateListEventType(
    ) {
        return java.util.Collections.enumeration(this._listEventTypeList);
    }

    /**
     * Method getListEventOperation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.ListEventOperationType at the
     * given index
     */
    public org.chocolate_milk.model.types.ListEventOperationType getListEventOperation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listEventOperationList.size()) {
            throw new IndexOutOfBoundsException("getListEventOperation: Index value '" + index + "' not in range [0.." + (this._listEventOperationList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.ListEventOperationType) _listEventOperationList.get(index);
    }

    /**
     * Method getListEventOperation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.ListEventOperationType[] getListEventOperation(
    ) {
        org.chocolate_milk.model.types.ListEventOperationType[] array = new org.chocolate_milk.model.types.ListEventOperationType[0];
        return (org.chocolate_milk.model.types.ListEventOperationType[]) this._listEventOperationList.toArray(array);
    }

    /**
     * Method getListEventOperationCount.
     * 
     * @return the size of this collection
     */
    public int getListEventOperationCount(
    ) {
        return this._listEventOperationList.size();
    }

    /**
     * Method getListEventType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.ListEventTypeType at the
     * given index
     */
    public org.chocolate_milk.model.types.ListEventTypeType getListEventType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listEventTypeList.size()) {
            throw new IndexOutOfBoundsException("getListEventType: Index value '" + index + "' not in range [0.." + (this._listEventTypeList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.ListEventTypeType) _listEventTypeList.get(index);
    }

    /**
     * Method getListEventType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.ListEventTypeType[] getListEventType(
    ) {
        org.chocolate_milk.model.types.ListEventTypeType[] array = new org.chocolate_milk.model.types.ListEventTypeType[0];
        return (org.chocolate_milk.model.types.ListEventTypeType[]) this._listEventTypeList.toArray(array);
    }

    /**
     * Method getListEventTypeCount.
     * 
     * @return the size of this collection
     */
    public int getListEventTypeCount(
    ) {
        return this._listEventTypeList.size();
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
     * Method iterateListEventOperation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.ListEventOperationType> iterateListEventOperation(
    ) {
        return this._listEventOperationList.iterator();
    }

    /**
     * Method iterateListEventType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.ListEventTypeType> iterateListEventType(
    ) {
        return this._listEventTypeList.iterator();
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
    public void removeAllListEventOperation(
    ) {
        this._listEventOperationList.clear();
    }

    /**
     */
    public void removeAllListEventType(
    ) {
        this._listEventTypeList.clear();
    }

    /**
     * Method removeListEventOperation.
     * 
     * @param vListEventOperation
     * @return true if the object was removed from the collection.
     */
    public boolean removeListEventOperation(
            final org.chocolate_milk.model.types.ListEventOperationType vListEventOperation) {
        boolean removed = _listEventOperationList.remove(vListEventOperation);
        return removed;
    }

    /**
     * Method removeListEventOperationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.ListEventOperationType removeListEventOperationAt(
            final int index) {
        java.lang.Object obj = this._listEventOperationList.remove(index);
        return (org.chocolate_milk.model.types.ListEventOperationType) obj;
    }

    /**
     * Method removeListEventType.
     * 
     * @param vListEventType
     * @return true if the object was removed from the collection.
     */
    public boolean removeListEventType(
            final org.chocolate_milk.model.types.ListEventTypeType vListEventType) {
        boolean removed = _listEventTypeList.remove(vListEventType);
        return removed;
    }

    /**
     * Method removeListEventTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.ListEventTypeType removeListEventTypeAt(
            final int index) {
        java.lang.Object obj = this._listEventTypeList.remove(index);
        return (org.chocolate_milk.model.types.ListEventTypeType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vListEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setListEventOperation(
            final int index,
            final org.chocolate_milk.model.types.ListEventOperationType vListEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listEventOperationList.size()) {
            throw new IndexOutOfBoundsException("setListEventOperation: Index value '" + index + "' not in range [0.." + (this._listEventOperationList.size() - 1) + "]");
        }

        this._listEventOperationList.set(index, vListEventOperation);
    }

    /**
     * 
     * 
     * @param vListEventOperationArray
     */
    public void setListEventOperation(
            final org.chocolate_milk.model.types.ListEventOperationType[] vListEventOperationArray) {
        //-- copy array
        _listEventOperationList.clear();

        for (int i = 0; i < vListEventOperationArray.length; i++) {
                this._listEventOperationList.add(vListEventOperationArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vListEventType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setListEventType(
            final int index,
            final org.chocolate_milk.model.types.ListEventTypeType vListEventType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listEventTypeList.size()) {
            throw new IndexOutOfBoundsException("setListEventType: Index value '" + index + "' not in range [0.." + (this._listEventTypeList.size() - 1) + "]");
        }

        this._listEventTypeList.set(index, vListEventType);
    }

    /**
     * 
     * 
     * @param vListEventTypeArray
     */
    public void setListEventType(
            final org.chocolate_milk.model.types.ListEventTypeType[] vListEventTypeArray) {
        //-- copy array
        _listEventTypeList.clear();

        for (int i = 0; i < vListEventTypeArray.length; i++) {
                this._listEventTypeList.add(vListEventTypeArray[i]);
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
     * org.chocolate_milk.model.ListEventSubscription
     */
    public static org.chocolate_milk.model.ListEventSubscription unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListEventSubscription) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListEventSubscription.class, reader);
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
