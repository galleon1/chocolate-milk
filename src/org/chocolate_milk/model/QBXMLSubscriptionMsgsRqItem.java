/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSubscriptionMsgsRqItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLSubscriptionMsgsRqItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class QBXMLSubscriptionMsgsRqItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _dataEventSubscriptionAddRq.
     */
    private org.chocolate_milk.model.DataEventSubscriptionAddRq _dataEventSubscriptionAddRq;

    /**
     * Field _dataEventSubscriptionQueryRq.
     */
    private org.chocolate_milk.model.DataEventSubscriptionQueryRq _dataEventSubscriptionQueryRq;

    /**
     * Field _UIEventSubscriptionAddRq.
     */
    private org.chocolate_milk.model.UIEventSubscriptionAddRq _UIEventSubscriptionAddRq;

    /**
     * Field _UIEventSubscriptionQueryRq.
     */
    private org.chocolate_milk.model.UIEventSubscriptionQueryRq _UIEventSubscriptionQueryRq;

    /**
     * Field _UIExtensionSubscriptionAddRq.
     */
    private org.chocolate_milk.model.UIExtensionSubscriptionAddRq _UIExtensionSubscriptionAddRq;

    /**
     * Field _UIExtensionSubscriptionQueryRq.
     */
    private org.chocolate_milk.model.UIExtensionSubscriptionQueryRq _UIExtensionSubscriptionQueryRq;

    /**
     * Field _subscriptionDelRq.
     */
    private org.chocolate_milk.model.SubscriptionDelRq _subscriptionDelRq;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLSubscriptionMsgsRqItem() {
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
     * Returns the value of field 'dataEventSubscriptionAddRq'.
     * 
     * @return the value of field 'DataEventSubscriptionAddRq'.
     */
    public org.chocolate_milk.model.DataEventSubscriptionAddRq getDataEventSubscriptionAddRq(
    ) {
        return this._dataEventSubscriptionAddRq;
    }

    /**
     * Returns the value of field 'dataEventSubscriptionQueryRq'.
     * 
     * @return the value of field 'DataEventSubscriptionQueryRq'.
     */
    public org.chocolate_milk.model.DataEventSubscriptionQueryRq getDataEventSubscriptionQueryRq(
    ) {
        return this._dataEventSubscriptionQueryRq;
    }

    /**
     * Returns the value of field 'subscriptionDelRq'.
     * 
     * @return the value of field 'SubscriptionDelRq'.
     */
    public org.chocolate_milk.model.SubscriptionDelRq getSubscriptionDelRq(
    ) {
        return this._subscriptionDelRq;
    }

    /**
     * Returns the value of field 'UIEventSubscriptionAddRq'.
     * 
     * @return the value of field 'UIEventSubscriptionAddRq'.
     */
    public org.chocolate_milk.model.UIEventSubscriptionAddRq getUIEventSubscriptionAddRq(
    ) {
        return this._UIEventSubscriptionAddRq;
    }

    /**
     * Returns the value of field 'UIEventSubscriptionQueryRq'.
     * 
     * @return the value of field 'UIEventSubscriptionQueryRq'.
     */
    public org.chocolate_milk.model.UIEventSubscriptionQueryRq getUIEventSubscriptionQueryRq(
    ) {
        return this._UIEventSubscriptionQueryRq;
    }

    /**
     * Returns the value of field 'UIExtensionSubscriptionAddRq'.
     * 
     * @return the value of field 'UIExtensionSubscriptionAddRq'.
     */
    public org.chocolate_milk.model.UIExtensionSubscriptionAddRq getUIExtensionSubscriptionAddRq(
    ) {
        return this._UIExtensionSubscriptionAddRq;
    }

    /**
     * Returns the value of field 'UIExtensionSubscriptionQueryRq'.
     * 
     * @return the value of field 'UIExtensionSubscriptionQueryRq'.
     */
    public org.chocolate_milk.model.UIExtensionSubscriptionQueryRq getUIExtensionSubscriptionQueryRq(
    ) {
        return this._UIExtensionSubscriptionQueryRq;
    }

    /**
     * Sets the value of field 'dataEventSubscriptionAddRq'.
     * 
     * @param dataEventSubscriptionAddRq the value of field
     * 'dataEventSubscriptionAddRq'.
     */
    public void setDataEventSubscriptionAddRq(
            final org.chocolate_milk.model.DataEventSubscriptionAddRq dataEventSubscriptionAddRq) {
        this._dataEventSubscriptionAddRq = dataEventSubscriptionAddRq;
        this._choiceValue = dataEventSubscriptionAddRq;
    }

    /**
     * Sets the value of field 'dataEventSubscriptionQueryRq'.
     * 
     * @param dataEventSubscriptionQueryRq the value of field
     * 'dataEventSubscriptionQueryRq'.
     */
    public void setDataEventSubscriptionQueryRq(
            final org.chocolate_milk.model.DataEventSubscriptionQueryRq dataEventSubscriptionQueryRq) {
        this._dataEventSubscriptionQueryRq = dataEventSubscriptionQueryRq;
        this._choiceValue = dataEventSubscriptionQueryRq;
    }

    /**
     * Sets the value of field 'subscriptionDelRq'.
     * 
     * @param subscriptionDelRq the value of field
     * 'subscriptionDelRq'.
     */
    public void setSubscriptionDelRq(
            final org.chocolate_milk.model.SubscriptionDelRq subscriptionDelRq) {
        this._subscriptionDelRq = subscriptionDelRq;
        this._choiceValue = subscriptionDelRq;
    }

    /**
     * Sets the value of field 'UIEventSubscriptionAddRq'.
     * 
     * @param UIEventSubscriptionAddRq the value of field
     * 'UIEventSubscriptionAddRq'.
     */
    public void setUIEventSubscriptionAddRq(
            final org.chocolate_milk.model.UIEventSubscriptionAddRq UIEventSubscriptionAddRq) {
        this._UIEventSubscriptionAddRq = UIEventSubscriptionAddRq;
        this._choiceValue = UIEventSubscriptionAddRq;
    }

    /**
     * Sets the value of field 'UIEventSubscriptionQueryRq'.
     * 
     * @param UIEventSubscriptionQueryRq the value of field
     * 'UIEventSubscriptionQueryRq'.
     */
    public void setUIEventSubscriptionQueryRq(
            final org.chocolate_milk.model.UIEventSubscriptionQueryRq UIEventSubscriptionQueryRq) {
        this._UIEventSubscriptionQueryRq = UIEventSubscriptionQueryRq;
        this._choiceValue = UIEventSubscriptionQueryRq;
    }

    /**
     * Sets the value of field 'UIExtensionSubscriptionAddRq'.
     * 
     * @param UIExtensionSubscriptionAddRq the value of field
     * 'UIExtensionSubscriptionAddRq'.
     */
    public void setUIExtensionSubscriptionAddRq(
            final org.chocolate_milk.model.UIExtensionSubscriptionAddRq UIExtensionSubscriptionAddRq) {
        this._UIExtensionSubscriptionAddRq = UIExtensionSubscriptionAddRq;
        this._choiceValue = UIExtensionSubscriptionAddRq;
    }

    /**
     * Sets the value of field 'UIExtensionSubscriptionQueryRq'.
     * 
     * @param UIExtensionSubscriptionQueryRq the value of field
     * 'UIExtensionSubscriptionQueryRq'.
     */
    public void setUIExtensionSubscriptionQueryRq(
            final org.chocolate_milk.model.UIExtensionSubscriptionQueryRq UIExtensionSubscriptionQueryRq) {
        this._UIExtensionSubscriptionQueryRq = UIExtensionSubscriptionQueryRq;
        this._choiceValue = UIExtensionSubscriptionQueryRq;
    }

}
