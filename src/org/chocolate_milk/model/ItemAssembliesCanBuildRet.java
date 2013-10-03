/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemAssembliesCanBuildRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemAssembliesCanBuildRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemAssembliesCanBuildRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemInventoryAssemblyRef.
     */
    private org.chocolate_milk.model.ItemInventoryAssemblyRef _itemInventoryAssemblyRef;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _quantityCanBuild.
     */
    private java.lang.String _quantityCanBuild;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemAssembliesCanBuildRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemInventoryAssemblyRef'.
     * 
     * @return the value of field 'ItemInventoryAssemblyRef'.
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyRef getItemInventoryAssemblyRef(
    ) {
        return this._itemInventoryAssemblyRef;
    }

    /**
     * Returns the value of field 'quantityCanBuild'.
     * 
     * @return the value of field 'QuantityCanBuild'.
     */
    public java.lang.String getQuantityCanBuild(
    ) {
        return this._quantityCanBuild;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
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
     * Sets the value of field 'itemInventoryAssemblyRef'.
     * 
     * @param itemInventoryAssemblyRef the value of field
     * 'itemInventoryAssemblyRef'.
     */
    public void setItemInventoryAssemblyRef(
            final org.chocolate_milk.model.ItemInventoryAssemblyRef itemInventoryAssemblyRef) {
        this._itemInventoryAssemblyRef = itemInventoryAssemblyRef;
    }

    /**
     * Sets the value of field 'quantityCanBuild'.
     * 
     * @param quantityCanBuild the value of field 'quantityCanBuild'
     */
    public void setQuantityCanBuild(
            final java.lang.String quantityCanBuild) {
        this._quantityCanBuild = quantityCanBuild;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
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
     * org.chocolate_milk.model.ItemAssembliesCanBuildRet
     */
    public static org.chocolate_milk.model.ItemAssembliesCanBuildRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemAssembliesCanBuildRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemAssembliesCanBuildRet.class, reader);
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
