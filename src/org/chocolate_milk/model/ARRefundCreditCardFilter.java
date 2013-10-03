/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ARRefundCreditCardFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ARRefundCreditCardFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ARRefundCreditCardFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxReturned.
     */
    private long _maxReturned;

    /**
     * keeps track of state for field: _maxReturned
     */
    private boolean _has_maxReturned;

    /**
     * Field _ARRefundCreditCardFilterChoice.
     */
    private org.chocolate_milk.model.ARRefundCreditCardFilterChoice _ARRefundCreditCardFilterChoice;

    /**
     * Field _entityFilter.
     */
    private org.chocolate_milk.model.EntityFilter _entityFilter;

    /**
     * Field _accountFilter.
     */
    private org.chocolate_milk.model.AccountFilter _accountFilter;

    /**
     * Field _ARRefundCreditCardFilterChoice2.
     */
    private org.chocolate_milk.model.ARRefundCreditCardFilterChoice2 _ARRefundCreditCardFilterChoice2;


      //----------------/
     //- Constructors -/
    //----------------/

    public ARRefundCreditCardFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMaxReturned(
    ) {
        this._has_maxReturned= false;
    }

    /**
     * Returns the value of field 'ARRefundCreditCardFilterChoice'.
     * 
     * @return the value of field 'ARRefundCreditCardFilterChoice'.
     */
    public org.chocolate_milk.model.ARRefundCreditCardFilterChoice getARRefundCreditCardFilterChoice(
    ) {
        return this._ARRefundCreditCardFilterChoice;
    }

    /**
     * Returns the value of field
     * 'ARRefundCreditCardFilterChoice2'.
     * 
     * @return the value of field 'ARRefundCreditCardFilterChoice2'.
     */
    public org.chocolate_milk.model.ARRefundCreditCardFilterChoice2 getARRefundCreditCardFilterChoice2(
    ) {
        return this._ARRefundCreditCardFilterChoice2;
    }

    /**
     * Returns the value of field 'accountFilter'.
     * 
     * @return the value of field 'AccountFilter'.
     */
    public org.chocolate_milk.model.AccountFilter getAccountFilter(
    ) {
        return this._accountFilter;
    }

    /**
     * Returns the value of field 'entityFilter'.
     * 
     * @return the value of field 'EntityFilter'.
     */
    public org.chocolate_milk.model.EntityFilter getEntityFilter(
    ) {
        return this._entityFilter;
    }

    /**
     * Returns the value of field 'maxReturned'.
     * 
     * @return the value of field 'MaxReturned'.
     */
    public long getMaxReturned(
    ) {
        return this._maxReturned;
    }

    /**
     * Method hasMaxReturned.
     * 
     * @return true if at least one MaxReturned has been added
     */
    public boolean hasMaxReturned(
    ) {
        return this._has_maxReturned;
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
     * Sets the value of field 'ARRefundCreditCardFilterChoice'.
     * 
     * @param ARRefundCreditCardFilterChoice the value of field
     * 'ARRefundCreditCardFilterChoice'.
     */
    public void setARRefundCreditCardFilterChoice(
            final org.chocolate_milk.model.ARRefundCreditCardFilterChoice ARRefundCreditCardFilterChoice) {
        this._ARRefundCreditCardFilterChoice = ARRefundCreditCardFilterChoice;
    }

    /**
     * Sets the value of field 'ARRefundCreditCardFilterChoice2'.
     * 
     * @param ARRefundCreditCardFilterChoice2 the value of field
     * 'ARRefundCreditCardFilterChoice2'.
     */
    public void setARRefundCreditCardFilterChoice2(
            final org.chocolate_milk.model.ARRefundCreditCardFilterChoice2 ARRefundCreditCardFilterChoice2) {
        this._ARRefundCreditCardFilterChoice2 = ARRefundCreditCardFilterChoice2;
    }

    /**
     * Sets the value of field 'accountFilter'.
     * 
     * @param accountFilter the value of field 'accountFilter'.
     */
    public void setAccountFilter(
            final org.chocolate_milk.model.AccountFilter accountFilter) {
        this._accountFilter = accountFilter;
    }

    /**
     * Sets the value of field 'entityFilter'.
     * 
     * @param entityFilter the value of field 'entityFilter'.
     */
    public void setEntityFilter(
            final org.chocolate_milk.model.EntityFilter entityFilter) {
        this._entityFilter = entityFilter;
    }

    /**
     * Sets the value of field 'maxReturned'.
     * 
     * @param maxReturned the value of field 'maxReturned'.
     */
    public void setMaxReturned(
            final long maxReturned) {
        this._maxReturned = maxReturned;
        this._has_maxReturned = true;
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
     * org.chocolate_milk.model.ARRefundCreditCardFilter
     */
    public static org.chocolate_milk.model.ARRefundCreditCardFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ARRefundCreditCardFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ARRefundCreditCardFilter.class, reader);
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
