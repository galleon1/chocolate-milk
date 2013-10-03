/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: InvoiceRetChoiceItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class InvoiceRetChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class InvoiceRetChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _invoiceLineRet.
     */
    private org.chocolate_milk.model.InvoiceLineRet _invoiceLineRet;

    /**
     * Field _invoiceLineGroupRet.
     */
    private org.chocolate_milk.model.InvoiceLineGroupRet _invoiceLineGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public InvoiceRetChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'invoiceLineGroupRet'.
     * 
     * @return the value of field 'InvoiceLineGroupRet'.
     */
    public org.chocolate_milk.model.InvoiceLineGroupRet getInvoiceLineGroupRet(
    ) {
        return this._invoiceLineGroupRet;
    }

    /**
     * Returns the value of field 'invoiceLineRet'.
     * 
     * @return the value of field 'InvoiceLineRet'.
     */
    public org.chocolate_milk.model.InvoiceLineRet getInvoiceLineRet(
    ) {
        return this._invoiceLineRet;
    }

    /**
     * Sets the value of field 'invoiceLineGroupRet'.
     * 
     * @param invoiceLineGroupRet the value of field
     * 'invoiceLineGroupRet'.
     */
    public void setInvoiceLineGroupRet(
            final org.chocolate_milk.model.InvoiceLineGroupRet invoiceLineGroupRet) {
        this._invoiceLineGroupRet = invoiceLineGroupRet;
    }

    /**
     * Sets the value of field 'invoiceLineRet'.
     * 
     * @param invoiceLineRet the value of field 'invoiceLineRet'.
     */
    public void setInvoiceLineRet(
            final org.chocolate_milk.model.InvoiceLineRet invoiceLineRet) {
        this._invoiceLineRet = invoiceLineRet;
    }

}
