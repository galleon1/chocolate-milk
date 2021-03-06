/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PaymentMethodQueryRqType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PaymentMethodQueryRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class PaymentMethodQueryRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _metaData.
     */
    private org.chocolate_milk.model.types.PaymentMethodQueryRqTypeMetaDataType _metaData = org.chocolate_milk.model.types.PaymentMethodQueryRqTypeMetaDataType.fromValue("NoMetaData");

    /**
     * Field _paymentMethodListQuery.
     */
    private org.chocolate_milk.model.PaymentMethodListQuery _paymentMethodListQuery;


      //----------------/
     //- Constructors -/
    //----------------/

    public PaymentMethodQueryRqType() {
        super();
        setMetaData(org.chocolate_milk.model.types.PaymentMethodQueryRqTypeMetaDataType.fromValue("NoMetaData"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'metaData'.
     * 
     * @return the value of field 'MetaData'.
     */
    public org.chocolate_milk.model.types.PaymentMethodQueryRqTypeMetaDataType getMetaData(
    ) {
        return this._metaData;
    }

    /**
     * Returns the value of field 'paymentMethodListQuery'.
     * 
     * @return the value of field 'PaymentMethodListQuery'.
     */
    public org.chocolate_milk.model.PaymentMethodListQuery getPaymentMethodListQuery(
    ) {
        return this._paymentMethodListQuery;
    }

    /**
     * Returns the value of field 'requestID'.
     * 
     * @return the value of field 'RequestID'.
     */
    public java.lang.String getRequestID(
    ) {
        return this._requestID;
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
     * Sets the value of field 'metaData'.
     * 
     * @param metaData the value of field 'metaData'.
     */
    public void setMetaData(
            final org.chocolate_milk.model.types.PaymentMethodQueryRqTypeMetaDataType metaData) {
        this._metaData = metaData;
    }

    /**
     * Sets the value of field 'paymentMethodListQuery'.
     * 
     * @param paymentMethodListQuery the value of field
     * 'paymentMethodListQuery'.
     */
    public void setPaymentMethodListQuery(
            final org.chocolate_milk.model.PaymentMethodListQuery paymentMethodListQuery) {
        this._paymentMethodListQuery = paymentMethodListQuery;
    }

    /**
     * Sets the value of field 'requestID'.
     * 
     * @param requestID the value of field 'requestID'.
     */
    public void setRequestID(
            final java.lang.String requestID) {
        this._requestID = requestID;
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
