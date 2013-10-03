/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ListFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxReturned.
     */
    private long _maxReturned;

    /**
     * keeps track of state for field: _maxReturned
     */
    private boolean _has_maxReturned;

    /**
     * Field _activeStatus.
     */
    private org.chocolate_milk.model.types.ActiveStatusType _activeStatus = org.chocolate_milk.model.types.ActiveStatusType.fromValue("ActiveOnly");

    /**
     * Field _fromModifiedDate.
     */
    private java.lang.String _fromModifiedDate;

    /**
     * Field _toModifiedDate.
     */
    private java.lang.String _toModifiedDate;

    /**
     * Field _listFilterChoice.
     */
    private org.chocolate_milk.model.ListFilterChoice _listFilterChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListFilter() {
        super();
        setActiveStatus(org.chocolate_milk.model.types.ActiveStatusType.fromValue("ActiveOnly"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMaxReturned(
    ) {
        this._has_maxReturned= false;
    }

    /**
     * Returns the value of field 'activeStatus'.
     * 
     * @return the value of field 'ActiveStatus'.
     */
    public org.chocolate_milk.model.types.ActiveStatusType getActiveStatus(
    ) {
        return this._activeStatus;
    }

    /**
     * Returns the value of field 'fromModifiedDate'.
     * 
     * @return the value of field 'FromModifiedDate'.
     */
    public java.lang.String getFromModifiedDate(
    ) {
        return this._fromModifiedDate;
    }

    /**
     * Returns the value of field 'listFilterChoice'.
     * 
     * @return the value of field 'ListFilterChoice'.
     */
    public org.chocolate_milk.model.ListFilterChoice getListFilterChoice(
    ) {
        return this._listFilterChoice;
    }

    /**
     * Returns the value of field 'maxReturned'.
     * 
     * @return the value of field 'MaxReturned'.
     */
    public long getMaxReturned(
    ) {
        return this._maxReturned;
    }

    /**
     * Returns the value of field 'toModifiedDate'.
     * 
     * @return the value of field 'ToModifiedDate'.
     */
    public java.lang.String getToModifiedDate(
    ) {
        return this._toModifiedDate;
    }

    /**
     * Method hasMaxReturned.
     * 
     * @return true if at least one MaxReturned has been added
     */
    public boolean hasMaxReturned(
    ) {
        return this._has_maxReturned;
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
     * Sets the value of field 'activeStatus'.
     * 
     * @param activeStatus the value of field 'activeStatus'.
     */
    public void setActiveStatus(
            final org.chocolate_milk.model.types.ActiveStatusType activeStatus) {
        this._activeStatus = activeStatus;
    }

    /**
     * Sets the value of field 'fromModifiedDate'.
     * 
     * @param fromModifiedDate the value of field 'fromModifiedDate'
     */
    public void setFromModifiedDate(
            final java.lang.String fromModifiedDate) {
        this._fromModifiedDate = fromModifiedDate;
    }

    /**
     * Sets the value of field 'listFilterChoice'.
     * 
     * @param listFilterChoice the value of field 'listFilterChoice'
     */
    public void setListFilterChoice(
            final org.chocolate_milk.model.ListFilterChoice listFilterChoice) {
        this._listFilterChoice = listFilterChoice;
    }

    /**
     * Sets the value of field 'maxReturned'.
     * 
     * @param maxReturned the value of field 'maxReturned'.
     */
    public void setMaxReturned(
            final long maxReturned) {
        this._maxReturned = maxReturned;
        this._has_maxReturned = true;
    }

    /**
     * Sets the value of field 'toModifiedDate'.
     * 
     * @param toModifiedDate the value of field 'toModifiedDate'.
     */
    public void setToModifiedDate(
            final java.lang.String toModifiedDate) {
        this._toModifiedDate = toModifiedDate;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ListFilter
     */
    public static org.chocolate_milk.model.ListFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListFilter.class, reader);
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
