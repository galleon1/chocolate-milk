/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ComponentItemLineRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ComponentItemLineRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ComponentItemLineRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemRef.
     */
    private org.chocolate_milk.model.ItemRef _itemRef;

    /**
     * Field _desc.
     */
    private java.lang.String _desc;

    /**
     * Field _quantityOnHand.
     */
    private java.lang.String _quantityOnHand;

    /**
     * Field _quantityNeeded.
     */
    private java.lang.String _quantityNeeded;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComponentItemLineRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'.
     * 
     * @return the value of field 'Desc'.
     */
    public java.lang.String getDesc(
    ) {
        return this._desc;
    }

    /**
     * Returns the value of field 'itemRef'.
     * 
     * @return the value of field 'ItemRef'.
     */
    public org.chocolate_milk.model.ItemRef getItemRef(
    ) {
        return this._itemRef;
    }

    /**
     * Returns the value of field 'quantityNeeded'.
     * 
     * @return the value of field 'QuantityNeeded'.
     */
    public java.lang.String getQuantityNeeded(
    ) {
        return this._quantityNeeded;
    }

    /**
     * Returns the value of field 'quantityOnHand'.
     * 
     * @return the value of field 'QuantityOnHand'.
     */
    public java.lang.String getQuantityOnHand(
    ) {
        return this._quantityOnHand;
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
     * Sets the value of field 'desc'.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(
            final java.lang.String desc) {
        this._desc = desc;
    }

    /**
     * Sets the value of field 'itemRef'.
     * 
     * @param itemRef the value of field 'itemRef'.
     */
    public void setItemRef(
            final org.chocolate_milk.model.ItemRef itemRef) {
        this._itemRef = itemRef;
    }

    /**
     * Sets the value of field 'quantityNeeded'.
     * 
     * @param quantityNeeded the value of field 'quantityNeeded'.
     */
    public void setQuantityNeeded(
            final java.lang.String quantityNeeded) {
        this._quantityNeeded = quantityNeeded;
    }

    /**
     * Sets the value of field 'quantityOnHand'.
     * 
     * @param quantityOnHand the value of field 'quantityOnHand'.
     */
    public void setQuantityOnHand(
            final java.lang.String quantityOnHand) {
        this._quantityOnHand = quantityOnHand;
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
     * org.chocolate_milk.model.ComponentItemLineRet
     */
    public static org.chocolate_milk.model.ComponentItemLineRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ComponentItemLineRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ComponentItemLineRet.class, reader);
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
