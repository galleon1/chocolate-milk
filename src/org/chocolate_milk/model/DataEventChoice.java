/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataEventChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataEventChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DataEventChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listEvent.
     */
    private org.chocolate_milk.model.ListEvent _listEvent;

    /**
     * Field _txnEvent.
     */
    private org.chocolate_milk.model.TxnEvent _txnEvent;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataEventChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listEvent'.
     * 
     * @return the value of field 'ListEvent'.
     */
    public org.chocolate_milk.model.ListEvent getListEvent(
    ) {
        return this._listEvent;
    }

    /**
     * Returns the value of field 'txnEvent'.
     * 
     * @return the value of field 'TxnEvent'.
     */
    public org.chocolate_milk.model.TxnEvent getTxnEvent(
    ) {
        return this._txnEvent;
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
     * Sets the value of field 'listEvent'.
     * 
     * @param listEvent the value of field 'listEvent'.
     */
    public void setListEvent(
            final org.chocolate_milk.model.ListEvent listEvent) {
        this._listEvent = listEvent;
    }

    /**
     * Sets the value of field 'txnEvent'.
     * 
     * @param txnEvent the value of field 'txnEvent'.
     */
    public void setTxnEvent(
            final org.chocolate_milk.model.TxnEvent txnEvent) {
        this._txnEvent = txnEvent;
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
     * org.chocolate_milk.model.DataEventChoice
     */
    public static org.chocolate_milk.model.DataEventChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataEventChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataEventChoice.class, reader);
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
