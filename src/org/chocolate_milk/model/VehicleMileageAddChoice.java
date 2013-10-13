/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VehicleMileageAddChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VehicleMileageAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class VehicleMileageAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _odometerReadingAdd.
     */
    private org.chocolate_milk.model.OdometerReadingAdd _odometerReadingAdd;

    /**
     * Field _totalMiles.
     */
    private java.lang.String _totalMiles;


      //----------------/
     //- Constructors -/
    //----------------/

    public VehicleMileageAddChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'odometerReadingAdd'.
     * 
     * @return the value of field 'OdometerReadingAdd'.
     */
    public org.chocolate_milk.model.OdometerReadingAdd getOdometerReadingAdd(
    ) {
        return this._odometerReadingAdd;
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
     * Sets the value of field 'odometerReadingAdd'.
     * 
     * @param odometerReadingAdd the value of field
     * 'odometerReadingAdd'.
     */
    public void setOdometerReadingAdd(
            final org.chocolate_milk.model.OdometerReadingAdd odometerReadingAdd) {
        this._odometerReadingAdd = odometerReadingAdd;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.VehicleMileageAddChoice
     */
    public static org.chocolate_milk.model.VehicleMileageAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VehicleMileageAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VehicleMileageAddChoice.class, reader);
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
