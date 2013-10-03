/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxData.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxData.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesTaxData implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemSalesTaxRef.
     */
    private org.chocolate_milk.model.ItemSalesTaxRef _itemSalesTaxRef;

    /**
     * Field _salesTaxPercentage.
     */
    private java.lang.String _salesTaxPercentage;

    /**
     * Field _salesTaxTotal.
     */
    private java.lang.String _salesTaxTotal;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxData() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemSalesTaxRef'.
     * 
     * @return the value of field 'ItemSalesTaxRef'.
     */
    public org.chocolate_milk.model.ItemSalesTaxRef getItemSalesTaxRef(
    ) {
        return this._itemSalesTaxRef;
    }

    /**
     * Returns the value of field 'salesTaxPercentage'.
     * 
     * @return the value of field 'SalesTaxPercentage'.
     */
    public java.lang.String getSalesTaxPercentage(
    ) {
        return this._salesTaxPercentage;
    }

    /**
     * Returns the value of field 'salesTaxTotal'.
     * 
     * @return the value of field 'SalesTaxTotal'.
     */
    public java.lang.String getSalesTaxTotal(
    ) {
        return this._salesTaxTotal;
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
     * Sets the value of field 'itemSalesTaxRef'.
     * 
     * @param itemSalesTaxRef the value of field 'itemSalesTaxRef'.
     */
    public void setItemSalesTaxRef(
            final org.chocolate_milk.model.ItemSalesTaxRef itemSalesTaxRef) {
        this._itemSalesTaxRef = itemSalesTaxRef;
    }

    /**
     * Sets the value of field 'salesTaxPercentage'.
     * 
     * @param salesTaxPercentage the value of field
     * 'salesTaxPercentage'.
     */
    public void setSalesTaxPercentage(
            final java.lang.String salesTaxPercentage) {
        this._salesTaxPercentage = salesTaxPercentage;
    }

    /**
     * Sets the value of field 'salesTaxTotal'.
     * 
     * @param salesTaxTotal the value of field 'salesTaxTotal'.
     */
    public void setSalesTaxTotal(
            final java.lang.String salesTaxTotal) {
        this._salesTaxTotal = salesTaxTotal;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.SalesTaxData
     */
    public static org.chocolate_milk.model.SalesTaxData unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesTaxData) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesTaxData.class, reader);
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
