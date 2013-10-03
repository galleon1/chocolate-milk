/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PurchasesAndVendorsPreferences.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PurchasesAndVendorsPreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PurchasesAndVendorsPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isUsingInventory.
     */
    private java.lang.String _isUsingInventory;

    /**
     * Field _daysBillsAreDue.
     */
    private long _daysBillsAreDue;

    /**
     * keeps track of state for field: _daysBillsAreDue
     */
    private boolean _has_daysBillsAreDue;

    /**
     * Field _isAutomaticallyUsingDiscounts.
     */
    private java.lang.String _isAutomaticallyUsingDiscounts;

    /**
     * Field _defaultDiscountAccountRef.
     */
    private org.chocolate_milk.model.DefaultDiscountAccountRef _defaultDiscountAccountRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public PurchasesAndVendorsPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDaysBillsAreDue(
    ) {
        this._has_daysBillsAreDue= false;
    }

    /**
     * Returns the value of field 'daysBillsAreDue'.
     * 
     * @return the value of field 'DaysBillsAreDue'.
     */
    public long getDaysBillsAreDue(
    ) {
        return this._daysBillsAreDue;
    }

    /**
     * Returns the value of field 'defaultDiscountAccountRef'.
     * 
     * @return the value of field 'DefaultDiscountAccountRef'.
     */
    public org.chocolate_milk.model.DefaultDiscountAccountRef getDefaultDiscountAccountRef(
    ) {
        return this._defaultDiscountAccountRef;
    }

    /**
     * Returns the value of field 'isAutomaticallyUsingDiscounts'.
     * 
     * @return the value of field 'IsAutomaticallyUsingDiscounts'.
     */
    public java.lang.String getIsAutomaticallyUsingDiscounts(
    ) {
        return this._isAutomaticallyUsingDiscounts;
    }

    /**
     * Returns the value of field 'isUsingInventory'.
     * 
     * @return the value of field 'IsUsingInventory'.
     */
    public java.lang.String getIsUsingInventory(
    ) {
        return this._isUsingInventory;
    }

    /**
     * Method hasDaysBillsAreDue.
     * 
     * @return true if at least one DaysBillsAreDue has been added
     */
    public boolean hasDaysBillsAreDue(
    ) {
        return this._has_daysBillsAreDue;
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
     * Sets the value of field 'daysBillsAreDue'.
     * 
     * @param daysBillsAreDue the value of field 'daysBillsAreDue'.
     */
    public void setDaysBillsAreDue(
            final long daysBillsAreDue) {
        this._daysBillsAreDue = daysBillsAreDue;
        this._has_daysBillsAreDue = true;
    }

    /**
     * Sets the value of field 'defaultDiscountAccountRef'.
     * 
     * @param defaultDiscountAccountRef the value of field
     * 'defaultDiscountAccountRef'.
     */
    public void setDefaultDiscountAccountRef(
            final org.chocolate_milk.model.DefaultDiscountAccountRef defaultDiscountAccountRef) {
        this._defaultDiscountAccountRef = defaultDiscountAccountRef;
    }

    /**
     * Sets the value of field 'isAutomaticallyUsingDiscounts'.
     * 
     * @param isAutomaticallyUsingDiscounts the value of field
     * 'isAutomaticallyUsingDiscounts'.
     */
    public void setIsAutomaticallyUsingDiscounts(
            final java.lang.String isAutomaticallyUsingDiscounts) {
        this._isAutomaticallyUsingDiscounts = isAutomaticallyUsingDiscounts;
    }

    /**
     * Sets the value of field 'isUsingInventory'.
     * 
     * @param isUsingInventory the value of field 'isUsingInventory'
     */
    public void setIsUsingInventory(
            final java.lang.String isUsingInventory) {
        this._isUsingInventory = isUsingInventory;
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
     * org.chocolate_milk.model.PurchasesAndVendorsPreferences
     */
    public static org.chocolate_milk.model.PurchasesAndVendorsPreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PurchasesAndVendorsPreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PurchasesAndVendorsPreferences.class, reader);
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
