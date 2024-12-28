/**
 * Abstraction in Java - Use Cases and Examples
 * 
 * Abstraction is the concept of hiding the complex implementation details of an object and exposing only the essential features.
 * In Java, abstraction is achieved using:
 * 1. **Abstract Classes**: Classes with abstract methods that must be implemented by subclasses.
 * 2. **Interfaces**: Define a contract that implementing classes must adhere to.
 * 
 * This example demonstrates:
 * 1. Using an **abstract class** to define common functionality.
 * 2. Using an **interface** to define a contract that classes can implement.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _13_Abstraction {

    public static void main(String[] args) {
        
        // Using the abstract class and concrete classes
        System.out.println("=== Using Abstract Class ===");
        Vehicle car = new Car(); // Car is a concrete subclass of Vehicle
        car.start();  // Calls start() from Car
        car.stop();   // Calls stop() from Vehicle
        
        // Using the interface
        System.out.println("\n=== Using Interface ===");
        Car engine = new Car(); // Car implements Engine
        engine.startEngine();  // Calls startEngine() from Engine interface
    }
}

// Abstract class representing a general Vehicle
abstract class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle object created.");
    }
    // Abstract method - no implementation, must be overridden by subclasses
    public abstract void start();

    // Regular method with implementation
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

// Concrete class extending Vehicle and providing implementation for start method
class Car extends Vehicle implements Engine {

    public Car() {
        super();
        System.out.println("Car object created.");
    }
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine is starting.");
    }
}

// Interface representing an Engine
interface Engine {
    // Abstract method to be implemented by any class that implements this interface
    void startEngine();
}