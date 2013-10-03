/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CurrencyFormat.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CurrencyFormat.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CurrencyFormat implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _thousandSeparator.
     */
    private org.chocolate_milk.model.types.ThousandSeparatorType _thousandSeparator = org.chocolate_milk.model.types.ThousandSeparatorType.fromValue("Comma");

    /**
     * Field _thousandSeparatorGrouping.
     */
    private org.chocolate_milk.model.types.ThousandSeparatorGroupingType _thousandSeparatorGrouping = org.chocolate_milk.model.types.ThousandSeparatorGroupingType.fromValue("XX_XXX_XXX");

    /**
     * Field _decimalPlaces.
     */
    private org.chocolate_milk.model.types.DecimalPlacesType _decimalPlaces = org.chocolate_milk.model.types.DecimalPlacesType.fromValue("2");

    /**
     * Field _decimalSeparator.
     */
    private org.chocolate_milk.model.types.DecimalSeparatorType _decimalSeparator = org.chocolate_milk.model.types.DecimalSeparatorType.fromValue("Period");


      //----------------/
     //- Constructors -/
    //----------------/

    public CurrencyFormat() {
        super();
        setThousandSeparator(org.chocolate_milk.model.types.ThousandSeparatorType.fromValue("Comma"));
        setThousandSeparatorGrouping(org.chocolate_milk.model.types.ThousandSeparatorGroupingType.fromValue("XX_XXX_XXX"));
        setDecimalPlaces(org.chocolate_milk.model.types.DecimalPlacesType.fromValue("2"));
        setDecimalSeparator(org.chocolate_milk.model.types.DecimalSeparatorType.fromValue("Period"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'decimalPlaces'.
     * 
     * @return the value of field 'DecimalPlaces'.
     */
    public org.chocolate_milk.model.types.DecimalPlacesType getDecimalPlaces(
    ) {
        return this._decimalPlaces;
    }

    /**
     * Returns the value of field 'decimalSeparator'.
     * 
     * @return the value of field 'DecimalSeparator'.
     */
    public org.chocolate_milk.model.types.DecimalSeparatorType getDecimalSeparator(
    ) {
        return this._decimalSeparator;
    }

    /**
     * Returns the value of field 'thousandSeparator'.
     * 
     * @return the value of field 'ThousandSeparator'.
     */
    public org.chocolate_milk.model.types.ThousandSeparatorType getThousandSeparator(
    ) {
        return this._thousandSeparator;
    }

    /**
     * Returns the value of field 'thousandSeparatorGrouping'.
     * 
     * @return the value of field 'ThousandSeparatorGrouping'.
     */
    public org.chocolate_milk.model.types.ThousandSeparatorGroupingType getThousandSeparatorGrouping(
    ) {
        return this._thousandSeparatorGrouping;
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
     * Sets the value of field 'decimalPlaces'.
     * 
     * @param decimalPlaces the value of field 'decimalPlaces'.
     */
    public void setDecimalPlaces(
            final org.chocolate_milk.model.types.DecimalPlacesType decimalPlaces) {
        this._decimalPlaces = decimalPlaces;
    }

    /**
     * Sets the value of field 'decimalSeparator'.
     * 
     * @param decimalSeparator the value of field 'decimalSeparator'
     */
    public void setDecimalSeparator(
            final org.chocolate_milk.model.types.DecimalSeparatorType decimalSeparator) {
        this._decimalSeparator = decimalSeparator;
    }

    /**
     * Sets the value of field 'thousandSeparator'.
     * 
     * @param thousandSeparator the value of field
     * 'thousandSeparator'.
     */
    public void setThousandSeparator(
            final org.chocolate_milk.model.types.ThousandSeparatorType thousandSeparator) {
        this._thousandSeparator = thousandSeparator;
    }

    /**
     * Sets the value of field 'thousandSeparatorGrouping'.
     * 
     * @param thousandSeparatorGrouping the value of field
     * 'thousandSeparatorGrouping'.
     */
    public void setThousandSeparatorGrouping(
            final org.chocolate_milk.model.types.ThousandSeparatorGroupingType thousandSeparatorGrouping) {
        this._thousandSeparatorGrouping = thousandSeparatorGrouping;
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
     * org.chocolate_milk.model.CurrencyFormat
     */
    public static org.chocolate_milk.model.CurrencyFormat unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CurrencyFormat) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CurrencyFormat.class, reader);
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
