/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AccountTaxLineInfoQueryRsType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AccountTaxLineInfoQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class AccountTaxLineInfoQueryRsType implements java.io.Serializable {


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
     * Field _accountTaxLineInfoRetList.
     */
    private java.util.List<org.chocolate_milk.model.AccountTaxLineInfoRet> _accountTaxLineInfoRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AccountTaxLineInfoQueryRsType() {
        super();
        this._accountTaxLineInfoRetList = new java.util.ArrayList<org.chocolate_milk.model.AccountTaxLineInfoRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAccountTaxLineInfoRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccountTaxLineInfoRet(
            final org.chocolate_milk.model.AccountTaxLineInfoRet vAccountTaxLineInfoRet)
    throws java.lang.IndexOutOfBoundsException {
        this._accountTaxLineInfoRetList.add(vAccountTaxLineInfoRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vAccountTaxLineInfoRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAccountTaxLineInfoRet(
            final int index,
            final org.chocolate_milk.model.AccountTaxLineInfoRet vAccountTaxLineInfoRet)
    throws java.lang.IndexOutOfBoundsException {
        this._accountTaxLineInfoRetList.add(index, vAccountTaxLineInfoRet);
    }

    /**
     */
    public void deleteStatusCode(
    ) {
        this._has_statusCode= false;
    }

    /**
     * Method enumerateAccountTaxLineInfoRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.AccountTaxLineInfoRet> enumerateAccountTaxLineInfoRet(
    ) {
        return java.util.Collections.enumeration(this._accountTaxLineInfoRetList);
    }

    /**
     * Method getAccountTaxLineInfoRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.AccountTaxLineInfoRet at the given
     * index
     */
    public org.chocolate_milk.model.AccountTaxLineInfoRet getAccountTaxLineInfoRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accountTaxLineInfoRetList.size()) {
            throw new IndexOutOfBoundsException("getAccountTaxLineInfoRet: Index value '" + index + "' not in range [0.." + (this._accountTaxLineInfoRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.AccountTaxLineInfoRet) _accountTaxLineInfoRetList.get(index);
    }

    /**
     * Method getAccountTaxLineInfoRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.AccountTaxLineInfoRet[] getAccountTaxLineInfoRet(
    ) {
        org.chocolate_milk.model.AccountTaxLineInfoRet[] array = new org.chocolate_milk.model.AccountTaxLineInfoRet[0];
        return (org.chocolate_milk.model.AccountTaxLineInfoRet[]) this._accountTaxLineInfoRetList.toArray(array);
    }

    /**
     * Method getAccountTaxLineInfoRetCount.
     * 
     * @return the size of this collection
     */
    public int getAccountTaxLineInfoRetCount(
    ) {
        return this._accountTaxLineInfoRetList.size();
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
     * Method iterateAccountTaxLineInfoRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.AccountTaxLineInfoRet> iterateAccountTaxLineInfoRet(
    ) {
        return this._accountTaxLineInfoRetList.iterator();
    }

    /**
     * Method removeAccountTaxLineInfoRet.
     * 
     * @param vAccountTaxLineInfoRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeAccountTaxLineInfoRet(
            final org.chocolate_milk.model.AccountTaxLineInfoRet vAccountTaxLineInfoRet) {
        boolean removed = _accountTaxLineInfoRetList.remove(vAccountTaxLineInfoRet);
        return removed;
    }

    /**
     * Method removeAccountTaxLineInfoRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.AccountTaxLineInfoRet removeAccountTaxLineInfoRetAt(
            final int index) {
        java.lang.Object obj = this._accountTaxLineInfoRetList.remove(index);
        return (org.chocolate_milk.model.AccountTaxLineInfoRet) obj;
    }

    /**
     */
    public void removeAllAccountTaxLineInfoRet(
    ) {
        this._accountTaxLineInfoRetList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vAccountTaxLineInfoRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAccountTaxLineInfoRet(
            final int index,
            final org.chocolate_milk.model.AccountTaxLineInfoRet vAccountTaxLineInfoRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._accountTaxLineInfoRetList.size()) {
            throw new IndexOutOfBoundsException("setAccountTaxLineInfoRet: Index value '" + index + "' not in range [0.." + (this._accountTaxLineInfoRetList.size() - 1) + "]");
        }

        this._accountTaxLineInfoRetList.set(index, vAccountTaxLineInfoRet);
    }

    /**
     * 
     * 
     * @param vAccountTaxLineInfoRetArray
     */
    public void setAccountTaxLineInfoRet(
            final org.chocolate_milk.model.AccountTaxLineInfoRet[] vAccountTaxLineInfoRetArray) {
        //-- copy array
        _accountTaxLineInfoRetList.clear();

        for (int i = 0; i < vAccountTaxLineInfoRetArray.length; i++) {
                this._accountTaxLineInfoRetList.add(vAccountTaxLineInfoRetArray[i]);
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
