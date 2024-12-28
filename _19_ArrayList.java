/**
 * This program demonstrates how to use ArrayList with custom objects (Employee) and iterate through the ArrayList using an iterator.
 * 
 * It performs the following tasks:
 * 1. Creates an ArrayList of Employee objects.
 * 2. Adds Employee objects to the ArrayList.
 * 3. Iterates through the ArrayList using an iterator.
 * 4. Displays the employee details during iteration.
 * 5. Removes an employee object using the iterator if the salary is less than 50000.
 * 6. Displays the updated employee list after removal.
 

 * Key operations shown:
 * 1. Adding elements to an ArrayList.
 * 2. Accessing elements using indices.
 * 3. Removing elements by index.
 * 4. Checking the size and existence of an element.
 * 5. Iterating through the ArrayList using for-each loop.
 * 6. Clearing the ArrayList.
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
 
 public class _19_ArrayList {
 
     public static void main(String[] args) {
         
         // Create an ArrayList of Employee objects
         ArrayList<Employee> employees = new ArrayList<>();
 
         // Add Employee objects to the ArrayList
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the ArrayList of employees
         System.out.println("Employee List:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Iterating through the ArrayList using an Iterator
         System.out.println("\nIterating using Iterator:");
         Iterator<Employee> iterator = employees.iterator();
         while (iterator.hasNext()) {
             Employee emp = iterator.next();
             System.out.println(emp);
         }
 
         // Example 2: Iterating with Iterator and removing an element based on condition
         System.out.println("\nIterating and removing an employee with salary less than 50000:");
         iterator = employees.iterator(); // Resetting the iterator
         while (iterator.hasNext()) {
             Employee emp = iterator.next();
             if (emp.getSalary() < 50000) {
                 System.out.println("Removing: " + emp);
                 iterator.remove(); // Remove the element
             }
         }
 
         // Display the ArrayList after removal
         System.out.println("\nEmployee List after removal:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }

         
        // Example 1: Creating an ArrayList and adding elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        System.out.println("Original List: " + list);
        
        // Example 2: Accessing elements using get()
        String element = list.get(1); // Get the element at index 1 (Banana)
        System.out.println("Element at index 1: " + element);
        
        // Example 3: Removing an element by index
        list.remove(2); // Remove the element at index 2 (Cherry)
        System.out.println("After removing element at index 2: " + list);
        
        // Example 4: Checking the size of the ArrayList
        System.out.println("Size of the list: " + list.size());
        
        // Example 5: Checking if a specific element exists
        boolean containsBanana = list.contains("Banana");
        System.out.println("Does the list contain Banana? " + containsBanana);
        
        // Example 6: Iterating through the ArrayList using for-each loop
        System.out.println("Iterating through the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        
        // Example 7: Replacing an element at a specific index
        list.set(1, "Elderberry"); // Replace "Date" with "Elderberry"
        System.out.println("After replacing element at index 1: " + list);
        
        // Example 8: Clearing the ArrayList
        list.clear();
        System.out.println("After clearing the list: " + list);
        
        // Example 9: Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
     }
 }