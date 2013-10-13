/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InventoryAdjustmentAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InventoryAdjustmentAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class InventoryAdjustmentAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defMacro.
     */
    private java.lang.String _defMacro;

    /**
     * Field _accountRef.
     */
    private org.chocolate_milk.model.AccountRef _accountRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _customerRef.
     */
    private org.chocolate_milk.model.CustomerRef _customerRef;

    /**
     * Field _classRef.
     */
    private org.chocolate_milk.model.ClassRef _classRef;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _inventoryAdjustmentLineAddList.
     */
    private java.util.List<org.chocolate_milk.model.InventoryAdjustmentLineAdd> _inventoryAdjustmentLineAddList;


      //----------------/
     //- Constructors -/
    //----------------/

    public InventoryAdjustmentAdd() {
        super();
        this._inventoryAdjustmentLineAddList = new java.util.ArrayList<org.chocolate_milk.model.InventoryAdjustmentLineAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInventoryAdjustmentLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventoryAdjustmentLineAdd(
            final org.chocolate_milk.model.InventoryAdjustmentLineAdd vInventoryAdjustmentLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._inventoryAdjustmentLineAddList.add(vInventoryAdjustmentLineAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vInventoryAdjustmentLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventoryAdjustmentLineAdd(
            final int index,
            final org.chocolate_milk.model.InventoryAdjustmentLineAdd vInventoryAdjustmentLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._inventoryAdjustmentLineAddList.add(index, vInventoryAdjustmentLineAdd);
    }

    /**
     * Method enumerateInventoryAdjustmentLineAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.InventoryAdjustmentLineAdd> enumerateInventoryAdjustmentLineAdd(
    ) {
        return java.util.Collections.enumeration(this._inventoryAdjustmentLineAddList);
    }

    /**
     * Returns the value of field 'accountRef'.
     * 
     * @return the value of field 'AccountRef'.
     */
    public org.chocolate_milk.model.AccountRef getAccountRef(
    ) {
        return this._accountRef;
    }

    /**
     * Returns the value of field 'classRef'.
     * 
     * @return the value of field 'ClassRef'.
     */
    public org.chocolate_milk.model.ClassRef getClassRef(
    ) {
        return this._classRef;
    }

    /**
     * Returns the value of field 'customerRef'.
     * 
     * @return the value of field 'CustomerRef'.
     */
    public org.chocolate_milk.model.CustomerRef getCustomerRef(
    ) {
        return this._customerRef;
    }

    /**
     * Returns the value of field 'defMacro'.
     * 
     * @return the value of field 'DefMacro'.
     */
    public java.lang.String getDefMacro(
    ) {
        return this._defMacro;
    }

    /**
     * Method getInventoryAdjustmentLineAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.InventoryAdjustmentLineAdd at the
     * given index
     */
    public org.chocolate_milk.model.InventoryAdjustmentLineAdd getInventoryAdjustmentLineAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventoryAdjustmentLineAddList.size()) {
            throw new IndexOutOfBoundsException("getInventoryAdjustmentLineAdd: Index value '" + index + "' not in range [0.." + (this._inventoryAdjustmentLineAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.InventoryAdjustmentLineAdd) _inventoryAdjustmentLineAddList.get(index);
    }

    /**
     * Method getInventoryAdjustmentLineAdd.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.InventoryAdjustmentLineAdd[] getInventoryAdjustmentLineAdd(
    ) {
        org.chocolate_milk.model.InventoryAdjustmentLineAdd[] array = new org.chocolate_milk.model.InventoryAdjustmentLineAdd[0];
        return (org.chocolate_milk.model.InventoryAdjustmentLineAdd[]) this._inventoryAdjustmentLineAddList.toArray(array);
    }

    /**
     * Method getInventoryAdjustmentLineAddCount.
     * 
     * @return the size of this collection
     */
    public int getInventoryAdjustmentLineAddCount(
    ) {
        return this._inventoryAdjustmentLineAddList.size();
    }

    /**
     * Returns the value of field 'memo'.
     * 
     * @return the value of field 'Memo'.
     */
    public java.lang.String getMemo(
    ) {
        return this._memo;
    }

    /**
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
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
     * Method iterateInventoryAdjustmentLineAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.InventoryAdjustmentLineAdd> iterateInventoryAdjustmentLineAdd(
    ) {
        return this._inventoryAdjustmentLineAddList.iterator();
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
    public void removeAllInventoryAdjustmentLineAdd(
    ) {
        this._inventoryAdjustmentLineAddList.clear();
    }

    /**
     * Method removeInventoryAdjustmentLineAdd.
     * 
     * @param vInventoryAdjustmentLineAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeInventoryAdjustmentLineAdd(
            final org.chocolate_milk.model.InventoryAdjustmentLineAdd vInventoryAdjustmentLineAdd) {
        boolean removed = _inventoryAdjustmentLineAddList.remove(vInventoryAdjustmentLineAdd);
        return removed;
    }

    /**
     * Method removeInventoryAdjustmentLineAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.InventoryAdjustmentLineAdd removeInventoryAdjustmentLineAddAt(
            final int index) {
        java.lang.Object obj = this._inventoryAdjustmentLineAddList.remove(index);
        return (org.chocolate_milk.model.InventoryAdjustmentLineAdd) obj;
    }

    /**
     * Sets the value of field 'accountRef'.
     * 
     * @param accountRef the value of field 'accountRef'.
     */
    public void setAccountRef(
            final org.chocolate_milk.model.AccountRef accountRef) {
        this._accountRef = accountRef;
    }

    /**
     * Sets the value of field 'classRef'.
     * 
     * @param classRef the value of field 'classRef'.
     */
    public void setClassRef(
            final org.chocolate_milk.model.ClassRef classRef) {
        this._classRef = classRef;
    }

    /**
     * Sets the value of field 'customerRef'.
     * 
     * @param customerRef the value of field 'customerRef'.
     */
    public void setCustomerRef(
            final org.chocolate_milk.model.CustomerRef customerRef) {
        this._customerRef = customerRef;
    }

    /**
     * Sets the value of field 'defMacro'.
     * 
     * @param defMacro the value of field 'defMacro'.
     */
    public void setDefMacro(
            final java.lang.String defMacro) {
        this._defMacro = defMacro;
    }

    /**
     * 
     * 
     * @param index
     * @param vInventoryAdjustmentLineAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInventoryAdjustmentLineAdd(
            final int index,
            final org.chocolate_milk.model.InventoryAdjustmentLineAdd vInventoryAdjustmentLineAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventoryAdjustmentLineAddList.size()) {
            throw new IndexOutOfBoundsException("setInventoryAdjustmentLineAdd: Index value '" + index + "' not in range [0.." + (this._inventoryAdjustmentLineAddList.size() - 1) + "]");
        }

        this._inventoryAdjustmentLineAddList.set(index, vInventoryAdjustmentLineAdd);
    }

    /**
     * 
     * 
     * @param vInventoryAdjustmentLineAddArray
     */
    public void setInventoryAdjustmentLineAdd(
            final org.chocolate_milk.model.InventoryAdjustmentLineAdd[] vInventoryAdjustmentLineAddArray) {
        //-- copy array
        _inventoryAdjustmentLineAddList.clear();

        for (int i = 0; i < vInventoryAdjustmentLineAddArray.length; i++) {
                this._inventoryAdjustmentLineAddList.add(vInventoryAdjustmentLineAddArray[i]);
        }
    }

    /**
     * Sets the value of field 'memo'.
     * 
     * @param memo the value of field 'memo'.
     */
    public void setMemo(
            final java.lang.String memo) {
        this._memo = memo;
    }

    /**
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
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
     * org.chocolate_milk.model.InventoryAdjustmentAdd
     */
    public static org.chocolate_milk.model.InventoryAdjustmentAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.InventoryAdjustmentAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.InventoryAdjustmentAdd.class, reader);
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
