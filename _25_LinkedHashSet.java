/**
* This program demonstrates how to use LinkedHashSet with custom objects (Employee).
* 
* It performs the following tasks:
* 1. Creates a LinkedHashSet of Employee objects.
* 2. Adds Employee objects to the LinkedHashSet.
* 3. Removes an Employee object from the LinkedHashSet.
* 4. Checks if a specific Employee exists in the LinkedHashSet.
* 5. Displays the LinkedHashSet elements in insertion order.
* 6. Clears the LinkedHashSet and displays its content.
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

   // Override equals() and hashCode() for comparing Employee objects
   @Override
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       Employee employee = (Employee) obj;
       return Double.compare(employee.salary, salary) == 0 &&
               name.equals(employee.name);
   }

   @Override
   public int hashCode() {
       return Objects.hash(name, salary);
   }
}

public class _25_LinkedHashSet {

   public static void main(String[] args) {
       
       // Create a LinkedHashSet to store Employee objects
       LinkedHashSet<Employee> employees = new LinkedHashSet<>();

       // Add Employee objects to the LinkedHashSet
       employees.add(new Employee("John", 50000));
       employees.add(new Employee("Alice", 60000));
       employees.add(new Employee("Bob", 45000));
       employees.add(new Employee("Diana", 55000));

       // Display the LinkedHashSet (in insertion order)
       System.out.println("Employee List (after add):");
       for (Employee emp : employees) {
           System.out.println(emp);
       }

       // Example 1: Adding a duplicate employee
       System.out.println("\nAttempting to add a duplicate employee:");
       boolean isAdded = employees.add(new Employee("John", 50000));
       System.out.println("Was the duplicate added? " + isAdded); // Should be false as 'John' already exists

       // Example 2: Checking if an employee exists
       System.out.println("\nChecking if 'Alice' is in the LinkedHashSet:");
       boolean exists = employees.contains(new Employee("Alice", 60000));
       System.out.println("Does Alice exist? " + exists); // Should be true

       // Example 3: Removing an employee from the LinkedHashSet
       System.out.println("\nRemoving employee 'Bob':");
       boolean isRemoved = employees.remove(new Employee("Bob", 45000));
       System.out.println("Was Bob removed? " + isRemoved); // Should be true

       // Display the LinkedHashSet after removal
       System.out.println("\nEmployee List (after remove):");
       for (Employee emp : employees) {
           System.out.println(emp);
       }

       // Example 4: Displaying the size of the LinkedHashSet
       System.out.println("\nSize of the LinkedHashSet: " + employees.size()); // Should return the number of employees

       // Example 5: Clearing the LinkedHashSet
       System.out.println("\nClearing the LinkedHashSet...");
       employees.clear();
       System.out.println("Is the LinkedHashSet empty? " + employees.isEmpty()); // Should return true
   }
} {
    
}
