/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemGroupLineRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemGroupLineRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemGroupLineRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _txnLineGroupCoreRet.
     */
    private org.chocolate_milk.model.TxnLineGroupCoreRet _txnLineGroupCoreRet;

    /**
     * Field _totalAmount.
     */
    private java.lang.String _totalAmount;

    /**
     * Field _itemLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.ItemLineRet> _itemLineRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemGroupLineRet() {
        super();
        this._itemLineRetList = new java.util.ArrayList<org.chocolate_milk.model.ItemLineRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemLineRet(
            final org.chocolate_milk.model.ItemLineRet vItemLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._itemLineRetList.add(vItemLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemLineRet(
            final int index,
            final org.chocolate_milk.model.ItemLineRet vItemLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._itemLineRetList.add(index, vItemLineRet);
    }

    /**
     * Method enumerateItemLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemLineRet> enumerateItemLineRet(
    ) {
        return java.util.Collections.enumeration(this._itemLineRetList);
    }

    /**
     * Method getItemLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemLineRet at the given index
     */
    public org.chocolate_milk.model.ItemLineRet getItemLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemLineRetList.size()) {
            throw new IndexOutOfBoundsException("getItemLineRet: Index value '" + index + "' not in range [0.." + (this._itemLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemLineRet) _itemLineRetList.get(index);
    }

    /**
     * Method getItemLineRet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemLineRet[] getItemLineRet(
    ) {
        org.chocolate_milk.model.ItemLineRet[] array = new org.chocolate_milk.model.ItemLineRet[0];
        return (org.chocolate_milk.model.ItemLineRet[]) this._itemLineRetList.toArray(array);
    }

    /**
     * Method getItemLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getItemLineRetCount(
    ) {
        return this._itemLineRetList.size();
    }

    /**
     * Returns the value of field 'totalAmount'.
     * 
     * @return the value of field 'TotalAmount'.
     */
    public java.lang.String getTotalAmount(
    ) {
        return this._totalAmount;
    }

    /**
     * Returns the value of field 'txnLineGroupCoreRet'.
     * 
     * @return the value of field 'TxnLineGroupCoreRet'.
     */
    public org.chocolate_milk.model.TxnLineGroupCoreRet getTxnLineGroupCoreRet(
    ) {
        return this._txnLineGroupCoreRet;
    }

    /**
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public java.lang.String getTxnLineID(
    ) {
        return this._txnLineID;
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
     * Method iterateItemLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemLineRet> iterateItemLineRet(
    ) {
        return this._itemLineRetList.iterator();
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
    public void removeAllItemLineRet(
    ) {
        this._itemLineRetList.clear();
    }

    /**
     * Method removeItemLineRet.
     * 
     * @param vItemLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemLineRet(
            final org.chocolate_milk.model.ItemLineRet vItemLineRet) {
        boolean removed = _itemLineRetList.remove(vItemLineRet);
        return removed;
    }

    /**
     * Method removeItemLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemLineRet removeItemLineRetAt(
            final int index) {
        java.lang.Object obj = this._itemLineRetList.remove(index);
        return (org.chocolate_milk.model.ItemLineRet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vItemLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemLineRet(
            final int index,
            final org.chocolate_milk.model.ItemLineRet vItemLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemLineRetList.size()) {
            throw new IndexOutOfBoundsException("setItemLineRet: Index value '" + index + "' not in range [0.." + (this._itemLineRetList.size() - 1) + "]");
        }

        this._itemLineRetList.set(index, vItemLineRet);
    }

    /**
     * 
     * 
     * @param vItemLineRetArray
     */
    public void setItemLineRet(
            final org.chocolate_milk.model.ItemLineRet[] vItemLineRetArray) {
        //-- copy array
        _itemLineRetList.clear();

        for (int i = 0; i < vItemLineRetArray.length; i++) {
                this._itemLineRetList.add(vItemLineRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'totalAmount'.
     * 
     * @param totalAmount the value of field 'totalAmount'.
     */
    public void setTotalAmount(
            final java.lang.String totalAmount) {
        this._totalAmount = totalAmount;
    }

    /**
     * Sets the value of field 'txnLineGroupCoreRet'.
     * 
     * @param txnLineGroupCoreRet the value of field
     * 'txnLineGroupCoreRet'.
     */
    public void setTxnLineGroupCoreRet(
            final org.chocolate_milk.model.TxnLineGroupCoreRet txnLineGroupCoreRet) {
        this._txnLineGroupCoreRet = txnLineGroupCoreRet;
    }

    /**
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final java.lang.String txnLineID) {
        this._txnLineID = txnLineID;
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
     * org.chocolate_milk.model.ItemGroupLineRet
     */
    public static org.chocolate_milk.model.ItemGroupLineRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemGroupLineRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemGroupLineRet.class, reader);
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
