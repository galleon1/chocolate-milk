/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PreferencesRet.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PreferencesRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class PreferencesRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _accountingPreferences.
     */
    private org.chocolate_milk.model.AccountingPreferences _accountingPreferences;

    /**
     * Field _financeChargePreferences.
     */
    private org.chocolate_milk.model.FinanceChargePreferences _financeChargePreferences;

    /**
     * Field _jobsAndEstimatesPreferences.
     */
    private org.chocolate_milk.model.JobsAndEstimatesPreferences _jobsAndEstimatesPreferences;

    /**
     * Field _multiCurrencyPreferences.
     */
    private org.chocolate_milk.model.MultiCurrencyPreferences _multiCurrencyPreferences;

    /**
     * Field _purchasesAndVendorsPreferences.
     */
    private org.chocolate_milk.model.PurchasesAndVendorsPreferences _purchasesAndVendorsPreferences;

    /**
     * Field _reportsPreferences.
     */
    private org.chocolate_milk.model.ReportsPreferences _reportsPreferences;

    /**
     * Field _salesAndCustomersPreferences.
     */
    private org.chocolate_milk.model.SalesAndCustomersPreferences _salesAndCustomersPreferences;

    /**
     * Field _salesTaxPreferences.
     */
    private org.chocolate_milk.model.SalesTaxPreferences _salesTaxPreferences;

    /**
     * Field _timeTrackingPreferences.
     */
    private org.chocolate_milk.model.TimeTrackingPreferences _timeTrackingPreferences;

    /**
     * Field _currentAppAccessRights.
     */
    private org.chocolate_milk.model.CurrentAppAccessRights _currentAppAccessRights;


      //----------------/
     //- Constructors -/
    //----------------/

    public PreferencesRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'accountingPreferences'.
     * 
     * @return the value of field 'AccountingPreferences'.
     */
    public org.chocolate_milk.model.AccountingPreferences getAccountingPreferences(
    ) {
        return this._accountingPreferences;
    }

    /**
     * Returns the value of field 'currentAppAccessRights'.
     * 
     * @return the value of field 'CurrentAppAccessRights'.
     */
    public org.chocolate_milk.model.CurrentAppAccessRights getCurrentAppAccessRights(
    ) {
        return this._currentAppAccessRights;
    }

    /**
     * Returns the value of field 'financeChargePreferences'.
     * 
     * @return the value of field 'FinanceChargePreferences'.
     */
    public org.chocolate_milk.model.FinanceChargePreferences getFinanceChargePreferences(
    ) {
        return this._financeChargePreferences;
    }

    /**
     * Returns the value of field 'jobsAndEstimatesPreferences'.
     * 
     * @return the value of field 'JobsAndEstimatesPreferences'.
     */
    public org.chocolate_milk.model.JobsAndEstimatesPreferences getJobsAndEstimatesPreferences(
    ) {
        return this._jobsAndEstimatesPreferences;
    }

    /**
     * Returns the value of field 'multiCurrencyPreferences'.
     * 
     * @return the value of field 'MultiCurrencyPreferences'.
     */
    public org.chocolate_milk.model.MultiCurrencyPreferences getMultiCurrencyPreferences(
    ) {
        return this._multiCurrencyPreferences;
    }

    /**
     * Returns the value of field 'purchasesAndVendorsPreferences'.
     * 
     * @return the value of field 'PurchasesAndVendorsPreferences'.
     */
    public org.chocolate_milk.model.PurchasesAndVendorsPreferences getPurchasesAndVendorsPreferences(
    ) {
        return this._purchasesAndVendorsPreferences;
    }

    /**
     * Returns the value of field 'reportsPreferences'.
     * 
     * @return the value of field 'ReportsPreferences'.
     */
    public org.chocolate_milk.model.ReportsPreferences getReportsPreferences(
    ) {
        return this._reportsPreferences;
    }

    /**
     * Returns the value of field 'salesAndCustomersPreferences'.
     * 
     * @return the value of field 'SalesAndCustomersPreferences'.
     */
    public org.chocolate_milk.model.SalesAndCustomersPreferences getSalesAndCustomersPreferences(
    ) {
        return this._salesAndCustomersPreferences;
    }

    /**
     * Returns the value of field 'salesTaxPreferences'.
     * 
     * @return the value of field 'SalesTaxPreferences'.
     */
    public org.chocolate_milk.model.SalesTaxPreferences getSalesTaxPreferences(
    ) {
        return this._salesTaxPreferences;
    }

    /**
     * Returns the value of field 'timeTrackingPreferences'.
     * 
     * @return the value of field 'TimeTrackingPreferences'.
     */
    public org.chocolate_milk.model.TimeTrackingPreferences getTimeTrackingPreferences(
    ) {
        return this._timeTrackingPreferences;
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
     * Sets the value of field 'accountingPreferences'.
     * 
     * @param accountingPreferences the value of field
     * 'accountingPreferences'.
     */
    public void setAccountingPreferences(
            final org.chocolate_milk.model.AccountingPreferences accountingPreferences) {
        this._accountingPreferences = accountingPreferences;
    }

    /**
     * Sets the value of field 'currentAppAccessRights'.
     * 
     * @param currentAppAccessRights the value of field
     * 'currentAppAccessRights'.
     */
    public void setCurrentAppAccessRights(
            final org.chocolate_milk.model.CurrentAppAccessRights currentAppAccessRights) {
        this._currentAppAccessRights = currentAppAccessRights;
    }

    /**
     * Sets the value of field 'financeChargePreferences'.
     * 
     * @param financeChargePreferences the value of field
     * 'financeChargePreferences'.
     */
    public void setFinanceChargePreferences(
            final org.chocolate_milk.model.FinanceChargePreferences financeChargePreferences) {
        this._financeChargePreferences = financeChargePreferences;
    }

    /**
     * Sets the value of field 'jobsAndEstimatesPreferences'.
     * 
     * @param jobsAndEstimatesPreferences the value of field
     * 'jobsAndEstimatesPreferences'.
     */
    public void setJobsAndEstimatesPreferences(
            final org.chocolate_milk.model.JobsAndEstimatesPreferences jobsAndEstimatesPreferences) {
        this._jobsAndEstimatesPreferences = jobsAndEstimatesPreferences;
    }

    /**
     * Sets the value of field 'multiCurrencyPreferences'.
     * 
     * @param multiCurrencyPreferences the value of field
     * 'multiCurrencyPreferences'.
     */
    public void setMultiCurrencyPreferences(
            final org.chocolate_milk.model.MultiCurrencyPreferences multiCurrencyPreferences) {
        this._multiCurrencyPreferences = multiCurrencyPreferences;
    }

    /**
     * Sets the value of field 'purchasesAndVendorsPreferences'.
     * 
     * @param purchasesAndVendorsPreferences the value of field
     * 'purchasesAndVendorsPreferences'.
     */
    public void setPurchasesAndVendorsPreferences(
            final org.chocolate_milk.model.PurchasesAndVendorsPreferences purchasesAndVendorsPreferences) {
        this._purchasesAndVendorsPreferences = purchasesAndVendorsPreferences;
    }

    /**
     * Sets the value of field 'reportsPreferences'.
     * 
     * @param reportsPreferences the value of field
     * 'reportsPreferences'.
     */
    public void setReportsPreferences(
            final org.chocolate_milk.model.ReportsPreferences reportsPreferences) {
        this._reportsPreferences = reportsPreferences;
    }

    /**
     * Sets the value of field 'salesAndCustomersPreferences'.
     * 
     * @param salesAndCustomersPreferences the value of field
     * 'salesAndCustomersPreferences'.
     */
    public void setSalesAndCustomersPreferences(
            final org.chocolate_milk.model.SalesAndCustomersPreferences salesAndCustomersPreferences) {
        this._salesAndCustomersPreferences = salesAndCustomersPreferences;
    }

    /**
     * Sets the value of field 'salesTaxPreferences'.
     * 
     * @param salesTaxPreferences the value of field
     * 'salesTaxPreferences'.
     */
    public void setSalesTaxPreferences(
            final org.chocolate_milk.model.SalesTaxPreferences salesTaxPreferences) {
        this._salesTaxPreferences = salesTaxPreferences;
    }

    /**
     * Sets the value of field 'timeTrackingPreferences'.
     * 
     * @param timeTrackingPreferences the value of field
     * 'timeTrackingPreferences'.
     */
    public void setTimeTrackingPreferences(
            final org.chocolate_milk.model.TimeTrackingPreferences timeTrackingPreferences) {
        this._timeTrackingPreferences = timeTrackingPreferences;
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
     * org.chocolate_milk.model.PreferencesRet
     */
    public static org.chocolate_milk.model.PreferencesRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PreferencesRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PreferencesRet.class, reader);
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
