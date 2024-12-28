/**
 * This program demonstrates the usage of PriorityQueue in Java.
 * 
 * It performs the following tasks:
 * 1. Creates a PriorityQueue of integers using natural ordering.
 * 2. Creates a PriorityQueue of Employee objects using a custom comparator.
 * 3. Adds elements to the PriorityQueue.
 * 4. Removes elements from the PriorityQueue and prints them.
 * 5. Uses peek() to view the top element without removal.
 * 6. Demonstrates priority ordering using both natural ordering and comparator.
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
 
 public class _26_PriorityQueue {
 
     public static void main(String[] args) {
 
         // PriorityQueue of integers using natural ordering (min-heap)
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         pq.offer(10);
         pq.offer(30);
         pq.offer(20);
         pq.offer(50);
         pq.offer(40);
 
         // Display elements in the PriorityQueue
         System.out.println("PriorityQueue (min-heap) of integers:");
         while (!pq.isEmpty()) {
             System.out.println(pq.poll()); // Remove and print the top (min) element
         }
 
         // PriorityQueue of Employee objects using a custom comparator (sort by salary)
         PriorityQueue<Employee> employeeQueue = new PriorityQueue<>(new Comparator<Employee>() {
             @Override
             public int compare(Employee e1, Employee e2) {
                 return Double.compare(e1.getSalary(), e2.getSalary()); // Sort by salary
             }
         });
 
         employeeQueue.offer(new Employee("John", 50000));
         employeeQueue.offer(new Employee("Alice", 70000));
         employeeQueue.offer(new Employee("Bob", 45000));
         employeeQueue.offer(new Employee("Diana", 60000));
 
         // Display elements in the PriorityQueue (sorted by salary)
         System.out.println("\nPriorityQueue of employees (sorted by salary):");
         while (!employeeQueue.isEmpty()) {
             System.out.println(employeeQueue.poll()); // Remove and print the top element (lowest salary)
         }
 
         // PriorityQueue with natural ordering for Strings
         PriorityQueue<String> stringQueue = new PriorityQueue<>();
         stringQueue.offer("Apple");
         stringQueue.offer("Banana");
         stringQueue.offer("Cherry");
         stringQueue.offer("Date");
 
         // Display elements in the PriorityQueue (sorted alphabetically)
         System.out.println("\nPriorityQueue of strings (sorted alphabetically):");
         while (!stringQueue.isEmpty()) {
             System.out.println(stringQueue.poll()); // Remove and print the top element
         }
 
         // Peek the top element without removal
         System.out.println("\nPeeking the top element in the integer PriorityQueue:");
         pq.offer(10);
         pq.offer(30);
         pq.offer(20);
         pq.offer(50);
         pq.offer(40);
         System.out.println("Top element (without removal): " + pq.peek()); // Should return 10
     }
 }