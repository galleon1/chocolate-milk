/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnFieldsCore.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnFieldsCore.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnFieldsCore implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _PONumber.
     */
    private java.lang.String _PONumber;

    /**
     * Field _termsRef.
     */
    private org.chocolate_milk.model.TermsRef _termsRef;

    /**
     * Field _dueDate.
     */
    private java.lang.String _dueDate;

    /**
     * Field _salesRepRef.
     */
    private org.chocolate_milk.model.SalesRepRef _salesRepRef;

    /**
     * Field _FOB.
     */
    private java.lang.String _FOB;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnFieldsCore() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dueDate'.
     * 
     * @return the value of field 'DueDate'.
     */
    public java.lang.String getDueDate(
    ) {
        return this._dueDate;
    }

    /**
     * Returns the value of field 'FOB'.
     * 
     * @return the value of field 'FOB'.
     */
    public java.lang.String getFOB(
    ) {
        return this._FOB;
    }

    /**
     * Returns the value of field 'PONumber'.
     * 
     * @return the value of field 'PONumber'.
     */
    public java.lang.String getPONumber(
    ) {
        return this._PONumber;
    }

    /**
     * Returns the value of field 'salesRepRef'.
     * 
     * @return the value of field 'SalesRepRef'.
     */
    public org.chocolate_milk.model.SalesRepRef getSalesRepRef(
    ) {
        return this._salesRepRef;
    }

    /**
     * Returns the value of field 'termsRef'.
     * 
     * @return the value of field 'TermsRef'.
     */
    public org.chocolate_milk.model.TermsRef getTermsRef(
    ) {
        return this._termsRef;
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
     * Sets the value of field 'dueDate'.
     * 
     * @param dueDate the value of field 'dueDate'.
     */
    public void setDueDate(
            final java.lang.String dueDate) {
        this._dueDate = dueDate;
    }

    /**
     * Sets the value of field 'FOB'.
     * 
     * @param FOB the value of field 'FOB'.
     */
    public void setFOB(
            final java.lang.String FOB) {
        this._FOB = FOB;
    }

    /**
     * Sets the value of field 'PONumber'.
     * 
     * @param PONumber the value of field 'PONumber'.
     */
    public void setPONumber(
            final java.lang.String PONumber) {
        this._PONumber = PONumber;
    }

    /**
     * Sets the value of field 'salesRepRef'.
     * 
     * @param salesRepRef the value of field 'salesRepRef'.
     */
    public void setSalesRepRef(
            final org.chocolate_milk.model.SalesRepRef salesRepRef) {
        this._salesRepRef = salesRepRef;
    }

    /**
     * Sets the value of field 'termsRef'.
     * 
     * @param termsRef the value of field 'termsRef'.
     */
    public void setTermsRef(
            final org.chocolate_milk.model.TermsRef termsRef) {
        this._termsRef = termsRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.TxnFieldsCor
     */
    public static org.chocolate_milk.model.TxnFieldsCore unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnFieldsCore) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnFieldsCore.class, reader);
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
