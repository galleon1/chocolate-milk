/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnFilterNoCurrency.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnFilterNoCurrency.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class TxnFilterNoCurrency implements java.io.Serializable {


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
     * Field _txnFilterNoCurrencyChoice.
     */
    private org.chocolate_milk.model.TxnFilterNoCurrencyChoice _txnFilterNoCurrencyChoice;

    /**
     * Field _entityFilter.
     */
    private org.chocolate_milk.model.EntityFilter _entityFilter;

    /**
     * Field _accountFilter.
     */
    private org.chocolate_milk.model.AccountFilter _accountFilter;

    /**
     * Field _txnFilterNoCurrencyChoice2.
     */
    private org.chocolate_milk.model.TxnFilterNoCurrencyChoice2 _txnFilterNoCurrencyChoice2;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnFilterNoCurrency() {
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
     * Returns the value of field 'accountFilter'.
     * 
     * @return the value of field 'AccountFilter'.
     */
    public org.chocolate_milk.model.AccountFilter getAccountFilter(
    ) {
        return this._accountFilter;
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
     * Returns the value of field 'txnFilterNoCurrencyChoice'.
     * 
     * @return the value of field 'TxnFilterNoCurrencyChoice'.
     */
    public org.chocolate_milk.model.TxnFilterNoCurrencyChoice getTxnFilterNoCurrencyChoice(
    ) {
        return this._txnFilterNoCurrencyChoice;
    }

    /**
     * Returns the value of field 'txnFilterNoCurrencyChoice2'.
     * 
     * @return the value of field 'TxnFilterNoCurrencyChoice2'.
     */
    public org.chocolate_milk.model.TxnFilterNoCurrencyChoice2 getTxnFilterNoCurrencyChoice2(
    ) {
        return this._txnFilterNoCurrencyChoice2;
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
     * Sets the value of field 'accountFilter'.
     * 
     * @param accountFilter the value of field 'accountFilter'.
     */
    public void setAccountFilter(
            final org.chocolate_milk.model.AccountFilter accountFilter) {
        this._accountFilter = accountFilter;
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
     * Sets the value of field 'txnFilterNoCurrencyChoice'.
     * 
     * @param txnFilterNoCurrencyChoice the value of field
     * 'txnFilterNoCurrencyChoice'.
     */
    public void setTxnFilterNoCurrencyChoice(
            final org.chocolate_milk.model.TxnFilterNoCurrencyChoice txnFilterNoCurrencyChoice) {
        this._txnFilterNoCurrencyChoice = txnFilterNoCurrencyChoice;
    }

    /**
     * Sets the value of field 'txnFilterNoCurrencyChoice2'.
     * 
     * @param txnFilterNoCurrencyChoice2 the value of field
     * 'txnFilterNoCurrencyChoice2'.
     */
    public void setTxnFilterNoCurrencyChoice2(
            final org.chocolate_milk.model.TxnFilterNoCurrencyChoice2 txnFilterNoCurrencyChoice2) {
        this._txnFilterNoCurrencyChoice2 = txnFilterNoCurrencyChoice2;
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
     * org.chocolate_milk.model.TxnFilterNoCurrency
     */
    public static org.chocolate_milk.model.TxnFilterNoCurrency unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnFilterNoCurrency) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnFilterNoCurrency.class, reader);
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
