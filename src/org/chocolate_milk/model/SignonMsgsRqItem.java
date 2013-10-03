/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SignonMsgsRqItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SignonMsgsRqItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SignonMsgsRqItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _signonAppCertRq.
     */
    private org.chocolate_milk.model.SignonAppCertRq _signonAppCertRq;

    /**
     * Field _signonDesktopRq.
     */
    private org.chocolate_milk.model.SignonDesktopRq _signonDesktopRq;

    /**
     * Field _signonTicketRq.
     */
    private org.chocolate_milk.model.SignonTicketRq _signonTicketRq;


      //----------------/
     //- Constructors -/
    //----------------/

    public SignonMsgsRqItem() {
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
     * Returns the value of field 'signonAppCertRq'.
     * 
     * @return the value of field 'SignonAppCertRq'.
     */
    public org.chocolate_milk.model.SignonAppCertRq getSignonAppCertRq(
    ) {
        return this._signonAppCertRq;
    }

    /**
     * Returns the value of field 'signonDesktopRq'.
     * 
     * @return the value of field 'SignonDesktopRq'.
     */
    public org.chocolate_milk.model.SignonDesktopRq getSignonDesktopRq(
    ) {
        return this._signonDesktopRq;
    }

    /**
     * Returns the value of field 'signonTicketRq'.
     * 
     * @return the value of field 'SignonTicketRq'.
     */
    public org.chocolate_milk.model.SignonTicketRq getSignonTicketRq(
    ) {
        return this._signonTicketRq;
    }

    /**
     * Sets the value of field 'signonAppCertRq'.
     * 
     * @param signonAppCertRq the value of field 'signonAppCertRq'.
     */
    public void setSignonAppCertRq(
            final org.chocolate_milk.model.SignonAppCertRq signonAppCertRq) {
        this._signonAppCertRq = signonAppCertRq;
        this._choiceValue = signonAppCertRq;
    }

    /**
     * Sets the value of field 'signonDesktopRq'.
     * 
     * @param signonDesktopRq the value of field 'signonDesktopRq'.
     */
    public void setSignonDesktopRq(
            final org.chocolate_milk.model.SignonDesktopRq signonDesktopRq) {
        this._signonDesktopRq = signonDesktopRq;
        this._choiceValue = signonDesktopRq;
    }

    /**
     * Sets the value of field 'signonTicketRq'.
     * 
     * @param signonTicketRq the value of field 'signonTicketRq'.
     */
    public void setSignonTicketRq(
            final org.chocolate_milk.model.SignonTicketRq signonTicketRq) {
        this._signonTicketRq = signonTicketRq;
        this._choiceValue = signonTicketRq;
    }

}
