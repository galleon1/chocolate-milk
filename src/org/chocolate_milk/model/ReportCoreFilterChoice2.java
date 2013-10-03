/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportCoreFilterChoice2.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportCoreFilterChoice2.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ReportCoreFilterChoice2 implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportModifiedDateRangeFilter.
     */
    private org.chocolate_milk.model.ReportModifiedDateRangeFilter _reportModifiedDateRangeFilter;

    /**
     * Field _reportModifiedDateRangeMacro.
     */
    private org.chocolate_milk.model.types.ReportModifiedDateRangeMacroType _reportModifiedDateRangeMacro;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportCoreFilterChoice2() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'reportModifiedDateRangeFilter'.
     * 
     * @return the value of field 'ReportModifiedDateRangeFilter'.
     */
    public org.chocolate_milk.model.ReportModifiedDateRangeFilter getReportModifiedDateRangeFilter(
    ) {
        return this._reportModifiedDateRangeFilter;
    }

    /**
     * Returns the value of field 'reportModifiedDateRangeMacro'.
     * 
     * @return the value of field 'ReportModifiedDateRangeMacro'.
     */
    public org.chocolate_milk.model.types.ReportModifiedDateRangeMacroType getReportModifiedDateRangeMacro(
    ) {
        return this._reportModifiedDateRangeMacro;
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
     * Sets the value of field 'reportModifiedDateRangeFilter'.
     * 
     * @param reportModifiedDateRangeFilter the value of field
     * 'reportModifiedDateRangeFilter'.
     */
    public void setReportModifiedDateRangeFilter(
            final org.chocolate_milk.model.ReportModifiedDateRangeFilter reportModifiedDateRangeFilter) {
        this._reportModifiedDateRangeFilter = reportModifiedDateRangeFilter;
    }

    /**
     * Sets the value of field 'reportModifiedDateRangeMacro'.
     * 
     * @param reportModifiedDateRangeMacro the value of field
     * 'reportModifiedDateRangeMacro'.
     */
    public void setReportModifiedDateRangeMacro(
            final org.chocolate_milk.model.types.ReportModifiedDateRangeMacroType reportModifiedDateRangeMacro) {
        this._reportModifiedDateRangeMacro = reportModifiedDateRangeMacro;
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
     * org.chocolate_milk.model.ReportCoreFilterChoice2
     */
    public static org.chocolate_milk.model.ReportCoreFilterChoice2 unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReportCoreFilterChoice2) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReportCoreFilterChoice2.class, reader);
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
