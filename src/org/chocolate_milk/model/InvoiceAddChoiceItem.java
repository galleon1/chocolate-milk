/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InvoiceAddChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InvoiceAddChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class InvoiceAddChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _invoiceLineAdd.
     */
    private org.chocolate_milk.model.InvoiceLineAdd _invoiceLineAdd;

    /**
     * Field _invoiceLineGroupAdd.
     */
    private org.chocolate_milk.model.InvoiceLineGroupAdd _invoiceLineGroupAdd;


      //----------------/
     //- Constructors -/
    //----------------/

    public InvoiceAddChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'invoiceLineAdd'.
     * 
     * @return the value of field 'InvoiceLineAdd'.
     */
    public org.chocolate_milk.model.InvoiceLineAdd getInvoiceLineAdd(
    ) {
        return this._invoiceLineAdd;
    }

    /**
     * Returns the value of field 'invoiceLineGroupAdd'.
     * 
     * @return the value of field 'InvoiceLineGroupAdd'.
     */
    public org.chocolate_milk.model.InvoiceLineGroupAdd getInvoiceLineGroupAdd(
    ) {
        return this._invoiceLineGroupAdd;
    }

    /**
     * Sets the value of field 'invoiceLineAdd'.
     * 
     * @param invoiceLineAdd the value of field 'invoiceLineAdd'.
     */
    public void setInvoiceLineAdd(
            final org.chocolate_milk.model.InvoiceLineAdd invoiceLineAdd) {
        this._invoiceLineAdd = invoiceLineAdd;
    }

    /**
     * Sets the value of field 'invoiceLineGroupAdd'.
     * 
     * @param invoiceLineGroupAdd the value of field
     * 'invoiceLineGroupAdd'.
     */
    public void setInvoiceLineGroupAdd(
            final org.chocolate_milk.model.InvoiceLineGroupAdd invoiceLineGroupAdd) {
        this._invoiceLineGroupAdd = invoiceLineGroupAdd;
    }

}
