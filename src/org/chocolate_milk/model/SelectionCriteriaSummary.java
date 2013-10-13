/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SelectionCriteriaSummary.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SelectionCriteriaSummary.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SelectionCriteriaSummary implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportCalendar.
     */
    private org.chocolate_milk.model.types.ReportCalendarType _reportCalendar;

    /**
     * Field _returnRows.
     */
    private org.chocolate_milk.model.types.ReturnRowsType _returnRows;

    /**
     * Field _returnColumns.
     */
    private org.chocolate_milk.model.types.ReturnColumnsType _returnColumns;


      //----------------/
     //- Constructors -/
    //----------------/

    public SelectionCriteriaSummary() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'reportCalendar'.
     * 
     * @return the value of field 'ReportCalendar'.
     */
    public org.chocolate_milk.model.types.ReportCalendarType getReportCalendar(
    ) {
        return this._reportCalendar;
    }

    /**
     * Returns the value of field 'returnColumns'.
     * 
     * @return the value of field 'ReturnColumns'.
     */
    public org.chocolate_milk.model.types.ReturnColumnsType getReturnColumns(
    ) {
        return this._returnColumns;
    }

    /**
     * Returns the value of field 'returnRows'.
     * 
     * @return the value of field 'ReturnRows'.
     */
    public org.chocolate_milk.model.types.ReturnRowsType getReturnRows(
    ) {
        return this._returnRows;
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
     * Sets the value of field 'reportCalendar'.
     * 
     * @param reportCalendar the value of field 'reportCalendar'.
     */
    public void setReportCalendar(
            final org.chocolate_milk.model.types.ReportCalendarType reportCalendar) {
        this._reportCalendar = reportCalendar;
    }

    /**
     * Sets the value of field 'returnColumns'.
     * 
     * @param returnColumns the value of field 'returnColumns'.
     */
    public void setReturnColumns(
            final org.chocolate_milk.model.types.ReturnColumnsType returnColumns) {
        this._returnColumns = returnColumns;
    }

    /**
     * Sets the value of field 'returnRows'.
     * 
     * @param returnRows the value of field 'returnRows'.
     */
    public void setReturnRows(
            final org.chocolate_milk.model.types.ReturnRowsType returnRows) {
        this._returnRows = returnRows;
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
     * org.chocolate_milk.model.SelectionCriteriaSummary
     */
    public static org.chocolate_milk.model.SelectionCriteriaSummary unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SelectionCriteriaSummary) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SelectionCriteriaSummary.class, reader);
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
