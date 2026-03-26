import java.util.*;
import java.io.*;

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

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        String fileName = "train_data.txt";

        // 💾 Save to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Bogie b : bogies) {
                writer.write(b.name + "," + b.capacity);
                writer.newLine();
            }
            System.out.println("\nData saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // 📂 Read from file
        System.out.println("\nReading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(data[0] + " -> " + data[1]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}