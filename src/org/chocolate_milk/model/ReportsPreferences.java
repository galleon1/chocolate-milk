/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportsPreferences.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportsPreferences.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ReportsPreferences implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _agingReportBasis.
     */
    private org.chocolate_milk.model.types.AgingReportBasisType _agingReportBasis;

    /**
     * Field _summaryReportBasis.
     */
    private org.chocolate_milk.model.types.SummaryReportBasisType _summaryReportBasis;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportsPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'agingReportBasis'.
     * 
     * @return the value of field 'AgingReportBasis'.
     */
    public org.chocolate_milk.model.types.AgingReportBasisType getAgingReportBasis(
    ) {
        return this._agingReportBasis;
    }

    /**
     * Returns the value of field 'summaryReportBasis'.
     * 
     * @return the value of field 'SummaryReportBasis'.
     */
    public org.chocolate_milk.model.types.SummaryReportBasisType getSummaryReportBasis(
    ) {
        return this._summaryReportBasis;
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
     * Sets the value of field 'agingReportBasis'.
     * 
     * @param agingReportBasis the value of field 'agingReportBasis'
     */
    public void setAgingReportBasis(
            final org.chocolate_milk.model.types.AgingReportBasisType agingReportBasis) {
        this._agingReportBasis = agingReportBasis;
    }

    /**
     * Sets the value of field 'summaryReportBasis'.
     * 
     * @param summaryReportBasis the value of field
     * 'summaryReportBasis'.
     */
    public void setSummaryReportBasis(
            final org.chocolate_milk.model.types.SummaryReportBasisType summaryReportBasis) {
        this._summaryReportBasis = summaryReportBasis;
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
     * org.chocolate_milk.model.ReportsPreferences
     */
    public static org.chocolate_milk.model.ReportsPreferences unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReportsPreferences) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReportsPreferences.class, reader);
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
