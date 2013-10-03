/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListEvent.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListEvent.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ListEvent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listEventType.
     */
    private org.chocolate_milk.model.types.ListEventTypeType _listEventType;

    /**
     * Field _listEventOperation.
     */
    private org.chocolate_milk.model.types.ListEventOperationType _listEventOperation;

    /**
     * Field _listID.
     */
    private java.lang.String _listID;

    /**
     * Field _afterMergeListID.
     */
    private java.lang.String _afterMergeListID;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListEvent() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'afterMergeListID'.
     * 
     * @return the value of field 'AfterMergeListID'.
     */
    public java.lang.String getAfterMergeListID(
    ) {
        return this._afterMergeListID;
    }

    /**
     * Returns the value of field 'listEventOperation'.
     * 
     * @return the value of field 'ListEventOperation'.
     */
    public org.chocolate_milk.model.types.ListEventOperationType getListEventOperation(
    ) {
        return this._listEventOperation;
    }

    /**
     * Returns the value of field 'listEventType'.
     * 
     * @return the value of field 'ListEventType'.
     */
    public org.chocolate_milk.model.types.ListEventTypeType getListEventType(
    ) {
        return this._listEventType;
    }

    /**
     * Returns the value of field 'listID'.
     * 
     * @return the value of field 'ListID'.
     */
    public java.lang.String getListID(
    ) {
        return this._listID;
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
     * Sets the value of field 'afterMergeListID'.
     * 
     * @param afterMergeListID the value of field 'afterMergeListID'
     */
    public void setAfterMergeListID(
            final java.lang.String afterMergeListID) {
        this._afterMergeListID = afterMergeListID;
    }

    /**
     * Sets the value of field 'listEventOperation'.
     * 
     * @param listEventOperation the value of field
     * 'listEventOperation'.
     */
    public void setListEventOperation(
            final org.chocolate_milk.model.types.ListEventOperationType listEventOperation) {
        this._listEventOperation = listEventOperation;
    }

    /**
     * Sets the value of field 'listEventType'.
     * 
     * @param listEventType the value of field 'listEventType'.
     */
    public void setListEventType(
            final org.chocolate_milk.model.types.ListEventTypeType listEventType) {
        this._listEventType = listEventType;
    }

    /**
     * Sets the value of field 'listID'.
     * 
     * @param listID the value of field 'listID'.
     */
    public void setListID(
            final java.lang.String listID) {
        this._listID = listID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ListEvent
     */
    public static org.chocolate_milk.model.ListEvent unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListEvent) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListEvent.class, reader);
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
