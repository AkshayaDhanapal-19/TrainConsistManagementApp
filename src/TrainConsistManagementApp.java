import java.util.*;

class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {

        // Validation
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Bogie name cannot be empty");
        }

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        if (!type.equals("Passenger") && !type.equals("Goods")) {
            throw new IllegalArgumentException("Invalid bogie type");
        }

        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new Bogie("Sleeper", 72, "Passenger"));
            bogies.add(new Bogie("Cargo", 100, "Goods"));

            // Invalid bogies
            bogies.add(new Bogie("", 50, "Passenger"));     // empty name
            bogies.add(new Bogie("AC Chair", -10, "Passenger")); // negative capacity
            bogies.add(new Bogie("Test", 40, "Unknown"));   // invalid type

        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity + " (" + b.type + ")");
        }
    }
}