/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JournalEntryRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JournalEntryRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class JournalEntryRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _journalDebitLine.
     */
    private org.chocolate_milk.model.JournalDebitLine _journalDebitLine;

    /**
     * Field _journalCreditLine.
     */
    private org.chocolate_milk.model.JournalCreditLine _journalCreditLine;


      //----------------/
     //- Constructors -/
    //----------------/

    public JournalEntryRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'journalCreditLine'.
     * 
     * @return the value of field 'JournalCreditLine'.
     */
    public org.chocolate_milk.model.JournalCreditLine getJournalCreditLine(
    ) {
        return this._journalCreditLine;
    }

    /**
     * Returns the value of field 'journalDebitLine'.
     * 
     * @return the value of field 'JournalDebitLine'.
     */
    public org.chocolate_milk.model.JournalDebitLine getJournalDebitLine(
    ) {
        return this._journalDebitLine;
    }

    /**
     * Sets the value of field 'journalCreditLine'.
     * 
     * @param journalCreditLine the value of field
     * 'journalCreditLine'.
     */
    public void setJournalCreditLine(
            final org.chocolate_milk.model.JournalCreditLine journalCreditLine) {
        this._journalCreditLine = journalCreditLine;
    }

    /**
     * Sets the value of field 'journalDebitLine'.
     * 
     * @param journalDebitLine the value of field 'journalDebitLine'
     */
    public void setJournalDebitLine(
            final org.chocolate_milk.model.JournalDebitLine journalDebitLine) {
        this._journalDebitLine = journalDebitLine;
    }

}
