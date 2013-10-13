/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TransactionFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TransactionFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TransactionFilter implements java.io.Serializable {


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
     * Field _transactionFilterChoice.
     */
    private org.chocolate_milk.model.TransactionFilterChoice _transactionFilterChoice;

    /**
     * Field _transactionModifiedDateRangeFilter.
     */
    private org.chocolate_milk.model.TransactionModifiedDateRangeFilter _transactionModifiedDateRangeFilter;

    /**
     * Field _transactionDateRangeFilter.
     */
    private org.chocolate_milk.model.TransactionDateRangeFilter _transactionDateRangeFilter;

    /**
     * Field _transactionEntityFilter.
     */
    private org.chocolate_milk.model.TransactionEntityFilter _transactionEntityFilter;

    /**
     * Field _transactionAccountFilter.
     */
    private org.chocolate_milk.model.TransactionAccountFilter _transactionAccountFilter;

    /**
     * Field _transactionItemFilter.
     */
    private org.chocolate_milk.model.TransactionItemFilter _transactionItemFilter;

    /**
     * Field _transactionClassFilter.
     */
    private org.chocolate_milk.model.TransactionClassFilter _transactionClassFilter;

    /**
     * Field _transactionTypeFilter.
     */
    private org.chocolate_milk.model.TransactionTypeFilter _transactionTypeFilter;

    /**
     * Field _transactionDetailLevelFilter.
     */
    private org.chocolate_milk.model.types.TransactionDetailLevelFilterType _transactionDetailLevelFilter = org.chocolate_milk.model.types.TransactionDetailLevelFilterType.fromValue("SummaryOnly");

    /**
     * Field _transactionPostingStatusFilter.
     */
    private org.chocolate_milk.model.types.TransactionPostingStatusFilterType _transactionPostingStatusFilter = org.chocolate_milk.model.types.TransactionPostingStatusFilterType.fromValue("Either");

    /**
     * Field _transactionPaidStatusFilter.
     */
    private org.chocolate_milk.model.types.TransactionPaidStatusFilterType _transactionPaidStatusFilter = org.chocolate_milk.model.types.TransactionPaidStatusFilterType.fromValue("Either");

    /**
     * Field _currencyFilter.
     */
    private org.chocolate_milk.model.CurrencyFilter _currencyFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public TransactionFilter() {
        super();
        setTransactionDetailLevelFilter(org.chocolate_milk.model.types.TransactionDetailLevelFilterType.fromValue("SummaryOnly"));
        setTransactionPostingStatusFilter(org.chocolate_milk.model.types.TransactionPostingStatusFilterType.fromValue("Either"));
        setTransactionPaidStatusFilter(org.chocolate_milk.model.types.TransactionPaidStatusFilterType.fromValue("Either"));
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
     * Returns the value of field 'maxReturned'.
     * 
     * @return the value of field 'MaxReturned'.
     */
    public long getMaxReturned(
    ) {
        return this._maxReturned;
    }

    /**
     * Returns the value of field 'transactionAccountFilter'.
     * 
     * @return the value of field 'TransactionAccountFilter'.
     */
    public org.chocolate_milk.model.TransactionAccountFilter getTransactionAccountFilter(
    ) {
        return this._transactionAccountFilter;
    }

    /**
     * Returns the value of field 'transactionClassFilter'.
     * 
     * @return the value of field 'TransactionClassFilter'.
     */
    public org.chocolate_milk.model.TransactionClassFilter getTransactionClassFilter(
    ) {
        return this._transactionClassFilter;
    }

    /**
     * Returns the value of field 'transactionDateRangeFilter'.
     * 
     * @return the value of field 'TransactionDateRangeFilter'.
     */
    public org.chocolate_milk.model.TransactionDateRangeFilter getTransactionDateRangeFilter(
    ) {
        return this._transactionDateRangeFilter;
    }

    /**
     * Returns the value of field 'transactionDetailLevelFilter'.
     * 
     * @return the value of field 'TransactionDetailLevelFilter'.
     */
    public org.chocolate_milk.model.types.TransactionDetailLevelFilterType getTransactionDetailLevelFilter(
    ) {
        return this._transactionDetailLevelFilter;
    }

    /**
     * Returns the value of field 'transactionEntityFilter'.
     * 
     * @return the value of field 'TransactionEntityFilter'.
     */
    public org.chocolate_milk.model.TransactionEntityFilter getTransactionEntityFilter(
    ) {
        return this._transactionEntityFilter;
    }

    /**
     * Returns the value of field 'transactionFilterChoice'.
     * 
     * @return the value of field 'TransactionFilterChoice'.
     */
    public org.chocolate_milk.model.TransactionFilterChoice getTransactionFilterChoice(
    ) {
        return this._transactionFilterChoice;
    }

    /**
     * Returns the value of field 'transactionItemFilter'.
     * 
     * @return the value of field 'TransactionItemFilter'.
     */
    public org.chocolate_milk.model.TransactionItemFilter getTransactionItemFilter(
    ) {
        return this._transactionItemFilter;
    }

    /**
     * Returns the value of field
     * 'transactionModifiedDateRangeFilter'.
     * 
     * @return the value of field
     * 'TransactionModifiedDateRangeFilter'.
     */
    public org.chocolate_milk.model.TransactionModifiedDateRangeFilter getTransactionModifiedDateRangeFilter(
    ) {
        return this._transactionModifiedDateRangeFilter;
    }

    /**
     * Returns the value of field 'transactionPaidStatusFilter'.
     * 
     * @return the value of field 'TransactionPaidStatusFilter'.
     */
    public org.chocolate_milk.model.types.TransactionPaidStatusFilterType getTransactionPaidStatusFilter(
    ) {
        return this._transactionPaidStatusFilter;
    }

    /**
     * Returns the value of field 'transactionPostingStatusFilter'.
     * 
     * @return the value of field 'TransactionPostingStatusFilter'.
     */
    public org.chocolate_milk.model.types.TransactionPostingStatusFilterType getTransactionPostingStatusFilter(
    ) {
        return this._transactionPostingStatusFilter;
    }

    /**
     * Returns the value of field 'transactionTypeFilter'.
     * 
     * @return the value of field 'TransactionTypeFilter'.
     */
    public org.chocolate_milk.model.TransactionTypeFilter getTransactionTypeFilter(
    ) {
        return this._transactionTypeFilter;
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
     * Sets the value of field 'transactionAccountFilter'.
     * 
     * @param transactionAccountFilter the value of field
     * 'transactionAccountFilter'.
     */
    public void setTransactionAccountFilter(
            final org.chocolate_milk.model.TransactionAccountFilter transactionAccountFilter) {
        this._transactionAccountFilter = transactionAccountFilter;
    }

    /**
     * Sets the value of field 'transactionClassFilter'.
     * 
     * @param transactionClassFilter the value of field
     * 'transactionClassFilter'.
     */
    public void setTransactionClassFilter(
            final org.chocolate_milk.model.TransactionClassFilter transactionClassFilter) {
        this._transactionClassFilter = transactionClassFilter;
    }

    /**
     * Sets the value of field 'transactionDateRangeFilter'.
     * 
     * @param transactionDateRangeFilter the value of field
     * 'transactionDateRangeFilter'.
     */
    public void setTransactionDateRangeFilter(
            final org.chocolate_milk.model.TransactionDateRangeFilter transactionDateRangeFilter) {
        this._transactionDateRangeFilter = transactionDateRangeFilter;
    }

    /**
     * Sets the value of field 'transactionDetailLevelFilter'.
     * 
     * @param transactionDetailLevelFilter the value of field
     * 'transactionDetailLevelFilter'.
     */
    public void setTransactionDetailLevelFilter(
            final org.chocolate_milk.model.types.TransactionDetailLevelFilterType transactionDetailLevelFilter) {
        this._transactionDetailLevelFilter = transactionDetailLevelFilter;
    }

    /**
     * Sets the value of field 'transactionEntityFilter'.
     * 
     * @param transactionEntityFilter the value of field
     * 'transactionEntityFilter'.
     */
    public void setTransactionEntityFilter(
            final org.chocolate_milk.model.TransactionEntityFilter transactionEntityFilter) {
        this._transactionEntityFilter = transactionEntityFilter;
    }

    /**
     * Sets the value of field 'transactionFilterChoice'.
     * 
     * @param transactionFilterChoice the value of field
     * 'transactionFilterChoice'.
     */
    public void setTransactionFilterChoice(
            final org.chocolate_milk.model.TransactionFilterChoice transactionFilterChoice) {
        this._transactionFilterChoice = transactionFilterChoice;
    }

    /**
     * Sets the value of field 'transactionItemFilter'.
     * 
     * @param transactionItemFilter the value of field
     * 'transactionItemFilter'.
     */
    public void setTransactionItemFilter(
            final org.chocolate_milk.model.TransactionItemFilter transactionItemFilter) {
        this._transactionItemFilter = transactionItemFilter;
    }

    /**
     * Sets the value of field
     * 'transactionModifiedDateRangeFilter'.
     * 
     * @param transactionModifiedDateRangeFilter the value of field
     * 'transactionModifiedDateRangeFilter'.
     */
    public void setTransactionModifiedDateRangeFilter(
            final org.chocolate_milk.model.TransactionModifiedDateRangeFilter transactionModifiedDateRangeFilter) {
        this._transactionModifiedDateRangeFilter = transactionModifiedDateRangeFilter;
    }

    /**
     * Sets the value of field 'transactionPaidStatusFilter'.
     * 
     * @param transactionPaidStatusFilter the value of field
     * 'transactionPaidStatusFilter'.
     */
    public void setTransactionPaidStatusFilter(
            final org.chocolate_milk.model.types.TransactionPaidStatusFilterType transactionPaidStatusFilter) {
        this._transactionPaidStatusFilter = transactionPaidStatusFilter;
    }

    /**
     * Sets the value of field 'transactionPostingStatusFilter'.
     * 
     * @param transactionPostingStatusFilter the value of field
     * 'transactionPostingStatusFilter'.
     */
    public void setTransactionPostingStatusFilter(
            final org.chocolate_milk.model.types.TransactionPostingStatusFilterType transactionPostingStatusFilter) {
        this._transactionPostingStatusFilter = transactionPostingStatusFilter;
    }

    /**
     * Sets the value of field 'transactionTypeFilter'.
     * 
     * @param transactionTypeFilter the value of field
     * 'transactionTypeFilter'.
     */
    public void setTransactionTypeFilter(
            final org.chocolate_milk.model.TransactionTypeFilter transactionTypeFilter) {
        this._transactionTypeFilter = transactionTypeFilter;
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
     * org.chocolate_milk.model.TransactionFilter
     */
    public static org.chocolate_milk.model.TransactionFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TransactionFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TransactionFilter.class, reader);
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
