/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateLineGroupMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateLineGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EstimateLineGroupMod implements java.io.Serializable {


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
     * Field _estimateLineModList.
     */
    private java.util.List<org.chocolate_milk.model.EstimateLineMod> _estimateLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateLineGroupMod() {
        super();
        this._estimateLineModList = new java.util.ArrayList<org.chocolate_milk.model.EstimateLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEstimateLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateLineMod(
            final org.chocolate_milk.model.EstimateLineMod vEstimateLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._estimateLineModList.add(vEstimateLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateLineMod(
            final int index,
            final org.chocolate_milk.model.EstimateLineMod vEstimateLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._estimateLineModList.add(index, vEstimateLineMod);
    }

    /**
     * Method enumerateEstimateLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.EstimateLineMod> enumerateEstimateLineMod(
    ) {
        return java.util.Collections.enumeration(this._estimateLineModList);
    }

    /**
     * Method getEstimateLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.EstimateLineMod at the given index
     */
    public org.chocolate_milk.model.EstimateLineMod getEstimateLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._estimateLineModList.size()) {
            throw new IndexOutOfBoundsException("getEstimateLineMod: Index value '" + index + "' not in range [0.." + (this._estimateLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.EstimateLineMod) _estimateLineModList.get(index);
    }

    /**
     * Method getEstimateLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.EstimateLineMod[] getEstimateLineMod(
    ) {
        org.chocolate_milk.model.EstimateLineMod[] array = new org.chocolate_milk.model.EstimateLineMod[0];
        return (org.chocolate_milk.model.EstimateLineMod[]) this._estimateLineModList.toArray(array);
    }

    /**
     * Method getEstimateLineModCount.
     * 
     * @return the size of this collection
     */
    public int getEstimateLineModCount(
    ) {
        return this._estimateLineModList.size();
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
     * Method iterateEstimateLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.EstimateLineMod> iterateEstimateLineMod(
    ) {
        return this._estimateLineModList.iterator();
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
    public void removeAllEstimateLineMod(
    ) {
        this._estimateLineModList.clear();
    }

    /**
     * Method removeEstimateLineMod.
     * 
     * @param vEstimateLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeEstimateLineMod(
            final org.chocolate_milk.model.EstimateLineMod vEstimateLineMod) {
        boolean removed = _estimateLineModList.remove(vEstimateLineMod);
        return removed;
    }

    /**
     * Method removeEstimateLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.EstimateLineMod removeEstimateLineModAt(
            final int index) {
        java.lang.Object obj = this._estimateLineModList.remove(index);
        return (org.chocolate_milk.model.EstimateLineMod) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEstimateLineMod(
            final int index,
            final org.chocolate_milk.model.EstimateLineMod vEstimateLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._estimateLineModList.size()) {
            throw new IndexOutOfBoundsException("setEstimateLineMod: Index value '" + index + "' not in range [0.." + (this._estimateLineModList.size() - 1) + "]");
        }

        this._estimateLineModList.set(index, vEstimateLineMod);
    }

    /**
     * 
     * 
     * @param vEstimateLineModArray
     */
    public void setEstimateLineMod(
            final org.chocolate_milk.model.EstimateLineMod[] vEstimateLineModArray) {
        //-- copy array
        _estimateLineModList.clear();

        for (int i = 0; i < vEstimateLineModArray.length; i++) {
                this._estimateLineModList.add(vEstimateLineModArray[i]);
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
     * org.chocolate_milk.model.EstimateLineGroupMod
     */
    public static org.chocolate_milk.model.EstimateLineGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateLineGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateLineGroupMod.class, reader);
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
