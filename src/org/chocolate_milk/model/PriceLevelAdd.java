/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevelAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevelAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PriceLevelAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _priceLevelAddChoice.
     */
    private org.chocolate_milk.model.PriceLevelAddChoice _priceLevelAddChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevelAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'priceLevelAddChoice'.
     * 
     * @return the value of field 'PriceLevelAddChoice'.
     */
    public org.chocolate_milk.model.PriceLevelAddChoice getPriceLevelAddChoice(
    ) {
        return this._priceLevelAddChoice;
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
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'priceLevelAddChoice'.
     * 
     * @param priceLevelAddChoice the value of field
     * 'priceLevelAddChoice'.
     */
    public void setPriceLevelAddChoice(
            final org.chocolate_milk.model.PriceLevelAddChoice priceLevelAddChoice) {
        this._priceLevelAddChoice = priceLevelAddChoice;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.PriceLevelAd
     */
    public static org.chocolate_milk.model.PriceLevelAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevelAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevelAdd.class, reader);
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
