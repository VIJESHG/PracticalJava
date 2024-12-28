/**
 * This program demonstrates the usage of HashMap in Java.
 * 
 * It performs the following tasks:
 * 1. Creates a HashMap to store employee information with employee ID as the key and employee name as the value.
 * 2. Adds key-value pairs (employee ID and name) to the HashMap.
 * 3. Retrieves values using keys.
 * 4. Removes a key-value pair based on the key.
 * 5. Displays the size of the HashMap.
 * 6. Iterates over the HashMap using keySet(), values(), and entrySet().
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.util.*;

 public class _27_HashMap {
 
     public static void main(String[] args) {
         
         // Create a HashMap to store employee ID and employee name
         HashMap<Integer, String> employees = new HashMap<>();
 
         // Add some employee ID and name pairs to the HashMap
         employees.put(101, "John");
         employees.put(102, "Alice");
         employees.put(103, "Bob");
         employees.put(104, "Diana");
         
         // Display the HashMap
         System.out.println("Initial HashMap:");
         System.out.println(employees);
 
         // Example 1: Retrieve a value using its key
         String employeeName = employees.get(102); // Get the employee with ID 102
         System.out.println("\nEmployee with ID 102: " + employeeName);
 
         // Example 2: Check if a key exists in the HashMap
         boolean hasEmployee = employees.containsKey(105); // Check if ID 105 exists
         System.out.println("\nDoes employee with ID 105 exist? " + hasEmployee);
 
         // Example 3: Remove a key-value pair
         System.out.println("\nRemoving employee with ID 103...");
         employees.remove(103); // Remove the employee with ID 103
         System.out.println("Updated HashMap: " + employees);
 
         // Example 4: Get the size of the HashMap
         System.out.println("\nSize of the HashMap: " + employees.size());
 
         // Example 5: Iterating over the HashMap using keySet()
         System.out.println("\nIterating over the HashMap (using keySet()):");
         for (Integer id : employees.keySet()) {
             System.out.println("Employee ID: " + id + ", Name: " + employees.get(id));
         }
 
         // Example 6: Iterating over the HashMap using values()
         System.out.println("\nIterating over the HashMap (using values()):");
         for (String name : employees.values()) {
             System.out.println("Employee Name: " + name);
         }
 
         // Example 7: Iterating over the HashMap using entrySet()
         System.out.println("\nIterating over the HashMap (using entrySet()):");
         for (Map.Entry<Integer, String> entry : employees.entrySet()) {
             System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
         }
     }
 }