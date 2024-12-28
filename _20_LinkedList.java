/**
 * This program demonstrates how to use LinkedList with custom objects (Employee) and iterate through the LinkedList using an iterator.
 * 
 * It performs the following tasks:
 * 1. Creates a LinkedList of Employee objects.
 * 2. Adds Employee objects to the LinkedList.
 * 3. Iterates through the LinkedList using an iterator.
 * 4. Displays the employee details during iteration.
 * 5. Removes an employee object from the LinkedList.
 * 6. Displays the updated employee list after removal.
 * 7. Modifies an employee's salary and displays the updated list.
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
 
     // Setter for salary
     public void setSalary(double salary) {
         this.salary = salary;
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _20_LinkedList {
 
     public static void main(String[] args) {
         
         // Create a LinkedList of Employee objects
         LinkedList<Employee> employees = new LinkedList<>();
 
         // Add Employee objects to the LinkedList
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the LinkedList of employees
         System.out.println("Employee List:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Iterating through the LinkedList using an Iterator
         System.out.println("\nIterating using Iterator:");
         Iterator<Employee> iterator = employees.iterator();
         while (iterator.hasNext()) {
             Employee emp = iterator.next();
             System.out.println(emp);
         }
 
         // Example 2: Removing an employee from the LinkedList
         System.out.println("\nRemoving employee with name 'Bob':");
         iterator = employees.iterator(); // Resetting the iterator
         while (iterator.hasNext()) {
             Employee emp = iterator.next();
             if ("Bob".equals(emp.getName())) {
                 System.out.println("Removing: " + emp);
                 iterator.remove(); // Remove the element
             }
         }
 
         // Display the LinkedList after removal
         System.out.println("\nEmployee List after removal:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 3: Modifying an employee's salary
         System.out.println("\nModifying salary of 'Alice':");
         for (Employee emp : employees) {
             if ("Alice".equals(emp.getName())) {
                 emp.setSalary(65000); // Updating salary
                 System.out.println("Updated Salary: " + emp);
             }
         }
 
         // Display the LinkedList after salary update
         System.out.println("\nEmployee List after salary update:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
     }
 }