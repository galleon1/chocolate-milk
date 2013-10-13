/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnEventSubscription.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnEventSubscription.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnEventSubscription implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnEventTypeList.
     */
    private java.util.List<org.chocolate_milk.model.types.TxnEventTypeType> _txnEventTypeList;

    /**
     * Field _txnEventOperationList.
     */
    private java.util.List<org.chocolate_milk.model.types.TxnEventOperationType> _txnEventOperationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnEventSubscription() {
        super();
        this._txnEventTypeList = new java.util.ArrayList<org.chocolate_milk.model.types.TxnEventTypeType>();
        this._txnEventOperationList = new java.util.ArrayList<org.chocolate_milk.model.types.TxnEventOperationType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTxnEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnEventOperation(
            final org.chocolate_milk.model.types.TxnEventOperationType vTxnEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        this._txnEventOperationList.add(vTxnEventOperation);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnEventOperation(
            final int index,
            final org.chocolate_milk.model.types.TxnEventOperationType vTxnEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        this._txnEventOperationList.add(index, vTxnEventOperation);
    }

    /**
     * 
     * 
     * @param vTxnEventType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnEventType(
            final org.chocolate_milk.model.types.TxnEventTypeType vTxnEventType)
    throws java.lang.IndexOutOfBoundsException {
        this._txnEventTypeList.add(vTxnEventType);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnEventType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnEventType(
            final int index,
            final org.chocolate_milk.model.types.TxnEventTypeType vTxnEventType)
    throws java.lang.IndexOutOfBoundsException {
        this._txnEventTypeList.add(index, vTxnEventType);
    }

    /**
     * Method enumerateTxnEventOperation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.TxnEventOperationType> enumerateTxnEventOperation(
    ) {
        return java.util.Collections.enumeration(this._txnEventOperationList);
    }

    /**
     * Method enumerateTxnEventType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.TxnEventTypeType> enumerateTxnEventType(
    ) {
        return java.util.Collections.enumeration(this._txnEventTypeList);
    }

    /**
     * Method getTxnEventOperation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.TxnEventOperationType at the
     * given index
     */
    public org.chocolate_milk.model.types.TxnEventOperationType getTxnEventOperation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnEventOperationList.size()) {
            throw new IndexOutOfBoundsException("getTxnEventOperation: Index value '" + index + "' not in range [0.." + (this._txnEventOperationList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.TxnEventOperationType) _txnEventOperationList.get(index);
    }

    /**
     * Method getTxnEventOperation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.TxnEventOperationType[] getTxnEventOperation(
    ) {
        org.chocolate_milk.model.types.TxnEventOperationType[] array = new org.chocolate_milk.model.types.TxnEventOperationType[0];
        return (org.chocolate_milk.model.types.TxnEventOperationType[]) this._txnEventOperationList.toArray(array);
    }

    /**
     * Method getTxnEventOperationCount.
     * 
     * @return the size of this collection
     */
    public int getTxnEventOperationCount(
    ) {
        return this._txnEventOperationList.size();
    }

    /**
     * Method getTxnEventType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.TxnEventTypeType at the given
     * index
     */
    public org.chocolate_milk.model.types.TxnEventTypeType getTxnEventType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnEventTypeList.size()) {
            throw new IndexOutOfBoundsException("getTxnEventType: Index value '" + index + "' not in range [0.." + (this._txnEventTypeList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.TxnEventTypeType) _txnEventTypeList.get(index);
    }

    /**
     * Method getTxnEventType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.TxnEventTypeType[] getTxnEventType(
    ) {
        org.chocolate_milk.model.types.TxnEventTypeType[] array = new org.chocolate_milk.model.types.TxnEventTypeType[0];
        return (org.chocolate_milk.model.types.TxnEventTypeType[]) this._txnEventTypeList.toArray(array);
    }

    /**
     * Method getTxnEventTypeCount.
     * 
     * @return the size of this collection
     */
    public int getTxnEventTypeCount(
    ) {
        return this._txnEventTypeList.size();
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
     * Method iterateTxnEventOperation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.TxnEventOperationType> iterateTxnEventOperation(
    ) {
        return this._txnEventOperationList.iterator();
    }

    /**
     * Method iterateTxnEventType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.TxnEventTypeType> iterateTxnEventType(
    ) {
        return this._txnEventTypeList.iterator();
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
    public void removeAllTxnEventOperation(
    ) {
        this._txnEventOperationList.clear();
    }

    /**
     */
    public void removeAllTxnEventType(
    ) {
        this._txnEventTypeList.clear();
    }

    /**
     * Method removeTxnEventOperation.
     * 
     * @param vTxnEventOperation
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnEventOperation(
            final org.chocolate_milk.model.types.TxnEventOperationType vTxnEventOperation) {
        boolean removed = _txnEventOperationList.remove(vTxnEventOperation);
        return removed;
    }

    /**
     * Method removeTxnEventOperationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.TxnEventOperationType removeTxnEventOperationAt(
            final int index) {
        java.lang.Object obj = this._txnEventOperationList.remove(index);
        return (org.chocolate_milk.model.types.TxnEventOperationType) obj;
    }

    /**
     * Method removeTxnEventType.
     * 
     * @param vTxnEventType
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnEventType(
            final org.chocolate_milk.model.types.TxnEventTypeType vTxnEventType) {
        boolean removed = _txnEventTypeList.remove(vTxnEventType);
        return removed;
    }

    /**
     * Method removeTxnEventTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.TxnEventTypeType removeTxnEventTypeAt(
            final int index) {
        java.lang.Object obj = this._txnEventTypeList.remove(index);
        return (org.chocolate_milk.model.types.TxnEventTypeType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnEventOperation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnEventOperation(
            final int index,
            final org.chocolate_milk.model.types.TxnEventOperationType vTxnEventOperation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnEventOperationList.size()) {
            throw new IndexOutOfBoundsException("setTxnEventOperation: Index value '" + index + "' not in range [0.." + (this._txnEventOperationList.size() - 1) + "]");
        }

        this._txnEventOperationList.set(index, vTxnEventOperation);
    }

    /**
     * 
     * 
     * @param vTxnEventOperationArray
     */
    public void setTxnEventOperation(
            final org.chocolate_milk.model.types.TxnEventOperationType[] vTxnEventOperationArray) {
        //-- copy array
        _txnEventOperationList.clear();

        for (int i = 0; i < vTxnEventOperationArray.length; i++) {
                this._txnEventOperationList.add(vTxnEventOperationArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnEventType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnEventType(
            final int index,
            final org.chocolate_milk.model.types.TxnEventTypeType vTxnEventType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnEventTypeList.size()) {
            throw new IndexOutOfBoundsException("setTxnEventType: Index value '" + index + "' not in range [0.." + (this._txnEventTypeList.size() - 1) + "]");
        }

        this._txnEventTypeList.set(index, vTxnEventType);
    }

    /**
     * 
     * 
     * @param vTxnEventTypeArray
     */
    public void setTxnEventType(
            final org.chocolate_milk.model.types.TxnEventTypeType[] vTxnEventTypeArray) {
        //-- copy array
        _txnEventTypeList.clear();

        for (int i = 0; i < vTxnEventTypeArray.length; i++) {
                this._txnEventTypeList.add(vTxnEventTypeArray[i]);
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
     * org.chocolate_milk.model.TxnEventSubscription
     */
    public static org.chocolate_milk.model.TxnEventSubscription unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnEventSubscription) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnEventSubscription.class, reader);
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
