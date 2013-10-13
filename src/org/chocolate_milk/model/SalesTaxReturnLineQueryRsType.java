/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxReturnLineQueryRsType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxReturnLineQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class SalesTaxReturnLineQueryRsType implements java.io.Serializable {


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
     * Field _salesTaxReturnLineRetList.
     */
    private java.util.List<org.chocolate_milk.model.SalesTaxReturnLineRet> _salesTaxReturnLineRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxReturnLineQueryRsType() {
        super();
        this._salesTaxReturnLineRetList = new java.util.ArrayList<org.chocolate_milk.model.SalesTaxReturnLineRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSalesTaxReturnLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesTaxReturnLineRet(
            final org.chocolate_milk.model.SalesTaxReturnLineRet vSalesTaxReturnLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._salesTaxReturnLineRetList.add(vSalesTaxReturnLineRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vSalesTaxReturnLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSalesTaxReturnLineRet(
            final int index,
            final org.chocolate_milk.model.SalesTaxReturnLineRet vSalesTaxReturnLineRet)
    throws java.lang.IndexOutOfBoundsException {
        this._salesTaxReturnLineRetList.add(index, vSalesTaxReturnLineRet);
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
     * Method enumerateSalesTaxReturnLineRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.SalesTaxReturnLineRet> enumerateSalesTaxReturnLineRet(
    ) {
        return java.util.Collections.enumeration(this._salesTaxReturnLineRetList);
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
     * Method getSalesTaxReturnLineRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.SalesTaxReturnLineRet at the given
     * index
     */
    public org.chocolate_milk.model.SalesTaxReturnLineRet getSalesTaxReturnLineRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesTaxReturnLineRetList.size()) {
            throw new IndexOutOfBoundsException("getSalesTaxReturnLineRet: Index value '" + index + "' not in range [0.." + (this._salesTaxReturnLineRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.SalesTaxReturnLineRet) _salesTaxReturnLineRetList.get(index);
    }

    /**
     * Method getSalesTaxReturnLineRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.SalesTaxReturnLineRet[] getSalesTaxReturnLineRet(
    ) {
        org.chocolate_milk.model.SalesTaxReturnLineRet[] array = new org.chocolate_milk.model.SalesTaxReturnLineRet[0];
        return (org.chocolate_milk.model.SalesTaxReturnLineRet[]) this._salesTaxReturnLineRetList.toArray(array);
    }

    /**
     * Method getSalesTaxReturnLineRetCount.
     * 
     * @return the size of this collection
     */
    public int getSalesTaxReturnLineRetCount(
    ) {
        return this._salesTaxReturnLineRetList.size();
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
     * Method iterateSalesTaxReturnLineRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.SalesTaxReturnLineRet> iterateSalesTaxReturnLineRet(
    ) {
        return this._salesTaxReturnLineRetList.iterator();
    }

    /**
     */
    public void removeAllSalesTaxReturnLineRet(
    ) {
        this._salesTaxReturnLineRetList.clear();
    }

    /**
     * Method removeSalesTaxReturnLineRet.
     * 
     * @param vSalesTaxReturnLineRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeSalesTaxReturnLineRet(
            final org.chocolate_milk.model.SalesTaxReturnLineRet vSalesTaxReturnLineRet) {
        boolean removed = _salesTaxReturnLineRetList.remove(vSalesTaxReturnLineRet);
        return removed;
    }

    /**
     * Method removeSalesTaxReturnLineRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.SalesTaxReturnLineRet removeSalesTaxReturnLineRetAt(
            final int index) {
        java.lang.Object obj = this._salesTaxReturnLineRetList.remove(index);
        return (org.chocolate_milk.model.SalesTaxReturnLineRet) obj;
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
     * @param vSalesTaxReturnLineRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSalesTaxReturnLineRet(
            final int index,
            final org.chocolate_milk.model.SalesTaxReturnLineRet vSalesTaxReturnLineRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._salesTaxReturnLineRetList.size()) {
            throw new IndexOutOfBoundsException("setSalesTaxReturnLineRet: Index value '" + index + "' not in range [0.." + (this._salesTaxReturnLineRetList.size() - 1) + "]");
        }

        this._salesTaxReturnLineRetList.set(index, vSalesTaxReturnLineRet);
    }

    /**
     * 
     * 
     * @param vSalesTaxReturnLineRetArray
     */
    public void setSalesTaxReturnLineRet(
            final org.chocolate_milk.model.SalesTaxReturnLineRet[] vSalesTaxReturnLineRetArray) {
        //-- copy array
        _salesTaxReturnLineRetList.clear();

        for (int i = 0; i < vSalesTaxReturnLineRetArray.length; i++) {
                this._salesTaxReturnLineRetList.add(vSalesTaxReturnLineRetArray[i]);
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
