/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemInventoryAssemblyLine.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemInventoryAssemblyLine.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemInventoryAssemblyLine implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemInventoryRef.
     */
    private org.chocolate_milk.model.ItemInventoryRef _itemInventoryRef;

    /**
     * Field _quantity.
     */
    private java.lang.String _quantity;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemInventoryAssemblyLine() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemInventoryRef'.
     * 
     * @return the value of field 'ItemInventoryRef'.
     */
    public org.chocolate_milk.model.ItemInventoryRef getItemInventoryRef(
    ) {
        return this._itemInventoryRef;
    }

    /**
     * Returns the value of field 'quantity'.
     * 
     * @return the value of field 'Quantity'.
     */
    public java.lang.String getQuantity(
    ) {
        return this._quantity;
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
     * Sets the value of field 'itemInventoryRef'.
     * 
     * @param itemInventoryRef the value of field 'itemInventoryRef'
     */
    public void setItemInventoryRef(
            final org.chocolate_milk.model.ItemInventoryRef itemInventoryRef) {
        this._itemInventoryRef = itemInventoryRef;
    }

    /**
     * Sets the value of field 'quantity'.
     * 
     * @param quantity the value of field 'quantity'.
     */
    public void setQuantity(
            final java.lang.String quantity) {
        this._quantity = quantity;
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
     * org.chocolate_milk.model.ItemInventoryAssemblyLine
     */
    public static org.chocolate_milk.model.ItemInventoryAssemblyLine unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemInventoryAssemblyLine) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemInventoryAssemblyLine.class, reader);
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
