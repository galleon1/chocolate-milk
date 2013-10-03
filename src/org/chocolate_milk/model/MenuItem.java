/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: MenuItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class MenuItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class MenuItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _menuText.
     */
    private java.lang.String _menuText;

    /**
     * Field _eventTag.
     */
    private java.lang.String _eventTag;

    /**
     * Field _displayCondition.
     */
    private org.chocolate_milk.model.DisplayCondition _displayCondition;


      //----------------/
     //- Constructors -/
    //----------------/

    public MenuItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'displayCondition'.
     * 
     * @return the value of field 'DisplayCondition'.
     */
    public org.chocolate_milk.model.DisplayCondition getDisplayCondition(
    ) {
        return this._displayCondition;
    }

    /**
     * Returns the value of field 'eventTag'.
     * 
     * @return the value of field 'EventTag'.
     */
    public java.lang.String getEventTag(
    ) {
        return this._eventTag;
    }

    /**
     * Returns the value of field 'menuText'.
     * 
     * @return the value of field 'MenuText'.
     */
    public java.lang.String getMenuText(
    ) {
        return this._menuText;
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
     * Sets the value of field 'displayCondition'.
     * 
     * @param displayCondition the value of field 'displayCondition'
     */
    public void setDisplayCondition(
            final org.chocolate_milk.model.DisplayCondition displayCondition) {
        this._displayCondition = displayCondition;
    }

    /**
     * Sets the value of field 'eventTag'.
     * 
     * @param eventTag the value of field 'eventTag'.
     */
    public void setEventTag(
            final java.lang.String eventTag) {
        this._eventTag = eventTag;
    }

    /**
     * Sets the value of field 'menuText'.
     * 
     * @param menuText the value of field 'menuText'.
     */
    public void setMenuText(
            final java.lang.String menuText) {
        this._menuText = menuText;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.MenuItem
     */
    public static org.chocolate_milk.model.MenuItem unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.MenuItem) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.MenuItem.class, reader);
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
