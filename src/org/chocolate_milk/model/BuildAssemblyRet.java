/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BuildAssemblyRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BuildAssemblyRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BuildAssemblyRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnCore.
     */
    private org.chocolate_milk.model.TxnCore _txnCore;

    /**
     * Field _itemInventoryAssemblyRef.
     */
    private org.chocolate_milk.model.ItemInventoryAssemblyRef _itemInventoryAssemblyRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _isPending.
     */
    private java.lang.String _isPending;

    /**
     * Field _quantityToBuild.
     */
    private java.lang.String _quantityToBuild;

    /**
     * Field _quantityCanBuild.
     */
    private java.lang.String _quantityCanBuild;

    /**
     * Field _quantityOnHand.
     */
    private java.lang.String _quantityOnHand;

    /**
     * Field _quantityOnSalesOrder.
     */
    private java.lang.String _quantityOnSalesOrder;

    /**
     * Field _componentItemLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.ComponentItemLineRet> _componentItemLineRetList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BuildAssemblyRet() {
        super();
        this._componentItemLineRetList = new java.util.ArrayList<org.chocolate_milk.model.ComponentItemLineRet>();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vComponentItemLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponentItemLineRet(
            final org.chocolate_milk.model.ComponentItemLineRet vComponentItemLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._componentItemLineRetList.add(vComponentItemLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vComponentItemLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponentItemLineRet(
            final int index,
            final org.chocolate_milk.model.ComponentItemLineRet vComponentItemLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._componentItemLineRetList.add(index, vComponentItemLineRet);
    }

    /**
     * 
     * 
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(vDataExtRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(index, vDataExtRet);
    }

    /**
     * Method enumerateComponentItemLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ComponentItemLineRet> enumerateComponentItemLineRet(
    ) {
        return java.util.Collections.enumeration(this._componentItemLineRetList);
    }

    /**
     * Method enumerateDataExtRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DataExtRet> enumerateDataExtRet(
    ) {
        return java.util.Collections.enumeration(this._dataExtRetList);
    }

    /**
     * Method getComponentItemLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ComponentItemLineRet at the given
     * index
     */
    public org.chocolate_milk.model.ComponentItemLineRet getComponentItemLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._componentItemLineRetList.size()) {
            throw new IndexOutOfBoundsException("getComponentItemLineRet: Index value '" + index + "' not in range [0.." + (this._componentItemLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ComponentItemLineRet) _componentItemLineRetList.get(index);
    }

    /**
     * Method getComponentItemLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ComponentItemLineRet[] getComponentItemLineRet(
    ) {
        org.chocolate_milk.model.ComponentItemLineRet[] array = new org.chocolate_milk.model.ComponentItemLineRet[0];
        return (org.chocolate_milk.model.ComponentItemLineRet[]) this._componentItemLineRetList.toArray(array);
    }

    /**
     * Method getComponentItemLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getComponentItemLineRetCount(
    ) {
        return this._componentItemLineRetList.size();
    }

    /**
     * Method getDataExtRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.DataExtRet
     * at the given index
     */
    public org.chocolate_milk.model.DataExtRet getDataExtRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("getDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DataExtRet) _dataExtRetList.get(index);
    }

    /**
     * Method getDataExtRet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DataExtRet[] getDataExtRet(
    ) {
        org.chocolate_milk.model.DataExtRet[] array = new org.chocolate_milk.model.DataExtRet[0];
        return (org.chocolate_milk.model.DataExtRet[]) this._dataExtRetList.toArray(array);
    }

    /**
     * Method getDataExtRetCount.
     * 
     * @return the size of this collection
     */
    public int getDataExtRetCount(
    ) {
        return this._dataExtRetList.size();
    }

    /**
     * Returns the value of field 'isPending'.
     * 
     * @return the value of field 'IsPending'.
     */
    public java.lang.String getIsPending(
    ) {
        return this._isPending;
    }

    /**
     * Returns the value of field 'itemInventoryAssemblyRef'.
     * 
     * @return the value of field 'ItemInventoryAssemblyRef'.
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyRef getItemInventoryAssemblyRef(
    ) {
        return this._itemInventoryAssemblyRef;
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
     * Returns the value of field 'quantityCanBuild'.
     * 
     * @return the value of field 'QuantityCanBuild'.
     */
    public java.lang.String getQuantityCanBuild(
    ) {
        return this._quantityCanBuild;
    }

    /**
     * Returns the value of field 'quantityOnHand'.
     * 
     * @return the value of field 'QuantityOnHand'.
     */
    public java.lang.String getQuantityOnHand(
    ) {
        return this._quantityOnHand;
    }

    /**
     * Returns the value of field 'quantityOnSalesOrder'.
     * 
     * @return the value of field 'QuantityOnSalesOrder'.
     */
    public java.lang.String getQuantityOnSalesOrder(
    ) {
        return this._quantityOnSalesOrder;
    }

    /**
     * Returns the value of field 'quantityToBuild'.
     * 
     * @return the value of field 'QuantityToBuild'.
     */
    public java.lang.String getQuantityToBuild(
    ) {
        return this._quantityToBuild;
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
     * Returns the value of field 'txnCore'.
     * 
     * @return the value of field 'TxnCore'.
     */
    public org.chocolate_milk.model.TxnCore getTxnCore(
    ) {
        return this._txnCore;
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
     * Method iterateComponentItemLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ComponentItemLineRet> iterateComponentItemLineRet(
    ) {
        return this._componentItemLineRetList.iterator();
    }

    /**
     * Method iterateDataExtRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DataExtRet> iterateDataExtRet(
    ) {
        return this._dataExtRetList.iterator();
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
    public void removeAllComponentItemLineRet(
    ) {
        this._componentItemLineRetList.clear();
    }

    /**
     */
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
    }

    /**
     * Method removeComponentItemLineRet.
     * 
     * @param vComponentItemLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeComponentItemLineRet(
            final org.chocolate_milk.model.ComponentItemLineRet vComponentItemLineRet) {
        boolean removed = _componentItemLineRetList.remove(vComponentItemLineRet);
        return removed;
    }

    /**
     * Method removeComponentItemLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ComponentItemLineRet removeComponentItemLineRetAt(
            final int index) {
        java.lang.Object obj = this._componentItemLineRetList.remove(index);
        return (org.chocolate_milk.model.ComponentItemLineRet) obj;
    }

    /**
     * Method removeDataExtRet.
     * 
     * @param vDataExtRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet) {
        boolean removed = _dataExtRetList.remove(vDataExtRet);
        return removed;
    }

    /**
     * Method removeDataExtRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DataExtRet removeDataExtRetAt(
            final int index) {
        java.lang.Object obj = this._dataExtRetList.remove(index);
        return (org.chocolate_milk.model.DataExtRet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vComponentItemLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComponentItemLineRet(
            final int index,
            final org.chocolate_milk.model.ComponentItemLineRet vComponentItemLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._componentItemLineRetList.size()) {
            throw new IndexOutOfBoundsException("setComponentItemLineRet: Index value '" + index + "' not in range [0.." + (this._componentItemLineRetList.size() - 1) + "]");
        }

        this._componentItemLineRetList.set(index, vComponentItemLineRet);
    }

    /**
     * 
     * 
     * @param vComponentItemLineRetArray
     */
    public void setComponentItemLineRet(
            final org.chocolate_milk.model.ComponentItemLineRet[] vComponentItemLineRetArray) {
        //-- copy array
        _componentItemLineRetList.clear();

        for (int i = 0; i < vComponentItemLineRetArray.length; i++) {
                this._componentItemLineRetList.add(vComponentItemLineRetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("setDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        this._dataExtRetList.set(index, vDataExtRet);
    }

    /**
     * 
     * 
     * @param vDataExtRetArray
     */
    public void setDataExtRet(
            final org.chocolate_milk.model.DataExtRet[] vDataExtRetArray) {
        //-- copy array
        _dataExtRetList.clear();

        for (int i = 0; i < vDataExtRetArray.length; i++) {
                this._dataExtRetList.add(vDataExtRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'isPending'.
     * 
     * @param isPending the value of field 'isPending'.
     */
    public void setIsPending(
            final java.lang.String isPending) {
        this._isPending = isPending;
    }

    /**
     * Sets the value of field 'itemInventoryAssemblyRef'.
     * 
     * @param itemInventoryAssemblyRef the value of field
     * 'itemInventoryAssemblyRef'.
     */
    public void setItemInventoryAssemblyRef(
            final org.chocolate_milk.model.ItemInventoryAssemblyRef itemInventoryAssemblyRef) {
        this._itemInventoryAssemblyRef = itemInventoryAssemblyRef;
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
     * Sets the value of field 'quantityCanBuild'.
     * 
     * @param quantityCanBuild the value of field 'quantityCanBuild'
     */
    public void setQuantityCanBuild(
            final java.lang.String quantityCanBuild) {
        this._quantityCanBuild = quantityCanBuild;
    }

    /**
     * Sets the value of field 'quantityOnHand'.
     * 
     * @param quantityOnHand the value of field 'quantityOnHand'.
     */
    public void setQuantityOnHand(
            final java.lang.String quantityOnHand) {
        this._quantityOnHand = quantityOnHand;
    }

    /**
     * Sets the value of field 'quantityOnSalesOrder'.
     * 
     * @param quantityOnSalesOrder the value of field
     * 'quantityOnSalesOrder'.
     */
    public void setQuantityOnSalesOrder(
            final java.lang.String quantityOnSalesOrder) {
        this._quantityOnSalesOrder = quantityOnSalesOrder;
    }

    /**
     * Sets the value of field 'quantityToBuild'.
     * 
     * @param quantityToBuild the value of field 'quantityToBuild'.
     */
    public void setQuantityToBuild(
            final java.lang.String quantityToBuild) {
        this._quantityToBuild = quantityToBuild;
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
     * Sets the value of field 'txnCore'.
     * 
     * @param txnCore the value of field 'txnCore'.
     */
    public void setTxnCore(
            final org.chocolate_milk.model.TxnCore txnCore) {
        this._txnCore = txnCore;
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
     * org.chocolate_milk.model.BuildAssemblyRet
     */
    public static org.chocolate_milk.model.BuildAssemblyRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BuildAssemblyRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BuildAssemblyRet.class, reader);
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
