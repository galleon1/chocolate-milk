/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DiscountLineAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DiscountLineAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DiscountLineAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _discountLineAddChoice.
     */
    private org.chocolate_milk.model.DiscountLineAddChoice _discountLineAddChoice;

    /**
     * Field _isTaxable.
     */
    private java.lang.String _isTaxable;

    /**
     * Field _accountRef.
     */
    private org.chocolate_milk.model.AccountRef _accountRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public DiscountLineAdd() {
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
     * Returns the value of field 'discountLineAddChoice'.
     * 
     * @return the value of field 'DiscountLineAddChoice'.
     */
    public org.chocolate_milk.model.DiscountLineAddChoice getDiscountLineAddChoice(
    ) {
        return this._discountLineAddChoice;
    }

    /**
     * Returns the value of field 'isTaxable'.
     * 
     * @return the value of field 'IsTaxable'.
     */
    public java.lang.String getIsTaxable(
    ) {
        return this._isTaxable;
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
     * Sets the value of field 'discountLineAddChoice'.
     * 
     * @param discountLineAddChoice the value of field
     * 'discountLineAddChoice'.
     */
    public void setDiscountLineAddChoice(
            final org.chocolate_milk.model.DiscountLineAddChoice discountLineAddChoice) {
        this._discountLineAddChoice = discountLineAddChoice;
    }

    /**
     * Sets the value of field 'isTaxable'.
     * 
     * @param isTaxable the value of field 'isTaxable'.
     */
    public void setIsTaxable(
            final java.lang.String isTaxable) {
        this._isTaxable = isTaxable;
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
     * org.chocolate_milk.model.DiscountLineAdd
     */
    public static org.chocolate_milk.model.DiscountLineAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DiscountLineAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DiscountLineAdd.class, reader);
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
