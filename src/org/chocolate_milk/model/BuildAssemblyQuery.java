/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BuildAssemblyQuery.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BuildAssemblyQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class BuildAssemblyQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _buildAssemblyQueryChoice.
     */
    private org.chocolate_milk.model.BuildAssemblyQueryChoice _buildAssemblyQueryChoice;

    /**
     * Field _includeComponentLineItems.
     */
    private java.lang.String _includeComponentLineItems;

    /**
     * Field _includeRetElementList.
     */
    private java.util.List<java.lang.String> _includeRetElementList;

    /**
     * Field _ownerIDList.
     */
    private java.util.List<java.lang.String> _ownerIDList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BuildAssemblyQuery() {
        super();
        this._includeRetElementList = new java.util.ArrayList<java.lang.String>();
        this._ownerIDList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(index, vIncludeRetElement);
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
     * Method enumerateIncludeRetElement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateIncludeRetElement(
    ) {
        return java.util.Collections.enumeration(this._includeRetElementList);
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
     * Returns the value of field 'buildAssemblyQueryChoice'.
     * 
     * @return the value of field 'BuildAssemblyQueryChoice'.
     */
    public org.chocolate_milk.model.BuildAssemblyQueryChoice getBuildAssemblyQueryChoice(
    ) {
        return this._buildAssemblyQueryChoice;
    }

    /**
     * Returns the value of field 'includeComponentLineItems'.
     * 
     * @return the value of field 'IncludeComponentLineItems'.
     */
    public java.lang.String getIncludeComponentLineItems(
    ) {
        return this._includeComponentLineItems;
    }

    /**
     * Method getIncludeRetElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeRetElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        return (java.lang.String) _includeRetElementList.get(index);
    }

    /**
     * Method getIncludeRetElement.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeRetElement(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeRetElementList.toArray(array);
    }

    /**
     * Method getIncludeRetElementCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRetElementCount(
    ) {
        return this._includeRetElementList.size();
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
     * Method iterateIncludeRetElement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateIncludeRetElement(
    ) {
        return this._includeRetElementList.iterator();
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
    public void removeAllIncludeRetElement(
    ) {
        this._includeRetElementList.clear();
    }

    /**
     */
    public void removeAllOwnerID(
    ) {
        this._ownerIDList.clear();
    }

    /**
     * Method removeIncludeRetElement.
     * 
     * @param vIncludeRetElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRetElement(
            final java.lang.String vIncludeRetElement) {
        boolean removed = _includeRetElementList.remove(vIncludeRetElement);
        return removed;
    }

    /**
     * Method removeIncludeRetElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeRetElementAt(
            final int index) {
        java.lang.Object obj = this._includeRetElementList.remove(index);
        return (java.lang.String) obj;
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
     * Sets the value of field 'buildAssemblyQueryChoice'.
     * 
     * @param buildAssemblyQueryChoice the value of field
     * 'buildAssemblyQueryChoice'.
     */
    public void setBuildAssemblyQueryChoice(
            final org.chocolate_milk.model.BuildAssemblyQueryChoice buildAssemblyQueryChoice) {
        this._buildAssemblyQueryChoice = buildAssemblyQueryChoice;
    }

    /**
     * Sets the value of field 'includeComponentLineItems'.
     * 
     * @param includeComponentLineItems the value of field
     * 'includeComponentLineItems'.
     */
    public void setIncludeComponentLineItems(
            final java.lang.String includeComponentLineItems) {
        this._includeComponentLineItems = includeComponentLineItems;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        this._includeRetElementList.set(index, vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param vIncludeRetElementArray
     */
    public void setIncludeRetElement(
            final java.lang.String[] vIncludeRetElementArray) {
        //-- copy array
        _includeRetElementList.clear();

        for (int i = 0; i < vIncludeRetElementArray.length; i++) {
                this._includeRetElementList.add(vIncludeRetElementArray[i]);
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
     * org.chocolate_milk.model.BuildAssemblyQuery
     */
    public static org.chocolate_milk.model.BuildAssemblyQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BuildAssemblyQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BuildAssemblyQuery.class, reader);
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
