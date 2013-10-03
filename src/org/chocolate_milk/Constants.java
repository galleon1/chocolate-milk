/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.chocolate_milk;

import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

/**
 *
 * @author ryan
 */
public class Constants {

    public static enum CONSTANTS {

        COPY_TO("COPY_TO"), JACOB_LIBRARY_NAME("JACOB_LIBRARY_NAME"), QB_DATE_FORMAT("QB_DATE_FORMAT"), SERVER_PORT("SERVER_PORT"), SERVER_ADDRESS("SERVER_ADDRESS"), DEFAULT_QBXML_VERSION("DEFAULT_QBXML_VERSION"),
        DEFAULT_APPID("DEFAULT_APPID"), DEFAULT_APPNAME("DEFAULT_APPNAME");


        CONSTANTS(String value){

            propertyName=value;

        }

        String propertyName;
        public String getProperty() {
            
            ResourceBundle rb = ResourceBundle.getBundle("chocolatemilk");

            return rb.getString(propertyName);

        }
    }
    /*
     * The small business accounting software accepts dates formatted as strings like this pattern
     */
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(CONSTANTS.QB_DATE_FORMAT.getProperty());

   
}
