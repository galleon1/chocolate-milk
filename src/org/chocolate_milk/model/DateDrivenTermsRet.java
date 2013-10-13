/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DateDrivenTermsRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DateDrivenTermsRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DateDrivenTermsRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listCore.
     */
    private org.chocolate_milk.model.ListCore _listCore;

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _dayOfMonthDue.
     */
    private long _dayOfMonthDue;

    /**
     * keeps track of state for field: _dayOfMonthDue
     */
    private boolean _has_dayOfMonthDue;

    /**
     * Field _dueNextMonthDays.
     */
    private long _dueNextMonthDays;

    /**
     * keeps track of state for field: _dueNextMonthDays
     */
    private boolean _has_dueNextMonthDays;

    /**
     * Field _discountDayOfMonth.
     */
    private long _discountDayOfMonth;

    /**
     * keeps track of state for field: _discountDayOfMonth
     */
    private boolean _has_discountDayOfMonth;

    /**
     * Field _discountPct.
     */
    private java.lang.String _discountPct;


      //----------------/
     //- Constructors -/
    //----------------/

    public DateDrivenTermsRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDayOfMonthDue(
    ) {
        this._has_dayOfMonthDue= false;
    }

    /**
     */
    public void deleteDiscountDayOfMonth(
    ) {
        this._has_discountDayOfMonth= false;
    }

    /**
     */
    public void deleteDueNextMonthDays(
    ) {
        this._has_dueNextMonthDays= false;
    }

    /**
     * Returns the value of field 'dayOfMonthDue'.
     * 
     * @return the value of field 'DayOfMonthDue'.
     */
    public long getDayOfMonthDue(
    ) {
        return this._dayOfMonthDue;
    }

    /**
     * Returns the value of field 'discountDayOfMonth'.
     * 
     * @return the value of field 'DiscountDayOfMonth'.
     */
    public long getDiscountDayOfMonth(
    ) {
        return this._discountDayOfMonth;
    }

    /**
     * Returns the value of field 'discountPct'.
     * 
     * @return the value of field 'DiscountPct'.
     */
    public java.lang.String getDiscountPct(
    ) {
        return this._discountPct;
    }

    /**
     * Returns the value of field 'dueNextMonthDays'.
     * 
     * @return the value of field 'DueNextMonthDays'.
     */
    public long getDueNextMonthDays(
    ) {
        return this._dueNextMonthDays;
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
     * Returns the value of field 'listCore'.
     * 
     * @return the value of field 'ListCore'.
     */
    public org.chocolate_milk.model.ListCore getListCore(
    ) {
        return this._listCore;
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
     * Method hasDayOfMonthDue.
     * 
     * @return true if at least one DayOfMonthDue has been added
     */
    public boolean hasDayOfMonthDue(
    ) {
        return this._has_dayOfMonthDue;
    }

    /**
     * Method hasDiscountDayOfMonth.
     * 
     * @return true if at least one DiscountDayOfMonth has been adde
     */
    public boolean hasDiscountDayOfMonth(
    ) {
        return this._has_discountDayOfMonth;
    }

    /**
     * Method hasDueNextMonthDays.
     * 
     * @return true if at least one DueNextMonthDays has been added
     */
    public boolean hasDueNextMonthDays(
    ) {
        return this._has_dueNextMonthDays;
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
     * Sets the value of field 'dayOfMonthDue'.
     * 
     * @param dayOfMonthDue the value of field 'dayOfMonthDue'.
     */
    public void setDayOfMonthDue(
            final long dayOfMonthDue) {
        this._dayOfMonthDue = dayOfMonthDue;
        this._has_dayOfMonthDue = true;
    }

    /**
     * Sets the value of field 'discountDayOfMonth'.
     * 
     * @param discountDayOfMonth the value of field
     * 'discountDayOfMonth'.
     */
    public void setDiscountDayOfMonth(
            final long discountDayOfMonth) {
        this._discountDayOfMonth = discountDayOfMonth;
        this._has_discountDayOfMonth = true;
    }

    /**
     * Sets the value of field 'discountPct'.
     * 
     * @param discountPct the value of field 'discountPct'.
     */
    public void setDiscountPct(
            final java.lang.String discountPct) {
        this._discountPct = discountPct;
    }

    /**
     * Sets the value of field 'dueNextMonthDays'.
     * 
     * @param dueNextMonthDays the value of field 'dueNextMonthDays'
     */
    public void setDueNextMonthDays(
            final long dueNextMonthDays) {
        this._dueNextMonthDays = dueNextMonthDays;
        this._has_dueNextMonthDays = true;
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
     * Sets the value of field 'listCore'.
     * 
     * @param listCore the value of field 'listCore'.
     */
    public void setListCore(
            final org.chocolate_milk.model.ListCore listCore) {
        this._listCore = listCore;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.DateDrivenTermsRet
     */
    public static org.chocolate_milk.model.DateDrivenTermsRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DateDrivenTermsRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DateDrivenTermsRet.class, reader);
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
