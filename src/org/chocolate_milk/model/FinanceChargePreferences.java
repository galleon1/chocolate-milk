/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: FinanceChargePreferences.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class FinanceChargePreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class FinanceChargePreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _annualInterestRate.
     */
    private java.lang.String _annualInterestRate;

    /**
     * Field _minFinanceCharge.
     */
    private java.lang.String _minFinanceCharge;

    /**
     * Field _gracePeriod.
     */
    private long _gracePeriod;

    /**
     * keeps track of state for field: _gracePeriod
     */
    private boolean _has_gracePeriod;

    /**
     * Field _financeChargeAccountRef.
     */
    private org.chocolate_milk.model.FinanceChargeAccountRef _financeChargeAccountRef;

    /**
     * Field _isAssessingForOverdueCharges.
     */
    private java.lang.String _isAssessingForOverdueCharges;

    /**
     * Field _calculateChargesFrom.
     */
    private org.chocolate_milk.model.types.CalculateChargesFromType _calculateChargesFrom;

    /**
     * Field _isMarkedToBePrinted.
     */
    private java.lang.String _isMarkedToBePrinted;


      //----------------/
     //- Constructors -/
    //----------------/

    public FinanceChargePreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteGracePeriod(
    ) {
        this._has_gracePeriod= false;
    }

    /**
     * Returns the value of field 'annualInterestRate'.
     * 
     * @return the value of field 'AnnualInterestRate'.
     */
    public java.lang.String getAnnualInterestRate(
    ) {
        return this._annualInterestRate;
    }

    /**
     * Returns the value of field 'calculateChargesFrom'.
     * 
     * @return the value of field 'CalculateChargesFrom'.
     */
    public org.chocolate_milk.model.types.CalculateChargesFromType getCalculateChargesFrom(
    ) {
        return this._calculateChargesFrom;
    }

    /**
     * Returns the value of field 'financeChargeAccountRef'.
     * 
     * @return the value of field 'FinanceChargeAccountRef'.
     */
    public org.chocolate_milk.model.FinanceChargeAccountRef getFinanceChargeAccountRef(
    ) {
        return this._financeChargeAccountRef;
    }

    /**
     * Returns the value of field 'gracePeriod'.
     * 
     * @return the value of field 'GracePeriod'.
     */
    public long getGracePeriod(
    ) {
        return this._gracePeriod;
    }

    /**
     * Returns the value of field 'isAssessingForOverdueCharges'.
     * 
     * @return the value of field 'IsAssessingForOverdueCharges'.
     */
    public java.lang.String getIsAssessingForOverdueCharges(
    ) {
        return this._isAssessingForOverdueCharges;
    }

    /**
     * Returns the value of field 'isMarkedToBePrinted'.
     * 
     * @return the value of field 'IsMarkedToBePrinted'.
     */
    public java.lang.String getIsMarkedToBePrinted(
    ) {
        return this._isMarkedToBePrinted;
    }

    /**
     * Returns the value of field 'minFinanceCharge'.
     * 
     * @return the value of field 'MinFinanceCharge'.
     */
    public java.lang.String getMinFinanceCharge(
    ) {
        return this._minFinanceCharge;
    }

    /**
     * Method hasGracePeriod.
     * 
     * @return true if at least one GracePeriod has been added
     */
    public boolean hasGracePeriod(
    ) {
        return this._has_gracePeriod;
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
     * Sets the value of field 'annualInterestRate'.
     * 
     * @param annualInterestRate the value of field
     * 'annualInterestRate'.
     */
    public void setAnnualInterestRate(
            final java.lang.String annualInterestRate) {
        this._annualInterestRate = annualInterestRate;
    }

    /**
     * Sets the value of field 'calculateChargesFrom'.
     * 
     * @param calculateChargesFrom the value of field
     * 'calculateChargesFrom'.
     */
    public void setCalculateChargesFrom(
            final org.chocolate_milk.model.types.CalculateChargesFromType calculateChargesFrom) {
        this._calculateChargesFrom = calculateChargesFrom;
    }

    /**
     * Sets the value of field 'financeChargeAccountRef'.
     * 
     * @param financeChargeAccountRef the value of field
     * 'financeChargeAccountRef'.
     */
    public void setFinanceChargeAccountRef(
            final org.chocolate_milk.model.FinanceChargeAccountRef financeChargeAccountRef) {
        this._financeChargeAccountRef = financeChargeAccountRef;
    }

    /**
     * Sets the value of field 'gracePeriod'.
     * 
     * @param gracePeriod the value of field 'gracePeriod'.
     */
    public void setGracePeriod(
            final long gracePeriod) {
        this._gracePeriod = gracePeriod;
        this._has_gracePeriod = true;
    }

    /**
     * Sets the value of field 'isAssessingForOverdueCharges'.
     * 
     * @param isAssessingForOverdueCharges the value of field
     * 'isAssessingForOverdueCharges'.
     */
    public void setIsAssessingForOverdueCharges(
            final java.lang.String isAssessingForOverdueCharges) {
        this._isAssessingForOverdueCharges = isAssessingForOverdueCharges;
    }

    /**
     * Sets the value of field 'isMarkedToBePrinted'.
     * 
     * @param isMarkedToBePrinted the value of field
     * 'isMarkedToBePrinted'.
     */
    public void setIsMarkedToBePrinted(
            final java.lang.String isMarkedToBePrinted) {
        this._isMarkedToBePrinted = isMarkedToBePrinted;
    }

    /**
     * Sets the value of field 'minFinanceCharge'.
     * 
     * @param minFinanceCharge the value of field 'minFinanceCharge'
     */
    public void setMinFinanceCharge(
            final java.lang.String minFinanceCharge) {
        this._minFinanceCharge = minFinanceCharge;
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
     * org.chocolate_milk.model.FinanceChargePreferences
     */
    public static org.chocolate_milk.model.FinanceChargePreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.FinanceChargePreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.FinanceChargePreferences.class, reader);
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
