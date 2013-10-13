/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SelectionCriteriaDetail.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SelectionCriteriaDetail.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class SelectionCriteriaDetail implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _includeAccounts.
     */
    private org.chocolate_milk.model.types.IncludeAccountsType _includeAccounts;

    /**
     * Field _reportOpenBalanceAsOf.
     */
    private org.chocolate_milk.model.types.ReportOpenBalanceAsOfType _reportOpenBalanceAsOf = org.chocolate_milk.model.types.ReportOpenBalanceAsOfType.fromValue("Today");


      //----------------/
     //- Constructors -/
    //----------------/

    public SelectionCriteriaDetail() {
        super();
        setReportOpenBalanceAsOf(org.chocolate_milk.model.types.ReportOpenBalanceAsOfType.fromValue("Today"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'includeAccounts'.
     * 
     * @return the value of field 'IncludeAccounts'.
     */
    public org.chocolate_milk.model.types.IncludeAccountsType getIncludeAccounts(
    ) {
        return this._includeAccounts;
    }

    /**
     * Returns the value of field 'reportOpenBalanceAsOf'.
     * 
     * @return the value of field 'ReportOpenBalanceAsOf'.
     */
    public org.chocolate_milk.model.types.ReportOpenBalanceAsOfType getReportOpenBalanceAsOf(
    ) {
        return this._reportOpenBalanceAsOf;
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
     * Sets the value of field 'includeAccounts'.
     * 
     * @param includeAccounts the value of field 'includeAccounts'.
     */
    public void setIncludeAccounts(
            final org.chocolate_milk.model.types.IncludeAccountsType includeAccounts) {
        this._includeAccounts = includeAccounts;
    }

    /**
     * Sets the value of field 'reportOpenBalanceAsOf'.
     * 
     * @param reportOpenBalanceAsOf the value of field
     * 'reportOpenBalanceAsOf'.
     */
    public void setReportOpenBalanceAsOf(
            final org.chocolate_milk.model.types.ReportOpenBalanceAsOfType reportOpenBalanceAsOf) {
        this._reportOpenBalanceAsOf = reportOpenBalanceAsOf;
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
     * org.chocolate_milk.model.SelectionCriteriaDetail
     */
    public static org.chocolate_milk.model.SelectionCriteriaDetail unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SelectionCriteriaDetail) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SelectionCriteriaDetail.class, reader);
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
