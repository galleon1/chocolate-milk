/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TaxLineInfoRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TaxLineInfoRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TaxLineInfoRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _taxLineID.
     */
    private long _taxLineID;

    /**
     * keeps track of state for field: _taxLineID
     */
    private boolean _has_taxLineID;

    /**
     * Field _taxLineName.
     */
    private java.lang.String _taxLineName;


      //----------------/
     //- Constructors -/
    //----------------/

    public TaxLineInfoRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteTaxLineID(
    ) {
        this._has_taxLineID= false;
    }

    /**
     * Returns the value of field 'taxLineID'.
     * 
     * @return the value of field 'TaxLineID'.
     */
    public long getTaxLineID(
    ) {
        return this._taxLineID;
    }

    /**
     * Returns the value of field 'taxLineName'.
     * 
     * @return the value of field 'TaxLineName'.
     */
    public java.lang.String getTaxLineName(
    ) {
        return this._taxLineName;
    }

    /**
     * Method hasTaxLineID.
     * 
     * @return true if at least one TaxLineID has been added
     */
    public boolean hasTaxLineID(
    ) {
        return this._has_taxLineID;
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
     * Sets the value of field 'taxLineID'.
     * 
     * @param taxLineID the value of field 'taxLineID'.
     */
    public void setTaxLineID(
            final long taxLineID) {
        this._taxLineID = taxLineID;
        this._has_taxLineID = true;
    }

    /**
     * Sets the value of field 'taxLineName'.
     * 
     * @param taxLineName the value of field 'taxLineName'.
     */
    public void setTaxLineName(
            final java.lang.String taxLineName) {
        this._taxLineName = taxLineName;
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
     * org.chocolate_milk.model.TaxLineInfoRet
     */
    public static org.chocolate_milk.model.TaxLineInfoRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TaxLineInfoRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TaxLineInfoRet.class, reader);
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
