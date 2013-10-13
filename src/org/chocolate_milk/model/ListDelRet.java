/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListDelRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListDelRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ListDelRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listDelType.
     */
    private org.chocolate_milk.model.types.ListDelTypeType _listDelType;

    /**
     * Field _listID.
     */
    private java.lang.String _listID;

    /**
     * Field _timeDeleted.
     */
    private java.lang.String _timeDeleted;

    /**
     * Field _fullName.
     */
    private java.lang.String _fullName;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListDelRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'fullName'.
     * 
     * @return the value of field 'FullName'.
     */
    public java.lang.String getFullName(
    ) {
        return this._fullName;
    }

    /**
     * Returns the value of field 'listDelType'.
     * 
     * @return the value of field 'ListDelType'.
     */
    public org.chocolate_milk.model.types.ListDelTypeType getListDelType(
    ) {
        return this._listDelType;
    }

    /**
     * Returns the value of field 'listID'.
     * 
     * @return the value of field 'ListID'.
     */
    public java.lang.String getListID(
    ) {
        return this._listID;
    }

    /**
     * Returns the value of field 'timeDeleted'.
     * 
     * @return the value of field 'TimeDeleted'.
     */
    public java.lang.String getTimeDeleted(
    ) {
        return this._timeDeleted;
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
     * Sets the value of field 'fullName'.
     * 
     * @param fullName the value of field 'fullName'.
     */
    public void setFullName(
            final java.lang.String fullName) {
        this._fullName = fullName;
    }

    /**
     * Sets the value of field 'listDelType'.
     * 
     * @param listDelType the value of field 'listDelType'.
     */
    public void setListDelType(
            final org.chocolate_milk.model.types.ListDelTypeType listDelType) {
        this._listDelType = listDelType;
    }

    /**
     * Sets the value of field 'listID'.
     * 
     * @param listID the value of field 'listID'.
     */
    public void setListID(
            final java.lang.String listID) {
        this._listID = listID;
    }

    /**
     * Sets the value of field 'timeDeleted'.
     * 
     * @param timeDeleted the value of field 'timeDeleted'.
     */
    public void setTimeDeleted(
            final java.lang.String timeDeleted) {
        this._timeDeleted = timeDeleted;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ListDelRet
     */
    public static org.chocolate_milk.model.ListDelRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListDelRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListDelRet.class, reader);
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
