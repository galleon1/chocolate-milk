/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesReceiptLineGroupMod.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesReceiptLineGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesReceiptLineGroupMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private org.chocolate_milk.model.SalesReceiptLineGroupModTxnLineID _txnLineID;

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
     * Field _salesReceiptLineModList.
     */
    private java.util.List<org.chocolate_milk.model.SalesReceiptLineMod> _salesReceiptLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesReceiptLineGroupMod() {
        super();
        this._salesReceiptLineModList = new java.util.ArrayList<org.chocolate_milk.model.SalesReceiptLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSalesReceiptLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesReceiptLineMod(
            final org.chocolate_milk.model.SalesReceiptLineMod vSalesReceiptLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._salesReceiptLineModList.add(vSalesReceiptLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesReceiptLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesReceiptLineMod(
            final int index,
            final org.chocolate_milk.model.SalesReceiptLineMod vSalesReceiptLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._salesReceiptLineModList.add(index, vSalesReceiptLineMod);
    }

    /**
     * Method enumerateSalesReceiptLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SalesReceiptLineMod> enumerateSalesReceiptLineMod(
    ) {
        return java.util.Collections.enumeration(this._salesReceiptLineModList);
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
     * Returns the value of field 'quantity'.
     * 
     * @return the value of field 'Quantity'.
     */
    public java.lang.String getQuantity(
    ) {
        return this._quantity;
    }

    /**
     * Method getSalesReceiptLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.SalesReceiptLineMod at the given
     * index
     */
    public org.chocolate_milk.model.SalesReceiptLineMod getSalesReceiptLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesReceiptLineModList.size()) {
            throw new IndexOutOfBoundsException("getSalesReceiptLineMod: Index value '" + index + "' not in range [0.." + (this._salesReceiptLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SalesReceiptLineMod) _salesReceiptLineModList.get(index);
    }

    /**
     * Method getSalesReceiptLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SalesReceiptLineMod[] getSalesReceiptLineMod(
    ) {
        org.chocolate_milk.model.SalesReceiptLineMod[] array = new org.chocolate_milk.model.SalesReceiptLineMod[0];
        return (org.chocolate_milk.model.SalesReceiptLineMod[]) this._salesReceiptLineModList.toArray(array);
    }

    /**
     * Method getSalesReceiptLineModCount.
     * 
     * @return the size of this collection
     */
    public int getSalesReceiptLineModCount(
    ) {
        return this._salesReceiptLineModList.size();
    }

    /**
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public org.chocolate_milk.model.SalesReceiptLineGroupModTxnLineID getTxnLineID(
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
     * Method iterateSalesReceiptLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SalesReceiptLineMod> iterateSalesReceiptLineMod(
    ) {
        return this._salesReceiptLineModList.iterator();
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
    public void removeAllSalesReceiptLineMod(
    ) {
        this._salesReceiptLineModList.clear();
    }

    /**
     * Method removeSalesReceiptLineMod.
     * 
     * @param vSalesReceiptLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeSalesReceiptLineMod(
            final org.chocolate_milk.model.SalesReceiptLineMod vSalesReceiptLineMod) {
        boolean removed = _salesReceiptLineModList.remove(vSalesReceiptLineMod);
        return removed;
    }

    /**
     * Method removeSalesReceiptLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SalesReceiptLineMod removeSalesReceiptLineModAt(
            final int index) {
        java.lang.Object obj = this._salesReceiptLineModList.remove(index);
        return (org.chocolate_milk.model.SalesReceiptLineMod) obj;
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
     * Sets the value of field 'quantity'.
     * 
     * @param quantity the value of field 'quantity'.
     */
    public void setQuantity(
            final java.lang.String quantity) {
        this._quantity = quantity;
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesReceiptLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSalesReceiptLineMod(
            final int index,
            final org.chocolate_milk.model.SalesReceiptLineMod vSalesReceiptLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesReceiptLineModList.size()) {
            throw new IndexOutOfBoundsException("setSalesReceiptLineMod: Index value '" + index + "' not in range [0.." + (this._salesReceiptLineModList.size() - 1) + "]");
        }

        this._salesReceiptLineModList.set(index, vSalesReceiptLineMod);
    }

    /**
     * 
     * 
     * @param vSalesReceiptLineModArray
     */
    public void setSalesReceiptLineMod(
            final org.chocolate_milk.model.SalesReceiptLineMod[] vSalesReceiptLineModArray) {
        //-- copy array
        _salesReceiptLineModList.clear();

        for (int i = 0; i < vSalesReceiptLineModArray.length; i++) {
                this._salesReceiptLineModList.add(vSalesReceiptLineModArray[i]);
        }
    }

    /**
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final org.chocolate_milk.model.SalesReceiptLineGroupModTxnLineID txnLineID) {
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
     * org.chocolate_milk.model.SalesReceiptLineGroupMod
     */
    public static org.chocolate_milk.model.SalesReceiptLineGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesReceiptLineGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesReceiptLineGroupMod.class, reader);
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
