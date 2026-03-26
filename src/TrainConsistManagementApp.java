import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        int n = 100000;

        // 🔹 ArrayList Performance
        List<String> arrayList = new ArrayList<>();
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            arrayList.add("Bogie " + i);
        }

        long end1 = System.currentTimeMillis();
        System.out.println("\nArrayList Time: " + (end1 - start1) + " ms");

        // 🔹 LinkedList Performance
        List<String> linkedList = new LinkedList<>();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            linkedList.add("Bogie " + i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList Time: " + (end2 - start2) + " ms");

        // Comparison Result
        if ((end1 - start1) < (end2 - start2)) {
            System.out.println("\nArrayList is faster for insertion.");
        } else {
            System.out.println("\nLinkedList is faster for insertion.");
        }
    }
}