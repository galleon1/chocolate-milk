/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevelRetChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevelRetChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PriceLevelRetChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _priceLevelFixedPercentage.
     */
    private java.lang.String _priceLevelFixedPercentage;

    /**
     * Field _priceLevelPerItemRetCurrency.
     */
    private org.chocolate_milk.model.PriceLevelPerItemRetCurrency _priceLevelPerItemRetCurrency;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevelRetChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'priceLevelFixedPercentage'.
     * 
     * @return the value of field 'PriceLevelFixedPercentage'.
     */
    public java.lang.String getPriceLevelFixedPercentage(
    ) {
        return this._priceLevelFixedPercentage;
    }

    /**
     * Returns the value of field 'priceLevelPerItemRetCurrency'.
     * 
     * @return the value of field 'PriceLevelPerItemRetCurrency'.
     */
    public org.chocolate_milk.model.PriceLevelPerItemRetCurrency getPriceLevelPerItemRetCurrency(
    ) {
        return this._priceLevelPerItemRetCurrency;
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
     * Sets the value of field 'priceLevelFixedPercentage'.
     * 
     * @param priceLevelFixedPercentage the value of field
     * 'priceLevelFixedPercentage'.
     */
    public void setPriceLevelFixedPercentage(
            final java.lang.String priceLevelFixedPercentage) {
        this._priceLevelFixedPercentage = priceLevelFixedPercentage;
    }

    /**
     * Sets the value of field 'priceLevelPerItemRetCurrency'.
     * 
     * @param priceLevelPerItemRetCurrency the value of field
     * 'priceLevelPerItemRetCurrency'.
     */
    public void setPriceLevelPerItemRetCurrency(
            final org.chocolate_milk.model.PriceLevelPerItemRetCurrency priceLevelPerItemRetCurrency) {
        this._priceLevelPerItemRetCurrency = priceLevelPerItemRetCurrency;
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
     * org.chocolate_milk.model.PriceLevelRetChoice
     */
    public static org.chocolate_milk.model.PriceLevelRetChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevelRetChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevelRetChoice.class, reader);
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
