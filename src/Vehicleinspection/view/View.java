
package Vehicleinspection.view;

import Vehicleinspection.controller.Controller;
import java.util.ArrayList;
import java.util.List;


   /**
 * This program has no view, instead, this class is a placeholder for the entire
 * view.
 */
public class View {
    private Controller contr;

    /**
     * Creates a new instance.
     *
     * @param contr The controller that is used for all operations.
     */
    public View(Controller contr) {
        this.contr = contr;
    }
    
     /**
     * This method samples an inspection.
     */
    public void sampleExecution()
    {
        System.out.println("* * * Welcome to the best Vehicle inspection system * * *");  
                   
        contr.startNewInspection(); 
        System.out.println("Door is opened and display is incremented");
        contr.closeDoor(); 
        System.out.println("Door is closed.");
        String regNo = "mun101";    
        String [] inspections = contr.inspectionsToMake(regNo);
        int cost = contr.inspectionCost(inspections);
        System.out.println("The cost of the inspection is: " + cost + " kr");
        System.out.println("Printing reciept...");
        contr.pay(cost);
        System.out.println("These inspections have been paid for:");
        for (int i = 0; i < inspections.length; i++)
            System.out.println(inspections[i]);
        contr.createResultList("passed");
        System.out.println();
        System.out.println("Printing printout...");
        contr.getPrintout();   
                
           
    }

}

