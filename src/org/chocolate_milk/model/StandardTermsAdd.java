/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: StandardTermsAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class StandardTermsAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class StandardTermsAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _stdDueDays.
     */
    private long _stdDueDays;

    /**
     * keeps track of state for field: _stdDueDays
     */
    private boolean _has_stdDueDays;

    /**
     * Field _stdDiscountDays.
     */
    private long _stdDiscountDays;

    /**
     * keeps track of state for field: _stdDiscountDays
     */
    private boolean _has_stdDiscountDays;

    /**
     * Field _discountPct.
     */
    private java.lang.String _discountPct;


      //----------------/
     //- Constructors -/
    //----------------/

    public StandardTermsAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteStdDiscountDays(
    ) {
        this._has_stdDiscountDays= false;
    }

    /**
     */
    public void deleteStdDueDays(
    ) {
        this._has_stdDueDays= false;
    }

    /**
     * Returns the value of field 'discountPct'.
     * 
     * @return the value of field 'DiscountPct'.
     */
    public java.lang.String getDiscountPct(
    ) {
        return this._discountPct;
    }

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'stdDiscountDays'.
     * 
     * @return the value of field 'StdDiscountDays'.
     */
    public long getStdDiscountDays(
    ) {
        return this._stdDiscountDays;
    }

    /**
     * Returns the value of field 'stdDueDays'.
     * 
     * @return the value of field 'StdDueDays'.
     */
    public long getStdDueDays(
    ) {
        return this._stdDueDays;
    }

    /**
     * Method hasStdDiscountDays.
     * 
     * @return true if at least one StdDiscountDays has been added
     */
    public boolean hasStdDiscountDays(
    ) {
        return this._has_stdDiscountDays;
    }

    /**
     * Method hasStdDueDays.
     * 
     * @return true if at least one StdDueDays has been added
     */
    public boolean hasStdDueDays(
    ) {
        return this._has_stdDueDays;
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
     * Sets the value of field 'discountPct'.
     * 
     * @param discountPct the value of field 'discountPct'.
     */
    public void setDiscountPct(
            final java.lang.String discountPct) {
        this._discountPct = discountPct;
    }

    /**
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'stdDiscountDays'.
     * 
     * @param stdDiscountDays the value of field 'stdDiscountDays'.
     */
    public void setStdDiscountDays(
            final long stdDiscountDays) {
        this._stdDiscountDays = stdDiscountDays;
        this._has_stdDiscountDays = true;
    }

    /**
     * Sets the value of field 'stdDueDays'.
     * 
     * @param stdDueDays the value of field 'stdDueDays'.
     */
    public void setStdDueDays(
            final long stdDueDays) {
        this._stdDueDays = stdDueDays;
        this._has_stdDueDays = true;
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
     * org.chocolate_milk.model.StandardTermsAdd
     */
    public static org.chocolate_milk.model.StandardTermsAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.StandardTermsAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.StandardTermsAdd.class, reader);
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
