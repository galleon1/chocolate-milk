/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VehicleMileageQueryChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VehicleMileageQueryChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class VehicleMileageQueryChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnIDList.
     */
    private java.util.List<java.lang.String> _txnIDList;

    /**
     * Field _vehicleMileageFilter.
     */
    private org.chocolate_milk.model.VehicleMileageFilter _vehicleMileageFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public VehicleMileageQueryChoice() {
        super();
        this._txnIDList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnID(
            final java.lang.String vTxnID)
    throws java.lang.IndexOutOfBoundsException {
        this._txnIDList.add(vTxnID);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnID(
            final int index,
            final java.lang.String vTxnID)
    throws java.lang.IndexOutOfBoundsException {
        this._txnIDList.add(index, vTxnID);
    }

    /**
     * Method enumerateTxnID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateTxnID(
    ) {
        return java.util.Collections.enumeration(this._txnIDList);
    }

    /**
     * Method getTxnID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getTxnID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnIDList.size()) {
            throw new IndexOutOfBoundsException("getTxnID: Index value '" + index + "' not in range [0.." + (this._txnIDList.size() - 1) + "]");
        }

        return (java.lang.String) _txnIDList.get(index);
    }

    /**
     * Method getTxnID.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getTxnID(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._txnIDList.toArray(array);
    }

    /**
     * Method getTxnIDCount.
     * 
     * @return the size of this collection
     */
    public int getTxnIDCount(
    ) {
        return this._txnIDList.size();
    }

    /**
     * Returns the value of field 'vehicleMileageFilter'.
     * 
     * @return the value of field 'VehicleMileageFilter'.
     */
    public org.chocolate_milk.model.VehicleMileageFilter getVehicleMileageFilter(
    ) {
        return this._vehicleMileageFilter;
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
     * Method iterateTxnID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateTxnID(
    ) {
        return this._txnIDList.iterator();
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
    public void removeAllTxnID(
    ) {
        this._txnIDList.clear();
    }

    /**
     * Method removeTxnID.
     * 
     * @param vTxnID
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnID(
            final java.lang.String vTxnID) {
        boolean removed = _txnIDList.remove(vTxnID);
        return removed;
    }

    /**
     * Method removeTxnIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeTxnIDAt(
            final int index) {
        java.lang.Object obj = this._txnIDList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnID(
            final int index,
            final java.lang.String vTxnID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnIDList.size()) {
            throw new IndexOutOfBoundsException("setTxnID: Index value '" + index + "' not in range [0.." + (this._txnIDList.size() - 1) + "]");
        }

        this._txnIDList.set(index, vTxnID);
    }

    /**
     * 
     * 
     * @param vTxnIDArray
     */
    public void setTxnID(
            final java.lang.String[] vTxnIDArray) {
        //-- copy array
        _txnIDList.clear();

        for (int i = 0; i < vTxnIDArray.length; i++) {
                this._txnIDList.add(vTxnIDArray[i]);
        }
    }

    /**
     * Sets the value of field 'vehicleMileageFilter'.
     * 
     * @param vehicleMileageFilter the value of field
     * 'vehicleMileageFilter'.
     */
    public void setVehicleMileageFilter(
            final org.chocolate_milk.model.VehicleMileageFilter vehicleMileageFilter) {
        this._vehicleMileageFilter = vehicleMileageFilter;
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
     * org.chocolate_milk.model.VehicleMileageQueryChoice
     */
    public static org.chocolate_milk.model.VehicleMileageQueryChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VehicleMileageQueryChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VehicleMileageQueryChoice.class, reader);
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
