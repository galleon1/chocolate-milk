/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InvoiceLineGroupMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InvoiceLineGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class InvoiceLineGroupMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

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
     * Field _invoiceLineModList.
     */
    private java.util.List<org.chocolate_milk.model.InvoiceLineMod> _invoiceLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public InvoiceLineGroupMod() {
        super();
        this._invoiceLineModList = new java.util.ArrayList<org.chocolate_milk.model.InvoiceLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInvoiceLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInvoiceLineMod(
            final org.chocolate_milk.model.InvoiceLineMod vInvoiceLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._invoiceLineModList.add(vInvoiceLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vInvoiceLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInvoiceLineMod(
            final int index,
            final org.chocolate_milk.model.InvoiceLineMod vInvoiceLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._invoiceLineModList.add(index, vInvoiceLineMod);
    }

    /**
     * Method enumerateInvoiceLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.InvoiceLineMod> enumerateInvoiceLineMod(
    ) {
        return java.util.Collections.enumeration(this._invoiceLineModList);
    }

    /**
     * Method getInvoiceLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.InvoiceLineMod at the given index
     */
    public org.chocolate_milk.model.InvoiceLineMod getInvoiceLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._invoiceLineModList.size()) {
            throw new IndexOutOfBoundsException("getInvoiceLineMod: Index value '" + index + "' not in range [0.." + (this._invoiceLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.InvoiceLineMod) _invoiceLineModList.get(index);
    }

    /**
     * Method getInvoiceLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.InvoiceLineMod[] getInvoiceLineMod(
    ) {
        org.chocolate_milk.model.InvoiceLineMod[] array = new org.chocolate_milk.model.InvoiceLineMod[0];
        return (org.chocolate_milk.model.InvoiceLineMod[]) this._invoiceLineModList.toArray(array);
    }

    /**
     * Method getInvoiceLineModCount.
     * 
     * @return the size of this collection
     */
    public int getInvoiceLineModCount(
    ) {
        return this._invoiceLineModList.size();
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
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public java.lang.String getTxnLineID(
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
     * Method iterateInvoiceLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.InvoiceLineMod> iterateInvoiceLineMod(
    ) {
        return this._invoiceLineModList.iterator();
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
    public void removeAllInvoiceLineMod(
    ) {
        this._invoiceLineModList.clear();
    }

    /**
     * Method removeInvoiceLineMod.
     * 
     * @param vInvoiceLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeInvoiceLineMod(
            final org.chocolate_milk.model.InvoiceLineMod vInvoiceLineMod) {
        boolean removed = _invoiceLineModList.remove(vInvoiceLineMod);
        return removed;
    }

    /**
     * Method removeInvoiceLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.InvoiceLineMod removeInvoiceLineModAt(
            final int index) {
        java.lang.Object obj = this._invoiceLineModList.remove(index);
        return (org.chocolate_milk.model.InvoiceLineMod) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vInvoiceLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInvoiceLineMod(
            final int index,
            final org.chocolate_milk.model.InvoiceLineMod vInvoiceLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._invoiceLineModList.size()) {
            throw new IndexOutOfBoundsException("setInvoiceLineMod: Index value '" + index + "' not in range [0.." + (this._invoiceLineModList.size() - 1) + "]");
        }

        this._invoiceLineModList.set(index, vInvoiceLineMod);
    }

    /**
     * 
     * 
     * @param vInvoiceLineModArray
     */
    public void setInvoiceLineMod(
            final org.chocolate_milk.model.InvoiceLineMod[] vInvoiceLineModArray) {
        //-- copy array
        _invoiceLineModList.clear();

        for (int i = 0; i < vInvoiceLineModArray.length; i++) {
                this._invoiceLineModList.add(vInvoiceLineModArray[i]);
        }
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
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final java.lang.String txnLineID) {
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
     * org.chocolate_milk.model.InvoiceLineGroupMod
     */
    public static org.chocolate_milk.model.InvoiceLineGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.InvoiceLineGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.InvoiceLineGroupMod.class, reader);
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
