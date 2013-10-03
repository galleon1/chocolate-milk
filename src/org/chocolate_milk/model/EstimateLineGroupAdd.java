/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateLineGroupAdd.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateLineGroupAdd.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EstimateLineGroupAdd implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineGroupCoreAdd.
     */
    private org.chocolate_milk.model.TxnLineGroupCoreAdd _txnLineGroupCoreAdd;

    /**
     * Field _dataExtList.
     */
    private java.util.List<org.chocolate_milk.model.DataExt> _dataExtList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateLineGroupAdd() {
        super();
        this._dataExtList = new java.util.ArrayList<org.chocolate_milk.model.DataExt>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDataExt
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExt(
            final org.chocolate_milk.model.DataExt vDataExt)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtList.add(vDataExt);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExt
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExt(
            final int index,
            final org.chocolate_milk.model.DataExt vDataExt)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtList.add(index, vDataExt);
    }

    /**
     * Method enumerateDataExt.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DataExt> enumerateDataExt(
    ) {
        return java.util.Collections.enumeration(this._dataExtList);
    }

    /**
     * Method getDataExt.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.DataExt at
     * the given index
     */
    public org.chocolate_milk.model.DataExt getDataExt(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtList.size()) {
            throw new IndexOutOfBoundsException("getDataExt: Index value '" + index + "' not in range [0.." + (this._dataExtList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DataExt) _dataExtList.get(index);
    }

    /**
     * Method getDataExt.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DataExt[] getDataExt(
    ) {
        org.chocolate_milk.model.DataExt[] array = new org.chocolate_milk.model.DataExt[0];
        return (org.chocolate_milk.model.DataExt[]) this._dataExtList.toArray(array);
    }

    /**
     * Method getDataExtCount.
     * 
     * @return the size of this collection
     */
    public int getDataExtCount(
    ) {
        return this._dataExtList.size();
    }

    /**
     * Returns the value of field 'txnLineGroupCoreAdd'.
     * 
     * @return the value of field 'TxnLineGroupCoreAdd'.
     */
    public org.chocolate_milk.model.TxnLineGroupCoreAdd getTxnLineGroupCoreAdd(
    ) {
        return this._txnLineGroupCoreAdd;
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
     * Method iterateDataExt.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DataExt> iterateDataExt(
    ) {
        return this._dataExtList.iterator();
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
    public void removeAllDataExt(
    ) {
        this._dataExtList.clear();
    }

    /**
     * Method removeDataExt.
     * 
     * @param vDataExt
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataExt(
            final org.chocolate_milk.model.DataExt vDataExt) {
        boolean removed = _dataExtList.remove(vDataExt);
        return removed;
    }

    /**
     * Method removeDataExtAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DataExt removeDataExtAt(
            final int index) {
        java.lang.Object obj = this._dataExtList.remove(index);
        return (org.chocolate_milk.model.DataExt) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExt
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataExt(
            final int index,
            final org.chocolate_milk.model.DataExt vDataExt)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtList.size()) {
            throw new IndexOutOfBoundsException("setDataExt: Index value '" + index + "' not in range [0.." + (this._dataExtList.size() - 1) + "]");
        }

        this._dataExtList.set(index, vDataExt);
    }

    /**
     * 
     * 
     * @param vDataExtArray
     */
    public void setDataExt(
            final org.chocolate_milk.model.DataExt[] vDataExtArray) {
        //-- copy array
        _dataExtList.clear();

        for (int i = 0; i < vDataExtArray.length; i++) {
                this._dataExtList.add(vDataExtArray[i]);
        }
    }

    /**
     * Sets the value of field 'txnLineGroupCoreAdd'.
     * 
     * @param txnLineGroupCoreAdd the value of field
     * 'txnLineGroupCoreAdd'.
     */
    public void setTxnLineGroupCoreAdd(
            final org.chocolate_milk.model.TxnLineGroupCoreAdd txnLineGroupCoreAdd) {
        this._txnLineGroupCoreAdd = txnLineGroupCoreAdd;
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
     * org.chocolate_milk.model.EstimateLineGroupAdd
     */
    public static org.chocolate_milk.model.EstimateLineGroupAdd unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateLineGroupAdd) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateLineGroupAdd.class, reader);
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
