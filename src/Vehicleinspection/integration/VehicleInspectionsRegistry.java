
package Vehicleinspection.integration;

import java.util.ArrayList;
import java.util.List;
import Vehicleinspection.model.Amount;

/**
 * Contains all calls to the data store with vehicles that may be inspected.
 */
public class VehicleInspectionsRegistry {
    private List<VehicleData> vehicles = new ArrayList<>();

    VehicleInspectionsRegistry() {
        addVehicles();
    }

    /**
     * Search for a car matching the specified search criteria.
     *
     * @param searchedCar This object contains the search criteria. Fields in
     *                    the object that are set to <code>null</code> or
     *                    <code>0</code> are ignored.
     * @return A description matching the searched car's description if a car
     *         with the same features as <code>searchedCar</code> was found,
     *         <code>null</code> if no such car was found.
     */
    public CarDTO findAvailableCar(CarDTO searchedCar) {
        for (CarData car : cars) {
            if (matches(car, searchedCar) && !car.booked) {
                return new CarDTO(car.regNo, new Amount(car.price), car.size,
                                  car.AC, car.fourWD, car.color);
            }
        }
        return null;
    }

    /**
     * If there is an existing car with the registration number of the specified car, set its booked
     * property to the specified value. Nothing is changed if the car's booked property already had
     * the specified value.
     *
     * @param car         The car that shall be marked as booked.
     * @param bookedState The new value of the booked property.
     */
         
    }

    private void addVehicles() {
        vehicles.add(new VehicleData("mun101", {"Hjul", "Bromsar", "Ljus"}));
        vehicles.add(new VehicleData("sol102", {"Bakhjul", "Motor, Baklysen"}));
    }

    private VehicleData findVehicle(String regNo) {
        for (VehicleData vehicle : vehicles) {
            if (vehicle.regNo.equals(regNo.getRegNo())) {
                return vehicle;
            }
        }
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


    
