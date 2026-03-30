/**
 * =============================================================
 * MAIN CLASS - UseCase1HotelBookingApp
 * =============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Hotel Booking Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message to the user
 * - Confirms that the system has started successfully
 *
 * No business logic, data structures, or user input
 * is implemented in this use case.
 *
 * The goal is to establish a clear and predictable
 * application startup point.
 *
 * @author Developer
 * @version 1.0
 */
public class uc1 {

    /**
     * Application entry point.
     * <p>
     * This method is the first method executed
     * when the program is launched by the JVM.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Application Name and Version
        String appName = "Hotel Booking Management System";
        String version = "v1.0";

        // Welcome Message
        System.out.println("=================================================");
        System.out.println("        WELCOME TO " + appName.toUpperCase());
        System.out.println("=================================================");
        System.out.println("Version: " + version);
        System.out.println();
        System.out.println("System started successfully.");
        System.out.println("Thank you for using the application.");
        System.out.println("=================================================");
    }
}