package Vehicleinspection.integration;

import Vehicleinspection.model.Receipt;
import Vehicleinspection.model.CardPayment;
import Vehicleinspection.model.InspectionCompany;
import Vehicleinspection.model.Amount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;


public class PrinterTest {
    private InspectionCompany inspectionCompany;
    ByteArrayOutputStream outContent;
    PrintStream originalSystemOut;
    public PrinterTest() {
    }
   
    @Before
    public void setUpStreams() {
        originalSystemOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        outContent = null;
        System.setOut(originalSystemOut);
    }

    /**
     * Test of printReceipt method, of class Printer.
     */
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        Amount price = new Amount(1000);
        String regNo = "mun 101";
       
        Amount paidAmt = new Amount(5000);
        CardPayment payment = new CardPayment(paidAmt);
        InspectionCompany inspection = new InspectionCompany (new VehicleInspectionsRegistry());
        Receipt receipt = new Receipt(inspection);
        Printer instance = new Printer();
        instance.printReceipt(receipt);
        LocalDateTime inspectionTime = LocalDateTime.now();
        String expectedResult = "\nInspected vehicle: " + regNo + "\nCost: " + price
                           + "\n";
        String result = outContent.toString();
        assertTrue("Wrong printout.", result.contains(expectedResult));
        assertTrue("Wrong inspection year.", result.contains(Integer.toString(inspectionTime.getYear())));
        assertTrue("Wrong inspection month.", result.contains(Integer.toString(inspectionTime.getMonthValue())));
        assertTrue("Wrong inspection day.", result.contains(Integer.toString(inspectionTime.getDayOfMonth())));
        assertTrue("Wrong inspection hour.", result.contains(Integer.toString(inspectionTime.getHour())));
        assertTrue("Wrong inspection minute.", result.contains(Integer.toString(inspectionTime.getMinute())));
       
    }
    
}
