/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ModifiedDateRangeFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ModifiedDateRangeFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ModifiedDateRangeFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fromModifiedDate.
     */
    private java.lang.String _fromModifiedDate;

    /**
     * Field _toModifiedDate.
     */
    private java.lang.String _toModifiedDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public ModifiedDateRangeFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'fromModifiedDate'.
     * 
     * @return the value of field 'FromModifiedDate'.
     */
    public java.lang.String getFromModifiedDate(
    ) {
        return this._fromModifiedDate;
    }

    /**
     * Returns the value of field 'toModifiedDate'.
     * 
     * @return the value of field 'ToModifiedDate'.
     */
    public java.lang.String getToModifiedDate(
    ) {
        return this._toModifiedDate;
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
     * Sets the value of field 'fromModifiedDate'.
     * 
     * @param fromModifiedDate the value of field 'fromModifiedDate'
     */
    public void setFromModifiedDate(
            final java.lang.String fromModifiedDate) {
        this._fromModifiedDate = fromModifiedDate;
    }

    /**
     * Sets the value of field 'toModifiedDate'.
     * 
     * @param toModifiedDate the value of field 'toModifiedDate'.
     */
    public void setToModifiedDate(
            final java.lang.String toModifiedDate) {
        this._toModifiedDate = toModifiedDate;
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
     * org.chocolate_milk.model.ModifiedDateRangeFilter
     */
    public static org.chocolate_milk.model.ModifiedDateRangeFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ModifiedDateRangeFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ModifiedDateRangeFilter.class, reader);
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
