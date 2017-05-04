package Vehicleinspection.controller;

import Vehicleinspection.integration.DBcreator;
import Vehicleinspection.integration.InspectionCostDatabase;
import Vehicleinspection.integration.VehicleInspectionsRegistry;
import Vehicleinspection.integration.Printer;
import Vehicleinspection.model.InspectionCompany;

/**
 * This is the application's only controller class. All calls to the model pass
 * through here.
 */
public class Controller {
   private VehicleInspectionsRegistry vir;
    private InspectionCostDatabase inspectionCostDatabase;
    private InspectionCompany inspection;
    private Printer printer;

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
}
