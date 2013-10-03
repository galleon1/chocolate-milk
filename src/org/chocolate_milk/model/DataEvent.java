/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataEvent.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataEvent.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DataEvent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _companyFilePath.
     */
    private java.lang.String _companyFilePath;

    /**
     * Field _hostInfo.
     */
    private org.chocolate_milk.model.HostInfo _hostInfo;

    /**
     * Field _dataEventChoice.
     */
    private org.chocolate_milk.model.DataEventChoice _dataEventChoice;

    /**
     * Field _lastRestoreTime.
     */
    private java.lang.String _lastRestoreTime;

    /**
     * Field _lastCondenseTime.
     */
    private java.lang.String _lastCondenseTime;

    /**
     * Field _dataEventRecoveryTime.
     */
    private java.lang.String _dataEventRecoveryTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataEvent() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'companyFilePath'.
     * 
     * @return the value of field 'CompanyFilePath'.
     */
    public java.lang.String getCompanyFilePath(
    ) {
        return this._companyFilePath;
    }

    /**
     * Returns the value of field 'dataEventChoice'.
     * 
     * @return the value of field 'DataEventChoice'.
     */
    public org.chocolate_milk.model.DataEventChoice getDataEventChoice(
    ) {
        return this._dataEventChoice;
    }

    /**
     * Returns the value of field 'dataEventRecoveryTime'.
     * 
     * @return the value of field 'DataEventRecoveryTime'.
     */
    public java.lang.String getDataEventRecoveryTime(
    ) {
        return this._dataEventRecoveryTime;
    }

    /**
     * Returns the value of field 'hostInfo'.
     * 
     * @return the value of field 'HostInfo'.
     */
    public org.chocolate_milk.model.HostInfo getHostInfo(
    ) {
        return this._hostInfo;
    }

    /**
     * Returns the value of field 'lastCondenseTime'.
     * 
     * @return the value of field 'LastCondenseTime'.
     */
    public java.lang.String getLastCondenseTime(
    ) {
        return this._lastCondenseTime;
    }

    /**
     * Returns the value of field 'lastRestoreTime'.
     * 
     * @return the value of field 'LastRestoreTime'.
     */
    public java.lang.String getLastRestoreTime(
    ) {
        return this._lastRestoreTime;
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
     * Sets the value of field 'companyFilePath'.
     * 
     * @param companyFilePath the value of field 'companyFilePath'.
     */
    public void setCompanyFilePath(
            final java.lang.String companyFilePath) {
        this._companyFilePath = companyFilePath;
    }

    /**
     * Sets the value of field 'dataEventChoice'.
     * 
     * @param dataEventChoice the value of field 'dataEventChoice'.
     */
    public void setDataEventChoice(
            final org.chocolate_milk.model.DataEventChoice dataEventChoice) {
        this._dataEventChoice = dataEventChoice;
    }

    /**
     * Sets the value of field 'dataEventRecoveryTime'.
     * 
     * @param dataEventRecoveryTime the value of field
     * 'dataEventRecoveryTime'.
     */
    public void setDataEventRecoveryTime(
            final java.lang.String dataEventRecoveryTime) {
        this._dataEventRecoveryTime = dataEventRecoveryTime;
    }

    /**
     * Sets the value of field 'hostInfo'.
     * 
     * @param hostInfo the value of field 'hostInfo'.
     */
    public void setHostInfo(
            final org.chocolate_milk.model.HostInfo hostInfo) {
        this._hostInfo = hostInfo;
    }

    /**
     * Sets the value of field 'lastCondenseTime'.
     * 
     * @param lastCondenseTime the value of field 'lastCondenseTime'
     */
    public void setLastCondenseTime(
            final java.lang.String lastCondenseTime) {
        this._lastCondenseTime = lastCondenseTime;
    }

    /**
     * Sets the value of field 'lastRestoreTime'.
     * 
     * @param lastRestoreTime the value of field 'lastRestoreTime'.
     */
    public void setLastRestoreTime(
            final java.lang.String lastRestoreTime) {
        this._lastRestoreTime = lastRestoreTime;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.DataEvent
     */
    public static org.chocolate_milk.model.DataEvent unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataEvent) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataEvent.class, reader);
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
