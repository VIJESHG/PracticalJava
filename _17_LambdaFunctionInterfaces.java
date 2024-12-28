/**
 * Lambda Expressions and Functional Interfaces in Java
 * 
 * This file demonstrates the use of lambda expressions and functional interfaces in Java.
 * Lambda expressions allow us to pass behavior as arguments to methods, making the code more concise and readable.
 * Functional interfaces are interfaces with exactly one abstract method. Lambda expressions are primarily used to implement these interfaces.
 * 
 * This file includes the following examples:
 * 1. Runnable Interface - Using lambda expression to create and run threads.
 * 2. Comparator Interface - Using lambda expression to sort a list of Employee objects.
 * 3. Predicate Interface - Using lambda expression to filter employees based on salary.
 * 4. Function Interface - Using lambda expression to transform employee salary into a different currency.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.util.*;
 import java.util.function.*;
 
 public class _17_LambdaFunctionInterfaces {
 
     public static void main(String[] args) {
 
         // Example 1: Runnable Interface with Lambda Expression
         Runnable task = () -> {
             System.out.println("Running in a separate thread!");
         };
 
         // Starting the thread
         Thread thread = new Thread(task);
         thread.start();
 
         // Example 2: Comparator Interface with Lambda Expression
         List<Employee> employees = new ArrayList<>();
         employees.add(new Employee("John", 45000));
         employees.add(new Employee("Alice", 55000));
         employees.add(new Employee("Bob", 35000));
         employees.add(new Employee("Diana", 40000));
 
         // Sorting employees by name using lambda expression
         employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
         System.out.println("Employees sorted by name:");
         employees.forEach(emp -> System.out.println(emp));
 
         // Sorting employees by salary using lambda expression
         employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
         System.out.println("\nEmployees sorted by salary:");
         employees.forEach(emp -> System.out.println(emp));
 
         // Example 3: Predicate Interface with Lambda Expression
         Predicate<Employee> salaryPredicate = emp -> emp.getSalary() > 40000;
         List<Employee> highSalaryEmployees = filterEmployees(employees, salaryPredicate);
         System.out.println("\nEmployees with salary greater than 40000:");
         highSalaryEmployees.forEach(emp -> System.out.println(emp));
 
         // Example 4: Function Interface with Lambda Expression
         Function<Employee, Double> salaryInUSD = emp -> emp.getSalary() * 1.1;
         System.out.println("\nEmployees' salaries in USD:");
         employees.forEach(emp -> System.out.println(emp.getName() + ": " + salaryInUSD.apply(emp)));
     }
 
     // Method to filter employees based on a given predicate
     public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
         List<Employee> filteredList = new ArrayList<>();
         for (Employee emp : employees) {
             if (predicate.test(emp)) {
                 filteredList.add(emp);
             }
         }
         return filteredList;
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