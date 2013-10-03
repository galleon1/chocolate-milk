/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TemplateQueryRsType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TemplateQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class TemplateQueryRsType implements java.io.Serializable {


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
     * Field _templateRetList.
     */
    private java.util.List<org.chocolate_milk.model.TemplateRet> _templateRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TemplateQueryRsType() {
        super();
        this._templateRetList = new java.util.ArrayList<org.chocolate_milk.model.TemplateRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTemplateRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTemplateRet(
            final org.chocolate_milk.model.TemplateRet vTemplateRet)
    throws java.lang.IndexOutOfBoundsException {
        this._templateRetList.add(vTemplateRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vTemplateRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTemplateRet(
            final int index,
            final org.chocolate_milk.model.TemplateRet vTemplateRet)
    throws java.lang.IndexOutOfBoundsException {
        this._templateRetList.add(index, vTemplateRet);
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
     * Method enumerateTemplateRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.TemplateRet> enumerateTemplateRet(
    ) {
        return java.util.Collections.enumeration(this._templateRetList);
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
     * Method getTemplateRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.TemplateRet at the given index
     */
    public org.chocolate_milk.model.TemplateRet getTemplateRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._templateRetList.size()) {
            throw new IndexOutOfBoundsException("getTemplateRet: Index value '" + index + "' not in range [0.." + (this._templateRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.TemplateRet) _templateRetList.get(index);
    }

    /**
     * Method getTemplateRet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.TemplateRet[] getTemplateRet(
    ) {
        org.chocolate_milk.model.TemplateRet[] array = new org.chocolate_milk.model.TemplateRet[0];
        return (org.chocolate_milk.model.TemplateRet[]) this._templateRetList.toArray(array);
    }

    /**
     * Method getTemplateRetCount.
     * 
     * @return the size of this collection
     */
    public int getTemplateRetCount(
    ) {
        return this._templateRetList.size();
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
     * Method iterateTemplateRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.TemplateRet> iterateTemplateRet(
    ) {
        return this._templateRetList.iterator();
    }

    /**
     */
    public void removeAllTemplateRet(
    ) {
        this._templateRetList.clear();
    }

    /**
     * Method removeTemplateRet.
     * 
     * @param vTemplateRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeTemplateRet(
            final org.chocolate_milk.model.TemplateRet vTemplateRet) {
        boolean removed = _templateRetList.remove(vTemplateRet);
        return removed;
    }

    /**
     * Method removeTemplateRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.TemplateRet removeTemplateRetAt(
            final int index) {
        java.lang.Object obj = this._templateRetList.remove(index);
        return (org.chocolate_milk.model.TemplateRet) obj;
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
     * @param index
     * @param vTemplateRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTemplateRet(
            final int index,
            final org.chocolate_milk.model.TemplateRet vTemplateRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._templateRetList.size()) {
            throw new IndexOutOfBoundsException("setTemplateRet: Index value '" + index + "' not in range [0.." + (this._templateRetList.size() - 1) + "]");
        }

        this._templateRetList.set(index, vTemplateRet);
    }

    /**
     * 
     * 
     * @param vTemplateRetArray
     */
    public void setTemplateRet(
            final org.chocolate_milk.model.TemplateRet[] vTemplateRetArray) {
        //-- copy array
        _templateRetList.clear();

        for (int i = 0; i < vTemplateRetArray.length; i++) {
                this._templateRetList.add(vTemplateRetArray[i]);
        }
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
