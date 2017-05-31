
package Vehicleinspection.model;

import java.time.LocalDateTime;


/**
 * The printout of an inspection.
 */
public class Printout {
    private final InspectionCompany inspection;
    private CurrentVehicle currentVehicle;
    private ResultsOnCurrentVehicle  resultsOnCurrentVehicle;

    /**
     * Creates a new instance.
     *
     * @param inspection The inspection proved by this printout.
     */
    Printout(InspectionCompany inspection) {
        this.inspection = inspection;
    }

    /**
     * Creates a well-formatted string with the entire content of the printout.
     *
     * @return The well-formatted printout string.
     */
    public String createPrintoutString() {
        StringBuilder builder = new StringBuilder();
        appendLine(builder, "Vehicle Inspection");
        endSection(builder);

        LocalDateTime inspectionTime = LocalDateTime.now();
        builder.append("Time of inspection: ");
        appendLine(builder, inspectionTime.toString());
        endSection(builder);

        
        
        builder.append("Result of Inspection: ");
        appendLine(builder, "Passed all tests");
        
        endSection(builder);
        
        return builder.toString();
    }

    private void appendLine(StringBuilder builder, String line) {
        builder.append(line);
        builder.append("\n");
    }

    private void endSection(StringBuilder builder) {
        builder.append("\n");
    }
}

