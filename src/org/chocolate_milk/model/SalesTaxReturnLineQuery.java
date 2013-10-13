/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SalesTaxReturnLineQuery.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SalesTaxReturnLineQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SalesTaxReturnLineQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _taxAgencyVendorRefList.
     */
    private java.util.List<org.chocolate_milk.model.TaxAgencyVendorRef> _taxAgencyVendorRefList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SalesTaxReturnLineQuery() {
        super();
        this._taxAgencyVendorRefList = new java.util.ArrayList<org.chocolate_milk.model.TaxAgencyVendorRef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTaxAgencyVendorRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTaxAgencyVendorRef(
            final org.chocolate_milk.model.TaxAgencyVendorRef vTaxAgencyVendorRef)
    throws java.lang.IndexOutOfBoundsException {
        this._taxAgencyVendorRefList.add(vTaxAgencyVendorRef);
    }

    /**
     * 
     * 
     * @param index
     * @param vTaxAgencyVendorRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTaxAgencyVendorRef(
            final int index,
            final org.chocolate_milk.model.TaxAgencyVendorRef vTaxAgencyVendorRef)
    throws java.lang.IndexOutOfBoundsException {
        this._taxAgencyVendorRefList.add(index, vTaxAgencyVendorRef);
    }

    /**
     * Method enumerateTaxAgencyVendorRef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.TaxAgencyVendorRef> enumerateTaxAgencyVendorRef(
    ) {
        return java.util.Collections.enumeration(this._taxAgencyVendorRefList);
    }

    /**
     * Method getTaxAgencyVendorRef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.TaxAgencyVendorRef at the given inde
     */
    public org.chocolate_milk.model.TaxAgencyVendorRef getTaxAgencyVendorRef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._taxAgencyVendorRefList.size()) {
            throw new IndexOutOfBoundsException("getTaxAgencyVendorRef: Index value '" + index + "' not in range [0.." + (this._taxAgencyVendorRefList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.TaxAgencyVendorRef) _taxAgencyVendorRefList.get(index);
    }

    /**
     * Method getTaxAgencyVendorRef.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.TaxAgencyVendorRef[] getTaxAgencyVendorRef(
    ) {
        org.chocolate_milk.model.TaxAgencyVendorRef[] array = new org.chocolate_milk.model.TaxAgencyVendorRef[0];
        return (org.chocolate_milk.model.TaxAgencyVendorRef[]) this._taxAgencyVendorRefList.toArray(array);
    }

    /**
     * Method getTaxAgencyVendorRefCount.
     * 
     * @return the size of this collection
     */
    public int getTaxAgencyVendorRefCount(
    ) {
        return this._taxAgencyVendorRefList.size();
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
     * Method iterateTaxAgencyVendorRef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.TaxAgencyVendorRef> iterateTaxAgencyVendorRef(
    ) {
        return this._taxAgencyVendorRefList.iterator();
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
     */
    public void removeAllTaxAgencyVendorRef(
    ) {
        this._taxAgencyVendorRefList.clear();
    }

    /**
     * Method removeTaxAgencyVendorRef.
     * 
     * @param vTaxAgencyVendorRef
     * @return true if the object was removed from the collection.
     */
    public boolean removeTaxAgencyVendorRef(
            final org.chocolate_milk.model.TaxAgencyVendorRef vTaxAgencyVendorRef) {
        boolean removed = _taxAgencyVendorRefList.remove(vTaxAgencyVendorRef);
        return removed;
    }

    /**
     * Method removeTaxAgencyVendorRefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.TaxAgencyVendorRef removeTaxAgencyVendorRefAt(
            final int index) {
        java.lang.Object obj = this._taxAgencyVendorRefList.remove(index);
        return (org.chocolate_milk.model.TaxAgencyVendorRef) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTaxAgencyVendorRef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTaxAgencyVendorRef(
            final int index,
            final org.chocolate_milk.model.TaxAgencyVendorRef vTaxAgencyVendorRef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._taxAgencyVendorRefList.size()) {
            throw new IndexOutOfBoundsException("setTaxAgencyVendorRef: Index value '" + index + "' not in range [0.." + (this._taxAgencyVendorRefList.size() - 1) + "]");
        }

        this._taxAgencyVendorRefList.set(index, vTaxAgencyVendorRef);
    }

    /**
     * 
     * 
     * @param vTaxAgencyVendorRefArray
     */
    public void setTaxAgencyVendorRef(
            final org.chocolate_milk.model.TaxAgencyVendorRef[] vTaxAgencyVendorRefArray) {
        //-- copy array
        _taxAgencyVendorRefList.clear();

        for (int i = 0; i < vTaxAgencyVendorRefArray.length; i++) {
                this._taxAgencyVendorRefList.add(vTaxAgencyVendorRefArray[i]);
        }
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
     * org.chocolate_milk.model.SalesTaxReturnLineQuery
     */
    public static org.chocolate_milk.model.SalesTaxReturnLineQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SalesTaxReturnLineQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SalesTaxReturnLineQuery.class, reader);
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
