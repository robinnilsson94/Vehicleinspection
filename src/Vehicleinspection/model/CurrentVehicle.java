package Vehicleinspection.model;

/**
 * Contains information about one particular vehicle.
 */
public class CurrentVehicle {
    private String regNo;

    /**
     * Creates a new instance representing a particular vehicle.
     *
     * @param regNo  The vehicles registration number.
     
     */
    public CurrentVehicle(String regNo) {
        this.regNo = regNo;
    }

    /**
     * Get the value of regNo
     *
     * @return the value of regNo
     */
    public String getRegNo() {
        return regNo;
    }
    
    public void resultOfInspection (boolean pass){
        ResultsOnCurrentVehicle.updateResults(pass);
    }


}
