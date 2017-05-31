package Vehicleinspection.controller;

import Vehicleinspection.integration.DBcreator;
import Vehicleinspection.integration.InspectionCostDatabase;
import Vehicleinspection.integration.VehicleInspectionsRegistry;
import Vehicleinspection.integration.Printer;
import Vehicleinspection.model.InspectionCompany;
import Vehicleinspection.model.CardPayment;
import Vehicleinspection.model.Garage;
import Vehicleinspection.model.CurrentVehicle;
import Vehicleinspection.model.ResultsOnCurrentVehicle;
import java.util.ArrayList;
import java.util.List;

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
    private ResultsOnCurrentVehicle resultsOnCurrentVehicle;

    /**
     * Creates a new instance.
     *
     * @param dBcreator Used to get all classes that handle database calls.
     * @param printer    Interface to printer.
     * @param garage     interface to garage. 
     */
    public Controller(DBcreator dBcreator, Printer printer, Garage garage) {
        this.vir = dBcreator.getVehicleInspectionsRegistry();
        this.inspectionCostDatabase = dBcreator.getInspectionCostDatabase();
        this.printer = printer;
        this.garage = garage;
        
    }  
    
    /**
     * Handles the Opening of the door and displaying of the next queue number.
     */
    public void startNewInspection() {
        garage.nextCustomer();
        
    }
    
    /**
     * Updates the result of the inpection.
     * @param pass, the result of an inspection.
     */
    public void updateResultOfInspection(ResultsOnCurrentVehicle list, String result) {
        list.updateResults(result);
    }
     /**
     * Creates a list for the result of the inpection.
     * @param result, the result of an inspection.
     */
     public void createResultList(String result) {
        List<String> list = new ArrayList<>();
        ResultsOnCurrentVehicle resultsOnCurrentVehicle = new ResultsOnCurrentVehicle(list);
        updateResultOfInspection(resultsOnCurrentVehicle, result);
    }
     
    public List getResults() {
        List list = resultsOnCurrentVehicle.getResults();
        return list;
    }
    
    /**
     * Handles inspection payment. Prints the receipt and Printout.
     *
     * @param paidAmt The paid amount.
     */
    public void pay(int paidAmt) {
        CardPayment payment = new CardPayment(paidAmt);
        InspectionCompany inspection = new InspectionCompany(vir);
        inspection.pay(payment);
        inspection.printReceipt(printer);
        
    }
    
     /**
     * Handles the closing of the door.
     */
    public void closeDoor(){
        garage.closeDoor();
    }
    
    /**
     * Fetches inspection cost for a vehicle.
     *
     * @param inspections, the inspections.
     * @return cost, the cost of the inspection.
     */
    public int inspectionCost(String [] inspections){
        int cost = inspectionCostDatabase.inspectionCost(inspections);
        return cost;
    }
        
    
    /**
     * Fetches inspections for a vehicle.
     *
     * @param regNo, the registration number.
     * @return inspections, the inspections to make.
     */

    public String[] inspectionsToMake(String regNo){
        String [] inspections = vir.findVehicleInspections(regNo);
        return inspections;
    }
    
    public void getPrintout(){
        InspectionCompany inspection = new InspectionCompany(vir);
        inspection.printPrintout(printer);
    }
 

        
    
        
    
}
