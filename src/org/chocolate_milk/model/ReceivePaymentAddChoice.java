/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReceivePaymentAddChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReceivePaymentAddChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ReceivePaymentAddChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isAutoApply.
     */
    private java.lang.String _isAutoApply;

    /**
     * Field _appliedToTxnAddList.
     */
    private java.util.List<org.chocolate_milk.model.AppliedToTxnAdd> _appliedToTxnAddList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReceivePaymentAddChoice() {
        super();
        this._appliedToTxnAddList = new java.util.ArrayList<org.chocolate_milk.model.AppliedToTxnAdd>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnAdd(
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnAddList.add(vAppliedToTxnAdd);
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppliedToTxnAdd(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        this._appliedToTxnAddList.add(index, vAppliedToTxnAdd);
    }

    /**
     * Method enumerateAppliedToTxnAdd.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.AppliedToTxnAdd> enumerateAppliedToTxnAdd(
    ) {
        return java.util.Collections.enumeration(this._appliedToTxnAddList);
    }

    /**
     * Method getAppliedToTxnAdd.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.AppliedToTxnAdd at the given index
     */
    public org.chocolate_milk.model.AppliedToTxnAdd getAppliedToTxnAdd(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("getAppliedToTxnAdd: Index value '" + index + "' not in range [0.." + (this._appliedToTxnAddList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.AppliedToTxnAdd) _appliedToTxnAddList.get(index);
    }

    /**
     * Method getAppliedToTxnAdd.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.AppliedToTxnAdd[] getAppliedToTxnAdd(
    ) {
        org.chocolate_milk.model.AppliedToTxnAdd[] array = new org.chocolate_milk.model.AppliedToTxnAdd[0];
        return (org.chocolate_milk.model.AppliedToTxnAdd[]) this._appliedToTxnAddList.toArray(array);
    }

    /**
     * Method getAppliedToTxnAddCount.
     * 
     * @return the size of this collection
     */
    public int getAppliedToTxnAddCount(
    ) {
        return this._appliedToTxnAddList.size();
    }

    /**
     * Returns the value of field 'isAutoApply'.
     * 
     * @return the value of field 'IsAutoApply'.
     */
    public java.lang.String getIsAutoApply(
    ) {
        return this._isAutoApply;
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
     * Method iterateAppliedToTxnAdd.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.AppliedToTxnAdd> iterateAppliedToTxnAdd(
    ) {
        return this._appliedToTxnAddList.iterator();
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
    public void removeAllAppliedToTxnAdd(
    ) {
        this._appliedToTxnAddList.clear();
    }

    /**
     * Method removeAppliedToTxnAdd.
     * 
     * @param vAppliedToTxnAdd
     * @return true if the object was removed from the collection.
     */
    public boolean removeAppliedToTxnAdd(
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd) {
        boolean removed = _appliedToTxnAddList.remove(vAppliedToTxnAdd);
        return removed;
    }

    /**
     * Method removeAppliedToTxnAddAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.AppliedToTxnAdd removeAppliedToTxnAddAt(
            final int index) {
        java.lang.Object obj = this._appliedToTxnAddList.remove(index);
        return (org.chocolate_milk.model.AppliedToTxnAdd) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAppliedToTxnAdd
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAppliedToTxnAdd(
            final int index,
            final org.chocolate_milk.model.AppliedToTxnAdd vAppliedToTxnAdd)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appliedToTxnAddList.size()) {
            throw new IndexOutOfBoundsException("setAppliedToTxnAdd: Index value '" + index + "' not in range [0.." + (this._appliedToTxnAddList.size() - 1) + "]");
        }

        this._appliedToTxnAddList.set(index, vAppliedToTxnAdd);
    }

    /**
     * 
     * 
     * @param vAppliedToTxnAddArray
     */
    public void setAppliedToTxnAdd(
            final org.chocolate_milk.model.AppliedToTxnAdd[] vAppliedToTxnAddArray) {
        //-- copy array
        _appliedToTxnAddList.clear();

        for (int i = 0; i < vAppliedToTxnAddArray.length; i++) {
                this._appliedToTxnAddList.add(vAppliedToTxnAddArray[i]);
        }
    }

    /**
     * Sets the value of field 'isAutoApply'.
     * 
     * @param isAutoApply the value of field 'isAutoApply'.
     */
    public void setIsAutoApply(
            final java.lang.String isAutoApply) {
        this._isAutoApply = isAutoApply;
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
     * org.chocolate_milk.model.ReceivePaymentAddChoice
     */
    public static org.chocolate_milk.model.ReceivePaymentAddChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReceivePaymentAddChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReceivePaymentAddChoice.class, reader);
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
