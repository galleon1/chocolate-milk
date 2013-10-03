/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VehicleMileageAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VehicleMileageAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class VehicleMileageAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

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
     * Field _vehicleMileageAddChoice.
     */
    private org.chocolate_milk.model.VehicleMileageAddChoice _vehicleMileageAddChoice;

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

    public VehicleMileageAdd() {
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
     * Returns the value of field 'defMacro'.
     * 
     * @return the value of field 'DefMacro'.
     */
    public java.lang.String getDefMacro(
    ) {
        return this._defMacro;
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
     * Returns the value of field 'vehicleMileageAddChoice'.
     * 
     * @return the value of field 'VehicleMileageAddChoice'.
     */
    public org.chocolate_milk.model.VehicleMileageAddChoice getVehicleMileageAddChoice(
    ) {
        return this._vehicleMileageAddChoice;
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
     * Sets the value of field 'defMacro'.
     * 
     * @param defMacro the value of field 'defMacro'.
     */
    public void setDefMacro(
            final java.lang.String defMacro) {
        this._defMacro = defMacro;
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
     * Sets the value of field 'vehicleMileageAddChoice'.
     * 
     * @param vehicleMileageAddChoice the value of field
     * 'vehicleMileageAddChoice'.
     */
    public void setVehicleMileageAddChoice(
            final org.chocolate_milk.model.VehicleMileageAddChoice vehicleMileageAddChoice) {
        this._vehicleMileageAddChoice = vehicleMileageAddChoice;
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
     * org.chocolate_milk.model.VehicleMileageAdd
     */
    public static org.chocolate_milk.model.VehicleMileageAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VehicleMileageAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VehicleMileageAdd.class, reader);
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
