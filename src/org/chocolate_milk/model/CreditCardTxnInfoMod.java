/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardTxnInfoMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardTxnInfoMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CreditCardTxnInfoMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditCardTxnInputInfoMod.
     */
    private org.chocolate_milk.model.CreditCardTxnInputInfoMod _creditCardTxnInputInfoMod;

    /**
     * Field _creditCardTxnResultInfoMod.
     */
    private org.chocolate_milk.model.CreditCardTxnResultInfoMod _creditCardTxnResultInfoMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardTxnInfoMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'creditCardTxnInputInfoMod'.
     * 
     * @return the value of field 'CreditCardTxnInputInfoMod'.
     */
    public org.chocolate_milk.model.CreditCardTxnInputInfoMod getCreditCardTxnInputInfoMod(
    ) {
        return this._creditCardTxnInputInfoMod;
    }

    /**
     * Returns the value of field 'creditCardTxnResultInfoMod'.
     * 
     * @return the value of field 'CreditCardTxnResultInfoMod'.
     */
    public org.chocolate_milk.model.CreditCardTxnResultInfoMod getCreditCardTxnResultInfoMod(
    ) {
        return this._creditCardTxnResultInfoMod;
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
     * Sets the value of field 'creditCardTxnInputInfoMod'.
     * 
     * @param creditCardTxnInputInfoMod the value of field
     * 'creditCardTxnInputInfoMod'.
     */
    public void setCreditCardTxnInputInfoMod(
            final org.chocolate_milk.model.CreditCardTxnInputInfoMod creditCardTxnInputInfoMod) {
        this._creditCardTxnInputInfoMod = creditCardTxnInputInfoMod;
    }

    /**
     * Sets the value of field 'creditCardTxnResultInfoMod'.
     * 
     * @param creditCardTxnResultInfoMod the value of field
     * 'creditCardTxnResultInfoMod'.
     */
    public void setCreditCardTxnResultInfoMod(
            final org.chocolate_milk.model.CreditCardTxnResultInfoMod creditCardTxnResultInfoMod) {
        this._creditCardTxnResultInfoMod = creditCardTxnResultInfoMod;
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
     * org.chocolate_milk.model.CreditCardTxnInfoMod
     */
    public static org.chocolate_milk.model.CreditCardTxnInfoMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardTxnInfoMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardTxnInfoMod.class, reader);
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
