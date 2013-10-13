/*
 * Implements the required methods to act as a windows service
 * using tanuki's community wrapper
 */
package org.chocolate_milk.example;

import org.chocolate_milk.controller.NetServer;
import org.chocolate_milk.controller.jacob.FileModeE;

/**
 *
 * @author ryan
 */
public class WindowsService  {

    /**
    * Single static instance of the service class
    */
   private static NetServer
       serviceInstance = new NetServer("Y:\\harris_c.qbw", FileModeE.openDoNotCare, "hcsp", "hcsp",60034);



   public static void main(String[] args){

       control(args);

   }

   /**
    * Static method called by prunsrv to start/stop
    * the service.  Pass the argument "start"
    * to start the service, and pass "stop" to
    * stop the service.
    */
   public static void control(String args[]) {
      String cmd = "start";
      if(args.length > 0) {

         cmd = args[0];
      }

      if("start".equals(cmd)) {
          
         serviceInstance.run();
      }
      else {
          
         serviceInstance.setShutdown(true);
      }
   }

 


  
}
