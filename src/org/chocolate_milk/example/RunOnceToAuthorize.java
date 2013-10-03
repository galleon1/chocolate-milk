/*
 * OpenFileOnceForAuth.java
 * 
 * Created on Nov 6, 2007, 7:18:38 PM
 * 
 * The first time you run an app, you have to open q*****books and grant your
 * applicationId permission.  Q****books must already be open and running in
 * single user mode and logged in as admin to grant your application access
 * to your company file
 */
package org.chocolate_milk.example;

import org.chocolate_milk.controller.*;
import org.chocolate_milk.controller.jacob.*;
import org.chocolate_milk.model.AccountQueryRq;
import org.chocolate_milk.model.QBXML;
import org.chocolate_milk.model.QBXMLMsgsRq;
import org.chocolate_milk.model.QBXMLMsgsRqItem;
import org.chocolate_milk.model.types.QBXMLMsgsRqItemOnErrorType;

/**
 *
 * @author ryan Makes Quickbooks pop-up the application authorization form when
 * you are logged into quickbooks with singleuser mode / Admin Command line
 * arguments: Data File Name (Ex. C:\\my.qbw), App Name (Ex. My Test App), app
 * Id (Ex. mycoolapp)
 *
 *
 */
public class RunOnceToAuthorize {

    public static void main(String[] args) throws Exception {

        String appId = args[2];
        String connectionName = args[1];
        String fileName = args[0];
        System.out.print(fileName);

        JNIClient client = new JNIClient(fileName, FileModeE.openSingleUser, connectionName, appId);

        try {

            client.open(); //Quickbooks
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(client != null) client.close();
        }
        }



    
}