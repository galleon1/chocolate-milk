/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: HostRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class HostRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class HostRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _productName.
     */
    private java.lang.String _productName;

    /**
     * Field _majorVersion.
     */
    private java.lang.String _majorVersion;

    /**
     * Field _minorVersion.
     */
    private java.lang.String _minorVersion;

    /**
     * Field _country.
     */
    private java.lang.String _country;

    /**
     * Field _supportedQBXMLVersionList.
     */
    private java.util.List<java.lang.String> _supportedQBXMLVersionList;

    /**
     * Field _isAutomaticLogin.
     */
    private java.lang.String _isAutomaticLogin;

    /**
     * Field _QBFileMode.
     */
    private org.chocolate_milk.model.types.QBFileModeType _QBFileMode;

    /**
     * Field _listMetaData.
     */
    private org.chocolate_milk.model.ListMetaData _listMetaData;


      //----------------/
     //- Constructors -/
    //----------------/

    public HostRet() {
        super();
        this._supportedQBXMLVersionList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedQBXMLVersion
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedQBXMLVersion(
            final java.lang.String vSupportedQBXMLVersion)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedQBXMLVersionList.add(vSupportedQBXMLVersion);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedQBXMLVersion
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedQBXMLVersion(
            final int index,
            final java.lang.String vSupportedQBXMLVersion)
    throws java.lang.IndexOutOfBoundsException {
        this._supportedQBXMLVersionList.add(index, vSupportedQBXMLVersion);
    }

    /**
     * Method enumerateSupportedQBXMLVersion.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateSupportedQBXMLVersion(
    ) {
        return java.util.Collections.enumeration(this._supportedQBXMLVersionList);
    }

    /**
     * Returns the value of field 'country'.
     * 
     * @return the value of field 'Country'.
     */
    public java.lang.String getCountry(
    ) {
        return this._country;
    }

    /**
     * Returns the value of field 'isAutomaticLogin'.
     * 
     * @return the value of field 'IsAutomaticLogin'.
     */
    public java.lang.String getIsAutomaticLogin(
    ) {
        return this._isAutomaticLogin;
    }

    /**
     * Returns the value of field 'listMetaData'.
     * 
     * @return the value of field 'ListMetaData'.
     */
    public org.chocolate_milk.model.ListMetaData getListMetaData(
    ) {
        return this._listMetaData;
    }

    /**
     * Returns the value of field 'majorVersion'.
     * 
     * @return the value of field 'MajorVersion'.
     */
    public java.lang.String getMajorVersion(
    ) {
        return this._majorVersion;
    }

    /**
     * Returns the value of field 'minorVersion'.
     * 
     * @return the value of field 'MinorVersion'.
     */
    public java.lang.String getMinorVersion(
    ) {
        return this._minorVersion;
    }

    /**
     * Returns the value of field 'productName'.
     * 
     * @return the value of field 'ProductName'.
     */
    public java.lang.String getProductName(
    ) {
        return this._productName;
    }

    /**
     * Returns the value of field 'QBFileMode'.
     * 
     * @return the value of field 'QBFileMode'.
     */
    public org.chocolate_milk.model.types.QBFileModeType getQBFileMode(
    ) {
        return this._QBFileMode;
    }

    /**
     * Method getSupportedQBXMLVersion.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getSupportedQBXMLVersion(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedQBXMLVersionList.size()) {
            throw new IndexOutOfBoundsException("getSupportedQBXMLVersion: Index value '" + index + "' not in range [0.." + (this._supportedQBXMLVersionList.size() - 1) + "]");
        }

        return (java.lang.String) _supportedQBXMLVersionList.get(index);
    }

    /**
     * Method getSupportedQBXMLVersion.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getSupportedQBXMLVersion(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._supportedQBXMLVersionList.toArray(array);
    }

    /**
     * Method getSupportedQBXMLVersionCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedQBXMLVersionCount(
    ) {
        return this._supportedQBXMLVersionList.size();
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
     * Method iterateSupportedQBXMLVersion.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateSupportedQBXMLVersion(
    ) {
        return this._supportedQBXMLVersionList.iterator();
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
    public void removeAllSupportedQBXMLVersion(
    ) {
        this._supportedQBXMLVersionList.clear();
    }

    /**
     * Method removeSupportedQBXMLVersion.
     * 
     * @param vSupportedQBXMLVersion
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedQBXMLVersion(
            final java.lang.String vSupportedQBXMLVersion) {
        boolean removed = _supportedQBXMLVersionList.remove(vSupportedQBXMLVersion);
        return removed;
    }

    /**
     * Method removeSupportedQBXMLVersionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeSupportedQBXMLVersionAt(
            final int index) {
        java.lang.Object obj = this._supportedQBXMLVersionList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'country'.
     * 
     * @param country the value of field 'country'.
     */
    public void setCountry(
            final java.lang.String country) {
        this._country = country;
    }

    /**
     * Sets the value of field 'isAutomaticLogin'.
     * 
     * @param isAutomaticLogin the value of field 'isAutomaticLogin'
     */
    public void setIsAutomaticLogin(
            final java.lang.String isAutomaticLogin) {
        this._isAutomaticLogin = isAutomaticLogin;
    }

    /**
     * Sets the value of field 'listMetaData'.
     * 
     * @param listMetaData the value of field 'listMetaData'.
     */
    public void setListMetaData(
            final org.chocolate_milk.model.ListMetaData listMetaData) {
        this._listMetaData = listMetaData;
    }

    /**
     * Sets the value of field 'majorVersion'.
     * 
     * @param majorVersion the value of field 'majorVersion'.
     */
    public void setMajorVersion(
            final java.lang.String majorVersion) {
        this._majorVersion = majorVersion;
    }

    /**
     * Sets the value of field 'minorVersion'.
     * 
     * @param minorVersion the value of field 'minorVersion'.
     */
    public void setMinorVersion(
            final java.lang.String minorVersion) {
        this._minorVersion = minorVersion;
    }

    /**
     * Sets the value of field 'productName'.
     * 
     * @param productName the value of field 'productName'.
     */
    public void setProductName(
            final java.lang.String productName) {
        this._productName = productName;
    }

    /**
     * Sets the value of field 'QBFileMode'.
     * 
     * @param QBFileMode the value of field 'QBFileMode'.
     */
    public void setQBFileMode(
            final org.chocolate_milk.model.types.QBFileModeType QBFileMode) {
        this._QBFileMode = QBFileMode;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedQBXMLVersion
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedQBXMLVersion(
            final int index,
            final java.lang.String vSupportedQBXMLVersion)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedQBXMLVersionList.size()) {
            throw new IndexOutOfBoundsException("setSupportedQBXMLVersion: Index value '" + index + "' not in range [0.." + (this._supportedQBXMLVersionList.size() - 1) + "]");
        }

        this._supportedQBXMLVersionList.set(index, vSupportedQBXMLVersion);
    }

    /**
     * 
     * 
     * @param vSupportedQBXMLVersionArray
     */
    public void setSupportedQBXMLVersion(
            final java.lang.String[] vSupportedQBXMLVersionArray) {
        //-- copy array
        _supportedQBXMLVersionList.clear();

        for (int i = 0; i < vSupportedQBXMLVersionArray.length; i++) {
                this._supportedQBXMLVersionList.add(vSupportedQBXMLVersionArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.HostRet
     */
    public static org.chocolate_milk.model.HostRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.HostRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.HostRet.class, reader);
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
