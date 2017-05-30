
package Vehicleinspection.view;

import Vehicleinspection.controller.Controller;
import Vehicleinspection.model.Amount;


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
        contr.closeDoor();            
            
        Amount cost = contr.inspectionCost("mun101");
        contr.pay(cost);
        contr.inspectionsToMake("mun101");
        contr.updateResultOfInspection(true);
        
            
                
           
    }

}