package Vehicleinspection.model;

/**
 * Contains information about one particular vehicle.
 */
public class ResultsOnCurrentVehicle {
    private boolean [] results;

    /**
     * Creates a new instance representing a result for a particular vehicle.
     *
     * @param results   The vehicles results.
     
     */
    public ResultsOnCurrentVehicle(boolean [] results) {
        this.results = results;
    }

    /** 
     * Updates the resultlist of the inspection.
     * 
     * @param result The vehicles result. 
     */ 
    public void updateResults (boolean result){
        results[results.length + 1] = result;
    }
    
     /**
     * Get the results.
     *
     * @return the results as a boolean array.
     */
    public boolean [] getResults() {
        return results;
    }


}

