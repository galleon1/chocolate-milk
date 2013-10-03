/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Form1099CategoryAccountMappingQueryRqType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Form1099CategoryAccountMappingQueryRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class Form1099CategoryAccountMappingQueryRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _form1099CategoryAccountMappingQuery.
     */
    private org.chocolate_milk.model.Form1099CategoryAccountMappingQuery _form1099CategoryAccountMappingQuery;


      //----------------/
     //- Constructors -/
    //----------------/

    public Form1099CategoryAccountMappingQueryRqType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field
     * 'form1099CategoryAccountMappingQuery'.
     * 
     * @return the value of field
     * 'Form1099CategoryAccountMappingQuery'.
     */
    public org.chocolate_milk.model.Form1099CategoryAccountMappingQuery getForm1099CategoryAccountMappingQuery(
    ) {
        return this._form1099CategoryAccountMappingQuery;
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
     * Sets the value of field
     * 'form1099CategoryAccountMappingQuery'.
     * 
     * @param form1099CategoryAccountMappingQuery the value of
     * field 'form1099CategoryAccountMappingQuery'.
     */
    public void setForm1099CategoryAccountMappingQuery(
            final org.chocolate_milk.model.Form1099CategoryAccountMappingQuery form1099CategoryAccountMappingQuery) {
        this._form1099CategoryAccountMappingQuery = form1099CategoryAccountMappingQuery;
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
