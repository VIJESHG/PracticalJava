/**
 * This program demonstrates how to use HashSet with custom objects (Employee) and perform set operations.
 * 
 * It performs the following tasks:
 * 1. Creates a HashSet of Employee objects.
 * 2. Adds Employee objects to the HashSet.
 * 3. Removes an Employee object from the HashSet.
 * 4. Checks if a specific Employee exists in the HashSet.
 * 5. Displays the size of the HashSet.
 * 6. Clears the HashSet and displays its content.
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
 
     // Override equals() and hashCode() to ensure uniqueness in HashSet
     @Override
     public boolean equals(Object obj) {
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         Employee employee = (Employee) obj;
         return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
     }
 
     @Override
     public int hashCode() {
         return Objects.hash(name, salary);
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _22_HashSet {
 
     public static void main(String[] args) {
         
         // Create a HashSet of Employee objects
         HashSet<Employee> employees = new HashSet<>();
 
         // Add Employee objects to the HashSet
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the HashSet of employees
         System.out.println("Employee List (after add):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Attempting to add a duplicate employee
         System.out.println("\nAttempting to add a duplicate employee:");
         boolean isAdded = employees.add(new Employee("John", 50000));
         System.out.println("Was the duplicate added? " + isAdded); // Should be false, as 'John' already exists
 
         // Example 2: Checking if an employee exists
         System.out.println("\nChecking if 'Alice' is in the HashSet:");
         boolean exists = employees.contains(new Employee("Alice", 60000));
         System.out.println("Does Alice exist? " + exists); // Should be true
 
         // Example 3: Removing an employee from the HashSet
         System.out.println("\nRemoving employee 'Bob':");
         boolean isRemoved = employees.remove(new Employee("Bob", 45000));
         System.out.println("Was Bob removed? " + isRemoved); // Should be true
 
         // Display the HashSet after removal
         System.out.println("\nEmployee List (after remove):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 4: Displaying the size of the HashSet
         System.out.println("\nSize of the HashSet: " + employees.size()); // Should return the number of employees
 
         // Example 5: Clearing the HashSet
         System.out.println("\nClearing the HashSet...");
         employees.clear();
         System.out.println("Is the HashSet empty? " + employees.isEmpty()); // Should return true
     }
 }