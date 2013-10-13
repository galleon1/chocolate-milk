/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PayrollLastPeriodRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PayrollLastPeriodRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PayrollLastPeriodRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _periodStartDate.
     */
    private java.lang.String _periodStartDate;

    /**
     * Field _periodEndDate.
     */
    private java.lang.String _periodEndDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayrollLastPeriodRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'periodEndDate'.
     * 
     * @return the value of field 'PeriodEndDate'.
     */
    public java.lang.String getPeriodEndDate(
    ) {
        return this._periodEndDate;
    }

    /**
     * Returns the value of field 'periodStartDate'.
     * 
     * @return the value of field 'PeriodStartDate'.
     */
    public java.lang.String getPeriodStartDate(
    ) {
        return this._periodStartDate;
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
     * Sets the value of field 'periodEndDate'.
     * 
     * @param periodEndDate the value of field 'periodEndDate'.
     */
    public void setPeriodEndDate(
            final java.lang.String periodEndDate) {
        this._periodEndDate = periodEndDate;
    }

    /**
     * Sets the value of field 'periodStartDate'.
     * 
     * @param periodStartDate the value of field 'periodStartDate'.
     */
    public void setPeriodStartDate(
            final java.lang.String periodStartDate) {
        this._periodStartDate = periodStartDate;
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
     * org.chocolate_milk.model.PayrollLastPeriodRet
     */
    public static org.chocolate_milk.model.PayrollLastPeriodRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PayrollLastPeriodRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PayrollLastPeriodRet.class, reader);
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
