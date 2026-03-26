import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Cargo", 100));

        // 🔍 Search for a bogie
        String search = "Sleeper";
        Optional<Bogie> result = bogies.stream()
                .filter(b -> b.name.equalsIgnoreCase(search))
                .findFirst();

        System.out.println("\nSearch Result:");
        if (result.isPresent()) {
            System.out.println(result.get().name + " found with capacity " + result.get().capacity);
        } else {
            System.out.println("Bogie not found");
        }

        // 🎯 Filter high-capacity bogies (> 60)
        System.out.println("\nHigh Capacity Bogies (>60):");

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        for (Bogie b : filtered) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}