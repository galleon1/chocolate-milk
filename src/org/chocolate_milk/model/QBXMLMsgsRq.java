/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLMsgsRq.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLMsgsRq.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class QBXMLMsgsRq implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _oldMessageSetID.
     */
    private java.lang.String _oldMessageSetID;

    /**
     * Field _newMessageSetID.
     */
    private java.lang.String _newMessageSetID;

    /**
     * Field _responseData.
     */
    private org.chocolate_milk.model.types.QBXMLMsgsRqItemResponseDataType _responseData = org.chocolate_milk.model.types.QBXMLMsgsRqItemResponseDataType.fromValue("includeAll");

    /**
     * Field _onError.
     */
    private org.chocolate_milk.model.types.QBXMLMsgsRqItemOnErrorType _onError;

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.QBXMLMsgsRqItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLMsgsRq() {
        super();
        setResponseData(org.chocolate_milk.model.types.QBXMLMsgsRqItemResponseDataType.fromValue("includeAll"));
        this._items = new java.util.ArrayList<org.chocolate_milk.model.QBXMLMsgsRqItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vQBXMLMsgsRqItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQBXMLMsgsRqItem(
            final org.chocolate_milk.model.QBXMLMsgsRqItem vQBXMLMsgsRqItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vQBXMLMsgsRqItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vQBXMLMsgsRqItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQBXMLMsgsRqItem(
            final int index,
            final org.chocolate_milk.model.QBXMLMsgsRqItem vQBXMLMsgsRqItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vQBXMLMsgsRqItem);
    }

    /**
     * Method enumerateQBXMLMsgsRqItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.QBXMLMsgsRqItem> enumerateQBXMLMsgsRqItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Returns the value of field 'newMessageSetID'.
     * 
     * @return the value of field 'NewMessageSetID'.
     */
    public java.lang.String getNewMessageSetID(
    ) {
        return this._newMessageSetID;
    }

    /**
     * Returns the value of field 'oldMessageSetID'.
     * 
     * @return the value of field 'OldMessageSetID'.
     */
    public java.lang.String getOldMessageSetID(
    ) {
        return this._oldMessageSetID;
    }

    /**
     * Returns the value of field 'onError'.
     * 
     * @return the value of field 'OnError'.
     */
    public org.chocolate_milk.model.types.QBXMLMsgsRqItemOnErrorType getOnError(
    ) {
        return this._onError;
    }

    /**
     * Method getQBXMLMsgsRqItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.QBXMLMsgsRqItem at the given index
     */
    public org.chocolate_milk.model.QBXMLMsgsRqItem getQBXMLMsgsRqItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getQBXMLMsgsRqItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.QBXMLMsgsRqItem) _items.get(index);
    }

    /**
     * Method getQBXMLMsgsRqItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.QBXMLMsgsRqItem[] getQBXMLMsgsRqItem(
    ) {
        org.chocolate_milk.model.QBXMLMsgsRqItem[] array = new org.chocolate_milk.model.QBXMLMsgsRqItem[0];
        return (org.chocolate_milk.model.QBXMLMsgsRqItem[]) this._items.toArray(array);
    }

    /**
     * Method getQBXMLMsgsRqItemCount.
     * 
     * @return the size of this collection
     */
    public int getQBXMLMsgsRqItemCount(
    ) {
        return this._items.size();
    }

    /**
     * Returns the value of field 'responseData'.
     * 
     * @return the value of field 'ResponseData'.
     */
    public org.chocolate_milk.model.types.QBXMLMsgsRqItemResponseDataType getResponseData(
    ) {
        return this._responseData;
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
     * Method iterateQBXMLMsgsRqItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.QBXMLMsgsRqItem> iterateQBXMLMsgsRqItem(
    ) {
        return this._items.iterator();
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
    public void removeAllQBXMLMsgsRqItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeQBXMLMsgsRqItem.
     * 
     * @param vQBXMLMsgsRqItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeQBXMLMsgsRqItem(
            final org.chocolate_milk.model.QBXMLMsgsRqItem vQBXMLMsgsRqItem) {
        boolean removed = _items.remove(vQBXMLMsgsRqItem);
        return removed;
    }

    /**
     * Method removeQBXMLMsgsRqItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.QBXMLMsgsRqItem removeQBXMLMsgsRqItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.QBXMLMsgsRqItem) obj;
    }

    /**
     * Sets the value of field 'newMessageSetID'.
     * 
     * @param newMessageSetID the value of field 'newMessageSetID'.
     */
    public void setNewMessageSetID(
            final java.lang.String newMessageSetID) {
        this._newMessageSetID = newMessageSetID;
    }

    /**
     * Sets the value of field 'oldMessageSetID'.
     * 
     * @param oldMessageSetID the value of field 'oldMessageSetID'.
     */
    public void setOldMessageSetID(
            final java.lang.String oldMessageSetID) {
        this._oldMessageSetID = oldMessageSetID;
    }

    /**
     * Sets the value of field 'onError'.
     * 
     * @param onError the value of field 'onError'.
     */
    public void setOnError(
            final org.chocolate_milk.model.types.QBXMLMsgsRqItemOnErrorType onError) {
        this._onError = onError;
    }

    /**
     * 
     * 
     * @param index
     * @param vQBXMLMsgsRqItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQBXMLMsgsRqItem(
            final int index,
            final org.chocolate_milk.model.QBXMLMsgsRqItem vQBXMLMsgsRqItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setQBXMLMsgsRqItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vQBXMLMsgsRqItem);
    }

    /**
     * 
     * 
     * @param vQBXMLMsgsRqItemArray
     */
    public void setQBXMLMsgsRqItem(
            final org.chocolate_milk.model.QBXMLMsgsRqItem[] vQBXMLMsgsRqItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vQBXMLMsgsRqItemArray.length; i++) {
                this._items.add(vQBXMLMsgsRqItemArray[i]);
        }
    }

    /**
     * Sets the value of field 'responseData'.
     * 
     * @param responseData the value of field 'responseData'.
     */
    public void setResponseData(
            final org.chocolate_milk.model.types.QBXMLMsgsRqItemResponseDataType responseData) {
        this._responseData = responseData;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.QBXMLMsgsRq
     */
    public static org.chocolate_milk.model.QBXMLMsgsRq unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXMLMsgsRq) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXMLMsgsRq.class, reader);
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
