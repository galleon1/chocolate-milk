/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListMerge.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListMerge.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ListMerge implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listMergeType.
     */
    private org.chocolate_milk.model.types.ListMergeTypeType _listMergeType;

    /**
     * Field _mergeFrom.
     */
    private org.chocolate_milk.model.MergeFrom _mergeFrom;

    /**
     * Field _mergeTo.
     */
    private org.chocolate_milk.model.MergeTo _mergeTo;

    /**
     * Field _sameShipAddrOk.
     */
    private java.lang.String _sameShipAddrOk;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListMerge() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listMergeType'.
     * 
     * @return the value of field 'ListMergeType'.
     */
    public org.chocolate_milk.model.types.ListMergeTypeType getListMergeType(
    ) {
        return this._listMergeType;
    }

    /**
     * Returns the value of field 'mergeFrom'.
     * 
     * @return the value of field 'MergeFrom'.
     */
    public org.chocolate_milk.model.MergeFrom getMergeFrom(
    ) {
        return this._mergeFrom;
    }

    /**
     * Returns the value of field 'mergeTo'.
     * 
     * @return the value of field 'MergeTo'.
     */
    public org.chocolate_milk.model.MergeTo getMergeTo(
    ) {
        return this._mergeTo;
    }

    /**
     * Returns the value of field 'sameShipAddrOk'.
     * 
     * @return the value of field 'SameShipAddrOk'.
     */
    public java.lang.String getSameShipAddrOk(
    ) {
        return this._sameShipAddrOk;
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
     * Sets the value of field 'listMergeType'.
     * 
     * @param listMergeType the value of field 'listMergeType'.
     */
    public void setListMergeType(
            final org.chocolate_milk.model.types.ListMergeTypeType listMergeType) {
        this._listMergeType = listMergeType;
    }

    /**
     * Sets the value of field 'mergeFrom'.
     * 
     * @param mergeFrom the value of field 'mergeFrom'.
     */
    public void setMergeFrom(
            final org.chocolate_milk.model.MergeFrom mergeFrom) {
        this._mergeFrom = mergeFrom;
    }

    /**
     * Sets the value of field 'mergeTo'.
     * 
     * @param mergeTo the value of field 'mergeTo'.
     */
    public void setMergeTo(
            final org.chocolate_milk.model.MergeTo mergeTo) {
        this._mergeTo = mergeTo;
    }

    /**
     * Sets the value of field 'sameShipAddrOk'.
     * 
     * @param sameShipAddrOk the value of field 'sameShipAddrOk'.
     */
    public void setSameShipAddrOk(
            final java.lang.String sameShipAddrOk) {
        this._sameShipAddrOk = sameShipAddrOk;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ListMerge
     */
    public static org.chocolate_milk.model.ListMerge unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListMerge) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListMerge.class, reader);
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
