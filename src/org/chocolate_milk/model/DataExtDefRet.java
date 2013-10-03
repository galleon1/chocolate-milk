/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtDefRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtDefRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DataExtDefRet implements java.io.Serializable {


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
     * Field _dataExtType.
     */
    private org.chocolate_milk.model.types.DataExtTypeType _dataExtType;

    /**
     * Field _assignToObjectList.
     */
    private java.util.List<org.chocolate_milk.model.types.AssignToObjectType> _assignToObjectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtDefRet() {
        super();
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
     * Returns the value of field 'dataExtType'.
     * 
     * @return the value of field 'DataExtType'.
     */
    public org.chocolate_milk.model.types.DataExtTypeType getDataExtType(
    ) {
        return this._dataExtType;
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
     * Sets the value of field 'dataExtType'.
     * 
     * @param dataExtType the value of field 'dataExtType'.
     */
    public void setDataExtType(
            final org.chocolate_milk.model.types.DataExtTypeType dataExtType) {
        this._dataExtType = dataExtType;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.DataExtDefRe
     */
    public static org.chocolate_milk.model.DataExtDefRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataExtDefRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataExtDefRet.class, reader);
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
