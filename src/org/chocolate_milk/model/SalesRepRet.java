/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesRepRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesRepRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesRepRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listCore.
     */
    private org.chocolate_milk.model.ListCore _listCore;

    /**
     * Field _initial.
     */
    private java.lang.String _initial;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _salesRepEntityRef.
     */
    private org.chocolate_milk.model.SalesRepEntityRef _salesRepEntityRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesRepRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'initial'.
     * 
     * @return the value of field 'Initial'.
     */
    public java.lang.String getInitial(
    ) {
        return this._initial;
    }

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'listCore'.
     * 
     * @return the value of field 'ListCore'.
     */
    public org.chocolate_milk.model.ListCore getListCore(
    ) {
        return this._listCore;
    }

    /**
     * Returns the value of field 'salesRepEntityRef'.
     * 
     * @return the value of field 'SalesRepEntityRef'.
     */
    public org.chocolate_milk.model.SalesRepEntityRef getSalesRepEntityRef(
    ) {
        return this._salesRepEntityRef;
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
     * Sets the value of field 'initial'.
     * 
     * @param initial the value of field 'initial'.
     */
    public void setInitial(
            final java.lang.String initial) {
        this._initial = initial;
    }

    /**
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'listCore'.
     * 
     * @param listCore the value of field 'listCore'.
     */
    public void setListCore(
            final org.chocolate_milk.model.ListCore listCore) {
        this._listCore = listCore;
    }

    /**
     * Sets the value of field 'salesRepEntityRef'.
     * 
     * @param salesRepEntityRef the value of field
     * 'salesRepEntityRef'.
     */
    public void setSalesRepEntityRef(
            final org.chocolate_milk.model.SalesRepEntityRef salesRepEntityRef) {
        this._salesRepEntityRef = salesRepEntityRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.SalesRepRet
     */
    public static org.chocolate_milk.model.SalesRepRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesRepRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesRepRet.class, reader);
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
