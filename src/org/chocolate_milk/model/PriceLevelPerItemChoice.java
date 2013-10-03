/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevelPerItemChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevelPerItemChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PriceLevelPerItemChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ORCustomPrice.
     */
    private org.chocolate_milk.model.ORCustomPrice _ORCustomPrice;

    /**
     * Field _priceLevelAdjustment.
     */
    private org.chocolate_milk.model.PriceLevelAdjustment _priceLevelAdjustment;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevelPerItemChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ORCustomPrice'.
     * 
     * @return the value of field 'ORCustomPrice'.
     */
    public org.chocolate_milk.model.ORCustomPrice getORCustomPrice(
    ) {
        return this._ORCustomPrice;
    }

    /**
     * Returns the value of field 'priceLevelAdjustment'.
     * 
     * @return the value of field 'PriceLevelAdjustment'.
     */
    public org.chocolate_milk.model.PriceLevelAdjustment getPriceLevelAdjustment(
    ) {
        return this._priceLevelAdjustment;
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
     * Sets the value of field 'ORCustomPrice'.
     * 
     * @param ORCustomPrice the value of field 'ORCustomPrice'.
     */
    public void setORCustomPrice(
            final org.chocolate_milk.model.ORCustomPrice ORCustomPrice) {
        this._ORCustomPrice = ORCustomPrice;
    }

    /**
     * Sets the value of field 'priceLevelAdjustment'.
     * 
     * @param priceLevelAdjustment the value of field
     * 'priceLevelAdjustment'.
     */
    public void setPriceLevelAdjustment(
            final org.chocolate_milk.model.PriceLevelAdjustment priceLevelAdjustment) {
        this._priceLevelAdjustment = priceLevelAdjustment;
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
     * org.chocolate_milk.model.PriceLevelPerItemChoice
     */
    public static org.chocolate_milk.model.PriceLevelPerItemChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevelPerItemChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevelPerItemChoice.class, reader);
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
