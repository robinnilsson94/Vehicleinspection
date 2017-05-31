package Vehicleinspection.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains information about one particular vehicle.
 */
public class ResultsOnCurrentVehicle {
    private List<String> results = new ArrayList<>();
     

    /**
     * Creates a new instance representing a result for a particular vehicle.
     *
     * @param results   The vehicles results.
     
     */
    public ResultsOnCurrentVehicle(List results) {
        this.results = results;
    }

    /** 
     * Updates the resultlist of the inspection.
     * 
     * @param result The vehicles result. 
     */ 
    public void updateResults (String result){
        results.add(result);
    }
    
     /**
     * Get the results.
     *
     * @return the results as an String array.
     */
    public List getResults() {
        return results;
    }


}

