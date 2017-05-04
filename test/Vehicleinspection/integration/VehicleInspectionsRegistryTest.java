package Vehicleinspection.integration;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleInspectionsRegistryTest {
    
    public VehicleInspectionsRegistryTest() {
    }
    /**
     * Test of findVehicleInspections method, of class VehicleInspectionsRegistry.
     */
    @Test
    public void testFindVehicleInspectionsMatch() {
        VehicleData vehicle = new VehicleData ("mun101", {motor, baklysen});
        System.out.println("findVehicleInspections");
        String regNo = "mun101";
        VehicleInspectionsRegistry instance = new VehicleInspectionsRegistry();
        String[] expResult = vehicle;
        String[] result = instance.findVehicleInspections(regNo);
        assertArrayEquals("Available inspections weren't found", expResult, result);
     
    }
    
    @Test
    public void testFindVehicleInspectionsNoInspections() {
        VehicleData vehicle = new VehicleData ("sol102", {null});
        System.out.println("findVehicleInspections");
        String regNo = "sol102";
        VehicleInspectionsRegistry instance = new VehicleInspectionsRegistry();
        String[] expResult = new VehicleData ("sol102", {motor, baklysen});
        String[] result = instance.findVehicleInspections(regNo);
        assertArrayEquals("Unavailable inspections were found", expResult, result);
     
    }
    
}
