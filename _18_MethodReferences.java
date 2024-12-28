/**
 * Method References in Java
 * 
 * This file demonstrates the use of method references in Java.
 * Method references are used as a shorthand for lambda expressions when the lambda body is simply calling a method.
 * There are different types of method references:
 * 1. Static method reference.
 * 2. Instance method reference.
 * 3. Constructor reference.
 * 
 * The file contains examples to showcase all of these use cases.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.util.*;
 import java.util.function.*;
 
 public class _18_MethodReferences {
 
     public static void main(String[] args) {
 
         // Example 1: Static Method Reference
         List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");
         
         // Using method reference to call the static method `printName`
         names.forEach(MethodReferenceDemo::printName);
 
         // Example 2: Instance Method Reference
         Employee emp1 = new Employee("John", 45000);
         Employee emp2 = new Employee("Alice", 55000);
         Employee emp3 = new Employee("Bob", 35000);
         
         // Using method reference to call instance method `printEmployee`
         List<Employee> employees = Arrays.asList(emp1, emp2, emp3);
         employees.forEach(Employee::printEmployee);
 
         // Example 3: Instance Method Reference on an Arbitrary Object of a Particular Type
         List<String> strings = Arrays.asList("hello", "world", "java");
         
         // Using method reference to call `toUpperCase` instance method
         strings.replaceAll(String::toUpperCase);
         System.out.println("\nUpdated list of strings in uppercase:");
         strings.forEach(System.out::println);
 
         // Example 4: Constructor Reference
         // Using method reference to create a new Employee using the constructor
         List<Employee> newEmployees = Arrays.asList("John", "Alice", "Bob", "Diana")
                                              .stream()
                                              .map(Employee::new) // Constructor reference to create Employee object
                                              .toList();
         System.out.println("\nNew Employees:");
         newEmployees.forEach(System.out::println);
     }
 
     // Static method to print the name
     public static void printName(String name) {
         System.out.println(name);
     }
 
 }
 
 // Employee class with name and salary attributes
 class Employee {
 
     private String name;
     private double salary;
 
     // Constructor with name and salary
     public Employee(String name) {
         this.name = name;
         this.salary = 40000;  // Default salary
     }
 
     // Instance method to print employee details
     public void printEmployee() {
         System.out.println(name + " - $" + salary);
     }
 
     // Override toString to display employee details
     @Override
     public String toString() {
         return name + " - $" + salary;
     }
 }