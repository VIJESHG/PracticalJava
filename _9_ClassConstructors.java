/**
 * Java Constructors - Use Cases and Examples
 * 
 * In Java, a **constructor** is a special type of method that is called when an object of a class is created. 
 * The primary purpose of a constructor is to initialize the newly created object. It has the same name as the class and does not have a return type.
 * 
 * **Types of Constructors**:
 * 1. **Default Constructor**: A constructor that has no parameters and initializes the object with default values.
 * 2. **Parameterized Constructor**: A constructor that takes parameters to initialize the object with specific values.
 * 3. **Copy Constructor**: A constructor used to create a new object as a copy of an existing object (not natively available in Java, but can be manually defined).
 * 
 * This program demonstrates:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Constructor Overloading (Multiple Constructors)
 * 4. Using Constructors to initialize fields in an object.
 * 
 * Constructors help us to set the initial state of an object and are an essential part of object-oriented programming.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _9_ClassConstructors {

    public static void main(String[] args) {
        
        // 1. Default Constructor Use Case
        System.out.println("=== Use Case 1: Default Constructor ===");
        Employee emp1 = new Employee();  // Default constructor is called
        emp1.displayInfo();  // Displays default values

        // 2. Parameterized Constructor Use Case
        System.out.println("\n=== Use Case 2: Parameterized Constructor ===");
        Employee emp2 = new Employee(101, "Alice", 5000);  // Parameterized constructor
        emp2.displayInfo();  // Displays specific values

        // 3. Constructor Overloading Use Case
        System.out.println("\n=== Use Case 3: Constructor Overloading ===");
        Employee emp3 = new Employee(102, "Bob");  // Constructor with two parameters
        emp3.displayInfo();  // Displays specific values

        // 4. Copy Constructor Use Case
        System.out.println("\n=== Use Case 4: Copy Constructor ===");
        Employee emp4 = new Employee(emp2);  // Creating a copy of emp2 using the copy constructor
        emp4.displayInfo();  // Displays emp2's values as a copy
    }
}

// Class representing an Employee
class Employee {
    private int id;
    private String name;
    private double salary;

    // 1. Default Constructor
    public Employee() {
        // Default values assigned to the fields
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // 2. Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 3. Constructor Overloading: Another parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;  // Default salary if not provided
    }

    // 4. Copy Constructor
    public Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}