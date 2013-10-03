/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: VendorListFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class VendorListFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class VendorListFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listFilter.
     */
    private org.chocolate_milk.model.ListFilter _listFilter;

    /**
     * Field _totalBalanceFilter.
     */
    private org.chocolate_milk.model.TotalBalanceFilter _totalBalanceFilter;

    /**
     * Field _currencyFilter.
     */
    private org.chocolate_milk.model.CurrencyFilter _currencyFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public VendorListFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'currencyFilter'.
     * 
     * @return the value of field 'CurrencyFilter'.
     */
    public org.chocolate_milk.model.CurrencyFilter getCurrencyFilter(
    ) {
        return this._currencyFilter;
    }

    /**
     * Returns the value of field 'listFilter'.
     * 
     * @return the value of field 'ListFilter'.
     */
    public org.chocolate_milk.model.ListFilter getListFilter(
    ) {
        return this._listFilter;
    }

    /**
     * Returns the value of field 'totalBalanceFilter'.
     * 
     * @return the value of field 'TotalBalanceFilter'.
     */
    public org.chocolate_milk.model.TotalBalanceFilter getTotalBalanceFilter(
    ) {
        return this._totalBalanceFilter;
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
     * Sets the value of field 'currencyFilter'.
     * 
     * @param currencyFilter the value of field 'currencyFilter'.
     */
    public void setCurrencyFilter(
            final org.chocolate_milk.model.CurrencyFilter currencyFilter) {
        this._currencyFilter = currencyFilter;
    }

    /**
     * Sets the value of field 'listFilter'.
     * 
     * @param listFilter the value of field 'listFilter'.
     */
    public void setListFilter(
            final org.chocolate_milk.model.ListFilter listFilter) {
        this._listFilter = listFilter;
    }

    /**
     * Sets the value of field 'totalBalanceFilter'.
     * 
     * @param totalBalanceFilter the value of field
     * 'totalBalanceFilter'.
     */
    public void setTotalBalanceFilter(
            final org.chocolate_milk.model.TotalBalanceFilter totalBalanceFilter) {
        this._totalBalanceFilter = totalBalanceFilter;
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
     * org.chocolate_milk.model.VendorListFilter
     */
    public static org.chocolate_milk.model.VendorListFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.VendorListFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.VendorListFilter.class, reader);
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
