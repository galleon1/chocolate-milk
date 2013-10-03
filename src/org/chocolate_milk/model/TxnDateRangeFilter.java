/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnDateRangeFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnDateRangeFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnDateRangeFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _txnDateFilter.
     */
    private org.chocolate_milk.model.TxnDateFilter _txnDateFilter;

    /**
     * Field _dateMacro.
     */
    private org.chocolate_milk.model.types.DateMacroType _dateMacro;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnDateRangeFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'dateMacro'.
     * 
     * @return the value of field 'DateMacro'.
     */
    public org.chocolate_milk.model.types.DateMacroType getDateMacro(
    ) {
        return this._dateMacro;
    }

    /**
     * Returns the value of field 'txnDateFilter'.
     * 
     * @return the value of field 'TxnDateFilter'.
     */
    public org.chocolate_milk.model.TxnDateFilter getTxnDateFilter(
    ) {
        return this._txnDateFilter;
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
     * Sets the value of field 'dateMacro'.
     * 
     * @param dateMacro the value of field 'dateMacro'.
     */
    public void setDateMacro(
            final org.chocolate_milk.model.types.DateMacroType dateMacro) {
        this._dateMacro = dateMacro;
        this._choiceValue = dateMacro;
    }

    /**
     * Sets the value of field 'txnDateFilter'.
     * 
     * @param txnDateFilter the value of field 'txnDateFilter'.
     */
    public void setTxnDateFilter(
            final org.chocolate_milk.model.TxnDateFilter txnDateFilter) {
        this._txnDateFilter = txnDateFilter;
        this._choiceValue = txnDateFilter;
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
     * org.chocolate_milk.model.TxnDateRangeFilter
     */
    public static org.chocolate_milk.model.TxnDateRangeFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnDateRangeFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnDateRangeFilter.class, reader);
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
