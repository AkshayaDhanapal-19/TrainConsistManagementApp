import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    // Log file
    static String logFile = "train_log.txt";

    // Logging method
    public static void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(LocalDateTime.now() + " - " + message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Logging failed");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        // Add bogies + log
        bogies.add(new Bogie("Sleeper", 72));
        log("Added Sleeper bogie");

        bogies.add(new Bogie("AC Chair", 60));
        log("Added AC Chair bogie");

        bogies.add(new Bogie("Cargo", 100));
        log("Added Cargo bogie");

        // Display bogies
        System.out.println("\nCurrent Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        log("Displayed all bogies");

        System.out.println("\nLogs saved in train_log.txt");
    }
}