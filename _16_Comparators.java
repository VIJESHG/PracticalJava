/**
 * Comparator Interface in Java - Use Cases and Examples
 * 
 * The Comparator interface allows us to define custom sorting logic for objects.
 * This example demonstrates how to use Comparator to sort Employee objects first by their name and then by their salary.
 * 
 * Use Cases:
 * 1. Custom sorting of objects in collections (List, Set).
 * 2. Sorting based on multiple fields (e.g., by name and salary).
 * 3. Flexible and reusable sorting logic.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.util.*;

 public class _16_Comparators {
 
     public static void main(String[] args) {
 
         // Create a list of Employee objects
         List<Employee> employees = new ArrayList<>();
         employees.add(new Employee("John", 45000));
         employees.add(new Employee("Alice", 55000));
         employees.add(new Employee("Bob", 35000));
         employees.add(new Employee("Diana", 40000));
         
         // Sort the employees first by name, and if equal, by salary
         Collections.sort(employees, new EmployeeNameSalaryComparator());
         
         // Display the sorted list of employees
         System.out.println("Employees sorted by name and salary:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }

            // Sort the employees by name
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("Employees sorted by name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
     }
 }
 
 // Employee class with name and salary attributes
 class Employee {
 
     private String name;
     private double salary;
 
     // Constructor with parameters
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
 
     // Override toString to display employee details
     @Override
     public String toString() {
         return name + " - $" + salary;
     }
 }
 
 // Comparator to sort Employee objects first by name, then by salary
 class EmployeeNameSalaryComparator implements Comparator<Employee> {
 
     @Override
     public int compare(Employee e1, Employee e2) {
         // First compare by name
         int nameComparison = e1.getName().compareTo(e2.getName());
         if (nameComparison != 0) {
             return nameComparison;
         }
 
         // If names are the same, compare by salary
         return Double.compare(e1.getSalary(), e2.getSalary());
     }
 }

 // Comparator to sort by name
 class EmployeeNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getName().compareTo(e2.getName());
    }
 }