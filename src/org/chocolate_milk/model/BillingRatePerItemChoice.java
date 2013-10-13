/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillingRatePerItemChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillingRatePerItemChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BillingRatePerItemChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ORCustomRate.
     */
    private org.chocolate_milk.model.ORCustomRate _ORCustomRate;

    /**
     * Field _billingRateAdjustment.
     */
    private org.chocolate_milk.model.BillingRateAdjustment _billingRateAdjustment;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillingRatePerItemChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'billingRateAdjustment'.
     * 
     * @return the value of field 'BillingRateAdjustment'.
     */
    public org.chocolate_milk.model.BillingRateAdjustment getBillingRateAdjustment(
    ) {
        return this._billingRateAdjustment;
    }

    /**
     * Returns the value of field 'ORCustomRate'.
     * 
     * @return the value of field 'ORCustomRate'.
     */
    public org.chocolate_milk.model.ORCustomRate getORCustomRate(
    ) {
        return this._ORCustomRate;
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
     * Sets the value of field 'billingRateAdjustment'.
     * 
     * @param billingRateAdjustment the value of field
     * 'billingRateAdjustment'.
     */
    public void setBillingRateAdjustment(
            final org.chocolate_milk.model.BillingRateAdjustment billingRateAdjustment) {
        this._billingRateAdjustment = billingRateAdjustment;
    }

    /**
     * Sets the value of field 'ORCustomRate'.
     * 
     * @param ORCustomRate the value of field 'ORCustomRate'.
     */
    public void setORCustomRate(
            final org.chocolate_milk.model.ORCustomRate ORCustomRate) {
        this._ORCustomRate = ORCustomRate;
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
     * org.chocolate_milk.model.BillingRatePerItemChoice
     */
    public static org.chocolate_milk.model.BillingRatePerItemChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillingRatePerItemChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillingRatePerItemChoice.class, reader);
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
