/**
 * This program demonstrates how to use ArrayDeque with custom objects (Employee) and perform various operations on the deque.
 * 
 * It performs the following tasks:
 * 1. Creates an ArrayDeque of Employee objects.
 * 2. Adds Employee objects to the front and back of the deque.
 * 3. Removes employees from the front and back.
 * 4. Displays the deque content after various operations.
 * 5. Peeks at the front and back elements.
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
 
 public class _21_ArrayDeque {
 
     public static void main(String[] args) {
         
         // Create an ArrayDeque of Employee objects
         ArrayDeque<Employee> employees = new ArrayDeque<>();
 
         // Add Employee objects to the back of the deque
         employees.addLast(new Employee("John", 50000));
         employees.addLast(new Employee("Alice", 60000));
         employees.addLast(new Employee("Bob", 45000));
         employees.addLast(new Employee("Diana", 55000));
 
         // Display the ArrayDeque of employees
         System.out.println("Employee List (after addLast):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Adding an element to the front using addFirst()
         System.out.println("\nAdding an employee to the front:");
         employees.addFirst(new Employee("Eve", 70000));
 
         // Display the ArrayDeque after adding an employee at the front
         System.out.println("Employee List (after addFirst):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 2: Removing an element from the front using removeFirst()
         System.out.println("\nRemoving employee from the front:");
         Employee removedFirst = employees.removeFirst();
         System.out.println("Removed: " + removedFirst);
 
         // Display the ArrayDeque after removal from the front
         System.out.println("\nEmployee List (after removeFirst):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 3: Removing an element from the back using removeLast()
         System.out.println("\nRemoving employee from the back:");
         Employee removedLast = employees.removeLast();
         System.out.println("Removed: " + removedLast);
 
         // Display the ArrayDeque after removal from the back
         System.out.println("\nEmployee List (after removeLast):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 4: Peeking at the first and last elements
         System.out.println("\nPeeking at the first and last elements:");
         Employee first = employees.peekFirst();
         Employee last = employees.peekLast();
         System.out.println("First Employee: " + first);
         System.out.println("Last Employee: " + last);
     }
 }