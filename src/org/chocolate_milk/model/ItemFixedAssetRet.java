/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemFixedAssetRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemFixedAssetRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemFixedAssetRet implements java.io.Serializable {


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
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _acquiredAs.
     */
    private org.chocolate_milk.model.types.AcquiredAsType _acquiredAs;

    /**
     * Field _purchaseDesc.
     */
    private java.lang.String _purchaseDesc;

    /**
     * Field _purchaseDate.
     */
    private java.lang.String _purchaseDate;

    /**
     * Field _purchaseCost.
     */
    private java.lang.String _purchaseCost;

    /**
     * Field _vendorOrPayeeName.
     */
    private java.lang.String _vendorOrPayeeName;

    /**
     * Field _assetAccountRef.
     */
    private org.chocolate_milk.model.AssetAccountRef _assetAccountRef;

    /**
     * Field _fixedAssetSalesInfo.
     */
    private org.chocolate_milk.model.FixedAssetSalesInfo _fixedAssetSalesInfo;

    /**
     * Field _assetDesc.
     */
    private java.lang.String _assetDesc;

    /**
     * Field _location.
     */
    private java.lang.String _location;

    /**
     * Field _PONumber.
     */
    private java.lang.String _PONumber;

    /**
     * Field _serialNumber.
     */
    private java.lang.String _serialNumber;

    /**
     * Field _warrantyExpDate.
     */
    private java.lang.String _warrantyExpDate;

    /**
     * Field _notes.
     */
    private java.lang.String _notes;

    /**
     * Field _assetNumber.
     */
    private java.lang.String _assetNumber;

    /**
     * Field _costBasis.
     */
    private java.lang.String _costBasis;

    /**
     * Field _yearEndAccumulatedDepreciation.
     */
    private java.lang.String _yearEndAccumulatedDepreciation;

    /**
     * Field _yearEndBookValue.
     */
    private java.lang.String _yearEndBookValue;

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

    public ItemFixedAssetRet() {
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
     * Returns the value of field 'acquiredAs'.
     * 
     * @return the value of field 'AcquiredAs'.
     */
    public org.chocolate_milk.model.types.AcquiredAsType getAcquiredAs(
    ) {
        return this._acquiredAs;
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
     * Returns the value of field 'assetDesc'.
     * 
     * @return the value of field 'AssetDesc'.
     */
    public java.lang.String getAssetDesc(
    ) {
        return this._assetDesc;
    }

    /**
     * Returns the value of field 'assetNumber'.
     * 
     * @return the value of field 'AssetNumber'.
     */
    public java.lang.String getAssetNumber(
    ) {
        return this._assetNumber;
    }

    /**
     * Returns the value of field 'costBasis'.
     * 
     * @return the value of field 'CostBasis'.
     */
    public java.lang.String getCostBasis(
    ) {
        return this._costBasis;
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
     * Returns the value of field 'fixedAssetSalesInfo'.
     * 
     * @return the value of field 'FixedAssetSalesInfo'.
     */
    public org.chocolate_milk.model.FixedAssetSalesInfo getFixedAssetSalesInfo(
    ) {
        return this._fixedAssetSalesInfo;
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
     * Returns the value of field 'listCore'.
     * 
     * @return the value of field 'ListCore'.
     */
    public org.chocolate_milk.model.ListCore getListCore(
    ) {
        return this._listCore;
    }

    /**
     * Returns the value of field 'location'.
     * 
     * @return the value of field 'Location'.
     */
    public java.lang.String getLocation(
    ) {
        return this._location;
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
     * Returns the value of field 'notes'.
     * 
     * @return the value of field 'Notes'.
     */
    public java.lang.String getNotes(
    ) {
        return this._notes;
    }

    /**
     * Returns the value of field 'PONumber'.
     * 
     * @return the value of field 'PONumber'.
     */
    public java.lang.String getPONumber(
    ) {
        return this._PONumber;
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
     * Returns the value of field 'purchaseDate'.
     * 
     * @return the value of field 'PurchaseDate'.
     */
    public java.lang.String getPurchaseDate(
    ) {
        return this._purchaseDate;
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
     * Returns the value of field 'serialNumber'.
     * 
     * @return the value of field 'SerialNumber'.
     */
    public java.lang.String getSerialNumber(
    ) {
        return this._serialNumber;
    }

    /**
     * Returns the value of field 'vendorOrPayeeName'.
     * 
     * @return the value of field 'VendorOrPayeeName'.
     */
    public java.lang.String getVendorOrPayeeName(
    ) {
        return this._vendorOrPayeeName;
    }

    /**
     * Returns the value of field 'warrantyExpDate'.
     * 
     * @return the value of field 'WarrantyExpDate'.
     */
    public java.lang.String getWarrantyExpDate(
    ) {
        return this._warrantyExpDate;
    }

    /**
     * Returns the value of field 'yearEndAccumulatedDepreciation'.
     * 
     * @return the value of field 'YearEndAccumulatedDepreciation'.
     */
    public java.lang.String getYearEndAccumulatedDepreciation(
    ) {
        return this._yearEndAccumulatedDepreciation;
    }

    /**
     * Returns the value of field 'yearEndBookValue'.
     * 
     * @return the value of field 'YearEndBookValue'.
     */
    public java.lang.String getYearEndBookValue(
    ) {
        return this._yearEndBookValue;
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
     * Sets the value of field 'acquiredAs'.
     * 
     * @param acquiredAs the value of field 'acquiredAs'.
     */
    public void setAcquiredAs(
            final org.chocolate_milk.model.types.AcquiredAsType acquiredAs) {
        this._acquiredAs = acquiredAs;
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
     * Sets the value of field 'assetDesc'.
     * 
     * @param assetDesc the value of field 'assetDesc'.
     */
    public void setAssetDesc(
            final java.lang.String assetDesc) {
        this._assetDesc = assetDesc;
    }

    /**
     * Sets the value of field 'assetNumber'.
     * 
     * @param assetNumber the value of field 'assetNumber'.
     */
    public void setAssetNumber(
            final java.lang.String assetNumber) {
        this._assetNumber = assetNumber;
    }

    /**
     * Sets the value of field 'costBasis'.
     * 
     * @param costBasis the value of field 'costBasis'.
     */
    public void setCostBasis(
            final java.lang.String costBasis) {
        this._costBasis = costBasis;
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
     * Sets the value of field 'fixedAssetSalesInfo'.
     * 
     * @param fixedAssetSalesInfo the value of field
     * 'fixedAssetSalesInfo'.
     */
    public void setFixedAssetSalesInfo(
            final org.chocolate_milk.model.FixedAssetSalesInfo fixedAssetSalesInfo) {
        this._fixedAssetSalesInfo = fixedAssetSalesInfo;
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
     * Sets the value of field 'listCore'.
     * 
     * @param listCore the value of field 'listCore'.
     */
    public void setListCore(
            final org.chocolate_milk.model.ListCore listCore) {
        this._listCore = listCore;
    }

    /**
     * Sets the value of field 'location'.
     * 
     * @param location the value of field 'location'.
     */
    public void setLocation(
            final java.lang.String location) {
        this._location = location;
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
     * Sets the value of field 'notes'.
     * 
     * @param notes the value of field 'notes'.
     */
    public void setNotes(
            final java.lang.String notes) {
        this._notes = notes;
    }

    /**
     * Sets the value of field 'PONumber'.
     * 
     * @param PONumber the value of field 'PONumber'.
     */
    public void setPONumber(
            final java.lang.String PONumber) {
        this._PONumber = PONumber;
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
     * Sets the value of field 'purchaseDate'.
     * 
     * @param purchaseDate the value of field 'purchaseDate'.
     */
    public void setPurchaseDate(
            final java.lang.String purchaseDate) {
        this._purchaseDate = purchaseDate;
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
     * Sets the value of field 'serialNumber'.
     * 
     * @param serialNumber the value of field 'serialNumber'.
     */
    public void setSerialNumber(
            final java.lang.String serialNumber) {
        this._serialNumber = serialNumber;
    }

    /**
     * Sets the value of field 'vendorOrPayeeName'.
     * 
     * @param vendorOrPayeeName the value of field
     * 'vendorOrPayeeName'.
     */
    public void setVendorOrPayeeName(
            final java.lang.String vendorOrPayeeName) {
        this._vendorOrPayeeName = vendorOrPayeeName;
    }

    /**
     * Sets the value of field 'warrantyExpDate'.
     * 
     * @param warrantyExpDate the value of field 'warrantyExpDate'.
     */
    public void setWarrantyExpDate(
            final java.lang.String warrantyExpDate) {
        this._warrantyExpDate = warrantyExpDate;
    }

    /**
     * Sets the value of field 'yearEndAccumulatedDepreciation'.
     * 
     * @param yearEndAccumulatedDepreciation the value of field
     * 'yearEndAccumulatedDepreciation'.
     */
    public void setYearEndAccumulatedDepreciation(
            final java.lang.String yearEndAccumulatedDepreciation) {
        this._yearEndAccumulatedDepreciation = yearEndAccumulatedDepreciation;
    }

    /**
     * Sets the value of field 'yearEndBookValue'.
     * 
     * @param yearEndBookValue the value of field 'yearEndBookValue'
     */
    public void setYearEndBookValue(
            final java.lang.String yearEndBookValue) {
        this._yearEndBookValue = yearEndBookValue;
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
     * org.chocolate_milk.model.ItemFixedAssetRet
     */
    public static org.chocolate_milk.model.ItemFixedAssetRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemFixedAssetRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemFixedAssetRet.class, reader);
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
