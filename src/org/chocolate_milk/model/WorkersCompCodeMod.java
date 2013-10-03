/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: WorkersCompCodeMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class WorkersCompCodeMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class WorkersCompCodeMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listID.
     */
    private java.lang.String _listID;

    /**
     * Field _editSequence.
     */
    private java.lang.String _editSequence;

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _desc.
     */
    private java.lang.String _desc;

    /**
     * Field _rateEntryList.
     */
    private java.util.List<org.chocolate_milk.model.RateEntry> _rateEntryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WorkersCompCodeMod() {
        super();
        this._rateEntryList = new java.util.ArrayList<org.chocolate_milk.model.RateEntry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRateEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRateEntry(
            final org.chocolate_milk.model.RateEntry vRateEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._rateEntryList.add(vRateEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vRateEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRateEntry(
            final int index,
            final org.chocolate_milk.model.RateEntry vRateEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._rateEntryList.add(index, vRateEntry);
    }

    /**
     * Method enumerateRateEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.RateEntry> enumerateRateEntry(
    ) {
        return java.util.Collections.enumeration(this._rateEntryList);
    }

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'Desc'.
     */
    public java.lang.String getDesc(
    ) {
        return this._desc;
    }

    /**
     * Returns the value of field 'editSequence'.
     * 
     * @return the value of field 'EditSequence'.
     */
    public java.lang.String getEditSequence(
    ) {
        return this._editSequence;
    }

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'listID'.
     * 
     * @return the value of field 'ListID'.
     */
    public java.lang.String getListID(
    ) {
        return this._listID;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getRateEntry.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.RateEntry
     * at the given index
     */
    public org.chocolate_milk.model.RateEntry getRateEntry(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rateEntryList.size()) {
            throw new IndexOutOfBoundsException("getRateEntry: Index value '" + index + "' not in range [0.." + (this._rateEntryList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.RateEntry) _rateEntryList.get(index);
    }

    /**
     * Method getRateEntry.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.RateEntry[] getRateEntry(
    ) {
        org.chocolate_milk.model.RateEntry[] array = new org.chocolate_milk.model.RateEntry[0];
        return (org.chocolate_milk.model.RateEntry[]) this._rateEntryList.toArray(array);
    }

    /**
     * Method getRateEntryCount.
     * 
     * @return the size of this collection
     */
    public int getRateEntryCount(
    ) {
        return this._rateEntryList.size();
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
     * Method iterateRateEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.RateEntry> iterateRateEntry(
    ) {
        return this._rateEntryList.iterator();
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
    public void removeAllRateEntry(
    ) {
        this._rateEntryList.clear();
    }

    /**
     * Method removeRateEntry.
     * 
     * @param vRateEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeRateEntry(
            final org.chocolate_milk.model.RateEntry vRateEntry) {
        boolean removed = _rateEntryList.remove(vRateEntry);
        return removed;
    }

    /**
     * Method removeRateEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.RateEntry removeRateEntryAt(
            final int index) {
        java.lang.Object obj = this._rateEntryList.remove(index);
        return (org.chocolate_milk.model.RateEntry) obj;
    }

    /**
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(
            final java.lang.String desc) {
        this._desc = desc;
    }

    /**
     * Sets the value of field 'editSequence'.
     * 
     * @param editSequence the value of field 'editSequence'.
     */
    public void setEditSequence(
            final java.lang.String editSequence) {
        this._editSequence = editSequence;
    }

    /**
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'listID'.
     * 
     * @param listID the value of field 'listID'.
     */
    public void setListID(
            final java.lang.String listID) {
        this._listID = listID;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vRateEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRateEntry(
            final int index,
            final org.chocolate_milk.model.RateEntry vRateEntry)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rateEntryList.size()) {
            throw new IndexOutOfBoundsException("setRateEntry: Index value '" + index + "' not in range [0.." + (this._rateEntryList.size() - 1) + "]");
        }

        this._rateEntryList.set(index, vRateEntry);
    }

    /**
     * 
     * 
     * @param vRateEntryArray
     */
    public void setRateEntry(
            final org.chocolate_milk.model.RateEntry[] vRateEntryArray) {
        //-- copy array
        _rateEntryList.clear();

        for (int i = 0; i < vRateEntryArray.length; i++) {
                this._rateEntryList.add(vRateEntryArray[i]);
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
     * org.chocolate_milk.model.WorkersCompCodeMod
     */
    public static org.chocolate_milk.model.WorkersCompCodeMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.WorkersCompCodeMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.WorkersCompCodeMod.class, reader);
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
