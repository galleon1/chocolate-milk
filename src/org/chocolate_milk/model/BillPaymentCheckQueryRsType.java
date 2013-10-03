/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillPaymentCheckQueryRsType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillPaymentCheckQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class BillPaymentCheckQueryRsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _statusCode.
     */
    private long _statusCode;

    /**
     * keeps track of state for field: _statusCode
     */
    private boolean _has_statusCode;

    /**
     * Field _statusSeverity.
     */
    private java.lang.String _statusSeverity;

    /**
     * Field _statusMessage.
     */
    private java.lang.String _statusMessage;

    /**
     * Field _retCount.
     */
    private long _retCount;

    /**
     * keeps track of state for field: _retCount
     */
    private boolean _has_retCount;

    /**
     * Field _iteratorRemainingCount.
     */
    private long _iteratorRemainingCount;

    /**
     * keeps track of state for field: _iteratorRemainingCount
     */
    private boolean _has_iteratorRemainingCount;

    /**
     * Field _iteratorID.
     */
    private java.lang.String _iteratorID;

    /**
     * Field _billPaymentCheckRetList.
     */
    private java.util.List<org.chocolate_milk.model.BillPaymentCheckRet> _billPaymentCheckRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillPaymentCheckQueryRsType() {
        super();
        this._billPaymentCheckRetList = new java.util.ArrayList<org.chocolate_milk.model.BillPaymentCheckRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBillPaymentCheckRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillPaymentCheckRet(
            final org.chocolate_milk.model.BillPaymentCheckRet vBillPaymentCheckRet)
    throws java.lang.IndexOutOfBoundsException {
        this._billPaymentCheckRetList.add(vBillPaymentCheckRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vBillPaymentCheckRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillPaymentCheckRet(
            final int index,
            final org.chocolate_milk.model.BillPaymentCheckRet vBillPaymentCheckRet)
    throws java.lang.IndexOutOfBoundsException {
        this._billPaymentCheckRetList.add(index, vBillPaymentCheckRet);
    }

    /**
     */
    public void deleteIteratorRemainingCount(
    ) {
        this._has_iteratorRemainingCount= false;
    }

    /**
     */
    public void deleteRetCount(
    ) {
        this._has_retCount= false;
    }

    /**
     */
    public void deleteStatusCode(
    ) {
        this._has_statusCode= false;
    }

    /**
     * Method enumerateBillPaymentCheckRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.BillPaymentCheckRet> enumerateBillPaymentCheckRet(
    ) {
        return java.util.Collections.enumeration(this._billPaymentCheckRetList);
    }

    /**
     * Method getBillPaymentCheckRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.BillPaymentCheckRet at the given
     * index
     */
    public org.chocolate_milk.model.BillPaymentCheckRet getBillPaymentCheckRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._billPaymentCheckRetList.size()) {
            throw new IndexOutOfBoundsException("getBillPaymentCheckRet: Index value '" + index + "' not in range [0.." + (this._billPaymentCheckRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.BillPaymentCheckRet) _billPaymentCheckRetList.get(index);
    }

    /**
     * Method getBillPaymentCheckRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.BillPaymentCheckRet[] getBillPaymentCheckRet(
    ) {
        org.chocolate_milk.model.BillPaymentCheckRet[] array = new org.chocolate_milk.model.BillPaymentCheckRet[0];
        return (org.chocolate_milk.model.BillPaymentCheckRet[]) this._billPaymentCheckRetList.toArray(array);
    }

    /**
     * Method getBillPaymentCheckRetCount.
     * 
     * @return the size of this collection
     */
    public int getBillPaymentCheckRetCount(
    ) {
        return this._billPaymentCheckRetList.size();
    }

    /**
     * Returns the value of field 'iteratorID'.
     * 
     * @return the value of field 'IteratorID'.
     */
    public java.lang.String getIteratorID(
    ) {
        return this._iteratorID;
    }

    /**
     * Returns the value of field 'iteratorRemainingCount'.
     * 
     * @return the value of field 'IteratorRemainingCount'.
     */
    public long getIteratorRemainingCount(
    ) {
        return this._iteratorRemainingCount;
    }

    /**
     * Returns the value of field 'requestID'.
     * 
     * @return the value of field 'RequestID'.
     */
    public java.lang.String getRequestID(
    ) {
        return this._requestID;
    }

    /**
     * Returns the value of field 'retCount'.
     * 
     * @return the value of field 'RetCount'.
     */
    public long getRetCount(
    ) {
        return this._retCount;
    }

    /**
     * Returns the value of field 'statusCode'.
     * 
     * @return the value of field 'StatusCode'.
     */
    public long getStatusCode(
    ) {
        return this._statusCode;
    }

    /**
     * Returns the value of field 'statusMessage'.
     * 
     * @return the value of field 'StatusMessage'.
     */
    public java.lang.String getStatusMessage(
    ) {
        return this._statusMessage;
    }

    /**
     * Returns the value of field 'statusSeverity'.
     * 
     * @return the value of field 'StatusSeverity'.
     */
    public java.lang.String getStatusSeverity(
    ) {
        return this._statusSeverity;
    }

    /**
     * Method hasIteratorRemainingCount.
     * 
     * @return true if at least one IteratorRemainingCount has been
     * added
     */
    public boolean hasIteratorRemainingCount(
    ) {
        return this._has_iteratorRemainingCount;
    }

    /**
     * Method hasRetCount.
     * 
     * @return true if at least one RetCount has been added
     */
    public boolean hasRetCount(
    ) {
        return this._has_retCount;
    }

    /**
     * Method hasStatusCode.
     * 
     * @return true if at least one StatusCode has been added
     */
    public boolean hasStatusCode(
    ) {
        return this._has_statusCode;
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
     * Method iterateBillPaymentCheckRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.BillPaymentCheckRet> iterateBillPaymentCheckRet(
    ) {
        return this._billPaymentCheckRetList.iterator();
    }

    /**
     */
    public void removeAllBillPaymentCheckRet(
    ) {
        this._billPaymentCheckRetList.clear();
    }

    /**
     * Method removeBillPaymentCheckRet.
     * 
     * @param vBillPaymentCheckRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeBillPaymentCheckRet(
            final org.chocolate_milk.model.BillPaymentCheckRet vBillPaymentCheckRet) {
        boolean removed = _billPaymentCheckRetList.remove(vBillPaymentCheckRet);
        return removed;
    }

    /**
     * Method removeBillPaymentCheckRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.BillPaymentCheckRet removeBillPaymentCheckRetAt(
            final int index) {
        java.lang.Object obj = this._billPaymentCheckRetList.remove(index);
        return (org.chocolate_milk.model.BillPaymentCheckRet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBillPaymentCheckRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBillPaymentCheckRet(
            final int index,
            final org.chocolate_milk.model.BillPaymentCheckRet vBillPaymentCheckRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._billPaymentCheckRetList.size()) {
            throw new IndexOutOfBoundsException("setBillPaymentCheckRet: Index value '" + index + "' not in range [0.." + (this._billPaymentCheckRetList.size() - 1) + "]");
        }

        this._billPaymentCheckRetList.set(index, vBillPaymentCheckRet);
    }

    /**
     * 
     * 
     * @param vBillPaymentCheckRetArray
     */
    public void setBillPaymentCheckRet(
            final org.chocolate_milk.model.BillPaymentCheckRet[] vBillPaymentCheckRetArray) {
        //-- copy array
        _billPaymentCheckRetList.clear();

        for (int i = 0; i < vBillPaymentCheckRetArray.length; i++) {
                this._billPaymentCheckRetList.add(vBillPaymentCheckRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'iteratorID'.
     * 
     * @param iteratorID the value of field 'iteratorID'.
     */
    public void setIteratorID(
            final java.lang.String iteratorID) {
        this._iteratorID = iteratorID;
    }

    /**
     * Sets the value of field 'iteratorRemainingCount'.
     * 
     * @param iteratorRemainingCount the value of field
     * 'iteratorRemainingCount'.
     */
    public void setIteratorRemainingCount(
            final long iteratorRemainingCount) {
        this._iteratorRemainingCount = iteratorRemainingCount;
        this._has_iteratorRemainingCount = true;
    }

    /**
     * Sets the value of field 'requestID'.
     * 
     * @param requestID the value of field 'requestID'.
     */
    public void setRequestID(
            final java.lang.String requestID) {
        this._requestID = requestID;
    }

    /**
     * Sets the value of field 'retCount'.
     * 
     * @param retCount the value of field 'retCount'.
     */
    public void setRetCount(
            final long retCount) {
        this._retCount = retCount;
        this._has_retCount = true;
    }

    /**
     * Sets the value of field 'statusCode'.
     * 
     * @param statusCode the value of field 'statusCode'.
     */
    public void setStatusCode(
            final long statusCode) {
        this._statusCode = statusCode;
        this._has_statusCode = true;
    }

    /**
     * Sets the value of field 'statusMessage'.
     * 
     * @param statusMessage the value of field 'statusMessage'.
     */
    public void setStatusMessage(
            final java.lang.String statusMessage) {
        this._statusMessage = statusMessage;
    }

    /**
     * Sets the value of field 'statusSeverity'.
     * 
     * @param statusSeverity the value of field 'statusSeverity'.
     */
    public void setStatusSeverity(
            final java.lang.String statusSeverity) {
        this._statusSeverity = statusSeverity;
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
