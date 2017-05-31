package Vehicleinspection.model;

/**
 * Contains information about one particular vehicle.
 */
public class CurrentVehicle {
    private String regNo;
    private String [] inspections;
    private ResultsOnCurrentVehicle resultsOnCurrentVehicle;

    /**
     * Creates a new instance representing a particular vehicle.
     *
     * @param regNo  The vehicles registration number.
     
     */
    public CurrentVehicle(String regNo, String [] inspections) {
        this.regNo = regNo;
        this.inspections = inspections;
    }
    
    

    /**
     * Get the value of regNo
     *
     * @return the value of regNo
     */
    public String getRegNo() {
        return regNo;
    }
    
     /**
     * Get the inspections for the current vehicle.
     *
     * @return the inspections.
     */
    public String [] getInspections() {
        return inspections;
    }
     /**
     * Update results for the current vehicle.
     *
     * @param result  the result of the inspection.
     */
    public void resultOfInspection (String result){
        resultsOnCurrentVehicle.updateResults(result);
    }


}
