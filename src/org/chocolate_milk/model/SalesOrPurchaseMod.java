/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesOrPurchaseMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesOrPurchaseMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesOrPurchaseMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _desc.
     */
    private java.lang.String _desc;

    /**
     * Field _salesOrPurchaseModChoice.
     */
    private org.chocolate_milk.model.SalesOrPurchaseModChoice _salesOrPurchaseModChoice;

    /**
     * Field _accountRef.
     */
    private org.chocolate_milk.model.AccountRef _accountRef;

    /**
     * Field _applyAccountRefToExistingTxns.
     */
    private java.lang.String _applyAccountRefToExistingTxns;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesOrPurchaseMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'accountRef'.
     * 
     * @return the value of field 'AccountRef'.
     */
    public org.chocolate_milk.model.AccountRef getAccountRef(
    ) {
        return this._accountRef;
    }

    /**
     * Returns the value of field 'applyAccountRefToExistingTxns'.
     * 
     * @return the value of field 'ApplyAccountRefToExistingTxns'.
     */
    public java.lang.String getApplyAccountRefToExistingTxns(
    ) {
        return this._applyAccountRefToExistingTxns;
    }

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
     * Returns the value of field 'salesOrPurchaseModChoice'.
     * 
     * @return the value of field 'SalesOrPurchaseModChoice'.
     */
    public org.chocolate_milk.model.SalesOrPurchaseModChoice getSalesOrPurchaseModChoice(
    ) {
        return this._salesOrPurchaseModChoice;
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
     * Sets the value of field 'accountRef'.
     * 
     * @param accountRef the value of field 'accountRef'.
     */
    public void setAccountRef(
            final org.chocolate_milk.model.AccountRef accountRef) {
        this._accountRef = accountRef;
    }

    /**
     * Sets the value of field 'applyAccountRefToExistingTxns'.
     * 
     * @param applyAccountRefToExistingTxns the value of field
     * 'applyAccountRefToExistingTxns'.
     */
    public void setApplyAccountRefToExistingTxns(
            final java.lang.String applyAccountRefToExistingTxns) {
        this._applyAccountRefToExistingTxns = applyAccountRefToExistingTxns;
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
     * Sets the value of field 'salesOrPurchaseModChoice'.
     * 
     * @param salesOrPurchaseModChoice the value of field
     * 'salesOrPurchaseModChoice'.
     */
    public void setSalesOrPurchaseModChoice(
            final org.chocolate_milk.model.SalesOrPurchaseModChoice salesOrPurchaseModChoice) {
        this._salesOrPurchaseModChoice = salesOrPurchaseModChoice;
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
     * org.chocolate_milk.model.SalesOrPurchaseMod
     */
    public static org.chocolate_milk.model.SalesOrPurchaseMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesOrPurchaseMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesOrPurchaseMod.class, reader);
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
