/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BuildAssemblyFilter.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BuildAssemblyFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BuildAssemblyFilter implements java.io.Serializable {


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
     * Field _buildAssemblyFilterChoice.
     */
    private org.chocolate_milk.model.BuildAssemblyFilterChoice _buildAssemblyFilterChoice;

    /**
     * Field _itemFilter.
     */
    private org.chocolate_milk.model.ItemFilter _itemFilter;

    /**
     * Field _buildAssemblyFilterChoice2.
     */
    private org.chocolate_milk.model.BuildAssemblyFilterChoice2 _buildAssemblyFilterChoice2;

    /**
     * Field _pendingStatus.
     */
    private org.chocolate_milk.model.types.PendingStatusType _pendingStatus = org.chocolate_milk.model.types.PendingStatusType.fromValue("All");


      //----------------/
     //- Constructors -/
    //----------------/

    public BuildAssemblyFilter() {
        super();
        setPendingStatus(org.chocolate_milk.model.types.PendingStatusType.fromValue("All"));
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
     * Returns the value of field 'buildAssemblyFilterChoice'.
     * 
     * @return the value of field 'BuildAssemblyFilterChoice'.
     */
    public org.chocolate_milk.model.BuildAssemblyFilterChoice getBuildAssemblyFilterChoice(
    ) {
        return this._buildAssemblyFilterChoice;
    }

    /**
     * Returns the value of field 'buildAssemblyFilterChoice2'.
     * 
     * @return the value of field 'BuildAssemblyFilterChoice2'.
     */
    public org.chocolate_milk.model.BuildAssemblyFilterChoice2 getBuildAssemblyFilterChoice2(
    ) {
        return this._buildAssemblyFilterChoice2;
    }

    /**
     * Returns the value of field 'itemFilter'.
     * 
     * @return the value of field 'ItemFilter'.
     */
    public org.chocolate_milk.model.ItemFilter getItemFilter(
    ) {
        return this._itemFilter;
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
     * Returns the value of field 'pendingStatus'.
     * 
     * @return the value of field 'PendingStatus'.
     */
    public org.chocolate_milk.model.types.PendingStatusType getPendingStatus(
    ) {
        return this._pendingStatus;
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
     * Sets the value of field 'buildAssemblyFilterChoice'.
     * 
     * @param buildAssemblyFilterChoice the value of field
     * 'buildAssemblyFilterChoice'.
     */
    public void setBuildAssemblyFilterChoice(
            final org.chocolate_milk.model.BuildAssemblyFilterChoice buildAssemblyFilterChoice) {
        this._buildAssemblyFilterChoice = buildAssemblyFilterChoice;
    }

    /**
     * Sets the value of field 'buildAssemblyFilterChoice2'.
     * 
     * @param buildAssemblyFilterChoice2 the value of field
     * 'buildAssemblyFilterChoice2'.
     */
    public void setBuildAssemblyFilterChoice2(
            final org.chocolate_milk.model.BuildAssemblyFilterChoice2 buildAssemblyFilterChoice2) {
        this._buildAssemblyFilterChoice2 = buildAssemblyFilterChoice2;
    }

    /**
     * Sets the value of field 'itemFilter'.
     * 
     * @param itemFilter the value of field 'itemFilter'.
     */
    public void setItemFilter(
            final org.chocolate_milk.model.ItemFilter itemFilter) {
        this._itemFilter = itemFilter;
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
     * Sets the value of field 'pendingStatus'.
     * 
     * @param pendingStatus the value of field 'pendingStatus'.
     */
    public void setPendingStatus(
            final org.chocolate_milk.model.types.PendingStatusType pendingStatus) {
        this._pendingStatus = pendingStatus;
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
     * org.chocolate_milk.model.BuildAssemblyFilter
     */
    public static org.chocolate_milk.model.BuildAssemblyFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BuildAssemblyFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BuildAssemblyFilter.class, reader);
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
