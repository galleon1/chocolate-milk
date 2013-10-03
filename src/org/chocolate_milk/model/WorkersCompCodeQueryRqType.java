/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: WorkersCompCodeQueryRqType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class WorkersCompCodeQueryRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class WorkersCompCodeQueryRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _metaData.
     */
    private org.chocolate_milk.model.types.WorkersCompCodeQueryRqTypeMetaDataType _metaData = org.chocolate_milk.model.types.WorkersCompCodeQueryRqTypeMetaDataType.fromValue("NoMetaData");

    /**
     * Field _workersCompCodeQuery.
     */
    private org.chocolate_milk.model.WorkersCompCodeQuery _workersCompCodeQuery;


      //----------------/
     //- Constructors -/
    //----------------/

    public WorkersCompCodeQueryRqType() {
        super();
        setMetaData(org.chocolate_milk.model.types.WorkersCompCodeQueryRqTypeMetaDataType.fromValue("NoMetaData"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'metaData'.
     * 
     * @return the value of field 'MetaData'.
     */
    public org.chocolate_milk.model.types.WorkersCompCodeQueryRqTypeMetaDataType getMetaData(
    ) {
        return this._metaData;
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
     * Returns the value of field 'workersCompCodeQuery'.
     * 
     * @return the value of field 'WorkersCompCodeQuery'.
     */
    public org.chocolate_milk.model.WorkersCompCodeQuery getWorkersCompCodeQuery(
    ) {
        return this._workersCompCodeQuery;
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
     * Sets the value of field 'metaData'.
     * 
     * @param metaData the value of field 'metaData'.
     */
    public void setMetaData(
            final org.chocolate_milk.model.types.WorkersCompCodeQueryRqTypeMetaDataType metaData) {
        this._metaData = metaData;
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
     * Sets the value of field 'workersCompCodeQuery'.
     * 
     * @param workersCompCodeQuery the value of field
     * 'workersCompCodeQuery'.
     */
    public void setWorkersCompCodeQuery(
            final org.chocolate_milk.model.WorkersCompCodeQuery workersCompCodeQuery) {
        this._workersCompCodeQuery = workersCompCodeQuery;
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
