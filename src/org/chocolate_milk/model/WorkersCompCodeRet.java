/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: WorkersCompCodeRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class WorkersCompCodeRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class WorkersCompCodeRet implements java.io.Serializable {


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
     * Field _desc.
     */
    private java.lang.String _desc;

    /**
     * Field _currentRate.
     */
    private java.lang.String _currentRate;

    /**
     * Field _currentEffectiveDate.
     */
    private java.lang.String _currentEffectiveDate;

    /**
     * Field _nextRate.
     */
    private java.lang.String _nextRate;

    /**
     * Field _nextEffectiveDate.
     */
    private java.lang.String _nextEffectiveDate;

    /**
     * Field _rateHistoryList.
     */
    private java.util.List<org.chocolate_milk.model.RateHistory> _rateHistoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WorkersCompCodeRet() {
        super();
        this._rateHistoryList = new java.util.ArrayList<org.chocolate_milk.model.RateHistory>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRateHistory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRateHistory(
            final org.chocolate_milk.model.RateHistory vRateHistory)
    throws java.lang.IndexOutOfBoundsException {
        this._rateHistoryList.add(vRateHistory);
    }

    /**
     * 
     * 
     * @param index
     * @param vRateHistory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRateHistory(
            final int index,
            final org.chocolate_milk.model.RateHistory vRateHistory)
    throws java.lang.IndexOutOfBoundsException {
        this._rateHistoryList.add(index, vRateHistory);
    }

    /**
     * Method enumerateRateHistory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.RateHistory> enumerateRateHistory(
    ) {
        return java.util.Collections.enumeration(this._rateHistoryList);
    }

    /**
     * Returns the value of field 'currentEffectiveDate'.
     * 
     * @return the value of field 'CurrentEffectiveDate'.
     */
    public java.lang.String getCurrentEffectiveDate(
    ) {
        return this._currentEffectiveDate;
    }

    /**
     * Returns the value of field 'currentRate'.
     * 
     * @return the value of field 'CurrentRate'.
     */
    public java.lang.String getCurrentRate(
    ) {
        return this._currentRate;
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
     * Returns the value of field 'nextEffectiveDate'.
     * 
     * @return the value of field 'NextEffectiveDate'.
     */
    public java.lang.String getNextEffectiveDate(
    ) {
        return this._nextEffectiveDate;
    }

    /**
     * Returns the value of field 'nextRate'.
     * 
     * @return the value of field 'NextRate'.
     */
    public java.lang.String getNextRate(
    ) {
        return this._nextRate;
    }

    /**
     * Method getRateHistory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.RateHistory at the given index
     */
    public org.chocolate_milk.model.RateHistory getRateHistory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rateHistoryList.size()) {
            throw new IndexOutOfBoundsException("getRateHistory: Index value '" + index + "' not in range [0.." + (this._rateHistoryList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.RateHistory) _rateHistoryList.get(index);
    }

    /**
     * Method getRateHistory.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.RateHistory[] getRateHistory(
    ) {
        org.chocolate_milk.model.RateHistory[] array = new org.chocolate_milk.model.RateHistory[0];
        return (org.chocolate_milk.model.RateHistory[]) this._rateHistoryList.toArray(array);
    }

    /**
     * Method getRateHistoryCount.
     * 
     * @return the size of this collection
     */
    public int getRateHistoryCount(
    ) {
        return this._rateHistoryList.size();
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
     * Method iterateRateHistory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.RateHistory> iterateRateHistory(
    ) {
        return this._rateHistoryList.iterator();
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
    public void removeAllRateHistory(
    ) {
        this._rateHistoryList.clear();
    }

    /**
     * Method removeRateHistory.
     * 
     * @param vRateHistory
     * @return true if the object was removed from the collection.
     */
    public boolean removeRateHistory(
            final org.chocolate_milk.model.RateHistory vRateHistory) {
        boolean removed = _rateHistoryList.remove(vRateHistory);
        return removed;
    }

    /**
     * Method removeRateHistoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.RateHistory removeRateHistoryAt(
            final int index) {
        java.lang.Object obj = this._rateHistoryList.remove(index);
        return (org.chocolate_milk.model.RateHistory) obj;
    }

    /**
     * Sets the value of field 'currentEffectiveDate'.
     * 
     * @param currentEffectiveDate the value of field
     * 'currentEffectiveDate'.
     */
    public void setCurrentEffectiveDate(
            final java.lang.String currentEffectiveDate) {
        this._currentEffectiveDate = currentEffectiveDate;
    }

    /**
     * Sets the value of field 'currentRate'.
     * 
     * @param currentRate the value of field 'currentRate'.
     */
    public void setCurrentRate(
            final java.lang.String currentRate) {
        this._currentRate = currentRate;
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
     * Sets the value of field 'nextEffectiveDate'.
     * 
     * @param nextEffectiveDate the value of field
     * 'nextEffectiveDate'.
     */
    public void setNextEffectiveDate(
            final java.lang.String nextEffectiveDate) {
        this._nextEffectiveDate = nextEffectiveDate;
    }

    /**
     * Sets the value of field 'nextRate'.
     * 
     * @param nextRate the value of field 'nextRate'.
     */
    public void setNextRate(
            final java.lang.String nextRate) {
        this._nextRate = nextRate;
    }

    /**
     * 
     * 
     * @param index
     * @param vRateHistory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRateHistory(
            final int index,
            final org.chocolate_milk.model.RateHistory vRateHistory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rateHistoryList.size()) {
            throw new IndexOutOfBoundsException("setRateHistory: Index value '" + index + "' not in range [0.." + (this._rateHistoryList.size() - 1) + "]");
        }

        this._rateHistoryList.set(index, vRateHistory);
    }

    /**
     * 
     * 
     * @param vRateHistoryArray
     */
    public void setRateHistory(
            final org.chocolate_milk.model.RateHistory[] vRateHistoryArray) {
        //-- copy array
        _rateHistoryList.clear();

        for (int i = 0; i < vRateHistoryArray.length; i++) {
                this._rateHistoryList.add(vRateHistoryArray[i]);
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.WorkersCompCodeRet
     */
    public static org.chocolate_milk.model.WorkersCompCodeRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.WorkersCompCodeRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.WorkersCompCodeRet.class, reader);
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
