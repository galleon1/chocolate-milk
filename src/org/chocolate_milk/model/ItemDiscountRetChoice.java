/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemDiscountRetChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemDiscountRetChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemDiscountRetChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _discountRate.
     */
    private java.lang.String _discountRate;

    /**
     * Field _discountRatePercent.
     */
    private java.lang.String _discountRatePercent;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemDiscountRetChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'discountRate'.
     * 
     * @return the value of field 'DiscountRate'.
     */
    public java.lang.String getDiscountRate(
    ) {
        return this._discountRate;
    }

    /**
     * Returns the value of field 'discountRatePercent'.
     * 
     * @return the value of field 'DiscountRatePercent'.
     */
    public java.lang.String getDiscountRatePercent(
    ) {
        return this._discountRatePercent;
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
     * Sets the value of field 'discountRate'.
     * 
     * @param discountRate the value of field 'discountRate'.
     */
    public void setDiscountRate(
            final java.lang.String discountRate) {
        this._discountRate = discountRate;
    }

    /**
     * Sets the value of field 'discountRatePercent'.
     * 
     * @param discountRatePercent the value of field
     * 'discountRatePercent'.
     */
    public void setDiscountRatePercent(
            final java.lang.String discountRatePercent) {
        this._discountRatePercent = discountRatePercent;
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
     * org.chocolate_milk.model.ItemDiscountRetChoice
     */
    public static org.chocolate_milk.model.ItemDiscountRetChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemDiscountRetChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemDiscountRetChoice.class, reader);
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
