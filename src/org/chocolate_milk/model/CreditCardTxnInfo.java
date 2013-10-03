/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardTxnInfo.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardTxnInfo.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class CreditCardTxnInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _creditCardTxnInputInfo.
     */
    private org.chocolate_milk.model.CreditCardTxnInputInfo _creditCardTxnInputInfo;

    /**
     * Field _creditCardTxnResultInfo.
     */
    private org.chocolate_milk.model.CreditCardTxnResultInfo _creditCardTxnResultInfo;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardTxnInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'creditCardTxnInputInfo'.
     * 
     * @return the value of field 'CreditCardTxnInputInfo'.
     */
    public org.chocolate_milk.model.CreditCardTxnInputInfo getCreditCardTxnInputInfo(
    ) {
        return this._creditCardTxnInputInfo;
    }

    /**
     * Returns the value of field 'creditCardTxnResultInfo'.
     * 
     * @return the value of field 'CreditCardTxnResultInfo'.
     */
    public org.chocolate_milk.model.CreditCardTxnResultInfo getCreditCardTxnResultInfo(
    ) {
        return this._creditCardTxnResultInfo;
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
     * Sets the value of field 'creditCardTxnInputInfo'.
     * 
     * @param creditCardTxnInputInfo the value of field
     * 'creditCardTxnInputInfo'.
     */
    public void setCreditCardTxnInputInfo(
            final org.chocolate_milk.model.CreditCardTxnInputInfo creditCardTxnInputInfo) {
        this._creditCardTxnInputInfo = creditCardTxnInputInfo;
    }

    /**
     * Sets the value of field 'creditCardTxnResultInfo'.
     * 
     * @param creditCardTxnResultInfo the value of field
     * 'creditCardTxnResultInfo'.
     */
    public void setCreditCardTxnResultInfo(
            final org.chocolate_milk.model.CreditCardTxnResultInfo creditCardTxnResultInfo) {
        this._creditCardTxnResultInfo = creditCardTxnResultInfo;
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
     * org.chocolate_milk.model.CreditCardTxnInfo
     */
    public static org.chocolate_milk.model.CreditCardTxnInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardTxnInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardTxnInfo.class, reader);
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
