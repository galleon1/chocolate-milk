/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VacationHours.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VacationHours.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class VacationHours implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _hoursAvailable.
     */
    private java.lang.String _hoursAvailable;

    /**
     * Field _accrualPeriod.
     */
    private org.chocolate_milk.model.types.AccrualPeriodType _accrualPeriod;

    /**
     * Field _hoursAccrued.
     */
    private java.lang.String _hoursAccrued;

    /**
     * Field _maximumHours.
     */
    private java.lang.String _maximumHours;

    /**
     * Field _isResettingHoursEachNewYear.
     */
    private java.lang.String _isResettingHoursEachNewYear;

    /**
     * Field _hoursUsed.
     */
    private java.lang.String _hoursUsed;

    /**
     * Field _accrualStartDate.
     */
    private java.lang.String _accrualStartDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public VacationHours() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'accrualPeriod'.
     * 
     * @return the value of field 'AccrualPeriod'.
     */
    public org.chocolate_milk.model.types.AccrualPeriodType getAccrualPeriod(
    ) {
        return this._accrualPeriod;
    }

    /**
     * Returns the value of field 'accrualStartDate'.
     * 
     * @return the value of field 'AccrualStartDate'.
     */
    public java.lang.String getAccrualStartDate(
    ) {
        return this._accrualStartDate;
    }

    /**
     * Returns the value of field 'hoursAccrued'.
     * 
     * @return the value of field 'HoursAccrued'.
     */
    public java.lang.String getHoursAccrued(
    ) {
        return this._hoursAccrued;
    }

    /**
     * Returns the value of field 'hoursAvailable'.
     * 
     * @return the value of field 'HoursAvailable'.
     */
    public java.lang.String getHoursAvailable(
    ) {
        return this._hoursAvailable;
    }

    /**
     * Returns the value of field 'hoursUsed'.
     * 
     * @return the value of field 'HoursUsed'.
     */
    public java.lang.String getHoursUsed(
    ) {
        return this._hoursUsed;
    }

    /**
     * Returns the value of field 'isResettingHoursEachNewYear'.
     * 
     * @return the value of field 'IsResettingHoursEachNewYear'.
     */
    public java.lang.String getIsResettingHoursEachNewYear(
    ) {
        return this._isResettingHoursEachNewYear;
    }

    /**
     * Returns the value of field 'maximumHours'.
     * 
     * @return the value of field 'MaximumHours'.
     */
    public java.lang.String getMaximumHours(
    ) {
        return this._maximumHours;
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
     * Sets the value of field 'accrualPeriod'.
     * 
     * @param accrualPeriod the value of field 'accrualPeriod'.
     */
    public void setAccrualPeriod(
            final org.chocolate_milk.model.types.AccrualPeriodType accrualPeriod) {
        this._accrualPeriod = accrualPeriod;
    }

    /**
     * Sets the value of field 'accrualStartDate'.
     * 
     * @param accrualStartDate the value of field 'accrualStartDate'
     */
    public void setAccrualStartDate(
            final java.lang.String accrualStartDate) {
        this._accrualStartDate = accrualStartDate;
    }

    /**
     * Sets the value of field 'hoursAccrued'.
     * 
     * @param hoursAccrued the value of field 'hoursAccrued'.
     */
    public void setHoursAccrued(
            final java.lang.String hoursAccrued) {
        this._hoursAccrued = hoursAccrued;
    }

    /**
     * Sets the value of field 'hoursAvailable'.
     * 
     * @param hoursAvailable the value of field 'hoursAvailable'.
     */
    public void setHoursAvailable(
            final java.lang.String hoursAvailable) {
        this._hoursAvailable = hoursAvailable;
    }

    /**
     * Sets the value of field 'hoursUsed'.
     * 
     * @param hoursUsed the value of field 'hoursUsed'.
     */
    public void setHoursUsed(
            final java.lang.String hoursUsed) {
        this._hoursUsed = hoursUsed;
    }

    /**
     * Sets the value of field 'isResettingHoursEachNewYear'.
     * 
     * @param isResettingHoursEachNewYear the value of field
     * 'isResettingHoursEachNewYear'.
     */
    public void setIsResettingHoursEachNewYear(
            final java.lang.String isResettingHoursEachNewYear) {
        this._isResettingHoursEachNewYear = isResettingHoursEachNewYear;
    }

    /**
     * Sets the value of field 'maximumHours'.
     * 
     * @param maximumHours the value of field 'maximumHours'.
     */
    public void setMaximumHours(
            final java.lang.String maximumHours) {
        this._maximumHours = maximumHours;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.VacationHour
     */
    public static org.chocolate_milk.model.VacationHours unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VacationHours) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VacationHours.class, reader);
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
