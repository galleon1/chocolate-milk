/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportModifiedDateRangeFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportModifiedDateRangeFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ReportModifiedDateRangeFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fromReportModifiedDate.
     */
    private java.lang.String _fromReportModifiedDate;

    /**
     * Field _toReportModifiedDate.
     */
    private java.lang.String _toReportModifiedDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportModifiedDateRangeFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'fromReportModifiedDate'.
     * 
     * @return the value of field 'FromReportModifiedDate'.
     */
    public java.lang.String getFromReportModifiedDate(
    ) {
        return this._fromReportModifiedDate;
    }

    /**
     * Returns the value of field 'toReportModifiedDate'.
     * 
     * @return the value of field 'ToReportModifiedDate'.
     */
    public java.lang.String getToReportModifiedDate(
    ) {
        return this._toReportModifiedDate;
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
     * Sets the value of field 'fromReportModifiedDate'.
     * 
     * @param fromReportModifiedDate the value of field
     * 'fromReportModifiedDate'.
     */
    public void setFromReportModifiedDate(
            final java.lang.String fromReportModifiedDate) {
        this._fromReportModifiedDate = fromReportModifiedDate;
    }

    /**
     * Sets the value of field 'toReportModifiedDate'.
     * 
     * @param toReportModifiedDate the value of field
     * 'toReportModifiedDate'.
     */
    public void setToReportModifiedDate(
            final java.lang.String toReportModifiedDate) {
        this._toReportModifiedDate = toReportModifiedDate;
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
     * org.chocolate_milk.model.ReportModifiedDateRangeFilter
     */
    public static org.chocolate_milk.model.ReportModifiedDateRangeFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReportModifiedDateRangeFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReportModifiedDateRangeFilter.class, reader);
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
