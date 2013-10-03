package org.chocolate_milk.controller;
/*
 * NativeLibrarySingleton.java
 *
 * Created on July 20, 2006, 5:15 PM
 * (Attempts to) Ensures the jacob native library is loadable. The jacob loader is good.
 * But this version will copy a version to the file system if necessary from a jar.
 * java SecurityManagers may not do well with this code
 * If the jacob dll cannot be found, this
 * will on request:
 *
 *  == CopyToTemp
 *  == CopyToJavaHome
 *  == CopyToUserDirectory
 *  == CopyToDirectory
 * and then attempt to load the the library.
 *
 */

import java.io.*;
import org.chocolate_milk.Constants;

/**
 *
 * @author ryan
 */
public class NativeLibraryLoader {

    public static final boolean DEBUG = true;
    public static File LIBRARY_FILE; //This is our jacob dll file
    public static final String LIBRARY = Constants.CONSTANTS.JACOB_LIBRARY_NAME.getProperty(); //The base name of the file
    private static final String LIBRARY_NAME = LIBRARY + ".dll"; //The whole file name
    /**
     * Name of system property (currently <tt>jacob.dll.path</tt>) that may
     * contain an absolute path to the JNI library.
     */
    public static final String JACOB_DLL_PATH = com.jacob.com.LibraryLoader.JACOB_DLL_PATH;
    /**
     * Name of system property (currently <tt>jacob.dll.name</tt>) that may
     * contain an alternate name for the JNI library (default is 'jacob').
     */
    public static final String JACOB_DLL_NAME = com.jacob.com.LibraryLoader.JACOB_DLL_NAME;


    /*
     * If a library can't be found on system path, where should it be copied to?
     */
    public static enum COPY_TO {

        WORKING_DIR, TMP, USER_DIR, NO_COPY;
    };
    
    
    public static final COPY_TO DEFAULT_COPY_TO = COPY_TO.valueOf(Constants.CONSTANTS.COPY_TO.getProperty());

    {
        try {
            setLibraryPath(DEFAULT_COPY_TO);
        } catch (Throwable e) {
            if (DEBUG) {
                e.printStackTrace();
                System.err.println("Error loading jacob library. This may not be a problem if it was previously loaded.");
            }
        }
    }

    /*
     * The jvm doesn't release a native library until the JVM dies. So the JVM won't
     * delete the library when finished.  There are some arcane workarounds using alternate class
     * loaders.
     * The normal garbage collection test by reachability doesn't apply.
     * So we tell the JVM to delete our temp file when done. And it can't. But at least we tried.
     */
    public void removeTempFile(File file) {
        boolean isDeleted = false;
        if (file != null) {

            try {

                isDeleted = file.delete();
                //tempFile=null;
            } catch (Exception e) {
                if (DEBUG) {
                    e.printStackTrace();
                    System.err.println(e);
                }

            } finally {
                if (!isDeleted) {
                    file.deleteOnExit();
                }
            }
        }
    }

    /*
     * Copies a file with the name specified from a JAR on the class path to destination file.
     *
     */
    public static void copyFileFromJarToFile(String nameToCopy, File destinationFile) {
        try {
            //try to load here
            java.net.URL resource = NativeLibraryLoader.class.getClassLoader().getResource(nameToCopy); //Find DLL file in Jar
            if (resource == null) {
                //JWS-JNLP uses context loader
                resource = Thread.currentThread().getContextClassLoader().getResource(nameToCopy);

            }
            InputStream is = resource.openStream();
            FileOutputStream fos = new FileOutputStream(destinationFile);
            byte[] buf = new byte[4096 * 1024];
            int read;
            while ((read = is.read(buf)) > 0) {
                fos.write(buf, 0, read);
            }
            
            fos.close();
            fos = null;

        } catch (Exception e) {
            
                e.printStackTrace();
                System.err.println(e.getMessage());
            
        }

    }

    public static void setLibraryPath(COPY_TO strategy) {

        boolean loadable = false;

        //Check if jacob system properties for path have been set
        try {
            String jac_path = System.getProperty(JACOB_DLL_PATH);
            if (jac_path != null && !jac_path.isEmpty()) {
                loadable = true;
                return;
            } else {
                loadable = false;
            }
        } catch (NullPointerException npe) {
            //ok
            if (DEBUG) {
                npe.printStackTrace();
            }
            loadable = false;
        } catch (IllegalArgumentException iae) {
            //ok
            if (DEBUG) {
                iae.printStackTrace();
            }
            loadable = false;
        }





        try {
            //Load from working dir
            System.load(System.getProperty("user.dir") + System.getProperty("file.separator") + LIBRARY_NAME);
            loadable = true;
            return;
        } catch (Throwable e) {
            loadable = false;
            if (DEBUG) {
                System.err.println("Checked for jacob in application directory.");
                e.printStackTrace();
            }

        }



        try {
            //Load from system.path
            System.load(LIBRARY);
            loadable = true;
            return;
        } catch (Throwable e) {
            loadable = false;
            if (DEBUG) {
                e.printStackTrace();
                System.out.println("Checked for jacob on System path.");
            }


        }



        //The easy way of finding library failed, so time to copy file to
        //where M$-Window$ can use it outside the jar file
        assert (!loadable);



        switch (strategy) {

            case WORKING_DIR:
                LIBRARY_FILE = new File(LIBRARY_NAME);
                break;
            case USER_DIR:
                LIBRARY_FILE = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + LIBRARY_NAME);
                break;
            case TMP:
                try {
                    LIBRARY_FILE = File.createTempFile(LIBRARY, ".dll");
                } catch (IOException ioe0) {
                    if (DEBUG) {
                        ioe0.printStackTrace();
                    }
                    return;
                } catch (IllegalArgumentException iae) {
                    if (DEBUG) {
                        iae.printStackTrace();
                    }
                    return;
                }
                LIBRARY_FILE.deleteOnExit();
                break;
            case NO_COPY:
                return;


        }

        copyFileFromJarToFile(LIBRARY_NAME, LIBRARY_FILE);

        System.setProperty(JACOB_DLL_PATH, LIBRARY_FILE.getAbsolutePath());

        
        try {
            System.load(LIBRARY_FILE.getAbsolutePath());
        } catch (UnsatisfiedLinkError ule) {
            if (DEBUG) {
                ule.printStackTrace();
            }
        } catch (NullPointerException npe) {
            if (DEBUG) {
                npe.printStackTrace();
            }
        }
        
    }
}
