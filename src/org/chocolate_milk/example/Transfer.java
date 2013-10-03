/*
 * Transfer.java
 *
 * Created on Oct 31, 2007, 8:50:22 PM
 *
 * Example of code (I) used to make a one off transfer of invoices
 * from one file to a new file.
 */

package org.chocolate_milk.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.chocolate_milk.Constants.CONSTANTS;
import org.chocolate_milk.controller.jacob.*;
import org.chocolate_milk.model.*;
import org.chocolate_milk.model.types.*;
import org.chocolate_milk.controller.JNIClient;
import org.chocolate_milk.controller.Client;


/**
 *
 * @author ryan
 */
public class Transfer {

    
 public static void main(String[] args) {

        String invoiceNumbers = "38217,38218,40714,44682,44991,45131,45598,45651,45655,45656,47364";

        String oldFileName = "Y:\\archive.qbw";

        int fileMode = FileModeE.openDoNotCare;

        String newFileName = "Y:\\newfile.qbw";
        

        
        String[] invoices = invoiceNumbers.split(",");


        JNIClient newClient = new JNIClient(newFileName, FileModeE.openDoNotCare, CONSTANTS.DEFAULT_APPID.getProperty(), CONSTANTS.DEFAULT_APPNAME.getProperty());
        JNIClient archiveClient = new JNIClient(oldFileName, FileModeE.openDoNotCare, CONSTANTS.DEFAULT_APPID.getProperty(), CONSTANTS.DEFAULT_APPNAME.getProperty());
        try {

            //Quickbooks fetches our invoices
            QBXML responseQBXML = getInvoices(invoices, archiveClient);

            //Contains all the invoices found by QB
            QBXMLMsgsRsItem[] items = responseQBXML.getQBXMLSequence2().getQBXMLSequence2Choice().getQBXMLMsgsRs().getQBXMLMsgsRsItem();


            //To be filled with invoices to create
            QBXML createInvoicesXML = getRequestDocument();
            QBXMLMsgsRq qbXMLMsgsRq2 = createInvoicesXML.getQBXMLSequence().getQBXMLSequenceChoice().getQBXMLMsgsRq();



            for (int i = 0; i < items.length; i++) {

                InvoiceRet[] rets = items[i].getInvoiceQueryRs().getInvoiceRet();

                for (InvoiceRet ret : rets) {

                    InvoiceRetChoiceItem[] list = ret.getInvoiceRetChoice().getInvoiceRetChoiceItem();

                    QBXMLMsgsRqItem addClass = addClass(ret.getClassRef());

                    if (addClass != null) {
                        qbXMLMsgsRq2.addQBXMLMsgsRqItem(addClass);
                   }

                    qbXMLMsgsRq2.addQBXMLMsgsRqItem(addInvoice(ret));
                }
            }




            QBXML createResponse = newClient.exchangeXML(createInvoicesXML);

            StringWriter writer = new StringWriter();

            createResponse.marshal(writer);

            System.out.print(writer.toString());


        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    

    public static QBXMLMsgsRqItem addClass(ClassRef classRef) {
        if (classRef == null || classRef.getListRef() == null) {
            return null;
        }
        QBXMLMsgsRqItem qmri = new QBXMLMsgsRqItem();

        ClassAddRq classAddRq = new ClassAddRq();

        qmri.setClassAddRq(classAddRq);

        ClassAdd classAdd = new ClassAdd();

        classAddRq.setClassAdd(classAdd);

        classAdd.setIsActive("1");
        classAdd.setName(classRef.getListRef().getFullName());

        return qmri;
    }

    public static QBXMLMsgsRqItem queryInvoice(String[] numbers) {
        QBXMLMsgsRqItem qmri = new QBXMLMsgsRqItem();
        InvoiceQueryRq request = new InvoiceQueryRq();
        qmri.setInvoiceQueryRq(request);
        request.setMetaData(InvoiceQueryRqTypeMetaDataType.NOMETADATA);


        InvoiceQuery query = new InvoiceQuery();
        request.setInvoiceQuery(query);
        query.setIncludeLineItems("1");
        query.setIncludeLinkedTxns("1");


        InvoiceQueryChoice invoiceQueryChoice = new InvoiceQueryChoice();
        invoiceQueryChoice.setRefNumber(numbers);
        query.setInvoiceQueryChoice(invoiceQueryChoice);

        qmri.setInvoiceQueryRq(request);

        return qmri;
    }

    public static QBXML getRequestDocument() {
        QBXML qbxml = new QBXML();
        QBXMLSequence qbxmlsequence = new QBXMLSequence();
        qbxml.setQBXMLSequence(qbxmlsequence);
        QBXMLSequenceChoice seqChoice = new QBXMLSequenceChoice();
        qbxmlsequence.setQBXMLSequenceChoice(seqChoice);
        QBXMLMsgsRq qbXMLMsgsRq = new QBXMLMsgsRq();
        seqChoice.setQBXMLMsgsRq(qbXMLMsgsRq);
        qbXMLMsgsRq.setOnError(QBXMLMsgsRqItemOnErrorType.CONTINUEONERROR);

        return qbxml;
    }

    public static QBXML getInvoices(String[] invNums, Client client) {
        QBXML responseQBXML = null;
        try {

            QBXML document = getRequestDocument();
            QBXMLMsgsRq qbXMLMsgsRq = document.getQBXMLSequence().getQBXMLSequenceChoice().getQBXMLMsgsRq();
            qbXMLMsgsRq.addQBXMLMsgsRqItem(queryInvoice(invNums));

            

            responseQBXML= client.exchangeXML(document);

            
        } catch (Exception e) {
            e.printStackTrace();
            //logger.error("error getting invoices", e);
        }
        return responseQBXML;
    }

   

   



    
    public static QBXMLMsgsRqItem addInvoice(InvoiceRet ret) {
        QBXMLMsgsRqItem qmri = new QBXMLMsgsRqItem();
        InvoiceAddRq invAddRq = new InvoiceAddRq();
        qmri.setInvoiceAddRq(invAddRq);
        invAddRq.setRequestID(ret.getRefNumber());
        InvoiceAdd add = new InvoiceAdd();
        invAddRq.setInvoiceAdd(add);

        try {

            if (ret.getARAccountRef() != null) {
                ret.getARAccountRef().getListRef().setListID(null);
                add.setARAccountRef(ret.getARAccountRef());
            }

            add.setBillAddress(ret.getBillAddress());
            if (ret.getClassRef() != null) {
                ret.getClassRef().getListRef().setListID(null);
                add.setClassRef(ret.getClassRef());
            }

            if (ret.getCustomerMsgRef() != null) {
                add.setCustomerMsgRef(ret.getCustomerMsgRef());
                add.getCustomerMsgRef().getCustomerMsgListRef().setListID(null);
            }
            if (ret.getCustomerRef() != null) {
                add.setCustomerRef(ret.getCustomerRef());
                add.getCustomerRef().getCustomerListRef().setListID(null);
            }
            add.setDueDate(ret.getDueDate());
            add.setFOB(ret.getFOB());
            add.setIsPending(ret.getIsPending());
            add.setIsToBePrinted(ret.getIsToBePrinted());
            add.setMemo(ret.getMemo());

            add.setPONumber(ret.getPONumber());
            add.setRefNumber(ret.getRefNumber());
            //add.setSalesRepRef(ret.getSalesRepRef());
            add.setShipAddress(ret.getShipAddress());
            add.setShipDate(ret.getShipDate());

            if (ret.getShipMethodRef() != null) {
                ret.getShipMethodRef().getShipMethodListRef().setListID(null);
                add.setShipMethodRef(ret.getShipMethodRef());
            }

            
            //add.setTemplateRef(ret.getTemplateRef());
            if(ret.getTermsRef() != null){
                ret.getTermsRef().getSimpleListRef().setListID(null);
                add.setTermsRef(ret.getTermsRef());
            
            }
            
            add.setTxnDate(ret.getTxnDate());
            InvoiceAddChoice invoiceAddChoice = new InvoiceAddChoice();
            add.setInvoiceAddChoice(invoiceAddChoice);




            InvoiceRetChoiceItem[] list = ret.getInvoiceRetChoice().getInvoiceRetChoiceItem();
            for (InvoiceRetChoiceItem item : list) {



                InvoiceAddChoiceItem vInvoiceAddChoiceItem = new InvoiceAddChoiceItem();
                invoiceAddChoice.addInvoiceAddChoiceItem(vInvoiceAddChoiceItem);

                InvoiceLineAdd invoiceLineAdd = new InvoiceLineAdd();
                vInvoiceAddChoiceItem.setInvoiceLineAdd(invoiceLineAdd);


                TxnLineCorePriceLevelAdd txnLineCorePriceLevelAdd = new TxnLineCorePriceLevelAdd();

                invoiceLineAdd.setTxnLineCorePriceLevelAdd(txnLineCorePriceLevelAdd);



                InvoiceLineRet retter = item.getInvoiceLineRet();

                if (retter != null) {
                    TxnLineCore retCore = retter.getTxnLineCore();
                    if (retCore != null) {
                        if (null != retCore.getAmount()) {
                            txnLineCorePriceLevelAdd.setAmount(retCore.getAmount());
                        }
                        if (null != retCore.getClassRef()) {
                            txnLineCorePriceLevelAdd.setClassRef(retCore.getClassRef());
                            txnLineCorePriceLevelAdd.getClassRef().getListRef().setListID(null);
                        }
                        if (null != retCore.getDesc()) {
                            txnLineCorePriceLevelAdd.setDesc(retCore.getDesc());
                        }
                        if (null != retCore.getQuantity()) {
                            txnLineCorePriceLevelAdd.setQuantity(retCore.getQuantity());
                        }
                        if (null != retCore.getItemRef()) {
                            txnLineCorePriceLevelAdd.setItemRef(retCore.getItemRef());
                            txnLineCorePriceLevelAdd.getItemRef().getGenericListRef().setListID(null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qmri;
    }
}