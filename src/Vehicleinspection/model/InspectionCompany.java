package Vehicleinspection.model;

import Vehicleinspection.integration.VehicleInspectionsRegistry;
import Vehicleinspection.integration.Printer;
/**
 * Represents one particular rental transaction, where one particular car is
 * rented by one particular customer.
 */
public class InspectionCompany {
    private VehicleInspectionsRegistry vir; 
    private CardPayment payment;

    /**
     * Creates a new instance, representing an inspection.

//     * @param vir The data store with information about available inspections.
     */
    public InspectionCompany(VehicleInspectionsRegistry vir) {
        this.vir = vir;
    }
  
    /**
     * @return The payment cost.
     */
    public int getTotalCost() {
        return payment.getTotalCost();
    }
    
    /**
     * This inspection is paid using the specified payment.
     * 
     * @param payment The payment used to pay this inspection.
     */
    public void pay(CardPayment payment) {
        this.payment = payment;
    }
    
    /**
     * Prints a receipt for the current inspection on the specified printer.
     * 
     * @param printer The printer where the receipt is printed.
     */
    public void printReceipt(Printer printer) {
        Receipt receipt = new Receipt(this);
        printer.printReceipt(receipt);
    }
    
     /**
     * Prints a printout for the current inspection on the specified printer.
     * 
     * @param printer The printer where the printout is printed.
     */
    public void printPrintout(Printer printer) {
        Printout printout = new Printout(this);
        printer.printPrintout(printout);
    }
}

