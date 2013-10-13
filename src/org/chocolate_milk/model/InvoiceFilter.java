/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InvoiceFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InvoiceFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class InvoiceFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnFilter.
     */
    private org.chocolate_milk.model.TxnFilter _txnFilter;

    /**
     * Field _paidStatus.
     */
    private org.chocolate_milk.model.types.PaidStatusType _paidStatus = org.chocolate_milk.model.types.PaidStatusType.fromValue("All");


      //----------------/
     //- Constructors -/
    //----------------/

    public InvoiceFilter() {
        super();
        setPaidStatus(org.chocolate_milk.model.types.PaidStatusType.fromValue("All"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'paidStatus'.
     * 
     * @return the value of field 'PaidStatus'.
     */
    public org.chocolate_milk.model.types.PaidStatusType getPaidStatus(
    ) {
        return this._paidStatus;
    }

    /**
     * Returns the value of field 'txnFilter'.
     * 
     * @return the value of field 'TxnFilter'.
     */
    public org.chocolate_milk.model.TxnFilter getTxnFilter(
    ) {
        return this._txnFilter;
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
     * Sets the value of field 'paidStatus'.
     * 
     * @param paidStatus the value of field 'paidStatus'.
     */
    public void setPaidStatus(
            final org.chocolate_milk.model.types.PaidStatusType paidStatus) {
        this._paidStatus = paidStatus;
    }

    /**
     * Sets the value of field 'txnFilter'.
     * 
     * @param txnFilter the value of field 'txnFilter'.
     */
    public void setTxnFilter(
            final org.chocolate_milk.model.TxnFilter txnFilter) {
        this._txnFilter = txnFilter;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.InvoiceFilte
     */
    public static org.chocolate_milk.model.InvoiceFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.InvoiceFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.InvoiceFilter.class, reader);
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
