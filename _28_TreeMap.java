/**
 * This program demonstrates the usage of TreeMap in Java.
 * 
 * It performs the following tasks:
 * 1. Creates a TreeMap to store employee information with employee ID as the key and employee name as the value.
 * 2. Adds key-value pairs (employee ID and name) to the TreeMap.
 * 3. Retrieves values using keys.
 * 4. Removes a key-value pair based on the key.
 * 5. Displays the size of the TreeMap.
 * 6. Iterates over the TreeMap using keySet(), values(), and entrySet().
 * 7. Demonstrates custom sorting using a comparator.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.util.*;

 class Employee {
     private String name;
     private double salary;
 
     // Constructor
     public Employee(String name, double salary) {
         this.name = name;
         this.salary = salary;
     }
 
     // Getter for name
     public String getName() {
         return name;
     }
 
     // Getter for salary
     public double getSalary() {
         return salary;
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _28_TreeMap {
 
     public static void main(String[] args) {
         
         // Create a TreeMap to store employee ID and employee name (sorted by employee ID)
         TreeMap<Integer, String> employees = new TreeMap<>();
 
         // Add some employee ID and name pairs to the TreeMap
         employees.put(101, "John");
         employees.put(102, "Alice");
         employees.put(103, "Bob");
         employees.put(104, "Diana");
         
         // Display the TreeMap (sorted by key - employee ID)
         System.out.println("Initial TreeMap (sorted by employee ID):");
         System.out.println(employees);
 
         // Example 1: Retrieve a value using its key
         String employeeName = employees.get(102); // Get the employee with ID 102
         System.out.println("\nEmployee with ID 102: " + employeeName);
 
         // Example 2: Check if a key exists in the TreeMap
         boolean hasEmployee = employees.containsKey(105); // Check if ID 105 exists
         System.out.println("\nDoes employee with ID 105 exist? " + hasEmployee);
 
         // Example 3: Remove a key-value pair
         System.out.println("\nRemoving employee with ID 103...");
         employees.remove(103); // Remove the employee with ID 103
         System.out.println("Updated TreeMap: " + employees);
 
         // Example 4: Get the size of the TreeMap
         System.out.println("\nSize of the TreeMap: " + employees.size());
 
         // Example 5: Iterating over the TreeMap using keySet()
         System.out.println("\nIterating over the TreeMap (using keySet()):");
         for (Integer id : employees.keySet()) {
             System.out.println("Employee ID: " + id + ", Name: " + employees.get(id));
         }
 
         // Example 6: Iterating over the TreeMap using values()
         System.out.println("\nIterating over the TreeMap (using values()):");
         for (String name : employees.values()) {
             System.out.println("Employee Name: " + name);
         }
 
         // Example 7: Iterating over the TreeMap using entrySet()
         System.out.println("\nIterating over the TreeMap (using entrySet()):");
         for (Map.Entry<Integer, String> entry : employees.entrySet()) {
             System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
         }
 
         // Example 8: Custom Sorting with a Comparator
         TreeMap<Integer, Employee> employeeMap = new TreeMap<>(new Comparator<Integer>() {
             @Override
             public int compare(Integer id1, Integer id2) {
                 // Custom sorting logic: reversing the order of employee IDs
                 return id2.compareTo(id1); // Descending order of IDs
             }
         });
 
         // Adding employees with IDs
         employeeMap.put(101, new Employee("John", 50000));
         employeeMap.put(102, new Employee("Alice", 60000));
         employeeMap.put(103, new Employee("Bob", 45000));
 
         // Display the TreeMap (sorted by employee ID in descending order)
         System.out.println("\nTreeMap (sorted by employee ID in descending order):");
         for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
             System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue().getName());
         }
     }
 }