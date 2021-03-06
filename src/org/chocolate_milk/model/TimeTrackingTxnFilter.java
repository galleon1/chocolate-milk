/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TimeTrackingTxnFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TimeTrackingTxnFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TimeTrackingTxnFilter implements java.io.Serializable {


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
     * Field _timeTrackingTxnFilterChoice.
     */
    private org.chocolate_milk.model.TimeTrackingTxnFilterChoice _timeTrackingTxnFilterChoice;

    /**
     * Field _timeTrackingEntityFilter.
     */
    private org.chocolate_milk.model.TimeTrackingEntityFilter _timeTrackingEntityFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public TimeTrackingTxnFilter() {
        super();
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
     * Returns the value of field 'maxReturned'.
     * 
     * @return the value of field 'MaxReturned'.
     */
    public long getMaxReturned(
    ) {
        return this._maxReturned;
    }

    /**
     * Returns the value of field 'timeTrackingEntityFilter'.
     * 
     * @return the value of field 'TimeTrackingEntityFilter'.
     */
    public org.chocolate_milk.model.TimeTrackingEntityFilter getTimeTrackingEntityFilter(
    ) {
        return this._timeTrackingEntityFilter;
    }

    /**
     * Returns the value of field 'timeTrackingTxnFilterChoice'.
     * 
     * @return the value of field 'TimeTrackingTxnFilterChoice'.
     */
    public org.chocolate_milk.model.TimeTrackingTxnFilterChoice getTimeTrackingTxnFilterChoice(
    ) {
        return this._timeTrackingTxnFilterChoice;
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
     * Sets the value of field 'timeTrackingEntityFilter'.
     * 
     * @param timeTrackingEntityFilter the value of field
     * 'timeTrackingEntityFilter'.
     */
    public void setTimeTrackingEntityFilter(
            final org.chocolate_milk.model.TimeTrackingEntityFilter timeTrackingEntityFilter) {
        this._timeTrackingEntityFilter = timeTrackingEntityFilter;
    }

    /**
     * Sets the value of field 'timeTrackingTxnFilterChoice'.
     * 
     * @param timeTrackingTxnFilterChoice the value of field
     * 'timeTrackingTxnFilterChoice'.
     */
    public void setTimeTrackingTxnFilterChoice(
            final org.chocolate_milk.model.TimeTrackingTxnFilterChoice timeTrackingTxnFilterChoice) {
        this._timeTrackingTxnFilterChoice = timeTrackingTxnFilterChoice;
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
     * org.chocolate_milk.model.TimeTrackingTxnFilter
     */
    public static org.chocolate_milk.model.TimeTrackingTxnFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TimeTrackingTxnFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TimeTrackingTxnFilter.class, reader);
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
