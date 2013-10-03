/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemInventoryAssemblyAdd.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemInventoryAssemblyAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemInventoryAssemblyAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _parentRef.
     */
    private org.chocolate_milk.model.ParentRef _parentRef;

    /**
     * Field _unitOfMeasureSetRef.
     */
    private org.chocolate_milk.model.UnitOfMeasureSetRef _unitOfMeasureSetRef;

    /**
     * Field _isTaxIncluded.
     */
    private java.lang.String _isTaxIncluded;

    /**
     * Field _salesTaxCodeRef.
     */
    private org.chocolate_milk.model.SalesTaxCodeRef _salesTaxCodeRef;

    /**
     * Field _salesDesc.
     */
    private java.lang.String _salesDesc;

    /**
     * Field _salesPrice.
     */
    private java.lang.String _salesPrice;

    /**
     * Field _incomeAccountRef.
     */
    private org.chocolate_milk.model.IncomeAccountRef _incomeAccountRef;

    /**
     * Field _purchaseDesc.
     */
    private java.lang.String _purchaseDesc;

    /**
     * Field _purchaseCost.
     */
    private java.lang.String _purchaseCost;

    /**
     * Field _purchaseTaxCodeRef.
     */
    private org.chocolate_milk.model.PurchaseTaxCodeRef _purchaseTaxCodeRef;

    /**
     * Field _COGSAccountRef.
     */
    private org.chocolate_milk.model.COGSAccountRef _COGSAccountRef;

    /**
     * Field _prefVendorRef.
     */
    private org.chocolate_milk.model.PrefVendorRef _prefVendorRef;

    /**
     * Field _assetAccountRef.
     */
    private org.chocolate_milk.model.AssetAccountRef _assetAccountRef;

    /**
     * Field _buildPoint.
     */
    private java.lang.String _buildPoint;

    /**
     * Field _quantityOnHand.
     */
    private java.lang.String _quantityOnHand;

    /**
     * Field _totalValue.
     */
    private java.lang.String _totalValue;

    /**
     * Field _inventoryDate.
     */
    private java.lang.String _inventoryDate;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;

    /**
     * Field _itemInventoryAssemblyLineList.
     */
    private java.util.List<org.chocolate_milk.model.ItemInventoryAssemblyLine> _itemInventoryAssemblyLineList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemInventoryAssemblyAdd() {
        super();
        this._itemInventoryAssemblyLineList = new java.util.ArrayList<org.chocolate_milk.model.ItemInventoryAssemblyLine>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemInventoryAssemblyLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemInventoryAssemblyLine(
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemInventoryAssemblyLineList.add(vItemInventoryAssemblyLine);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemInventoryAssemblyLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemInventoryAssemblyLine(
            final int index,
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemInventoryAssemblyLineList.add(index, vItemInventoryAssemblyLine);
    }

    /**
     * Method enumerateItemInventoryAssemblyLine.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemInventoryAssemblyLine> enumerateItemInventoryAssemblyLine(
    ) {
        return java.util.Collections.enumeration(this._itemInventoryAssemblyLineList);
    }

    /**
     * Returns the value of field 'assetAccountRef'.
     * 
     * @return the value of field 'AssetAccountRef'.
     */
    public org.chocolate_milk.model.AssetAccountRef getAssetAccountRef(
    ) {
        return this._assetAccountRef;
    }

    /**
     * Returns the value of field 'buildPoint'.
     * 
     * @return the value of field 'BuildPoint'.
     */
    public java.lang.String getBuildPoint(
    ) {
        return this._buildPoint;
    }

    /**
     * Returns the value of field 'COGSAccountRef'.
     * 
     * @return the value of field 'COGSAccountRef'.
     */
    public org.chocolate_milk.model.COGSAccountRef getCOGSAccountRef(
    ) {
        return this._COGSAccountRef;
    }

    /**
     * Returns the value of field 'externalGUID'.
     * 
     * @return the value of field 'ExternalGUID'.
     */
    public java.lang.String getExternalGUID(
    ) {
        return this._externalGUID;
    }

    /**
     * Returns the value of field 'incomeAccountRef'.
     * 
     * @return the value of field 'IncomeAccountRef'.
     */
    public org.chocolate_milk.model.IncomeAccountRef getIncomeAccountRef(
    ) {
        return this._incomeAccountRef;
    }

    /**
     * Returns the value of field 'inventoryDate'.
     * 
     * @return the value of field 'InventoryDate'.
     */
    public java.lang.String getInventoryDate(
    ) {
        return this._inventoryDate;
    }

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'isTaxIncluded'.
     * 
     * @return the value of field 'IsTaxIncluded'.
     */
    public java.lang.String getIsTaxIncluded(
    ) {
        return this._isTaxIncluded;
    }

    /**
     * Method getItemInventoryAssemblyLine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemInventoryAssemblyLine at the
     * given index
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyLine getItemInventoryAssemblyLine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemInventoryAssemblyLineList.size()) {
            throw new IndexOutOfBoundsException("getItemInventoryAssemblyLine: Index value '" + index + "' not in range [0.." + (this._itemInventoryAssemblyLineList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemInventoryAssemblyLine) _itemInventoryAssemblyLineList.get(index);
    }

    /**
     * Method getItemInventoryAssemblyLine.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyLine[] getItemInventoryAssemblyLine(
    ) {
        org.chocolate_milk.model.ItemInventoryAssemblyLine[] array = new org.chocolate_milk.model.ItemInventoryAssemblyLine[0];
        return (org.chocolate_milk.model.ItemInventoryAssemblyLine[]) this._itemInventoryAssemblyLineList.toArray(array);
    }

    /**
     * Method getItemInventoryAssemblyLineCount.
     * 
     * @return the size of this collection
     */
    public int getItemInventoryAssemblyLineCount(
    ) {
        return this._itemInventoryAssemblyLineList.size();
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'parentRef'.
     * 
     * @return the value of field 'ParentRef'.
     */
    public org.chocolate_milk.model.ParentRef getParentRef(
    ) {
        return this._parentRef;
    }

    /**
     * Returns the value of field 'prefVendorRef'.
     * 
     * @return the value of field 'PrefVendorRef'.
     */
    public org.chocolate_milk.model.PrefVendorRef getPrefVendorRef(
    ) {
        return this._prefVendorRef;
    }

    /**
     * Returns the value of field 'purchaseCost'.
     * 
     * @return the value of field 'PurchaseCost'.
     */
    public java.lang.String getPurchaseCost(
    ) {
        return this._purchaseCost;
    }

    /**
     * Returns the value of field 'purchaseDesc'.
     * 
     * @return the value of field 'PurchaseDesc'.
     */
    public java.lang.String getPurchaseDesc(
    ) {
        return this._purchaseDesc;
    }

    /**
     * Returns the value of field 'purchaseTaxCodeRef'.
     * 
     * @return the value of field 'PurchaseTaxCodeRef'.
     */
    public org.chocolate_milk.model.PurchaseTaxCodeRef getPurchaseTaxCodeRef(
    ) {
        return this._purchaseTaxCodeRef;
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
     * Returns the value of field 'salesDesc'.
     * 
     * @return the value of field 'SalesDesc'.
     */
    public java.lang.String getSalesDesc(
    ) {
        return this._salesDesc;
    }

    /**
     * Returns the value of field 'salesPrice'.
     * 
     * @return the value of field 'SalesPrice'.
     */
    public java.lang.String getSalesPrice(
    ) {
        return this._salesPrice;
    }

    /**
     * Returns the value of field 'salesTaxCodeRef'.
     * 
     * @return the value of field 'SalesTaxCodeRef'.
     */
    public org.chocolate_milk.model.SalesTaxCodeRef getSalesTaxCodeRef(
    ) {
        return this._salesTaxCodeRef;
    }

    /**
     * Returns the value of field 'totalValue'.
     * 
     * @return the value of field 'TotalValue'.
     */
    public java.lang.String getTotalValue(
    ) {
        return this._totalValue;
    }

    /**
     * Returns the value of field 'unitOfMeasureSetRef'.
     * 
     * @return the value of field 'UnitOfMeasureSetRef'.
     */
    public org.chocolate_milk.model.UnitOfMeasureSetRef getUnitOfMeasureSetRef(
    ) {
        return this._unitOfMeasureSetRef;
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
     * Method iterateItemInventoryAssemblyLine.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemInventoryAssemblyLine> iterateItemInventoryAssemblyLine(
    ) {
        return this._itemInventoryAssemblyLineList.iterator();
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
    public void removeAllItemInventoryAssemblyLine(
    ) {
        this._itemInventoryAssemblyLineList.clear();
    }

    /**
     * Method removeItemInventoryAssemblyLine.
     * 
     * @param vItemInventoryAssemblyLine
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemInventoryAssemblyLine(
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine) {
        boolean removed = _itemInventoryAssemblyLineList.remove(vItemInventoryAssemblyLine);
        return removed;
    }

    /**
     * Method removeItemInventoryAssemblyLineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyLine removeItemInventoryAssemblyLineAt(
            final int index) {
        java.lang.Object obj = this._itemInventoryAssemblyLineList.remove(index);
        return (org.chocolate_milk.model.ItemInventoryAssemblyLine) obj;
    }

    /**
     * Sets the value of field 'assetAccountRef'.
     * 
     * @param assetAccountRef the value of field 'assetAccountRef'.
     */
    public void setAssetAccountRef(
            final org.chocolate_milk.model.AssetAccountRef assetAccountRef) {
        this._assetAccountRef = assetAccountRef;
    }

    /**
     * Sets the value of field 'buildPoint'.
     * 
     * @param buildPoint the value of field 'buildPoint'.
     */
    public void setBuildPoint(
            final java.lang.String buildPoint) {
        this._buildPoint = buildPoint;
    }

    /**
     * Sets the value of field 'COGSAccountRef'.
     * 
     * @param COGSAccountRef the value of field 'COGSAccountRef'.
     */
    public void setCOGSAccountRef(
            final org.chocolate_milk.model.COGSAccountRef COGSAccountRef) {
        this._COGSAccountRef = COGSAccountRef;
    }

    /**
     * Sets the value of field 'externalGUID'.
     * 
     * @param externalGUID the value of field 'externalGUID'.
     */
    public void setExternalGUID(
            final java.lang.String externalGUID) {
        this._externalGUID = externalGUID;
    }

    /**
     * Sets the value of field 'incomeAccountRef'.
     * 
     * @param incomeAccountRef the value of field 'incomeAccountRef'
     */
    public void setIncomeAccountRef(
            final org.chocolate_milk.model.IncomeAccountRef incomeAccountRef) {
        this._incomeAccountRef = incomeAccountRef;
    }

    /**
     * Sets the value of field 'inventoryDate'.
     * 
     * @param inventoryDate the value of field 'inventoryDate'.
     */
    public void setInventoryDate(
            final java.lang.String inventoryDate) {
        this._inventoryDate = inventoryDate;
    }

    /**
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'isTaxIncluded'.
     * 
     * @param isTaxIncluded the value of field 'isTaxIncluded'.
     */
    public void setIsTaxIncluded(
            final java.lang.String isTaxIncluded) {
        this._isTaxIncluded = isTaxIncluded;
    }

    /**
     * 
     * 
     * @param index
     * @param vItemInventoryAssemblyLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemInventoryAssemblyLine(
            final int index,
            final org.chocolate_milk.model.ItemInventoryAssemblyLine vItemInventoryAssemblyLine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemInventoryAssemblyLineList.size()) {
            throw new IndexOutOfBoundsException("setItemInventoryAssemblyLine: Index value '" + index + "' not in range [0.." + (this._itemInventoryAssemblyLineList.size() - 1) + "]");
        }

        this._itemInventoryAssemblyLineList.set(index, vItemInventoryAssemblyLine);
    }

    /**
     * 
     * 
     * @param vItemInventoryAssemblyLineArray
     */
    public void setItemInventoryAssemblyLine(
            final org.chocolate_milk.model.ItemInventoryAssemblyLine[] vItemInventoryAssemblyLineArray) {
        //-- copy array
        _itemInventoryAssemblyLineList.clear();

        for (int i = 0; i < vItemInventoryAssemblyLineArray.length; i++) {
                this._itemInventoryAssemblyLineList.add(vItemInventoryAssemblyLineArray[i]);
        }
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'parentRef'.
     * 
     * @param parentRef the value of field 'parentRef'.
     */
    public void setParentRef(
            final org.chocolate_milk.model.ParentRef parentRef) {
        this._parentRef = parentRef;
    }

    /**
     * Sets the value of field 'prefVendorRef'.
     * 
     * @param prefVendorRef the value of field 'prefVendorRef'.
     */
    public void setPrefVendorRef(
            final org.chocolate_milk.model.PrefVendorRef prefVendorRef) {
        this._prefVendorRef = prefVendorRef;
    }

    /**
     * Sets the value of field 'purchaseCost'.
     * 
     * @param purchaseCost the value of field 'purchaseCost'.
     */
    public void setPurchaseCost(
            final java.lang.String purchaseCost) {
        this._purchaseCost = purchaseCost;
    }

    /**
     * Sets the value of field 'purchaseDesc'.
     * 
     * @param purchaseDesc the value of field 'purchaseDesc'.
     */
    public void setPurchaseDesc(
            final java.lang.String purchaseDesc) {
        this._purchaseDesc = purchaseDesc;
    }

    /**
     * Sets the value of field 'purchaseTaxCodeRef'.
     * 
     * @param purchaseTaxCodeRef the value of field
     * 'purchaseTaxCodeRef'.
     */
    public void setPurchaseTaxCodeRef(
            final org.chocolate_milk.model.PurchaseTaxCodeRef purchaseTaxCodeRef) {
        this._purchaseTaxCodeRef = purchaseTaxCodeRef;
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
     * Sets the value of field 'salesDesc'.
     * 
     * @param salesDesc the value of field 'salesDesc'.
     */
    public void setSalesDesc(
            final java.lang.String salesDesc) {
        this._salesDesc = salesDesc;
    }

    /**
     * Sets the value of field 'salesPrice'.
     * 
     * @param salesPrice the value of field 'salesPrice'.
     */
    public void setSalesPrice(
            final java.lang.String salesPrice) {
        this._salesPrice = salesPrice;
    }

    /**
     * Sets the value of field 'salesTaxCodeRef'.
     * 
     * @param salesTaxCodeRef the value of field 'salesTaxCodeRef'.
     */
    public void setSalesTaxCodeRef(
            final org.chocolate_milk.model.SalesTaxCodeRef salesTaxCodeRef) {
        this._salesTaxCodeRef = salesTaxCodeRef;
    }

    /**
     * Sets the value of field 'totalValue'.
     * 
     * @param totalValue the value of field 'totalValue'.
     */
    public void setTotalValue(
            final java.lang.String totalValue) {
        this._totalValue = totalValue;
    }

    /**
     * Sets the value of field 'unitOfMeasureSetRef'.
     * 
     * @param unitOfMeasureSetRef the value of field
     * 'unitOfMeasureSetRef'.
     */
    public void setUnitOfMeasureSetRef(
            final org.chocolate_milk.model.UnitOfMeasureSetRef unitOfMeasureSetRef) {
        this._unitOfMeasureSetRef = unitOfMeasureSetRef;
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
     * org.chocolate_milk.model.ItemInventoryAssemblyAdd
     */
    public static org.chocolate_milk.model.ItemInventoryAssemblyAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemInventoryAssemblyAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemInventoryAssemblyAdd.class, reader);
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
