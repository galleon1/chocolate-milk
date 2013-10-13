/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: UIEventSubscriptionAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class UIEventSubscriptionAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class UIEventSubscriptionAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _subscriberID.
     */
    private java.lang.String _subscriberID;

    /**
     * Field _COMCallbackInfo.
     */
    private org.chocolate_milk.model.COMCallbackInfo _COMCallbackInfo;

    /**
     * Field _deliveryPolicy.
     */
    private org.chocolate_milk.model.types.DeliveryPolicyType _deliveryPolicy;

    /**
     * Field _companyFileEventSubscription.
     */
    private org.chocolate_milk.model.CompanyFileEventSubscription _companyFileEventSubscription;


      //----------------/
     //- Constructors -/
    //----------------/

    public UIEventSubscriptionAdd() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'COMCallbackInfo'.
     * 
     * @return the value of field 'COMCallbackInfo'.
     */
    public org.chocolate_milk.model.COMCallbackInfo getCOMCallbackInfo(
    ) {
        return this._COMCallbackInfo;
    }

    /**
     * Returns the value of field 'companyFileEventSubscription'.
     * 
     * @return the value of field 'CompanyFileEventSubscription'.
     */
    public org.chocolate_milk.model.CompanyFileEventSubscription getCompanyFileEventSubscription(
    ) {
        return this._companyFileEventSubscription;
    }

    /**
     * Returns the value of field 'deliveryPolicy'.
     * 
     * @return the value of field 'DeliveryPolicy'.
     */
    public org.chocolate_milk.model.types.DeliveryPolicyType getDeliveryPolicy(
    ) {
        return this._deliveryPolicy;
    }

    /**
     * Returns the value of field 'subscriberID'.
     * 
     * @return the value of field 'SubscriberID'.
     */
    public java.lang.String getSubscriberID(
    ) {
        return this._subscriberID;
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
     * Sets the value of field 'COMCallbackInfo'.
     * 
     * @param COMCallbackInfo the value of field 'COMCallbackInfo'.
     */
    public void setCOMCallbackInfo(
            final org.chocolate_milk.model.COMCallbackInfo COMCallbackInfo) {
        this._COMCallbackInfo = COMCallbackInfo;
    }

    /**
     * Sets the value of field 'companyFileEventSubscription'.
     * 
     * @param companyFileEventSubscription the value of field
     * 'companyFileEventSubscription'.
     */
    public void setCompanyFileEventSubscription(
            final org.chocolate_milk.model.CompanyFileEventSubscription companyFileEventSubscription) {
        this._companyFileEventSubscription = companyFileEventSubscription;
    }

    /**
     * Sets the value of field 'deliveryPolicy'.
     * 
     * @param deliveryPolicy the value of field 'deliveryPolicy'.
     */
    public void setDeliveryPolicy(
            final org.chocolate_milk.model.types.DeliveryPolicyType deliveryPolicy) {
        this._deliveryPolicy = deliveryPolicy;
    }

    /**
     * Sets the value of field 'subscriberID'.
     * 
     * @param subscriberID the value of field 'subscriberID'.
     */
    public void setSubscriberID(
            final java.lang.String subscriberID) {
        this._subscriberID = subscriberID;
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
     * org.chocolate_milk.model.UIEventSubscriptionAdd
     */
    public static org.chocolate_milk.model.UIEventSubscriptionAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.UIEventSubscriptionAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.UIEventSubscriptionAdd.class, reader);
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
