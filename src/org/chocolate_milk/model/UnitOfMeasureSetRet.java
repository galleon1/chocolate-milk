/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: UnitOfMeasureSetRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class UnitOfMeasureSetRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class UnitOfMeasureSetRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listID.
     */
    private java.lang.String _listID;

    /**
     * Field _timeCreated.
     */
    private java.lang.String _timeCreated;

    /**
     * Field _timeModified.
     */
    private java.lang.String _timeModified;

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
     * Field _unitOfMeasureType.
     */
    private org.chocolate_milk.model.types.UnitOfMeasureTypeType _unitOfMeasureType;

    /**
     * Field _baseUnit.
     */
    private org.chocolate_milk.model.BaseUnit _baseUnit;

    /**
     * Field _relatedUnitList.
     */
    private java.util.List<org.chocolate_milk.model.RelatedUnit> _relatedUnitList;

    /**
     * Field _defaultUnitList.
     */
    private java.util.List<org.chocolate_milk.model.DefaultUnit> _defaultUnitList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UnitOfMeasureSetRet() {
        super();
        this._relatedUnitList = new java.util.ArrayList<org.chocolate_milk.model.RelatedUnit>();
        this._defaultUnitList = new java.util.ArrayList<org.chocolate_milk.model.DefaultUnit>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDefaultUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefaultUnit(
            final org.chocolate_milk.model.DefaultUnit vDefaultUnit)
    throws java.lang.IndexOutOfBoundsException {
        this._defaultUnitList.add(vDefaultUnit);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefaultUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefaultUnit(
            final int index,
            final org.chocolate_milk.model.DefaultUnit vDefaultUnit)
    throws java.lang.IndexOutOfBoundsException {
        this._defaultUnitList.add(index, vDefaultUnit);
    }

    /**
     * 
     * 
     * @param vRelatedUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelatedUnit(
            final org.chocolate_milk.model.RelatedUnit vRelatedUnit)
    throws java.lang.IndexOutOfBoundsException {
        this._relatedUnitList.add(vRelatedUnit);
    }

    /**
     * 
     * 
     * @param index
     * @param vRelatedUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelatedUnit(
            final int index,
            final org.chocolate_milk.model.RelatedUnit vRelatedUnit)
    throws java.lang.IndexOutOfBoundsException {
        this._relatedUnitList.add(index, vRelatedUnit);
    }

    /**
     * Method enumerateDefaultUnit.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DefaultUnit> enumerateDefaultUnit(
    ) {
        return java.util.Collections.enumeration(this._defaultUnitList);
    }

    /**
     * Method enumerateRelatedUnit.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.RelatedUnit> enumerateRelatedUnit(
    ) {
        return java.util.Collections.enumeration(this._relatedUnitList);
    }

    /**
     * Returns the value of field 'baseUnit'.
     * 
     * @return the value of field 'BaseUnit'.
     */
    public org.chocolate_milk.model.BaseUnit getBaseUnit(
    ) {
        return this._baseUnit;
    }

    /**
     * Method getDefaultUnit.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.DefaultUnit at the given index
     */
    public org.chocolate_milk.model.DefaultUnit getDefaultUnit(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._defaultUnitList.size()) {
            throw new IndexOutOfBoundsException("getDefaultUnit: Index value '" + index + "' not in range [0.." + (this._defaultUnitList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DefaultUnit) _defaultUnitList.get(index);
    }

    /**
     * Method getDefaultUnit.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DefaultUnit[] getDefaultUnit(
    ) {
        org.chocolate_milk.model.DefaultUnit[] array = new org.chocolate_milk.model.DefaultUnit[0];
        return (org.chocolate_milk.model.DefaultUnit[]) this._defaultUnitList.toArray(array);
    }

    /**
     * Method getDefaultUnitCount.
     * 
     * @return the size of this collection
     */
    public int getDefaultUnitCount(
    ) {
        return this._defaultUnitList.size();
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
     * Method getRelatedUnit.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.RelatedUnit at the given index
     */
    public org.chocolate_milk.model.RelatedUnit getRelatedUnit(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relatedUnitList.size()) {
            throw new IndexOutOfBoundsException("getRelatedUnit: Index value '" + index + "' not in range [0.." + (this._relatedUnitList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.RelatedUnit) _relatedUnitList.get(index);
    }

    /**
     * Method getRelatedUnit.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.RelatedUnit[] getRelatedUnit(
    ) {
        org.chocolate_milk.model.RelatedUnit[] array = new org.chocolate_milk.model.RelatedUnit[0];
        return (org.chocolate_milk.model.RelatedUnit[]) this._relatedUnitList.toArray(array);
    }

    /**
     * Method getRelatedUnitCount.
     * 
     * @return the size of this collection
     */
    public int getRelatedUnitCount(
    ) {
        return this._relatedUnitList.size();
    }

    /**
     * Returns the value of field 'timeCreated'.
     * 
     * @return the value of field 'TimeCreated'.
     */
    public java.lang.String getTimeCreated(
    ) {
        return this._timeCreated;
    }

    /**
     * Returns the value of field 'timeModified'.
     * 
     * @return the value of field 'TimeModified'.
     */
    public java.lang.String getTimeModified(
    ) {
        return this._timeModified;
    }

    /**
     * Returns the value of field 'unitOfMeasureType'.
     * 
     * @return the value of field 'UnitOfMeasureType'.
     */
    public org.chocolate_milk.model.types.UnitOfMeasureTypeType getUnitOfMeasureType(
    ) {
        return this._unitOfMeasureType;
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
     * Method iterateDefaultUnit.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DefaultUnit> iterateDefaultUnit(
    ) {
        return this._defaultUnitList.iterator();
    }

    /**
     * Method iterateRelatedUnit.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.RelatedUnit> iterateRelatedUnit(
    ) {
        return this._relatedUnitList.iterator();
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
    public void removeAllDefaultUnit(
    ) {
        this._defaultUnitList.clear();
    }

    /**
     */
    public void removeAllRelatedUnit(
    ) {
        this._relatedUnitList.clear();
    }

    /**
     * Method removeDefaultUnit.
     * 
     * @param vDefaultUnit
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefaultUnit(
            final org.chocolate_milk.model.DefaultUnit vDefaultUnit) {
        boolean removed = _defaultUnitList.remove(vDefaultUnit);
        return removed;
    }

    /**
     * Method removeDefaultUnitAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DefaultUnit removeDefaultUnitAt(
            final int index) {
        java.lang.Object obj = this._defaultUnitList.remove(index);
        return (org.chocolate_milk.model.DefaultUnit) obj;
    }

    /**
     * Method removeRelatedUnit.
     * 
     * @param vRelatedUnit
     * @return true if the object was removed from the collection.
     */
    public boolean removeRelatedUnit(
            final org.chocolate_milk.model.RelatedUnit vRelatedUnit) {
        boolean removed = _relatedUnitList.remove(vRelatedUnit);
        return removed;
    }

    /**
     * Method removeRelatedUnitAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.RelatedUnit removeRelatedUnitAt(
            final int index) {
        java.lang.Object obj = this._relatedUnitList.remove(index);
        return (org.chocolate_milk.model.RelatedUnit) obj;
    }

    /**
     * Sets the value of field 'baseUnit'.
     * 
     * @param baseUnit the value of field 'baseUnit'.
     */
    public void setBaseUnit(
            final org.chocolate_milk.model.BaseUnit baseUnit) {
        this._baseUnit = baseUnit;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefaultUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefaultUnit(
            final int index,
            final org.chocolate_milk.model.DefaultUnit vDefaultUnit)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._defaultUnitList.size()) {
            throw new IndexOutOfBoundsException("setDefaultUnit: Index value '" + index + "' not in range [0.." + (this._defaultUnitList.size() - 1) + "]");
        }

        this._defaultUnitList.set(index, vDefaultUnit);
    }

    /**
     * 
     * 
     * @param vDefaultUnitArray
     */
    public void setDefaultUnit(
            final org.chocolate_milk.model.DefaultUnit[] vDefaultUnitArray) {
        //-- copy array
        _defaultUnitList.clear();

        for (int i = 0; i < vDefaultUnitArray.length; i++) {
                this._defaultUnitList.add(vDefaultUnitArray[i]);
        }
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
     * @param vRelatedUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRelatedUnit(
            final int index,
            final org.chocolate_milk.model.RelatedUnit vRelatedUnit)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relatedUnitList.size()) {
            throw new IndexOutOfBoundsException("setRelatedUnit: Index value '" + index + "' not in range [0.." + (this._relatedUnitList.size() - 1) + "]");
        }

        this._relatedUnitList.set(index, vRelatedUnit);
    }

    /**
     * 
     * 
     * @param vRelatedUnitArray
     */
    public void setRelatedUnit(
            final org.chocolate_milk.model.RelatedUnit[] vRelatedUnitArray) {
        //-- copy array
        _relatedUnitList.clear();

        for (int i = 0; i < vRelatedUnitArray.length; i++) {
                this._relatedUnitList.add(vRelatedUnitArray[i]);
        }
    }

    /**
     * Sets the value of field 'timeCreated'.
     * 
     * @param timeCreated the value of field 'timeCreated'.
     */
    public void setTimeCreated(
            final java.lang.String timeCreated) {
        this._timeCreated = timeCreated;
    }

    /**
     * Sets the value of field 'timeModified'.
     * 
     * @param timeModified the value of field 'timeModified'.
     */
    public void setTimeModified(
            final java.lang.String timeModified) {
        this._timeModified = timeModified;
    }

    /**
     * Sets the value of field 'unitOfMeasureType'.
     * 
     * @param unitOfMeasureType the value of field
     * 'unitOfMeasureType'.
     */
    public void setUnitOfMeasureType(
            final org.chocolate_milk.model.types.UnitOfMeasureTypeType unitOfMeasureType) {
        this._unitOfMeasureType = unitOfMeasureType;
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
     * org.chocolate_milk.model.UnitOfMeasureSetRet
     */
    public static org.chocolate_milk.model.UnitOfMeasureSetRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.UnitOfMeasureSetRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.UnitOfMeasureSetRet.class, reader);
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
