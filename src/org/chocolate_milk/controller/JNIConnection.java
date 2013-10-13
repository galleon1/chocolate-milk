/*
 * JNIConnection.java
 *
 * Created on Oct 24, 2007, 12:53:58 AM
 *
 * Wraps the Q.Books Request Processor.  Provide Instance Variables
 * To Store Session and Connection Identifiers
 * 
 */
package org.chocolate_milk.controller;

import org.chocolate_milk.controller.jacob.*;

/**
 *
 * @author ryan
 */
public class JNIConnection {

    
    private IRequestProcessor4 xmlrp2;
    protected String appId;
    protected String appName;
    protected String sessionCode;
    private String fileName;
    private int fileMode;
    private boolean fileOpen;


    public boolean isFileOpen() {
        return fileOpen;
    }

    /**
     * @param fileOpen the fileOpen to set
     */
    public void setFileOpen(boolean fileOpen) {
        this.fileOpen = fileOpen;
    }

    public JNIConnection() {

        xmlrp2 = new IRequestProcessor4();
        fileOpen=false;
    }

    public void setAppId(String id) {
        appId = id;
    }

    public void setAppName(String name) {
        appName = name;
    }

    public JNIConnection(String appId, String appName) {


        xmlrp2 = new IRequestProcessor4();
        this.appId = appId;
        this.appName = appName;
        this.fileOpen=false;

    }

    private void setXmlrp2(IRequestProcessor4 rp2) {
        xmlrp2 = rp2;
    }

    public void open() throws Exception {

        try {
            if(getFileName() == null || getFileName().isEmpty()) throw new Exception("A Quickbooks file name is required");
            
            getXmlrp2().openConnection(getAppId(), getAppName());
            setFileOpen(true);

            //System.out.println("Opened Connection");
            //this takes **forever** to return on large files on older version of qb -- not so bad on small files
            sessionCode = getXmlrp2().beginSession(fileName, fileMode);

            //System.out.println("Session Begun");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error connecting to quickbooks " + e.getMessage());
            throw e;

        }

    }

    public void close() {
        try {

            if(getSessionCode()!=null && isFileOpen()){
                getXmlrp2().endSession(getSessionCode());
                //System.out.println("Session ended");
                setSessionCode(null);
            }
           
            if(isFileOpen()){
                getXmlrp2().closeConnection();
                setFileOpen(false);
                //System.out.println("Connection closed");
                getXmlrp2().safeRelease();
                //System.out.println("Released rp2");
            }
             
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error closing quickbooks: " + e.getMessage());
        }

    }

    public String exchangeXML( String xml ) {

        String xmlResponse2 = null;
        try {
            //System.out.println("started data exchange");
            xmlResponse2 = getXmlrp2().processRequest(getSessionCode(), xml);
            //System.out.println("finished data exchange");
        } catch (Exception e) {
            
            e.printStackTrace();
            System.err.println("error processing with QuickBooks");
        }

        return xmlResponse2;
    }

    /**
     * @return the xmlrp2
     */
    public IRequestProcessor4 getXmlrp2() {
        return xmlrp2;
    }

    /**
     * @return the appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @return the appName
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the fileMode
     */
    public int getFileMode() {
        return fileMode;
    }

    /**
     * @param fileMode the fileMode to set
     */
    public void setFileMode(int fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * @return the sessionCode
     */
    public String getSessionCode() {
        return sessionCode;
    }

    /**
     * @param sessionCode the sessionCode to set
     */
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }
}
