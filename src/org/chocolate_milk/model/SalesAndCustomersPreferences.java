/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesAndCustomersPreferences.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesAndCustomersPreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesAndCustomersPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultShipMethodRef.
     */
    private org.chocolate_milk.model.DefaultShipMethodRef _defaultShipMethodRef;

    /**
     * Field _defaultFOB.
     */
    private java.lang.String _defaultFOB;

    /**
     * Field _defaultMarkup.
     */
    private java.lang.String _defaultMarkup;

    /**
     * Field _isTrackingReimbursedExpensesAsIncome.
     */
    private java.lang.String _isTrackingReimbursedExpensesAsIncome;

    /**
     * Field _isAutoApplyingPayments.
     */
    private java.lang.String _isAutoApplyingPayments;

    /**
     * Field _priceLevels.
     */
    private org.chocolate_milk.model.PriceLevels _priceLevels;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesAndCustomersPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'defaultFOB'.
     * 
     * @return the value of field 'DefaultFOB'.
     */
    public java.lang.String getDefaultFOB(
    ) {
        return this._defaultFOB;
    }

    /**
     * Returns the value of field 'defaultMarkup'.
     * 
     * @return the value of field 'DefaultMarkup'.
     */
    public java.lang.String getDefaultMarkup(
    ) {
        return this._defaultMarkup;
    }

    /**
     * Returns the value of field 'defaultShipMethodRef'.
     * 
     * @return the value of field 'DefaultShipMethodRef'.
     */
    public org.chocolate_milk.model.DefaultShipMethodRef getDefaultShipMethodRef(
    ) {
        return this._defaultShipMethodRef;
    }

    /**
     * Returns the value of field 'isAutoApplyingPayments'.
     * 
     * @return the value of field 'IsAutoApplyingPayments'.
     */
    public java.lang.String getIsAutoApplyingPayments(
    ) {
        return this._isAutoApplyingPayments;
    }

    /**
     * Returns the value of field
     * 'isTrackingReimbursedExpensesAsIncome'.
     * 
     * @return the value of field
     * 'IsTrackingReimbursedExpensesAsIncome'.
     */
    public java.lang.String getIsTrackingReimbursedExpensesAsIncome(
    ) {
        return this._isTrackingReimbursedExpensesAsIncome;
    }

    /**
     * Returns the value of field 'priceLevels'.
     * 
     * @return the value of field 'PriceLevels'.
     */
    public org.chocolate_milk.model.PriceLevels getPriceLevels(
    ) {
        return this._priceLevels;
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
     * Sets the value of field 'defaultFOB'.
     * 
     * @param defaultFOB the value of field 'defaultFOB'.
     */
    public void setDefaultFOB(
            final java.lang.String defaultFOB) {
        this._defaultFOB = defaultFOB;
    }

    /**
     * Sets the value of field 'defaultMarkup'.
     * 
     * @param defaultMarkup the value of field 'defaultMarkup'.
     */
    public void setDefaultMarkup(
            final java.lang.String defaultMarkup) {
        this._defaultMarkup = defaultMarkup;
    }

    /**
     * Sets the value of field 'defaultShipMethodRef'.
     * 
     * @param defaultShipMethodRef the value of field
     * 'defaultShipMethodRef'.
     */
    public void setDefaultShipMethodRef(
            final org.chocolate_milk.model.DefaultShipMethodRef defaultShipMethodRef) {
        this._defaultShipMethodRef = defaultShipMethodRef;
    }

    /**
     * Sets the value of field 'isAutoApplyingPayments'.
     * 
     * @param isAutoApplyingPayments the value of field
     * 'isAutoApplyingPayments'.
     */
    public void setIsAutoApplyingPayments(
            final java.lang.String isAutoApplyingPayments) {
        this._isAutoApplyingPayments = isAutoApplyingPayments;
    }

    /**
     * Sets the value of field
     * 'isTrackingReimbursedExpensesAsIncome'.
     * 
     * @param isTrackingReimbursedExpensesAsIncome the value of
     * field 'isTrackingReimbursedExpensesAsIncome'.
     */
    public void setIsTrackingReimbursedExpensesAsIncome(
            final java.lang.String isTrackingReimbursedExpensesAsIncome) {
        this._isTrackingReimbursedExpensesAsIncome = isTrackingReimbursedExpensesAsIncome;
    }

    /**
     * Sets the value of field 'priceLevels'.
     * 
     * @param priceLevels the value of field 'priceLevels'.
     */
    public void setPriceLevels(
            final org.chocolate_milk.model.PriceLevels priceLevels) {
        this._priceLevels = priceLevels;
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
     * org.chocolate_milk.model.SalesAndCustomersPreferences
     */
    public static org.chocolate_milk.model.SalesAndCustomersPreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesAndCustomersPreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesAndCustomersPreferences.class, reader);
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
