/**
 * This program demonstrates how to use TreeSet with custom objects (Employee) and perform set operations.
 * 
 * It performs the following tasks:
 * 1. Creates a TreeSet of Employee objects.
 * 2. Adds Employee objects to the TreeSet.
 * 3. Removes an Employee object from the TreeSet.
 * 4. Checks if a specific Employee exists in the TreeSet.
 * 5. Displays the size of the TreeSet.
 * 6. Displays the first and last elements in the TreeSet.
 * 7. Clears the TreeSet and displays its content.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.util.*;

 class Employee implements Comparable<Employee> {
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
 
     // Override compareTo() to define natural ordering by salary
     @Override
     public int compareTo(Employee other) {
         return Double.compare(this.salary, other.salary); // Sort by salary in ascending order
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _23_TreeSet {
 
     public static void main(String[] args) {
         
         // Create a TreeSet of Employee objects
         TreeSet<Employee> employees = new TreeSet<>();
 
         // Add Employee objects to the TreeSet
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the TreeSet of employees (sorted by salary)
         System.out.println("Employee List (after add):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Attempting to add a duplicate employee
         System.out.println("\nAttempting to add a duplicate employee:");
         boolean isAdded = employees.add(new Employee("John", 50000));
         System.out.println("Was the duplicate added? " + isAdded); // Should be false, as 'John' already exists
 
         // Example 2: Checking if an employee exists
         System.out.println("\nChecking if 'Alice' is in the TreeSet:");
         boolean exists = employees.contains(new Employee("Alice", 60000));
         System.out.println("Does Alice exist? " + exists); // Should be true
 
         // Example 3: Removing an employee from the TreeSet
         System.out.println("\nRemoving employee 'Bob':");
         boolean isRemoved = employees.remove(new Employee("Bob", 45000));
         System.out.println("Was Bob removed? " + isRemoved); // Should be true
 
         // Display the TreeSet after removal
         System.out.println("\nEmployee List (after remove):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 4: Displaying the size of the TreeSet
         System.out.println("\nSize of the TreeSet: " + employees.size()); // Should return the number of employees
 
         // Example 5: Displaying the first and last elements in the TreeSet
         System.out.println("\nFirst Employee (lowest salary): " + employees.first()); // Should return employee with lowest salary
         System.out.println("Last Employee (highest salary): " + employees.last()); // Should return employee with highest salary
 
         // Example 6: Clearing the TreeSet
         System.out.println("\nClearing the TreeSet...");
         employees.clear();
         System.out.println("Is the TreeSet empty? " + employees.isEmpty()); // Should return true
     }
 }