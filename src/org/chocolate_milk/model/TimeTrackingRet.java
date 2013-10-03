/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TimeTrackingRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TimeTrackingRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TimeTrackingRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCore.
     */
    private org.chocolate_milk.model.TxnCore _txnCore;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _entityRef.
     */
    private org.chocolate_milk.model.EntityRef _entityRef;

    /**
     * Field _customerRef.
     */
    private org.chocolate_milk.model.CustomerRef _customerRef;

    /**
     * Field _itemServiceRef.
     */
    private org.chocolate_milk.model.ItemServiceRef _itemServiceRef;

    /**
     * Field _rate.
     */
    private java.lang.String _rate;

    /**
     * Field _duration.
     */
    private java.lang.String _duration;

    /**
     * Field _classRef.
     */
    private org.chocolate_milk.model.ClassRef _classRef;

    /**
     * Field _payrollItemWageRef.
     */
    private org.chocolate_milk.model.PayrollItemWageRef _payrollItemWageRef;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;

    /**
     * Field _billableStatus.
     */
    private org.chocolate_milk.model.types.BillableStatusType _billableStatus;


      //----------------/
     //- Constructors -/
    //----------------/

    public TimeTrackingRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'billableStatus'.
     * 
     * @return the value of field 'BillableStatus'.
     */
    public org.chocolate_milk.model.types.BillableStatusType getBillableStatus(
    ) {
        return this._billableStatus;
    }

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
     * Returns the value of field 'customerRef'.
     * 
     * @return the value of field 'CustomerRef'.
     */
    public org.chocolate_milk.model.CustomerRef getCustomerRef(
    ) {
        return this._customerRef;
    }

    /**
     * Returns the value of field 'duration'.
     * 
     * @return the value of field 'Duration'.
     */
    public java.lang.String getDuration(
    ) {
        return this._duration;
    }

    /**
     * Returns the value of field 'entityRef'.
     * 
     * @return the value of field 'EntityRef'.
     */
    public org.chocolate_milk.model.EntityRef getEntityRef(
    ) {
        return this._entityRef;
    }

    /**
     * Returns the value of field 'itemServiceRef'.
     * 
     * @return the value of field 'ItemServiceRef'.
     */
    public org.chocolate_milk.model.ItemServiceRef getItemServiceRef(
    ) {
        return this._itemServiceRef;
    }

    /**
     * Returns the value of field 'notes'.
     * 
     * @return the value of field 'Notes'.
     */
    public java.lang.String getNotes(
    ) {
        return this._notes;
    }

    /**
     * Returns the value of field 'payrollItemWageRef'.
     * 
     * @return the value of field 'PayrollItemWageRef'.
     */
    public org.chocolate_milk.model.PayrollItemWageRef getPayrollItemWageRef(
    ) {
        return this._payrollItemWageRef;
    }

    /**
     * Returns the value of field 'rate'.
     * 
     * @return the value of field 'Rate'.
     */
    public java.lang.String getRate(
    ) {
        return this._rate;
    }

    /**
     * Returns the value of field 'txnCore'.
     * 
     * @return the value of field 'TxnCore'.
     */
    public org.chocolate_milk.model.TxnCore getTxnCore(
    ) {
        return this._txnCore;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
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
     * Sets the value of field 'billableStatus'.
     * 
     * @param billableStatus the value of field 'billableStatus'.
     */
    public void setBillableStatus(
            final org.chocolate_milk.model.types.BillableStatusType billableStatus) {
        this._billableStatus = billableStatus;
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
     * Sets the value of field 'customerRef'.
     * 
     * @param customerRef the value of field 'customerRef'.
     */
    public void setCustomerRef(
            final org.chocolate_milk.model.CustomerRef customerRef) {
        this._customerRef = customerRef;
    }

    /**
     * Sets the value of field 'duration'.
     * 
     * @param duration the value of field 'duration'.
     */
    public void setDuration(
            final java.lang.String duration) {
        this._duration = duration;
    }

    /**
     * Sets the value of field 'entityRef'.
     * 
     * @param entityRef the value of field 'entityRef'.
     */
    public void setEntityRef(
            final org.chocolate_milk.model.EntityRef entityRef) {
        this._entityRef = entityRef;
    }

    /**
     * Sets the value of field 'itemServiceRef'.
     * 
     * @param itemServiceRef the value of field 'itemServiceRef'.
     */
    public void setItemServiceRef(
            final org.chocolate_milk.model.ItemServiceRef itemServiceRef) {
        this._itemServiceRef = itemServiceRef;
    }

    /**
     * Sets the value of field 'notes'.
     * 
     * @param notes the value of field 'notes'.
     */
    public void setNotes(
            final java.lang.String notes) {
        this._notes = notes;
    }

    /**
     * Sets the value of field 'payrollItemWageRef'.
     * 
     * @param payrollItemWageRef the value of field
     * 'payrollItemWageRef'.
     */
    public void setPayrollItemWageRef(
            final org.chocolate_milk.model.PayrollItemWageRef payrollItemWageRef) {
        this._payrollItemWageRef = payrollItemWageRef;
    }

    /**
     * Sets the value of field 'rate'.
     * 
     * @param rate the value of field 'rate'.
     */
    public void setRate(
            final java.lang.String rate) {
        this._rate = rate;
    }

    /**
     * Sets the value of field 'txnCore'.
     * 
     * @param txnCore the value of field 'txnCore'.
     */
    public void setTxnCore(
            final org.chocolate_milk.model.TxnCore txnCore) {
        this._txnCore = txnCore;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
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
     * org.chocolate_milk.model.TimeTrackingRet
     */
    public static org.chocolate_milk.model.TimeTrackingRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TimeTrackingRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TimeTrackingRet.class, reader);
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
