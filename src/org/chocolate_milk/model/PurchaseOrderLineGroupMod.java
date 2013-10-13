/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PurchaseOrderLineGroupMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PurchaseOrderLineGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PurchaseOrderLineGroupMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private org.chocolate_milk.model.PurchaseOrderLineGroupModTxnLineID _txnLineID;

    /**
     * Field _itemGroupRef.
     */
    private org.chocolate_milk.model.ItemGroupRef _itemGroupRef;

    /**
     * Field _quantity.
     */
    private java.lang.String _quantity;

    /**
     * Field _unitOfMeasure.
     */
    private java.lang.String _unitOfMeasure;

    /**
     * Field _overrideUOMSetRef.
     */
    private org.chocolate_milk.model.OverrideUOMSetRef _overrideUOMSetRef;

    /**
     * Field _purchaseOrderLineModList.
     */
    private java.util.List<org.chocolate_milk.model.PurchaseOrderLineMod> _purchaseOrderLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PurchaseOrderLineGroupMod() {
        super();
        this._purchaseOrderLineModList = new java.util.ArrayList<org.chocolate_milk.model.PurchaseOrderLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPurchaseOrderLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPurchaseOrderLineMod(
            final org.chocolate_milk.model.PurchaseOrderLineMod vPurchaseOrderLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._purchaseOrderLineModList.add(vPurchaseOrderLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vPurchaseOrderLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPurchaseOrderLineMod(
            final int index,
            final org.chocolate_milk.model.PurchaseOrderLineMod vPurchaseOrderLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._purchaseOrderLineModList.add(index, vPurchaseOrderLineMod);
    }

    /**
     * Method enumeratePurchaseOrderLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.PurchaseOrderLineMod> enumeratePurchaseOrderLineMod(
    ) {
        return java.util.Collections.enumeration(this._purchaseOrderLineModList);
    }

    /**
     * Returns the value of field 'itemGroupRef'.
     * 
     * @return the value of field 'ItemGroupRef'.
     */
    public org.chocolate_milk.model.ItemGroupRef getItemGroupRef(
    ) {
        return this._itemGroupRef;
    }

    /**
     * Returns the value of field 'overrideUOMSetRef'.
     * 
     * @return the value of field 'OverrideUOMSetRef'.
     */
    public org.chocolate_milk.model.OverrideUOMSetRef getOverrideUOMSetRef(
    ) {
        return this._overrideUOMSetRef;
    }

    /**
     * Method getPurchaseOrderLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.PurchaseOrderLineMod at the given
     * index
     */
    public org.chocolate_milk.model.PurchaseOrderLineMod getPurchaseOrderLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._purchaseOrderLineModList.size()) {
            throw new IndexOutOfBoundsException("getPurchaseOrderLineMod: Index value '" + index + "' not in range [0.." + (this._purchaseOrderLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.PurchaseOrderLineMod) _purchaseOrderLineModList.get(index);
    }

    /**
     * Method getPurchaseOrderLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.PurchaseOrderLineMod[] getPurchaseOrderLineMod(
    ) {
        org.chocolate_milk.model.PurchaseOrderLineMod[] array = new org.chocolate_milk.model.PurchaseOrderLineMod[0];
        return (org.chocolate_milk.model.PurchaseOrderLineMod[]) this._purchaseOrderLineModList.toArray(array);
    }

    /**
     * Method getPurchaseOrderLineModCount.
     * 
     * @return the size of this collection
     */
    public int getPurchaseOrderLineModCount(
    ) {
        return this._purchaseOrderLineModList.size();
    }

    /**
     * Returns the value of field 'quantity'.
     * 
     * @return the value of field 'Quantity'.
     */
    public java.lang.String getQuantity(
    ) {
        return this._quantity;
    }

    /**
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public org.chocolate_milk.model.PurchaseOrderLineGroupModTxnLineID getTxnLineID(
    ) {
        return this._txnLineID;
    }

    /**
     * Returns the value of field 'unitOfMeasure'.
     * 
     * @return the value of field 'UnitOfMeasure'.
     */
    public java.lang.String getUnitOfMeasure(
    ) {
        return this._unitOfMeasure;
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
     * Method iteratePurchaseOrderLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.PurchaseOrderLineMod> iteratePurchaseOrderLineMod(
    ) {
        return this._purchaseOrderLineModList.iterator();
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
    public void removeAllPurchaseOrderLineMod(
    ) {
        this._purchaseOrderLineModList.clear();
    }

    /**
     * Method removePurchaseOrderLineMod.
     * 
     * @param vPurchaseOrderLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removePurchaseOrderLineMod(
            final org.chocolate_milk.model.PurchaseOrderLineMod vPurchaseOrderLineMod) {
        boolean removed = _purchaseOrderLineModList.remove(vPurchaseOrderLineMod);
        return removed;
    }

    /**
     * Method removePurchaseOrderLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.PurchaseOrderLineMod removePurchaseOrderLineModAt(
            final int index) {
        java.lang.Object obj = this._purchaseOrderLineModList.remove(index);
        return (org.chocolate_milk.model.PurchaseOrderLineMod) obj;
    }

    /**
     * Sets the value of field 'itemGroupRef'.
     * 
     * @param itemGroupRef the value of field 'itemGroupRef'.
     */
    public void setItemGroupRef(
            final org.chocolate_milk.model.ItemGroupRef itemGroupRef) {
        this._itemGroupRef = itemGroupRef;
    }

    /**
     * Sets the value of field 'overrideUOMSetRef'.
     * 
     * @param overrideUOMSetRef the value of field
     * 'overrideUOMSetRef'.
     */
    public void setOverrideUOMSetRef(
            final org.chocolate_milk.model.OverrideUOMSetRef overrideUOMSetRef) {
        this._overrideUOMSetRef = overrideUOMSetRef;
    }

    /**
     * 
     * 
     * @param index
     * @param vPurchaseOrderLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPurchaseOrderLineMod(
            final int index,
            final org.chocolate_milk.model.PurchaseOrderLineMod vPurchaseOrderLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._purchaseOrderLineModList.size()) {
            throw new IndexOutOfBoundsException("setPurchaseOrderLineMod: Index value '" + index + "' not in range [0.." + (this._purchaseOrderLineModList.size() - 1) + "]");
        }

        this._purchaseOrderLineModList.set(index, vPurchaseOrderLineMod);
    }

    /**
     * 
     * 
     * @param vPurchaseOrderLineModArray
     */
    public void setPurchaseOrderLineMod(
            final org.chocolate_milk.model.PurchaseOrderLineMod[] vPurchaseOrderLineModArray) {
        //-- copy array
        _purchaseOrderLineModList.clear();

        for (int i = 0; i < vPurchaseOrderLineModArray.length; i++) {
                this._purchaseOrderLineModList.add(vPurchaseOrderLineModArray[i]);
        }
    }

    /**
     * Sets the value of field 'quantity'.
     * 
     * @param quantity the value of field 'quantity'.
     */
    public void setQuantity(
            final java.lang.String quantity) {
        this._quantity = quantity;
    }

    /**
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final org.chocolate_milk.model.PurchaseOrderLineGroupModTxnLineID txnLineID) {
        this._txnLineID = txnLineID;
    }

    /**
     * Sets the value of field 'unitOfMeasure'.
     * 
     * @param unitOfMeasure the value of field 'unitOfMeasure'.
     */
    public void setUnitOfMeasure(
            final java.lang.String unitOfMeasure) {
        this._unitOfMeasure = unitOfMeasure;
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
     * org.chocolate_milk.model.PurchaseOrderLineGroupMod
     */
    public static org.chocolate_milk.model.PurchaseOrderLineGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PurchaseOrderLineGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PurchaseOrderLineGroupMod.class, reader);
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
