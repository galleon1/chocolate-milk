/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EntityQueryRsTypeChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EntityQueryRsTypeChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class EntityQueryRsTypeChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _customerRet.
     */
    private org.chocolate_milk.model.CustomerRet _customerRet;

    /**
     * Field _employeeRet.
     */
    private org.chocolate_milk.model.EmployeeRet _employeeRet;

    /**
     * Field _otherNameRet.
     */
    private org.chocolate_milk.model.OtherNameRet _otherNameRet;

    /**
     * Field _vendorRet.
     */
    private org.chocolate_milk.model.VendorRet _vendorRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityQueryRsTypeChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'customerRet'.
     * 
     * @return the value of field 'CustomerRet'.
     */
    public org.chocolate_milk.model.CustomerRet getCustomerRet(
    ) {
        return this._customerRet;
    }

    /**
     * Returns the value of field 'employeeRet'.
     * 
     * @return the value of field 'EmployeeRet'.
     */
    public org.chocolate_milk.model.EmployeeRet getEmployeeRet(
    ) {
        return this._employeeRet;
    }

    /**
     * Returns the value of field 'otherNameRet'.
     * 
     * @return the value of field 'OtherNameRet'.
     */
    public org.chocolate_milk.model.OtherNameRet getOtherNameRet(
    ) {
        return this._otherNameRet;
    }

    /**
     * Returns the value of field 'vendorRet'.
     * 
     * @return the value of field 'VendorRet'.
     */
    public org.chocolate_milk.model.VendorRet getVendorRet(
    ) {
        return this._vendorRet;
    }

    /**
     * Sets the value of field 'customerRet'.
     * 
     * @param customerRet the value of field 'customerRet'.
     */
    public void setCustomerRet(
            final org.chocolate_milk.model.CustomerRet customerRet) {
        this._customerRet = customerRet;
    }

    /**
     * Sets the value of field 'employeeRet'.
     * 
     * @param employeeRet the value of field 'employeeRet'.
     */
    public void setEmployeeRet(
            final org.chocolate_milk.model.EmployeeRet employeeRet) {
        this._employeeRet = employeeRet;
    }

    /**
     * Sets the value of field 'otherNameRet'.
     * 
     * @param otherNameRet the value of field 'otherNameRet'.
     */
    public void setOtherNameRet(
            final org.chocolate_milk.model.OtherNameRet otherNameRet) {
        this._otherNameRet = otherNameRet;
    }

    /**
     * Sets the value of field 'vendorRet'.
     * 
     * @param vendorRet the value of field 'vendorRet'.
     */
    public void setVendorRet(
            final org.chocolate_milk.model.VendorRet vendorRet) {
        this._vendorRet = vendorRet;
    }

}
