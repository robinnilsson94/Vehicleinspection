package Vehicleinspection.integration;


import java.util.ArrayList;
import java.util.List;

/**
 *Contains all calls to the data store with inspection costs that may be needed.
 * 
 */
public class InspectionCostDatabase {
    private List<InspectionCostData> inspectionsAndCost = new ArrayList<>();
    private VehicleInspectionsRegistry vehicleInspectionsRegistry;
    private int inspectionCost;
    

/**
     * Returns the cost for all inspections. If there are no such inspections, the returned list is empty.
     *
     * @param inspections The inspections for the customer vehicle.
     * @return An integer of money for the cost of all inspections.
     */
    public int inspectionCost(String [] inspections) {
        for (String inspection : inspections)
            for (InspectionCostData inspectionslist : inspectionsAndCost) {
            
                if (inspectionslist.inspection.equals(inspection)) {
                
                    inspectionCost += inspectionslist.cost;
            }
            
        }
        return inspectionCost;
    }

    InspectionCostDatabase() {
        addCosts();
    }

    private void addCosts() {
       
        inspectionsAndCost.add(new InspectionCostData("Hjul", 100));
        inspectionsAndCost.add(new InspectionCostData("Bromsar", 120));
        inspectionsAndCost.add(new InspectionCostData("Ljus", 60));
        inspectionsAndCost.add(new InspectionCostData("Bakhjul", 50));
        inspectionsAndCost.add(new InspectionCostData("Motor", 140));
        inspectionsAndCost.add(new InspectionCostData("Baklysen", 30));
        
    } 
    
    private static class InspectionCostData {
        private String inspection;
        private int cost;

        public InspectionCostData(String inspection, int cost) {
            this.inspection = inspection;
            this.cost = cost;
        }
    }
}

