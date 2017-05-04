package Vehicleinspection.controller;

import Vehicleinspection.integration.DBcreator;
import Vehicleinspection.integration.InspectionCostDatabase;
import Vehicleinspection.integration.VehicleInspectionsRegistry;
import Vehicleinspection.integration.Printer;
import Vehicleinspection.model.InspectionCompany;
import Vehicleinspection.model.CardPayment;
import Vehicleinspection.model.Amount;
import Vehicleinspection.model.Garage;
import Vehicleinspection.model.CurrentVehicle;

/**
 * This is the application's only controller class. All calls to the model pass
 * through here.
 */
public class Controller {
   private VehicleInspectionsRegistry vir;
    private InspectionCostDatabase inspectionCostDatabase;
    private InspectionCompany inspection;
    private Printer printer;
    private Garage garage;
    private CurrentVehicle currentVehicle;

    /**
     * Creates a new instance.
     *
     * @param dBcreator Used to get all classes that handle database calls.
     * @param printer    Interface to printer.
     */
    public Controller(DBcreator dBcreator, Printer printer) {
        this.vir = dBcreator.getVehicleInspectionsRegistry();
        this.inspectionCostDatabase = dBcreator.getInspectionCostDatabase();
        this.printer = printer;
    }  
    
    /**
     * Handles the Opening of the door and displaying of the next queue number.
     */
    public void startNewInspection() {
        garage.nextCustomer();
    }
    
    /**
     * Handles the Opening of the door and displaying of the next queue number.
     */
    public void updateResultOfInspection(boolean pass) {
        currentVehicle.resultOfInspection(pass);
    }
    
    /**
     * Handles inspection payment. Prints the receipt and Printout.
     *
     * @param paidAmt The paid amount.
     */
    public void pay(Amount paidAmt) {
        CardPayment payment = new CardPayment(paidAmt);
        inspection.printReceipt(printer);
        inspection.printPrintout(printer);
    }
}
