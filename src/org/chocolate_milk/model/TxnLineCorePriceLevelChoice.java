/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnLineCorePriceLevelChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnLineCorePriceLevelChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnLineCorePriceLevelChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _rate.
     */
    private java.lang.String _rate;

    /**
     * Field _ratePercent.
     */
    private java.lang.String _ratePercent;

    /**
     * Field _priceLevelRef.
     */
    private org.chocolate_milk.model.PriceLevelRef _priceLevelRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnLineCorePriceLevelChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'priceLevelRef'.
     * 
     * @return the value of field 'PriceLevelRef'.
     */
    public org.chocolate_milk.model.PriceLevelRef getPriceLevelRef(
    ) {
        return this._priceLevelRef;
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
     * Returns the value of field 'ratePercent'.
     * 
     * @return the value of field 'RatePercent'.
     */
    public java.lang.String getRatePercent(
    ) {
        return this._ratePercent;
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
     * Sets the value of field 'priceLevelRef'.
     * 
     * @param priceLevelRef the value of field 'priceLevelRef'.
     */
    public void setPriceLevelRef(
            final org.chocolate_milk.model.PriceLevelRef priceLevelRef) {
        this._priceLevelRef = priceLevelRef;
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
     * Sets the value of field 'ratePercent'.
     * 
     * @param ratePercent the value of field 'ratePercent'.
     */
    public void setRatePercent(
            final java.lang.String ratePercent) {
        this._ratePercent = ratePercent;
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
     * org.chocolate_milk.model.TxnLineCorePriceLevelChoice
     */
    public static org.chocolate_milk.model.TxnLineCorePriceLevelChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnLineCorePriceLevelChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnLineCorePriceLevelChoice.class, reader);
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
