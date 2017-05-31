package Vehicleinspection.startup;

import Vehicleinspection.controller.Controller; 
import Vehicleinspection.integration.DBcreator; 
import Vehicleinspection.integration.Printer;
import Vehicleinspection.view.View;
import Vehicleinspection.model.Garage;
/**
 * Contains the <code>main</code> method. Performs all startup of the
 * application.
 */
public class Main {
    /**
     * Starts the application.
     *
     * @param args The application does not take any command line parameters.
     */
    public static void main(String[] args) {
        DBcreator creator = new DBcreator();
        Printer printer = new Printer();
        Garage garage = new Garage ();
        Controller contr = new Controller(creator, printer, garage);
        View view = new View(contr);
        
        view.sampleExecution();
    }
}

