/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AccountingPreferences.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AccountingPreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class AccountingPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isUsingAccountNumbers.
     */
    private java.lang.String _isUsingAccountNumbers;

    /**
     * Field _isRequiringAccounts.
     */
    private java.lang.String _isRequiringAccounts;

    /**
     * Field _isUsingClassTracking.
     */
    private java.lang.String _isUsingClassTracking;

    /**
     * Field _isUsingAuditTrail.
     */
    private java.lang.String _isUsingAuditTrail;

    /**
     * Field _isAssigningJournalEntryNumbers.
     */
    private java.lang.String _isAssigningJournalEntryNumbers;

    /**
     * Field _closingDate.
     */
    private java.lang.String _closingDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public AccountingPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'closingDate'.
     * 
     * @return the value of field 'ClosingDate'.
     */
    public java.lang.String getClosingDate(
    ) {
        return this._closingDate;
    }

    /**
     * Returns the value of field 'isAssigningJournalEntryNumbers'.
     * 
     * @return the value of field 'IsAssigningJournalEntryNumbers'.
     */
    public java.lang.String getIsAssigningJournalEntryNumbers(
    ) {
        return this._isAssigningJournalEntryNumbers;
    }

    /**
     * Returns the value of field 'isRequiringAccounts'.
     * 
     * @return the value of field 'IsRequiringAccounts'.
     */
    public java.lang.String getIsRequiringAccounts(
    ) {
        return this._isRequiringAccounts;
    }

    /**
     * Returns the value of field 'isUsingAccountNumbers'.
     * 
     * @return the value of field 'IsUsingAccountNumbers'.
     */
    public java.lang.String getIsUsingAccountNumbers(
    ) {
        return this._isUsingAccountNumbers;
    }

    /**
     * Returns the value of field 'isUsingAuditTrail'.
     * 
     * @return the value of field 'IsUsingAuditTrail'.
     */
    public java.lang.String getIsUsingAuditTrail(
    ) {
        return this._isUsingAuditTrail;
    }

    /**
     * Returns the value of field 'isUsingClassTracking'.
     * 
     * @return the value of field 'IsUsingClassTracking'.
     */
    public java.lang.String getIsUsingClassTracking(
    ) {
        return this._isUsingClassTracking;
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
     * Sets the value of field 'closingDate'.
     * 
     * @param closingDate the value of field 'closingDate'.
     */
    public void setClosingDate(
            final java.lang.String closingDate) {
        this._closingDate = closingDate;
    }

    /**
     * Sets the value of field 'isAssigningJournalEntryNumbers'.
     * 
     * @param isAssigningJournalEntryNumbers the value of field
     * 'isAssigningJournalEntryNumbers'.
     */
    public void setIsAssigningJournalEntryNumbers(
            final java.lang.String isAssigningJournalEntryNumbers) {
        this._isAssigningJournalEntryNumbers = isAssigningJournalEntryNumbers;
    }

    /**
     * Sets the value of field 'isRequiringAccounts'.
     * 
     * @param isRequiringAccounts the value of field
     * 'isRequiringAccounts'.
     */
    public void setIsRequiringAccounts(
            final java.lang.String isRequiringAccounts) {
        this._isRequiringAccounts = isRequiringAccounts;
    }

    /**
     * Sets the value of field 'isUsingAccountNumbers'.
     * 
     * @param isUsingAccountNumbers the value of field
     * 'isUsingAccountNumbers'.
     */
    public void setIsUsingAccountNumbers(
            final java.lang.String isUsingAccountNumbers) {
        this._isUsingAccountNumbers = isUsingAccountNumbers;
    }

    /**
     * Sets the value of field 'isUsingAuditTrail'.
     * 
     * @param isUsingAuditTrail the value of field
     * 'isUsingAuditTrail'.
     */
    public void setIsUsingAuditTrail(
            final java.lang.String isUsingAuditTrail) {
        this._isUsingAuditTrail = isUsingAuditTrail;
    }

    /**
     * Sets the value of field 'isUsingClassTracking'.
     * 
     * @param isUsingClassTracking the value of field
     * 'isUsingClassTracking'.
     */
    public void setIsUsingClassTracking(
            final java.lang.String isUsingClassTracking) {
        this._isUsingClassTracking = isUsingClassTracking;
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
     * org.chocolate_milk.model.AccountingPreferences
     */
    public static org.chocolate_milk.model.AccountingPreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.AccountingPreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.AccountingPreferences.class, reader);
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
