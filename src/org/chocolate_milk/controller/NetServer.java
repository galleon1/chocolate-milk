/*
 * ServerSocket.java
 *
 * A very, very simple server to exchange XML with the worlds best selling
 * small business accounting software.   
 * 
 * A firewall would be a very good idea.
 *
 */
package org.chocolate_milk.controller;

import org.chocolate_milk.Constants.CONSTANTS;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 *
 * @author ryan
 */
public class NetServer implements Runnable {


    private ServerSocket serverSocket;
    private JNIClient jniClient;
    private boolean shutdown;
    private int port;


    /*
     * The default port is 60034
     *
     */
    public NetServer() {
        setPort(Integer.parseInt(CONSTANTS.SERVER_PORT.getProperty()));
        setJniClient(new JNIClient());
    }

    /*
     *  Usual constructor
     *
     * == The string fileName points to the quickbooks company file &
     * should be like this "C:\QB\MyQBCompany.qbw" or "C:\\QB\\MyQBCompany.qbw"  if
     * your jvm....
     * 
     *  == The int fileModeE should be taken from a static value in 
     * org.chocolate_milk.controller.jacob.FileModeE.  Sets SingleUser/Multiuser/Don'tCare
     *  == The appId is something you can set to identify your Application to Quickbooks
     *  == The appName is something you can set to identy your Application to Users of Quickbooks
     *  == The port is the port number to listen to.  The default is 60034;
     */
    public NetServer(String fileName, int fileModeE, String appId, String appName, int port) {
        this.port = port;
        setJniClient(new JNIClient());
        getJniClient().getConnection().setAppName(appName);
        getJniClient().getConnection().setAppName(appId);
        getJniClient().getConnection().setFileMode(fileModeE);
        getJniClient().getConnection().setFileName(fileName);
    }

    /**
     * @return the serverSocket
     */
    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    /**
     * @param serverSocket the serverSocket to set
     */
    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    /**
     * @return the jniClient
     */
    public JNIClient getJniClient() {
        return jniClient;
    }

    /**
     * @param jniClient the jniClient to set
     */
    public void setJniClient(JNIClient jniClient) {
        this.jniClient = jniClient;
    }

    /**
     * @return the shutdown
     */
    public boolean isShutdown() {
        return shutdown;
    }

    /**
     * @param shutdown the shutdown to set
     */
    public void setShutdown(boolean shutdown) {

        if (shutdown) {

            try {
                this.shutdown = shutdown;
                if (getServerSocket() != null) {
                    getServerSocket().close();
                }
                if (getJniClient() != null) {
                    getJniClient().close();
                }
                setJniClient(null);


            } catch (IOException e) {

                e.printStackTrace();
                System.err.println(e.getMessage());
            }

        }
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    //Catch a jvm shutdown
    {
        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                setShutdown(true);
            }
        });
    }

    public void run() {
        setShutdown(false);
        try {
            
            getJniClient().open();
            System.out.println("Opened JNI connection to quickbooks.");
            setServerSocket(new ServerSocket(getPort()));
            System.out.println("Opened ip port " + getPort() + " and set server socket to listen.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            setShutdown(true);
            return;
        }

        do {

            try {


                Socket socket = getServerSocket().accept();
                Thread thread = new Thread(new SocketProcessor(socket, getJniClient()));

                thread.start();
                thread.join();

            } catch (IOException ioe) {


                ioe.printStackTrace();
                

                if (isShutdown()) {
                    System.out.println("That error was the shutdown.... Not to worry.");
                    return;
                }
            } catch (Exception e2) {

                e2.printStackTrace();
                System.err.println(e2.getMessage());
                if (isShutdown()) {
                    System.out.println("That error was the shutdown... Not to worry.");
                    return;
                }
            }
        } while (isShutdown() == false);

        return;
    }
}

class SocketProcessor implements Runnable {

    private final Socket socket;
    private final JNIClient client;

    public SocketProcessor(Socket socket, JNIClient client) {
        this.socket = socket;
        this.client = client;
    }

    public void run() {
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            StringWriter writer = new StringWriter();
            int ch;
            while ((ch = in.read()) > -1) {

                writer.append((char) ch);

            }
            socket.shutdownInput();
            
            String returnedXML = client.exchangeXML(writer.toString());

            BufferedOutputStream bossy = new BufferedOutputStream(socket.getOutputStream());

            OutputStreamWriter dossy = new OutputStreamWriter(bossy);

            Writer buffy = new BufferedWriter(dossy);

            buffy.write(returnedXML);

            buffy.flush();

            buffy.close();

            socket.close();

        } catch (Exception ioe) {


            ioe.printStackTrace();
            System.err.println(ioe.getMessage());


        }
        return;
    }
}
