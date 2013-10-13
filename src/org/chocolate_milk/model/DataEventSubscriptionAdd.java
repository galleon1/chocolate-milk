/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataEventSubscriptionAdd.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataEventSubscriptionAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class DataEventSubscriptionAdd implements java.io.Serializable {


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
     * Field _trackLostEvents.
     */
    private org.chocolate_milk.model.types.TrackLostEventsType _trackLostEvents = org.chocolate_milk.model.types.TrackLostEventsType.fromValue("None");

    /**
     * Field _deliverOwnEvents.
     */
    private java.lang.String _deliverOwnEvents;

    /**
     * Field _listEventSubscriptionList.
     */
    private java.util.List<org.chocolate_milk.model.ListEventSubscription> _listEventSubscriptionList;

    /**
     * Field _txnEventSubscriptionList.
     */
    private java.util.List<org.chocolate_milk.model.TxnEventSubscription> _txnEventSubscriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataEventSubscriptionAdd() {
        super();
        setTrackLostEvents(org.chocolate_milk.model.types.TrackLostEventsType.fromValue("None"));
        this._listEventSubscriptionList = new java.util.ArrayList<org.chocolate_milk.model.ListEventSubscription>();
        this._txnEventSubscriptionList = new java.util.ArrayList<org.chocolate_milk.model.TxnEventSubscription>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vListEventSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListEventSubscription(
            final org.chocolate_milk.model.ListEventSubscription vListEventSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._listEventSubscriptionList.add(vListEventSubscription);
    }

    /**
     * 
     * 
     * @param index
     * @param vListEventSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListEventSubscription(
            final int index,
            final org.chocolate_milk.model.ListEventSubscription vListEventSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._listEventSubscriptionList.add(index, vListEventSubscription);
    }

    /**
     * 
     * 
     * @param vTxnEventSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnEventSubscription(
            final org.chocolate_milk.model.TxnEventSubscription vTxnEventSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._txnEventSubscriptionList.add(vTxnEventSubscription);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnEventSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnEventSubscription(
            final int index,
            final org.chocolate_milk.model.TxnEventSubscription vTxnEventSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._txnEventSubscriptionList.add(index, vTxnEventSubscription);
    }

    /**
     * Method enumerateListEventSubscription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ListEventSubscription> enumerateListEventSubscription(
    ) {
        return java.util.Collections.enumeration(this._listEventSubscriptionList);
    }

    /**
     * Method enumerateTxnEventSubscription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.TxnEventSubscription> enumerateTxnEventSubscription(
    ) {
        return java.util.Collections.enumeration(this._txnEventSubscriptionList);
    }

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
     * Returns the value of field 'deliverOwnEvents'.
     * 
     * @return the value of field 'DeliverOwnEvents'.
     */
    public java.lang.String getDeliverOwnEvents(
    ) {
        return this._deliverOwnEvents;
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
     * Method getListEventSubscription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ListEventSubscription at the given
     * index
     */
    public org.chocolate_milk.model.ListEventSubscription getListEventSubscription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listEventSubscriptionList.size()) {
            throw new IndexOutOfBoundsException("getListEventSubscription: Index value '" + index + "' not in range [0.." + (this._listEventSubscriptionList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ListEventSubscription) _listEventSubscriptionList.get(index);
    }

    /**
     * Method getListEventSubscription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ListEventSubscription[] getListEventSubscription(
    ) {
        org.chocolate_milk.model.ListEventSubscription[] array = new org.chocolate_milk.model.ListEventSubscription[0];
        return (org.chocolate_milk.model.ListEventSubscription[]) this._listEventSubscriptionList.toArray(array);
    }

    /**
     * Method getListEventSubscriptionCount.
     * 
     * @return the size of this collection
     */
    public int getListEventSubscriptionCount(
    ) {
        return this._listEventSubscriptionList.size();
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
     * Returns the value of field 'trackLostEvents'.
     * 
     * @return the value of field 'TrackLostEvents'.
     */
    public org.chocolate_milk.model.types.TrackLostEventsType getTrackLostEvents(
    ) {
        return this._trackLostEvents;
    }

    /**
     * Method getTxnEventSubscription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.TxnEventSubscription at the given
     * index
     */
    public org.chocolate_milk.model.TxnEventSubscription getTxnEventSubscription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnEventSubscriptionList.size()) {
            throw new IndexOutOfBoundsException("getTxnEventSubscription: Index value '" + index + "' not in range [0.." + (this._txnEventSubscriptionList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.TxnEventSubscription) _txnEventSubscriptionList.get(index);
    }

    /**
     * Method getTxnEventSubscription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.TxnEventSubscription[] getTxnEventSubscription(
    ) {
        org.chocolate_milk.model.TxnEventSubscription[] array = new org.chocolate_milk.model.TxnEventSubscription[0];
        return (org.chocolate_milk.model.TxnEventSubscription[]) this._txnEventSubscriptionList.toArray(array);
    }

    /**
     * Method getTxnEventSubscriptionCount.
     * 
     * @return the size of this collection
     */
    public int getTxnEventSubscriptionCount(
    ) {
        return this._txnEventSubscriptionList.size();
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
     * Method iterateListEventSubscription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ListEventSubscription> iterateListEventSubscription(
    ) {
        return this._listEventSubscriptionList.iterator();
    }

    /**
     * Method iterateTxnEventSubscription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.TxnEventSubscription> iterateTxnEventSubscription(
    ) {
        return this._txnEventSubscriptionList.iterator();
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
     */
    public void removeAllListEventSubscription(
    ) {
        this._listEventSubscriptionList.clear();
    }

    /**
     */
    public void removeAllTxnEventSubscription(
    ) {
        this._txnEventSubscriptionList.clear();
    }

    /**
     * Method removeListEventSubscription.
     * 
     * @param vListEventSubscription
     * @return true if the object was removed from the collection.
     */
    public boolean removeListEventSubscription(
            final org.chocolate_milk.model.ListEventSubscription vListEventSubscription) {
        boolean removed = _listEventSubscriptionList.remove(vListEventSubscription);
        return removed;
    }

    /**
     * Method removeListEventSubscriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ListEventSubscription removeListEventSubscriptionAt(
            final int index) {
        java.lang.Object obj = this._listEventSubscriptionList.remove(index);
        return (org.chocolate_milk.model.ListEventSubscription) obj;
    }

    /**
     * Method removeTxnEventSubscription.
     * 
     * @param vTxnEventSubscription
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnEventSubscription(
            final org.chocolate_milk.model.TxnEventSubscription vTxnEventSubscription) {
        boolean removed = _txnEventSubscriptionList.remove(vTxnEventSubscription);
        return removed;
    }

    /**
     * Method removeTxnEventSubscriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.TxnEventSubscription removeTxnEventSubscriptionAt(
            final int index) {
        java.lang.Object obj = this._txnEventSubscriptionList.remove(index);
        return (org.chocolate_milk.model.TxnEventSubscription) obj;
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
     * Sets the value of field 'deliverOwnEvents'.
     * 
     * @param deliverOwnEvents the value of field 'deliverOwnEvents'
     */
    public void setDeliverOwnEvents(
            final java.lang.String deliverOwnEvents) {
        this._deliverOwnEvents = deliverOwnEvents;
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
     * 
     * 
     * @param index
     * @param vListEventSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setListEventSubscription(
            final int index,
            final org.chocolate_milk.model.ListEventSubscription vListEventSubscription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listEventSubscriptionList.size()) {
            throw new IndexOutOfBoundsException("setListEventSubscription: Index value '" + index + "' not in range [0.." + (this._listEventSubscriptionList.size() - 1) + "]");
        }

        this._listEventSubscriptionList.set(index, vListEventSubscription);
    }

    /**
     * 
     * 
     * @param vListEventSubscriptionArray
     */
    public void setListEventSubscription(
            final org.chocolate_milk.model.ListEventSubscription[] vListEventSubscriptionArray) {
        //-- copy array
        _listEventSubscriptionList.clear();

        for (int i = 0; i < vListEventSubscriptionArray.length; i++) {
                this._listEventSubscriptionList.add(vListEventSubscriptionArray[i]);
        }
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
     * Sets the value of field 'trackLostEvents'.
     * 
     * @param trackLostEvents the value of field 'trackLostEvents'.
     */
    public void setTrackLostEvents(
            final org.chocolate_milk.model.types.TrackLostEventsType trackLostEvents) {
        this._trackLostEvents = trackLostEvents;
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnEventSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnEventSubscription(
            final int index,
            final org.chocolate_milk.model.TxnEventSubscription vTxnEventSubscription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnEventSubscriptionList.size()) {
            throw new IndexOutOfBoundsException("setTxnEventSubscription: Index value '" + index + "' not in range [0.." + (this._txnEventSubscriptionList.size() - 1) + "]");
        }

        this._txnEventSubscriptionList.set(index, vTxnEventSubscription);
    }

    /**
     * 
     * 
     * @param vTxnEventSubscriptionArray
     */
    public void setTxnEventSubscription(
            final org.chocolate_milk.model.TxnEventSubscription[] vTxnEventSubscriptionArray) {
        //-- copy array
        _txnEventSubscriptionList.clear();

        for (int i = 0; i < vTxnEventSubscriptionArray.length; i++) {
                this._txnEventSubscriptionList.add(vTxnEventSubscriptionArray[i]);
        }
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
     * org.chocolate_milk.model.DataEventSubscriptionAdd
     */
    public static org.chocolate_milk.model.DataEventSubscriptionAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataEventSubscriptionAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataEventSubscriptionAdd.class, reader);
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
