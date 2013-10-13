/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnEvent.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnEvent.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnEvent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnEventType.
     */
    private org.chocolate_milk.model.types.TxnEventTypeType _txnEventType;

    /**
     * Field _txnEventOperation.
     */
    private org.chocolate_milk.model.types.TxnEventOperationType _txnEventOperation;

    /**
     * Field _txnID.
     */
    private java.lang.String _txnID;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnEvent() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Returns the value of field 'txnEventOperation'.
     * 
     * @return the value of field 'TxnEventOperation'.
     */
    public org.chocolate_milk.model.types.TxnEventOperationType getTxnEventOperation(
    ) {
        return this._txnEventOperation;
    }

    /**
     * Returns the value of field 'txnEventType'.
     * 
     * @return the value of field 'TxnEventType'.
     */
    public org.chocolate_milk.model.types.TxnEventTypeType getTxnEventType(
    ) {
        return this._txnEventType;
    }

    /**
     * Returns the value of field 'txnID'.
     * 
     * @return the value of field 'TxnID'.
     */
    public java.lang.String getTxnID(
    ) {
        return this._txnID;
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
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * Sets the value of field 'txnEventOperation'.
     * 
     * @param txnEventOperation the value of field
     * 'txnEventOperation'.
     */
    public void setTxnEventOperation(
            final org.chocolate_milk.model.types.TxnEventOperationType txnEventOperation) {
        this._txnEventOperation = txnEventOperation;
    }

    /**
     * Sets the value of field 'txnEventType'.
     * 
     * @param txnEventType the value of field 'txnEventType'.
     */
    public void setTxnEventType(
            final org.chocolate_milk.model.types.TxnEventTypeType txnEventType) {
        this._txnEventType = txnEventType;
    }

    /**
     * Sets the value of field 'txnID'.
     * 
     * @param txnID the value of field 'txnID'.
     */
    public void setTxnID(
            final java.lang.String txnID) {
        this._txnID = txnID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.TxnEvent
     */
    public static org.chocolate_milk.model.TxnEvent unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnEvent) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnEvent.class, reader);
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
