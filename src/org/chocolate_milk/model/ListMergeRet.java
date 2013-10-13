/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListMergeRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListMergeRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ListMergeRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listMergeType.
     */
    private org.chocolate_milk.model.types.ListMergeTypeType _listMergeType;

    /**
     * Field _mergedFrom.
     */
    private org.chocolate_milk.model.MergedFrom _mergedFrom;

    /**
     * Field _mergedTo.
     */
    private org.chocolate_milk.model.MergedTo _mergedTo;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListMergeRet() {
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
     * Returns the value of field 'mergedFrom'.
     * 
     * @return the value of field 'MergedFrom'.
     */
    public org.chocolate_milk.model.MergedFrom getMergedFrom(
    ) {
        return this._mergedFrom;
    }

    /**
     * Returns the value of field 'mergedTo'.
     * 
     * @return the value of field 'MergedTo'.
     */
    public org.chocolate_milk.model.MergedTo getMergedTo(
    ) {
        return this._mergedTo;
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
     * Sets the value of field 'mergedFrom'.
     * 
     * @param mergedFrom the value of field 'mergedFrom'.
     */
    public void setMergedFrom(
            final org.chocolate_milk.model.MergedFrom mergedFrom) {
        this._mergedFrom = mergedFrom;
    }

    /**
     * Sets the value of field 'mergedTo'.
     * 
     * @param mergedTo the value of field 'mergedTo'.
     */
    public void setMergedTo(
            final org.chocolate_milk.model.MergedTo mergedTo) {
        this._mergedTo = mergedTo;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ListMergeRet
     */
    public static org.chocolate_milk.model.ListMergeRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListMergeRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListMergeRet.class, reader);
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
