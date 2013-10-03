/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnFilterNoAccount.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnFilterNoAccount.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class TxnFilterNoAccount implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxReturned.
     */
    private long _maxReturned;

    /**
     * keeps track of state for field: _maxReturned
     */
    private boolean _has_maxReturned;

    /**
     * Field _txnFilterNoAccountChoice.
     */
    private org.chocolate_milk.model.TxnFilterNoAccountChoice _txnFilterNoAccountChoice;

    /**
     * Field _entityFilter.
     */
    private org.chocolate_milk.model.EntityFilter _entityFilter;

    /**
     * Field _txnFilterNoAccountChoice2.
     */
    private org.chocolate_milk.model.TxnFilterNoAccountChoice2 _txnFilterNoAccountChoice2;

    /**
     * Field _currencyFilter.
     */
    private org.chocolate_milk.model.CurrencyFilter _currencyFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnFilterNoAccount() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMaxReturned(
    ) {
        this._has_maxReturned= false;
    }

    /**
     * Returns the value of field 'currencyFilter'.
     * 
     * @return the value of field 'CurrencyFilter'.
     */
    public org.chocolate_milk.model.CurrencyFilter getCurrencyFilter(
    ) {
        return this._currencyFilter;
    }

    /**
     * Returns the value of field 'entityFilter'.
     * 
     * @return the value of field 'EntityFilter'.
     */
    public org.chocolate_milk.model.EntityFilter getEntityFilter(
    ) {
        return this._entityFilter;
    }

    /**
     * Returns the value of field 'maxReturned'.
     * 
     * @return the value of field 'MaxReturned'.
     */
    public long getMaxReturned(
    ) {
        return this._maxReturned;
    }

    /**
     * Returns the value of field 'txnFilterNoAccountChoice'.
     * 
     * @return the value of field 'TxnFilterNoAccountChoice'.
     */
    public org.chocolate_milk.model.TxnFilterNoAccountChoice getTxnFilterNoAccountChoice(
    ) {
        return this._txnFilterNoAccountChoice;
    }

    /**
     * Returns the value of field 'txnFilterNoAccountChoice2'.
     * 
     * @return the value of field 'TxnFilterNoAccountChoice2'.
     */
    public org.chocolate_milk.model.TxnFilterNoAccountChoice2 getTxnFilterNoAccountChoice2(
    ) {
        return this._txnFilterNoAccountChoice2;
    }

    /**
     * Method hasMaxReturned.
     * 
     * @return true if at least one MaxReturned has been added
     */
    public boolean hasMaxReturned(
    ) {
        return this._has_maxReturned;
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
     * Sets the value of field 'currencyFilter'.
     * 
     * @param currencyFilter the value of field 'currencyFilter'.
     */
    public void setCurrencyFilter(
            final org.chocolate_milk.model.CurrencyFilter currencyFilter) {
        this._currencyFilter = currencyFilter;
    }

    /**
     * Sets the value of field 'entityFilter'.
     * 
     * @param entityFilter the value of field 'entityFilter'.
     */
    public void setEntityFilter(
            final org.chocolate_milk.model.EntityFilter entityFilter) {
        this._entityFilter = entityFilter;
    }

    /**
     * Sets the value of field 'maxReturned'.
     * 
     * @param maxReturned the value of field 'maxReturned'.
     */
    public void setMaxReturned(
            final long maxReturned) {
        this._maxReturned = maxReturned;
        this._has_maxReturned = true;
    }

    /**
     * Sets the value of field 'txnFilterNoAccountChoice'.
     * 
     * @param txnFilterNoAccountChoice the value of field
     * 'txnFilterNoAccountChoice'.
     */
    public void setTxnFilterNoAccountChoice(
            final org.chocolate_milk.model.TxnFilterNoAccountChoice txnFilterNoAccountChoice) {
        this._txnFilterNoAccountChoice = txnFilterNoAccountChoice;
    }

    /**
     * Sets the value of field 'txnFilterNoAccountChoice2'.
     * 
     * @param txnFilterNoAccountChoice2 the value of field
     * 'txnFilterNoAccountChoice2'.
     */
    public void setTxnFilterNoAccountChoice2(
            final org.chocolate_milk.model.TxnFilterNoAccountChoice2 txnFilterNoAccountChoice2) {
        this._txnFilterNoAccountChoice2 = txnFilterNoAccountChoice2;
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
     * org.chocolate_milk.model.TxnFilterNoAccount
     */
    public static org.chocolate_milk.model.TxnFilterNoAccount unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnFilterNoAccount) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnFilterNoAccount.class, reader);
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
