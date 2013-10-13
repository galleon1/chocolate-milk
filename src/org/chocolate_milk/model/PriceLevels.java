/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevels.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevels.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class PriceLevels implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isUsingPriceLevels.
     */
    private java.lang.String _isUsingPriceLevels;

    /**
     * Field _isRoundingSalesPriceUp.
     */
    private java.lang.String _isRoundingSalesPriceUp;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevels() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'isRoundingSalesPriceUp'.
     * 
     * @return the value of field 'IsRoundingSalesPriceUp'.
     */
    public java.lang.String getIsRoundingSalesPriceUp(
    ) {
        return this._isRoundingSalesPriceUp;
    }

    /**
     * Returns the value of field 'isUsingPriceLevels'.
     * 
     * @return the value of field 'IsUsingPriceLevels'.
     */
    public java.lang.String getIsUsingPriceLevels(
    ) {
        return this._isUsingPriceLevels;
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
     * Sets the value of field 'isRoundingSalesPriceUp'.
     * 
     * @param isRoundingSalesPriceUp the value of field
     * 'isRoundingSalesPriceUp'.
     */
    public void setIsRoundingSalesPriceUp(
            final java.lang.String isRoundingSalesPriceUp) {
        this._isRoundingSalesPriceUp = isRoundingSalesPriceUp;
    }

    /**
     * Sets the value of field 'isUsingPriceLevels'.
     * 
     * @param isUsingPriceLevels the value of field
     * 'isUsingPriceLevels'.
     */
    public void setIsUsingPriceLevels(
            final java.lang.String isUsingPriceLevels) {
        this._isUsingPriceLevels = isUsingPriceLevels;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.PriceLevels
     */
    public static org.chocolate_milk.model.PriceLevels unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevels) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevels.class, reader);
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
