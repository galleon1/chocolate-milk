/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InvoiceModChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InvoiceModChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class InvoiceModChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _invoiceLineMod.
     */
    private org.chocolate_milk.model.InvoiceLineMod _invoiceLineMod;

    /**
     * Field _invoiceLineGroupMod.
     */
    private org.chocolate_milk.model.InvoiceLineGroupMod _invoiceLineGroupMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public InvoiceModChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'invoiceLineGroupMod'.
     * 
     * @return the value of field 'InvoiceLineGroupMod'.
     */
    public org.chocolate_milk.model.InvoiceLineGroupMod getInvoiceLineGroupMod(
    ) {
        return this._invoiceLineGroupMod;
    }

    /**
     * Returns the value of field 'invoiceLineMod'.
     * 
     * @return the value of field 'InvoiceLineMod'.
     */
    public org.chocolate_milk.model.InvoiceLineMod getInvoiceLineMod(
    ) {
        return this._invoiceLineMod;
    }

    /**
     * Sets the value of field 'invoiceLineGroupMod'.
     * 
     * @param invoiceLineGroupMod the value of field
     * 'invoiceLineGroupMod'.
     */
    public void setInvoiceLineGroupMod(
            final org.chocolate_milk.model.InvoiceLineGroupMod invoiceLineGroupMod) {
        this._invoiceLineGroupMod = invoiceLineGroupMod;
    }

    /**
     * Sets the value of field 'invoiceLineMod'.
     * 
     * @param invoiceLineMod the value of field 'invoiceLineMod'.
     */
    public void setInvoiceLineMod(
            final org.chocolate_milk.model.InvoiceLineMod invoiceLineMod) {
        this._invoiceLineMod = invoiceLineMod;
    }

}
