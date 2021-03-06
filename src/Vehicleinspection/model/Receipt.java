
package Vehicleinspection.model;

import java.time.LocalDateTime;
import Vehicleinspection.integration.InspectionCostDatabase;

/**
 * The receipt of an inspection.
 */
public class Receipt {
    private final InspectionCompany inspection;
    private InspectionCostDatabase inspectionCostDatabase;
    private CurrentVehicle currentVehicle;

    /**
     * Creates a new instance.
     *
     * @param inspection The inspection proved by this receipt.
     */
    public Receipt(InspectionCompany inspection) {
        this.inspection = inspection;
    }

    /**
     * Creates a well-formatted string with the entire content of the receipt.
     *
     * @return The well-formatted receipt string.
     */
    public String createReceiptString() {
        StringBuilder builder = new StringBuilder();
        appendLine(builder, "Vehicle Inspection");
        endSection(builder);

        LocalDateTime inspectionTime = LocalDateTime.now();
        builder.append("Time of inspection: ");
        appendLine(builder, inspectionTime.toString());
        endSection(builder);

        builder.append("Inspected car: ");
        builder.append("Cost: ");
        appendLine(builder, "" + inspection.getTotalCost() + " kr");
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

