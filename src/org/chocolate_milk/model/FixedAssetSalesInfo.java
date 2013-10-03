/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: FixedAssetSalesInfo.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class FixedAssetSalesInfo.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class FixedAssetSalesInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesDesc.
     */
    private java.lang.String _salesDesc;

    /**
     * Field _salesDate.
     */
    private java.lang.String _salesDate;

    /**
     * Field _salesPrice.
     */
    private java.lang.String _salesPrice;

    /**
     * Field _salesExpense.
     */
    private java.lang.String _salesExpense;


      //----------------/
     //- Constructors -/
    //----------------/

    public FixedAssetSalesInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesDate'.
     * 
     * @return the value of field 'SalesDate'.
     */
    public java.lang.String getSalesDate(
    ) {
        return this._salesDate;
    }

    /**
     * Returns the value of field 'salesDesc'.
     * 
     * @return the value of field 'SalesDesc'.
     */
    public java.lang.String getSalesDesc(
    ) {
        return this._salesDesc;
    }

    /**
     * Returns the value of field 'salesExpense'.
     * 
     * @return the value of field 'SalesExpense'.
     */
    public java.lang.String getSalesExpense(
    ) {
        return this._salesExpense;
    }

    /**
     * Returns the value of field 'salesPrice'.
     * 
     * @return the value of field 'SalesPrice'.
     */
    public java.lang.String getSalesPrice(
    ) {
        return this._salesPrice;
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
     * Sets the value of field 'salesDate'.
     * 
     * @param salesDate the value of field 'salesDate'.
     */
    public void setSalesDate(
            final java.lang.String salesDate) {
        this._salesDate = salesDate;
    }

    /**
     * Sets the value of field 'salesDesc'.
     * 
     * @param salesDesc the value of field 'salesDesc'.
     */
    public void setSalesDesc(
            final java.lang.String salesDesc) {
        this._salesDesc = salesDesc;
    }

    /**
     * Sets the value of field 'salesExpense'.
     * 
     * @param salesExpense the value of field 'salesExpense'.
     */
    public void setSalesExpense(
            final java.lang.String salesExpense) {
        this._salesExpense = salesExpense;
    }

    /**
     * Sets the value of field 'salesPrice'.
     * 
     * @param salesPrice the value of field 'salesPrice'.
     */
    public void setSalesPrice(
            final java.lang.String salesPrice) {
        this._salesPrice = salesPrice;
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
     * org.chocolate_milk.model.FixedAssetSalesInfo
     */
    public static org.chocolate_milk.model.FixedAssetSalesInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.FixedAssetSalesInfo) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.FixedAssetSalesInfo.class, reader);
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
