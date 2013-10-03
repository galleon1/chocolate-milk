/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VehicleMileageRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VehicleMileageRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class VehicleMileageRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnID.
     */
    private java.lang.String _txnID;

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
     * Field _vehicleRef.
     */
    private org.chocolate_milk.model.VehicleRef _vehicleRef;

    /**
     * Field _customerRef.
     */
    private org.chocolate_milk.model.CustomerRef _customerRef;

    /**
     * Field _itemRef.
     */
    private org.chocolate_milk.model.ItemRef _itemRef;

    /**
     * Field _classRef.
     */
    private org.chocolate_milk.model.ClassRef _classRef;

    /**
     * Field _tripStartDate.
     */
    private java.lang.String _tripStartDate;

    /**
     * Field _tripEndDate.
     */
    private java.lang.String _tripEndDate;

    /**
     * Field _odometerStart.
     */
    private java.lang.String _odometerStart;

    /**
     * Field _odometerEnd.
     */
    private java.lang.String _odometerEnd;

    /**
     * Field _totalMiles.
     */
    private java.lang.String _totalMiles;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;

    /**
     * Field _billableStatus.
     */
    private org.chocolate_milk.model.types.BillableStatusType _billableStatus;

    /**
     * Field _standardMileageRate.
     */
    private java.lang.String _standardMileageRate;

    /**
     * Field _standardMileageTotalAmount.
     */
    private java.lang.String _standardMileageTotalAmount;

    /**
     * Field _billableRate.
     */
    private java.lang.String _billableRate;

    /**
     * Field _billableAmount.
     */
    private java.lang.String _billableAmount;


      //----------------/
     //- Constructors -/
    //----------------/

    public VehicleMileageRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'billableAmount'.
     * 
     * @return the value of field 'BillableAmount'.
     */
    public java.lang.String getBillableAmount(
    ) {
        return this._billableAmount;
    }

    /**
     * Returns the value of field 'billableRate'.
     * 
     * @return the value of field 'BillableRate'.
     */
    public java.lang.String getBillableRate(
    ) {
        return this._billableRate;
    }

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
     * Returns the value of field 'editSequence'.
     * 
     * @return the value of field 'EditSequence'.
     */
    public java.lang.String getEditSequence(
    ) {
        return this._editSequence;
    }

    /**
     * Returns the value of field 'itemRef'.
     * 
     * @return the value of field 'ItemRef'.
     */
    public org.chocolate_milk.model.ItemRef getItemRef(
    ) {
        return this._itemRef;
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
     * Returns the value of field 'odometerEnd'.
     * 
     * @return the value of field 'OdometerEnd'.
     */
    public java.lang.String getOdometerEnd(
    ) {
        return this._odometerEnd;
    }

    /**
     * Returns the value of field 'odometerStart'.
     * 
     * @return the value of field 'OdometerStart'.
     */
    public java.lang.String getOdometerStart(
    ) {
        return this._odometerStart;
    }

    /**
     * Returns the value of field 'standardMileageRate'.
     * 
     * @return the value of field 'StandardMileageRate'.
     */
    public java.lang.String getStandardMileageRate(
    ) {
        return this._standardMileageRate;
    }

    /**
     * Returns the value of field 'standardMileageTotalAmount'.
     * 
     * @return the value of field 'StandardMileageTotalAmount'.
     */
    public java.lang.String getStandardMileageTotalAmount(
    ) {
        return this._standardMileageTotalAmount;
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
     * Returns the value of field 'totalMiles'.
     * 
     * @return the value of field 'TotalMiles'.
     */
    public java.lang.String getTotalMiles(
    ) {
        return this._totalMiles;
    }

    /**
     * Returns the value of field 'tripEndDate'.
     * 
     * @return the value of field 'TripEndDate'.
     */
    public java.lang.String getTripEndDate(
    ) {
        return this._tripEndDate;
    }

    /**
     * Returns the value of field 'tripStartDate'.
     * 
     * @return the value of field 'TripStartDate'.
     */
    public java.lang.String getTripStartDate(
    ) {
        return this._tripStartDate;
    }

    /**
     * Returns the value of field 'txnID'.
     * 
     * @return the value of field 'TxnID'.
     */
    public java.lang.String getTxnID(
    ) {
        return this._txnID;
    }

    /**
     * Returns the value of field 'vehicleRef'.
     * 
     * @return the value of field 'VehicleRef'.
     */
    public org.chocolate_milk.model.VehicleRef getVehicleRef(
    ) {
        return this._vehicleRef;
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
     * Sets the value of field 'billableAmount'.
     * 
     * @param billableAmount the value of field 'billableAmount'.
     */
    public void setBillableAmount(
            final java.lang.String billableAmount) {
        this._billableAmount = billableAmount;
    }

    /**
     * Sets the value of field 'billableRate'.
     * 
     * @param billableRate the value of field 'billableRate'.
     */
    public void setBillableRate(
            final java.lang.String billableRate) {
        this._billableRate = billableRate;
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
     * Sets the value of field 'editSequence'.
     * 
     * @param editSequence the value of field 'editSequence'.
     */
    public void setEditSequence(
            final java.lang.String editSequence) {
        this._editSequence = editSequence;
    }

    /**
     * Sets the value of field 'itemRef'.
     * 
     * @param itemRef the value of field 'itemRef'.
     */
    public void setItemRef(
            final org.chocolate_milk.model.ItemRef itemRef) {
        this._itemRef = itemRef;
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
     * Sets the value of field 'odometerEnd'.
     * 
     * @param odometerEnd the value of field 'odometerEnd'.
     */
    public void setOdometerEnd(
            final java.lang.String odometerEnd) {
        this._odometerEnd = odometerEnd;
    }

    /**
     * Sets the value of field 'odometerStart'.
     * 
     * @param odometerStart the value of field 'odometerStart'.
     */
    public void setOdometerStart(
            final java.lang.String odometerStart) {
        this._odometerStart = odometerStart;
    }

    /**
     * Sets the value of field 'standardMileageRate'.
     * 
     * @param standardMileageRate the value of field
     * 'standardMileageRate'.
     */
    public void setStandardMileageRate(
            final java.lang.String standardMileageRate) {
        this._standardMileageRate = standardMileageRate;
    }

    /**
     * Sets the value of field 'standardMileageTotalAmount'.
     * 
     * @param standardMileageTotalAmount the value of field
     * 'standardMileageTotalAmount'.
     */
    public void setStandardMileageTotalAmount(
            final java.lang.String standardMileageTotalAmount) {
        this._standardMileageTotalAmount = standardMileageTotalAmount;
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
     * Sets the value of field 'totalMiles'.
     * 
     * @param totalMiles the value of field 'totalMiles'.
     */
    public void setTotalMiles(
            final java.lang.String totalMiles) {
        this._totalMiles = totalMiles;
    }

    /**
     * Sets the value of field 'tripEndDate'.
     * 
     * @param tripEndDate the value of field 'tripEndDate'.
     */
    public void setTripEndDate(
            final java.lang.String tripEndDate) {
        this._tripEndDate = tripEndDate;
    }

    /**
     * Sets the value of field 'tripStartDate'.
     * 
     * @param tripStartDate the value of field 'tripStartDate'.
     */
    public void setTripStartDate(
            final java.lang.String tripStartDate) {
        this._tripStartDate = tripStartDate;
    }

    /**
     * Sets the value of field 'txnID'.
     * 
     * @param txnID the value of field 'txnID'.
     */
    public void setTxnID(
            final java.lang.String txnID) {
        this._txnID = txnID;
    }

    /**
     * Sets the value of field 'vehicleRef'.
     * 
     * @param vehicleRef the value of field 'vehicleRef'.
     */
    public void setVehicleRef(
            final org.chocolate_milk.model.VehicleRef vehicleRef) {
        this._vehicleRef = vehicleRef;
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
     * org.chocolate_milk.model.VehicleMileageRet
     */
    public static org.chocolate_milk.model.VehicleMileageRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VehicleMileageRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VehicleMileageRet.class, reader);
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
