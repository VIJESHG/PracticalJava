import java.util.*;

/**
 * This program demonstrates the usage of LinkedHashMap in Java.
 * 
 * It performs the following tasks:
 * 1. Creates a LinkedHashMap to store employee names and their corresponding employee IDs.
 * 2. Adds key-value pairs to the LinkedHashMap.
 * 3. Retrieves values for specific keys.
 * 4. Removes an entry from the map.
 * 5. Iterates over the LinkedHashMap and prints each employee's details.
 * 6. Demonstrates insertion order and access order.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _30_LinkedHashMap {

    public static void main(String[] args) {
        
        // Create a LinkedHashMap to store employee name and their ID
        LinkedHashMap<Integer, String> employeeMap = new LinkedHashMap<>();
        
        // Add employee IDs and their names
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");

        // Display the LinkedHashMap
        System.out.println("Employee details (Insertion Order):");
        System.out.println(employeeMap);
        
        // Example 1: Retrieve the employee name for a specific ID
        String employeeName = employeeMap.get(102); // Get the employee with ID 102
        System.out.println("\nEmployee with ID 102: " + employeeName);
        
        // Example 2: Remove an entry from the map
        employeeMap.remove(103); // Remove the employee with ID 103
        System.out.println("\nEmployee details after removing ID 103:");
        System.out.println(employeeMap);
        
        // Example 3: Iterate over the LinkedHashMap and print each employee's details
        System.out.println("\nIterating over the LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Example 4: Demonstrate insertion order (LinkedHashMap maintains insertion order)
        System.out.println("\nEmployee details (Insertion Order Maintained):");
        System.out.println(employeeMap);
        
        // Example 5: Create LinkedHashMap with access order
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put(201, "Eve");
        accessOrderMap.put(202, "Frank");
        accessOrderMap.put(203, "Grace");

        // Access some elements to change access order
        accessOrderMap.get(202); // Access Frank
        accessOrderMap.get(203); // Access Grace
        
        // Print the order after accessing
        System.out.println("\nEmployee details (Access Order Changed):");
        System.out.println(accessOrderMap);
    }
}