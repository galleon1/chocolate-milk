/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JobsAndEstimatesPreferences.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class JobsAndEstimatesPreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class JobsAndEstimatesPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _isUsingEstimates.
     */
    private java.lang.String _isUsingEstimates;

    /**
     * Field _isUsingProgressInvoicing.
     */
    private java.lang.String _isUsingProgressInvoicing;

    /**
     * Field _isPrintingItemsWithZeroAmounts.
     */
    private java.lang.String _isPrintingItemsWithZeroAmounts;


      //----------------/
     //- Constructors -/
    //----------------/

    public JobsAndEstimatesPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'isPrintingItemsWithZeroAmounts'.
     * 
     * @return the value of field 'IsPrintingItemsWithZeroAmounts'.
     */
    public java.lang.String getIsPrintingItemsWithZeroAmounts(
    ) {
        return this._isPrintingItemsWithZeroAmounts;
    }

    /**
     * Returns the value of field 'isUsingEstimates'.
     * 
     * @return the value of field 'IsUsingEstimates'.
     */
    public java.lang.String getIsUsingEstimates(
    ) {
        return this._isUsingEstimates;
    }

    /**
     * Returns the value of field 'isUsingProgressInvoicing'.
     * 
     * @return the value of field 'IsUsingProgressInvoicing'.
     */
    public java.lang.String getIsUsingProgressInvoicing(
    ) {
        return this._isUsingProgressInvoicing;
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
     * Sets the value of field 'isPrintingItemsWithZeroAmounts'.
     * 
     * @param isPrintingItemsWithZeroAmounts the value of field
     * 'isPrintingItemsWithZeroAmounts'.
     */
    public void setIsPrintingItemsWithZeroAmounts(
            final java.lang.String isPrintingItemsWithZeroAmounts) {
        this._isPrintingItemsWithZeroAmounts = isPrintingItemsWithZeroAmounts;
    }

    /**
     * Sets the value of field 'isUsingEstimates'.
     * 
     * @param isUsingEstimates the value of field 'isUsingEstimates'
     */
    public void setIsUsingEstimates(
            final java.lang.String isUsingEstimates) {
        this._isUsingEstimates = isUsingEstimates;
    }

    /**
     * Sets the value of field 'isUsingProgressInvoicing'.
     * 
     * @param isUsingProgressInvoicing the value of field
     * 'isUsingProgressInvoicing'.
     */
    public void setIsUsingProgressInvoicing(
            final java.lang.String isUsingProgressInvoicing) {
        this._isUsingProgressInvoicing = isUsingProgressInvoicing;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.JobsAndEstimatesPreferences
     */
    public static org.chocolate_milk.model.JobsAndEstimatesPreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.JobsAndEstimatesPreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.JobsAndEstimatesPreferences.class, reader);
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
