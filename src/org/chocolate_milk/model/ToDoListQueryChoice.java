/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ToDoListQueryChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ToDoListQueryChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ToDoListQueryChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listIDList.
     */
    private java.util.List<java.lang.String> _listIDList;

    /**
     * Field _toDoListFilter.
     */
    private org.chocolate_milk.model.ToDoListFilter _toDoListFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public ToDoListQueryChoice() {
        super();
        this._listIDList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vListID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListID(
            final java.lang.String vListID)
    throws java.lang.IndexOutOfBoundsException {
        this._listIDList.add(vListID);
    }

    /**
     * 
     * 
     * @param index
     * @param vListID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListID(
            final int index,
            final java.lang.String vListID)
    throws java.lang.IndexOutOfBoundsException {
        this._listIDList.add(index, vListID);
    }

    /**
     * Method enumerateListID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateListID(
    ) {
        return java.util.Collections.enumeration(this._listIDList);
    }

    /**
     * Method getListID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getListID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listIDList.size()) {
            throw new IndexOutOfBoundsException("getListID: Index value '" + index + "' not in range [0.." + (this._listIDList.size() - 1) + "]");
        }

        return (java.lang.String) _listIDList.get(index);
    }

    /**
     * Method getListID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getListID(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._listIDList.toArray(array);
    }

    /**
     * Method getListIDCount.
     * 
     * @return the size of this collection
     */
    public int getListIDCount(
    ) {
        return this._listIDList.size();
    }

    /**
     * Returns the value of field 'toDoListFilter'.
     * 
     * @return the value of field 'ToDoListFilter'.
     */
    public org.chocolate_milk.model.ToDoListFilter getToDoListFilter(
    ) {
        return this._toDoListFilter;
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
     * Method iterateListID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateListID(
    ) {
        return this._listIDList.iterator();
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
    public void removeAllListID(
    ) {
        this._listIDList.clear();
    }

    /**
     * Method removeListID.
     * 
     * @param vListID
     * @return true if the object was removed from the collection.
     */
    public boolean removeListID(
            final java.lang.String vListID) {
        boolean removed = _listIDList.remove(vListID);
        return removed;
    }

    /**
     * Method removeListIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeListIDAt(
            final int index) {
        java.lang.Object obj = this._listIDList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vListID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setListID(
            final int index,
            final java.lang.String vListID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listIDList.size()) {
            throw new IndexOutOfBoundsException("setListID: Index value '" + index + "' not in range [0.." + (this._listIDList.size() - 1) + "]");
        }

        this._listIDList.set(index, vListID);
    }

    /**
     * 
     * 
     * @param vListIDArray
     */
    public void setListID(
            final java.lang.String[] vListIDArray) {
        //-- copy array
        _listIDList.clear();

        for (int i = 0; i < vListIDArray.length; i++) {
                this._listIDList.add(vListIDArray[i]);
        }
    }

    /**
     * Sets the value of field 'toDoListFilter'.
     * 
     * @param toDoListFilter the value of field 'toDoListFilter'.
     */
    public void setToDoListFilter(
            final org.chocolate_milk.model.ToDoListFilter toDoListFilter) {
        this._toDoListFilter = toDoListFilter;
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
     * org.chocolate_milk.model.ToDoListQueryChoice
     */
    public static org.chocolate_milk.model.ToDoListQueryChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ToDoListQueryChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ToDoListQueryChoice.class, reader);
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
