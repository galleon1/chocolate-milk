/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtDefQueryChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtDefQueryChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DataExtDefQueryChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ownerIDList.
     */
    private java.util.List<java.lang.String> _ownerIDList;

    /**
     * Field _assignToObjectList.
     */
    private java.util.List<org.chocolate_milk.model.types.AssignToObjectType> _assignToObjectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtDefQueryChoice() {
        super();
        this._ownerIDList = new java.util.ArrayList<java.lang.String>();
        this._assignToObjectList = new java.util.ArrayList<org.chocolate_milk.model.types.AssignToObjectType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssignToObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssignToObject(
            final org.chocolate_milk.model.types.AssignToObjectType vAssignToObject)
    throws java.lang.IndexOutOfBoundsException {
        this._assignToObjectList.add(vAssignToObject);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssignToObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssignToObject(
            final int index,
            final org.chocolate_milk.model.types.AssignToObjectType vAssignToObject)
    throws java.lang.IndexOutOfBoundsException {
        this._assignToObjectList.add(index, vAssignToObject);
    }

    /**
     * 
     * 
     * @param vOwnerID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOwnerID(
            final java.lang.String vOwnerID)
    throws java.lang.IndexOutOfBoundsException {
        this._ownerIDList.add(vOwnerID);
    }

    /**
     * 
     * 
     * @param index
     * @param vOwnerID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOwnerID(
            final int index,
            final java.lang.String vOwnerID)
    throws java.lang.IndexOutOfBoundsException {
        this._ownerIDList.add(index, vOwnerID);
    }

    /**
     * Method enumerateAssignToObject.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.AssignToObjectType> enumerateAssignToObject(
    ) {
        return java.util.Collections.enumeration(this._assignToObjectList);
    }

    /**
     * Method enumerateOwnerID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateOwnerID(
    ) {
        return java.util.Collections.enumeration(this._ownerIDList);
    }

    /**
     * Method getAssignToObject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.AssignToObjectType at the
     * given index
     */
    public org.chocolate_milk.model.types.AssignToObjectType getAssignToObject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assignToObjectList.size()) {
            throw new IndexOutOfBoundsException("getAssignToObject: Index value '" + index + "' not in range [0.." + (this._assignToObjectList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.AssignToObjectType) _assignToObjectList.get(index);
    }

    /**
     * Method getAssignToObject.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.AssignToObjectType[] getAssignToObject(
    ) {
        org.chocolate_milk.model.types.AssignToObjectType[] array = new org.chocolate_milk.model.types.AssignToObjectType[0];
        return (org.chocolate_milk.model.types.AssignToObjectType[]) this._assignToObjectList.toArray(array);
    }

    /**
     * Method getAssignToObjectCount.
     * 
     * @return the size of this collection
     */
    public int getAssignToObjectCount(
    ) {
        return this._assignToObjectList.size();
    }

    /**
     * Method getOwnerID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getOwnerID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ownerIDList.size()) {
            throw new IndexOutOfBoundsException("getOwnerID: Index value '" + index + "' not in range [0.." + (this._ownerIDList.size() - 1) + "]");
        }

        return (java.lang.String) _ownerIDList.get(index);
    }

    /**
     * Method getOwnerID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getOwnerID(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._ownerIDList.toArray(array);
    }

    /**
     * Method getOwnerIDCount.
     * 
     * @return the size of this collection
     */
    public int getOwnerIDCount(
    ) {
        return this._ownerIDList.size();
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
     * Method iterateAssignToObject.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.AssignToObjectType> iterateAssignToObject(
    ) {
        return this._assignToObjectList.iterator();
    }

    /**
     * Method iterateOwnerID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateOwnerID(
    ) {
        return this._ownerIDList.iterator();
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
    public void removeAllAssignToObject(
    ) {
        this._assignToObjectList.clear();
    }

    /**
     */
    public void removeAllOwnerID(
    ) {
        this._ownerIDList.clear();
    }

    /**
     * Method removeAssignToObject.
     * 
     * @param vAssignToObject
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssignToObject(
            final org.chocolate_milk.model.types.AssignToObjectType vAssignToObject) {
        boolean removed = _assignToObjectList.remove(vAssignToObject);
        return removed;
    }

    /**
     * Method removeAssignToObjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.AssignToObjectType removeAssignToObjectAt(
            final int index) {
        java.lang.Object obj = this._assignToObjectList.remove(index);
        return (org.chocolate_milk.model.types.AssignToObjectType) obj;
    }

    /**
     * Method removeOwnerID.
     * 
     * @param vOwnerID
     * @return true if the object was removed from the collection.
     */
    public boolean removeOwnerID(
            final java.lang.String vOwnerID) {
        boolean removed = _ownerIDList.remove(vOwnerID);
        return removed;
    }

    /**
     * Method removeOwnerIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeOwnerIDAt(
            final int index) {
        java.lang.Object obj = this._ownerIDList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssignToObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssignToObject(
            final int index,
            final org.chocolate_milk.model.types.AssignToObjectType vAssignToObject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assignToObjectList.size()) {
            throw new IndexOutOfBoundsException("setAssignToObject: Index value '" + index + "' not in range [0.." + (this._assignToObjectList.size() - 1) + "]");
        }

        this._assignToObjectList.set(index, vAssignToObject);
    }

    /**
     * 
     * 
     * @param vAssignToObjectArray
     */
    public void setAssignToObject(
            final org.chocolate_milk.model.types.AssignToObjectType[] vAssignToObjectArray) {
        //-- copy array
        _assignToObjectList.clear();

        for (int i = 0; i < vAssignToObjectArray.length; i++) {
                this._assignToObjectList.add(vAssignToObjectArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vOwnerID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOwnerID(
            final int index,
            final java.lang.String vOwnerID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ownerIDList.size()) {
            throw new IndexOutOfBoundsException("setOwnerID: Index value '" + index + "' not in range [0.." + (this._ownerIDList.size() - 1) + "]");
        }

        this._ownerIDList.set(index, vOwnerID);
    }

    /**
     * 
     * 
     * @param vOwnerIDArray
     */
    public void setOwnerID(
            final java.lang.String[] vOwnerIDArray) {
        //-- copy array
        _ownerIDList.clear();

        for (int i = 0; i < vOwnerIDArray.length; i++) {
                this._ownerIDList.add(vOwnerIDArray[i]);
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
     * org.chocolate_milk.model.DataExtDefQueryChoice
     */
    public static org.chocolate_milk.model.DataExtDefQueryChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataExtDefQueryChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataExtDefQueryChoice.class, reader);
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
