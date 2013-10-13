/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DataExtAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listDataExt.
     */
    private org.chocolate_milk.model.ListDataExt _listDataExt;

    /**
     * Field _txnDataExtWithMacro.
     */
    private org.chocolate_milk.model.TxnDataExtWithMacro _txnDataExtWithMacro;

    /**
     * Field _otherDataExtType.
     */
    private org.chocolate_milk.model.types.OtherDataExtTypeType _otherDataExtType;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtAddChoice() {
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
     * Returns the value of field 'txnDataExtWithMacro'.
     * 
     * @return the value of field 'TxnDataExtWithMacro'.
     */
    public org.chocolate_milk.model.TxnDataExtWithMacro getTxnDataExtWithMacro(
    ) {
        return this._txnDataExtWithMacro;
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
     * Sets the value of field 'txnDataExtWithMacro'.
     * 
     * @param txnDataExtWithMacro the value of field
     * 'txnDataExtWithMacro'.
     */
    public void setTxnDataExtWithMacro(
            final org.chocolate_milk.model.TxnDataExtWithMacro txnDataExtWithMacro) {
        this._txnDataExtWithMacro = txnDataExtWithMacro;
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
     * org.chocolate_milk.model.DataExtAddChoice
     */
    public static org.chocolate_milk.model.DataExtAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataExtAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataExtAddChoice.class, reader);
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
