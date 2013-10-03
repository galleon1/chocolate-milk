/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateLineAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateLineAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EstimateLineAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _markupRate.
     */
    private java.lang.String _markupRate;

    /**
     * Field _markupRatePercent.
     */
    private java.lang.String _markupRatePercent;

    /**
     * Field _priceLevelRef.
     */
    private org.chocolate_milk.model.PriceLevelRef _priceLevelRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateLineAddChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'markupRate'.
     * 
     * @return the value of field 'MarkupRate'.
     */
    public java.lang.String getMarkupRate(
    ) {
        return this._markupRate;
    }

    /**
     * Returns the value of field 'markupRatePercent'.
     * 
     * @return the value of field 'MarkupRatePercent'.
     */
    public java.lang.String getMarkupRatePercent(
    ) {
        return this._markupRatePercent;
    }

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
     * Sets the value of field 'markupRate'.
     * 
     * @param markupRate the value of field 'markupRate'.
     */
    public void setMarkupRate(
            final java.lang.String markupRate) {
        this._markupRate = markupRate;
    }

    /**
     * Sets the value of field 'markupRatePercent'.
     * 
     * @param markupRatePercent the value of field
     * 'markupRatePercent'.
     */
    public void setMarkupRatePercent(
            final java.lang.String markupRatePercent) {
        this._markupRatePercent = markupRatePercent;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.EstimateLineAddChoice
     */
    public static org.chocolate_milk.model.EstimateLineAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateLineAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateLineAddChoice.class, reader);
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
