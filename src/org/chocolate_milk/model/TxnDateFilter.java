/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnDateFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnDateFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnDateFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fromTxnDate.
     */
    private java.lang.String _fromTxnDate;

    /**
     * Field _toTxnDate.
     */
    private java.lang.String _toTxnDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnDateFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'fromTxnDate'.
     * 
     * @return the value of field 'FromTxnDate'.
     */
    public java.lang.String getFromTxnDate(
    ) {
        return this._fromTxnDate;
    }

    /**
     * Returns the value of field 'toTxnDate'.
     * 
     * @return the value of field 'ToTxnDate'.
     */
    public java.lang.String getToTxnDate(
    ) {
        return this._toTxnDate;
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
     * Sets the value of field 'fromTxnDate'.
     * 
     * @param fromTxnDate the value of field 'fromTxnDate'.
     */
    public void setFromTxnDate(
            final java.lang.String fromTxnDate) {
        this._fromTxnDate = fromTxnDate;
    }

    /**
     * Sets the value of field 'toTxnDate'.
     * 
     * @param toTxnDate the value of field 'toTxnDate'.
     */
    public void setToTxnDate(
            final java.lang.String toTxnDate) {
        this._toTxnDate = toTxnDate;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.TxnDateFilte
     */
    public static org.chocolate_milk.model.TxnDateFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnDateFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnDateFilter.class, reader);
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
