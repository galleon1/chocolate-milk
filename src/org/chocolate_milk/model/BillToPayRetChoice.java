/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillToPayRetChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillToPayRetChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BillToPayRetChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _billToPay.
     */
    private org.chocolate_milk.model.BillToPay _billToPay;

    /**
     * Field _creditToApply.
     */
    private org.chocolate_milk.model.CreditToApply _creditToApply;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillToPayRetChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'billToPay'.
     * 
     * @return the value of field 'BillToPay'.
     */
    public org.chocolate_milk.model.BillToPay getBillToPay(
    ) {
        return this._billToPay;
    }

    /**
     * Returns the value of field 'creditToApply'.
     * 
     * @return the value of field 'CreditToApply'.
     */
    public org.chocolate_milk.model.CreditToApply getCreditToApply(
    ) {
        return this._creditToApply;
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
     * Sets the value of field 'billToPay'.
     * 
     * @param billToPay the value of field 'billToPay'.
     */
    public void setBillToPay(
            final org.chocolate_milk.model.BillToPay billToPay) {
        this._billToPay = billToPay;
    }

    /**
     * Sets the value of field 'creditToApply'.
     * 
     * @param creditToApply the value of field 'creditToApply'.
     */
    public void setCreditToApply(
            final org.chocolate_milk.model.CreditToApply creditToApply) {
        this._creditToApply = creditToApply;
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
     * org.chocolate_milk.model.BillToPayRetChoice
     */
    public static org.chocolate_milk.model.BillToPayRetChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillToPayRetChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillToPayRetChoice.class, reader);
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
