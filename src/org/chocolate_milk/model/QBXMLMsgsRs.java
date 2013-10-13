/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLMsgsRs.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLMsgsRs.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class QBXMLMsgsRs implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _newMessageSetID.
     */
    private java.lang.String _newMessageSetID;

    /**
     * Field _messageSetStatusCode.
     */
    private long _messageSetStatusCode;

    /**
     * keeps track of state for field: _messageSetStatusCode
     */
    private boolean _has_messageSetStatusCode;

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.QBXMLMsgsRsItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLMsgsRs() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.QBXMLMsgsRsItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vQBXMLMsgsRsItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQBXMLMsgsRsItem(
            final org.chocolate_milk.model.QBXMLMsgsRsItem vQBXMLMsgsRsItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vQBXMLMsgsRsItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vQBXMLMsgsRsItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQBXMLMsgsRsItem(
            final int index,
            final org.chocolate_milk.model.QBXMLMsgsRsItem vQBXMLMsgsRsItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vQBXMLMsgsRsItem);
    }

    /**
     */
    public void deleteMessageSetStatusCode(
    ) {
        this._has_messageSetStatusCode= false;
    }

    /**
     * Method enumerateQBXMLMsgsRsItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.QBXMLMsgsRsItem> enumerateQBXMLMsgsRsItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Returns the value of field 'messageSetStatusCode'.
     * 
     * @return the value of field 'MessageSetStatusCode'.
     */
    public long getMessageSetStatusCode(
    ) {
        return this._messageSetStatusCode;
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
     * Method getQBXMLMsgsRsItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.QBXMLMsgsRsItem at the given index
     */
    public org.chocolate_milk.model.QBXMLMsgsRsItem getQBXMLMsgsRsItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getQBXMLMsgsRsItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.QBXMLMsgsRsItem) _items.get(index);
    }

    /**
     * Method getQBXMLMsgsRsItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.QBXMLMsgsRsItem[] getQBXMLMsgsRsItem(
    ) {
        org.chocolate_milk.model.QBXMLMsgsRsItem[] array = new org.chocolate_milk.model.QBXMLMsgsRsItem[0];
        return (org.chocolate_milk.model.QBXMLMsgsRsItem[]) this._items.toArray(array);
    }

    /**
     * Method getQBXMLMsgsRsItemCount.
     * 
     * @return the size of this collection
     */
    public int getQBXMLMsgsRsItemCount(
    ) {
        return this._items.size();
    }

    /**
     * Method hasMessageSetStatusCode.
     * 
     * @return true if at least one MessageSetStatusCode has been
     * added
     */
    public boolean hasMessageSetStatusCode(
    ) {
        return this._has_messageSetStatusCode;
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
     * Method iterateQBXMLMsgsRsItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.QBXMLMsgsRsItem> iterateQBXMLMsgsRsItem(
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
    public void removeAllQBXMLMsgsRsItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeQBXMLMsgsRsItem.
     * 
     * @param vQBXMLMsgsRsItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeQBXMLMsgsRsItem(
            final org.chocolate_milk.model.QBXMLMsgsRsItem vQBXMLMsgsRsItem) {
        boolean removed = _items.remove(vQBXMLMsgsRsItem);
        return removed;
    }

    /**
     * Method removeQBXMLMsgsRsItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.QBXMLMsgsRsItem removeQBXMLMsgsRsItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.QBXMLMsgsRsItem) obj;
    }

    /**
     * Sets the value of field 'messageSetStatusCode'.
     * 
     * @param messageSetStatusCode the value of field
     * 'messageSetStatusCode'.
     */
    public void setMessageSetStatusCode(
            final long messageSetStatusCode) {
        this._messageSetStatusCode = messageSetStatusCode;
        this._has_messageSetStatusCode = true;
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
     * 
     * 
     * @param index
     * @param vQBXMLMsgsRsItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQBXMLMsgsRsItem(
            final int index,
            final org.chocolate_milk.model.QBXMLMsgsRsItem vQBXMLMsgsRsItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setQBXMLMsgsRsItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vQBXMLMsgsRsItem);
    }

    /**
     * 
     * 
     * @param vQBXMLMsgsRsItemArray
     */
    public void setQBXMLMsgsRsItem(
            final org.chocolate_milk.model.QBXMLMsgsRsItem[] vQBXMLMsgsRsItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vQBXMLMsgsRsItemArray.length; i++) {
                this._items.add(vQBXMLMsgsRsItemArray[i]);
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
     * @return the unmarshaled org.chocolate_milk.model.QBXMLMsgsRs
     */
    public static org.chocolate_milk.model.QBXMLMsgsRs unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXMLMsgsRs) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXMLMsgsRs.class, reader);
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
