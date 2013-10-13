/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSequence2.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLSequence2.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class QBXMLSequence2 implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _signonMsgsRs.
     */
    private org.chocolate_milk.model.SignonMsgsRs _signonMsgsRs;

    /**
     * Field _QBXMLSequence2Choice.
     */
    private org.chocolate_milk.model.QBXMLSequence2Choice _QBXMLSequence2Choice;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLSequence2() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'QBXMLSequence2Choice'.
     * 
     * @return the value of field 'QBXMLSequence2Choice'.
     */
    public org.chocolate_milk.model.QBXMLSequence2Choice getQBXMLSequence2Choice(
    ) {
        return this._QBXMLSequence2Choice;
    }

    /**
     * Returns the value of field 'signonMsgsRs'.
     * 
     * @return the value of field 'SignonMsgsRs'.
     */
    public org.chocolate_milk.model.SignonMsgsRs getSignonMsgsRs(
    ) {
        return this._signonMsgsRs;
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
     * Sets the value of field 'QBXMLSequence2Choice'.
     * 
     * @param QBXMLSequence2Choice the value of field
     * 'QBXMLSequence2Choice'.
     */
    public void setQBXMLSequence2Choice(
            final org.chocolate_milk.model.QBXMLSequence2Choice QBXMLSequence2Choice) {
        this._QBXMLSequence2Choice = QBXMLSequence2Choice;
    }

    /**
     * Sets the value of field 'signonMsgsRs'.
     * 
     * @param signonMsgsRs the value of field 'signonMsgsRs'.
     */
    public void setSignonMsgsRs(
            final org.chocolate_milk.model.SignonMsgsRs signonMsgsRs) {
        this._signonMsgsRs = signonMsgsRs;
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
     * org.chocolate_milk.model.QBXMLSequence2
     */
    public static org.chocolate_milk.model.QBXMLSequence2 unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.QBXMLSequence2) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.QBXMLSequence2.class, reader);
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
