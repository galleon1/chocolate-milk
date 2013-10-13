/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PriceLevelFilterChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PriceLevelFilterChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PriceLevelFilterChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nameFilter.
     */
    private org.chocolate_milk.model.NameFilter _nameFilter;

    /**
     * Field _nameRangeFilter.
     */
    private org.chocolate_milk.model.NameRangeFilter _nameRangeFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public PriceLevelFilterChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'nameFilter'.
     * 
     * @return the value of field 'NameFilter'.
     */
    public org.chocolate_milk.model.NameFilter getNameFilter(
    ) {
        return this._nameFilter;
    }

    /**
     * Returns the value of field 'nameRangeFilter'.
     * 
     * @return the value of field 'NameRangeFilter'.
     */
    public org.chocolate_milk.model.NameRangeFilter getNameRangeFilter(
    ) {
        return this._nameRangeFilter;
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
     * Sets the value of field 'nameFilter'.
     * 
     * @param nameFilter the value of field 'nameFilter'.
     */
    public void setNameFilter(
            final org.chocolate_milk.model.NameFilter nameFilter) {
        this._nameFilter = nameFilter;
    }

    /**
     * Sets the value of field 'nameRangeFilter'.
     * 
     * @param nameRangeFilter the value of field 'nameRangeFilter'.
     */
    public void setNameRangeFilter(
            final org.chocolate_milk.model.NameRangeFilter nameRangeFilter) {
        this._nameRangeFilter = nameRangeFilter;
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
     * org.chocolate_milk.model.PriceLevelFilterChoice
     */
    public static org.chocolate_milk.model.PriceLevelFilterChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PriceLevelFilterChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PriceLevelFilterChoice.class, reader);
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
