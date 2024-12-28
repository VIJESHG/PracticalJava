/**
 * Java Inheritance - Employee and Manager Example
 * 
 * Inheritance is one of the core concepts of object-oriented programming (OOP). 
 * It allows a class (subclass) to inherit the properties and behaviors (fields and methods) 
 * from another class (superclass).
 * 
 * **Key Concepts**:
 * 1. **Superclass**: The class whose properties and methods are inherited by another class.
 * 2. **Subclass/DerivedClass**: The class that inherits the properties and methods from another class.
 * 3. **"is-a" Relationship**: A subclass is a specialized version of the superclass.
 * 
 * **Example Explanation**:
 * In this program, we demonstrate inheritance using two classes: `Employee` (superclass) and `Manager` (subclass).
 * The `Manager` class inherits all the properties and behaviors of the `Employee` class and can also have additional functionalities (such as overseeing a team).
 * 
 * The program will show:
 * 1. Basic inheritance by creating an `Employee` and a `Manager`.
 * 2. Method overriding (in the `Manager` class).
 * 3. The "is-a" relationship in practice.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _10_ClassInheritance {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "John Doe", 3000);
        emp.displayInfo();  // Displaying employee information

        // Creating a Manager object (which is also an Employee)
        Manager mgr = new Manager(102, "Alice Johnson", 5000, "Marketing");
        mgr.displayInfo();  // Displaying manager information
        mgr.manageTeam();  // Manager-specific method
    }
}

// Superclass - Employee
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize Employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display Employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Subclass - Manager (inherits from Employee)
class Manager extends Employee {
    private String department;

    // Constructor to initialize Manager object (calls superclass constructor)
    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);  // Calling the constructor of the superclass (Employee)
        this.department = department;
    }

    // Method to display Manager information
    @Override
    public void displayInfo() {
        // Overriding the displayInfo method to add the department for Manager
        super.displayInfo();  // Calling superclass method
        System.out.println("Department: " + department);
    }

    // Manager-specific method
    public void manageTeam() {
        System.out.println("Managing the " + department + " team.");
    }
}