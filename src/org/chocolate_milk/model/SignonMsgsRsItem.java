/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SignonMsgsRsItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SignonMsgsRsItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SignonMsgsRsItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _signonAppCertRs.
     */
    private org.chocolate_milk.model.SignonAppCertRs _signonAppCertRs;

    /**
     * Field _signonDesktopRs.
     */
    private org.chocolate_milk.model.SignonDesktopRs _signonDesktopRs;

    /**
     * Field _signonTicketRs.
     */
    private org.chocolate_milk.model.SignonTicketRs _signonTicketRs;


      //----------------/
     //- Constructors -/
    //----------------/

    public SignonMsgsRsItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'signonAppCertRs'.
     * 
     * @return the value of field 'SignonAppCertRs'.
     */
    public org.chocolate_milk.model.SignonAppCertRs getSignonAppCertRs(
    ) {
        return this._signonAppCertRs;
    }

    /**
     * Returns the value of field 'signonDesktopRs'.
     * 
     * @return the value of field 'SignonDesktopRs'.
     */
    public org.chocolate_milk.model.SignonDesktopRs getSignonDesktopRs(
    ) {
        return this._signonDesktopRs;
    }

    /**
     * Returns the value of field 'signonTicketRs'.
     * 
     * @return the value of field 'SignonTicketRs'.
     */
    public org.chocolate_milk.model.SignonTicketRs getSignonTicketRs(
    ) {
        return this._signonTicketRs;
    }

    /**
     * Sets the value of field 'signonAppCertRs'.
     * 
     * @param signonAppCertRs the value of field 'signonAppCertRs'.
     */
    public void setSignonAppCertRs(
            final org.chocolate_milk.model.SignonAppCertRs signonAppCertRs) {
        this._signonAppCertRs = signonAppCertRs;
        this._choiceValue = signonAppCertRs;
    }

    /**
     * Sets the value of field 'signonDesktopRs'.
     * 
     * @param signonDesktopRs the value of field 'signonDesktopRs'.
     */
    public void setSignonDesktopRs(
            final org.chocolate_milk.model.SignonDesktopRs signonDesktopRs) {
        this._signonDesktopRs = signonDesktopRs;
        this._choiceValue = signonDesktopRs;
    }

    /**
     * Sets the value of field 'signonTicketRs'.
     * 
     * @param signonTicketRs the value of field 'signonTicketRs'.
     */
    public void setSignonTicketRs(
            final org.chocolate_milk.model.SignonTicketRs signonTicketRs) {
        this._signonTicketRs = signonTicketRs;
        this._choiceValue = signonTicketRs;
    }

}
