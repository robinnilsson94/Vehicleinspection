package Vehicleinspection.integration;

/**
 * This class is responsible for instantiating all registries.
 */
public class DBcreator {
    private VehicleInspectionsRegistry vir = new VehicleInspectionsRegistry();
    private InspectionCostDatabase inspectionCostDatabase = new InspectionCostDatabase();

    /**
     * Get the value of vir
     *
     * @return the value of vir
     */
    public VehicleInspectionsRegistry getVehicleInspectionsRegistry() {
        return vir;
    }

    /**
     * Get the value of inspectionCostDatabase
     *
     * @return the value of inspectionCostDatabase
     */
    public InspectionCostDatabase getInspectionCostDatabase() {
        return inspectionCostDatabase;
    }
}
