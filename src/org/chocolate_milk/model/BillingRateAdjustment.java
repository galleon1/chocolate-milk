/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillingRateAdjustment.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillingRateAdjustment.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BillingRateAdjustment implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _adjustPercentage.
     */
    private java.lang.String _adjustPercentage;

    /**
     * Field _adjustBillingRateRelativeTo.
     */
    private org.chocolate_milk.model.types.AdjustBillingRateRelativeToType _adjustBillingRateRelativeTo;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillingRateAdjustment() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'adjustBillingRateRelativeTo'.
     * 
     * @return the value of field 'AdjustBillingRateRelativeTo'.
     */
    public org.chocolate_milk.model.types.AdjustBillingRateRelativeToType getAdjustBillingRateRelativeTo(
    ) {
        return this._adjustBillingRateRelativeTo;
    }

    /**
     * Returns the value of field 'adjustPercentage'.
     * 
     * @return the value of field 'AdjustPercentage'.
     */
    public java.lang.String getAdjustPercentage(
    ) {
        return this._adjustPercentage;
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
     * Sets the value of field 'adjustBillingRateRelativeTo'.
     * 
     * @param adjustBillingRateRelativeTo the value of field
     * 'adjustBillingRateRelativeTo'.
     */
    public void setAdjustBillingRateRelativeTo(
            final org.chocolate_milk.model.types.AdjustBillingRateRelativeToType adjustBillingRateRelativeTo) {
        this._adjustBillingRateRelativeTo = adjustBillingRateRelativeTo;
    }

    /**
     * Sets the value of field 'adjustPercentage'.
     * 
     * @param adjustPercentage the value of field 'adjustPercentage'
     */
    public void setAdjustPercentage(
            final java.lang.String adjustPercentage) {
        this._adjustPercentage = adjustPercentage;
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
     * org.chocolate_milk.model.BillingRateAdjustment
     */
    public static org.chocolate_milk.model.BillingRateAdjustment unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillingRateAdjustment) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillingRateAdjustment.class, reader);
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
