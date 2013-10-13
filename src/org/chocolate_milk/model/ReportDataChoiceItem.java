/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportDataChoiceItem.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportDataChoiceItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ReportDataChoiceItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataRow.
     */
    private org.chocolate_milk.model.DataRow _dataRow;

    /**
     * Field _textRow.
     */
    private org.chocolate_milk.model.TextRow _textRow;

    /**
     * Field _subtotalRow.
     */
    private org.chocolate_milk.model.SubtotalRow _subtotalRow;

    /**
     * Field _totalRow.
     */
    private org.chocolate_milk.model.TotalRow _totalRow;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportDataChoiceItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataRow'.
     * 
     * @return the value of field 'DataRow'.
     */
    public org.chocolate_milk.model.DataRow getDataRow(
    ) {
        return this._dataRow;
    }

    /**
     * Returns the value of field 'subtotalRow'.
     * 
     * @return the value of field 'SubtotalRow'.
     */
    public org.chocolate_milk.model.SubtotalRow getSubtotalRow(
    ) {
        return this._subtotalRow;
    }

    /**
     * Returns the value of field 'textRow'.
     * 
     * @return the value of field 'TextRow'.
     */
    public org.chocolate_milk.model.TextRow getTextRow(
    ) {
        return this._textRow;
    }

    /**
     * Returns the value of field 'totalRow'.
     * 
     * @return the value of field 'TotalRow'.
     */
    public org.chocolate_milk.model.TotalRow getTotalRow(
    ) {
        return this._totalRow;
    }

    /**
     * Sets the value of field 'dataRow'.
     * 
     * @param dataRow the value of field 'dataRow'.
     */
    public void setDataRow(
            final org.chocolate_milk.model.DataRow dataRow) {
        this._dataRow = dataRow;
    }

    /**
     * Sets the value of field 'subtotalRow'.
     * 
     * @param subtotalRow the value of field 'subtotalRow'.
     */
    public void setSubtotalRow(
            final org.chocolate_milk.model.SubtotalRow subtotalRow) {
        this._subtotalRow = subtotalRow;
    }

    /**
     * Sets the value of field 'textRow'.
     * 
     * @param textRow the value of field 'textRow'.
     */
    public void setTextRow(
            final org.chocolate_milk.model.TextRow textRow) {
        this._textRow = textRow;
    }

    /**
     * Sets the value of field 'totalRow'.
     * 
     * @param totalRow the value of field 'totalRow'.
     */
    public void setTotalRow(
            final org.chocolate_milk.model.TotalRow totalRow) {
        this._totalRow = totalRow;
    }

}
