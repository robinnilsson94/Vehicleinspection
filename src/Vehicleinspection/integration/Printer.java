
package Vehicleinspection.integration;

import Vehicleinspection.model.Receipt;
import Vehicleinspection.model.Printout;

/**
 * The interface to the printer, used for all printouts initiated by this
 * program.
 */
public class Printer {
    /**
     * Prints the specified receipt. This implementation prints to
     * <code>System.out</code> instead of a printer.
     *
     * @param receipt
     */
    public void printReceipt(Receipt receipt) {
        System.out.println(receipt.createReceiptString());
    }
    
    /**
     * Prints the specified printout. This implementation prints to
     * <code>System.out</code> instead of a printer.
     *
     * @param printout
     */
    public void printPrintout(Printout printout) {
        System.out.println(printout.createPrintoutString());
    }
    
    
}

