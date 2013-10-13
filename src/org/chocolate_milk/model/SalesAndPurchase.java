/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesAndPurchase.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesAndPurchase.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesAndPurchase implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesDesc.
     */
    private java.lang.String _salesDesc;

    /**
     * Field _salesPrice.
     */
    private java.lang.String _salesPrice;

    /**
     * Field _incomeAccountRef.
     */
    private org.chocolate_milk.model.IncomeAccountRef _incomeAccountRef;

    /**
     * Field _purchaseDesc.
     */
    private java.lang.String _purchaseDesc;

    /**
     * Field _purchaseCost.
     */
    private java.lang.String _purchaseCost;

    /**
     * Field _purchaseTaxCodeRef.
     */
    private org.chocolate_milk.model.PurchaseTaxCodeRef _purchaseTaxCodeRef;

    /**
     * Field _expenseAccountRef.
     */
    private org.chocolate_milk.model.ExpenseAccountRef _expenseAccountRef;

    /**
     * Field _prefVendorRef.
     */
    private org.chocolate_milk.model.PrefVendorRef _prefVendorRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesAndPurchase() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'expenseAccountRef'.
     * 
     * @return the value of field 'ExpenseAccountRef'.
     */
    public org.chocolate_milk.model.ExpenseAccountRef getExpenseAccountRef(
    ) {
        return this._expenseAccountRef;
    }

    /**
     * Returns the value of field 'incomeAccountRef'.
     * 
     * @return the value of field 'IncomeAccountRef'.
     */
    public org.chocolate_milk.model.IncomeAccountRef getIncomeAccountRef(
    ) {
        return this._incomeAccountRef;
    }

    /**
     * Returns the value of field 'prefVendorRef'.
     * 
     * @return the value of field 'PrefVendorRef'.
     */
    public org.chocolate_milk.model.PrefVendorRef getPrefVendorRef(
    ) {
        return this._prefVendorRef;
    }

    /**
     * Returns the value of field 'purchaseCost'.
     * 
     * @return the value of field 'PurchaseCost'.
     */
    public java.lang.String getPurchaseCost(
    ) {
        return this._purchaseCost;
    }

    /**
     * Returns the value of field 'purchaseDesc'.
     * 
     * @return the value of field 'PurchaseDesc'.
     */
    public java.lang.String getPurchaseDesc(
    ) {
        return this._purchaseDesc;
    }

    /**
     * Returns the value of field 'purchaseTaxCodeRef'.
     * 
     * @return the value of field 'PurchaseTaxCodeRef'.
     */
    public org.chocolate_milk.model.PurchaseTaxCodeRef getPurchaseTaxCodeRef(
    ) {
        return this._purchaseTaxCodeRef;
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
     * Sets the value of field 'expenseAccountRef'.
     * 
     * @param expenseAccountRef the value of field
     * 'expenseAccountRef'.
     */
    public void setExpenseAccountRef(
            final org.chocolate_milk.model.ExpenseAccountRef expenseAccountRef) {
        this._expenseAccountRef = expenseAccountRef;
    }

    /**
     * Sets the value of field 'incomeAccountRef'.
     * 
     * @param incomeAccountRef the value of field 'incomeAccountRef'
     */
    public void setIncomeAccountRef(
            final org.chocolate_milk.model.IncomeAccountRef incomeAccountRef) {
        this._incomeAccountRef = incomeAccountRef;
    }

    /**
     * Sets the value of field 'prefVendorRef'.
     * 
     * @param prefVendorRef the value of field 'prefVendorRef'.
     */
    public void setPrefVendorRef(
            final org.chocolate_milk.model.PrefVendorRef prefVendorRef) {
        this._prefVendorRef = prefVendorRef;
    }

    /**
     * Sets the value of field 'purchaseCost'.
     * 
     * @param purchaseCost the value of field 'purchaseCost'.
     */
    public void setPurchaseCost(
            final java.lang.String purchaseCost) {
        this._purchaseCost = purchaseCost;
    }

    /**
     * Sets the value of field 'purchaseDesc'.
     * 
     * @param purchaseDesc the value of field 'purchaseDesc'.
     */
    public void setPurchaseDesc(
            final java.lang.String purchaseDesc) {
        this._purchaseDesc = purchaseDesc;
    }

    /**
     * Sets the value of field 'purchaseTaxCodeRef'.
     * 
     * @param purchaseTaxCodeRef the value of field
     * 'purchaseTaxCodeRef'.
     */
    public void setPurchaseTaxCodeRef(
            final org.chocolate_milk.model.PurchaseTaxCodeRef purchaseTaxCodeRef) {
        this._purchaseTaxCodeRef = purchaseTaxCodeRef;
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
     * org.chocolate_milk.model.SalesAndPurchase
     */
    public static org.chocolate_milk.model.SalesAndPurchase unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesAndPurchase) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesAndPurchase.class, reader);
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
