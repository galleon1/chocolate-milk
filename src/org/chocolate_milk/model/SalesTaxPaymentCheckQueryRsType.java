/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxPaymentCheckQueryRsType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxPaymentCheckQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class SalesTaxPaymentCheckQueryRsType implements java.io.Serializable {


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
     * Field _salesTaxPaymentCheckRetList.
     */
    private java.util.List<org.chocolate_milk.model.SalesTaxPaymentCheckRet> _salesTaxPaymentCheckRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxPaymentCheckQueryRsType() {
        super();
        this._salesTaxPaymentCheckRetList = new java.util.ArrayList<org.chocolate_milk.model.SalesTaxPaymentCheckRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSalesTaxPaymentCheckRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesTaxPaymentCheckRet(
            final org.chocolate_milk.model.SalesTaxPaymentCheckRet vSalesTaxPaymentCheckRet)
    throws java.lang.IndexOutOfBoundsException {
        this._salesTaxPaymentCheckRetList.add(vSalesTaxPaymentCheckRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesTaxPaymentCheckRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesTaxPaymentCheckRet(
            final int index,
            final org.chocolate_milk.model.SalesTaxPaymentCheckRet vSalesTaxPaymentCheckRet)
    throws java.lang.IndexOutOfBoundsException {
        this._salesTaxPaymentCheckRetList.add(index, vSalesTaxPaymentCheckRet);
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
     * Method enumerateSalesTaxPaymentCheckRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SalesTaxPaymentCheckRet> enumerateSalesTaxPaymentCheckRet(
    ) {
        return java.util.Collections.enumeration(this._salesTaxPaymentCheckRetList);
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
     * Method getSalesTaxPaymentCheckRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.SalesTaxPaymentCheckRet at the
     * given index
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckRet getSalesTaxPaymentCheckRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesTaxPaymentCheckRetList.size()) {
            throw new IndexOutOfBoundsException("getSalesTaxPaymentCheckRet: Index value '" + index + "' not in range [0.." + (this._salesTaxPaymentCheckRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SalesTaxPaymentCheckRet) _salesTaxPaymentCheckRetList.get(index);
    }

    /**
     * Method getSalesTaxPaymentCheckRet.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckRet[] getSalesTaxPaymentCheckRet(
    ) {
        org.chocolate_milk.model.SalesTaxPaymentCheckRet[] array = new org.chocolate_milk.model.SalesTaxPaymentCheckRet[0];
        return (org.chocolate_milk.model.SalesTaxPaymentCheckRet[]) this._salesTaxPaymentCheckRetList.toArray(array);
    }

    /**
     * Method getSalesTaxPaymentCheckRetCount.
     * 
     * @return the size of this collection
     */
    public int getSalesTaxPaymentCheckRetCount(
    ) {
        return this._salesTaxPaymentCheckRetList.size();
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
     * Method iterateSalesTaxPaymentCheckRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SalesTaxPaymentCheckRet> iterateSalesTaxPaymentCheckRet(
    ) {
        return this._salesTaxPaymentCheckRetList.iterator();
    }

    /**
     */
    public void removeAllSalesTaxPaymentCheckRet(
    ) {
        this._salesTaxPaymentCheckRetList.clear();
    }

    /**
     * Method removeSalesTaxPaymentCheckRet.
     * 
     * @param vSalesTaxPaymentCheckRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeSalesTaxPaymentCheckRet(
            final org.chocolate_milk.model.SalesTaxPaymentCheckRet vSalesTaxPaymentCheckRet) {
        boolean removed = _salesTaxPaymentCheckRetList.remove(vSalesTaxPaymentCheckRet);
        return removed;
    }

    /**
     * Method removeSalesTaxPaymentCheckRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckRet removeSalesTaxPaymentCheckRetAt(
            final int index) {
        java.lang.Object obj = this._salesTaxPaymentCheckRetList.remove(index);
        return (org.chocolate_milk.model.SalesTaxPaymentCheckRet) obj;
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
     * 
     * 
     * @param index
     * @param vSalesTaxPaymentCheckRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSalesTaxPaymentCheckRet(
            final int index,
            final org.chocolate_milk.model.SalesTaxPaymentCheckRet vSalesTaxPaymentCheckRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesTaxPaymentCheckRetList.size()) {
            throw new IndexOutOfBoundsException("setSalesTaxPaymentCheckRet: Index value '" + index + "' not in range [0.." + (this._salesTaxPaymentCheckRetList.size() - 1) + "]");
        }

        this._salesTaxPaymentCheckRetList.set(index, vSalesTaxPaymentCheckRet);
    }

    /**
     * 
     * 
     * @param vSalesTaxPaymentCheckRetArray
     */
    public void setSalesTaxPaymentCheckRet(
            final org.chocolate_milk.model.SalesTaxPaymentCheckRet[] vSalesTaxPaymentCheckRetArray) {
        //-- copy array
        _salesTaxPaymentCheckRetList.clear();

        for (int i = 0; i < vSalesTaxPaymentCheckRetArray.length; i++) {
                this._salesTaxPaymentCheckRetList.add(vSalesTaxPaymentCheckRetArray[i]);
        }
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
