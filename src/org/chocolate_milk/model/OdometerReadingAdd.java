/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: OdometerReadingAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class OdometerReadingAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class OdometerReadingAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _odometerStart.
     */
    private java.lang.String _odometerStart;

    /**
     * Field _odometerEnd.
     */
    private java.lang.String _odometerEnd;


      //----------------/
     //- Constructors -/
    //----------------/

    public OdometerReadingAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.OdometerReadingAdd
     */
    public static org.chocolate_milk.model.OdometerReadingAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.OdometerReadingAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.OdometerReadingAdd.class, reader);
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
