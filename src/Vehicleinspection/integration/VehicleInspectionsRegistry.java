
package Vehicleinspection.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains all calls to the data store with vehicles that may be inspected.
 */
public class VehicleInspectionsRegistry {
    private List<VehicleData> vehicles = new ArrayList<>();
    

    VehicleInspectionsRegistry() {
        addVehicles();
    }

    private void addVehicles() {
        String[] inspections1 = {"Hjul", "Bromsar", "Ljus"};
        String[] inspections2 ={"Bakhjul", "Motor", "Baklysen"};
        vehicles.add(new VehicleData("mun101", inspections1));
        vehicles.add(new VehicleData ("sol102", inspections2));
    }

    /**
     * Returns a list containing all inspections to be made on a
     * specified vehicle. If there are no such inspections, the returned list is empty.
     *
     * @param regNo The registration number of the customer vehicle.
     * @return A list with all inspections to be made on the vehcile.
     */
    public String [] findVehicleInspections(String regNo) {
        for (VehicleData vehicle : vehicles) {
            if (vehicle.regNo.equals(regNo)) {
                System.out.print("Found!");
                return vehicle.inspections;
            }
        }
        System.out.print("Empty");
        return null;
    }

    private static class VehicleData {
        private String regNo;
        private String [] inspections;

        public VehicleData(String regNo, String [] inspections) {
            this.regNo = regNo;
            this.inspections = inspections;
        }
    }
}


    
