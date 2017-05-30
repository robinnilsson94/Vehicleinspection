
package Vehicleinspection.view;

import Vehicleinspection.controller.Controller;



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
                   
            
        int cost = contr.inspectionCost("mun101");
        System.out.println(cost);
        contr.pay(cost);
        contr.inspectionsToMake("mun101");
        contr.updateResultOfInspection(true);
        
            
                
           
    }

}

/**
 * contr.startNewInspection(); 
*      contr.closeDoor(); 
*/