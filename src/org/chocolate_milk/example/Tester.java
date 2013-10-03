package org.chocolate_milk.example;
/*
 * Main.java
 *
 * Created on June 6, 2006, 4:10 PM
 *
 * Check to see if everything works properly
 *
 * Nestle makes chocolate milk.
 * Intuit makes accounting software.
 *
 */
import java.io.PrintStream;
import org.chocolate_milk.Constants;
import org.chocolate_milk.controller.*;
import org.chocolate_milk.model.*;
import org.chocolate_milk.model.types.*;

/**
 *
 * @author 
 * Test connection to quickbooks -- fetches list of accounts
 */
public class Tester implements Runnable {

    
    /** Creates a new instance of Main */
    public Tester() {


    }
    public NetClient sender= new NetClient(Constants.CONSTANTS.SERVER_ADDRESS.getProperty(), Integer.parseInt(Constants.CONSTANTS.SERVER_PORT.getProperty()));;
    


   
   



    public static void main(String[] args) {


        Tester test1 = new Tester();
        Tester test2 = new Tester();
        Tester test3 = new Tester();

        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);
        Thread thread3 = new Thread(test3);

        try {

            System.out.println("Starting Threads...");

            thread1.start();
            thread2.start();
            thread3.start();

            thread1.join();
            thread2.join();
            thread3.join();

            System.out.println("All Done...Bye!");



        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        } finally {
            System.exit(0);
            return;

        }
    }

    public static void doExchange(NetClient sender, PrintStream out) throws Exception {

        QBXML qbxml = Utils.getRequestDocument(QBXMLMsgsRqItemOnErrorType.STOPONERROR);

        QBXMLMsgsRq request = qbxml.getQBXMLSequence().getQBXMLSequenceChoice().getQBXMLMsgsRq();

        QBXMLMsgsRqItem qBXMLMsgsRqItem = new QBXMLMsgsRqItem();

        AccountQueryRq accountQueryRq = new AccountQueryRq();

        qBXMLMsgsRqItem.setAccountQueryRq(accountQueryRq);

        request.addQBXMLMsgsRqItem(qBXMLMsgsRqItem);

        QBXML response = sender.exchangeXML(qbxml);

        QBXMLMsgsRsItem item = response.getQBXMLSequence2().getQBXMLSequence2Choice().getQBXMLMsgsRs().getQBXMLMsgsRsItem(0);
        AccountRet[] rets = item.getAccountQueryRs().getAccountRet();


        String accountNames = "Accounts: ";

        for (AccountRet ret : rets) {
            accountNames += ret.getFullName() + " // ";


        }
        out.println("Account List Size ----> " + rets.length );


    }

    public void run() {


        try {



            for (int i = 0; i < 5; i++) {
                System.out.println("About to launch test #" + i + " with thread " + Thread.currentThread().getName() );
                doExchange(sender, System.out);
                System.out.println("Test cycle #" + i + " launched with thread " + Thread.currentThread().getName() );
            }

            System.out.println("Thread " + Thread.currentThread().getName() + " finished the test cycles.");



        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }


    }
}
