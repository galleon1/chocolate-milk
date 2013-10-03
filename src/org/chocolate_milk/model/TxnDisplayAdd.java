/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnDisplayAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnDisplayAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnDisplayAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnDisplayAddType.
     */
    private org.chocolate_milk.model.types.TxnDisplayAddTypeType _txnDisplayAddType;

    /**
     * Field _entityRef.
     */
    private org.chocolate_milk.model.EntityRef _entityRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnDisplayAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'entityRef'.
     * 
     * @return the value of field 'EntityRef'.
     */
    public org.chocolate_milk.model.EntityRef getEntityRef(
    ) {
        return this._entityRef;
    }

    /**
     * Returns the value of field 'txnDisplayAddType'.
     * 
     * @return the value of field 'TxnDisplayAddType'.
     */
    public org.chocolate_milk.model.types.TxnDisplayAddTypeType getTxnDisplayAddType(
    ) {
        return this._txnDisplayAddType;
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
     * Sets the value of field 'entityRef'.
     * 
     * @param entityRef the value of field 'entityRef'.
     */
    public void setEntityRef(
            final org.chocolate_milk.model.EntityRef entityRef) {
        this._entityRef = entityRef;
    }

    /**
     * Sets the value of field 'txnDisplayAddType'.
     * 
     * @param txnDisplayAddType the value of field
     * 'txnDisplayAddType'.
     */
    public void setTxnDisplayAddType(
            final org.chocolate_milk.model.types.TxnDisplayAddTypeType txnDisplayAddType) {
        this._txnDisplayAddType = txnDisplayAddType;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.TxnDisplayAd
     */
    public static org.chocolate_milk.model.TxnDisplayAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnDisplayAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnDisplayAdd.class, reader);
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
