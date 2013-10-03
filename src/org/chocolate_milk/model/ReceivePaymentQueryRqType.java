/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReceivePaymentQueryRqType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReceivePaymentQueryRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class ReceivePaymentQueryRqType implements java.io.Serializable {


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
    private org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeMetaDataType _metaData = org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeMetaDataType.fromValue("NoMetaData");

    /**
     * Field _iterator.
     */
    private org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeIteratorType _iterator;

    /**
     * Field _iteratorID.
     */
    private java.lang.String _iteratorID;

    /**
     * Field _txnQuery.
     */
    private org.chocolate_milk.model.TxnQuery _txnQuery;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReceivePaymentQueryRqType() {
        super();
        setMetaData(org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeMetaDataType.fromValue("NoMetaData"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'iterator'.
     * 
     * @return the value of field 'Iterator'.
     */
    public org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeIteratorType getIterator(
    ) {
        return this._iterator;
    }

    /**
     * Returns the value of field 'iteratorID'.
     * 
     * @return the value of field 'IteratorID'.
     */
    public java.lang.String getIteratorID(
    ) {
        return this._iteratorID;
    }

    /**
     * Returns the value of field 'metaData'.
     * 
     * @return the value of field 'MetaData'.
     */
    public org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeMetaDataType getMetaData(
    ) {
        return this._metaData;
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
     * Returns the value of field 'txnQuery'.
     * 
     * @return the value of field 'TxnQuery'.
     */
    public org.chocolate_milk.model.TxnQuery getTxnQuery(
    ) {
        return this._txnQuery;
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
     * Sets the value of field 'iterator'.
     * 
     * @param iterator the value of field 'iterator'.
     */
    public void setIterator(
            final org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeIteratorType iterator) {
        this._iterator = iterator;
    }

    /**
     * Sets the value of field 'iteratorID'.
     * 
     * @param iteratorID the value of field 'iteratorID'.
     */
    public void setIteratorID(
            final java.lang.String iteratorID) {
        this._iteratorID = iteratorID;
    }

    /**
     * Sets the value of field 'metaData'.
     * 
     * @param metaData the value of field 'metaData'.
     */
    public void setMetaData(
            final org.chocolate_milk.model.types.ReceivePaymentQueryRqTypeMetaDataType metaData) {
        this._metaData = metaData;
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
     * Sets the value of field 'txnQuery'.
     * 
     * @param txnQuery the value of field 'txnQuery'.
     */
    public void setTxnQuery(
            final org.chocolate_milk.model.TxnQuery txnQuery) {
        this._txnQuery = txnQuery;
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
