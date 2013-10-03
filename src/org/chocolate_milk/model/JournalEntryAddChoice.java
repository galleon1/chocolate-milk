/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JournalEntryAddChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JournalEntryAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class JournalEntryAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isHomeCurrencyAdjustment.
     */
    private java.lang.String _isHomeCurrencyAdjustment;

    /**
     * Field _currencyExchangeRate.
     */
    private org.chocolate_milk.model.CurrencyExchangeRate _currencyExchangeRate;


      //----------------/
     //- Constructors -/
    //----------------/

    public JournalEntryAddChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'currencyExchangeRate'.
     * 
     * @return the value of field 'CurrencyExchangeRate'.
     */
    public org.chocolate_milk.model.CurrencyExchangeRate getCurrencyExchangeRate(
    ) {
        return this._currencyExchangeRate;
    }

    /**
     * Returns the value of field 'isHomeCurrencyAdjustment'.
     * 
     * @return the value of field 'IsHomeCurrencyAdjustment'.
     */
    public java.lang.String getIsHomeCurrencyAdjustment(
    ) {
        return this._isHomeCurrencyAdjustment;
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
     * Sets the value of field 'currencyExchangeRate'.
     * 
     * @param currencyExchangeRate the value of field
     * 'currencyExchangeRate'.
     */
    public void setCurrencyExchangeRate(
            final org.chocolate_milk.model.CurrencyExchangeRate currencyExchangeRate) {
        this._currencyExchangeRate = currencyExchangeRate;
    }

    /**
     * Sets the value of field 'isHomeCurrencyAdjustment'.
     * 
     * @param isHomeCurrencyAdjustment the value of field
     * 'isHomeCurrencyAdjustment'.
     */
    public void setIsHomeCurrencyAdjustment(
            final java.lang.String isHomeCurrencyAdjustment) {
        this._isHomeCurrencyAdjustment = isHomeCurrencyAdjustment;
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
     * org.chocolate_milk.model.JournalEntryAddChoice
     */
    public static org.chocolate_milk.model.JournalEntryAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JournalEntryAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JournalEntryAddChoice.class, reader);
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
