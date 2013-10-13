/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListDataExt.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListDataExt.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ListDataExt implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listDataExtType.
     */
    private org.chocolate_milk.model.types.ListDataExtTypeType _listDataExtType;

    /**
     * Field _listObjRef.
     */
    private org.chocolate_milk.model.ListObjRef _listObjRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListDataExt() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listDataExtType'.
     * 
     * @return the value of field 'ListDataExtType'.
     */
    public org.chocolate_milk.model.types.ListDataExtTypeType getListDataExtType(
    ) {
        return this._listDataExtType;
    }

    /**
     * Returns the value of field 'listObjRef'.
     * 
     * @return the value of field 'ListObjRef'.
     */
    public org.chocolate_milk.model.ListObjRef getListObjRef(
    ) {
        return this._listObjRef;
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
     * Sets the value of field 'listDataExtType'.
     * 
     * @param listDataExtType the value of field 'listDataExtType'.
     */
    public void setListDataExtType(
            final org.chocolate_milk.model.types.ListDataExtTypeType listDataExtType) {
        this._listDataExtType = listDataExtType;
    }

    /**
     * Sets the value of field 'listObjRef'.
     * 
     * @param listObjRef the value of field 'listObjRef'.
     */
    public void setListObjRef(
            final org.chocolate_milk.model.ListObjRef listObjRef) {
        this._listObjRef = listObjRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ListDataExt
     */
    public static org.chocolate_milk.model.ListDataExt unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListDataExt) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListDataExt.class, reader);
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
