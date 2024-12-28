/**
 * Polymorphism in Java - Use Cases and Examples
 * 
 * Polymorphism allows one interface to be used for different underlying forms (data types).
 * In Java, polymorphism is classified into two types:
 * 
 * 1. **Compile-time Polymorphism (Method Overloading)**:
 *    This occurs when two or more methods in the same class have the same name but different parameters.
 *    It is resolved at compile time.
 * 
 * 2. **Runtime Polymorphism (Method Overriding)**:
 *    This occurs when a subclass provides a specific implementation of a method that is already defined in the superclass.
 *    It is resolved at runtime.
 * 
 * The program demonstrates:
 * 1. Method Overloading (Compile-time Polymorphism).
 * 2. Method Overriding (Runtime Polymorphism).
 * 3. Using Interfaces to demonstrate polymorphism across different types of classes.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _11_Polymorphism {

    public static void main(String[] args) {

        // Demonstrating Compile-time Polymorphism (Method Overloading)
        System.out.println("=== Method Overloading (Compile-time Polymorphism) ===");
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(5, 10));
        System.out.println("Sum (double): " + calc.add(5.5, 10.5));
        System.out.println("Sum (int, double): " + calc.add(5, 10.5));

        // Demonstrating Runtime Polymorphism (Method Overriding)
        System.out.println("\n=== Method Overriding (Runtime Polymorphism) ===");
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.sound();  // Calls Animal's sound method
        dog.sound();     // Calls Dog's overridden sound method
        
        // Demonstrating Polymorphism with Interfaces
        System.out.println("\n=== Polymorphism with Interfaces ===");
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();     // Calls Car's start method
        bike.start();    // Calls Bike's start method
    }
}

// Class demonstrating Compile-time Polymorphism (Method Overloading)
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
}

// Class demonstrating Runtime Polymorphism (Method Overriding)
class Animal {
    
    // Method in the superclass (Animal)
    public void sound() {
        System.out.println("Animals make sounds.");
    }
}

// Subclass of Animal that overrides the sound method
class Dog extends Animal {
    
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Interface demonstrating Polymorphism across different classes
interface Vehicle {
    void start();  // Method to start the vehicle
}

// Class implementing Vehicle interface
class Car implements Vehicle {

    // Implementing start method for Car
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }
}

// Class implementing Vehicle interface
class Bike implements Vehicle {

    // Implementing start method for Bike
    @Override
    public void start() {
        System.out.println("The bike is starting.");
    }
}