/**
 * Comparable Interface in Java - Use Cases and Examples
 * 
 * The Comparable interface is used to define the natural order of objects.
 * It allows us to specify how objects of a class should be compared and sorted.
 * This example demonstrates how to use Comparable to sort Employee objects by their salary.
 * 
 * Use Cases:
 * 1. Sorting objects in a collection (List, Set).
 * 2. Sorting custom objects based on a field or multiple fields.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
import java.util.*;

public class _15_Comparables {

    public static void main(String[] args) {
        
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 45000));
        employees.add(new Employee("Alice", 55000));
        employees.add(new Employee("Bob", 35000));
        employees.add(new Employee("Diana", 40000));
        
        // Sort the list of employees using Collections.sort(), which uses compareTo()
        Collections.sort(employees);
        
        // Display the sorted list of employees by salary
        System.out.println("Employees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

// Employee class implements Comparable to compare employees by salary
class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Implement the compareTo method to compare employees by salary
    @Override
    public int compareTo(Employee other) {
        // Compare the current object's salary with another Employee's salary
        if (this.salary < other.salary) {
            return -1; // This employee's salary is less
        } else if (this.salary > other.salary) {
            return 1;  // This employee's salary is greater
        }
        return 0;  // Salaries are equal
    }

    // Override toString method to display employee details
    @Override
    public String toString() {
        return name + " - $" + salary;
    }
}