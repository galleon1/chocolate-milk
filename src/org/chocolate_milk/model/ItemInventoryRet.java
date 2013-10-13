/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemInventoryRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemInventoryRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ItemInventoryRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listCore.
     */
    private org.chocolate_milk.model.ListCore _listCore;

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _fullName.
     */
    private java.lang.String _fullName;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _parentRef.
     */
    private org.chocolate_milk.model.ParentRef _parentRef;

    /**
     * Field _sublevel.
     */
    private long _sublevel;

    /**
     * keeps track of state for field: _sublevel
     */
    private boolean _has_sublevel;

    /**
     * Field _manufacturerPartNumber.
     */
    private java.lang.String _manufacturerPartNumber;

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
     * Field _reorderPoint.
     */
    private java.lang.String _reorderPoint;

    /**
     * Field _quantityOnHand.
     */
    private java.lang.String _quantityOnHand;

    /**
     * Field _averageCost.
     */
    private java.lang.String _averageCost;

    /**
     * Field _quantityOnOrder.
     */
    private java.lang.String _quantityOnOrder;

    /**
     * Field _quantityOnSalesOrder.
     */
    private java.lang.String _quantityOnSalesOrder;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemInventoryRet() {
        super();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     */
    public void deleteSublevel(
    ) {
        this._has_sublevel= false;
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
     * Returns the value of field 'assetAccountRef'.
     * 
     * @return the value of field 'AssetAccountRef'.
     */
    public org.chocolate_milk.model.AssetAccountRef getAssetAccountRef(
    ) {
        return this._assetAccountRef;
    }

    /**
     * Returns the value of field 'averageCost'.
     * 
     * @return the value of field 'AverageCost'.
     */
    public java.lang.String getAverageCost(
    ) {
        return this._averageCost;
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
     * Returns the value of field 'externalGUID'.
     * 
     * @return the value of field 'ExternalGUID'.
     */
    public java.lang.String getExternalGUID(
    ) {
        return this._externalGUID;
    }

    /**
     * Returns the value of field 'fullName'.
     * 
     * @return the value of field 'FullName'.
     */
    public java.lang.String getFullName(
    ) {
        return this._fullName;
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
     * Returns the value of field 'listCore'.
     * 
     * @return the value of field 'ListCore'.
     */
    public org.chocolate_milk.model.ListCore getListCore(
    ) {
        return this._listCore;
    }

    /**
     * Returns the value of field 'manufacturerPartNumber'.
     * 
     * @return the value of field 'ManufacturerPartNumber'.
     */
    public java.lang.String getManufacturerPartNumber(
    ) {
        return this._manufacturerPartNumber;
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
     * Returns the value of field 'quantityOnOrder'.
     * 
     * @return the value of field 'QuantityOnOrder'.
     */
    public java.lang.String getQuantityOnOrder(
    ) {
        return this._quantityOnOrder;
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
     * Returns the value of field 'reorderPoint'.
     * 
     * @return the value of field 'ReorderPoint'.
     */
    public java.lang.String getReorderPoint(
    ) {
        return this._reorderPoint;
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
     * Returns the value of field 'sublevel'.
     * 
     * @return the value of field 'Sublevel'.
     */
    public long getSublevel(
    ) {
        return this._sublevel;
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
     * Method hasSublevel.
     * 
     * @return true if at least one Sublevel has been added
     */
    public boolean hasSublevel(
    ) {
        return this._has_sublevel;
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
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
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
     * Sets the value of field 'assetAccountRef'.
     * 
     * @param assetAccountRef the value of field 'assetAccountRef'.
     */
    public void setAssetAccountRef(
            final org.chocolate_milk.model.AssetAccountRef assetAccountRef) {
        this._assetAccountRef = assetAccountRef;
    }

    /**
     * Sets the value of field 'averageCost'.
     * 
     * @param averageCost the value of field 'averageCost'.
     */
    public void setAverageCost(
            final java.lang.String averageCost) {
        this._averageCost = averageCost;
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
     * Sets the value of field 'externalGUID'.
     * 
     * @param externalGUID the value of field 'externalGUID'.
     */
    public void setExternalGUID(
            final java.lang.String externalGUID) {
        this._externalGUID = externalGUID;
    }

    /**
     * Sets the value of field 'fullName'.
     * 
     * @param fullName the value of field 'fullName'.
     */
    public void setFullName(
            final java.lang.String fullName) {
        this._fullName = fullName;
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
     * Sets the value of field 'listCore'.
     * 
     * @param listCore the value of field 'listCore'.
     */
    public void setListCore(
            final org.chocolate_milk.model.ListCore listCore) {
        this._listCore = listCore;
    }

    /**
     * Sets the value of field 'manufacturerPartNumber'.
     * 
     * @param manufacturerPartNumber the value of field
     * 'manufacturerPartNumber'.
     */
    public void setManufacturerPartNumber(
            final java.lang.String manufacturerPartNumber) {
        this._manufacturerPartNumber = manufacturerPartNumber;
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
     * Sets the value of field 'quantityOnOrder'.
     * 
     * @param quantityOnOrder the value of field 'quantityOnOrder'.
     */
    public void setQuantityOnOrder(
            final java.lang.String quantityOnOrder) {
        this._quantityOnOrder = quantityOnOrder;
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
     * Sets the value of field 'reorderPoint'.
     * 
     * @param reorderPoint the value of field 'reorderPoint'.
     */
    public void setReorderPoint(
            final java.lang.String reorderPoint) {
        this._reorderPoint = reorderPoint;
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
     * Sets the value of field 'sublevel'.
     * 
     * @param sublevel the value of field 'sublevel'.
     */
    public void setSublevel(
            final long sublevel) {
        this._sublevel = sublevel;
        this._has_sublevel = true;
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
     * org.chocolate_milk.model.ItemInventoryRet
     */
    public static org.chocolate_milk.model.ItemInventoryRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemInventoryRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemInventoryRet.class, reader);
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
