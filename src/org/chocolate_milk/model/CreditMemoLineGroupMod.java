/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditMemoLineGroupMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditMemoLineGroupMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditMemoLineGroupMod implements java.io.Serializable {


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
     * Field _creditMemoLineModList.
     */
    private java.util.List<org.chocolate_milk.model.CreditMemoLineMod> _creditMemoLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditMemoLineGroupMod() {
        super();
        this._creditMemoLineModList = new java.util.ArrayList<org.chocolate_milk.model.CreditMemoLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCreditMemoLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditMemoLineMod(
            final org.chocolate_milk.model.CreditMemoLineMod vCreditMemoLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._creditMemoLineModList.add(vCreditMemoLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditMemoLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditMemoLineMod(
            final int index,
            final org.chocolate_milk.model.CreditMemoLineMod vCreditMemoLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._creditMemoLineModList.add(index, vCreditMemoLineMod);
    }

    /**
     * Method enumerateCreditMemoLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CreditMemoLineMod> enumerateCreditMemoLineMod(
    ) {
        return java.util.Collections.enumeration(this._creditMemoLineModList);
    }

    /**
     * Method getCreditMemoLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CreditMemoLineMod at the given index
     */
    public org.chocolate_milk.model.CreditMemoLineMod getCreditMemoLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._creditMemoLineModList.size()) {
            throw new IndexOutOfBoundsException("getCreditMemoLineMod: Index value '" + index + "' not in range [0.." + (this._creditMemoLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CreditMemoLineMod) _creditMemoLineModList.get(index);
    }

    /**
     * Method getCreditMemoLineMod.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CreditMemoLineMod[] getCreditMemoLineMod(
    ) {
        org.chocolate_milk.model.CreditMemoLineMod[] array = new org.chocolate_milk.model.CreditMemoLineMod[0];
        return (org.chocolate_milk.model.CreditMemoLineMod[]) this._creditMemoLineModList.toArray(array);
    }

    /**
     * Method getCreditMemoLineModCount.
     * 
     * @return the size of this collection
     */
    public int getCreditMemoLineModCount(
    ) {
        return this._creditMemoLineModList.size();
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
     * Method iterateCreditMemoLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CreditMemoLineMod> iterateCreditMemoLineMod(
    ) {
        return this._creditMemoLineModList.iterator();
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
    public void removeAllCreditMemoLineMod(
    ) {
        this._creditMemoLineModList.clear();
    }

    /**
     * Method removeCreditMemoLineMod.
     * 
     * @param vCreditMemoLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeCreditMemoLineMod(
            final org.chocolate_milk.model.CreditMemoLineMod vCreditMemoLineMod) {
        boolean removed = _creditMemoLineModList.remove(vCreditMemoLineMod);
        return removed;
    }

    /**
     * Method removeCreditMemoLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CreditMemoLineMod removeCreditMemoLineModAt(
            final int index) {
        java.lang.Object obj = this._creditMemoLineModList.remove(index);
        return (org.chocolate_milk.model.CreditMemoLineMod) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditMemoLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCreditMemoLineMod(
            final int index,
            final org.chocolate_milk.model.CreditMemoLineMod vCreditMemoLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._creditMemoLineModList.size()) {
            throw new IndexOutOfBoundsException("setCreditMemoLineMod: Index value '" + index + "' not in range [0.." + (this._creditMemoLineModList.size() - 1) + "]");
        }

        this._creditMemoLineModList.set(index, vCreditMemoLineMod);
    }

    /**
     * 
     * 
     * @param vCreditMemoLineModArray
     */
    public void setCreditMemoLineMod(
            final org.chocolate_milk.model.CreditMemoLineMod[] vCreditMemoLineModArray) {
        //-- copy array
        _creditMemoLineModList.clear();

        for (int i = 0; i < vCreditMemoLineModArray.length; i++) {
                this._creditMemoLineModList.add(vCreditMemoLineModArray[i]);
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
     * org.chocolate_milk.model.CreditMemoLineGroupMod
     */
    public static org.chocolate_milk.model.CreditMemoLineGroupMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditMemoLineGroupMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditMemoLineGroupMod.class, reader);
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
