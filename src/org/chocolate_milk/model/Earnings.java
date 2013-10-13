/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Earnings.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Earnings.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class Earnings implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _payrollItemWageRef.
     */
    private org.chocolate_milk.model.PayrollItemWageRef _payrollItemWageRef;

    /**
     * Field _earningsChoice.
     */
    private org.chocolate_milk.model.EarningsChoice _earningsChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public Earnings() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'earningsChoice'.
     * 
     * @return the value of field 'EarningsChoice'.
     */
    public org.chocolate_milk.model.EarningsChoice getEarningsChoice(
    ) {
        return this._earningsChoice;
    }

    /**
     * Returns the value of field 'payrollItemWageRef'.
     * 
     * @return the value of field 'PayrollItemWageRef'.
     */
    public org.chocolate_milk.model.PayrollItemWageRef getPayrollItemWageRef(
    ) {
        return this._payrollItemWageRef;
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
     * Sets the value of field 'earningsChoice'.
     * 
     * @param earningsChoice the value of field 'earningsChoice'.
     */
    public void setEarningsChoice(
            final org.chocolate_milk.model.EarningsChoice earningsChoice) {
        this._earningsChoice = earningsChoice;
    }

    /**
     * Sets the value of field 'payrollItemWageRef'.
     * 
     * @param payrollItemWageRef the value of field
     * 'payrollItemWageRef'.
     */
    public void setPayrollItemWageRef(
            final org.chocolate_milk.model.PayrollItemWageRef payrollItemWageRef) {
        this._payrollItemWageRef = payrollItemWageRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.Earnings
     */
    public static org.chocolate_milk.model.Earnings unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.Earnings) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.Earnings.class, reader);
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
