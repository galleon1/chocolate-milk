/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSequenceChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLSequenceChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class QBXMLSequenceChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _QBXMLMsgsRq.
     */
    private org.chocolate_milk.model.QBXMLMsgsRq _QBXMLMsgsRq;

    /**
     * Field _QBXMLSubscriptionMsgsRq.
     */
    private org.chocolate_milk.model.QBXMLSubscriptionMsgsRq _QBXMLSubscriptionMsgsRq;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLSequenceChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'QBXMLMsgsRq'.
     * 
     * @return the value of field 'QBXMLMsgsRq'.
     */
    public org.chocolate_milk.model.QBXMLMsgsRq getQBXMLMsgsRq(
    ) {
        return this._QBXMLMsgsRq;
    }

    /**
     * Returns the value of field 'QBXMLSubscriptionMsgsRq'.
     * 
     * @return the value of field 'QBXMLSubscriptionMsgsRq'.
     */
    public org.chocolate_milk.model.QBXMLSubscriptionMsgsRq getQBXMLSubscriptionMsgsRq(
    ) {
        return this._QBXMLSubscriptionMsgsRq;
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
     * Sets the value of field 'QBXMLMsgsRq'.
     * 
     * @param QBXMLMsgsRq the value of field 'QBXMLMsgsRq'.
     */
    public void setQBXMLMsgsRq(
            final org.chocolate_milk.model.QBXMLMsgsRq QBXMLMsgsRq) {
        this._QBXMLMsgsRq = QBXMLMsgsRq;
    }

    /**
     * Sets the value of field 'QBXMLSubscriptionMsgsRq'.
     * 
     * @param QBXMLSubscriptionMsgsRq the value of field
     * 'QBXMLSubscriptionMsgsRq'.
     */
    public void setQBXMLSubscriptionMsgsRq(
            final org.chocolate_milk.model.QBXMLSubscriptionMsgsRq QBXMLSubscriptionMsgsRq) {
        this._QBXMLSubscriptionMsgsRq = QBXMLSubscriptionMsgsRq;
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
     * org.chocolate_milk.model.QBXMLSequenceChoice
     */
    public static org.chocolate_milk.model.QBXMLSequenceChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXMLSequenceChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXMLSequenceChoice.class, reader);
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
