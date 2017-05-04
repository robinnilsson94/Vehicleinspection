package Vehicleinspection.integration;

import Vehicleinspection.model.Amount;
import java.util.ArrayList;
import java.util.List;

/**
 *Contains all calls to the data store with inspection costs that may be needed.
 * 
 */
public class InspectionCostDatabase {
    private List<InspectionCostData> inspectionsAndCost = new ArrayList<>();

/**
     * Returns the cost for all inspections. If there are no such inspections, the returned list is empty.
     *
     * @param regNo The registration number of the customer vehicle.
     * @return An amount of money for the cost of all inspections.
     */
    public Amount inspectionCost(String regNo) {
        String [] inspections = VehicleInspectionsRegistry.findVehicleInspections(regNo);
        for (InspectionCostData inspectionslist : inspectionsAndCost) {
            if (inspectionslist.equals(inspections)) {
                return inspectionslist.cost;
            }
        }
        return null;
    }

    private static class InspectionCostData {
        private String inspection;
        private Amount cost;

        public InspectionCostData(String inspection, Amount cost) {
            this.inspection = inspection;
            this.cost = cost;
        }
    }
}

