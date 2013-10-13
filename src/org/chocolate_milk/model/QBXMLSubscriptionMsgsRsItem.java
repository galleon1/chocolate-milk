/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSubscriptionMsgsRsItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLSubscriptionMsgsRsItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class QBXMLSubscriptionMsgsRsItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _dataEventSubscriptionAddRs.
     */
    private org.chocolate_milk.model.DataEventSubscriptionAddRs _dataEventSubscriptionAddRs;

    /**
     * Field _dataEventSubscriptionQueryRs.
     */
    private org.chocolate_milk.model.DataEventSubscriptionQueryRs _dataEventSubscriptionQueryRs;

    /**
     * Field _UIEventSubscriptionAddRs.
     */
    private org.chocolate_milk.model.UIEventSubscriptionAddRs _UIEventSubscriptionAddRs;

    /**
     * Field _UIEventSubscriptionQueryRs.
     */
    private org.chocolate_milk.model.UIEventSubscriptionQueryRs _UIEventSubscriptionQueryRs;

    /**
     * Field _UIExtensionSubscriptionAddRs.
     */
    private org.chocolate_milk.model.UIExtensionSubscriptionAddRs _UIExtensionSubscriptionAddRs;

    /**
     * Field _UIExtensionSubscriptionQueryRs.
     */
    private org.chocolate_milk.model.UIExtensionSubscriptionQueryRs _UIExtensionSubscriptionQueryRs;

    /**
     * Field _subscriptionDelRs.
     */
    private org.chocolate_milk.model.SubscriptionDelRs _subscriptionDelRs;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLSubscriptionMsgsRsItem() {
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
     * Returns the value of field 'dataEventSubscriptionAddRs'.
     * 
     * @return the value of field 'DataEventSubscriptionAddRs'.
     */
    public org.chocolate_milk.model.DataEventSubscriptionAddRs getDataEventSubscriptionAddRs(
    ) {
        return this._dataEventSubscriptionAddRs;
    }

    /**
     * Returns the value of field 'dataEventSubscriptionQueryRs'.
     * 
     * @return the value of field 'DataEventSubscriptionQueryRs'.
     */
    public org.chocolate_milk.model.DataEventSubscriptionQueryRs getDataEventSubscriptionQueryRs(
    ) {
        return this._dataEventSubscriptionQueryRs;
    }

    /**
     * Returns the value of field 'subscriptionDelRs'.
     * 
     * @return the value of field 'SubscriptionDelRs'.
     */
    public org.chocolate_milk.model.SubscriptionDelRs getSubscriptionDelRs(
    ) {
        return this._subscriptionDelRs;
    }

    /**
     * Returns the value of field 'UIEventSubscriptionAddRs'.
     * 
     * @return the value of field 'UIEventSubscriptionAddRs'.
     */
    public org.chocolate_milk.model.UIEventSubscriptionAddRs getUIEventSubscriptionAddRs(
    ) {
        return this._UIEventSubscriptionAddRs;
    }

    /**
     * Returns the value of field 'UIEventSubscriptionQueryRs'.
     * 
     * @return the value of field 'UIEventSubscriptionQueryRs'.
     */
    public org.chocolate_milk.model.UIEventSubscriptionQueryRs getUIEventSubscriptionQueryRs(
    ) {
        return this._UIEventSubscriptionQueryRs;
    }

    /**
     * Returns the value of field 'UIExtensionSubscriptionAddRs'.
     * 
     * @return the value of field 'UIExtensionSubscriptionAddRs'.
     */
    public org.chocolate_milk.model.UIExtensionSubscriptionAddRs getUIExtensionSubscriptionAddRs(
    ) {
        return this._UIExtensionSubscriptionAddRs;
    }

    /**
     * Returns the value of field 'UIExtensionSubscriptionQueryRs'.
     * 
     * @return the value of field 'UIExtensionSubscriptionQueryRs'.
     */
    public org.chocolate_milk.model.UIExtensionSubscriptionQueryRs getUIExtensionSubscriptionQueryRs(
    ) {
        return this._UIExtensionSubscriptionQueryRs;
    }

    /**
     * Sets the value of field 'dataEventSubscriptionAddRs'.
     * 
     * @param dataEventSubscriptionAddRs the value of field
     * 'dataEventSubscriptionAddRs'.
     */
    public void setDataEventSubscriptionAddRs(
            final org.chocolate_milk.model.DataEventSubscriptionAddRs dataEventSubscriptionAddRs) {
        this._dataEventSubscriptionAddRs = dataEventSubscriptionAddRs;
        this._choiceValue = dataEventSubscriptionAddRs;
    }

    /**
     * Sets the value of field 'dataEventSubscriptionQueryRs'.
     * 
     * @param dataEventSubscriptionQueryRs the value of field
     * 'dataEventSubscriptionQueryRs'.
     */
    public void setDataEventSubscriptionQueryRs(
            final org.chocolate_milk.model.DataEventSubscriptionQueryRs dataEventSubscriptionQueryRs) {
        this._dataEventSubscriptionQueryRs = dataEventSubscriptionQueryRs;
        this._choiceValue = dataEventSubscriptionQueryRs;
    }

    /**
     * Sets the value of field 'subscriptionDelRs'.
     * 
     * @param subscriptionDelRs the value of field
     * 'subscriptionDelRs'.
     */
    public void setSubscriptionDelRs(
            final org.chocolate_milk.model.SubscriptionDelRs subscriptionDelRs) {
        this._subscriptionDelRs = subscriptionDelRs;
        this._choiceValue = subscriptionDelRs;
    }

    /**
     * Sets the value of field 'UIEventSubscriptionAddRs'.
     * 
     * @param UIEventSubscriptionAddRs the value of field
     * 'UIEventSubscriptionAddRs'.
     */
    public void setUIEventSubscriptionAddRs(
            final org.chocolate_milk.model.UIEventSubscriptionAddRs UIEventSubscriptionAddRs) {
        this._UIEventSubscriptionAddRs = UIEventSubscriptionAddRs;
        this._choiceValue = UIEventSubscriptionAddRs;
    }

    /**
     * Sets the value of field 'UIEventSubscriptionQueryRs'.
     * 
     * @param UIEventSubscriptionQueryRs the value of field
     * 'UIEventSubscriptionQueryRs'.
     */
    public void setUIEventSubscriptionQueryRs(
            final org.chocolate_milk.model.UIEventSubscriptionQueryRs UIEventSubscriptionQueryRs) {
        this._UIEventSubscriptionQueryRs = UIEventSubscriptionQueryRs;
        this._choiceValue = UIEventSubscriptionQueryRs;
    }

    /**
     * Sets the value of field 'UIExtensionSubscriptionAddRs'.
     * 
     * @param UIExtensionSubscriptionAddRs the value of field
     * 'UIExtensionSubscriptionAddRs'.
     */
    public void setUIExtensionSubscriptionAddRs(
            final org.chocolate_milk.model.UIExtensionSubscriptionAddRs UIExtensionSubscriptionAddRs) {
        this._UIExtensionSubscriptionAddRs = UIExtensionSubscriptionAddRs;
        this._choiceValue = UIExtensionSubscriptionAddRs;
    }

    /**
     * Sets the value of field 'UIExtensionSubscriptionQueryRs'.
     * 
     * @param UIExtensionSubscriptionQueryRs the value of field
     * 'UIExtensionSubscriptionQueryRs'.
     */
    public void setUIExtensionSubscriptionQueryRs(
            final org.chocolate_milk.model.UIExtensionSubscriptionQueryRs UIExtensionSubscriptionQueryRs) {
        this._UIExtensionSubscriptionQueryRs = UIExtensionSubscriptionQueryRs;
        this._choiceValue = UIExtensionSubscriptionQueryRs;
    }

}
