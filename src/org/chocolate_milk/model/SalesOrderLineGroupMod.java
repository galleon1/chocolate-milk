/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesOrderLineGroupMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesOrderLineGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SalesOrderLineGroupMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _txnLineGroupCoreMod.
     */
    private org.chocolate_milk.model.TxnLineGroupCoreMod _txnLineGroupCoreMod;

    /**
     * Field _salesOrderLineModList.
     */
    private java.util.List<org.chocolate_milk.model.SalesOrderLineMod> _salesOrderLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesOrderLineGroupMod() {
        super();
        this._salesOrderLineModList = new java.util.ArrayList<org.chocolate_milk.model.SalesOrderLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSalesOrderLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesOrderLineMod(
            final org.chocolate_milk.model.SalesOrderLineMod vSalesOrderLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._salesOrderLineModList.add(vSalesOrderLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesOrderLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesOrderLineMod(
            final int index,
            final org.chocolate_milk.model.SalesOrderLineMod vSalesOrderLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._salesOrderLineModList.add(index, vSalesOrderLineMod);
    }

    /**
     * Method enumerateSalesOrderLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SalesOrderLineMod> enumerateSalesOrderLineMod(
    ) {
        return java.util.Collections.enumeration(this._salesOrderLineModList);
    }

    /**
     * Method getSalesOrderLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.SalesOrderLineMod at the given index
     */
    public org.chocolate_milk.model.SalesOrderLineMod getSalesOrderLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesOrderLineModList.size()) {
            throw new IndexOutOfBoundsException("getSalesOrderLineMod: Index value '" + index + "' not in range [0.." + (this._salesOrderLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SalesOrderLineMod) _salesOrderLineModList.get(index);
    }

    /**
     * Method getSalesOrderLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SalesOrderLineMod[] getSalesOrderLineMod(
    ) {
        org.chocolate_milk.model.SalesOrderLineMod[] array = new org.chocolate_milk.model.SalesOrderLineMod[0];
        return (org.chocolate_milk.model.SalesOrderLineMod[]) this._salesOrderLineModList.toArray(array);
    }

    /**
     * Method getSalesOrderLineModCount.
     * 
     * @return the size of this collection
     */
    public int getSalesOrderLineModCount(
    ) {
        return this._salesOrderLineModList.size();
    }

    /**
     * Returns the value of field 'txnLineGroupCoreMod'.
     * 
     * @return the value of field 'TxnLineGroupCoreMod'.
     */
    public org.chocolate_milk.model.TxnLineGroupCoreMod getTxnLineGroupCoreMod(
    ) {
        return this._txnLineGroupCoreMod;
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
     * Method iterateSalesOrderLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SalesOrderLineMod> iterateSalesOrderLineMod(
    ) {
        return this._salesOrderLineModList.iterator();
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
    public void removeAllSalesOrderLineMod(
    ) {
        this._salesOrderLineModList.clear();
    }

    /**
     * Method removeSalesOrderLineMod.
     * 
     * @param vSalesOrderLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeSalesOrderLineMod(
            final org.chocolate_milk.model.SalesOrderLineMod vSalesOrderLineMod) {
        boolean removed = _salesOrderLineModList.remove(vSalesOrderLineMod);
        return removed;
    }

    /**
     * Method removeSalesOrderLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SalesOrderLineMod removeSalesOrderLineModAt(
            final int index) {
        java.lang.Object obj = this._salesOrderLineModList.remove(index);
        return (org.chocolate_milk.model.SalesOrderLineMod) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesOrderLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSalesOrderLineMod(
            final int index,
            final org.chocolate_milk.model.SalesOrderLineMod vSalesOrderLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesOrderLineModList.size()) {
            throw new IndexOutOfBoundsException("setSalesOrderLineMod: Index value '" + index + "' not in range [0.." + (this._salesOrderLineModList.size() - 1) + "]");
        }

        this._salesOrderLineModList.set(index, vSalesOrderLineMod);
    }

    /**
     * 
     * 
     * @param vSalesOrderLineModArray
     */
    public void setSalesOrderLineMod(
            final org.chocolate_milk.model.SalesOrderLineMod[] vSalesOrderLineModArray) {
        //-- copy array
        _salesOrderLineModList.clear();

        for (int i = 0; i < vSalesOrderLineModArray.length; i++) {
                this._salesOrderLineModList.add(vSalesOrderLineModArray[i]);
        }
    }

    /**
     * Sets the value of field 'txnLineGroupCoreMod'.
     * 
     * @param txnLineGroupCoreMod the value of field
     * 'txnLineGroupCoreMod'.
     */
    public void setTxnLineGroupCoreMod(
            final org.chocolate_milk.model.TxnLineGroupCoreMod txnLineGroupCoreMod) {
        this._txnLineGroupCoreMod = txnLineGroupCoreMod;
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
     * org.chocolate_milk.model.SalesOrderLineGroupMod
     */
    public static org.chocolate_milk.model.SalesOrderLineGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesOrderLineGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesOrderLineGroupMod.class, reader);
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
