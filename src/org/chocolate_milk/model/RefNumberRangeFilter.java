/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: RefNumberRangeFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class RefNumberRangeFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class RefNumberRangeFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fromRefNumber.
     */
    private java.lang.String _fromRefNumber;

    /**
     * Field _toRefNumber.
     */
    private java.lang.String _toRefNumber;


      //----------------/
     //- Constructors -/
    //----------------/

    public RefNumberRangeFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'fromRefNumber'.
     * 
     * @return the value of field 'FromRefNumber'.
     */
    public java.lang.String getFromRefNumber(
    ) {
        return this._fromRefNumber;
    }

    /**
     * Returns the value of field 'toRefNumber'.
     * 
     * @return the value of field 'ToRefNumber'.
     */
    public java.lang.String getToRefNumber(
    ) {
        return this._toRefNumber;
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
     * Sets the value of field 'fromRefNumber'.
     * 
     * @param fromRefNumber the value of field 'fromRefNumber'.
     */
    public void setFromRefNumber(
            final java.lang.String fromRefNumber) {
        this._fromRefNumber = fromRefNumber;
    }

    /**
     * Sets the value of field 'toRefNumber'.
     * 
     * @param toRefNumber the value of field 'toRefNumber'.
     */
    public void setToRefNumber(
            final java.lang.String toRefNumber) {
        this._toRefNumber = toRefNumber;
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
     * org.chocolate_milk.model.RefNumberRangeFilter
     */
    public static org.chocolate_milk.model.RefNumberRangeFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.RefNumberRangeFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.RefNumberRangeFilter.class, reader);
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
