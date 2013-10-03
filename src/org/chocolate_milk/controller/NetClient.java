/*
 * NetClient.java
 *
 * Created on Nov 5, 2007, 2:26:31 AM
 *
 * Sends xml to and from an instance of the NetServer class.
 */
package org.chocolate_milk.controller;

import java.net.Socket;
import java.io.*;
import java.util.*;


/**
 *
 * @author ryan
 */
public class NetClient extends AbstractClient {

    //The hostname or ip address of a NetServer
    protected String serverAddress;

    //The port where the NetServer is listening
    protected int port;

    /*
     * Hostname should be the server internet address
     * The Port number should match the server port
     */
     public NetClient(String hostName, int port) {

        this.serverAddress = hostName;
        this.port = port;
    }


    public NetClient(String hostName, int port, String qbxmlVersion) {
        setQbxmlVersion(qbxmlVersion);
        this.serverAddress = hostName;
        this.port = port;
    }

    public NetClient() {

        this.serverAddress = "127.0.0.1";
        this.port = 60034;
    }

    public NetClient(ResourceBundle resourceBundle) {


        Properties properties = new Properties();
        for (Enumeration keys = resourceBundle.getKeys(); keys.hasMoreElements();) {
            final String key = (String) keys.nextElement();
            final String value = resourceBundle.getString(key);

            properties.put(key, value);
        }
        setQbxmlVersion(properties.getProperty("qbxmlVersion"));
        serverAddress = properties.getProperty("hostname");
        port = Integer.parseInt(properties.getProperty("port"));

    }


    /*
     * Sends (param) qbxml request to netserver and returns qbxml response from netserver
     *
     */
    @Override
    public String exchangeXML(String xml) {

        Socket socket=null;
        String returnedXML=null;
        
        try {
        
        socket = new Socket(serverAddress, port);
        
        BufferedOutputStream bossy = new BufferedOutputStream(socket.getOutputStream());

        OutputStreamWriter osw = new OutputStreamWriter(bossy);

        osw.write(xml);

        osw.flush();

        socket.shutdownOutput();

        Reader in = new InputStreamReader(socket.getInputStream());
        
        StringWriter writer = new StringWriter();
        
        int ch;
        
        while ((ch = in.read()) > -1) {

            writer.append((char) ch);

        }
        
        in.close();

        returnedXML = writer.toString();

        return returnedXML;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            
        } finally {
            if(socket != null){
                try {
                if(! socket.isClosed()) socket.close();
                } catch(Throwable t){
                    t.printStackTrace();
                }
                socket=null;
            }
            
        }
        return returnedXML;

    }
}
