/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtDefMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtDefMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DataExtDefMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ownerID.
     */
    private java.lang.String _ownerID;

    /**
     * Field _dataExtName.
     */
    private java.lang.String _dataExtName;

    /**
     * Field _dataExtNewName.
     */
    private java.lang.String _dataExtNewName;

    /**
     * Field _assignToObjectList.
     */
    private java.util.List<org.chocolate_milk.model.types.AssignToObjectType> _assignToObjectList;

    /**
     * Field _removeFromObjectList.
     */
    private java.util.List<org.chocolate_milk.model.types.RemoveFromObjectType> _removeFromObjectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtDefMod() {
        super();
        this._assignToObjectList = new java.util.ArrayList<org.chocolate_milk.model.types.AssignToObjectType>();
        this._removeFromObjectList = new java.util.ArrayList<org.chocolate_milk.model.types.RemoveFromObjectType>();
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
     * @param vRemoveFromObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRemoveFromObject(
            final org.chocolate_milk.model.types.RemoveFromObjectType vRemoveFromObject)
    throws java.lang.IndexOutOfBoundsException {
        this._removeFromObjectList.add(vRemoveFromObject);
    }

    /**
     * 
     * 
     * @param index
     * @param vRemoveFromObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRemoveFromObject(
            final int index,
            final org.chocolate_milk.model.types.RemoveFromObjectType vRemoveFromObject)
    throws java.lang.IndexOutOfBoundsException {
        this._removeFromObjectList.add(index, vRemoveFromObject);
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
     * Method enumerateRemoveFromObject.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.RemoveFromObjectType> enumerateRemoveFromObject(
    ) {
        return java.util.Collections.enumeration(this._removeFromObjectList);
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
     * Returns the value of field 'dataExtName'.
     * 
     * @return the value of field 'DataExtName'.
     */
    public java.lang.String getDataExtName(
    ) {
        return this._dataExtName;
    }

    /**
     * Returns the value of field 'dataExtNewName'.
     * 
     * @return the value of field 'DataExtNewName'.
     */
    public java.lang.String getDataExtNewName(
    ) {
        return this._dataExtNewName;
    }

    /**
     * Returns the value of field 'ownerID'.
     * 
     * @return the value of field 'OwnerID'.
     */
    public java.lang.String getOwnerID(
    ) {
        return this._ownerID;
    }

    /**
     * Method getRemoveFromObject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.RemoveFromObjectType at the
     * given index
     */
    public org.chocolate_milk.model.types.RemoveFromObjectType getRemoveFromObject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._removeFromObjectList.size()) {
            throw new IndexOutOfBoundsException("getRemoveFromObject: Index value '" + index + "' not in range [0.." + (this._removeFromObjectList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.RemoveFromObjectType) _removeFromObjectList.get(index);
    }

    /**
     * Method getRemoveFromObject.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.RemoveFromObjectType[] getRemoveFromObject(
    ) {
        org.chocolate_milk.model.types.RemoveFromObjectType[] array = new org.chocolate_milk.model.types.RemoveFromObjectType[0];
        return (org.chocolate_milk.model.types.RemoveFromObjectType[]) this._removeFromObjectList.toArray(array);
    }

    /**
     * Method getRemoveFromObjectCount.
     * 
     * @return the size of this collection
     */
    public int getRemoveFromObjectCount(
    ) {
        return this._removeFromObjectList.size();
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
     * Method iterateRemoveFromObject.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.RemoveFromObjectType> iterateRemoveFromObject(
    ) {
        return this._removeFromObjectList.iterator();
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
    public void removeAllRemoveFromObject(
    ) {
        this._removeFromObjectList.clear();
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
     * Method removeRemoveFromObject.
     * 
     * @param vRemoveFromObject
     * @return true if the object was removed from the collection.
     */
    public boolean removeRemoveFromObject(
            final org.chocolate_milk.model.types.RemoveFromObjectType vRemoveFromObject) {
        boolean removed = _removeFromObjectList.remove(vRemoveFromObject);
        return removed;
    }

    /**
     * Method removeRemoveFromObjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.RemoveFromObjectType removeRemoveFromObjectAt(
            final int index) {
        java.lang.Object obj = this._removeFromObjectList.remove(index);
        return (org.chocolate_milk.model.types.RemoveFromObjectType) obj;
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
     * Sets the value of field 'dataExtName'.
     * 
     * @param dataExtName the value of field 'dataExtName'.
     */
    public void setDataExtName(
            final java.lang.String dataExtName) {
        this._dataExtName = dataExtName;
    }

    /**
     * Sets the value of field 'dataExtNewName'.
     * 
     * @param dataExtNewName the value of field 'dataExtNewName'.
     */
    public void setDataExtNewName(
            final java.lang.String dataExtNewName) {
        this._dataExtNewName = dataExtNewName;
    }

    /**
     * Sets the value of field 'ownerID'.
     * 
     * @param ownerID the value of field 'ownerID'.
     */
    public void setOwnerID(
            final java.lang.String ownerID) {
        this._ownerID = ownerID;
    }

    /**
     * 
     * 
     * @param index
     * @param vRemoveFromObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRemoveFromObject(
            final int index,
            final org.chocolate_milk.model.types.RemoveFromObjectType vRemoveFromObject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._removeFromObjectList.size()) {
            throw new IndexOutOfBoundsException("setRemoveFromObject: Index value '" + index + "' not in range [0.." + (this._removeFromObjectList.size() - 1) + "]");
        }

        this._removeFromObjectList.set(index, vRemoveFromObject);
    }

    /**
     * 
     * 
     * @param vRemoveFromObjectArray
     */
    public void setRemoveFromObject(
            final org.chocolate_milk.model.types.RemoveFromObjectType[] vRemoveFromObjectArray) {
        //-- copy array
        _removeFromObjectList.clear();

        for (int i = 0; i < vRemoveFromObjectArray.length; i++) {
                this._removeFromObjectList.add(vRemoveFromObjectArray[i]);
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
     * @return the unmarshaled org.chocolate_milk.model.DataExtDefMo
     */
    public static org.chocolate_milk.model.DataExtDefMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataExtDefMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataExtDefMod.class, reader);
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
