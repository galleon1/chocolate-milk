/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DisplayCondition.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DisplayCondition.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DisplayCondition implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _visibleIfList.
     */
    private java.util.List<org.chocolate_milk.model.types.VisibleIfType> _visibleIfList;

    /**
     * Field _visibleIfNotList.
     */
    private java.util.List<org.chocolate_milk.model.types.VisibleIfNotType> _visibleIfNotList;

    /**
     * Field _enabledIfList.
     */
    private java.util.List<org.chocolate_milk.model.types.EnabledIfType> _enabledIfList;

    /**
     * Field _enabledIfNotList.
     */
    private java.util.List<org.chocolate_milk.model.types.EnabledIfNotType> _enabledIfNotList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DisplayCondition() {
        super();
        this._visibleIfList = new java.util.ArrayList<org.chocolate_milk.model.types.VisibleIfType>();
        this._visibleIfNotList = new java.util.ArrayList<org.chocolate_milk.model.types.VisibleIfNotType>();
        this._enabledIfList = new java.util.ArrayList<org.chocolate_milk.model.types.EnabledIfType>();
        this._enabledIfNotList = new java.util.ArrayList<org.chocolate_milk.model.types.EnabledIfNotType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEnabledIf
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnabledIf(
            final org.chocolate_milk.model.types.EnabledIfType vEnabledIf)
    throws java.lang.IndexOutOfBoundsException {
        this._enabledIfList.add(vEnabledIf);
    }

    /**
     * 
     * 
     * @param index
     * @param vEnabledIf
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnabledIf(
            final int index,
            final org.chocolate_milk.model.types.EnabledIfType vEnabledIf)
    throws java.lang.IndexOutOfBoundsException {
        this._enabledIfList.add(index, vEnabledIf);
    }

    /**
     * 
     * 
     * @param vEnabledIfNot
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnabledIfNot(
            final org.chocolate_milk.model.types.EnabledIfNotType vEnabledIfNot)
    throws java.lang.IndexOutOfBoundsException {
        this._enabledIfNotList.add(vEnabledIfNot);
    }

    /**
     * 
     * 
     * @param index
     * @param vEnabledIfNot
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnabledIfNot(
            final int index,
            final org.chocolate_milk.model.types.EnabledIfNotType vEnabledIfNot)
    throws java.lang.IndexOutOfBoundsException {
        this._enabledIfNotList.add(index, vEnabledIfNot);
    }

    /**
     * 
     * 
     * @param vVisibleIf
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVisibleIf(
            final org.chocolate_milk.model.types.VisibleIfType vVisibleIf)
    throws java.lang.IndexOutOfBoundsException {
        this._visibleIfList.add(vVisibleIf);
    }

    /**
     * 
     * 
     * @param index
     * @param vVisibleIf
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVisibleIf(
            final int index,
            final org.chocolate_milk.model.types.VisibleIfType vVisibleIf)
    throws java.lang.IndexOutOfBoundsException {
        this._visibleIfList.add(index, vVisibleIf);
    }

    /**
     * 
     * 
     * @param vVisibleIfNot
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVisibleIfNot(
            final org.chocolate_milk.model.types.VisibleIfNotType vVisibleIfNot)
    throws java.lang.IndexOutOfBoundsException {
        this._visibleIfNotList.add(vVisibleIfNot);
    }

    /**
     * 
     * 
     * @param index
     * @param vVisibleIfNot
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVisibleIfNot(
            final int index,
            final org.chocolate_milk.model.types.VisibleIfNotType vVisibleIfNot)
    throws java.lang.IndexOutOfBoundsException {
        this._visibleIfNotList.add(index, vVisibleIfNot);
    }

    /**
     * Method enumerateEnabledIf.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.EnabledIfType> enumerateEnabledIf(
    ) {
        return java.util.Collections.enumeration(this._enabledIfList);
    }

    /**
     * Method enumerateEnabledIfNot.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.EnabledIfNotType> enumerateEnabledIfNot(
    ) {
        return java.util.Collections.enumeration(this._enabledIfNotList);
    }

    /**
     * Method enumerateVisibleIf.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.VisibleIfType> enumerateVisibleIf(
    ) {
        return java.util.Collections.enumeration(this._visibleIfList);
    }

    /**
     * Method enumerateVisibleIfNot.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.VisibleIfNotType> enumerateVisibleIfNot(
    ) {
        return java.util.Collections.enumeration(this._visibleIfNotList);
    }

    /**
     * Method getEnabledIf.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.EnabledIfType at the given
     * index
     */
    public org.chocolate_milk.model.types.EnabledIfType getEnabledIf(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._enabledIfList.size()) {
            throw new IndexOutOfBoundsException("getEnabledIf: Index value '" + index + "' not in range [0.." + (this._enabledIfList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.EnabledIfType) _enabledIfList.get(index);
    }

    /**
     * Method getEnabledIf.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.EnabledIfType[] getEnabledIf(
    ) {
        org.chocolate_milk.model.types.EnabledIfType[] array = new org.chocolate_milk.model.types.EnabledIfType[0];
        return (org.chocolate_milk.model.types.EnabledIfType[]) this._enabledIfList.toArray(array);
    }

    /**
     * Method getEnabledIfCount.
     * 
     * @return the size of this collection
     */
    public int getEnabledIfCount(
    ) {
        return this._enabledIfList.size();
    }

    /**
     * Method getEnabledIfNot.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.EnabledIfNotType at the given
     * index
     */
    public org.chocolate_milk.model.types.EnabledIfNotType getEnabledIfNot(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._enabledIfNotList.size()) {
            throw new IndexOutOfBoundsException("getEnabledIfNot: Index value '" + index + "' not in range [0.." + (this._enabledIfNotList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.EnabledIfNotType) _enabledIfNotList.get(index);
    }

    /**
     * Method getEnabledIfNot.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.EnabledIfNotType[] getEnabledIfNot(
    ) {
        org.chocolate_milk.model.types.EnabledIfNotType[] array = new org.chocolate_milk.model.types.EnabledIfNotType[0];
        return (org.chocolate_milk.model.types.EnabledIfNotType[]) this._enabledIfNotList.toArray(array);
    }

    /**
     * Method getEnabledIfNotCount.
     * 
     * @return the size of this collection
     */
    public int getEnabledIfNotCount(
    ) {
        return this._enabledIfNotList.size();
    }

    /**
     * Method getVisibleIf.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.VisibleIfType at the given
     * index
     */
    public org.chocolate_milk.model.types.VisibleIfType getVisibleIf(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._visibleIfList.size()) {
            throw new IndexOutOfBoundsException("getVisibleIf: Index value '" + index + "' not in range [0.." + (this._visibleIfList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.VisibleIfType) _visibleIfList.get(index);
    }

    /**
     * Method getVisibleIf.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.VisibleIfType[] getVisibleIf(
    ) {
        org.chocolate_milk.model.types.VisibleIfType[] array = new org.chocolate_milk.model.types.VisibleIfType[0];
        return (org.chocolate_milk.model.types.VisibleIfType[]) this._visibleIfList.toArray(array);
    }

    /**
     * Method getVisibleIfCount.
     * 
     * @return the size of this collection
     */
    public int getVisibleIfCount(
    ) {
        return this._visibleIfList.size();
    }

    /**
     * Method getVisibleIfNot.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.VisibleIfNotType at the given
     * index
     */
    public org.chocolate_milk.model.types.VisibleIfNotType getVisibleIfNot(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._visibleIfNotList.size()) {
            throw new IndexOutOfBoundsException("getVisibleIfNot: Index value '" + index + "' not in range [0.." + (this._visibleIfNotList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.VisibleIfNotType) _visibleIfNotList.get(index);
    }

    /**
     * Method getVisibleIfNot.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.VisibleIfNotType[] getVisibleIfNot(
    ) {
        org.chocolate_milk.model.types.VisibleIfNotType[] array = new org.chocolate_milk.model.types.VisibleIfNotType[0];
        return (org.chocolate_milk.model.types.VisibleIfNotType[]) this._visibleIfNotList.toArray(array);
    }

    /**
     * Method getVisibleIfNotCount.
     * 
     * @return the size of this collection
     */
    public int getVisibleIfNotCount(
    ) {
        return this._visibleIfNotList.size();
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
     * Method iterateEnabledIf.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.EnabledIfType> iterateEnabledIf(
    ) {
        return this._enabledIfList.iterator();
    }

    /**
     * Method iterateEnabledIfNot.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.EnabledIfNotType> iterateEnabledIfNot(
    ) {
        return this._enabledIfNotList.iterator();
    }

    /**
     * Method iterateVisibleIf.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.VisibleIfType> iterateVisibleIf(
    ) {
        return this._visibleIfList.iterator();
    }

    /**
     * Method iterateVisibleIfNot.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.VisibleIfNotType> iterateVisibleIfNot(
    ) {
        return this._visibleIfNotList.iterator();
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
    public void removeAllEnabledIf(
    ) {
        this._enabledIfList.clear();
    }

    /**
     */
    public void removeAllEnabledIfNot(
    ) {
        this._enabledIfNotList.clear();
    }

    /**
     */
    public void removeAllVisibleIf(
    ) {
        this._visibleIfList.clear();
    }

    /**
     */
    public void removeAllVisibleIfNot(
    ) {
        this._visibleIfNotList.clear();
    }

    /**
     * Method removeEnabledIf.
     * 
     * @param vEnabledIf
     * @return true if the object was removed from the collection.
     */
    public boolean removeEnabledIf(
            final org.chocolate_milk.model.types.EnabledIfType vEnabledIf) {
        boolean removed = _enabledIfList.remove(vEnabledIf);
        return removed;
    }

    /**
     * Method removeEnabledIfAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.EnabledIfType removeEnabledIfAt(
            final int index) {
        java.lang.Object obj = this._enabledIfList.remove(index);
        return (org.chocolate_milk.model.types.EnabledIfType) obj;
    }

    /**
     * Method removeEnabledIfNot.
     * 
     * @param vEnabledIfNot
     * @return true if the object was removed from the collection.
     */
    public boolean removeEnabledIfNot(
            final org.chocolate_milk.model.types.EnabledIfNotType vEnabledIfNot) {
        boolean removed = _enabledIfNotList.remove(vEnabledIfNot);
        return removed;
    }

    /**
     * Method removeEnabledIfNotAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.EnabledIfNotType removeEnabledIfNotAt(
            final int index) {
        java.lang.Object obj = this._enabledIfNotList.remove(index);
        return (org.chocolate_milk.model.types.EnabledIfNotType) obj;
    }

    /**
     * Method removeVisibleIf.
     * 
     * @param vVisibleIf
     * @return true if the object was removed from the collection.
     */
    public boolean removeVisibleIf(
            final org.chocolate_milk.model.types.VisibleIfType vVisibleIf) {
        boolean removed = _visibleIfList.remove(vVisibleIf);
        return removed;
    }

    /**
     * Method removeVisibleIfAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.VisibleIfType removeVisibleIfAt(
            final int index) {
        java.lang.Object obj = this._visibleIfList.remove(index);
        return (org.chocolate_milk.model.types.VisibleIfType) obj;
    }

    /**
     * Method removeVisibleIfNot.
     * 
     * @param vVisibleIfNot
     * @return true if the object was removed from the collection.
     */
    public boolean removeVisibleIfNot(
            final org.chocolate_milk.model.types.VisibleIfNotType vVisibleIfNot) {
        boolean removed = _visibleIfNotList.remove(vVisibleIfNot);
        return removed;
    }

    /**
     * Method removeVisibleIfNotAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.VisibleIfNotType removeVisibleIfNotAt(
            final int index) {
        java.lang.Object obj = this._visibleIfNotList.remove(index);
        return (org.chocolate_milk.model.types.VisibleIfNotType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEnabledIf
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEnabledIf(
            final int index,
            final org.chocolate_milk.model.types.EnabledIfType vEnabledIf)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._enabledIfList.size()) {
            throw new IndexOutOfBoundsException("setEnabledIf: Index value '" + index + "' not in range [0.." + (this._enabledIfList.size() - 1) + "]");
        }

        this._enabledIfList.set(index, vEnabledIf);
    }

    /**
     * 
     * 
     * @param vEnabledIfArray
     */
    public void setEnabledIf(
            final org.chocolate_milk.model.types.EnabledIfType[] vEnabledIfArray) {
        //-- copy array
        _enabledIfList.clear();

        for (int i = 0; i < vEnabledIfArray.length; i++) {
                this._enabledIfList.add(vEnabledIfArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEnabledIfNot
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEnabledIfNot(
            final int index,
            final org.chocolate_milk.model.types.EnabledIfNotType vEnabledIfNot)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._enabledIfNotList.size()) {
            throw new IndexOutOfBoundsException("setEnabledIfNot: Index value '" + index + "' not in range [0.." + (this._enabledIfNotList.size() - 1) + "]");
        }

        this._enabledIfNotList.set(index, vEnabledIfNot);
    }

    /**
     * 
     * 
     * @param vEnabledIfNotArray
     */
    public void setEnabledIfNot(
            final org.chocolate_milk.model.types.EnabledIfNotType[] vEnabledIfNotArray) {
        //-- copy array
        _enabledIfNotList.clear();

        for (int i = 0; i < vEnabledIfNotArray.length; i++) {
                this._enabledIfNotList.add(vEnabledIfNotArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vVisibleIf
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setVisibleIf(
            final int index,
            final org.chocolate_milk.model.types.VisibleIfType vVisibleIf)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._visibleIfList.size()) {
            throw new IndexOutOfBoundsException("setVisibleIf: Index value '" + index + "' not in range [0.." + (this._visibleIfList.size() - 1) + "]");
        }

        this._visibleIfList.set(index, vVisibleIf);
    }

    /**
     * 
     * 
     * @param vVisibleIfArray
     */
    public void setVisibleIf(
            final org.chocolate_milk.model.types.VisibleIfType[] vVisibleIfArray) {
        //-- copy array
        _visibleIfList.clear();

        for (int i = 0; i < vVisibleIfArray.length; i++) {
                this._visibleIfList.add(vVisibleIfArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vVisibleIfNot
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setVisibleIfNot(
            final int index,
            final org.chocolate_milk.model.types.VisibleIfNotType vVisibleIfNot)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._visibleIfNotList.size()) {
            throw new IndexOutOfBoundsException("setVisibleIfNot: Index value '" + index + "' not in range [0.." + (this._visibleIfNotList.size() - 1) + "]");
        }

        this._visibleIfNotList.set(index, vVisibleIfNot);
    }

    /**
     * 
     * 
     * @param vVisibleIfNotArray
     */
    public void setVisibleIfNot(
            final org.chocolate_milk.model.types.VisibleIfNotType[] vVisibleIfNotArray) {
        //-- copy array
        _visibleIfNotList.clear();

        for (int i = 0; i < vVisibleIfNotArray.length; i++) {
                this._visibleIfNotList.add(vVisibleIfNotArray[i]);
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
     * org.chocolate_milk.model.DisplayCondition
     */
    public static org.chocolate_milk.model.DisplayCondition unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DisplayCondition) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DisplayCondition.class, reader);
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
