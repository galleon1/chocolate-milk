/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSequence2Choice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLSequence2Choice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class QBXMLSequence2Choice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _QBXMLMsgsRs.
     */
    private org.chocolate_milk.model.QBXMLMsgsRs _QBXMLMsgsRs;

    /**
     * Field _QBXMLSubscriptionMsgsRs.
     */
    private org.chocolate_milk.model.QBXMLSubscriptionMsgsRs _QBXMLSubscriptionMsgsRs;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLSequence2Choice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'QBXMLMsgsRs'.
     * 
     * @return the value of field 'QBXMLMsgsRs'.
     */
    public org.chocolate_milk.model.QBXMLMsgsRs getQBXMLMsgsRs(
    ) {
        return this._QBXMLMsgsRs;
    }

    /**
     * Returns the value of field 'QBXMLSubscriptionMsgsRs'.
     * 
     * @return the value of field 'QBXMLSubscriptionMsgsRs'.
     */
    public org.chocolate_milk.model.QBXMLSubscriptionMsgsRs getQBXMLSubscriptionMsgsRs(
    ) {
        return this._QBXMLSubscriptionMsgsRs;
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
     * Sets the value of field 'QBXMLMsgsRs'.
     * 
     * @param QBXMLMsgsRs the value of field 'QBXMLMsgsRs'.
     */
    public void setQBXMLMsgsRs(
            final org.chocolate_milk.model.QBXMLMsgsRs QBXMLMsgsRs) {
        this._QBXMLMsgsRs = QBXMLMsgsRs;
    }

    /**
     * Sets the value of field 'QBXMLSubscriptionMsgsRs'.
     * 
     * @param QBXMLSubscriptionMsgsRs the value of field
     * 'QBXMLSubscriptionMsgsRs'.
     */
    public void setQBXMLSubscriptionMsgsRs(
            final org.chocolate_milk.model.QBXMLSubscriptionMsgsRs QBXMLSubscriptionMsgsRs) {
        this._QBXMLSubscriptionMsgsRs = QBXMLSubscriptionMsgsRs;
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
     * org.chocolate_milk.model.QBXMLSequence2Choice
     */
    public static org.chocolate_milk.model.QBXMLSequence2Choice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXMLSequence2Choice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXMLSequence2Choice.class, reader);
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
