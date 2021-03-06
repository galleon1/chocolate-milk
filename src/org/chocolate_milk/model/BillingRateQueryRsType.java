/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillingRateQueryRsType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillingRateQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class BillingRateQueryRsType implements java.io.Serializable {


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
     * Field _billingRateRetList.
     */
    private java.util.List<org.chocolate_milk.model.BillingRateRet> _billingRateRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillingRateQueryRsType() {
        super();
        this._billingRateRetList = new java.util.ArrayList<org.chocolate_milk.model.BillingRateRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBillingRateRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillingRateRet(
            final org.chocolate_milk.model.BillingRateRet vBillingRateRet)
    throws java.lang.IndexOutOfBoundsException {
        this._billingRateRetList.add(vBillingRateRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vBillingRateRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBillingRateRet(
            final int index,
            final org.chocolate_milk.model.BillingRateRet vBillingRateRet)
    throws java.lang.IndexOutOfBoundsException {
        this._billingRateRetList.add(index, vBillingRateRet);
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
     * Method enumerateBillingRateRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.BillingRateRet> enumerateBillingRateRet(
    ) {
        return java.util.Collections.enumeration(this._billingRateRetList);
    }

    /**
     * Method getBillingRateRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.BillingRateRet at the given index
     */
    public org.chocolate_milk.model.BillingRateRet getBillingRateRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._billingRateRetList.size()) {
            throw new IndexOutOfBoundsException("getBillingRateRet: Index value '" + index + "' not in range [0.." + (this._billingRateRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.BillingRateRet) _billingRateRetList.get(index);
    }

    /**
     * Method getBillingRateRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.BillingRateRet[] getBillingRateRet(
    ) {
        org.chocolate_milk.model.BillingRateRet[] array = new org.chocolate_milk.model.BillingRateRet[0];
        return (org.chocolate_milk.model.BillingRateRet[]) this._billingRateRetList.toArray(array);
    }

    /**
     * Method getBillingRateRetCount.
     * 
     * @return the size of this collection
     */
    public int getBillingRateRetCount(
    ) {
        return this._billingRateRetList.size();
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
     * Method iterateBillingRateRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.BillingRateRet> iterateBillingRateRet(
    ) {
        return this._billingRateRetList.iterator();
    }

    /**
     */
    public void removeAllBillingRateRet(
    ) {
        this._billingRateRetList.clear();
    }

    /**
     * Method removeBillingRateRet.
     * 
     * @param vBillingRateRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeBillingRateRet(
            final org.chocolate_milk.model.BillingRateRet vBillingRateRet) {
        boolean removed = _billingRateRetList.remove(vBillingRateRet);
        return removed;
    }

    /**
     * Method removeBillingRateRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.BillingRateRet removeBillingRateRetAt(
            final int index) {
        java.lang.Object obj = this._billingRateRetList.remove(index);
        return (org.chocolate_milk.model.BillingRateRet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBillingRateRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBillingRateRet(
            final int index,
            final org.chocolate_milk.model.BillingRateRet vBillingRateRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._billingRateRetList.size()) {
            throw new IndexOutOfBoundsException("setBillingRateRet: Index value '" + index + "' not in range [0.." + (this._billingRateRetList.size() - 1) + "]");
        }

        this._billingRateRetList.set(index, vBillingRateRet);
    }

    /**
     * 
     * 
     * @param vBillingRateRetArray
     */
    public void setBillingRateRet(
            final org.chocolate_milk.model.BillingRateRet[] vBillingRateRetArray) {
        //-- copy array
        _billingRateRetList.clear();

        for (int i = 0; i < vBillingRateRetArray.length; i++) {
                this._billingRateRetList.add(vBillingRateRetArray[i]);
        }
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
