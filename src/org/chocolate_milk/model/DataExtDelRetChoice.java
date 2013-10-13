/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtDelRetChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtDelRetChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DataExtDelRetChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listDataExt.
     */
    private org.chocolate_milk.model.ListDataExt _listDataExt;

    /**
     * Field _txnDataExt.
     */
    private org.chocolate_milk.model.TxnDataExt _txnDataExt;

    /**
     * Field _otherDataExtType.
     */
    private org.chocolate_milk.model.types.OtherDataExtTypeType _otherDataExtType;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtDelRetChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listDataExt'.
     * 
     * @return the value of field 'ListDataExt'.
     */
    public org.chocolate_milk.model.ListDataExt getListDataExt(
    ) {
        return this._listDataExt;
    }

    /**
     * Returns the value of field 'otherDataExtType'.
     * 
     * @return the value of field 'OtherDataExtType'.
     */
    public org.chocolate_milk.model.types.OtherDataExtTypeType getOtherDataExtType(
    ) {
        return this._otherDataExtType;
    }

    /**
     * Returns the value of field 'txnDataExt'.
     * 
     * @return the value of field 'TxnDataExt'.
     */
    public org.chocolate_milk.model.TxnDataExt getTxnDataExt(
    ) {
        return this._txnDataExt;
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
     * Sets the value of field 'listDataExt'.
     * 
     * @param listDataExt the value of field 'listDataExt'.
     */
    public void setListDataExt(
            final org.chocolate_milk.model.ListDataExt listDataExt) {
        this._listDataExt = listDataExt;
    }

    /**
     * Sets the value of field 'otherDataExtType'.
     * 
     * @param otherDataExtType the value of field 'otherDataExtType'
     */
    public void setOtherDataExtType(
            final org.chocolate_milk.model.types.OtherDataExtTypeType otherDataExtType) {
        this._otherDataExtType = otherDataExtType;
    }

    /**
     * Sets the value of field 'txnDataExt'.
     * 
     * @param txnDataExt the value of field 'txnDataExt'.
     */
    public void setTxnDataExt(
            final org.chocolate_milk.model.TxnDataExt txnDataExt) {
        this._txnDataExt = txnDataExt;
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
     * org.chocolate_milk.model.DataExtDelRetChoice
     */
    public static org.chocolate_milk.model.DataExtDelRetChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataExtDelRetChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataExtDelRetChoice.class, reader);
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
