/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemOtherChargeAddChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemOtherChargeAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemOtherChargeAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesOrPurchase.
     */
    private org.chocolate_milk.model.SalesOrPurchase _salesOrPurchase;

    /**
     * Field _salesAndPurchase.
     */
    private org.chocolate_milk.model.SalesAndPurchase _salesAndPurchase;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemOtherChargeAddChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesAndPurchase'.
     * 
     * @return the value of field 'SalesAndPurchase'.
     */
    public org.chocolate_milk.model.SalesAndPurchase getSalesAndPurchase(
    ) {
        return this._salesAndPurchase;
    }

    /**
     * Returns the value of field 'salesOrPurchase'.
     * 
     * @return the value of field 'SalesOrPurchase'.
     */
    public org.chocolate_milk.model.SalesOrPurchase getSalesOrPurchase(
    ) {
        return this._salesOrPurchase;
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
     * Sets the value of field 'salesAndPurchase'.
     * 
     * @param salesAndPurchase the value of field 'salesAndPurchase'
     */
    public void setSalesAndPurchase(
            final org.chocolate_milk.model.SalesAndPurchase salesAndPurchase) {
        this._salesAndPurchase = salesAndPurchase;
    }

    /**
     * Sets the value of field 'salesOrPurchase'.
     * 
     * @param salesOrPurchase the value of field 'salesOrPurchase'.
     */
    public void setSalesOrPurchase(
            final org.chocolate_milk.model.SalesOrPurchase salesOrPurchase) {
        this._salesOrPurchase = salesOrPurchase;
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
     * org.chocolate_milk.model.ItemOtherChargeAddChoice
     */
    public static org.chocolate_milk.model.ItemOtherChargeAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemOtherChargeAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemOtherChargeAddChoice.class, reader);
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
