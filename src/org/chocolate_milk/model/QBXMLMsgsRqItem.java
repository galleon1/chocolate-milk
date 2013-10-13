/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLMsgsRqItem.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class QBXMLMsgsRqItem.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class QBXMLMsgsRqItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _hostQueryRq.
     */
    private org.chocolate_milk.model.HostQueryRq _hostQueryRq;

    /**
     * Field _companyQueryRq.
     */
    private org.chocolate_milk.model.CompanyQueryRq _companyQueryRq;

    /**
     * Field _companyActivityQueryRq.
     */
    private org.chocolate_milk.model.CompanyActivityQueryRq _companyActivityQueryRq;

    /**
     * Field _preferencesQueryRq.
     */
    private org.chocolate_milk.model.PreferencesQueryRq _preferencesQueryRq;

    /**
     * Field _accountAddRq.
     */
    private org.chocolate_milk.model.AccountAddRq _accountAddRq;

    /**
     * Field _accountModRq.
     */
    private org.chocolate_milk.model.AccountModRq _accountModRq;

    /**
     * Field _accountQueryRq.
     */
    private org.chocolate_milk.model.AccountQueryRq _accountQueryRq;

    /**
     * Field _specialAccountAddRq.
     */
    private org.chocolate_milk.model.SpecialAccountAddRq _specialAccountAddRq;

    /**
     * Field _accountTaxLineInfoQueryRq.
     */
    private org.chocolate_milk.model.AccountTaxLineInfoQueryRq _accountTaxLineInfoQueryRq;

    /**
     * Field _customerAddRq.
     */
    private org.chocolate_milk.model.CustomerAddRq _customerAddRq;

    /**
     * Field _customerModRq.
     */
    private org.chocolate_milk.model.CustomerModRq _customerModRq;

    /**
     * Field _customerQueryRq.
     */
    private org.chocolate_milk.model.CustomerQueryRq _customerQueryRq;

    /**
     * Field _employeeAddRq.
     */
    private org.chocolate_milk.model.EmployeeAddRq _employeeAddRq;

    /**
     * Field _employeeModRq.
     */
    private org.chocolate_milk.model.EmployeeModRq _employeeModRq;

    /**
     * Field _employeeQueryRq.
     */
    private org.chocolate_milk.model.EmployeeQueryRq _employeeQueryRq;

    /**
     * Field _otherNameAddRq.
     */
    private org.chocolate_milk.model.OtherNameAddRq _otherNameAddRq;

    /**
     * Field _otherNameModRq.
     */
    private org.chocolate_milk.model.OtherNameModRq _otherNameModRq;

    /**
     * Field _otherNameQueryRq.
     */
    private org.chocolate_milk.model.OtherNameQueryRq _otherNameQueryRq;

    /**
     * Field _vendorAddRq.
     */
    private org.chocolate_milk.model.VendorAddRq _vendorAddRq;

    /**
     * Field _vendorModRq.
     */
    private org.chocolate_milk.model.VendorModRq _vendorModRq;

    /**
     * Field _vendorQueryRq.
     */
    private org.chocolate_milk.model.VendorQueryRq _vendorQueryRq;

    /**
     * Field _entityQueryRq.
     */
    private org.chocolate_milk.model.EntityQueryRq _entityQueryRq;

    /**
     * Field _standardTermsAddRq.
     */
    private org.chocolate_milk.model.StandardTermsAddRq _standardTermsAddRq;

    /**
     * Field _standardTermsQueryRq.
     */
    private org.chocolate_milk.model.StandardTermsQueryRq _standardTermsQueryRq;

    /**
     * Field _dateDrivenTermsAddRq.
     */
    private org.chocolate_milk.model.DateDrivenTermsAddRq _dateDrivenTermsAddRq;

    /**
     * Field _dateDrivenTermsQueryRq.
     */
    private org.chocolate_milk.model.DateDrivenTermsQueryRq _dateDrivenTermsQueryRq;

    /**
     * Field _termsQueryRq.
     */
    private org.chocolate_milk.model.TermsQueryRq _termsQueryRq;

    /**
     * Field _classAddRq.
     */
    private org.chocolate_milk.model.ClassAddRq _classAddRq;

    /**
     * Field _classModRq.
     */
    private org.chocolate_milk.model.ClassModRq _classModRq;

    /**
     * Field _classQueryRq.
     */
    private org.chocolate_milk.model.ClassQueryRq _classQueryRq;

    /**
     * Field _salesRepAddRq.
     */
    private org.chocolate_milk.model.SalesRepAddRq _salesRepAddRq;

    /**
     * Field _salesRepModRq.
     */
    private org.chocolate_milk.model.SalesRepModRq _salesRepModRq;

    /**
     * Field _salesRepQueryRq.
     */
    private org.chocolate_milk.model.SalesRepQueryRq _salesRepQueryRq;

    /**
     * Field _customerTypeAddRq.
     */
    private org.chocolate_milk.model.CustomerTypeAddRq _customerTypeAddRq;

    /**
     * Field _customerTypeQueryRq.
     */
    private org.chocolate_milk.model.CustomerTypeQueryRq _customerTypeQueryRq;

    /**
     * Field _vendorTypeAddRq.
     */
    private org.chocolate_milk.model.VendorTypeAddRq _vendorTypeAddRq;

    /**
     * Field _vendorTypeQueryRq.
     */
    private org.chocolate_milk.model.VendorTypeQueryRq _vendorTypeQueryRq;

    /**
     * Field _jobTypeAddRq.
     */
    private org.chocolate_milk.model.JobTypeAddRq _jobTypeAddRq;

    /**
     * Field _jobTypeQueryRq.
     */
    private org.chocolate_milk.model.JobTypeQueryRq _jobTypeQueryRq;

    /**
     * Field _customerMsgAddRq.
     */
    private org.chocolate_milk.model.CustomerMsgAddRq _customerMsgAddRq;

    /**
     * Field _customerMsgQueryRq.
     */
    private org.chocolate_milk.model.CustomerMsgQueryRq _customerMsgQueryRq;

    /**
     * Field _paymentMethodAddRq.
     */
    private org.chocolate_milk.model.PaymentMethodAddRq _paymentMethodAddRq;

    /**
     * Field _paymentMethodQueryRq.
     */
    private org.chocolate_milk.model.PaymentMethodQueryRq _paymentMethodQueryRq;

    /**
     * Field _shipMethodAddRq.
     */
    private org.chocolate_milk.model.ShipMethodAddRq _shipMethodAddRq;

    /**
     * Field _shipMethodQueryRq.
     */
    private org.chocolate_milk.model.ShipMethodQueryRq _shipMethodQueryRq;

    /**
     * Field _salesTaxCodeAddRq.
     */
    private org.chocolate_milk.model.SalesTaxCodeAddRq _salesTaxCodeAddRq;

    /**
     * Field _salesTaxCodeModRq.
     */
    private org.chocolate_milk.model.SalesTaxCodeModRq _salesTaxCodeModRq;

    /**
     * Field _salesTaxCodeQueryRq.
     */
    private org.chocolate_milk.model.SalesTaxCodeQueryRq _salesTaxCodeQueryRq;

    /**
     * Field _toDoAddRq.
     */
    private org.chocolate_milk.model.ToDoAddRq _toDoAddRq;

    /**
     * Field _toDoQueryRq.
     */
    private org.chocolate_milk.model.ToDoQueryRq _toDoQueryRq;

    /**
     * Field _itemServiceAddRq.
     */
    private org.chocolate_milk.model.ItemServiceAddRq _itemServiceAddRq;

    /**
     * Field _itemServiceModRq.
     */
    private org.chocolate_milk.model.ItemServiceModRq _itemServiceModRq;

    /**
     * Field _itemServiceQueryRq.
     */
    private org.chocolate_milk.model.ItemServiceQueryRq _itemServiceQueryRq;

    /**
     * Field _itemNonInventoryAddRq.
     */
    private org.chocolate_milk.model.ItemNonInventoryAddRq _itemNonInventoryAddRq;

    /**
     * Field _itemNonInventoryModRq.
     */
    private org.chocolate_milk.model.ItemNonInventoryModRq _itemNonInventoryModRq;

    /**
     * Field _itemNonInventoryQueryRq.
     */
    private org.chocolate_milk.model.ItemNonInventoryQueryRq _itemNonInventoryQueryRq;

    /**
     * Field _itemOtherChargeAddRq.
     */
    private org.chocolate_milk.model.ItemOtherChargeAddRq _itemOtherChargeAddRq;

    /**
     * Field _itemOtherChargeModRq.
     */
    private org.chocolate_milk.model.ItemOtherChargeModRq _itemOtherChargeModRq;

    /**
     * Field _itemOtherChargeQueryRq.
     */
    private org.chocolate_milk.model.ItemOtherChargeQueryRq _itemOtherChargeQueryRq;

    /**
     * Field _itemInventoryAddRq.
     */
    private org.chocolate_milk.model.ItemInventoryAddRq _itemInventoryAddRq;

    /**
     * Field _itemInventoryModRq.
     */
    private org.chocolate_milk.model.ItemInventoryModRq _itemInventoryModRq;

    /**
     * Field _itemInventoryQueryRq.
     */
    private org.chocolate_milk.model.ItemInventoryQueryRq _itemInventoryQueryRq;

    /**
     * Field _itemInventoryAssemblyAddRq.
     */
    private org.chocolate_milk.model.ItemInventoryAssemblyAddRq _itemInventoryAssemblyAddRq;

    /**
     * Field _itemInventoryAssemblyModRq.
     */
    private org.chocolate_milk.model.ItemInventoryAssemblyModRq _itemInventoryAssemblyModRq;

    /**
     * Field _itemInventoryAssemblyQueryRq.
     */
    private org.chocolate_milk.model.ItemInventoryAssemblyQueryRq _itemInventoryAssemblyQueryRq;

    /**
     * Field _itemFixedAssetAddRq.
     */
    private org.chocolate_milk.model.ItemFixedAssetAddRq _itemFixedAssetAddRq;

    /**
     * Field _itemFixedAssetModRq.
     */
    private org.chocolate_milk.model.ItemFixedAssetModRq _itemFixedAssetModRq;

    /**
     * Field _itemFixedAssetQueryRq.
     */
    private org.chocolate_milk.model.ItemFixedAssetQueryRq _itemFixedAssetQueryRq;

    /**
     * Field _itemSubtotalAddRq.
     */
    private org.chocolate_milk.model.ItemSubtotalAddRq _itemSubtotalAddRq;

    /**
     * Field _itemSubtotalModRq.
     */
    private org.chocolate_milk.model.ItemSubtotalModRq _itemSubtotalModRq;

    /**
     * Field _itemSubtotalQueryRq.
     */
    private org.chocolate_milk.model.ItemSubtotalQueryRq _itemSubtotalQueryRq;

    /**
     * Field _itemDiscountAddRq.
     */
    private org.chocolate_milk.model.ItemDiscountAddRq _itemDiscountAddRq;

    /**
     * Field _itemDiscountModRq.
     */
    private org.chocolate_milk.model.ItemDiscountModRq _itemDiscountModRq;

    /**
     * Field _itemDiscountQueryRq.
     */
    private org.chocolate_milk.model.ItemDiscountQueryRq _itemDiscountQueryRq;

    /**
     * Field _itemPaymentAddRq.
     */
    private org.chocolate_milk.model.ItemPaymentAddRq _itemPaymentAddRq;

    /**
     * Field _itemPaymentModRq.
     */
    private org.chocolate_milk.model.ItemPaymentModRq _itemPaymentModRq;

    /**
     * Field _itemPaymentQueryRq.
     */
    private org.chocolate_milk.model.ItemPaymentQueryRq _itemPaymentQueryRq;

    /**
     * Field _itemSalesTaxAddRq.
     */
    private org.chocolate_milk.model.ItemSalesTaxAddRq _itemSalesTaxAddRq;

    /**
     * Field _itemSalesTaxModRq.
     */
    private org.chocolate_milk.model.ItemSalesTaxModRq _itemSalesTaxModRq;

    /**
     * Field _itemSalesTaxQueryRq.
     */
    private org.chocolate_milk.model.ItemSalesTaxQueryRq _itemSalesTaxQueryRq;

    /**
     * Field _itemSalesTaxGroupAddRq.
     */
    private org.chocolate_milk.model.ItemSalesTaxGroupAddRq _itemSalesTaxGroupAddRq;

    /**
     * Field _itemSalesTaxGroupModRq.
     */
    private org.chocolate_milk.model.ItemSalesTaxGroupModRq _itemSalesTaxGroupModRq;

    /**
     * Field _itemSalesTaxGroupQueryRq.
     */
    private org.chocolate_milk.model.ItemSalesTaxGroupQueryRq _itemSalesTaxGroupQueryRq;

    /**
     * Field _itemGroupAddRq.
     */
    private org.chocolate_milk.model.ItemGroupAddRq _itemGroupAddRq;

    /**
     * Field _itemGroupModRq.
     */
    private org.chocolate_milk.model.ItemGroupModRq _itemGroupModRq;

    /**
     * Field _itemGroupQueryRq.
     */
    private org.chocolate_milk.model.ItemGroupQueryRq _itemGroupQueryRq;

    /**
     * Field _specialItemAddRq.
     */
    private org.chocolate_milk.model.SpecialItemAddRq _specialItemAddRq;

    /**
     * Field _itemQueryRq.
     */
    private org.chocolate_milk.model.ItemQueryRq _itemQueryRq;

    /**
     * Field _payrollItemWageAddRq.
     */
    private org.chocolate_milk.model.PayrollItemWageAddRq _payrollItemWageAddRq;

    /**
     * Field _payrollItemWageQueryRq.
     */
    private org.chocolate_milk.model.PayrollItemWageQueryRq _payrollItemWageQueryRq;

    /**
     * Field _payrollItemNonWageQueryRq.
     */
    private org.chocolate_milk.model.PayrollItemNonWageQueryRq _payrollItemNonWageQueryRq;

    /**
     * Field _templateQueryRq.
     */
    private org.chocolate_milk.model.TemplateQueryRq _templateQueryRq;

    /**
     * Field _priceLevelAddRq.
     */
    private org.chocolate_milk.model.PriceLevelAddRq _priceLevelAddRq;

    /**
     * Field _priceLevelModRq.
     */
    private org.chocolate_milk.model.PriceLevelModRq _priceLevelModRq;

    /**
     * Field _priceLevelQueryRq.
     */
    private org.chocolate_milk.model.PriceLevelQueryRq _priceLevelQueryRq;

    /**
     * Field _billingRateAddRq.
     */
    private org.chocolate_milk.model.BillingRateAddRq _billingRateAddRq;

    /**
     * Field _billingRateQueryRq.
     */
    private org.chocolate_milk.model.BillingRateQueryRq _billingRateQueryRq;

    /**
     * Field _vehicleAddRq.
     */
    private org.chocolate_milk.model.VehicleAddRq _vehicleAddRq;

    /**
     * Field _vehicleModRq.
     */
    private org.chocolate_milk.model.VehicleModRq _vehicleModRq;

    /**
     * Field _vehicleQueryRq.
     */
    private org.chocolate_milk.model.VehicleQueryRq _vehicleQueryRq;

    /**
     * Field _unitOfMeasureSetAddRq.
     */
    private org.chocolate_milk.model.UnitOfMeasureSetAddRq _unitOfMeasureSetAddRq;

    /**
     * Field _unitOfMeasureSetQueryRq.
     */
    private org.chocolate_milk.model.UnitOfMeasureSetQueryRq _unitOfMeasureSetQueryRq;

    /**
     * Field _workersCompCodeAddRq.
     */
    private org.chocolate_milk.model.WorkersCompCodeAddRq _workersCompCodeAddRq;

    /**
     * Field _workersCompCodeModRq.
     */
    private org.chocolate_milk.model.WorkersCompCodeModRq _workersCompCodeModRq;

    /**
     * Field _workersCompCodeQueryRq.
     */
    private org.chocolate_milk.model.WorkersCompCodeQueryRq _workersCompCodeQueryRq;

    /**
     * Field _form1099CategoryAccountMappingModRq.
     */
    private org.chocolate_milk.model.Form1099CategoryAccountMappingModRq _form1099CategoryAccountMappingModRq;

    /**
     * Field _form1099CategoryAccountMappingQueryRq.
     */
    private org.chocolate_milk.model.Form1099CategoryAccountMappingQueryRq _form1099CategoryAccountMappingQueryRq;

    /**
     * Field _salesTaxReturnQueryRq.
     */
    private org.chocolate_milk.model.SalesTaxReturnQueryRq _salesTaxReturnQueryRq;

    /**
     * Field _salesTaxReturnLineQueryRq.
     */
    private org.chocolate_milk.model.SalesTaxReturnLineQueryRq _salesTaxReturnLineQueryRq;

    /**
     * Field _currencyAddRq.
     */
    private org.chocolate_milk.model.CurrencyAddRq _currencyAddRq;

    /**
     * Field _currencyModRq.
     */
    private org.chocolate_milk.model.CurrencyModRq _currencyModRq;

    /**
     * Field _currencyQueryRq.
     */
    private org.chocolate_milk.model.CurrencyQueryRq _currencyQueryRq;

    /**
     * Field _payrollLastPeriodQueryRq.
     */
    private org.chocolate_milk.model.PayrollLastPeriodQueryRq _payrollLastPeriodQueryRq;

    /**
     * Field _invoiceAddRq.
     */
    private org.chocolate_milk.model.InvoiceAddRq _invoiceAddRq;

    /**
     * Field _invoiceModRq.
     */
    private org.chocolate_milk.model.InvoiceModRq _invoiceModRq;

    /**
     * Field _invoiceQueryRq.
     */
    private org.chocolate_milk.model.InvoiceQueryRq _invoiceQueryRq;

    /**
     * Field _estimateAddRq.
     */
    private org.chocolate_milk.model.EstimateAddRq _estimateAddRq;

    /**
     * Field _estimateModRq.
     */
    private org.chocolate_milk.model.EstimateModRq _estimateModRq;

    /**
     * Field _estimateQueryRq.
     */
    private org.chocolate_milk.model.EstimateQueryRq _estimateQueryRq;

    /**
     * Field _salesOrderAddRq.
     */
    private org.chocolate_milk.model.SalesOrderAddRq _salesOrderAddRq;

    /**
     * Field _salesOrderModRq.
     */
    private org.chocolate_milk.model.SalesOrderModRq _salesOrderModRq;

    /**
     * Field _salesOrderQueryRq.
     */
    private org.chocolate_milk.model.SalesOrderQueryRq _salesOrderQueryRq;

    /**
     * Field _salesReceiptAddRq.
     */
    private org.chocolate_milk.model.SalesReceiptAddRq _salesReceiptAddRq;

    /**
     * Field _salesReceiptModRq.
     */
    private org.chocolate_milk.model.SalesReceiptModRq _salesReceiptModRq;

    /**
     * Field _salesReceiptQueryRq.
     */
    private org.chocolate_milk.model.SalesReceiptQueryRq _salesReceiptQueryRq;

    /**
     * Field _creditMemoAddRq.
     */
    private org.chocolate_milk.model.CreditMemoAddRq _creditMemoAddRq;

    /**
     * Field _creditMemoModRq.
     */
    private org.chocolate_milk.model.CreditMemoModRq _creditMemoModRq;

    /**
     * Field _creditMemoQueryRq.
     */
    private org.chocolate_milk.model.CreditMemoQueryRq _creditMemoQueryRq;

    /**
     * Field _receivePaymentAddRq.
     */
    private org.chocolate_milk.model.ReceivePaymentAddRq _receivePaymentAddRq;

    /**
     * Field _receivePaymentModRq.
     */
    private org.chocolate_milk.model.ReceivePaymentModRq _receivePaymentModRq;

    /**
     * Field _receivePaymentQueryRq.
     */
    private org.chocolate_milk.model.ReceivePaymentQueryRq _receivePaymentQueryRq;

    /**
     * Field _receivePaymentToDepositQueryRq.
     */
    private org.chocolate_milk.model.ReceivePaymentToDepositQueryRq _receivePaymentToDepositQueryRq;

    /**
     * Field _chargeAddRq.
     */
    private org.chocolate_milk.model.ChargeAddRq _chargeAddRq;

    /**
     * Field _chargeModRq.
     */
    private org.chocolate_milk.model.ChargeModRq _chargeModRq;

    /**
     * Field _chargeQueryRq.
     */
    private org.chocolate_milk.model.ChargeQueryRq _chargeQueryRq;

    /**
     * Field _purchaseOrderAddRq.
     */
    private org.chocolate_milk.model.PurchaseOrderAddRq _purchaseOrderAddRq;

    /**
     * Field _purchaseOrderModRq.
     */
    private org.chocolate_milk.model.PurchaseOrderModRq _purchaseOrderModRq;

    /**
     * Field _purchaseOrderQueryRq.
     */
    private org.chocolate_milk.model.PurchaseOrderQueryRq _purchaseOrderQueryRq;

    /**
     * Field _billAddRq.
     */
    private org.chocolate_milk.model.BillAddRq _billAddRq;

    /**
     * Field _billModRq.
     */
    private org.chocolate_milk.model.BillModRq _billModRq;

    /**
     * Field _billQueryRq.
     */
    private org.chocolate_milk.model.BillQueryRq _billQueryRq;

    /**
     * Field _itemReceiptAddRq.
     */
    private org.chocolate_milk.model.ItemReceiptAddRq _itemReceiptAddRq;

    /**
     * Field _itemReceiptModRq.
     */
    private org.chocolate_milk.model.ItemReceiptModRq _itemReceiptModRq;

    /**
     * Field _itemReceiptQueryRq.
     */
    private org.chocolate_milk.model.ItemReceiptQueryRq _itemReceiptQueryRq;

    /**
     * Field _vendorCreditAddRq.
     */
    private org.chocolate_milk.model.VendorCreditAddRq _vendorCreditAddRq;

    /**
     * Field _vendorCreditModRq.
     */
    private org.chocolate_milk.model.VendorCreditModRq _vendorCreditModRq;

    /**
     * Field _vendorCreditQueryRq.
     */
    private org.chocolate_milk.model.VendorCreditQueryRq _vendorCreditQueryRq;

    /**
     * Field _billPaymentCheckAddRq.
     */
    private org.chocolate_milk.model.BillPaymentCheckAddRq _billPaymentCheckAddRq;

    /**
     * Field _billPaymentCheckModRq.
     */
    private org.chocolate_milk.model.BillPaymentCheckModRq _billPaymentCheckModRq;

    /**
     * Field _billPaymentCheckQueryRq.
     */
    private org.chocolate_milk.model.BillPaymentCheckQueryRq _billPaymentCheckQueryRq;

    /**
     * Field _billPaymentCreditCardAddRq.
     */
    private org.chocolate_milk.model.BillPaymentCreditCardAddRq _billPaymentCreditCardAddRq;

    /**
     * Field _billPaymentCreditCardQueryRq.
     */
    private org.chocolate_milk.model.BillPaymentCreditCardQueryRq _billPaymentCreditCardQueryRq;

    /**
     * Field _billToPayQueryRq.
     */
    private org.chocolate_milk.model.BillToPayQueryRq _billToPayQueryRq;

    /**
     * Field _salesTaxPaymentCheckQueryRq.
     */
    private org.chocolate_milk.model.SalesTaxPaymentCheckQueryRq _salesTaxPaymentCheckQueryRq;

    /**
     * Field _inventoryAdjustmentAddRq.
     */
    private org.chocolate_milk.model.InventoryAdjustmentAddRq _inventoryAdjustmentAddRq;

    /**
     * Field _inventoryAdjustmentQueryRq.
     */
    private org.chocolate_milk.model.InventoryAdjustmentQueryRq _inventoryAdjustmentQueryRq;

    /**
     * Field _timeTrackingAddRq.
     */
    private org.chocolate_milk.model.TimeTrackingAddRq _timeTrackingAddRq;

    /**
     * Field _timeTrackingModRq.
     */
    private org.chocolate_milk.model.TimeTrackingModRq _timeTrackingModRq;

    /**
     * Field _timeTrackingQueryRq.
     */
    private org.chocolate_milk.model.TimeTrackingQueryRq _timeTrackingQueryRq;

    /**
     * Field _checkAddRq.
     */
    private org.chocolate_milk.model.CheckAddRq _checkAddRq;

    /**
     * Field _checkModRq.
     */
    private org.chocolate_milk.model.CheckModRq _checkModRq;

    /**
     * Field _checkQueryRq.
     */
    private org.chocolate_milk.model.CheckQueryRq _checkQueryRq;

    /**
     * Field _creditCardChargeAddRq.
     */
    private org.chocolate_milk.model.CreditCardChargeAddRq _creditCardChargeAddRq;

    /**
     * Field _creditCardChargeModRq.
     */
    private org.chocolate_milk.model.CreditCardChargeModRq _creditCardChargeModRq;

    /**
     * Field _creditCardChargeQueryRq.
     */
    private org.chocolate_milk.model.CreditCardChargeQueryRq _creditCardChargeQueryRq;

    /**
     * Field _creditCardCreditAddRq.
     */
    private org.chocolate_milk.model.CreditCardCreditAddRq _creditCardCreditAddRq;

    /**
     * Field _creditCardCreditModRq.
     */
    private org.chocolate_milk.model.CreditCardCreditModRq _creditCardCreditModRq;

    /**
     * Field _creditCardCreditQueryRq.
     */
    private org.chocolate_milk.model.CreditCardCreditQueryRq _creditCardCreditQueryRq;

    /**
     * Field _journalEntryAddRq.
     */
    private org.chocolate_milk.model.JournalEntryAddRq _journalEntryAddRq;

    /**
     * Field _journalEntryModRq.
     */
    private org.chocolate_milk.model.JournalEntryModRq _journalEntryModRq;

    /**
     * Field _journalEntryQueryRq.
     */
    private org.chocolate_milk.model.JournalEntryQueryRq _journalEntryQueryRq;

    /**
     * Field _depositAddRq.
     */
    private org.chocolate_milk.model.DepositAddRq _depositAddRq;

    /**
     * Field _depositModRq.
     */
    private org.chocolate_milk.model.DepositModRq _depositModRq;

    /**
     * Field _depositQueryRq.
     */
    private org.chocolate_milk.model.DepositQueryRq _depositQueryRq;

    /**
     * Field _listDelRq.
     */
    private org.chocolate_milk.model.ListDelRq _listDelRq;

    /**
     * Field _listMergeRq.
     */
    private org.chocolate_milk.model.ListMergeRq _listMergeRq;

    /**
     * Field _listDeletedQueryRq.
     */
    private org.chocolate_milk.model.ListDeletedQueryRq _listDeletedQueryRq;

    /**
     * Field _txnDelRq.
     */
    private org.chocolate_milk.model.TxnDelRq _txnDelRq;

    /**
     * Field _txnVoidRq.
     */
    private org.chocolate_milk.model.TxnVoidRq _txnVoidRq;

    /**
     * Field _txnDeletedQueryRq.
     */
    private org.chocolate_milk.model.TxnDeletedQueryRq _txnDeletedQueryRq;

    /**
     * Field _clearedStatusModRq.
     */
    private org.chocolate_milk.model.ClearedStatusModRq _clearedStatusModRq;

    /**
     * Field _listDisplayAddRq.
     */
    private org.chocolate_milk.model.ListDisplayAddRq _listDisplayAddRq;

    /**
     * Field _listDisplayModRq.
     */
    private org.chocolate_milk.model.ListDisplayModRq _listDisplayModRq;

    /**
     * Field _txnDisplayAddRq.
     */
    private org.chocolate_milk.model.TxnDisplayAddRq _txnDisplayAddRq;

    /**
     * Field _txnDisplayModRq.
     */
    private org.chocolate_milk.model.TxnDisplayModRq _txnDisplayModRq;

    /**
     * Field _dataEventRecoveryInfoDelRq.
     */
    private org.chocolate_milk.model.DataEventRecoveryInfoDelRq _dataEventRecoveryInfoDelRq;

    /**
     * Field _dataEventRecoveryInfoQueryRq.
     */
    private org.chocolate_milk.model.DataEventRecoveryInfoQueryRq _dataEventRecoveryInfoQueryRq;

    /**
     * Field _transactionQueryRq.
     */
    private org.chocolate_milk.model.TransactionQueryRq _transactionQueryRq;

    /**
     * Field _buildAssemblyAddRq.
     */
    private org.chocolate_milk.model.BuildAssemblyAddRq _buildAssemblyAddRq;

    /**
     * Field _buildAssemblyModRq.
     */
    private org.chocolate_milk.model.BuildAssemblyModRq _buildAssemblyModRq;

    /**
     * Field _buildAssemblyQueryRq.
     */
    private org.chocolate_milk.model.BuildAssemblyQueryRq _buildAssemblyQueryRq;

    /**
     * Field _itemAssembliesCanBuildQueryRq.
     */
    private org.chocolate_milk.model.ItemAssembliesCanBuildQueryRq _itemAssembliesCanBuildQueryRq;

    /**
     * Field _ARRefundCreditCardAddRq.
     */
    private org.chocolate_milk.model.ARRefundCreditCardAddRq _ARRefundCreditCardAddRq;

    /**
     * Field _ARRefundCreditCardQueryRq.
     */
    private org.chocolate_milk.model.ARRefundCreditCardQueryRq _ARRefundCreditCardQueryRq;

    /**
     * Field _vehicleMileageAddRq.
     */
    private org.chocolate_milk.model.VehicleMileageAddRq _vehicleMileageAddRq;

    /**
     * Field _vehicleMileageQueryRq.
     */
    private org.chocolate_milk.model.VehicleMileageQueryRq _vehicleMileageQueryRq;

    /**
     * Field _generalSummaryReportQueryRq.
     */
    private org.chocolate_milk.model.GeneralSummaryReportQueryRq _generalSummaryReportQueryRq;

    /**
     * Field _jobReportQueryRq.
     */
    private org.chocolate_milk.model.JobReportQueryRq _jobReportQueryRq;

    /**
     * Field _timeReportQueryRq.
     */
    private org.chocolate_milk.model.TimeReportQueryRq _timeReportQueryRq;

    /**
     * Field _agingReportQueryRq.
     */
    private org.chocolate_milk.model.AgingReportQueryRq _agingReportQueryRq;

    /**
     * Field _budgetSummaryReportQueryRq.
     */
    private org.chocolate_milk.model.BudgetSummaryReportQueryRq _budgetSummaryReportQueryRq;

    /**
     * Field _generalDetailReportQueryRq.
     */
    private org.chocolate_milk.model.GeneralDetailReportQueryRq _generalDetailReportQueryRq;

    /**
     * Field _customDetailReportQueryRq.
     */
    private org.chocolate_milk.model.CustomDetailReportQueryRq _customDetailReportQueryRq;

    /**
     * Field _customSummaryReportQueryRq.
     */
    private org.chocolate_milk.model.CustomSummaryReportQueryRq _customSummaryReportQueryRq;

    /**
     * Field _payrollDetailReportQueryRq.
     */
    private org.chocolate_milk.model.PayrollDetailReportQueryRq _payrollDetailReportQueryRq;

    /**
     * Field _payrollSummaryReportQueryRq.
     */
    private org.chocolate_milk.model.PayrollSummaryReportQueryRq _payrollSummaryReportQueryRq;

    /**
     * Field _dataExtDefAddRq.
     */
    private org.chocolate_milk.model.DataExtDefAddRq _dataExtDefAddRq;

    /**
     * Field _dataExtDefModRq.
     */
    private org.chocolate_milk.model.DataExtDefModRq _dataExtDefModRq;

    /**
     * Field _dataExtDefDelRq.
     */
    private org.chocolate_milk.model.DataExtDefDelRq _dataExtDefDelRq;

    /**
     * Field _dataExtDefQueryRq.
     */
    private org.chocolate_milk.model.DataExtDefQueryRq _dataExtDefQueryRq;

    /**
     * Field _dataExtAddRq.
     */
    private org.chocolate_milk.model.DataExtAddRq _dataExtAddRq;

    /**
     * Field _dataExtModRq.
     */
    private org.chocolate_milk.model.DataExtModRq _dataExtModRq;

    /**
     * Field _dataExtDelRq.
     */
    private org.chocolate_milk.model.DataExtDelRq _dataExtDelRq;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLMsgsRqItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ARRefundCreditCardAddRq'.
     * 
     * @return the value of field 'ARRefundCreditCardAddRq'.
     */
    public org.chocolate_milk.model.ARRefundCreditCardAddRq getARRefundCreditCardAddRq(
    ) {
        return this._ARRefundCreditCardAddRq;
    }

    /**
     * Returns the value of field 'ARRefundCreditCardQueryRq'.
     * 
     * @return the value of field 'ARRefundCreditCardQueryRq'.
     */
    public org.chocolate_milk.model.ARRefundCreditCardQueryRq getARRefundCreditCardQueryRq(
    ) {
        return this._ARRefundCreditCardQueryRq;
    }

    /**
     * Returns the value of field 'accountAddRq'.
     * 
     * @return the value of field 'AccountAddRq'.
     */
    public org.chocolate_milk.model.AccountAddRq getAccountAddRq(
    ) {
        return this._accountAddRq;
    }

    /**
     * Returns the value of field 'accountModRq'.
     * 
     * @return the value of field 'AccountModRq'.
     */
    public org.chocolate_milk.model.AccountModRq getAccountModRq(
    ) {
        return this._accountModRq;
    }

    /**
     * Returns the value of field 'accountQueryRq'.
     * 
     * @return the value of field 'AccountQueryRq'.
     */
    public org.chocolate_milk.model.AccountQueryRq getAccountQueryRq(
    ) {
        return this._accountQueryRq;
    }

    /**
     * Returns the value of field 'accountTaxLineInfoQueryRq'.
     * 
     * @return the value of field 'AccountTaxLineInfoQueryRq'.
     */
    public org.chocolate_milk.model.AccountTaxLineInfoQueryRq getAccountTaxLineInfoQueryRq(
    ) {
        return this._accountTaxLineInfoQueryRq;
    }

    /**
     * Returns the value of field 'agingReportQueryRq'.
     * 
     * @return the value of field 'AgingReportQueryRq'.
     */
    public org.chocolate_milk.model.AgingReportQueryRq getAgingReportQueryRq(
    ) {
        return this._agingReportQueryRq;
    }

    /**
     * Returns the value of field 'billAddRq'.
     * 
     * @return the value of field 'BillAddRq'.
     */
    public org.chocolate_milk.model.BillAddRq getBillAddRq(
    ) {
        return this._billAddRq;
    }

    /**
     * Returns the value of field 'billModRq'.
     * 
     * @return the value of field 'BillModRq'.
     */
    public org.chocolate_milk.model.BillModRq getBillModRq(
    ) {
        return this._billModRq;
    }

    /**
     * Returns the value of field 'billPaymentCheckAddRq'.
     * 
     * @return the value of field 'BillPaymentCheckAddRq'.
     */
    public org.chocolate_milk.model.BillPaymentCheckAddRq getBillPaymentCheckAddRq(
    ) {
        return this._billPaymentCheckAddRq;
    }

    /**
     * Returns the value of field 'billPaymentCheckModRq'.
     * 
     * @return the value of field 'BillPaymentCheckModRq'.
     */
    public org.chocolate_milk.model.BillPaymentCheckModRq getBillPaymentCheckModRq(
    ) {
        return this._billPaymentCheckModRq;
    }

    /**
     * Returns the value of field 'billPaymentCheckQueryRq'.
     * 
     * @return the value of field 'BillPaymentCheckQueryRq'.
     */
    public org.chocolate_milk.model.BillPaymentCheckQueryRq getBillPaymentCheckQueryRq(
    ) {
        return this._billPaymentCheckQueryRq;
    }

    /**
     * Returns the value of field 'billPaymentCreditCardAddRq'.
     * 
     * @return the value of field 'BillPaymentCreditCardAddRq'.
     */
    public org.chocolate_milk.model.BillPaymentCreditCardAddRq getBillPaymentCreditCardAddRq(
    ) {
        return this._billPaymentCreditCardAddRq;
    }

    /**
     * Returns the value of field 'billPaymentCreditCardQueryRq'.
     * 
     * @return the value of field 'BillPaymentCreditCardQueryRq'.
     */
    public org.chocolate_milk.model.BillPaymentCreditCardQueryRq getBillPaymentCreditCardQueryRq(
    ) {
        return this._billPaymentCreditCardQueryRq;
    }

    /**
     * Returns the value of field 'billQueryRq'.
     * 
     * @return the value of field 'BillQueryRq'.
     */
    public org.chocolate_milk.model.BillQueryRq getBillQueryRq(
    ) {
        return this._billQueryRq;
    }

    /**
     * Returns the value of field 'billToPayQueryRq'.
     * 
     * @return the value of field 'BillToPayQueryRq'.
     */
    public org.chocolate_milk.model.BillToPayQueryRq getBillToPayQueryRq(
    ) {
        return this._billToPayQueryRq;
    }

    /**
     * Returns the value of field 'billingRateAddRq'.
     * 
     * @return the value of field 'BillingRateAddRq'.
     */
    public org.chocolate_milk.model.BillingRateAddRq getBillingRateAddRq(
    ) {
        return this._billingRateAddRq;
    }

    /**
     * Returns the value of field 'billingRateQueryRq'.
     * 
     * @return the value of field 'BillingRateQueryRq'.
     */
    public org.chocolate_milk.model.BillingRateQueryRq getBillingRateQueryRq(
    ) {
        return this._billingRateQueryRq;
    }

    /**
     * Returns the value of field 'budgetSummaryReportQueryRq'.
     * 
     * @return the value of field 'BudgetSummaryReportQueryRq'.
     */
    public org.chocolate_milk.model.BudgetSummaryReportQueryRq getBudgetSummaryReportQueryRq(
    ) {
        return this._budgetSummaryReportQueryRq;
    }

    /**
     * Returns the value of field 'buildAssemblyAddRq'.
     * 
     * @return the value of field 'BuildAssemblyAddRq'.
     */
    public org.chocolate_milk.model.BuildAssemblyAddRq getBuildAssemblyAddRq(
    ) {
        return this._buildAssemblyAddRq;
    }

    /**
     * Returns the value of field 'buildAssemblyModRq'.
     * 
     * @return the value of field 'BuildAssemblyModRq'.
     */
    public org.chocolate_milk.model.BuildAssemblyModRq getBuildAssemblyModRq(
    ) {
        return this._buildAssemblyModRq;
    }

    /**
     * Returns the value of field 'buildAssemblyQueryRq'.
     * 
     * @return the value of field 'BuildAssemblyQueryRq'.
     */
    public org.chocolate_milk.model.BuildAssemblyQueryRq getBuildAssemblyQueryRq(
    ) {
        return this._buildAssemblyQueryRq;
    }

    /**
     * Returns the value of field 'chargeAddRq'.
     * 
     * @return the value of field 'ChargeAddRq'.
     */
    public org.chocolate_milk.model.ChargeAddRq getChargeAddRq(
    ) {
        return this._chargeAddRq;
    }

    /**
     * Returns the value of field 'chargeModRq'.
     * 
     * @return the value of field 'ChargeModRq'.
     */
    public org.chocolate_milk.model.ChargeModRq getChargeModRq(
    ) {
        return this._chargeModRq;
    }

    /**
     * Returns the value of field 'chargeQueryRq'.
     * 
     * @return the value of field 'ChargeQueryRq'.
     */
    public org.chocolate_milk.model.ChargeQueryRq getChargeQueryRq(
    ) {
        return this._chargeQueryRq;
    }

    /**
     * Returns the value of field 'checkAddRq'.
     * 
     * @return the value of field 'CheckAddRq'.
     */
    public org.chocolate_milk.model.CheckAddRq getCheckAddRq(
    ) {
        return this._checkAddRq;
    }

    /**
     * Returns the value of field 'checkModRq'.
     * 
     * @return the value of field 'CheckModRq'.
     */
    public org.chocolate_milk.model.CheckModRq getCheckModRq(
    ) {
        return this._checkModRq;
    }

    /**
     * Returns the value of field 'checkQueryRq'.
     * 
     * @return the value of field 'CheckQueryRq'.
     */
    public org.chocolate_milk.model.CheckQueryRq getCheckQueryRq(
    ) {
        return this._checkQueryRq;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'classAddRq'.
     * 
     * @return the value of field 'ClassAddRq'.
     */
    public org.chocolate_milk.model.ClassAddRq getClassAddRq(
    ) {
        return this._classAddRq;
    }

    /**
     * Returns the value of field 'classModRq'.
     * 
     * @return the value of field 'ClassModRq'.
     */
    public org.chocolate_milk.model.ClassModRq getClassModRq(
    ) {
        return this._classModRq;
    }

    /**
     * Returns the value of field 'classQueryRq'.
     * 
     * @return the value of field 'ClassQueryRq'.
     */
    public org.chocolate_milk.model.ClassQueryRq getClassQueryRq(
    ) {
        return this._classQueryRq;
    }

    /**
     * Returns the value of field 'clearedStatusModRq'.
     * 
     * @return the value of field 'ClearedStatusModRq'.
     */
    public org.chocolate_milk.model.ClearedStatusModRq getClearedStatusModRq(
    ) {
        return this._clearedStatusModRq;
    }

    /**
     * Returns the value of field 'companyActivityQueryRq'.
     * 
     * @return the value of field 'CompanyActivityQueryRq'.
     */
    public org.chocolate_milk.model.CompanyActivityQueryRq getCompanyActivityQueryRq(
    ) {
        return this._companyActivityQueryRq;
    }

    /**
     * Returns the value of field 'companyQueryRq'.
     * 
     * @return the value of field 'CompanyQueryRq'.
     */
    public org.chocolate_milk.model.CompanyQueryRq getCompanyQueryRq(
    ) {
        return this._companyQueryRq;
    }

    /**
     * Returns the value of field 'creditCardChargeAddRq'.
     * 
     * @return the value of field 'CreditCardChargeAddRq'.
     */
    public org.chocolate_milk.model.CreditCardChargeAddRq getCreditCardChargeAddRq(
    ) {
        return this._creditCardChargeAddRq;
    }

    /**
     * Returns the value of field 'creditCardChargeModRq'.
     * 
     * @return the value of field 'CreditCardChargeModRq'.
     */
    public org.chocolate_milk.model.CreditCardChargeModRq getCreditCardChargeModRq(
    ) {
        return this._creditCardChargeModRq;
    }

    /**
     * Returns the value of field 'creditCardChargeQueryRq'.
     * 
     * @return the value of field 'CreditCardChargeQueryRq'.
     */
    public org.chocolate_milk.model.CreditCardChargeQueryRq getCreditCardChargeQueryRq(
    ) {
        return this._creditCardChargeQueryRq;
    }

    /**
     * Returns the value of field 'creditCardCreditAddRq'.
     * 
     * @return the value of field 'CreditCardCreditAddRq'.
     */
    public org.chocolate_milk.model.CreditCardCreditAddRq getCreditCardCreditAddRq(
    ) {
        return this._creditCardCreditAddRq;
    }

    /**
     * Returns the value of field 'creditCardCreditModRq'.
     * 
     * @return the value of field 'CreditCardCreditModRq'.
     */
    public org.chocolate_milk.model.CreditCardCreditModRq getCreditCardCreditModRq(
    ) {
        return this._creditCardCreditModRq;
    }

    /**
     * Returns the value of field 'creditCardCreditQueryRq'.
     * 
     * @return the value of field 'CreditCardCreditQueryRq'.
     */
    public org.chocolate_milk.model.CreditCardCreditQueryRq getCreditCardCreditQueryRq(
    ) {
        return this._creditCardCreditQueryRq;
    }

    /**
     * Returns the value of field 'creditMemoAddRq'.
     * 
     * @return the value of field 'CreditMemoAddRq'.
     */
    public org.chocolate_milk.model.CreditMemoAddRq getCreditMemoAddRq(
    ) {
        return this._creditMemoAddRq;
    }

    /**
     * Returns the value of field 'creditMemoModRq'.
     * 
     * @return the value of field 'CreditMemoModRq'.
     */
    public org.chocolate_milk.model.CreditMemoModRq getCreditMemoModRq(
    ) {
        return this._creditMemoModRq;
    }

    /**
     * Returns the value of field 'creditMemoQueryRq'.
     * 
     * @return the value of field 'CreditMemoQueryRq'.
     */
    public org.chocolate_milk.model.CreditMemoQueryRq getCreditMemoQueryRq(
    ) {
        return this._creditMemoQueryRq;
    }

    /**
     * Returns the value of field 'currencyAddRq'.
     * 
     * @return the value of field 'CurrencyAddRq'.
     */
    public org.chocolate_milk.model.CurrencyAddRq getCurrencyAddRq(
    ) {
        return this._currencyAddRq;
    }

    /**
     * Returns the value of field 'currencyModRq'.
     * 
     * @return the value of field 'CurrencyModRq'.
     */
    public org.chocolate_milk.model.CurrencyModRq getCurrencyModRq(
    ) {
        return this._currencyModRq;
    }

    /**
     * Returns the value of field 'currencyQueryRq'.
     * 
     * @return the value of field 'CurrencyQueryRq'.
     */
    public org.chocolate_milk.model.CurrencyQueryRq getCurrencyQueryRq(
    ) {
        return this._currencyQueryRq;
    }

    /**
     * Returns the value of field 'customDetailReportQueryRq'.
     * 
     * @return the value of field 'CustomDetailReportQueryRq'.
     */
    public org.chocolate_milk.model.CustomDetailReportQueryRq getCustomDetailReportQueryRq(
    ) {
        return this._customDetailReportQueryRq;
    }

    /**
     * Returns the value of field 'customSummaryReportQueryRq'.
     * 
     * @return the value of field 'CustomSummaryReportQueryRq'.
     */
    public org.chocolate_milk.model.CustomSummaryReportQueryRq getCustomSummaryReportQueryRq(
    ) {
        return this._customSummaryReportQueryRq;
    }

    /**
     * Returns the value of field 'customerAddRq'.
     * 
     * @return the value of field 'CustomerAddRq'.
     */
    public org.chocolate_milk.model.CustomerAddRq getCustomerAddRq(
    ) {
        return this._customerAddRq;
    }

    /**
     * Returns the value of field 'customerModRq'.
     * 
     * @return the value of field 'CustomerModRq'.
     */
    public org.chocolate_milk.model.CustomerModRq getCustomerModRq(
    ) {
        return this._customerModRq;
    }

    /**
     * Returns the value of field 'customerMsgAddRq'.
     * 
     * @return the value of field 'CustomerMsgAddRq'.
     */
    public org.chocolate_milk.model.CustomerMsgAddRq getCustomerMsgAddRq(
    ) {
        return this._customerMsgAddRq;
    }

    /**
     * Returns the value of field 'customerMsgQueryRq'.
     * 
     * @return the value of field 'CustomerMsgQueryRq'.
     */
    public org.chocolate_milk.model.CustomerMsgQueryRq getCustomerMsgQueryRq(
    ) {
        return this._customerMsgQueryRq;
    }

    /**
     * Returns the value of field 'customerQueryRq'.
     * 
     * @return the value of field 'CustomerQueryRq'.
     */
    public org.chocolate_milk.model.CustomerQueryRq getCustomerQueryRq(
    ) {
        return this._customerQueryRq;
    }

    /**
     * Returns the value of field 'customerTypeAddRq'.
     * 
     * @return the value of field 'CustomerTypeAddRq'.
     */
    public org.chocolate_milk.model.CustomerTypeAddRq getCustomerTypeAddRq(
    ) {
        return this._customerTypeAddRq;
    }

    /**
     * Returns the value of field 'customerTypeQueryRq'.
     * 
     * @return the value of field 'CustomerTypeQueryRq'.
     */
    public org.chocolate_milk.model.CustomerTypeQueryRq getCustomerTypeQueryRq(
    ) {
        return this._customerTypeQueryRq;
    }

    /**
     * Returns the value of field 'dataEventRecoveryInfoDelRq'.
     * 
     * @return the value of field 'DataEventRecoveryInfoDelRq'.
     */
    public org.chocolate_milk.model.DataEventRecoveryInfoDelRq getDataEventRecoveryInfoDelRq(
    ) {
        return this._dataEventRecoveryInfoDelRq;
    }

    /**
     * Returns the value of field 'dataEventRecoveryInfoQueryRq'.
     * 
     * @return the value of field 'DataEventRecoveryInfoQueryRq'.
     */
    public org.chocolate_milk.model.DataEventRecoveryInfoQueryRq getDataEventRecoveryInfoQueryRq(
    ) {
        return this._dataEventRecoveryInfoQueryRq;
    }

    /**
     * Returns the value of field 'dataExtAddRq'.
     * 
     * @return the value of field 'DataExtAddRq'.
     */
    public org.chocolate_milk.model.DataExtAddRq getDataExtAddRq(
    ) {
        return this._dataExtAddRq;
    }

    /**
     * Returns the value of field 'dataExtDefAddRq'.
     * 
     * @return the value of field 'DataExtDefAddRq'.
     */
    public org.chocolate_milk.model.DataExtDefAddRq getDataExtDefAddRq(
    ) {
        return this._dataExtDefAddRq;
    }

    /**
     * Returns the value of field 'dataExtDefDelRq'.
     * 
     * @return the value of field 'DataExtDefDelRq'.
     */
    public org.chocolate_milk.model.DataExtDefDelRq getDataExtDefDelRq(
    ) {
        return this._dataExtDefDelRq;
    }

    /**
     * Returns the value of field 'dataExtDefModRq'.
     * 
     * @return the value of field 'DataExtDefModRq'.
     */
    public org.chocolate_milk.model.DataExtDefModRq getDataExtDefModRq(
    ) {
        return this._dataExtDefModRq;
    }

    /**
     * Returns the value of field 'dataExtDefQueryRq'.
     * 
     * @return the value of field 'DataExtDefQueryRq'.
     */
    public org.chocolate_milk.model.DataExtDefQueryRq getDataExtDefQueryRq(
    ) {
        return this._dataExtDefQueryRq;
    }

    /**
     * Returns the value of field 'dataExtDelRq'.
     * 
     * @return the value of field 'DataExtDelRq'.
     */
    public org.chocolate_milk.model.DataExtDelRq getDataExtDelRq(
    ) {
        return this._dataExtDelRq;
    }

    /**
     * Returns the value of field 'dataExtModRq'.
     * 
     * @return the value of field 'DataExtModRq'.
     */
    public org.chocolate_milk.model.DataExtModRq getDataExtModRq(
    ) {
        return this._dataExtModRq;
    }

    /**
     * Returns the value of field 'dateDrivenTermsAddRq'.
     * 
     * @return the value of field 'DateDrivenTermsAddRq'.
     */
    public org.chocolate_milk.model.DateDrivenTermsAddRq getDateDrivenTermsAddRq(
    ) {
        return this._dateDrivenTermsAddRq;
    }

    /**
     * Returns the value of field 'dateDrivenTermsQueryRq'.
     * 
     * @return the value of field 'DateDrivenTermsQueryRq'.
     */
    public org.chocolate_milk.model.DateDrivenTermsQueryRq getDateDrivenTermsQueryRq(
    ) {
        return this._dateDrivenTermsQueryRq;
    }

    /**
     * Returns the value of field 'depositAddRq'.
     * 
     * @return the value of field 'DepositAddRq'.
     */
    public org.chocolate_milk.model.DepositAddRq getDepositAddRq(
    ) {
        return this._depositAddRq;
    }

    /**
     * Returns the value of field 'depositModRq'.
     * 
     * @return the value of field 'DepositModRq'.
     */
    public org.chocolate_milk.model.DepositModRq getDepositModRq(
    ) {
        return this._depositModRq;
    }

    /**
     * Returns the value of field 'depositQueryRq'.
     * 
     * @return the value of field 'DepositQueryRq'.
     */
    public org.chocolate_milk.model.DepositQueryRq getDepositQueryRq(
    ) {
        return this._depositQueryRq;
    }

    /**
     * Returns the value of field 'employeeAddRq'.
     * 
     * @return the value of field 'EmployeeAddRq'.
     */
    public org.chocolate_milk.model.EmployeeAddRq getEmployeeAddRq(
    ) {
        return this._employeeAddRq;
    }

    /**
     * Returns the value of field 'employeeModRq'.
     * 
     * @return the value of field 'EmployeeModRq'.
     */
    public org.chocolate_milk.model.EmployeeModRq getEmployeeModRq(
    ) {
        return this._employeeModRq;
    }

    /**
     * Returns the value of field 'employeeQueryRq'.
     * 
     * @return the value of field 'EmployeeQueryRq'.
     */
    public org.chocolate_milk.model.EmployeeQueryRq getEmployeeQueryRq(
    ) {
        return this._employeeQueryRq;
    }

    /**
     * Returns the value of field 'entityQueryRq'.
     * 
     * @return the value of field 'EntityQueryRq'.
     */
    public org.chocolate_milk.model.EntityQueryRq getEntityQueryRq(
    ) {
        return this._entityQueryRq;
    }

    /**
     * Returns the value of field 'estimateAddRq'.
     * 
     * @return the value of field 'EstimateAddRq'.
     */
    public org.chocolate_milk.model.EstimateAddRq getEstimateAddRq(
    ) {
        return this._estimateAddRq;
    }

    /**
     * Returns the value of field 'estimateModRq'.
     * 
     * @return the value of field 'EstimateModRq'.
     */
    public org.chocolate_milk.model.EstimateModRq getEstimateModRq(
    ) {
        return this._estimateModRq;
    }

    /**
     * Returns the value of field 'estimateQueryRq'.
     * 
     * @return the value of field 'EstimateQueryRq'.
     */
    public org.chocolate_milk.model.EstimateQueryRq getEstimateQueryRq(
    ) {
        return this._estimateQueryRq;
    }

    /**
     * Returns the value of field
     * 'form1099CategoryAccountMappingModRq'.
     * 
     * @return the value of field
     * 'Form1099CategoryAccountMappingModRq'.
     */
    public org.chocolate_milk.model.Form1099CategoryAccountMappingModRq getForm1099CategoryAccountMappingModRq(
    ) {
        return this._form1099CategoryAccountMappingModRq;
    }

    /**
     * Returns the value of field
     * 'form1099CategoryAccountMappingQueryRq'.
     * 
     * @return the value of field
     * 'Form1099CategoryAccountMappingQueryRq'.
     */
    public org.chocolate_milk.model.Form1099CategoryAccountMappingQueryRq getForm1099CategoryAccountMappingQueryRq(
    ) {
        return this._form1099CategoryAccountMappingQueryRq;
    }

    /**
     * Returns the value of field 'generalDetailReportQueryRq'.
     * 
     * @return the value of field 'GeneralDetailReportQueryRq'.
     */
    public org.chocolate_milk.model.GeneralDetailReportQueryRq getGeneralDetailReportQueryRq(
    ) {
        return this._generalDetailReportQueryRq;
    }

    /**
     * Returns the value of field 'generalSummaryReportQueryRq'.
     * 
     * @return the value of field 'GeneralSummaryReportQueryRq'.
     */
    public org.chocolate_milk.model.GeneralSummaryReportQueryRq getGeneralSummaryReportQueryRq(
    ) {
        return this._generalSummaryReportQueryRq;
    }

    /**
     * Returns the value of field 'hostQueryRq'.
     * 
     * @return the value of field 'HostQueryRq'.
     */
    public org.chocolate_milk.model.HostQueryRq getHostQueryRq(
    ) {
        return this._hostQueryRq;
    }

    /**
     * Returns the value of field 'inventoryAdjustmentAddRq'.
     * 
     * @return the value of field 'InventoryAdjustmentAddRq'.
     */
    public org.chocolate_milk.model.InventoryAdjustmentAddRq getInventoryAdjustmentAddRq(
    ) {
        return this._inventoryAdjustmentAddRq;
    }

    /**
     * Returns the value of field 'inventoryAdjustmentQueryRq'.
     * 
     * @return the value of field 'InventoryAdjustmentQueryRq'.
     */
    public org.chocolate_milk.model.InventoryAdjustmentQueryRq getInventoryAdjustmentQueryRq(
    ) {
        return this._inventoryAdjustmentQueryRq;
    }

    /**
     * Returns the value of field 'invoiceAddRq'.
     * 
     * @return the value of field 'InvoiceAddRq'.
     */
    public org.chocolate_milk.model.InvoiceAddRq getInvoiceAddRq(
    ) {
        return this._invoiceAddRq;
    }

    /**
     * Returns the value of field 'invoiceModRq'.
     * 
     * @return the value of field 'InvoiceModRq'.
     */
    public org.chocolate_milk.model.InvoiceModRq getInvoiceModRq(
    ) {
        return this._invoiceModRq;
    }

    /**
     * Returns the value of field 'invoiceQueryRq'.
     * 
     * @return the value of field 'InvoiceQueryRq'.
     */
    public org.chocolate_milk.model.InvoiceQueryRq getInvoiceQueryRq(
    ) {
        return this._invoiceQueryRq;
    }

    /**
     * Returns the value of field 'itemAssembliesCanBuildQueryRq'.
     * 
     * @return the value of field 'ItemAssembliesCanBuildQueryRq'.
     */
    public org.chocolate_milk.model.ItemAssembliesCanBuildQueryRq getItemAssembliesCanBuildQueryRq(
    ) {
        return this._itemAssembliesCanBuildQueryRq;
    }

    /**
     * Returns the value of field 'itemDiscountAddRq'.
     * 
     * @return the value of field 'ItemDiscountAddRq'.
     */
    public org.chocolate_milk.model.ItemDiscountAddRq getItemDiscountAddRq(
    ) {
        return this._itemDiscountAddRq;
    }

    /**
     * Returns the value of field 'itemDiscountModRq'.
     * 
     * @return the value of field 'ItemDiscountModRq'.
     */
    public org.chocolate_milk.model.ItemDiscountModRq getItemDiscountModRq(
    ) {
        return this._itemDiscountModRq;
    }

    /**
     * Returns the value of field 'itemDiscountQueryRq'.
     * 
     * @return the value of field 'ItemDiscountQueryRq'.
     */
    public org.chocolate_milk.model.ItemDiscountQueryRq getItemDiscountQueryRq(
    ) {
        return this._itemDiscountQueryRq;
    }

    /**
     * Returns the value of field 'itemFixedAssetAddRq'.
     * 
     * @return the value of field 'ItemFixedAssetAddRq'.
     */
    public org.chocolate_milk.model.ItemFixedAssetAddRq getItemFixedAssetAddRq(
    ) {
        return this._itemFixedAssetAddRq;
    }

    /**
     * Returns the value of field 'itemFixedAssetModRq'.
     * 
     * @return the value of field 'ItemFixedAssetModRq'.
     */
    public org.chocolate_milk.model.ItemFixedAssetModRq getItemFixedAssetModRq(
    ) {
        return this._itemFixedAssetModRq;
    }

    /**
     * Returns the value of field 'itemFixedAssetQueryRq'.
     * 
     * @return the value of field 'ItemFixedAssetQueryRq'.
     */
    public org.chocolate_milk.model.ItemFixedAssetQueryRq getItemFixedAssetQueryRq(
    ) {
        return this._itemFixedAssetQueryRq;
    }

    /**
     * Returns the value of field 'itemGroupAddRq'.
     * 
     * @return the value of field 'ItemGroupAddRq'.
     */
    public org.chocolate_milk.model.ItemGroupAddRq getItemGroupAddRq(
    ) {
        return this._itemGroupAddRq;
    }

    /**
     * Returns the value of field 'itemGroupModRq'.
     * 
     * @return the value of field 'ItemGroupModRq'.
     */
    public org.chocolate_milk.model.ItemGroupModRq getItemGroupModRq(
    ) {
        return this._itemGroupModRq;
    }

    /**
     * Returns the value of field 'itemGroupQueryRq'.
     * 
     * @return the value of field 'ItemGroupQueryRq'.
     */
    public org.chocolate_milk.model.ItemGroupQueryRq getItemGroupQueryRq(
    ) {
        return this._itemGroupQueryRq;
    }

    /**
     * Returns the value of field 'itemInventoryAddRq'.
     * 
     * @return the value of field 'ItemInventoryAddRq'.
     */
    public org.chocolate_milk.model.ItemInventoryAddRq getItemInventoryAddRq(
    ) {
        return this._itemInventoryAddRq;
    }

    /**
     * Returns the value of field 'itemInventoryAssemblyAddRq'.
     * 
     * @return the value of field 'ItemInventoryAssemblyAddRq'.
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyAddRq getItemInventoryAssemblyAddRq(
    ) {
        return this._itemInventoryAssemblyAddRq;
    }

    /**
     * Returns the value of field 'itemInventoryAssemblyModRq'.
     * 
     * @return the value of field 'ItemInventoryAssemblyModRq'.
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyModRq getItemInventoryAssemblyModRq(
    ) {
        return this._itemInventoryAssemblyModRq;
    }

    /**
     * Returns the value of field 'itemInventoryAssemblyQueryRq'.
     * 
     * @return the value of field 'ItemInventoryAssemblyQueryRq'.
     */
    public org.chocolate_milk.model.ItemInventoryAssemblyQueryRq getItemInventoryAssemblyQueryRq(
    ) {
        return this._itemInventoryAssemblyQueryRq;
    }

    /**
     * Returns the value of field 'itemInventoryModRq'.
     * 
     * @return the value of field 'ItemInventoryModRq'.
     */
    public org.chocolate_milk.model.ItemInventoryModRq getItemInventoryModRq(
    ) {
        return this._itemInventoryModRq;
    }

    /**
     * Returns the value of field 'itemInventoryQueryRq'.
     * 
     * @return the value of field 'ItemInventoryQueryRq'.
     */
    public org.chocolate_milk.model.ItemInventoryQueryRq getItemInventoryQueryRq(
    ) {
        return this._itemInventoryQueryRq;
    }

    /**
     * Returns the value of field 'itemNonInventoryAddRq'.
     * 
     * @return the value of field 'ItemNonInventoryAddRq'.
     */
    public org.chocolate_milk.model.ItemNonInventoryAddRq getItemNonInventoryAddRq(
    ) {
        return this._itemNonInventoryAddRq;
    }

    /**
     * Returns the value of field 'itemNonInventoryModRq'.
     * 
     * @return the value of field 'ItemNonInventoryModRq'.
     */
    public org.chocolate_milk.model.ItemNonInventoryModRq getItemNonInventoryModRq(
    ) {
        return this._itemNonInventoryModRq;
    }

    /**
     * Returns the value of field 'itemNonInventoryQueryRq'.
     * 
     * @return the value of field 'ItemNonInventoryQueryRq'.
     */
    public org.chocolate_milk.model.ItemNonInventoryQueryRq getItemNonInventoryQueryRq(
    ) {
        return this._itemNonInventoryQueryRq;
    }

    /**
     * Returns the value of field 'itemOtherChargeAddRq'.
     * 
     * @return the value of field 'ItemOtherChargeAddRq'.
     */
    public org.chocolate_milk.model.ItemOtherChargeAddRq getItemOtherChargeAddRq(
    ) {
        return this._itemOtherChargeAddRq;
    }

    /**
     * Returns the value of field 'itemOtherChargeModRq'.
     * 
     * @return the value of field 'ItemOtherChargeModRq'.
     */
    public org.chocolate_milk.model.ItemOtherChargeModRq getItemOtherChargeModRq(
    ) {
        return this._itemOtherChargeModRq;
    }

    /**
     * Returns the value of field 'itemOtherChargeQueryRq'.
     * 
     * @return the value of field 'ItemOtherChargeQueryRq'.
     */
    public org.chocolate_milk.model.ItemOtherChargeQueryRq getItemOtherChargeQueryRq(
    ) {
        return this._itemOtherChargeQueryRq;
    }

    /**
     * Returns the value of field 'itemPaymentAddRq'.
     * 
     * @return the value of field 'ItemPaymentAddRq'.
     */
    public org.chocolate_milk.model.ItemPaymentAddRq getItemPaymentAddRq(
    ) {
        return this._itemPaymentAddRq;
    }

    /**
     * Returns the value of field 'itemPaymentModRq'.
     * 
     * @return the value of field 'ItemPaymentModRq'.
     */
    public org.chocolate_milk.model.ItemPaymentModRq getItemPaymentModRq(
    ) {
        return this._itemPaymentModRq;
    }

    /**
     * Returns the value of field 'itemPaymentQueryRq'.
     * 
     * @return the value of field 'ItemPaymentQueryRq'.
     */
    public org.chocolate_milk.model.ItemPaymentQueryRq getItemPaymentQueryRq(
    ) {
        return this._itemPaymentQueryRq;
    }

    /**
     * Returns the value of field 'itemQueryRq'.
     * 
     * @return the value of field 'ItemQueryRq'.
     */
    public org.chocolate_milk.model.ItemQueryRq getItemQueryRq(
    ) {
        return this._itemQueryRq;
    }

    /**
     * Returns the value of field 'itemReceiptAddRq'.
     * 
     * @return the value of field 'ItemReceiptAddRq'.
     */
    public org.chocolate_milk.model.ItemReceiptAddRq getItemReceiptAddRq(
    ) {
        return this._itemReceiptAddRq;
    }

    /**
     * Returns the value of field 'itemReceiptModRq'.
     * 
     * @return the value of field 'ItemReceiptModRq'.
     */
    public org.chocolate_milk.model.ItemReceiptModRq getItemReceiptModRq(
    ) {
        return this._itemReceiptModRq;
    }

    /**
     * Returns the value of field 'itemReceiptQueryRq'.
     * 
     * @return the value of field 'ItemReceiptQueryRq'.
     */
    public org.chocolate_milk.model.ItemReceiptQueryRq getItemReceiptQueryRq(
    ) {
        return this._itemReceiptQueryRq;
    }

    /**
     * Returns the value of field 'itemSalesTaxAddRq'.
     * 
     * @return the value of field 'ItemSalesTaxAddRq'.
     */
    public org.chocolate_milk.model.ItemSalesTaxAddRq getItemSalesTaxAddRq(
    ) {
        return this._itemSalesTaxAddRq;
    }

    /**
     * Returns the value of field 'itemSalesTaxGroupAddRq'.
     * 
     * @return the value of field 'ItemSalesTaxGroupAddRq'.
     */
    public org.chocolate_milk.model.ItemSalesTaxGroupAddRq getItemSalesTaxGroupAddRq(
    ) {
        return this._itemSalesTaxGroupAddRq;
    }

    /**
     * Returns the value of field 'itemSalesTaxGroupModRq'.
     * 
     * @return the value of field 'ItemSalesTaxGroupModRq'.
     */
    public org.chocolate_milk.model.ItemSalesTaxGroupModRq getItemSalesTaxGroupModRq(
    ) {
        return this._itemSalesTaxGroupModRq;
    }

    /**
     * Returns the value of field 'itemSalesTaxGroupQueryRq'.
     * 
     * @return the value of field 'ItemSalesTaxGroupQueryRq'.
     */
    public org.chocolate_milk.model.ItemSalesTaxGroupQueryRq getItemSalesTaxGroupQueryRq(
    ) {
        return this._itemSalesTaxGroupQueryRq;
    }

    /**
     * Returns the value of field 'itemSalesTaxModRq'.
     * 
     * @return the value of field 'ItemSalesTaxModRq'.
     */
    public org.chocolate_milk.model.ItemSalesTaxModRq getItemSalesTaxModRq(
    ) {
        return this._itemSalesTaxModRq;
    }

    /**
     * Returns the value of field 'itemSalesTaxQueryRq'.
     * 
     * @return the value of field 'ItemSalesTaxQueryRq'.
     */
    public org.chocolate_milk.model.ItemSalesTaxQueryRq getItemSalesTaxQueryRq(
    ) {
        return this._itemSalesTaxQueryRq;
    }

    /**
     * Returns the value of field 'itemServiceAddRq'.
     * 
     * @return the value of field 'ItemServiceAddRq'.
     */
    public org.chocolate_milk.model.ItemServiceAddRq getItemServiceAddRq(
    ) {
        return this._itemServiceAddRq;
    }

    /**
     * Returns the value of field 'itemServiceModRq'.
     * 
     * @return the value of field 'ItemServiceModRq'.
     */
    public org.chocolate_milk.model.ItemServiceModRq getItemServiceModRq(
    ) {
        return this._itemServiceModRq;
    }

    /**
     * Returns the value of field 'itemServiceQueryRq'.
     * 
     * @return the value of field 'ItemServiceQueryRq'.
     */
    public org.chocolate_milk.model.ItemServiceQueryRq getItemServiceQueryRq(
    ) {
        return this._itemServiceQueryRq;
    }

    /**
     * Returns the value of field 'itemSubtotalAddRq'.
     * 
     * @return the value of field 'ItemSubtotalAddRq'.
     */
    public org.chocolate_milk.model.ItemSubtotalAddRq getItemSubtotalAddRq(
    ) {
        return this._itemSubtotalAddRq;
    }

    /**
     * Returns the value of field 'itemSubtotalModRq'.
     * 
     * @return the value of field 'ItemSubtotalModRq'.
     */
    public org.chocolate_milk.model.ItemSubtotalModRq getItemSubtotalModRq(
    ) {
        return this._itemSubtotalModRq;
    }

    /**
     * Returns the value of field 'itemSubtotalQueryRq'.
     * 
     * @return the value of field 'ItemSubtotalQueryRq'.
     */
    public org.chocolate_milk.model.ItemSubtotalQueryRq getItemSubtotalQueryRq(
    ) {
        return this._itemSubtotalQueryRq;
    }

    /**
     * Returns the value of field 'jobReportQueryRq'.
     * 
     * @return the value of field 'JobReportQueryRq'.
     */
    public org.chocolate_milk.model.JobReportQueryRq getJobReportQueryRq(
    ) {
        return this._jobReportQueryRq;
    }

    /**
     * Returns the value of field 'jobTypeAddRq'.
     * 
     * @return the value of field 'JobTypeAddRq'.
     */
    public org.chocolate_milk.model.JobTypeAddRq getJobTypeAddRq(
    ) {
        return this._jobTypeAddRq;
    }

    /**
     * Returns the value of field 'jobTypeQueryRq'.
     * 
     * @return the value of field 'JobTypeQueryRq'.
     */
    public org.chocolate_milk.model.JobTypeQueryRq getJobTypeQueryRq(
    ) {
        return this._jobTypeQueryRq;
    }

    /**
     * Returns the value of field 'journalEntryAddRq'.
     * 
     * @return the value of field 'JournalEntryAddRq'.
     */
    public org.chocolate_milk.model.JournalEntryAddRq getJournalEntryAddRq(
    ) {
        return this._journalEntryAddRq;
    }

    /**
     * Returns the value of field 'journalEntryModRq'.
     * 
     * @return the value of field 'JournalEntryModRq'.
     */
    public org.chocolate_milk.model.JournalEntryModRq getJournalEntryModRq(
    ) {
        return this._journalEntryModRq;
    }

    /**
     * Returns the value of field 'journalEntryQueryRq'.
     * 
     * @return the value of field 'JournalEntryQueryRq'.
     */
    public org.chocolate_milk.model.JournalEntryQueryRq getJournalEntryQueryRq(
    ) {
        return this._journalEntryQueryRq;
    }

    /**
     * Returns the value of field 'listDelRq'.
     * 
     * @return the value of field 'ListDelRq'.
     */
    public org.chocolate_milk.model.ListDelRq getListDelRq(
    ) {
        return this._listDelRq;
    }

    /**
     * Returns the value of field 'listDeletedQueryRq'.
     * 
     * @return the value of field 'ListDeletedQueryRq'.
     */
    public org.chocolate_milk.model.ListDeletedQueryRq getListDeletedQueryRq(
    ) {
        return this._listDeletedQueryRq;
    }

    /**
     * Returns the value of field 'listDisplayAddRq'.
     * 
     * @return the value of field 'ListDisplayAddRq'.
     */
    public org.chocolate_milk.model.ListDisplayAddRq getListDisplayAddRq(
    ) {
        return this._listDisplayAddRq;
    }

    /**
     * Returns the value of field 'listDisplayModRq'.
     * 
     * @return the value of field 'ListDisplayModRq'.
     */
    public org.chocolate_milk.model.ListDisplayModRq getListDisplayModRq(
    ) {
        return this._listDisplayModRq;
    }

    /**
     * Returns the value of field 'listMergeRq'.
     * 
     * @return the value of field 'ListMergeRq'.
     */
    public org.chocolate_milk.model.ListMergeRq getListMergeRq(
    ) {
        return this._listMergeRq;
    }

    /**
     * Returns the value of field 'otherNameAddRq'.
     * 
     * @return the value of field 'OtherNameAddRq'.
     */
    public org.chocolate_milk.model.OtherNameAddRq getOtherNameAddRq(
    ) {
        return this._otherNameAddRq;
    }

    /**
     * Returns the value of field 'otherNameModRq'.
     * 
     * @return the value of field 'OtherNameModRq'.
     */
    public org.chocolate_milk.model.OtherNameModRq getOtherNameModRq(
    ) {
        return this._otherNameModRq;
    }

    /**
     * Returns the value of field 'otherNameQueryRq'.
     * 
     * @return the value of field 'OtherNameQueryRq'.
     */
    public org.chocolate_milk.model.OtherNameQueryRq getOtherNameQueryRq(
    ) {
        return this._otherNameQueryRq;
    }

    /**
     * Returns the value of field 'paymentMethodAddRq'.
     * 
     * @return the value of field 'PaymentMethodAddRq'.
     */
    public org.chocolate_milk.model.PaymentMethodAddRq getPaymentMethodAddRq(
    ) {
        return this._paymentMethodAddRq;
    }

    /**
     * Returns the value of field 'paymentMethodQueryRq'.
     * 
     * @return the value of field 'PaymentMethodQueryRq'.
     */
    public org.chocolate_milk.model.PaymentMethodQueryRq getPaymentMethodQueryRq(
    ) {
        return this._paymentMethodQueryRq;
    }

    /**
     * Returns the value of field 'payrollDetailReportQueryRq'.
     * 
     * @return the value of field 'PayrollDetailReportQueryRq'.
     */
    public org.chocolate_milk.model.PayrollDetailReportQueryRq getPayrollDetailReportQueryRq(
    ) {
        return this._payrollDetailReportQueryRq;
    }

    /**
     * Returns the value of field 'payrollItemNonWageQueryRq'.
     * 
     * @return the value of field 'PayrollItemNonWageQueryRq'.
     */
    public org.chocolate_milk.model.PayrollItemNonWageQueryRq getPayrollItemNonWageQueryRq(
    ) {
        return this._payrollItemNonWageQueryRq;
    }

    /**
     * Returns the value of field 'payrollItemWageAddRq'.
     * 
     * @return the value of field 'PayrollItemWageAddRq'.
     */
    public org.chocolate_milk.model.PayrollItemWageAddRq getPayrollItemWageAddRq(
    ) {
        return this._payrollItemWageAddRq;
    }

    /**
     * Returns the value of field 'payrollItemWageQueryRq'.
     * 
     * @return the value of field 'PayrollItemWageQueryRq'.
     */
    public org.chocolate_milk.model.PayrollItemWageQueryRq getPayrollItemWageQueryRq(
    ) {
        return this._payrollItemWageQueryRq;
    }

    /**
     * Returns the value of field 'payrollLastPeriodQueryRq'.
     * 
     * @return the value of field 'PayrollLastPeriodQueryRq'.
     */
    public org.chocolate_milk.model.PayrollLastPeriodQueryRq getPayrollLastPeriodQueryRq(
    ) {
        return this._payrollLastPeriodQueryRq;
    }

    /**
     * Returns the value of field 'payrollSummaryReportQueryRq'.
     * 
     * @return the value of field 'PayrollSummaryReportQueryRq'.
     */
    public org.chocolate_milk.model.PayrollSummaryReportQueryRq getPayrollSummaryReportQueryRq(
    ) {
        return this._payrollSummaryReportQueryRq;
    }

    /**
     * Returns the value of field 'preferencesQueryRq'.
     * 
     * @return the value of field 'PreferencesQueryRq'.
     */
    public org.chocolate_milk.model.PreferencesQueryRq getPreferencesQueryRq(
    ) {
        return this._preferencesQueryRq;
    }

    /**
     * Returns the value of field 'priceLevelAddRq'.
     * 
     * @return the value of field 'PriceLevelAddRq'.
     */
    public org.chocolate_milk.model.PriceLevelAddRq getPriceLevelAddRq(
    ) {
        return this._priceLevelAddRq;
    }

    /**
     * Returns the value of field 'priceLevelModRq'.
     * 
     * @return the value of field 'PriceLevelModRq'.
     */
    public org.chocolate_milk.model.PriceLevelModRq getPriceLevelModRq(
    ) {
        return this._priceLevelModRq;
    }

    /**
     * Returns the value of field 'priceLevelQueryRq'.
     * 
     * @return the value of field 'PriceLevelQueryRq'.
     */
    public org.chocolate_milk.model.PriceLevelQueryRq getPriceLevelQueryRq(
    ) {
        return this._priceLevelQueryRq;
    }

    /**
     * Returns the value of field 'purchaseOrderAddRq'.
     * 
     * @return the value of field 'PurchaseOrderAddRq'.
     */
    public org.chocolate_milk.model.PurchaseOrderAddRq getPurchaseOrderAddRq(
    ) {
        return this._purchaseOrderAddRq;
    }

    /**
     * Returns the value of field 'purchaseOrderModRq'.
     * 
     * @return the value of field 'PurchaseOrderModRq'.
     */
    public org.chocolate_milk.model.PurchaseOrderModRq getPurchaseOrderModRq(
    ) {
        return this._purchaseOrderModRq;
    }

    /**
     * Returns the value of field 'purchaseOrderQueryRq'.
     * 
     * @return the value of field 'PurchaseOrderQueryRq'.
     */
    public org.chocolate_milk.model.PurchaseOrderQueryRq getPurchaseOrderQueryRq(
    ) {
        return this._purchaseOrderQueryRq;
    }

    /**
     * Returns the value of field 'receivePaymentAddRq'.
     * 
     * @return the value of field 'ReceivePaymentAddRq'.
     */
    public org.chocolate_milk.model.ReceivePaymentAddRq getReceivePaymentAddRq(
    ) {
        return this._receivePaymentAddRq;
    }

    /**
     * Returns the value of field 'receivePaymentModRq'.
     * 
     * @return the value of field 'ReceivePaymentModRq'.
     */
    public org.chocolate_milk.model.ReceivePaymentModRq getReceivePaymentModRq(
    ) {
        return this._receivePaymentModRq;
    }

    /**
     * Returns the value of field 'receivePaymentQueryRq'.
     * 
     * @return the value of field 'ReceivePaymentQueryRq'.
     */
    public org.chocolate_milk.model.ReceivePaymentQueryRq getReceivePaymentQueryRq(
    ) {
        return this._receivePaymentQueryRq;
    }

    /**
     * Returns the value of field 'receivePaymentToDepositQueryRq'.
     * 
     * @return the value of field 'ReceivePaymentToDepositQueryRq'.
     */
    public org.chocolate_milk.model.ReceivePaymentToDepositQueryRq getReceivePaymentToDepositQueryRq(
    ) {
        return this._receivePaymentToDepositQueryRq;
    }

    /**
     * Returns the value of field 'salesOrderAddRq'.
     * 
     * @return the value of field 'SalesOrderAddRq'.
     */
    public org.chocolate_milk.model.SalesOrderAddRq getSalesOrderAddRq(
    ) {
        return this._salesOrderAddRq;
    }

    /**
     * Returns the value of field 'salesOrderModRq'.
     * 
     * @return the value of field 'SalesOrderModRq'.
     */
    public org.chocolate_milk.model.SalesOrderModRq getSalesOrderModRq(
    ) {
        return this._salesOrderModRq;
    }

    /**
     * Returns the value of field 'salesOrderQueryRq'.
     * 
     * @return the value of field 'SalesOrderQueryRq'.
     */
    public org.chocolate_milk.model.SalesOrderQueryRq getSalesOrderQueryRq(
    ) {
        return this._salesOrderQueryRq;
    }

    /**
     * Returns the value of field 'salesReceiptAddRq'.
     * 
     * @return the value of field 'SalesReceiptAddRq'.
     */
    public org.chocolate_milk.model.SalesReceiptAddRq getSalesReceiptAddRq(
    ) {
        return this._salesReceiptAddRq;
    }

    /**
     * Returns the value of field 'salesReceiptModRq'.
     * 
     * @return the value of field 'SalesReceiptModRq'.
     */
    public org.chocolate_milk.model.SalesReceiptModRq getSalesReceiptModRq(
    ) {
        return this._salesReceiptModRq;
    }

    /**
     * Returns the value of field 'salesReceiptQueryRq'.
     * 
     * @return the value of field 'SalesReceiptQueryRq'.
     */
    public org.chocolate_milk.model.SalesReceiptQueryRq getSalesReceiptQueryRq(
    ) {
        return this._salesReceiptQueryRq;
    }

    /**
     * Returns the value of field 'salesRepAddRq'.
     * 
     * @return the value of field 'SalesRepAddRq'.
     */
    public org.chocolate_milk.model.SalesRepAddRq getSalesRepAddRq(
    ) {
        return this._salesRepAddRq;
    }

    /**
     * Returns the value of field 'salesRepModRq'.
     * 
     * @return the value of field 'SalesRepModRq'.
     */
    public org.chocolate_milk.model.SalesRepModRq getSalesRepModRq(
    ) {
        return this._salesRepModRq;
    }

    /**
     * Returns the value of field 'salesRepQueryRq'.
     * 
     * @return the value of field 'SalesRepQueryRq'.
     */
    public org.chocolate_milk.model.SalesRepQueryRq getSalesRepQueryRq(
    ) {
        return this._salesRepQueryRq;
    }

    /**
     * Returns the value of field 'salesTaxCodeAddRq'.
     * 
     * @return the value of field 'SalesTaxCodeAddRq'.
     */
    public org.chocolate_milk.model.SalesTaxCodeAddRq getSalesTaxCodeAddRq(
    ) {
        return this._salesTaxCodeAddRq;
    }

    /**
     * Returns the value of field 'salesTaxCodeModRq'.
     * 
     * @return the value of field 'SalesTaxCodeModRq'.
     */
    public org.chocolate_milk.model.SalesTaxCodeModRq getSalesTaxCodeModRq(
    ) {
        return this._salesTaxCodeModRq;
    }

    /**
     * Returns the value of field 'salesTaxCodeQueryRq'.
     * 
     * @return the value of field 'SalesTaxCodeQueryRq'.
     */
    public org.chocolate_milk.model.SalesTaxCodeQueryRq getSalesTaxCodeQueryRq(
    ) {
        return this._salesTaxCodeQueryRq;
    }

    /**
     * Returns the value of field 'salesTaxPaymentCheckQueryRq'.
     * 
     * @return the value of field 'SalesTaxPaymentCheckQueryRq'.
     */
    public org.chocolate_milk.model.SalesTaxPaymentCheckQueryRq getSalesTaxPaymentCheckQueryRq(
    ) {
        return this._salesTaxPaymentCheckQueryRq;
    }

    /**
     * Returns the value of field 'salesTaxReturnLineQueryRq'.
     * 
     * @return the value of field 'SalesTaxReturnLineQueryRq'.
     */
    public org.chocolate_milk.model.SalesTaxReturnLineQueryRq getSalesTaxReturnLineQueryRq(
    ) {
        return this._salesTaxReturnLineQueryRq;
    }

    /**
     * Returns the value of field 'salesTaxReturnQueryRq'.
     * 
     * @return the value of field 'SalesTaxReturnQueryRq'.
     */
    public org.chocolate_milk.model.SalesTaxReturnQueryRq getSalesTaxReturnQueryRq(
    ) {
        return this._salesTaxReturnQueryRq;
    }

    /**
     * Returns the value of field 'shipMethodAddRq'.
     * 
     * @return the value of field 'ShipMethodAddRq'.
     */
    public org.chocolate_milk.model.ShipMethodAddRq getShipMethodAddRq(
    ) {
        return this._shipMethodAddRq;
    }

    /**
     * Returns the value of field 'shipMethodQueryRq'.
     * 
     * @return the value of field 'ShipMethodQueryRq'.
     */
    public org.chocolate_milk.model.ShipMethodQueryRq getShipMethodQueryRq(
    ) {
        return this._shipMethodQueryRq;
    }

    /**
     * Returns the value of field 'specialAccountAddRq'.
     * 
     * @return the value of field 'SpecialAccountAddRq'.
     */
    public org.chocolate_milk.model.SpecialAccountAddRq getSpecialAccountAddRq(
    ) {
        return this._specialAccountAddRq;
    }

    /**
     * Returns the value of field 'specialItemAddRq'.
     * 
     * @return the value of field 'SpecialItemAddRq'.
     */
    public org.chocolate_milk.model.SpecialItemAddRq getSpecialItemAddRq(
    ) {
        return this._specialItemAddRq;
    }

    /**
     * Returns the value of field 'standardTermsAddRq'.
     * 
     * @return the value of field 'StandardTermsAddRq'.
     */
    public org.chocolate_milk.model.StandardTermsAddRq getStandardTermsAddRq(
    ) {
        return this._standardTermsAddRq;
    }

    /**
     * Returns the value of field 'standardTermsQueryRq'.
     * 
     * @return the value of field 'StandardTermsQueryRq'.
     */
    public org.chocolate_milk.model.StandardTermsQueryRq getStandardTermsQueryRq(
    ) {
        return this._standardTermsQueryRq;
    }

    /**
     * Returns the value of field 'templateQueryRq'.
     * 
     * @return the value of field 'TemplateQueryRq'.
     */
    public org.chocolate_milk.model.TemplateQueryRq getTemplateQueryRq(
    ) {
        return this._templateQueryRq;
    }

    /**
     * Returns the value of field 'termsQueryRq'.
     * 
     * @return the value of field 'TermsQueryRq'.
     */
    public org.chocolate_milk.model.TermsQueryRq getTermsQueryRq(
    ) {
        return this._termsQueryRq;
    }

    /**
     * Returns the value of field 'timeReportQueryRq'.
     * 
     * @return the value of field 'TimeReportQueryRq'.
     */
    public org.chocolate_milk.model.TimeReportQueryRq getTimeReportQueryRq(
    ) {
        return this._timeReportQueryRq;
    }

    /**
     * Returns the value of field 'timeTrackingAddRq'.
     * 
     * @return the value of field 'TimeTrackingAddRq'.
     */
    public org.chocolate_milk.model.TimeTrackingAddRq getTimeTrackingAddRq(
    ) {
        return this._timeTrackingAddRq;
    }

    /**
     * Returns the value of field 'timeTrackingModRq'.
     * 
     * @return the value of field 'TimeTrackingModRq'.
     */
    public org.chocolate_milk.model.TimeTrackingModRq getTimeTrackingModRq(
    ) {
        return this._timeTrackingModRq;
    }

    /**
     * Returns the value of field 'timeTrackingQueryRq'.
     * 
     * @return the value of field 'TimeTrackingQueryRq'.
     */
    public org.chocolate_milk.model.TimeTrackingQueryRq getTimeTrackingQueryRq(
    ) {
        return this._timeTrackingQueryRq;
    }

    /**
     * Returns the value of field 'toDoAddRq'.
     * 
     * @return the value of field 'ToDoAddRq'.
     */
    public org.chocolate_milk.model.ToDoAddRq getToDoAddRq(
    ) {
        return this._toDoAddRq;
    }

    /**
     * Returns the value of field 'toDoQueryRq'.
     * 
     * @return the value of field 'ToDoQueryRq'.
     */
    public org.chocolate_milk.model.ToDoQueryRq getToDoQueryRq(
    ) {
        return this._toDoQueryRq;
    }

    /**
     * Returns the value of field 'transactionQueryRq'.
     * 
     * @return the value of field 'TransactionQueryRq'.
     */
    public org.chocolate_milk.model.TransactionQueryRq getTransactionQueryRq(
    ) {
        return this._transactionQueryRq;
    }

    /**
     * Returns the value of field 'txnDelRq'.
     * 
     * @return the value of field 'TxnDelRq'.
     */
    public org.chocolate_milk.model.TxnDelRq getTxnDelRq(
    ) {
        return this._txnDelRq;
    }

    /**
     * Returns the value of field 'txnDeletedQueryRq'.
     * 
     * @return the value of field 'TxnDeletedQueryRq'.
     */
    public org.chocolate_milk.model.TxnDeletedQueryRq getTxnDeletedQueryRq(
    ) {
        return this._txnDeletedQueryRq;
    }

    /**
     * Returns the value of field 'txnDisplayAddRq'.
     * 
     * @return the value of field 'TxnDisplayAddRq'.
     */
    public org.chocolate_milk.model.TxnDisplayAddRq getTxnDisplayAddRq(
    ) {
        return this._txnDisplayAddRq;
    }

    /**
     * Returns the value of field 'txnDisplayModRq'.
     * 
     * @return the value of field 'TxnDisplayModRq'.
     */
    public org.chocolate_milk.model.TxnDisplayModRq getTxnDisplayModRq(
    ) {
        return this._txnDisplayModRq;
    }

    /**
     * Returns the value of field 'txnVoidRq'.
     * 
     * @return the value of field 'TxnVoidRq'.
     */
    public org.chocolate_milk.model.TxnVoidRq getTxnVoidRq(
    ) {
        return this._txnVoidRq;
    }

    /**
     * Returns the value of field 'unitOfMeasureSetAddRq'.
     * 
     * @return the value of field 'UnitOfMeasureSetAddRq'.
     */
    public org.chocolate_milk.model.UnitOfMeasureSetAddRq getUnitOfMeasureSetAddRq(
    ) {
        return this._unitOfMeasureSetAddRq;
    }

    /**
     * Returns the value of field 'unitOfMeasureSetQueryRq'.
     * 
     * @return the value of field 'UnitOfMeasureSetQueryRq'.
     */
    public org.chocolate_milk.model.UnitOfMeasureSetQueryRq getUnitOfMeasureSetQueryRq(
    ) {
        return this._unitOfMeasureSetQueryRq;
    }

    /**
     * Returns the value of field 'vehicleAddRq'.
     * 
     * @return the value of field 'VehicleAddRq'.
     */
    public org.chocolate_milk.model.VehicleAddRq getVehicleAddRq(
    ) {
        return this._vehicleAddRq;
    }

    /**
     * Returns the value of field 'vehicleMileageAddRq'.
     * 
     * @return the value of field 'VehicleMileageAddRq'.
     */
    public org.chocolate_milk.model.VehicleMileageAddRq getVehicleMileageAddRq(
    ) {
        return this._vehicleMileageAddRq;
    }

    /**
     * Returns the value of field 'vehicleMileageQueryRq'.
     * 
     * @return the value of field 'VehicleMileageQueryRq'.
     */
    public org.chocolate_milk.model.VehicleMileageQueryRq getVehicleMileageQueryRq(
    ) {
        return this._vehicleMileageQueryRq;
    }

    /**
     * Returns the value of field 'vehicleModRq'.
     * 
     * @return the value of field 'VehicleModRq'.
     */
    public org.chocolate_milk.model.VehicleModRq getVehicleModRq(
    ) {
        return this._vehicleModRq;
    }

    /**
     * Returns the value of field 'vehicleQueryRq'.
     * 
     * @return the value of field 'VehicleQueryRq'.
     */
    public org.chocolate_milk.model.VehicleQueryRq getVehicleQueryRq(
    ) {
        return this._vehicleQueryRq;
    }

    /**
     * Returns the value of field 'vendorAddRq'.
     * 
     * @return the value of field 'VendorAddRq'.
     */
    public org.chocolate_milk.model.VendorAddRq getVendorAddRq(
    ) {
        return this._vendorAddRq;
    }

    /**
     * Returns the value of field 'vendorCreditAddRq'.
     * 
     * @return the value of field 'VendorCreditAddRq'.
     */
    public org.chocolate_milk.model.VendorCreditAddRq getVendorCreditAddRq(
    ) {
        return this._vendorCreditAddRq;
    }

    /**
     * Returns the value of field 'vendorCreditModRq'.
     * 
     * @return the value of field 'VendorCreditModRq'.
     */
    public org.chocolate_milk.model.VendorCreditModRq getVendorCreditModRq(
    ) {
        return this._vendorCreditModRq;
    }

    /**
     * Returns the value of field 'vendorCreditQueryRq'.
     * 
     * @return the value of field 'VendorCreditQueryRq'.
     */
    public org.chocolate_milk.model.VendorCreditQueryRq getVendorCreditQueryRq(
    ) {
        return this._vendorCreditQueryRq;
    }

    /**
     * Returns the value of field 'vendorModRq'.
     * 
     * @return the value of field 'VendorModRq'.
     */
    public org.chocolate_milk.model.VendorModRq getVendorModRq(
    ) {
        return this._vendorModRq;
    }

    /**
     * Returns the value of field 'vendorQueryRq'.
     * 
     * @return the value of field 'VendorQueryRq'.
     */
    public org.chocolate_milk.model.VendorQueryRq getVendorQueryRq(
    ) {
        return this._vendorQueryRq;
    }

    /**
     * Returns the value of field 'vendorTypeAddRq'.
     * 
     * @return the value of field 'VendorTypeAddRq'.
     */
    public org.chocolate_milk.model.VendorTypeAddRq getVendorTypeAddRq(
    ) {
        return this._vendorTypeAddRq;
    }

    /**
     * Returns the value of field 'vendorTypeQueryRq'.
     * 
     * @return the value of field 'VendorTypeQueryRq'.
     */
    public org.chocolate_milk.model.VendorTypeQueryRq getVendorTypeQueryRq(
    ) {
        return this._vendorTypeQueryRq;
    }

    /**
     * Returns the value of field 'workersCompCodeAddRq'.
     * 
     * @return the value of field 'WorkersCompCodeAddRq'.
     */
    public org.chocolate_milk.model.WorkersCompCodeAddRq getWorkersCompCodeAddRq(
    ) {
        return this._workersCompCodeAddRq;
    }

    /**
     * Returns the value of field 'workersCompCodeModRq'.
     * 
     * @return the value of field 'WorkersCompCodeModRq'.
     */
    public org.chocolate_milk.model.WorkersCompCodeModRq getWorkersCompCodeModRq(
    ) {
        return this._workersCompCodeModRq;
    }

    /**
     * Returns the value of field 'workersCompCodeQueryRq'.
     * 
     * @return the value of field 'WorkersCompCodeQueryRq'.
     */
    public org.chocolate_milk.model.WorkersCompCodeQueryRq getWorkersCompCodeQueryRq(
    ) {
        return this._workersCompCodeQueryRq;
    }

    /**
     * Sets the value of field 'ARRefundCreditCardAddRq'.
     * 
     * @param ARRefundCreditCardAddRq the value of field
     * 'ARRefundCreditCardAddRq'.
     */
    public void setARRefundCreditCardAddRq(
            final org.chocolate_milk.model.ARRefundCreditCardAddRq ARRefundCreditCardAddRq) {
        this._ARRefundCreditCardAddRq = ARRefundCreditCardAddRq;
        this._choiceValue = ARRefundCreditCardAddRq;
    }

    /**
     * Sets the value of field 'ARRefundCreditCardQueryRq'.
     * 
     * @param ARRefundCreditCardQueryRq the value of field
     * 'ARRefundCreditCardQueryRq'.
     */
    public void setARRefundCreditCardQueryRq(
            final org.chocolate_milk.model.ARRefundCreditCardQueryRq ARRefundCreditCardQueryRq) {
        this._ARRefundCreditCardQueryRq = ARRefundCreditCardQueryRq;
        this._choiceValue = ARRefundCreditCardQueryRq;
    }

    /**
     * Sets the value of field 'accountAddRq'.
     * 
     * @param accountAddRq the value of field 'accountAddRq'.
     */
    public void setAccountAddRq(
            final org.chocolate_milk.model.AccountAddRq accountAddRq) {
        this._accountAddRq = accountAddRq;
        this._choiceValue = accountAddRq;
    }

    /**
     * Sets the value of field 'accountModRq'.
     * 
     * @param accountModRq the value of field 'accountModRq'.
     */
    public void setAccountModRq(
            final org.chocolate_milk.model.AccountModRq accountModRq) {
        this._accountModRq = accountModRq;
        this._choiceValue = accountModRq;
    }

    /**
     * Sets the value of field 'accountQueryRq'.
     * 
     * @param accountQueryRq the value of field 'accountQueryRq'.
     */
    public void setAccountQueryRq(
            final org.chocolate_milk.model.AccountQueryRq accountQueryRq) {
        this._accountQueryRq = accountQueryRq;
        this._choiceValue = accountQueryRq;
    }

    /**
     * Sets the value of field 'accountTaxLineInfoQueryRq'.
     * 
     * @param accountTaxLineInfoQueryRq the value of field
     * 'accountTaxLineInfoQueryRq'.
     */
    public void setAccountTaxLineInfoQueryRq(
            final org.chocolate_milk.model.AccountTaxLineInfoQueryRq accountTaxLineInfoQueryRq) {
        this._accountTaxLineInfoQueryRq = accountTaxLineInfoQueryRq;
        this._choiceValue = accountTaxLineInfoQueryRq;
    }

    /**
     * Sets the value of field 'agingReportQueryRq'.
     * 
     * @param agingReportQueryRq the value of field
     * 'agingReportQueryRq'.
     */
    public void setAgingReportQueryRq(
            final org.chocolate_milk.model.AgingReportQueryRq agingReportQueryRq) {
        this._agingReportQueryRq = agingReportQueryRq;
        this._choiceValue = agingReportQueryRq;
    }

    /**
     * Sets the value of field 'billAddRq'.
     * 
     * @param billAddRq the value of field 'billAddRq'.
     */
    public void setBillAddRq(
            final org.chocolate_milk.model.BillAddRq billAddRq) {
        this._billAddRq = billAddRq;
        this._choiceValue = billAddRq;
    }

    /**
     * Sets the value of field 'billModRq'.
     * 
     * @param billModRq the value of field 'billModRq'.
     */
    public void setBillModRq(
            final org.chocolate_milk.model.BillModRq billModRq) {
        this._billModRq = billModRq;
        this._choiceValue = billModRq;
    }

    /**
     * Sets the value of field 'billPaymentCheckAddRq'.
     * 
     * @param billPaymentCheckAddRq the value of field
     * 'billPaymentCheckAddRq'.
     */
    public void setBillPaymentCheckAddRq(
            final org.chocolate_milk.model.BillPaymentCheckAddRq billPaymentCheckAddRq) {
        this._billPaymentCheckAddRq = billPaymentCheckAddRq;
        this._choiceValue = billPaymentCheckAddRq;
    }

    /**
     * Sets the value of field 'billPaymentCheckModRq'.
     * 
     * @param billPaymentCheckModRq the value of field
     * 'billPaymentCheckModRq'.
     */
    public void setBillPaymentCheckModRq(
            final org.chocolate_milk.model.BillPaymentCheckModRq billPaymentCheckModRq) {
        this._billPaymentCheckModRq = billPaymentCheckModRq;
        this._choiceValue = billPaymentCheckModRq;
    }

    /**
     * Sets the value of field 'billPaymentCheckQueryRq'.
     * 
     * @param billPaymentCheckQueryRq the value of field
     * 'billPaymentCheckQueryRq'.
     */
    public void setBillPaymentCheckQueryRq(
            final org.chocolate_milk.model.BillPaymentCheckQueryRq billPaymentCheckQueryRq) {
        this._billPaymentCheckQueryRq = billPaymentCheckQueryRq;
        this._choiceValue = billPaymentCheckQueryRq;
    }

    /**
     * Sets the value of field 'billPaymentCreditCardAddRq'.
     * 
     * @param billPaymentCreditCardAddRq the value of field
     * 'billPaymentCreditCardAddRq'.
     */
    public void setBillPaymentCreditCardAddRq(
            final org.chocolate_milk.model.BillPaymentCreditCardAddRq billPaymentCreditCardAddRq) {
        this._billPaymentCreditCardAddRq = billPaymentCreditCardAddRq;
        this._choiceValue = billPaymentCreditCardAddRq;
    }

    /**
     * Sets the value of field 'billPaymentCreditCardQueryRq'.
     * 
     * @param billPaymentCreditCardQueryRq the value of field
     * 'billPaymentCreditCardQueryRq'.
     */
    public void setBillPaymentCreditCardQueryRq(
            final org.chocolate_milk.model.BillPaymentCreditCardQueryRq billPaymentCreditCardQueryRq) {
        this._billPaymentCreditCardQueryRq = billPaymentCreditCardQueryRq;
        this._choiceValue = billPaymentCreditCardQueryRq;
    }

    /**
     * Sets the value of field 'billQueryRq'.
     * 
     * @param billQueryRq the value of field 'billQueryRq'.
     */
    public void setBillQueryRq(
            final org.chocolate_milk.model.BillQueryRq billQueryRq) {
        this._billQueryRq = billQueryRq;
        this._choiceValue = billQueryRq;
    }

    /**
     * Sets the value of field 'billToPayQueryRq'.
     * 
     * @param billToPayQueryRq the value of field 'billToPayQueryRq'
     */
    public void setBillToPayQueryRq(
            final org.chocolate_milk.model.BillToPayQueryRq billToPayQueryRq) {
        this._billToPayQueryRq = billToPayQueryRq;
        this._choiceValue = billToPayQueryRq;
    }

    /**
     * Sets the value of field 'billingRateAddRq'.
     * 
     * @param billingRateAddRq the value of field 'billingRateAddRq'
     */
    public void setBillingRateAddRq(
            final org.chocolate_milk.model.BillingRateAddRq billingRateAddRq) {
        this._billingRateAddRq = billingRateAddRq;
        this._choiceValue = billingRateAddRq;
    }

    /**
     * Sets the value of field 'billingRateQueryRq'.
     * 
     * @param billingRateQueryRq the value of field
     * 'billingRateQueryRq'.
     */
    public void setBillingRateQueryRq(
            final org.chocolate_milk.model.BillingRateQueryRq billingRateQueryRq) {
        this._billingRateQueryRq = billingRateQueryRq;
        this._choiceValue = billingRateQueryRq;
    }

    /**
     * Sets the value of field 'budgetSummaryReportQueryRq'.
     * 
     * @param budgetSummaryReportQueryRq the value of field
     * 'budgetSummaryReportQueryRq'.
     */
    public void setBudgetSummaryReportQueryRq(
            final org.chocolate_milk.model.BudgetSummaryReportQueryRq budgetSummaryReportQueryRq) {
        this._budgetSummaryReportQueryRq = budgetSummaryReportQueryRq;
        this._choiceValue = budgetSummaryReportQueryRq;
    }

    /**
     * Sets the value of field 'buildAssemblyAddRq'.
     * 
     * @param buildAssemblyAddRq the value of field
     * 'buildAssemblyAddRq'.
     */
    public void setBuildAssemblyAddRq(
            final org.chocolate_milk.model.BuildAssemblyAddRq buildAssemblyAddRq) {
        this._buildAssemblyAddRq = buildAssemblyAddRq;
        this._choiceValue = buildAssemblyAddRq;
    }

    /**
     * Sets the value of field 'buildAssemblyModRq'.
     * 
     * @param buildAssemblyModRq the value of field
     * 'buildAssemblyModRq'.
     */
    public void setBuildAssemblyModRq(
            final org.chocolate_milk.model.BuildAssemblyModRq buildAssemblyModRq) {
        this._buildAssemblyModRq = buildAssemblyModRq;
        this._choiceValue = buildAssemblyModRq;
    }

    /**
     * Sets the value of field 'buildAssemblyQueryRq'.
     * 
     * @param buildAssemblyQueryRq the value of field
     * 'buildAssemblyQueryRq'.
     */
    public void setBuildAssemblyQueryRq(
            final org.chocolate_milk.model.BuildAssemblyQueryRq buildAssemblyQueryRq) {
        this._buildAssemblyQueryRq = buildAssemblyQueryRq;
        this._choiceValue = buildAssemblyQueryRq;
    }

    /**
     * Sets the value of field 'chargeAddRq'.
     * 
     * @param chargeAddRq the value of field 'chargeAddRq'.
     */
    public void setChargeAddRq(
            final org.chocolate_milk.model.ChargeAddRq chargeAddRq) {
        this._chargeAddRq = chargeAddRq;
        this._choiceValue = chargeAddRq;
    }

    /**
     * Sets the value of field 'chargeModRq'.
     * 
     * @param chargeModRq the value of field 'chargeModRq'.
     */
    public void setChargeModRq(
            final org.chocolate_milk.model.ChargeModRq chargeModRq) {
        this._chargeModRq = chargeModRq;
        this._choiceValue = chargeModRq;
    }

    /**
     * Sets the value of field 'chargeQueryRq'.
     * 
     * @param chargeQueryRq the value of field 'chargeQueryRq'.
     */
    public void setChargeQueryRq(
            final org.chocolate_milk.model.ChargeQueryRq chargeQueryRq) {
        this._chargeQueryRq = chargeQueryRq;
        this._choiceValue = chargeQueryRq;
    }

    /**
     * Sets the value of field 'checkAddRq'.
     * 
     * @param checkAddRq the value of field 'checkAddRq'.
     */
    public void setCheckAddRq(
            final org.chocolate_milk.model.CheckAddRq checkAddRq) {
        this._checkAddRq = checkAddRq;
        this._choiceValue = checkAddRq;
    }

    /**
     * Sets the value of field 'checkModRq'.
     * 
     * @param checkModRq the value of field 'checkModRq'.
     */
    public void setCheckModRq(
            final org.chocolate_milk.model.CheckModRq checkModRq) {
        this._checkModRq = checkModRq;
        this._choiceValue = checkModRq;
    }

    /**
     * Sets the value of field 'checkQueryRq'.
     * 
     * @param checkQueryRq the value of field 'checkQueryRq'.
     */
    public void setCheckQueryRq(
            final org.chocolate_milk.model.CheckQueryRq checkQueryRq) {
        this._checkQueryRq = checkQueryRq;
        this._choiceValue = checkQueryRq;
    }

    /**
     * Sets the value of field 'classAddRq'.
     * 
     * @param classAddRq the value of field 'classAddRq'.
     */
    public void setClassAddRq(
            final org.chocolate_milk.model.ClassAddRq classAddRq) {
        this._classAddRq = classAddRq;
        this._choiceValue = classAddRq;
    }

    /**
     * Sets the value of field 'classModRq'.
     * 
     * @param classModRq the value of field 'classModRq'.
     */
    public void setClassModRq(
            final org.chocolate_milk.model.ClassModRq classModRq) {
        this._classModRq = classModRq;
        this._choiceValue = classModRq;
    }

    /**
     * Sets the value of field 'classQueryRq'.
     * 
     * @param classQueryRq the value of field 'classQueryRq'.
     */
    public void setClassQueryRq(
            final org.chocolate_milk.model.ClassQueryRq classQueryRq) {
        this._classQueryRq = classQueryRq;
        this._choiceValue = classQueryRq;
    }

    /**
     * Sets the value of field 'clearedStatusModRq'.
     * 
     * @param clearedStatusModRq the value of field
     * 'clearedStatusModRq'.
     */
    public void setClearedStatusModRq(
            final org.chocolate_milk.model.ClearedStatusModRq clearedStatusModRq) {
        this._clearedStatusModRq = clearedStatusModRq;
        this._choiceValue = clearedStatusModRq;
    }

    /**
     * Sets the value of field 'companyActivityQueryRq'.
     * 
     * @param companyActivityQueryRq the value of field
     * 'companyActivityQueryRq'.
     */
    public void setCompanyActivityQueryRq(
            final org.chocolate_milk.model.CompanyActivityQueryRq companyActivityQueryRq) {
        this._companyActivityQueryRq = companyActivityQueryRq;
        this._choiceValue = companyActivityQueryRq;
    }

    /**
     * Sets the value of field 'companyQueryRq'.
     * 
     * @param companyQueryRq the value of field 'companyQueryRq'.
     */
    public void setCompanyQueryRq(
            final org.chocolate_milk.model.CompanyQueryRq companyQueryRq) {
        this._companyQueryRq = companyQueryRq;
        this._choiceValue = companyQueryRq;
    }

    /**
     * Sets the value of field 'creditCardChargeAddRq'.
     * 
     * @param creditCardChargeAddRq the value of field
     * 'creditCardChargeAddRq'.
     */
    public void setCreditCardChargeAddRq(
            final org.chocolate_milk.model.CreditCardChargeAddRq creditCardChargeAddRq) {
        this._creditCardChargeAddRq = creditCardChargeAddRq;
        this._choiceValue = creditCardChargeAddRq;
    }

    /**
     * Sets the value of field 'creditCardChargeModRq'.
     * 
     * @param creditCardChargeModRq the value of field
     * 'creditCardChargeModRq'.
     */
    public void setCreditCardChargeModRq(
            final org.chocolate_milk.model.CreditCardChargeModRq creditCardChargeModRq) {
        this._creditCardChargeModRq = creditCardChargeModRq;
        this._choiceValue = creditCardChargeModRq;
    }

    /**
     * Sets the value of field 'creditCardChargeQueryRq'.
     * 
     * @param creditCardChargeQueryRq the value of field
     * 'creditCardChargeQueryRq'.
     */
    public void setCreditCardChargeQueryRq(
            final org.chocolate_milk.model.CreditCardChargeQueryRq creditCardChargeQueryRq) {
        this._creditCardChargeQueryRq = creditCardChargeQueryRq;
        this._choiceValue = creditCardChargeQueryRq;
    }

    /**
     * Sets the value of field 'creditCardCreditAddRq'.
     * 
     * @param creditCardCreditAddRq the value of field
     * 'creditCardCreditAddRq'.
     */
    public void setCreditCardCreditAddRq(
            final org.chocolate_milk.model.CreditCardCreditAddRq creditCardCreditAddRq) {
        this._creditCardCreditAddRq = creditCardCreditAddRq;
        this._choiceValue = creditCardCreditAddRq;
    }

    /**
     * Sets the value of field 'creditCardCreditModRq'.
     * 
     * @param creditCardCreditModRq the value of field
     * 'creditCardCreditModRq'.
     */
    public void setCreditCardCreditModRq(
            final org.chocolate_milk.model.CreditCardCreditModRq creditCardCreditModRq) {
        this._creditCardCreditModRq = creditCardCreditModRq;
        this._choiceValue = creditCardCreditModRq;
    }

    /**
     * Sets the value of field 'creditCardCreditQueryRq'.
     * 
     * @param creditCardCreditQueryRq the value of field
     * 'creditCardCreditQueryRq'.
     */
    public void setCreditCardCreditQueryRq(
            final org.chocolate_milk.model.CreditCardCreditQueryRq creditCardCreditQueryRq) {
        this._creditCardCreditQueryRq = creditCardCreditQueryRq;
        this._choiceValue = creditCardCreditQueryRq;
    }

    /**
     * Sets the value of field 'creditMemoAddRq'.
     * 
     * @param creditMemoAddRq the value of field 'creditMemoAddRq'.
     */
    public void setCreditMemoAddRq(
            final org.chocolate_milk.model.CreditMemoAddRq creditMemoAddRq) {
        this._creditMemoAddRq = creditMemoAddRq;
        this._choiceValue = creditMemoAddRq;
    }

    /**
     * Sets the value of field 'creditMemoModRq'.
     * 
     * @param creditMemoModRq the value of field 'creditMemoModRq'.
     */
    public void setCreditMemoModRq(
            final org.chocolate_milk.model.CreditMemoModRq creditMemoModRq) {
        this._creditMemoModRq = creditMemoModRq;
        this._choiceValue = creditMemoModRq;
    }

    /**
     * Sets the value of field 'creditMemoQueryRq'.
     * 
     * @param creditMemoQueryRq the value of field
     * 'creditMemoQueryRq'.
     */
    public void setCreditMemoQueryRq(
            final org.chocolate_milk.model.CreditMemoQueryRq creditMemoQueryRq) {
        this._creditMemoQueryRq = creditMemoQueryRq;
        this._choiceValue = creditMemoQueryRq;
    }

    /**
     * Sets the value of field 'currencyAddRq'.
     * 
     * @param currencyAddRq the value of field 'currencyAddRq'.
     */
    public void setCurrencyAddRq(
            final org.chocolate_milk.model.CurrencyAddRq currencyAddRq) {
        this._currencyAddRq = currencyAddRq;
        this._choiceValue = currencyAddRq;
    }

    /**
     * Sets the value of field 'currencyModRq'.
     * 
     * @param currencyModRq the value of field 'currencyModRq'.
     */
    public void setCurrencyModRq(
            final org.chocolate_milk.model.CurrencyModRq currencyModRq) {
        this._currencyModRq = currencyModRq;
        this._choiceValue = currencyModRq;
    }

    /**
     * Sets the value of field 'currencyQueryRq'.
     * 
     * @param currencyQueryRq the value of field 'currencyQueryRq'.
     */
    public void setCurrencyQueryRq(
            final org.chocolate_milk.model.CurrencyQueryRq currencyQueryRq) {
        this._currencyQueryRq = currencyQueryRq;
        this._choiceValue = currencyQueryRq;
    }

    /**
     * Sets the value of field 'customDetailReportQueryRq'.
     * 
     * @param customDetailReportQueryRq the value of field
     * 'customDetailReportQueryRq'.
     */
    public void setCustomDetailReportQueryRq(
            final org.chocolate_milk.model.CustomDetailReportQueryRq customDetailReportQueryRq) {
        this._customDetailReportQueryRq = customDetailReportQueryRq;
        this._choiceValue = customDetailReportQueryRq;
    }

    /**
     * Sets the value of field 'customSummaryReportQueryRq'.
     * 
     * @param customSummaryReportQueryRq the value of field
     * 'customSummaryReportQueryRq'.
     */
    public void setCustomSummaryReportQueryRq(
            final org.chocolate_milk.model.CustomSummaryReportQueryRq customSummaryReportQueryRq) {
        this._customSummaryReportQueryRq = customSummaryReportQueryRq;
        this._choiceValue = customSummaryReportQueryRq;
    }

    /**
     * Sets the value of field 'customerAddRq'.
     * 
     * @param customerAddRq the value of field 'customerAddRq'.
     */
    public void setCustomerAddRq(
            final org.chocolate_milk.model.CustomerAddRq customerAddRq) {
        this._customerAddRq = customerAddRq;
        this._choiceValue = customerAddRq;
    }

    /**
     * Sets the value of field 'customerModRq'.
     * 
     * @param customerModRq the value of field 'customerModRq'.
     */
    public void setCustomerModRq(
            final org.chocolate_milk.model.CustomerModRq customerModRq) {
        this._customerModRq = customerModRq;
        this._choiceValue = customerModRq;
    }

    /**
     * Sets the value of field 'customerMsgAddRq'.
     * 
     * @param customerMsgAddRq the value of field 'customerMsgAddRq'
     */
    public void setCustomerMsgAddRq(
            final org.chocolate_milk.model.CustomerMsgAddRq customerMsgAddRq) {
        this._customerMsgAddRq = customerMsgAddRq;
        this._choiceValue = customerMsgAddRq;
    }

    /**
     * Sets the value of field 'customerMsgQueryRq'.
     * 
     * @param customerMsgQueryRq the value of field
     * 'customerMsgQueryRq'.
     */
    public void setCustomerMsgQueryRq(
            final org.chocolate_milk.model.CustomerMsgQueryRq customerMsgQueryRq) {
        this._customerMsgQueryRq = customerMsgQueryRq;
        this._choiceValue = customerMsgQueryRq;
    }

    /**
     * Sets the value of field 'customerQueryRq'.
     * 
     * @param customerQueryRq the value of field 'customerQueryRq'.
     */
    public void setCustomerQueryRq(
            final org.chocolate_milk.model.CustomerQueryRq customerQueryRq) {
        this._customerQueryRq = customerQueryRq;
        this._choiceValue = customerQueryRq;
    }

    /**
     * Sets the value of field 'customerTypeAddRq'.
     * 
     * @param customerTypeAddRq the value of field
     * 'customerTypeAddRq'.
     */
    public void setCustomerTypeAddRq(
            final org.chocolate_milk.model.CustomerTypeAddRq customerTypeAddRq) {
        this._customerTypeAddRq = customerTypeAddRq;
        this._choiceValue = customerTypeAddRq;
    }

    /**
     * Sets the value of field 'customerTypeQueryRq'.
     * 
     * @param customerTypeQueryRq the value of field
     * 'customerTypeQueryRq'.
     */
    public void setCustomerTypeQueryRq(
            final org.chocolate_milk.model.CustomerTypeQueryRq customerTypeQueryRq) {
        this._customerTypeQueryRq = customerTypeQueryRq;
        this._choiceValue = customerTypeQueryRq;
    }

    /**
     * Sets the value of field 'dataEventRecoveryInfoDelRq'.
     * 
     * @param dataEventRecoveryInfoDelRq the value of field
     * 'dataEventRecoveryInfoDelRq'.
     */
    public void setDataEventRecoveryInfoDelRq(
            final org.chocolate_milk.model.DataEventRecoveryInfoDelRq dataEventRecoveryInfoDelRq) {
        this._dataEventRecoveryInfoDelRq = dataEventRecoveryInfoDelRq;
        this._choiceValue = dataEventRecoveryInfoDelRq;
    }

    /**
     * Sets the value of field 'dataEventRecoveryInfoQueryRq'.
     * 
     * @param dataEventRecoveryInfoQueryRq the value of field
     * 'dataEventRecoveryInfoQueryRq'.
     */
    public void setDataEventRecoveryInfoQueryRq(
            final org.chocolate_milk.model.DataEventRecoveryInfoQueryRq dataEventRecoveryInfoQueryRq) {
        this._dataEventRecoveryInfoQueryRq = dataEventRecoveryInfoQueryRq;
        this._choiceValue = dataEventRecoveryInfoQueryRq;
    }

    /**
     * Sets the value of field 'dataExtAddRq'.
     * 
     * @param dataExtAddRq the value of field 'dataExtAddRq'.
     */
    public void setDataExtAddRq(
            final org.chocolate_milk.model.DataExtAddRq dataExtAddRq) {
        this._dataExtAddRq = dataExtAddRq;
        this._choiceValue = dataExtAddRq;
    }

    /**
     * Sets the value of field 'dataExtDefAddRq'.
     * 
     * @param dataExtDefAddRq the value of field 'dataExtDefAddRq'.
     */
    public void setDataExtDefAddRq(
            final org.chocolate_milk.model.DataExtDefAddRq dataExtDefAddRq) {
        this._dataExtDefAddRq = dataExtDefAddRq;
        this._choiceValue = dataExtDefAddRq;
    }

    /**
     * Sets the value of field 'dataExtDefDelRq'.
     * 
     * @param dataExtDefDelRq the value of field 'dataExtDefDelRq'.
     */
    public void setDataExtDefDelRq(
            final org.chocolate_milk.model.DataExtDefDelRq dataExtDefDelRq) {
        this._dataExtDefDelRq = dataExtDefDelRq;
        this._choiceValue = dataExtDefDelRq;
    }

    /**
     * Sets the value of field 'dataExtDefModRq'.
     * 
     * @param dataExtDefModRq the value of field 'dataExtDefModRq'.
     */
    public void setDataExtDefModRq(
            final org.chocolate_milk.model.DataExtDefModRq dataExtDefModRq) {
        this._dataExtDefModRq = dataExtDefModRq;
        this._choiceValue = dataExtDefModRq;
    }

    /**
     * Sets the value of field 'dataExtDefQueryRq'.
     * 
     * @param dataExtDefQueryRq the value of field
     * 'dataExtDefQueryRq'.
     */
    public void setDataExtDefQueryRq(
            final org.chocolate_milk.model.DataExtDefQueryRq dataExtDefQueryRq) {
        this._dataExtDefQueryRq = dataExtDefQueryRq;
        this._choiceValue = dataExtDefQueryRq;
    }

    /**
     * Sets the value of field 'dataExtDelRq'.
     * 
     * @param dataExtDelRq the value of field 'dataExtDelRq'.
     */
    public void setDataExtDelRq(
            final org.chocolate_milk.model.DataExtDelRq dataExtDelRq) {
        this._dataExtDelRq = dataExtDelRq;
        this._choiceValue = dataExtDelRq;
    }

    /**
     * Sets the value of field 'dataExtModRq'.
     * 
     * @param dataExtModRq the value of field 'dataExtModRq'.
     */
    public void setDataExtModRq(
            final org.chocolate_milk.model.DataExtModRq dataExtModRq) {
        this._dataExtModRq = dataExtModRq;
        this._choiceValue = dataExtModRq;
    }

    /**
     * Sets the value of field 'dateDrivenTermsAddRq'.
     * 
     * @param dateDrivenTermsAddRq the value of field
     * 'dateDrivenTermsAddRq'.
     */
    public void setDateDrivenTermsAddRq(
            final org.chocolate_milk.model.DateDrivenTermsAddRq dateDrivenTermsAddRq) {
        this._dateDrivenTermsAddRq = dateDrivenTermsAddRq;
        this._choiceValue = dateDrivenTermsAddRq;
    }

    /**
     * Sets the value of field 'dateDrivenTermsQueryRq'.
     * 
     * @param dateDrivenTermsQueryRq the value of field
     * 'dateDrivenTermsQueryRq'.
     */
    public void setDateDrivenTermsQueryRq(
            final org.chocolate_milk.model.DateDrivenTermsQueryRq dateDrivenTermsQueryRq) {
        this._dateDrivenTermsQueryRq = dateDrivenTermsQueryRq;
        this._choiceValue = dateDrivenTermsQueryRq;
    }

    /**
     * Sets the value of field 'depositAddRq'.
     * 
     * @param depositAddRq the value of field 'depositAddRq'.
     */
    public void setDepositAddRq(
            final org.chocolate_milk.model.DepositAddRq depositAddRq) {
        this._depositAddRq = depositAddRq;
        this._choiceValue = depositAddRq;
    }

    /**
     * Sets the value of field 'depositModRq'.
     * 
     * @param depositModRq the value of field 'depositModRq'.
     */
    public void setDepositModRq(
            final org.chocolate_milk.model.DepositModRq depositModRq) {
        this._depositModRq = depositModRq;
        this._choiceValue = depositModRq;
    }

    /**
     * Sets the value of field 'depositQueryRq'.
     * 
     * @param depositQueryRq the value of field 'depositQueryRq'.
     */
    public void setDepositQueryRq(
            final org.chocolate_milk.model.DepositQueryRq depositQueryRq) {
        this._depositQueryRq = depositQueryRq;
        this._choiceValue = depositQueryRq;
    }

    /**
     * Sets the value of field 'employeeAddRq'.
     * 
     * @param employeeAddRq the value of field 'employeeAddRq'.
     */
    public void setEmployeeAddRq(
            final org.chocolate_milk.model.EmployeeAddRq employeeAddRq) {
        this._employeeAddRq = employeeAddRq;
        this._choiceValue = employeeAddRq;
    }

    /**
     * Sets the value of field 'employeeModRq'.
     * 
     * @param employeeModRq the value of field 'employeeModRq'.
     */
    public void setEmployeeModRq(
            final org.chocolate_milk.model.EmployeeModRq employeeModRq) {
        this._employeeModRq = employeeModRq;
        this._choiceValue = employeeModRq;
    }

    /**
     * Sets the value of field 'employeeQueryRq'.
     * 
     * @param employeeQueryRq the value of field 'employeeQueryRq'.
     */
    public void setEmployeeQueryRq(
            final org.chocolate_milk.model.EmployeeQueryRq employeeQueryRq) {
        this._employeeQueryRq = employeeQueryRq;
        this._choiceValue = employeeQueryRq;
    }

    /**
     * Sets the value of field 'entityQueryRq'.
     * 
     * @param entityQueryRq the value of field 'entityQueryRq'.
     */
    public void setEntityQueryRq(
            final org.chocolate_milk.model.EntityQueryRq entityQueryRq) {
        this._entityQueryRq = entityQueryRq;
        this._choiceValue = entityQueryRq;
    }

    /**
     * Sets the value of field 'estimateAddRq'.
     * 
     * @param estimateAddRq the value of field 'estimateAddRq'.
     */
    public void setEstimateAddRq(
            final org.chocolate_milk.model.EstimateAddRq estimateAddRq) {
        this._estimateAddRq = estimateAddRq;
        this._choiceValue = estimateAddRq;
    }

    /**
     * Sets the value of field 'estimateModRq'.
     * 
     * @param estimateModRq the value of field 'estimateModRq'.
     */
    public void setEstimateModRq(
            final org.chocolate_milk.model.EstimateModRq estimateModRq) {
        this._estimateModRq = estimateModRq;
        this._choiceValue = estimateModRq;
    }

    /**
     * Sets the value of field 'estimateQueryRq'.
     * 
     * @param estimateQueryRq the value of field 'estimateQueryRq'.
     */
    public void setEstimateQueryRq(
            final org.chocolate_milk.model.EstimateQueryRq estimateQueryRq) {
        this._estimateQueryRq = estimateQueryRq;
        this._choiceValue = estimateQueryRq;
    }

    /**
     * Sets the value of field
     * 'form1099CategoryAccountMappingModRq'.
     * 
     * @param form1099CategoryAccountMappingModRq the value of
     * field 'form1099CategoryAccountMappingModRq'.
     */
    public void setForm1099CategoryAccountMappingModRq(
            final org.chocolate_milk.model.Form1099CategoryAccountMappingModRq form1099CategoryAccountMappingModRq) {
        this._form1099CategoryAccountMappingModRq = form1099CategoryAccountMappingModRq;
        this._choiceValue = form1099CategoryAccountMappingModRq;
    }

    /**
     * Sets the value of field
     * 'form1099CategoryAccountMappingQueryRq'.
     * 
     * @param form1099CategoryAccountMappingQueryRq the value of
     * field 'form1099CategoryAccountMappingQueryRq'.
     */
    public void setForm1099CategoryAccountMappingQueryRq(
            final org.chocolate_milk.model.Form1099CategoryAccountMappingQueryRq form1099CategoryAccountMappingQueryRq) {
        this._form1099CategoryAccountMappingQueryRq = form1099CategoryAccountMappingQueryRq;
        this._choiceValue = form1099CategoryAccountMappingQueryRq;
    }

    /**
     * Sets the value of field 'generalDetailReportQueryRq'.
     * 
     * @param generalDetailReportQueryRq the value of field
     * 'generalDetailReportQueryRq'.
     */
    public void setGeneralDetailReportQueryRq(
            final org.chocolate_milk.model.GeneralDetailReportQueryRq generalDetailReportQueryRq) {
        this._generalDetailReportQueryRq = generalDetailReportQueryRq;
        this._choiceValue = generalDetailReportQueryRq;
    }

    /**
     * Sets the value of field 'generalSummaryReportQueryRq'.
     * 
     * @param generalSummaryReportQueryRq the value of field
     * 'generalSummaryReportQueryRq'.
     */
    public void setGeneralSummaryReportQueryRq(
            final org.chocolate_milk.model.GeneralSummaryReportQueryRq generalSummaryReportQueryRq) {
        this._generalSummaryReportQueryRq = generalSummaryReportQueryRq;
        this._choiceValue = generalSummaryReportQueryRq;
    }

    /**
     * Sets the value of field 'hostQueryRq'.
     * 
     * @param hostQueryRq the value of field 'hostQueryRq'.
     */
    public void setHostQueryRq(
            final org.chocolate_milk.model.HostQueryRq hostQueryRq) {
        this._hostQueryRq = hostQueryRq;
        this._choiceValue = hostQueryRq;
    }

    /**
     * Sets the value of field 'inventoryAdjustmentAddRq'.
     * 
     * @param inventoryAdjustmentAddRq the value of field
     * 'inventoryAdjustmentAddRq'.
     */
    public void setInventoryAdjustmentAddRq(
            final org.chocolate_milk.model.InventoryAdjustmentAddRq inventoryAdjustmentAddRq) {
        this._inventoryAdjustmentAddRq = inventoryAdjustmentAddRq;
        this._choiceValue = inventoryAdjustmentAddRq;
    }

    /**
     * Sets the value of field 'inventoryAdjustmentQueryRq'.
     * 
     * @param inventoryAdjustmentQueryRq the value of field
     * 'inventoryAdjustmentQueryRq'.
     */
    public void setInventoryAdjustmentQueryRq(
            final org.chocolate_milk.model.InventoryAdjustmentQueryRq inventoryAdjustmentQueryRq) {
        this._inventoryAdjustmentQueryRq = inventoryAdjustmentQueryRq;
        this._choiceValue = inventoryAdjustmentQueryRq;
    }

    /**
     * Sets the value of field 'invoiceAddRq'.
     * 
     * @param invoiceAddRq the value of field 'invoiceAddRq'.
     */
    public void setInvoiceAddRq(
            final org.chocolate_milk.model.InvoiceAddRq invoiceAddRq) {
        this._invoiceAddRq = invoiceAddRq;
        this._choiceValue = invoiceAddRq;
    }

    /**
     * Sets the value of field 'invoiceModRq'.
     * 
     * @param invoiceModRq the value of field 'invoiceModRq'.
     */
    public void setInvoiceModRq(
            final org.chocolate_milk.model.InvoiceModRq invoiceModRq) {
        this._invoiceModRq = invoiceModRq;
        this._choiceValue = invoiceModRq;
    }

    /**
     * Sets the value of field 'invoiceQueryRq'.
     * 
     * @param invoiceQueryRq the value of field 'invoiceQueryRq'.
     */
    public void setInvoiceQueryRq(
            final org.chocolate_milk.model.InvoiceQueryRq invoiceQueryRq) {
        this._invoiceQueryRq = invoiceQueryRq;
        this._choiceValue = invoiceQueryRq;
    }

    /**
     * Sets the value of field 'itemAssembliesCanBuildQueryRq'.
     * 
     * @param itemAssembliesCanBuildQueryRq the value of field
     * 'itemAssembliesCanBuildQueryRq'.
     */
    public void setItemAssembliesCanBuildQueryRq(
            final org.chocolate_milk.model.ItemAssembliesCanBuildQueryRq itemAssembliesCanBuildQueryRq) {
        this._itemAssembliesCanBuildQueryRq = itemAssembliesCanBuildQueryRq;
        this._choiceValue = itemAssembliesCanBuildQueryRq;
    }

    /**
     * Sets the value of field 'itemDiscountAddRq'.
     * 
     * @param itemDiscountAddRq the value of field
     * 'itemDiscountAddRq'.
     */
    public void setItemDiscountAddRq(
            final org.chocolate_milk.model.ItemDiscountAddRq itemDiscountAddRq) {
        this._itemDiscountAddRq = itemDiscountAddRq;
        this._choiceValue = itemDiscountAddRq;
    }

    /**
     * Sets the value of field 'itemDiscountModRq'.
     * 
     * @param itemDiscountModRq the value of field
     * 'itemDiscountModRq'.
     */
    public void setItemDiscountModRq(
            final org.chocolate_milk.model.ItemDiscountModRq itemDiscountModRq) {
        this._itemDiscountModRq = itemDiscountModRq;
        this._choiceValue = itemDiscountModRq;
    }

    /**
     * Sets the value of field 'itemDiscountQueryRq'.
     * 
     * @param itemDiscountQueryRq the value of field
     * 'itemDiscountQueryRq'.
     */
    public void setItemDiscountQueryRq(
            final org.chocolate_milk.model.ItemDiscountQueryRq itemDiscountQueryRq) {
        this._itemDiscountQueryRq = itemDiscountQueryRq;
        this._choiceValue = itemDiscountQueryRq;
    }

    /**
     * Sets the value of field 'itemFixedAssetAddRq'.
     * 
     * @param itemFixedAssetAddRq the value of field
     * 'itemFixedAssetAddRq'.
     */
    public void setItemFixedAssetAddRq(
            final org.chocolate_milk.model.ItemFixedAssetAddRq itemFixedAssetAddRq) {
        this._itemFixedAssetAddRq = itemFixedAssetAddRq;
        this._choiceValue = itemFixedAssetAddRq;
    }

    /**
     * Sets the value of field 'itemFixedAssetModRq'.
     * 
     * @param itemFixedAssetModRq the value of field
     * 'itemFixedAssetModRq'.
     */
    public void setItemFixedAssetModRq(
            final org.chocolate_milk.model.ItemFixedAssetModRq itemFixedAssetModRq) {
        this._itemFixedAssetModRq = itemFixedAssetModRq;
        this._choiceValue = itemFixedAssetModRq;
    }

    /**
     * Sets the value of field 'itemFixedAssetQueryRq'.
     * 
     * @param itemFixedAssetQueryRq the value of field
     * 'itemFixedAssetQueryRq'.
     */
    public void setItemFixedAssetQueryRq(
            final org.chocolate_milk.model.ItemFixedAssetQueryRq itemFixedAssetQueryRq) {
        this._itemFixedAssetQueryRq = itemFixedAssetQueryRq;
        this._choiceValue = itemFixedAssetQueryRq;
    }

    /**
     * Sets the value of field 'itemGroupAddRq'.
     * 
     * @param itemGroupAddRq the value of field 'itemGroupAddRq'.
     */
    public void setItemGroupAddRq(
            final org.chocolate_milk.model.ItemGroupAddRq itemGroupAddRq) {
        this._itemGroupAddRq = itemGroupAddRq;
        this._choiceValue = itemGroupAddRq;
    }

    /**
     * Sets the value of field 'itemGroupModRq'.
     * 
     * @param itemGroupModRq the value of field 'itemGroupModRq'.
     */
    public void setItemGroupModRq(
            final org.chocolate_milk.model.ItemGroupModRq itemGroupModRq) {
        this._itemGroupModRq = itemGroupModRq;
        this._choiceValue = itemGroupModRq;
    }

    /**
     * Sets the value of field 'itemGroupQueryRq'.
     * 
     * @param itemGroupQueryRq the value of field 'itemGroupQueryRq'
     */
    public void setItemGroupQueryRq(
            final org.chocolate_milk.model.ItemGroupQueryRq itemGroupQueryRq) {
        this._itemGroupQueryRq = itemGroupQueryRq;
        this._choiceValue = itemGroupQueryRq;
    }

    /**
     * Sets the value of field 'itemInventoryAddRq'.
     * 
     * @param itemInventoryAddRq the value of field
     * 'itemInventoryAddRq'.
     */
    public void setItemInventoryAddRq(
            final org.chocolate_milk.model.ItemInventoryAddRq itemInventoryAddRq) {
        this._itemInventoryAddRq = itemInventoryAddRq;
        this._choiceValue = itemInventoryAddRq;
    }

    /**
     * Sets the value of field 'itemInventoryAssemblyAddRq'.
     * 
     * @param itemInventoryAssemblyAddRq the value of field
     * 'itemInventoryAssemblyAddRq'.
     */
    public void setItemInventoryAssemblyAddRq(
            final org.chocolate_milk.model.ItemInventoryAssemblyAddRq itemInventoryAssemblyAddRq) {
        this._itemInventoryAssemblyAddRq = itemInventoryAssemblyAddRq;
        this._choiceValue = itemInventoryAssemblyAddRq;
    }

    /**
     * Sets the value of field 'itemInventoryAssemblyModRq'.
     * 
     * @param itemInventoryAssemblyModRq the value of field
     * 'itemInventoryAssemblyModRq'.
     */
    public void setItemInventoryAssemblyModRq(
            final org.chocolate_milk.model.ItemInventoryAssemblyModRq itemInventoryAssemblyModRq) {
        this._itemInventoryAssemblyModRq = itemInventoryAssemblyModRq;
        this._choiceValue = itemInventoryAssemblyModRq;
    }

    /**
     * Sets the value of field 'itemInventoryAssemblyQueryRq'.
     * 
     * @param itemInventoryAssemblyQueryRq the value of field
     * 'itemInventoryAssemblyQueryRq'.
     */
    public void setItemInventoryAssemblyQueryRq(
            final org.chocolate_milk.model.ItemInventoryAssemblyQueryRq itemInventoryAssemblyQueryRq) {
        this._itemInventoryAssemblyQueryRq = itemInventoryAssemblyQueryRq;
        this._choiceValue = itemInventoryAssemblyQueryRq;
    }

    /**
     * Sets the value of field 'itemInventoryModRq'.
     * 
     * @param itemInventoryModRq the value of field
     * 'itemInventoryModRq'.
     */
    public void setItemInventoryModRq(
            final org.chocolate_milk.model.ItemInventoryModRq itemInventoryModRq) {
        this._itemInventoryModRq = itemInventoryModRq;
        this._choiceValue = itemInventoryModRq;
    }

    /**
     * Sets the value of field 'itemInventoryQueryRq'.
     * 
     * @param itemInventoryQueryRq the value of field
     * 'itemInventoryQueryRq'.
     */
    public void setItemInventoryQueryRq(
            final org.chocolate_milk.model.ItemInventoryQueryRq itemInventoryQueryRq) {
        this._itemInventoryQueryRq = itemInventoryQueryRq;
        this._choiceValue = itemInventoryQueryRq;
    }

    /**
     * Sets the value of field 'itemNonInventoryAddRq'.
     * 
     * @param itemNonInventoryAddRq the value of field
     * 'itemNonInventoryAddRq'.
     */
    public void setItemNonInventoryAddRq(
            final org.chocolate_milk.model.ItemNonInventoryAddRq itemNonInventoryAddRq) {
        this._itemNonInventoryAddRq = itemNonInventoryAddRq;
        this._choiceValue = itemNonInventoryAddRq;
    }

    /**
     * Sets the value of field 'itemNonInventoryModRq'.
     * 
     * @param itemNonInventoryModRq the value of field
     * 'itemNonInventoryModRq'.
     */
    public void setItemNonInventoryModRq(
            final org.chocolate_milk.model.ItemNonInventoryModRq itemNonInventoryModRq) {
        this._itemNonInventoryModRq = itemNonInventoryModRq;
        this._choiceValue = itemNonInventoryModRq;
    }

    /**
     * Sets the value of field 'itemNonInventoryQueryRq'.
     * 
     * @param itemNonInventoryQueryRq the value of field
     * 'itemNonInventoryQueryRq'.
     */
    public void setItemNonInventoryQueryRq(
            final org.chocolate_milk.model.ItemNonInventoryQueryRq itemNonInventoryQueryRq) {
        this._itemNonInventoryQueryRq = itemNonInventoryQueryRq;
        this._choiceValue = itemNonInventoryQueryRq;
    }

    /**
     * Sets the value of field 'itemOtherChargeAddRq'.
     * 
     * @param itemOtherChargeAddRq the value of field
     * 'itemOtherChargeAddRq'.
     */
    public void setItemOtherChargeAddRq(
            final org.chocolate_milk.model.ItemOtherChargeAddRq itemOtherChargeAddRq) {
        this._itemOtherChargeAddRq = itemOtherChargeAddRq;
        this._choiceValue = itemOtherChargeAddRq;
    }

    /**
     * Sets the value of field 'itemOtherChargeModRq'.
     * 
     * @param itemOtherChargeModRq the value of field
     * 'itemOtherChargeModRq'.
     */
    public void setItemOtherChargeModRq(
            final org.chocolate_milk.model.ItemOtherChargeModRq itemOtherChargeModRq) {
        this._itemOtherChargeModRq = itemOtherChargeModRq;
        this._choiceValue = itemOtherChargeModRq;
    }

    /**
     * Sets the value of field 'itemOtherChargeQueryRq'.
     * 
     * @param itemOtherChargeQueryRq the value of field
     * 'itemOtherChargeQueryRq'.
     */
    public void setItemOtherChargeQueryRq(
            final org.chocolate_milk.model.ItemOtherChargeQueryRq itemOtherChargeQueryRq) {
        this._itemOtherChargeQueryRq = itemOtherChargeQueryRq;
        this._choiceValue = itemOtherChargeQueryRq;
    }

    /**
     * Sets the value of field 'itemPaymentAddRq'.
     * 
     * @param itemPaymentAddRq the value of field 'itemPaymentAddRq'
     */
    public void setItemPaymentAddRq(
            final org.chocolate_milk.model.ItemPaymentAddRq itemPaymentAddRq) {
        this._itemPaymentAddRq = itemPaymentAddRq;
        this._choiceValue = itemPaymentAddRq;
    }

    /**
     * Sets the value of field 'itemPaymentModRq'.
     * 
     * @param itemPaymentModRq the value of field 'itemPaymentModRq'
     */
    public void setItemPaymentModRq(
            final org.chocolate_milk.model.ItemPaymentModRq itemPaymentModRq) {
        this._itemPaymentModRq = itemPaymentModRq;
        this._choiceValue = itemPaymentModRq;
    }

    /**
     * Sets the value of field 'itemPaymentQueryRq'.
     * 
     * @param itemPaymentQueryRq the value of field
     * 'itemPaymentQueryRq'.
     */
    public void setItemPaymentQueryRq(
            final org.chocolate_milk.model.ItemPaymentQueryRq itemPaymentQueryRq) {
        this._itemPaymentQueryRq = itemPaymentQueryRq;
        this._choiceValue = itemPaymentQueryRq;
    }

    /**
     * Sets the value of field 'itemQueryRq'.
     * 
     * @param itemQueryRq the value of field 'itemQueryRq'.
     */
    public void setItemQueryRq(
            final org.chocolate_milk.model.ItemQueryRq itemQueryRq) {
        this._itemQueryRq = itemQueryRq;
        this._choiceValue = itemQueryRq;
    }

    /**
     * Sets the value of field 'itemReceiptAddRq'.
     * 
     * @param itemReceiptAddRq the value of field 'itemReceiptAddRq'
     */
    public void setItemReceiptAddRq(
            final org.chocolate_milk.model.ItemReceiptAddRq itemReceiptAddRq) {
        this._itemReceiptAddRq = itemReceiptAddRq;
        this._choiceValue = itemReceiptAddRq;
    }

    /**
     * Sets the value of field 'itemReceiptModRq'.
     * 
     * @param itemReceiptModRq the value of field 'itemReceiptModRq'
     */
    public void setItemReceiptModRq(
            final org.chocolate_milk.model.ItemReceiptModRq itemReceiptModRq) {
        this._itemReceiptModRq = itemReceiptModRq;
        this._choiceValue = itemReceiptModRq;
    }

    /**
     * Sets the value of field 'itemReceiptQueryRq'.
     * 
     * @param itemReceiptQueryRq the value of field
     * 'itemReceiptQueryRq'.
     */
    public void setItemReceiptQueryRq(
            final org.chocolate_milk.model.ItemReceiptQueryRq itemReceiptQueryRq) {
        this._itemReceiptQueryRq = itemReceiptQueryRq;
        this._choiceValue = itemReceiptQueryRq;
    }

    /**
     * Sets the value of field 'itemSalesTaxAddRq'.
     * 
     * @param itemSalesTaxAddRq the value of field
     * 'itemSalesTaxAddRq'.
     */
    public void setItemSalesTaxAddRq(
            final org.chocolate_milk.model.ItemSalesTaxAddRq itemSalesTaxAddRq) {
        this._itemSalesTaxAddRq = itemSalesTaxAddRq;
        this._choiceValue = itemSalesTaxAddRq;
    }

    /**
     * Sets the value of field 'itemSalesTaxGroupAddRq'.
     * 
     * @param itemSalesTaxGroupAddRq the value of field
     * 'itemSalesTaxGroupAddRq'.
     */
    public void setItemSalesTaxGroupAddRq(
            final org.chocolate_milk.model.ItemSalesTaxGroupAddRq itemSalesTaxGroupAddRq) {
        this._itemSalesTaxGroupAddRq = itemSalesTaxGroupAddRq;
        this._choiceValue = itemSalesTaxGroupAddRq;
    }

    /**
     * Sets the value of field 'itemSalesTaxGroupModRq'.
     * 
     * @param itemSalesTaxGroupModRq the value of field
     * 'itemSalesTaxGroupModRq'.
     */
    public void setItemSalesTaxGroupModRq(
            final org.chocolate_milk.model.ItemSalesTaxGroupModRq itemSalesTaxGroupModRq) {
        this._itemSalesTaxGroupModRq = itemSalesTaxGroupModRq;
        this._choiceValue = itemSalesTaxGroupModRq;
    }

    /**
     * Sets the value of field 'itemSalesTaxGroupQueryRq'.
     * 
     * @param itemSalesTaxGroupQueryRq the value of field
     * 'itemSalesTaxGroupQueryRq'.
     */
    public void setItemSalesTaxGroupQueryRq(
            final org.chocolate_milk.model.ItemSalesTaxGroupQueryRq itemSalesTaxGroupQueryRq) {
        this._itemSalesTaxGroupQueryRq = itemSalesTaxGroupQueryRq;
        this._choiceValue = itemSalesTaxGroupQueryRq;
    }

    /**
     * Sets the value of field 'itemSalesTaxModRq'.
     * 
     * @param itemSalesTaxModRq the value of field
     * 'itemSalesTaxModRq'.
     */
    public void setItemSalesTaxModRq(
            final org.chocolate_milk.model.ItemSalesTaxModRq itemSalesTaxModRq) {
        this._itemSalesTaxModRq = itemSalesTaxModRq;
        this._choiceValue = itemSalesTaxModRq;
    }

    /**
     * Sets the value of field 'itemSalesTaxQueryRq'.
     * 
     * @param itemSalesTaxQueryRq the value of field
     * 'itemSalesTaxQueryRq'.
     */
    public void setItemSalesTaxQueryRq(
            final org.chocolate_milk.model.ItemSalesTaxQueryRq itemSalesTaxQueryRq) {
        this._itemSalesTaxQueryRq = itemSalesTaxQueryRq;
        this._choiceValue = itemSalesTaxQueryRq;
    }

    /**
     * Sets the value of field 'itemServiceAddRq'.
     * 
     * @param itemServiceAddRq the value of field 'itemServiceAddRq'
     */
    public void setItemServiceAddRq(
            final org.chocolate_milk.model.ItemServiceAddRq itemServiceAddRq) {
        this._itemServiceAddRq = itemServiceAddRq;
        this._choiceValue = itemServiceAddRq;
    }

    /**
     * Sets the value of field 'itemServiceModRq'.
     * 
     * @param itemServiceModRq the value of field 'itemServiceModRq'
     */
    public void setItemServiceModRq(
            final org.chocolate_milk.model.ItemServiceModRq itemServiceModRq) {
        this._itemServiceModRq = itemServiceModRq;
        this._choiceValue = itemServiceModRq;
    }

    /**
     * Sets the value of field 'itemServiceQueryRq'.
     * 
     * @param itemServiceQueryRq the value of field
     * 'itemServiceQueryRq'.
     */
    public void setItemServiceQueryRq(
            final org.chocolate_milk.model.ItemServiceQueryRq itemServiceQueryRq) {
        this._itemServiceQueryRq = itemServiceQueryRq;
        this._choiceValue = itemServiceQueryRq;
    }

    /**
     * Sets the value of field 'itemSubtotalAddRq'.
     * 
     * @param itemSubtotalAddRq the value of field
     * 'itemSubtotalAddRq'.
     */
    public void setItemSubtotalAddRq(
            final org.chocolate_milk.model.ItemSubtotalAddRq itemSubtotalAddRq) {
        this._itemSubtotalAddRq = itemSubtotalAddRq;
        this._choiceValue = itemSubtotalAddRq;
    }

    /**
     * Sets the value of field 'itemSubtotalModRq'.
     * 
     * @param itemSubtotalModRq the value of field
     * 'itemSubtotalModRq'.
     */
    public void setItemSubtotalModRq(
            final org.chocolate_milk.model.ItemSubtotalModRq itemSubtotalModRq) {
        this._itemSubtotalModRq = itemSubtotalModRq;
        this._choiceValue = itemSubtotalModRq;
    }

    /**
     * Sets the value of field 'itemSubtotalQueryRq'.
     * 
     * @param itemSubtotalQueryRq the value of field
     * 'itemSubtotalQueryRq'.
     */
    public void setItemSubtotalQueryRq(
            final org.chocolate_milk.model.ItemSubtotalQueryRq itemSubtotalQueryRq) {
        this._itemSubtotalQueryRq = itemSubtotalQueryRq;
        this._choiceValue = itemSubtotalQueryRq;
    }

    /**
     * Sets the value of field 'jobReportQueryRq'.
     * 
     * @param jobReportQueryRq the value of field 'jobReportQueryRq'
     */
    public void setJobReportQueryRq(
            final org.chocolate_milk.model.JobReportQueryRq jobReportQueryRq) {
        this._jobReportQueryRq = jobReportQueryRq;
        this._choiceValue = jobReportQueryRq;
    }

    /**
     * Sets the value of field 'jobTypeAddRq'.
     * 
     * @param jobTypeAddRq the value of field 'jobTypeAddRq'.
     */
    public void setJobTypeAddRq(
            final org.chocolate_milk.model.JobTypeAddRq jobTypeAddRq) {
        this._jobTypeAddRq = jobTypeAddRq;
        this._choiceValue = jobTypeAddRq;
    }

    /**
     * Sets the value of field 'jobTypeQueryRq'.
     * 
     * @param jobTypeQueryRq the value of field 'jobTypeQueryRq'.
     */
    public void setJobTypeQueryRq(
            final org.chocolate_milk.model.JobTypeQueryRq jobTypeQueryRq) {
        this._jobTypeQueryRq = jobTypeQueryRq;
        this._choiceValue = jobTypeQueryRq;
    }

    /**
     * Sets the value of field 'journalEntryAddRq'.
     * 
     * @param journalEntryAddRq the value of field
     * 'journalEntryAddRq'.
     */
    public void setJournalEntryAddRq(
            final org.chocolate_milk.model.JournalEntryAddRq journalEntryAddRq) {
        this._journalEntryAddRq = journalEntryAddRq;
        this._choiceValue = journalEntryAddRq;
    }

    /**
     * Sets the value of field 'journalEntryModRq'.
     * 
     * @param journalEntryModRq the value of field
     * 'journalEntryModRq'.
     */
    public void setJournalEntryModRq(
            final org.chocolate_milk.model.JournalEntryModRq journalEntryModRq) {
        this._journalEntryModRq = journalEntryModRq;
        this._choiceValue = journalEntryModRq;
    }

    /**
     * Sets the value of field 'journalEntryQueryRq'.
     * 
     * @param journalEntryQueryRq the value of field
     * 'journalEntryQueryRq'.
     */
    public void setJournalEntryQueryRq(
            final org.chocolate_milk.model.JournalEntryQueryRq journalEntryQueryRq) {
        this._journalEntryQueryRq = journalEntryQueryRq;
        this._choiceValue = journalEntryQueryRq;
    }

    /**
     * Sets the value of field 'listDelRq'.
     * 
     * @param listDelRq the value of field 'listDelRq'.
     */
    public void setListDelRq(
            final org.chocolate_milk.model.ListDelRq listDelRq) {
        this._listDelRq = listDelRq;
        this._choiceValue = listDelRq;
    }

    /**
     * Sets the value of field 'listDeletedQueryRq'.
     * 
     * @param listDeletedQueryRq the value of field
     * 'listDeletedQueryRq'.
     */
    public void setListDeletedQueryRq(
            final org.chocolate_milk.model.ListDeletedQueryRq listDeletedQueryRq) {
        this._listDeletedQueryRq = listDeletedQueryRq;
        this._choiceValue = listDeletedQueryRq;
    }

    /**
     * Sets the value of field 'listDisplayAddRq'.
     * 
     * @param listDisplayAddRq the value of field 'listDisplayAddRq'
     */
    public void setListDisplayAddRq(
            final org.chocolate_milk.model.ListDisplayAddRq listDisplayAddRq) {
        this._listDisplayAddRq = listDisplayAddRq;
        this._choiceValue = listDisplayAddRq;
    }

    /**
     * Sets the value of field 'listDisplayModRq'.
     * 
     * @param listDisplayModRq the value of field 'listDisplayModRq'
     */
    public void setListDisplayModRq(
            final org.chocolate_milk.model.ListDisplayModRq listDisplayModRq) {
        this._listDisplayModRq = listDisplayModRq;
        this._choiceValue = listDisplayModRq;
    }

    /**
     * Sets the value of field 'listMergeRq'.
     * 
     * @param listMergeRq the value of field 'listMergeRq'.
     */
    public void setListMergeRq(
            final org.chocolate_milk.model.ListMergeRq listMergeRq) {
        this._listMergeRq = listMergeRq;
        this._choiceValue = listMergeRq;
    }

    /**
     * Sets the value of field 'otherNameAddRq'.
     * 
     * @param otherNameAddRq the value of field 'otherNameAddRq'.
     */
    public void setOtherNameAddRq(
            final org.chocolate_milk.model.OtherNameAddRq otherNameAddRq) {
        this._otherNameAddRq = otherNameAddRq;
        this._choiceValue = otherNameAddRq;
    }

    /**
     * Sets the value of field 'otherNameModRq'.
     * 
     * @param otherNameModRq the value of field 'otherNameModRq'.
     */
    public void setOtherNameModRq(
            final org.chocolate_milk.model.OtherNameModRq otherNameModRq) {
        this._otherNameModRq = otherNameModRq;
        this._choiceValue = otherNameModRq;
    }

    /**
     * Sets the value of field 'otherNameQueryRq'.
     * 
     * @param otherNameQueryRq the value of field 'otherNameQueryRq'
     */
    public void setOtherNameQueryRq(
            final org.chocolate_milk.model.OtherNameQueryRq otherNameQueryRq) {
        this._otherNameQueryRq = otherNameQueryRq;
        this._choiceValue = otherNameQueryRq;
    }

    /**
     * Sets the value of field 'paymentMethodAddRq'.
     * 
     * @param paymentMethodAddRq the value of field
     * 'paymentMethodAddRq'.
     */
    public void setPaymentMethodAddRq(
            final org.chocolate_milk.model.PaymentMethodAddRq paymentMethodAddRq) {
        this._paymentMethodAddRq = paymentMethodAddRq;
        this._choiceValue = paymentMethodAddRq;
    }

    /**
     * Sets the value of field 'paymentMethodQueryRq'.
     * 
     * @param paymentMethodQueryRq the value of field
     * 'paymentMethodQueryRq'.
     */
    public void setPaymentMethodQueryRq(
            final org.chocolate_milk.model.PaymentMethodQueryRq paymentMethodQueryRq) {
        this._paymentMethodQueryRq = paymentMethodQueryRq;
        this._choiceValue = paymentMethodQueryRq;
    }

    /**
     * Sets the value of field 'payrollDetailReportQueryRq'.
     * 
     * @param payrollDetailReportQueryRq the value of field
     * 'payrollDetailReportQueryRq'.
     */
    public void setPayrollDetailReportQueryRq(
            final org.chocolate_milk.model.PayrollDetailReportQueryRq payrollDetailReportQueryRq) {
        this._payrollDetailReportQueryRq = payrollDetailReportQueryRq;
        this._choiceValue = payrollDetailReportQueryRq;
    }

    /**
     * Sets the value of field 'payrollItemNonWageQueryRq'.
     * 
     * @param payrollItemNonWageQueryRq the value of field
     * 'payrollItemNonWageQueryRq'.
     */
    public void setPayrollItemNonWageQueryRq(
            final org.chocolate_milk.model.PayrollItemNonWageQueryRq payrollItemNonWageQueryRq) {
        this._payrollItemNonWageQueryRq = payrollItemNonWageQueryRq;
        this._choiceValue = payrollItemNonWageQueryRq;
    }

    /**
     * Sets the value of field 'payrollItemWageAddRq'.
     * 
     * @param payrollItemWageAddRq the value of field
     * 'payrollItemWageAddRq'.
     */
    public void setPayrollItemWageAddRq(
            final org.chocolate_milk.model.PayrollItemWageAddRq payrollItemWageAddRq) {
        this._payrollItemWageAddRq = payrollItemWageAddRq;
        this._choiceValue = payrollItemWageAddRq;
    }

    /**
     * Sets the value of field 'payrollItemWageQueryRq'.
     * 
     * @param payrollItemWageQueryRq the value of field
     * 'payrollItemWageQueryRq'.
     */
    public void setPayrollItemWageQueryRq(
            final org.chocolate_milk.model.PayrollItemWageQueryRq payrollItemWageQueryRq) {
        this._payrollItemWageQueryRq = payrollItemWageQueryRq;
        this._choiceValue = payrollItemWageQueryRq;
    }

    /**
     * Sets the value of field 'payrollLastPeriodQueryRq'.
     * 
     * @param payrollLastPeriodQueryRq the value of field
     * 'payrollLastPeriodQueryRq'.
     */
    public void setPayrollLastPeriodQueryRq(
            final org.chocolate_milk.model.PayrollLastPeriodQueryRq payrollLastPeriodQueryRq) {
        this._payrollLastPeriodQueryRq = payrollLastPeriodQueryRq;
        this._choiceValue = payrollLastPeriodQueryRq;
    }

    /**
     * Sets the value of field 'payrollSummaryReportQueryRq'.
     * 
     * @param payrollSummaryReportQueryRq the value of field
     * 'payrollSummaryReportQueryRq'.
     */
    public void setPayrollSummaryReportQueryRq(
            final org.chocolate_milk.model.PayrollSummaryReportQueryRq payrollSummaryReportQueryRq) {
        this._payrollSummaryReportQueryRq = payrollSummaryReportQueryRq;
        this._choiceValue = payrollSummaryReportQueryRq;
    }

    /**
     * Sets the value of field 'preferencesQueryRq'.
     * 
     * @param preferencesQueryRq the value of field
     * 'preferencesQueryRq'.
     */
    public void setPreferencesQueryRq(
            final org.chocolate_milk.model.PreferencesQueryRq preferencesQueryRq) {
        this._preferencesQueryRq = preferencesQueryRq;
        this._choiceValue = preferencesQueryRq;
    }

    /**
     * Sets the value of field 'priceLevelAddRq'.
     * 
     * @param priceLevelAddRq the value of field 'priceLevelAddRq'.
     */
    public void setPriceLevelAddRq(
            final org.chocolate_milk.model.PriceLevelAddRq priceLevelAddRq) {
        this._priceLevelAddRq = priceLevelAddRq;
        this._choiceValue = priceLevelAddRq;
    }

    /**
     * Sets the value of field 'priceLevelModRq'.
     * 
     * @param priceLevelModRq the value of field 'priceLevelModRq'.
     */
    public void setPriceLevelModRq(
            final org.chocolate_milk.model.PriceLevelModRq priceLevelModRq) {
        this._priceLevelModRq = priceLevelModRq;
        this._choiceValue = priceLevelModRq;
    }

    /**
     * Sets the value of field 'priceLevelQueryRq'.
     * 
     * @param priceLevelQueryRq the value of field
     * 'priceLevelQueryRq'.
     */
    public void setPriceLevelQueryRq(
            final org.chocolate_milk.model.PriceLevelQueryRq priceLevelQueryRq) {
        this._priceLevelQueryRq = priceLevelQueryRq;
        this._choiceValue = priceLevelQueryRq;
    }

    /**
     * Sets the value of field 'purchaseOrderAddRq'.
     * 
     * @param purchaseOrderAddRq the value of field
     * 'purchaseOrderAddRq'.
     */
    public void setPurchaseOrderAddRq(
            final org.chocolate_milk.model.PurchaseOrderAddRq purchaseOrderAddRq) {
        this._purchaseOrderAddRq = purchaseOrderAddRq;
        this._choiceValue = purchaseOrderAddRq;
    }

    /**
     * Sets the value of field 'purchaseOrderModRq'.
     * 
     * @param purchaseOrderModRq the value of field
     * 'purchaseOrderModRq'.
     */
    public void setPurchaseOrderModRq(
            final org.chocolate_milk.model.PurchaseOrderModRq purchaseOrderModRq) {
        this._purchaseOrderModRq = purchaseOrderModRq;
        this._choiceValue = purchaseOrderModRq;
    }

    /**
     * Sets the value of field 'purchaseOrderQueryRq'.
     * 
     * @param purchaseOrderQueryRq the value of field
     * 'purchaseOrderQueryRq'.
     */
    public void setPurchaseOrderQueryRq(
            final org.chocolate_milk.model.PurchaseOrderQueryRq purchaseOrderQueryRq) {
        this._purchaseOrderQueryRq = purchaseOrderQueryRq;
        this._choiceValue = purchaseOrderQueryRq;
    }

    /**
     * Sets the value of field 'receivePaymentAddRq'.
     * 
     * @param receivePaymentAddRq the value of field
     * 'receivePaymentAddRq'.
     */
    public void setReceivePaymentAddRq(
            final org.chocolate_milk.model.ReceivePaymentAddRq receivePaymentAddRq) {
        this._receivePaymentAddRq = receivePaymentAddRq;
        this._choiceValue = receivePaymentAddRq;
    }

    /**
     * Sets the value of field 'receivePaymentModRq'.
     * 
     * @param receivePaymentModRq the value of field
     * 'receivePaymentModRq'.
     */
    public void setReceivePaymentModRq(
            final org.chocolate_milk.model.ReceivePaymentModRq receivePaymentModRq) {
        this._receivePaymentModRq = receivePaymentModRq;
        this._choiceValue = receivePaymentModRq;
    }

    /**
     * Sets the value of field 'receivePaymentQueryRq'.
     * 
     * @param receivePaymentQueryRq the value of field
     * 'receivePaymentQueryRq'.
     */
    public void setReceivePaymentQueryRq(
            final org.chocolate_milk.model.ReceivePaymentQueryRq receivePaymentQueryRq) {
        this._receivePaymentQueryRq = receivePaymentQueryRq;
        this._choiceValue = receivePaymentQueryRq;
    }

    /**
     * Sets the value of field 'receivePaymentToDepositQueryRq'.
     * 
     * @param receivePaymentToDepositQueryRq the value of field
     * 'receivePaymentToDepositQueryRq'.
     */
    public void setReceivePaymentToDepositQueryRq(
            final org.chocolate_milk.model.ReceivePaymentToDepositQueryRq receivePaymentToDepositQueryRq) {
        this._receivePaymentToDepositQueryRq = receivePaymentToDepositQueryRq;
        this._choiceValue = receivePaymentToDepositQueryRq;
    }

    /**
     * Sets the value of field 'salesOrderAddRq'.
     * 
     * @param salesOrderAddRq the value of field 'salesOrderAddRq'.
     */
    public void setSalesOrderAddRq(
            final org.chocolate_milk.model.SalesOrderAddRq salesOrderAddRq) {
        this._salesOrderAddRq = salesOrderAddRq;
        this._choiceValue = salesOrderAddRq;
    }

    /**
     * Sets the value of field 'salesOrderModRq'.
     * 
     * @param salesOrderModRq the value of field 'salesOrderModRq'.
     */
    public void setSalesOrderModRq(
            final org.chocolate_milk.model.SalesOrderModRq salesOrderModRq) {
        this._salesOrderModRq = salesOrderModRq;
        this._choiceValue = salesOrderModRq;
    }

    /**
     * Sets the value of field 'salesOrderQueryRq'.
     * 
     * @param salesOrderQueryRq the value of field
     * 'salesOrderQueryRq'.
     */
    public void setSalesOrderQueryRq(
            final org.chocolate_milk.model.SalesOrderQueryRq salesOrderQueryRq) {
        this._salesOrderQueryRq = salesOrderQueryRq;
        this._choiceValue = salesOrderQueryRq;
    }

    /**
     * Sets the value of field 'salesReceiptAddRq'.
     * 
     * @param salesReceiptAddRq the value of field
     * 'salesReceiptAddRq'.
     */
    public void setSalesReceiptAddRq(
            final org.chocolate_milk.model.SalesReceiptAddRq salesReceiptAddRq) {
        this._salesReceiptAddRq = salesReceiptAddRq;
        this._choiceValue = salesReceiptAddRq;
    }

    /**
     * Sets the value of field 'salesReceiptModRq'.
     * 
     * @param salesReceiptModRq the value of field
     * 'salesReceiptModRq'.
     */
    public void setSalesReceiptModRq(
            final org.chocolate_milk.model.SalesReceiptModRq salesReceiptModRq) {
        this._salesReceiptModRq = salesReceiptModRq;
        this._choiceValue = salesReceiptModRq;
    }

    /**
     * Sets the value of field 'salesReceiptQueryRq'.
     * 
     * @param salesReceiptQueryRq the value of field
     * 'salesReceiptQueryRq'.
     */
    public void setSalesReceiptQueryRq(
            final org.chocolate_milk.model.SalesReceiptQueryRq salesReceiptQueryRq) {
        this._salesReceiptQueryRq = salesReceiptQueryRq;
        this._choiceValue = salesReceiptQueryRq;
    }

    /**
     * Sets the value of field 'salesRepAddRq'.
     * 
     * @param salesRepAddRq the value of field 'salesRepAddRq'.
     */
    public void setSalesRepAddRq(
            final org.chocolate_milk.model.SalesRepAddRq salesRepAddRq) {
        this._salesRepAddRq = salesRepAddRq;
        this._choiceValue = salesRepAddRq;
    }

    /**
     * Sets the value of field 'salesRepModRq'.
     * 
     * @param salesRepModRq the value of field 'salesRepModRq'.
     */
    public void setSalesRepModRq(
            final org.chocolate_milk.model.SalesRepModRq salesRepModRq) {
        this._salesRepModRq = salesRepModRq;
        this._choiceValue = salesRepModRq;
    }

    /**
     * Sets the value of field 'salesRepQueryRq'.
     * 
     * @param salesRepQueryRq the value of field 'salesRepQueryRq'.
     */
    public void setSalesRepQueryRq(
            final org.chocolate_milk.model.SalesRepQueryRq salesRepQueryRq) {
        this._salesRepQueryRq = salesRepQueryRq;
        this._choiceValue = salesRepQueryRq;
    }

    /**
     * Sets the value of field 'salesTaxCodeAddRq'.
     * 
     * @param salesTaxCodeAddRq the value of field
     * 'salesTaxCodeAddRq'.
     */
    public void setSalesTaxCodeAddRq(
            final org.chocolate_milk.model.SalesTaxCodeAddRq salesTaxCodeAddRq) {
        this._salesTaxCodeAddRq = salesTaxCodeAddRq;
        this._choiceValue = salesTaxCodeAddRq;
    }

    /**
     * Sets the value of field 'salesTaxCodeModRq'.
     * 
     * @param salesTaxCodeModRq the value of field
     * 'salesTaxCodeModRq'.
     */
    public void setSalesTaxCodeModRq(
            final org.chocolate_milk.model.SalesTaxCodeModRq salesTaxCodeModRq) {
        this._salesTaxCodeModRq = salesTaxCodeModRq;
        this._choiceValue = salesTaxCodeModRq;
    }

    /**
     * Sets the value of field 'salesTaxCodeQueryRq'.
     * 
     * @param salesTaxCodeQueryRq the value of field
     * 'salesTaxCodeQueryRq'.
     */
    public void setSalesTaxCodeQueryRq(
            final org.chocolate_milk.model.SalesTaxCodeQueryRq salesTaxCodeQueryRq) {
        this._salesTaxCodeQueryRq = salesTaxCodeQueryRq;
        this._choiceValue = salesTaxCodeQueryRq;
    }

    /**
     * Sets the value of field 'salesTaxPaymentCheckQueryRq'.
     * 
     * @param salesTaxPaymentCheckQueryRq the value of field
     * 'salesTaxPaymentCheckQueryRq'.
     */
    public void setSalesTaxPaymentCheckQueryRq(
            final org.chocolate_milk.model.SalesTaxPaymentCheckQueryRq salesTaxPaymentCheckQueryRq) {
        this._salesTaxPaymentCheckQueryRq = salesTaxPaymentCheckQueryRq;
        this._choiceValue = salesTaxPaymentCheckQueryRq;
    }

    /**
     * Sets the value of field 'salesTaxReturnLineQueryRq'.
     * 
     * @param salesTaxReturnLineQueryRq the value of field
     * 'salesTaxReturnLineQueryRq'.
     */
    public void setSalesTaxReturnLineQueryRq(
            final org.chocolate_milk.model.SalesTaxReturnLineQueryRq salesTaxReturnLineQueryRq) {
        this._salesTaxReturnLineQueryRq = salesTaxReturnLineQueryRq;
        this._choiceValue = salesTaxReturnLineQueryRq;
    }

    /**
     * Sets the value of field 'salesTaxReturnQueryRq'.
     * 
     * @param salesTaxReturnQueryRq the value of field
     * 'salesTaxReturnQueryRq'.
     */
    public void setSalesTaxReturnQueryRq(
            final org.chocolate_milk.model.SalesTaxReturnQueryRq salesTaxReturnQueryRq) {
        this._salesTaxReturnQueryRq = salesTaxReturnQueryRq;
        this._choiceValue = salesTaxReturnQueryRq;
    }

    /**
     * Sets the value of field 'shipMethodAddRq'.
     * 
     * @param shipMethodAddRq the value of field 'shipMethodAddRq'.
     */
    public void setShipMethodAddRq(
            final org.chocolate_milk.model.ShipMethodAddRq shipMethodAddRq) {
        this._shipMethodAddRq = shipMethodAddRq;
        this._choiceValue = shipMethodAddRq;
    }

    /**
     * Sets the value of field 'shipMethodQueryRq'.
     * 
     * @param shipMethodQueryRq the value of field
     * 'shipMethodQueryRq'.
     */
    public void setShipMethodQueryRq(
            final org.chocolate_milk.model.ShipMethodQueryRq shipMethodQueryRq) {
        this._shipMethodQueryRq = shipMethodQueryRq;
        this._choiceValue = shipMethodQueryRq;
    }

    /**
     * Sets the value of field 'specialAccountAddRq'.
     * 
     * @param specialAccountAddRq the value of field
     * 'specialAccountAddRq'.
     */
    public void setSpecialAccountAddRq(
            final org.chocolate_milk.model.SpecialAccountAddRq specialAccountAddRq) {
        this._specialAccountAddRq = specialAccountAddRq;
        this._choiceValue = specialAccountAddRq;
    }

    /**
     * Sets the value of field 'specialItemAddRq'.
     * 
     * @param specialItemAddRq the value of field 'specialItemAddRq'
     */
    public void setSpecialItemAddRq(
            final org.chocolate_milk.model.SpecialItemAddRq specialItemAddRq) {
        this._specialItemAddRq = specialItemAddRq;
        this._choiceValue = specialItemAddRq;
    }

    /**
     * Sets the value of field 'standardTermsAddRq'.
     * 
     * @param standardTermsAddRq the value of field
     * 'standardTermsAddRq'.
     */
    public void setStandardTermsAddRq(
            final org.chocolate_milk.model.StandardTermsAddRq standardTermsAddRq) {
        this._standardTermsAddRq = standardTermsAddRq;
        this._choiceValue = standardTermsAddRq;
    }

    /**
     * Sets the value of field 'standardTermsQueryRq'.
     * 
     * @param standardTermsQueryRq the value of field
     * 'standardTermsQueryRq'.
     */
    public void setStandardTermsQueryRq(
            final org.chocolate_milk.model.StandardTermsQueryRq standardTermsQueryRq) {
        this._standardTermsQueryRq = standardTermsQueryRq;
        this._choiceValue = standardTermsQueryRq;
    }

    /**
     * Sets the value of field 'templateQueryRq'.
     * 
     * @param templateQueryRq the value of field 'templateQueryRq'.
     */
    public void setTemplateQueryRq(
            final org.chocolate_milk.model.TemplateQueryRq templateQueryRq) {
        this._templateQueryRq = templateQueryRq;
        this._choiceValue = templateQueryRq;
    }

    /**
     * Sets the value of field 'termsQueryRq'.
     * 
     * @param termsQueryRq the value of field 'termsQueryRq'.
     */
    public void setTermsQueryRq(
            final org.chocolate_milk.model.TermsQueryRq termsQueryRq) {
        this._termsQueryRq = termsQueryRq;
        this._choiceValue = termsQueryRq;
    }

    /**
     * Sets the value of field 'timeReportQueryRq'.
     * 
     * @param timeReportQueryRq the value of field
     * 'timeReportQueryRq'.
     */
    public void setTimeReportQueryRq(
            final org.chocolate_milk.model.TimeReportQueryRq timeReportQueryRq) {
        this._timeReportQueryRq = timeReportQueryRq;
        this._choiceValue = timeReportQueryRq;
    }

    /**
     * Sets the value of field 'timeTrackingAddRq'.
     * 
     * @param timeTrackingAddRq the value of field
     * 'timeTrackingAddRq'.
     */
    public void setTimeTrackingAddRq(
            final org.chocolate_milk.model.TimeTrackingAddRq timeTrackingAddRq) {
        this._timeTrackingAddRq = timeTrackingAddRq;
        this._choiceValue = timeTrackingAddRq;
    }

    /**
     * Sets the value of field 'timeTrackingModRq'.
     * 
     * @param timeTrackingModRq the value of field
     * 'timeTrackingModRq'.
     */
    public void setTimeTrackingModRq(
            final org.chocolate_milk.model.TimeTrackingModRq timeTrackingModRq) {
        this._timeTrackingModRq = timeTrackingModRq;
        this._choiceValue = timeTrackingModRq;
    }

    /**
     * Sets the value of field 'timeTrackingQueryRq'.
     * 
     * @param timeTrackingQueryRq the value of field
     * 'timeTrackingQueryRq'.
     */
    public void setTimeTrackingQueryRq(
            final org.chocolate_milk.model.TimeTrackingQueryRq timeTrackingQueryRq) {
        this._timeTrackingQueryRq = timeTrackingQueryRq;
        this._choiceValue = timeTrackingQueryRq;
    }

    /**
     * Sets the value of field 'toDoAddRq'.
     * 
     * @param toDoAddRq the value of field 'toDoAddRq'.
     */
    public void setToDoAddRq(
            final org.chocolate_milk.model.ToDoAddRq toDoAddRq) {
        this._toDoAddRq = toDoAddRq;
        this._choiceValue = toDoAddRq;
    }

    /**
     * Sets the value of field 'toDoQueryRq'.
     * 
     * @param toDoQueryRq the value of field 'toDoQueryRq'.
     */
    public void setToDoQueryRq(
            final org.chocolate_milk.model.ToDoQueryRq toDoQueryRq) {
        this._toDoQueryRq = toDoQueryRq;
        this._choiceValue = toDoQueryRq;
    }

    /**
     * Sets the value of field 'transactionQueryRq'.
     * 
     * @param transactionQueryRq the value of field
     * 'transactionQueryRq'.
     */
    public void setTransactionQueryRq(
            final org.chocolate_milk.model.TransactionQueryRq transactionQueryRq) {
        this._transactionQueryRq = transactionQueryRq;
        this._choiceValue = transactionQueryRq;
    }

    /**
     * Sets the value of field 'txnDelRq'.
     * 
     * @param txnDelRq the value of field 'txnDelRq'.
     */
    public void setTxnDelRq(
            final org.chocolate_milk.model.TxnDelRq txnDelRq) {
        this._txnDelRq = txnDelRq;
        this._choiceValue = txnDelRq;
    }

    /**
     * Sets the value of field 'txnDeletedQueryRq'.
     * 
     * @param txnDeletedQueryRq the value of field
     * 'txnDeletedQueryRq'.
     */
    public void setTxnDeletedQueryRq(
            final org.chocolate_milk.model.TxnDeletedQueryRq txnDeletedQueryRq) {
        this._txnDeletedQueryRq = txnDeletedQueryRq;
        this._choiceValue = txnDeletedQueryRq;
    }

    /**
     * Sets the value of field 'txnDisplayAddRq'.
     * 
     * @param txnDisplayAddRq the value of field 'txnDisplayAddRq'.
     */
    public void setTxnDisplayAddRq(
            final org.chocolate_milk.model.TxnDisplayAddRq txnDisplayAddRq) {
        this._txnDisplayAddRq = txnDisplayAddRq;
        this._choiceValue = txnDisplayAddRq;
    }

    /**
     * Sets the value of field 'txnDisplayModRq'.
     * 
     * @param txnDisplayModRq the value of field 'txnDisplayModRq'.
     */
    public void setTxnDisplayModRq(
            final org.chocolate_milk.model.TxnDisplayModRq txnDisplayModRq) {
        this._txnDisplayModRq = txnDisplayModRq;
        this._choiceValue = txnDisplayModRq;
    }

    /**
     * Sets the value of field 'txnVoidRq'.
     * 
     * @param txnVoidRq the value of field 'txnVoidRq'.
     */
    public void setTxnVoidRq(
            final org.chocolate_milk.model.TxnVoidRq txnVoidRq) {
        this._txnVoidRq = txnVoidRq;
        this._choiceValue = txnVoidRq;
    }

    /**
     * Sets the value of field 'unitOfMeasureSetAddRq'.
     * 
     * @param unitOfMeasureSetAddRq the value of field
     * 'unitOfMeasureSetAddRq'.
     */
    public void setUnitOfMeasureSetAddRq(
            final org.chocolate_milk.model.UnitOfMeasureSetAddRq unitOfMeasureSetAddRq) {
        this._unitOfMeasureSetAddRq = unitOfMeasureSetAddRq;
        this._choiceValue = unitOfMeasureSetAddRq;
    }

    /**
     * Sets the value of field 'unitOfMeasureSetQueryRq'.
     * 
     * @param unitOfMeasureSetQueryRq the value of field
     * 'unitOfMeasureSetQueryRq'.
     */
    public void setUnitOfMeasureSetQueryRq(
            final org.chocolate_milk.model.UnitOfMeasureSetQueryRq unitOfMeasureSetQueryRq) {
        this._unitOfMeasureSetQueryRq = unitOfMeasureSetQueryRq;
        this._choiceValue = unitOfMeasureSetQueryRq;
    }

    /**
     * Sets the value of field 'vehicleAddRq'.
     * 
     * @param vehicleAddRq the value of field 'vehicleAddRq'.
     */
    public void setVehicleAddRq(
            final org.chocolate_milk.model.VehicleAddRq vehicleAddRq) {
        this._vehicleAddRq = vehicleAddRq;
        this._choiceValue = vehicleAddRq;
    }

    /**
     * Sets the value of field 'vehicleMileageAddRq'.
     * 
     * @param vehicleMileageAddRq the value of field
     * 'vehicleMileageAddRq'.
     */
    public void setVehicleMileageAddRq(
            final org.chocolate_milk.model.VehicleMileageAddRq vehicleMileageAddRq) {
        this._vehicleMileageAddRq = vehicleMileageAddRq;
        this._choiceValue = vehicleMileageAddRq;
    }

    /**
     * Sets the value of field 'vehicleMileageQueryRq'.
     * 
     * @param vehicleMileageQueryRq the value of field
     * 'vehicleMileageQueryRq'.
     */
    public void setVehicleMileageQueryRq(
            final org.chocolate_milk.model.VehicleMileageQueryRq vehicleMileageQueryRq) {
        this._vehicleMileageQueryRq = vehicleMileageQueryRq;
        this._choiceValue = vehicleMileageQueryRq;
    }

    /**
     * Sets the value of field 'vehicleModRq'.
     * 
     * @param vehicleModRq the value of field 'vehicleModRq'.
     */
    public void setVehicleModRq(
            final org.chocolate_milk.model.VehicleModRq vehicleModRq) {
        this._vehicleModRq = vehicleModRq;
        this._choiceValue = vehicleModRq;
    }

    /**
     * Sets the value of field 'vehicleQueryRq'.
     * 
     * @param vehicleQueryRq the value of field 'vehicleQueryRq'.
     */
    public void setVehicleQueryRq(
            final org.chocolate_milk.model.VehicleQueryRq vehicleQueryRq) {
        this._vehicleQueryRq = vehicleQueryRq;
        this._choiceValue = vehicleQueryRq;
    }

    /**
     * Sets the value of field 'vendorAddRq'.
     * 
     * @param vendorAddRq the value of field 'vendorAddRq'.
     */
    public void setVendorAddRq(
            final org.chocolate_milk.model.VendorAddRq vendorAddRq) {
        this._vendorAddRq = vendorAddRq;
        this._choiceValue = vendorAddRq;
    }

    /**
     * Sets the value of field 'vendorCreditAddRq'.
     * 
     * @param vendorCreditAddRq the value of field
     * 'vendorCreditAddRq'.
     */
    public void setVendorCreditAddRq(
            final org.chocolate_milk.model.VendorCreditAddRq vendorCreditAddRq) {
        this._vendorCreditAddRq = vendorCreditAddRq;
        this._choiceValue = vendorCreditAddRq;
    }

    /**
     * Sets the value of field 'vendorCreditModRq'.
     * 
     * @param vendorCreditModRq the value of field
     * 'vendorCreditModRq'.
     */
    public void setVendorCreditModRq(
            final org.chocolate_milk.model.VendorCreditModRq vendorCreditModRq) {
        this._vendorCreditModRq = vendorCreditModRq;
        this._choiceValue = vendorCreditModRq;
    }

    /**
     * Sets the value of field 'vendorCreditQueryRq'.
     * 
     * @param vendorCreditQueryRq the value of field
     * 'vendorCreditQueryRq'.
     */
    public void setVendorCreditQueryRq(
            final org.chocolate_milk.model.VendorCreditQueryRq vendorCreditQueryRq) {
        this._vendorCreditQueryRq = vendorCreditQueryRq;
        this._choiceValue = vendorCreditQueryRq;
    }

    /**
     * Sets the value of field 'vendorModRq'.
     * 
     * @param vendorModRq the value of field 'vendorModRq'.
     */
    public void setVendorModRq(
            final org.chocolate_milk.model.VendorModRq vendorModRq) {
        this._vendorModRq = vendorModRq;
        this._choiceValue = vendorModRq;
    }

    /**
     * Sets the value of field 'vendorQueryRq'.
     * 
     * @param vendorQueryRq the value of field 'vendorQueryRq'.
     */
    public void setVendorQueryRq(
            final org.chocolate_milk.model.VendorQueryRq vendorQueryRq) {
        this._vendorQueryRq = vendorQueryRq;
        this._choiceValue = vendorQueryRq;
    }

    /**
     * Sets the value of field 'vendorTypeAddRq'.
     * 
     * @param vendorTypeAddRq the value of field 'vendorTypeAddRq'.
     */
    public void setVendorTypeAddRq(
            final org.chocolate_milk.model.VendorTypeAddRq vendorTypeAddRq) {
        this._vendorTypeAddRq = vendorTypeAddRq;
        this._choiceValue = vendorTypeAddRq;
    }

    /**
     * Sets the value of field 'vendorTypeQueryRq'.
     * 
     * @param vendorTypeQueryRq the value of field
     * 'vendorTypeQueryRq'.
     */
    public void setVendorTypeQueryRq(
            final org.chocolate_milk.model.VendorTypeQueryRq vendorTypeQueryRq) {
        this._vendorTypeQueryRq = vendorTypeQueryRq;
        this._choiceValue = vendorTypeQueryRq;
    }

    /**
     * Sets the value of field 'workersCompCodeAddRq'.
     * 
     * @param workersCompCodeAddRq the value of field
     * 'workersCompCodeAddRq'.
     */
    public void setWorkersCompCodeAddRq(
            final org.chocolate_milk.model.WorkersCompCodeAddRq workersCompCodeAddRq) {
        this._workersCompCodeAddRq = workersCompCodeAddRq;
        this._choiceValue = workersCompCodeAddRq;
    }

    /**
     * Sets the value of field 'workersCompCodeModRq'.
     * 
     * @param workersCompCodeModRq the value of field
     * 'workersCompCodeModRq'.
     */
    public void setWorkersCompCodeModRq(
            final org.chocolate_milk.model.WorkersCompCodeModRq workersCompCodeModRq) {
        this._workersCompCodeModRq = workersCompCodeModRq;
        this._choiceValue = workersCompCodeModRq;
    }

    /**
     * Sets the value of field 'workersCompCodeQueryRq'.
     * 
     * @param workersCompCodeQueryRq the value of field
     * 'workersCompCodeQueryRq'.
     */
    public void setWorkersCompCodeQueryRq(
            final org.chocolate_milk.model.WorkersCompCodeQueryRq workersCompCodeQueryRq) {
        this._workersCompCodeQueryRq = workersCompCodeQueryRq;
        this._choiceValue = workersCompCodeQueryRq;
    }

}
