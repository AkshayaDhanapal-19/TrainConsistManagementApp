import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        // Check existence of Sleeper
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);
    }

}
