/**
 * Java Class Relationships - Use Cases and Examples
 * 
 * In object-oriented programming (OOP), relationships between classes define how objects of different classes interact with each other.
 * In Java, there are several types of relationships between classes:
 * 
 * 1. **Association**: A relationship where one class uses or is connected to another class, but they exist independently.
 *    - Unidirectional Association: One class is aware of another class.
 *    - Bidirectional Association: Both classes are aware of each other.
 * 
 * 2. **Aggregation**: A specialized form of Association where one class is a part of another class, but the objects involved can exist independently.
 *    - Represents a "has-a" relationship.
 * 
 * 3. **Composition**: A stronger form of Aggregation where one class contains and is responsible for the lifecycle of another class.
 *    - Also represents a "has-a" relationship, but the contained class cannot exist independently of the container.
 * 
 * 4. **Inheritance**: A relationship where one class (subclass) inherits the properties and behaviors of another class (superclass).
 *    - Represents an "is-a" relationship.
 * 
 * The following program demonstrates all of these relationships with example use cases.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _8_ClassRelationshipsDemo {

    public static void main(String[] args) {
        // 1. Association (Unidirectional)
        System.out.println("=== Use Case 1: Association (Unidirectional) ===");
        Car car = new Car("Toyota");
        Engine engine = new Engine("V8");
        car.setEngine(engine);  // Car has an engine, but engine is independent
        System.out.println(car.getBrand() + " car has engine: " + car.getEngine().getType());
        
        // 2. Aggregation
        System.out.println("\n=== Use Case 2: Aggregation ===");
        Department department = new Department("Computer Science");
        Professor professor = new Professor("Dr. Smith", department);  // Professor belongs to Department, but can exist independently
        System.out.println(professor.getName() + " is part of " + professor.getDepartment().getName() + " department.");
        
        // 3. Composition
        System.out.println("\n=== Use Case 3: Composition ===");
        House house = new House("Red");
        house.addRoom(new Room("Living Room"));  // Room cannot exist without a House
        house.showRooms();

        // 4. Inheritance
        System.out.println("\n=== Use Case 4: Inheritance ===");
        Dog dog = new Dog("Buddy", 5);
        dog.eat();  // Inherited method from Animal
        dog.bark();  // Method from Dog class
    }
}

// Association Example
class Car {
    private String brand;
    private Engine engine;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Aggregation Example
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;
    private Department department;

    public Professor(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

// Composition Example
class House {
    private String color;
    private Room room;

    public House(String color) {
        this.color = color;
    }

    public void addRoom(Room room) {
        this.room = room;
    }

    public void showRooms() {
        System.out.println("House color: " + color + ", with room: " + room.getName());
    }
}

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Inheritance Example
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}