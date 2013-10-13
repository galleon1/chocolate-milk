/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Form1099CategoryAccountMappingModRqType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Form1099CategoryAccountMappingModRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class Form1099CategoryAccountMappingModRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _form1099CategoryAccountMappingMod.
     */
    private org.chocolate_milk.model.Form1099CategoryAccountMappingMod _form1099CategoryAccountMappingMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public Form1099CategoryAccountMappingModRqType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field
     * 'form1099CategoryAccountMappingMod'.
     * 
     * @return the value of field
     * 'Form1099CategoryAccountMappingMod'.
     */
    public org.chocolate_milk.model.Form1099CategoryAccountMappingMod getForm1099CategoryAccountMappingMod(
    ) {
        return this._form1099CategoryAccountMappingMod;
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
     * Sets the value of field 'form1099CategoryAccountMappingMod'.
     * 
     * @param form1099CategoryAccountMappingMod the value of field
     * 'form1099CategoryAccountMappingMod'.
     */
    public void setForm1099CategoryAccountMappingMod(
            final org.chocolate_milk.model.Form1099CategoryAccountMappingMod form1099CategoryAccountMappingMod) {
        this._form1099CategoryAccountMappingMod = form1099CategoryAccountMappingMod;
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
