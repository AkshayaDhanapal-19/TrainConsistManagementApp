import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedHashSet for ordered unique bogies
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Adding bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Adding duplicate intentionally
        train.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("\nTrain Formation (Ordered & Unique):");
        System.out.println(train);
    }
}
