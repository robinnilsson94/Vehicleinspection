package Vehicleinspection.startup;

/**
 * Contains the <code>main</code> method. Performs all startup of the
 * application.
 */
public class Main {
    /**
     * Starts the application.
     *
     * @param args The application does not take any command line parameters.
     */
    public static void main(String[] args) {
        DBCreator creator = new DBCreator();
        Printer printer = new Printer();
        Controller contr = new Controller(creator, printer);
        new View(contr).sampleExecution();
    }
}

