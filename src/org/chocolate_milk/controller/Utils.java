/*
 * Utils.java
 *
 * Created on Dec 3, 2007, 4:02:19 PM
 *
 */
package org.chocolate_milk.controller;

import org.chocolate_milk.model.types.*;
import org.chocolate_milk.model.*;
import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
/**
 *
 * @author ryan
 */
public class Utils {


    /*
     * Convenience constructor for the portions of the xml document which ( I almost) never change
     */
    public static QBXML getRequestDocument(QBXMLMsgsRqItemOnErrorType errorResponseType) {
        QBXML qbxml = new QBXML();
        QBXMLSequence qbxmlsequence = new QBXMLSequence();
        qbxml.setQBXMLSequence(qbxmlsequence);
        QBXMLSequenceChoice seqChoice = new QBXMLSequenceChoice();
        qbxmlsequence.setQBXMLSequenceChoice(seqChoice);
        QBXMLMsgsRq qbXMLMsgsRq = new QBXMLMsgsRq();
        seqChoice.setQBXMLMsgsRq(qbXMLMsgsRq);
        qbXMLMsgsRq.setOnError(errorResponseType);

        return qbxml;
    }

    
  /*
   * Provide a file and get a String.
   *
   */

  static public String getContents(File aFile) {
    
    StringBuilder contents = new StringBuilder();

    try {
     
      //default encoding
      BufferedReader input =  new BufferedReader(new FileReader(aFile));
      try {
        String line = null; //not declared within while loop
        /*
        * readLine is a bit quirky :
        * it returns the content of a line MINUS the newline.
        * it returns null only for the END of the stream.
        * it returns an empty String if two newlines appear in a row.
        */
        while (( line = input.readLine()) != null){
          contents.append(line);
          contents.append(System.getProperty("line.separator"));
        }
      }
      finally {
        input.close();
      }
    }
    catch (IOException ex){
      ex.printStackTrace();
    }

    return contents.toString();
  }


  
    /**
     * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
     *
     * @param packageName The base package
     * @return The classes
     * @throws ClassNotFoundException
     * @throws IOException
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public static List<Class> getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            String fileName = resource.getFile();
            String fileNameDecoded = URLDecoder.decode(fileName, "UTF-8");
            dirs.add(new File(fileNameDecoded));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     *
     * @param directory   The base directory
     * @param packageName The package name for classes found inside the base directory
     * @return The classes
     * @throws ClassNotFoundException
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            String fileName = file.getName();
            if (file.isDirectory()) {
                assert !fileName.contains(".");
                classes.addAll(findClasses(file, packageName + "." + fileName));
            } else if (fileName.endsWith(".class") && !fileName.contains("$")) {
                Class _class;
                try {
                    _class = Class.forName(packageName + '.' + fileName.substring(0, fileName.length() - 6));
                } catch (ExceptionInInitializerError e) {
                    // happen, for example, in classes, which depend on
                    // Spring to inject some beans, and which fail,
                    // if dependency is not fulfilled
                    _class = Class.forName(packageName + '.' + fileName.substring(0, fileName.length() - 6),
                            false, Thread.currentThread().getContextClassLoader());
                }
                classes.add(_class);
            }
        }
        return classes;
    }

}
