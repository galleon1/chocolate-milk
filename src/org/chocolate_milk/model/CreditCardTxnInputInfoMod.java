/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardTxnInputInfoMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardTxnInputInfoMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditCardTxnInputInfoMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditCardNumber.
     */
    private java.lang.String _creditCardNumber;

    /**
     * Field _expirationMonth.
     */
    private long _expirationMonth;

    /**
     * keeps track of state for field: _expirationMonth
     */
    private boolean _has_expirationMonth;

    /**
     * Field _expirationYear.
     */
    private long _expirationYear;

    /**
     * keeps track of state for field: _expirationYear
     */
    private boolean _has_expirationYear;

    /**
     * Field _nameOnCard.
     */
    private java.lang.String _nameOnCard;

    /**
     * Field _creditCardAddress.
     */
    private java.lang.String _creditCardAddress;

    /**
     * Field _creditCardPostalCode.
     */
    private java.lang.String _creditCardPostalCode;

    /**
     * Field _commercialCardCode.
     */
    private java.lang.String _commercialCardCode;

    /**
     * Field _transactionMode.
     */
    private org.chocolate_milk.model.types.TransactionModeType _transactionMode = org.chocolate_milk.model.types.TransactionModeType.fromValue("CardNotPresent");

    /**
     * Field _creditCardTxnType.
     */
    private org.chocolate_milk.model.types.CreditCardTxnTypeType _creditCardTxnType;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardTxnInputInfoMod() {
        super();
        setTransactionMode(org.chocolate_milk.model.types.TransactionModeType.fromValue("CardNotPresent"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteExpirationMonth(
    ) {
        this._has_expirationMonth= false;
    }

    /**
     */
    public void deleteExpirationYear(
    ) {
        this._has_expirationYear= false;
    }

    /**
     * Returns the value of field 'commercialCardCode'.
     * 
     * @return the value of field 'CommercialCardCode'.
     */
    public java.lang.String getCommercialCardCode(
    ) {
        return this._commercialCardCode;
    }

    /**
     * Returns the value of field 'creditCardAddress'.
     * 
     * @return the value of field 'CreditCardAddress'.
     */
    public java.lang.String getCreditCardAddress(
    ) {
        return this._creditCardAddress;
    }

    /**
     * Returns the value of field 'creditCardNumber'.
     * 
     * @return the value of field 'CreditCardNumber'.
     */
    public java.lang.String getCreditCardNumber(
    ) {
        return this._creditCardNumber;
    }

    /**
     * Returns the value of field 'creditCardPostalCode'.
     * 
     * @return the value of field 'CreditCardPostalCode'.
     */
    public java.lang.String getCreditCardPostalCode(
    ) {
        return this._creditCardPostalCode;
    }

    /**
     * Returns the value of field 'creditCardTxnType'.
     * 
     * @return the value of field 'CreditCardTxnType'.
     */
    public org.chocolate_milk.model.types.CreditCardTxnTypeType getCreditCardTxnType(
    ) {
        return this._creditCardTxnType;
    }

    /**
     * Returns the value of field 'expirationMonth'.
     * 
     * @return the value of field 'ExpirationMonth'.
     */
    public long getExpirationMonth(
    ) {
        return this._expirationMonth;
    }

    /**
     * Returns the value of field 'expirationYear'.
     * 
     * @return the value of field 'ExpirationYear'.
     */
    public long getExpirationYear(
    ) {
        return this._expirationYear;
    }

    /**
     * Returns the value of field 'nameOnCard'.
     * 
     * @return the value of field 'NameOnCard'.
     */
    public java.lang.String getNameOnCard(
    ) {
        return this._nameOnCard;
    }

    /**
     * Returns the value of field 'transactionMode'.
     * 
     * @return the value of field 'TransactionMode'.
     */
    public org.chocolate_milk.model.types.TransactionModeType getTransactionMode(
    ) {
        return this._transactionMode;
    }

    /**
     * Method hasExpirationMonth.
     * 
     * @return true if at least one ExpirationMonth has been added
     */
    public boolean hasExpirationMonth(
    ) {
        return this._has_expirationMonth;
    }

    /**
     * Method hasExpirationYear.
     * 
     * @return true if at least one ExpirationYear has been added
     */
    public boolean hasExpirationYear(
    ) {
        return this._has_expirationYear;
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
     * Sets the value of field 'commercialCardCode'.
     * 
     * @param commercialCardCode the value of field
     * 'commercialCardCode'.
     */
    public void setCommercialCardCode(
            final java.lang.String commercialCardCode) {
        this._commercialCardCode = commercialCardCode;
    }

    /**
     * Sets the value of field 'creditCardAddress'.
     * 
     * @param creditCardAddress the value of field
     * 'creditCardAddress'.
     */
    public void setCreditCardAddress(
            final java.lang.String creditCardAddress) {
        this._creditCardAddress = creditCardAddress;
    }

    /**
     * Sets the value of field 'creditCardNumber'.
     * 
     * @param creditCardNumber the value of field 'creditCardNumber'
     */
    public void setCreditCardNumber(
            final java.lang.String creditCardNumber) {
        this._creditCardNumber = creditCardNumber;
    }

    /**
     * Sets the value of field 'creditCardPostalCode'.
     * 
     * @param creditCardPostalCode the value of field
     * 'creditCardPostalCode'.
     */
    public void setCreditCardPostalCode(
            final java.lang.String creditCardPostalCode) {
        this._creditCardPostalCode = creditCardPostalCode;
    }

    /**
     * Sets the value of field 'creditCardTxnType'.
     * 
     * @param creditCardTxnType the value of field
     * 'creditCardTxnType'.
     */
    public void setCreditCardTxnType(
            final org.chocolate_milk.model.types.CreditCardTxnTypeType creditCardTxnType) {
        this._creditCardTxnType = creditCardTxnType;
    }

    /**
     * Sets the value of field 'expirationMonth'.
     * 
     * @param expirationMonth the value of field 'expirationMonth'.
     */
    public void setExpirationMonth(
            final long expirationMonth) {
        this._expirationMonth = expirationMonth;
        this._has_expirationMonth = true;
    }

    /**
     * Sets the value of field 'expirationYear'.
     * 
     * @param expirationYear the value of field 'expirationYear'.
     */
    public void setExpirationYear(
            final long expirationYear) {
        this._expirationYear = expirationYear;
        this._has_expirationYear = true;
    }

    /**
     * Sets the value of field 'nameOnCard'.
     * 
     * @param nameOnCard the value of field 'nameOnCard'.
     */
    public void setNameOnCard(
            final java.lang.String nameOnCard) {
        this._nameOnCard = nameOnCard;
    }

    /**
     * Sets the value of field 'transactionMode'.
     * 
     * @param transactionMode the value of field 'transactionMode'.
     */
    public void setTransactionMode(
            final org.chocolate_milk.model.types.TransactionModeType transactionMode) {
        this._transactionMode = transactionMode;
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
     * org.chocolate_milk.model.CreditCardTxnInputInfoMod
     */
    public static org.chocolate_milk.model.CreditCardTxnInputInfoMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardTxnInputInfoMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardTxnInputInfoMod.class, reader);
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
