/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PersonName.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PersonName.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class PersonName implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salutation.
     */
    private java.lang.String _salutation;

    /**
     * Field _firstName.
     */
    private java.lang.String _firstName;

    /**
     * Field _middleName.
     */
    private java.lang.String _middleName;

    /**
     * Field _lastName.
     */
    private java.lang.String _lastName;

    /**
     * Field _suffix.
     */
    private java.lang.String _suffix;


      //----------------/
     //- Constructors -/
    //----------------/

    public PersonName() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'firstName'.
     * 
     * @return the value of field 'FirstName'.
     */
    public java.lang.String getFirstName(
    ) {
        return this._firstName;
    }

    /**
     * Returns the value of field 'lastName'.
     * 
     * @return the value of field 'LastName'.
     */
    public java.lang.String getLastName(
    ) {
        return this._lastName;
    }

    /**
     * Returns the value of field 'middleName'.
     * 
     * @return the value of field 'MiddleName'.
     */
    public java.lang.String getMiddleName(
    ) {
        return this._middleName;
    }

    /**
     * Returns the value of field 'salutation'.
     * 
     * @return the value of field 'Salutation'.
     */
    public java.lang.String getSalutation(
    ) {
        return this._salutation;
    }

    /**
     * Returns the value of field 'suffix'.
     * 
     * @return the value of field 'Suffix'.
     */
    public java.lang.String getSuffix(
    ) {
        return this._suffix;
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
     * Sets the value of field 'firstName'.
     * 
     * @param firstName the value of field 'firstName'.
     */
    public void setFirstName(
            final java.lang.String firstName) {
        this._firstName = firstName;
    }

    /**
     * Sets the value of field 'lastName'.
     * 
     * @param lastName the value of field 'lastName'.
     */
    public void setLastName(
            final java.lang.String lastName) {
        this._lastName = lastName;
    }

    /**
     * Sets the value of field 'middleName'.
     * 
     * @param middleName the value of field 'middleName'.
     */
    public void setMiddleName(
            final java.lang.String middleName) {
        this._middleName = middleName;
    }

    /**
     * Sets the value of field 'salutation'.
     * 
     * @param salutation the value of field 'salutation'.
     */
    public void setSalutation(
            final java.lang.String salutation) {
        this._salutation = salutation;
    }

    /**
     * Sets the value of field 'suffix'.
     * 
     * @param suffix the value of field 'suffix'.
     */
    public void setSuffix(
            final java.lang.String suffix) {
        this._suffix = suffix;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.PersonName
     */
    public static org.chocolate_milk.model.PersonName unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PersonName) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PersonName.class, reader);
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
