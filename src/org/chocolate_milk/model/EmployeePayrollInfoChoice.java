/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EmployeePayrollInfoChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EmployeePayrollInfoChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EmployeePayrollInfoChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _clearEarnings.
     */
    private java.lang.String _clearEarnings;

    /**
     * Field _earningsList.
     */
    private java.util.List<org.chocolate_milk.model.Earnings> _earningsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EmployeePayrollInfoChoice() {
        super();
        this._earningsList = new java.util.ArrayList<org.chocolate_milk.model.Earnings>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEarnings
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEarnings(
            final org.chocolate_milk.model.Earnings vEarnings)
    throws java.lang.IndexOutOfBoundsException {
        this._earningsList.add(vEarnings);
    }

    /**
     * 
     * 
     * @param index
     * @param vEarnings
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEarnings(
            final int index,
            final org.chocolate_milk.model.Earnings vEarnings)
    throws java.lang.IndexOutOfBoundsException {
        this._earningsList.add(index, vEarnings);
    }

    /**
     * Method enumerateEarnings.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.Earnings> enumerateEarnings(
    ) {
        return java.util.Collections.enumeration(this._earningsList);
    }

    /**
     * Returns the value of field 'clearEarnings'.
     * 
     * @return the value of field 'ClearEarnings'.
     */
    public java.lang.String getClearEarnings(
    ) {
        return this._clearEarnings;
    }

    /**
     * Method getEarnings.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.Earnings
     * at the given index
     */
    public org.chocolate_milk.model.Earnings getEarnings(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._earningsList.size()) {
            throw new IndexOutOfBoundsException("getEarnings: Index value '" + index + "' not in range [0.." + (this._earningsList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.Earnings) _earningsList.get(index);
    }

    /**
     * Method getEarnings.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.Earnings[] getEarnings(
    ) {
        org.chocolate_milk.model.Earnings[] array = new org.chocolate_milk.model.Earnings[0];
        return (org.chocolate_milk.model.Earnings[]) this._earningsList.toArray(array);
    }

    /**
     * Method getEarningsCount.
     * 
     * @return the size of this collection
     */
    public int getEarningsCount(
    ) {
        return this._earningsList.size();
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
     * Method iterateEarnings.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.Earnings> iterateEarnings(
    ) {
        return this._earningsList.iterator();
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
    public void removeAllEarnings(
    ) {
        this._earningsList.clear();
    }

    /**
     * Method removeEarnings.
     * 
     * @param vEarnings
     * @return true if the object was removed from the collection.
     */
    public boolean removeEarnings(
            final org.chocolate_milk.model.Earnings vEarnings) {
        boolean removed = _earningsList.remove(vEarnings);
        return removed;
    }

    /**
     * Method removeEarningsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.Earnings removeEarningsAt(
            final int index) {
        java.lang.Object obj = this._earningsList.remove(index);
        return (org.chocolate_milk.model.Earnings) obj;
    }

    /**
     * Sets the value of field 'clearEarnings'.
     * 
     * @param clearEarnings the value of field 'clearEarnings'.
     */
    public void setClearEarnings(
            final java.lang.String clearEarnings) {
        this._clearEarnings = clearEarnings;
    }

    /**
     * 
     * 
     * @param index
     * @param vEarnings
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEarnings(
            final int index,
            final org.chocolate_milk.model.Earnings vEarnings)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._earningsList.size()) {
            throw new IndexOutOfBoundsException("setEarnings: Index value '" + index + "' not in range [0.." + (this._earningsList.size() - 1) + "]");
        }

        this._earningsList.set(index, vEarnings);
    }

    /**
     * 
     * 
     * @param vEarningsArray
     */
    public void setEarnings(
            final org.chocolate_milk.model.Earnings[] vEarningsArray) {
        //-- copy array
        _earningsList.clear();

        for (int i = 0; i < vEarningsArray.length; i++) {
                this._earningsList.add(vEarningsArray[i]);
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
     * org.chocolate_milk.model.EmployeePayrollInfoChoice
     */
    public static org.chocolate_milk.model.EmployeePayrollInfoChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EmployeePayrollInfoChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EmployeePayrollInfoChoice.class, reader);
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
