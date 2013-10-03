/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EmployeePayrollInfoMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EmployeePayrollInfoMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EmployeePayrollInfoMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _payPeriod.
     */
    private org.chocolate_milk.model.types.PayPeriodType _payPeriod;

    /**
     * Field _classRef.
     */
    private org.chocolate_milk.model.ClassRef _classRef;

    /**
     * Field _employeePayrollInfoModChoice.
     */
    private org.chocolate_milk.model.EmployeePayrollInfoModChoice _employeePayrollInfoModChoice;

    /**
     * Field _useTimeDataToCreatePaychecks.
     */
    private org.chocolate_milk.model.types.UseTimeDataToCreatePaychecksType _useTimeDataToCreatePaychecks;

    /**
     * Field _sickHours.
     */
    private org.chocolate_milk.model.SickHours _sickHours;

    /**
     * Field _vacationHours.
     */
    private org.chocolate_milk.model.VacationHours _vacationHours;


      //----------------/
     //- Constructors -/
    //----------------/

    public EmployeePayrollInfoMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'classRef'.
     * 
     * @return the value of field 'ClassRef'.
     */
    public org.chocolate_milk.model.ClassRef getClassRef(
    ) {
        return this._classRef;
    }

    /**
     * Returns the value of field 'employeePayrollInfoModChoice'.
     * 
     * @return the value of field 'EmployeePayrollInfoModChoice'.
     */
    public org.chocolate_milk.model.EmployeePayrollInfoModChoice getEmployeePayrollInfoModChoice(
    ) {
        return this._employeePayrollInfoModChoice;
    }

    /**
     * Returns the value of field 'payPeriod'.
     * 
     * @return the value of field 'PayPeriod'.
     */
    public org.chocolate_milk.model.types.PayPeriodType getPayPeriod(
    ) {
        return this._payPeriod;
    }

    /**
     * Returns the value of field 'sickHours'.
     * 
     * @return the value of field 'SickHours'.
     */
    public org.chocolate_milk.model.SickHours getSickHours(
    ) {
        return this._sickHours;
    }

    /**
     * Returns the value of field 'useTimeDataToCreatePaychecks'.
     * 
     * @return the value of field 'UseTimeDataToCreatePaychecks'.
     */
    public org.chocolate_milk.model.types.UseTimeDataToCreatePaychecksType getUseTimeDataToCreatePaychecks(
    ) {
        return this._useTimeDataToCreatePaychecks;
    }

    /**
     * Returns the value of field 'vacationHours'.
     * 
     * @return the value of field 'VacationHours'.
     */
    public org.chocolate_milk.model.VacationHours getVacationHours(
    ) {
        return this._vacationHours;
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
     * Sets the value of field 'classRef'.
     * 
     * @param classRef the value of field 'classRef'.
     */
    public void setClassRef(
            final org.chocolate_milk.model.ClassRef classRef) {
        this._classRef = classRef;
    }

    /**
     * Sets the value of field 'employeePayrollInfoModChoice'.
     * 
     * @param employeePayrollInfoModChoice the value of field
     * 'employeePayrollInfoModChoice'.
     */
    public void setEmployeePayrollInfoModChoice(
            final org.chocolate_milk.model.EmployeePayrollInfoModChoice employeePayrollInfoModChoice) {
        this._employeePayrollInfoModChoice = employeePayrollInfoModChoice;
    }

    /**
     * Sets the value of field 'payPeriod'.
     * 
     * @param payPeriod the value of field 'payPeriod'.
     */
    public void setPayPeriod(
            final org.chocolate_milk.model.types.PayPeriodType payPeriod) {
        this._payPeriod = payPeriod;
    }

    /**
     * Sets the value of field 'sickHours'.
     * 
     * @param sickHours the value of field 'sickHours'.
     */
    public void setSickHours(
            final org.chocolate_milk.model.SickHours sickHours) {
        this._sickHours = sickHours;
    }

    /**
     * Sets the value of field 'useTimeDataToCreatePaychecks'.
     * 
     * @param useTimeDataToCreatePaychecks the value of field
     * 'useTimeDataToCreatePaychecks'.
     */
    public void setUseTimeDataToCreatePaychecks(
            final org.chocolate_milk.model.types.UseTimeDataToCreatePaychecksType useTimeDataToCreatePaychecks) {
        this._useTimeDataToCreatePaychecks = useTimeDataToCreatePaychecks;
    }

    /**
     * Sets the value of field 'vacationHours'.
     * 
     * @param vacationHours the value of field 'vacationHours'.
     */
    public void setVacationHours(
            final org.chocolate_milk.model.VacationHours vacationHours) {
        this._vacationHours = vacationHours;
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
     * org.chocolate_milk.model.EmployeePayrollInfoMod
     */
    public static org.chocolate_milk.model.EmployeePayrollInfoMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EmployeePayrollInfoMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EmployeePayrollInfoMod.class, reader);
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
