/*
 * The client interface defines the different ways we send/recv qbxml to quickbooks. 
 */
package org.chocolate_milk.controller;

import org.chocolate_milk.model.*;

/**
 *
 * @author ryan
 */
public interface Client {
   

    /*
     * Sends QBXMLMsgsRs object requests to quickbooks and returns a QBXMLMsgsRs object response from quickbooks
     */

    QBXMLMsgsRs exchangeXML(QBXMLMsgsRq request) throws Exception;

    /*
     * Sends QBXML object requests to quickbooks and returns a QBXML object response from quickbooks
     */

    QBXML exchangeXML(QBXML qbxml) throws Exception;

    /*
     * Sends qbxml as a string xmlRequest (param) to Quickbooks
     * Returns the response from quickbooks.
     */
    String exchangeXML(String xmlRequest) throws Exception;

    
}
