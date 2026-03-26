import java.util.*;
import java.util.stream.*;


import java.util.ArrayList;
import java.util.List;
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
        // UC5: LinkedHashSet (Ordered Unique Train)
        LinkedHashSet<String> train = new LinkedHashSet<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nTrain Formation:");
        System.out.println(train);

        // UC6: HashMap (Capacity Mapping)
        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);
        capacityMap.put("Cargo", 100);

        // UC7: Comparator Sorting
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

        bogies.sort((a, b) -> b.capacity - a.capacity);

        System.out.println("\nSorted Bogies (High to Low Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // UC8: Total Capacity Calculation
        int totalCapacity = 0;
        for (int cap : capacityMap.values()) {
            totalCapacity += cap;
        }

        System.out.println("\nTotal Train Capacity: " + totalCapacity);
    }
}
        // Create LinkedList for ordered consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}