/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JournalEntryAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JournalEntryAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class JournalEntryAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _isAdjustment.
     */
    private java.lang.String _isAdjustment;

    /**
     * Field _journalEntryAddChoice.
     */
    private org.chocolate_milk.model.JournalEntryAddChoice _journalEntryAddChoice;

    /**
     * Field _journalEntryAddChoice2.
     */
    private org.chocolate_milk.model.JournalEntryAddChoice2 _journalEntryAddChoice2;


      //----------------/
     //- Constructors -/
    //----------------/

    public JournalEntryAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'defMacro'.
     * 
     * @return the value of field 'DefMacro'.
     */
    public java.lang.String getDefMacro(
    ) {
        return this._defMacro;
    }

    /**
     * Returns the value of field 'isAdjustment'.
     * 
     * @return the value of field 'IsAdjustment'.
     */
    public java.lang.String getIsAdjustment(
    ) {
        return this._isAdjustment;
    }

    /**
     * Returns the value of field 'journalEntryAddChoice'.
     * 
     * @return the value of field 'JournalEntryAddChoice'.
     */
    public org.chocolate_milk.model.JournalEntryAddChoice getJournalEntryAddChoice(
    ) {
        return this._journalEntryAddChoice;
    }

    /**
     * Returns the value of field 'journalEntryAddChoice2'.
     * 
     * @return the value of field 'JournalEntryAddChoice2'.
     */
    public org.chocolate_milk.model.JournalEntryAddChoice2 getJournalEntryAddChoice2(
    ) {
        return this._journalEntryAddChoice2;
    }

    /**
     * Returns the value of field 'memo'.
     * 
     * @return the value of field 'Memo'.
     */
    public java.lang.String getMemo(
    ) {
        return this._memo;
    }

    /**
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
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
     * Sets the value of field 'defMacro'.
     * 
     * @param defMacro the value of field 'defMacro'.
     */
    public void setDefMacro(
            final java.lang.String defMacro) {
        this._defMacro = defMacro;
    }

    /**
     * Sets the value of field 'isAdjustment'.
     * 
     * @param isAdjustment the value of field 'isAdjustment'.
     */
    public void setIsAdjustment(
            final java.lang.String isAdjustment) {
        this._isAdjustment = isAdjustment;
    }

    /**
     * Sets the value of field 'journalEntryAddChoice'.
     * 
     * @param journalEntryAddChoice the value of field
     * 'journalEntryAddChoice'.
     */
    public void setJournalEntryAddChoice(
            final org.chocolate_milk.model.JournalEntryAddChoice journalEntryAddChoice) {
        this._journalEntryAddChoice = journalEntryAddChoice;
    }

    /**
     * Sets the value of field 'journalEntryAddChoice2'.
     * 
     * @param journalEntryAddChoice2 the value of field
     * 'journalEntryAddChoice2'.
     */
    public void setJournalEntryAddChoice2(
            final org.chocolate_milk.model.JournalEntryAddChoice2 journalEntryAddChoice2) {
        this._journalEntryAddChoice2 = journalEntryAddChoice2;
    }

    /**
     * Sets the value of field 'memo'.
     * 
     * @param memo the value of field 'memo'.
     */
    public void setMemo(
            final java.lang.String memo) {
        this._memo = memo;
    }

    /**
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
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
     * org.chocolate_milk.model.JournalEntryAdd
     */
    public static org.chocolate_milk.model.JournalEntryAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JournalEntryAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JournalEntryAdd.class, reader);
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
