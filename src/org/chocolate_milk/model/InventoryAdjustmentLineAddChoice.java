/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InventoryAdjustmentLineAddChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InventoryAdjustmentLineAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class InventoryAdjustmentLineAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _quantityAdjustment.
     */
    private org.chocolate_milk.model.QuantityAdjustment _quantityAdjustment;

    /**
     * Field _valueAdjustment.
     */
    private org.chocolate_milk.model.ValueAdjustment _valueAdjustment;


      //----------------/
     //- Constructors -/
    //----------------/

    public InventoryAdjustmentLineAddChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'quantityAdjustment'.
     * 
     * @return the value of field 'QuantityAdjustment'.
     */
    public org.chocolate_milk.model.QuantityAdjustment getQuantityAdjustment(
    ) {
        return this._quantityAdjustment;
    }

    /**
     * Returns the value of field 'valueAdjustment'.
     * 
     * @return the value of field 'ValueAdjustment'.
     */
    public org.chocolate_milk.model.ValueAdjustment getValueAdjustment(
    ) {
        return this._valueAdjustment;
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
     * Sets the value of field 'quantityAdjustment'.
     * 
     * @param quantityAdjustment the value of field
     * 'quantityAdjustment'.
     */
    public void setQuantityAdjustment(
            final org.chocolate_milk.model.QuantityAdjustment quantityAdjustment) {
        this._quantityAdjustment = quantityAdjustment;
    }

    /**
     * Sets the value of field 'valueAdjustment'.
     * 
     * @param valueAdjustment the value of field 'valueAdjustment'.
     */
    public void setValueAdjustment(
            final org.chocolate_milk.model.ValueAdjustment valueAdjustment) {
        this._valueAdjustment = valueAdjustment;
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
     * org.chocolate_milk.model.InventoryAdjustmentLineAddChoice
     */
    public static org.chocolate_milk.model.InventoryAdjustmentLineAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.InventoryAdjustmentLineAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.InventoryAdjustmentLineAddChoice.class, reader);
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
