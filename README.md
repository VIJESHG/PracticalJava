# Java Concepts with Code Examples

This project demonstrates various Java concepts through code examples. Each file in the project covers a specific topic, providing explanations and use cases.

## Table of Contents

1. [Data Types](#data-types)
2. [Switch Expressions](#switch-expressions)
3. [String Operations](#string-operations)
4. [Input and Output](#input-and-output)
5. [Conditional Statements](#conditional-statements)
6. [Loops](#loops)
7. [Arrays](#arrays)
8. [Class Relationships](#class-relationships)
9. [Class Constructors](#class-constructors)
10. [Class Inheritance](#class-inheritance)
11. [Polymorphism](#polymorphism)
12. [Class Equality](#class-equality)
13. [Abstraction](#abstraction)
14. [Comparables](#comparables)
15. [Comparators](#comparators)
16. [Lambda Function Interfaces](#lambda-function-interfaces)
17. [Method References](#method-references)
18. [ArrayList](#arraylist)
19. [LinkedList](#linkedlist)
20. [ArrayDeque](#arraydeque)
21. [HashSet](#hashset)
22. [TreeSet](#treeset)
23. [EnumSet](#enumset)
24. [LinkedHashSet](#linkedhashset)
25. [PriorityQueue](#priorityqueue)
26. [HashMap](#hashmap)
27. [TreeMap](#treemap)
28. [EnumMap](#enummap)
29. [LinkedHashMap](#linkedhashmap)
30. [WeakHashMap](#weakhashmap)
31. [IdentityHashMap](#identityhashmap)
32. [Threads Basic](#threads-basic)
33. [Thread Synchronization](#thread-synchronization)
34. [FixedThreadPool](#fixedthreadpool)
35. [CachedThreadPool](#cachedthreadpool)
36. [SingleThreadExecutor](#singlethreadexecutor)
37. [ScheduledThreadPool](#scheduledthreadpool)

## Data Types

File: [_1_DataTypes.java](_1_DataTypes.java)

This file demonstrates the use of various data types in Java, including primitive types (int, float, char, etc.) and reference types (String, arrays, etc.).

```java
public class _1_DataTypes {
    public static void main(String[] args) {
        int intVar = 2147483647;
        float floatVar = 3.14f;
        char charVar = 'A';
        boolean boolVar = true;
        String stringVar = "Hello, World!";
        int[] intArray = {10, 20, 30, 40, 50};

        System.out.println("Int Value: " + intVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);
        System.out.println("String Value: " + stringVar);
        System.out.print("Array Elements: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
```

## SwitchExpressions

File: [_2_SwitchExpressions.java](_2_SwitchExpressions.java)

This file demonstrates the use of switch expressions in Java, which provide a more concise and flexible way to handle multiple conditions.
 * Switch expressions in Java, introduced in Java 12 as a preview feature and made standard in Java 14, 
 * provide a more concise and flexible way to handle multiple conditions
 * This program demonstrates the use of switch expressions in Java.
 * It evaluates different scenarios using switch expressions and
 * returns the corresponding results.
 * Switch expressions provide a more concise and flexible way to handle
 * multiple conditions compared to traditional switch statements.

```java
public class _2_SwitchExpressions {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        int dayOfWeek = 5;
        Day today = Day.THURSDAY;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Day of the week: " + dayName);
    }
}
```

## StringOperations
 * Java Strings - Declaration and Operations
 * Strings in Java are objects that represent a sequence of characters.
 * They are widely used in Java programming because of their immutability and rich API for manipulation.
 
 * Key Concepts:
 1. String Declaration:\
    a. Using String literals: Strings are stored in the String Pool.\
    b. Using the 'new' keyword: Creates a new String object in the heap.
 
 2. Important Properties:\
    a. Strings are immutable - once created, their values cannot be changed.\
    b. Java provides methods for string operations like concatenation,comparison, and searching.
 
 3. Common Operations:
 *    Concatenation: Combining two strings.
 *    Length: Finding the length of a string.
 *    Substring: Extracting parts of a string.
 *    Comparison: Comparing strings (equals, compareTo, etc.).
 *    Case Conversion: Converting to upper/lower case.
 *    Searching: Finding characters or substrings.
 *    Replacing: Replacing parts of a string.

File: [_3_StringOperations.java](_3_StringOperations.java)

This file demonstrates various string operations in Java, including concatenation, length, substring, comparison, case conversion, searching, and replacing.

``` java
public class _3_StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Java");

        String concatenated = str1 + " " + str2 + " " + str3;
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Substring: " + concatenated.substring(6, 11));
        System.out.println("str3 equals str4 (case-sensitive): " + str3.equals("JAVA"));
        System.out.println("str3 equalsIgnoreCase str4: " + str3.equalsIgnoreCase("JAVA"));
        System.out.println("str4 in lowercase: " + "JAVA".toLowerCase());
        System.out.println("str3 in uppercase: " + str3.toUpperCase());
        System.out.println("Index of 'World': " + concatenated.indexOf("World"));
        System.out.println("Does concatenated contain 'Java'? " + concatenated.contains("Java"));
        System.out.println("Replaced String: " + concatenated.replace("World", "Universe"));
    }
}
```

## InputOutputs

File: [_4_InputOutputs.java](_4_InputOutputs.java)

 * Java Input and Output (I/O) - Concepts and Use Cases
 * Input and Output in Java allow programs to interact with users or external systems. 
 
 * Key Concepts:
 1. **Input**:
    - Reading data from the user or a file.
    - Classes: `Scanner`, `BufferedReader`.
 
 2. **Output**:
    - Displaying information to the user or writing to a file.
    - Classes/Methods: `System.out.print`, `System.out.println`, `System.out.printf`.
 
 3. **Use Cases Covered**:
    - Accepting user input for different data types.
    - Handling formatted output for better readability.
    - Reading multi-line input using `BufferedReader`.
    - Demonstrating formatted strings using `System.out.printf`.
 
 * Best Practices:
    - Always close input streams (e.g., `Scanner`) to free resources.
    - Handle exceptions when working with I/O classes like `BufferedReader`.

This file demonstrates various input and output operations in Java, including reading user input using Scanner and BufferedReader, and displaying output using System.out.print, System.out.println, and System.out.printf.

``` java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class _4_InputOutputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("GPA: %.2f\n", gpa);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your favorite quote: ");
            String quote = reader.readLine();
            System.out.println("Your favorite quote is: \"" + quote + "\"");
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        scanner.close();
    }
}
```

## ConditionalStatements

File: [_5_ConditionalStatements.java](_5_ConditionalStatements.java)

 * Java Conditional Statements - Use Cases and Examples
 * Conditional statements are a fundamental part of programming, allowing us to make decisions based on certain conditions.
 * In Java, we use:
    1. **if** - Executes a block of code if the condition is true.
    2. **if-else** - Executes one block of code if the condition is true, and another block if the condition is false.
    3. **else-if** - Used for multiple conditions, checks them in order.
    4. **switch** - Checks a variable against multiple possible values and executes a corresponding block of code.
 
 * Key Points:
    - `if` is used when we need to execute a block based on a single condition.
    - `if-else` helps in situations where we need to choose between two options.
    - `else-if` is useful for checking multiple conditions in sequence.
    - `switch` is ideal when you have multiple possible values for a variable and want to compare it against them.
 
 * The following program demonstrates all of these conditional statements through different examples.

This file demonstrates various conditional statements in Java, including if, if-else, else-if, and switch.

``` java
import java.util.Scanner;

public class _5_ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 10;
        if (number1 > 5) {
            System.out.println("Number1 is greater than 5");
        }

        int number2 = 3;
        if (number2 > 5) {
            System.out.println("Number2 is greater than 5");
        } else {
            System.out.println("Number2 is less than or equal to 5");
        }

        int number3 = 15;
        if (number3 > 20) {
            System.out.println("Number3 is greater than 20");
        } else if (number3 > 10) {
            System.out.println("Number3 is greater than 10 but less than or equal to 20");
        } else {
            System.out.println("Number3 is less than or equal to 10");
        }

        System.out.print("Enter a number between 1 and 7 to represent a day of the week: ");
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is: " + dayName);

        scanner.close();
    }
}
```

## Loops

File: [_6_Loops.java](_6_Loops.java)

 * Java Loops - Use Cases and Examples
 * Loops are a fundamental concept in programming that allow you to repeatedly execute a block of code based on certain conditions.
 * Java supports several types of loops: 
 1. **for loop**: Used when you know beforehand how many times you want to execute a statement or a block of statements.
 2. **while loop**: Executes a block of code as long as the specified condition is true.
 3. **do-while loop**: Similar to the `while` loop, but ensures the block of code is executed at least once before checking the condition.
 * Loops are essential for tasks such as iterating over arrays, processing multiple items in a collection, or executing repetitive tasks.
 * The following program demonstrates the use of all three loops.
This file demonstrates various loop constructs in Java, including for, while, do-while, and nested loops.

``` java
public class _6_Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k <= 5);

        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row + "," + col + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

## Arrays

File: [_7_Arrays.java](_7_Arrays.java)

 * Java Arrays - Use Cases and Examples
  
 * Arrays are a fundamental data structure in Java that allow you to store multiple values of the same type in a single variable.
 * Arrays in Java are indexed starting from 0 and can store elements of any data type (e.g., `int`, `String`, `double`, etc.).
 * Java arrays are fixed in size, meaning once they are created, their size cannot be changed.
  
 * The following examples demonstrate:
 * 1. Declaring and initializing arrays.
 * 2. Accessing elements in an array.
 * 3. Modifying elements in an array.
 * 4. Iterating over arrays.
 * 5. Array operations like finding the maximum, minimum, and calculating the sum.
 
 * Arrays are essential for storing data that needs to be processed in a linear fashion, such as in searching or sorting algorithms.

This file demonstrates various operations on arrays in Java, including declaration, initialization, accessing elements, modifying elements, iterating over arrays, and performing array operations like finding the maximum, minimum, and calculating the sum.

```java 
public class _7_Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        System.out.println("\nFirst Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        numbers[2] = 35;
        System.out.println("Modified Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of Array Elements: " + sum);

        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);

        int elementToFind = 35;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index " + index);
        } else {
            System.out.println("Element " + elementToFind +"not found");
        }

        {% raw %}
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        {% endraw %}
        System.out.println("2D Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] copiedArray = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);
        System.out.println("Copied Array: ");
        for (int number : copiedArray) {
            System.out.print(number + " ");
        }
    }
}
```

## Class Relationships

File: [_8_ClassRelationshipsDemo.java](_8_ClassRelationshipsDemo.java)

 * Java Class Relationships - Use Cases and Examples
 * In object-oriented programming (OOP), relationships between classes define how objects of different classes interact with each other.
 * In Java, there are several types of relationships between classes:
 1. **Association**: A relationship where one class uses or is connected to another class, but they exist independently.
    - Unidirectional Association: One class is aware of another class.
    - Bidirectional Association: Both classes are aware of each other.
  
 2. **Aggregation**: A specialized form of Association where one class is a part of another class, but the objects involved can exist independently.
    - Represents a "has-a" relationship.
  
 3. **Composition**: A stronger form of Aggregation where one class contains and is responsible for the lifecycle of another class.
    - Also represents a "has-a" relationship, but the contained class cannot exist independently of the container.
  
 4. **Inheritance**: A relationship where one class (subclass) inherits the properties and behaviors of another class (superclass).
    - Represents an "is-a" relationship.
 
 * The following program demonstrates all of these relationships with example use cases.
This file demonstrates various class relationships in Java, including association, aggregation, composition, and inheritance.

```java
public class _8_ClassRelationshipsDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Engine engine = new Engine("V8");
        car.setEngine(engine);
        System.out.println(car.getBrand() + " car has engine: " + car.getEngine().getType());

        Department department = new Department("Computer Science");
        Professor professor = new Professor("Dr. Smith", department);
        System.out.println(professor.getName() + " is part of " + professor.getDepartment().getName() + " department.");

        House house = new House("Red");
        house.addRoom(new Room("Living Room"));
        house.showRooms();

        Dog dog = new Dog("Buddy", 5);
        dog.eat();
        dog.bark();
    }
}

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
```

## Class Constructors

File: [_9_ClassConstructors.java](_9_ClassConstructors.java)

 * Java Constructors - Use Cases and Examples
 * In Java, a **constructor** is a special type of method that is called when an object of a class is created. 
 * The primary purpose of a constructor is to initialize the newly created object. It has the same name as the class and does not have a return type.
  
 **Types of Constructors**:
 1. **Default Constructor**: A constructor that has no parameters and initializes the object with default values.
 2. **Parameterized Constructor**: A constructor that takes parameters to initialize the object with specific values.
 3. **Copy Constructor**: A constructor used to create a new object as a copy of an existing object (not natively available in Java, but can be manually defined).
  
 * This program demonstrates:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Constructor Overloading (Multiple Constructors)
 * 4. Using Constructors to initialize fields in an object.

 * Constructors help us to set the initial state of an object and are an essential part of object-oriented programming.
This file demonstrates various types of constructors in Java, including default constructors, parameterized constructors, and copy constructors.

```java 
public class _9_ClassConstructors {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.displayInfo();

        Employee emp2 = new Employee(101, "Alice", 5000);
        emp2.displayInfo();

        Employee emp3 = new Employee(102, "Bob");
        emp3.displayInfo();

        Employee emp4 = new Employee(emp2);
        emp4.displayInfo();
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    public Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
```
## Class Inheritance

File: [_10_ClassInheritance_.java](_10_ClassInheritance.java)

 * Java Inheritance - Employee and Manager Example
 * Inheritance is one of the core concepts of object-oriented programming (OOP). 
 * It allows a class (subclass) to inherit the properties and behaviors (fields and methods) 
 * from another class (superclass).
  
 **Key Concepts**:
 1. **Superclass**: The class whose properties and methods are inherited by another class.
 2. **Subclass/DerivedClass**: The class that inherits the properties and methods from another class.
 3. **"is-a" Relationship**: A subclass is a specialized version of the superclass.
  
 **Example Explanation**:
 * In this program, we demonstrate inheritance using two classes: `Employee` (superclass) and `Manager` (subclass).
 * The `Manager` class inherits all the properties and behaviors of the `Employee` class and can also have additional functionalities (such as overseeing a team).
  
 * The program will show:
 1. Basic inheritance by creating an `Employee` and a `Manager`.
 2. Method overriding (in the `Manager` class).
 3. The "is-a" relationship in practice.

```java
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
```

## Polymorphism

File: [_11_Polymorphism_.java](_11_Polymorphism.java)

 * Polymorphism in Java - Use Cases and Examples
  
 * Polymorphism allows one interface to be used for different underlying forms (data types).
 * In Java, polymorphism is classified into two types:
  
 1. **Compile-time Polymorphism (Method Overloading)**:
 *    This occurs when two or more methods in the same class have the same name but different parameters.
 *    It is resolved at compile time.
  
 2. **Runtime Polymorphism (Method Overriding)**:
 *    This occurs when a subclass provides a specific implementation of a method that is already defined in the superclass.
 *    It is resolved at runtime.
  
 * The program demonstrates:
 1. Method Overloading (Compile-time Polymorphism).
 2. Method Overriding (Runtime Polymorphism).
 3. Using Interfaces to demonstrate polymorphism across different types of classes.

```java

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
```

## Class Equality

File: [_12_ClassEquality.java](_12_ClassEquality.java)

 * Equality Check in Java - Use Cases and Examples
  
 * Equality checks are crucial when comparing objects in Java. There are two types of equality:
 1. **Reference Equality**: Checking whether two references point to the same object in memory using `==`.
 2. **Logical Equality**: Checking whether the content of two objects is equal using the `equals()` method.
  
 * In this example, we demonstrate:
 1. Reference equality using `==`.
 2. Logical equality using an overridden `equals()` method.
 3. Equality checks in a `List` and `Set`.
 4. Comparing two objects of different types.

```java

public class _12_ClassEquality {

    public static void main(String[] args) {

        // Example 1: Reference Equality (using '==')
        System.out.println("=== Reference Equality (using '==') ===");
        Person person1 = new Person("John", 25);
        Person person2 = person1; // Both references point to the same object.
        Person person3 = new Person("John", 25); // Different object with same content.
        System.out.println("person1 == person2: " + (person1 == person2)); // True, both point to the same object
        System.out.println("person1 == person3: " + (person1 == person3)); // False, different objects in memory

        // Example 2: Logical Equality (using overridden 'equals()' method)
        System.out.println("\n=== Logical Equality (using 'equals()') ===");
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // True, same content

        // Example 3: Using 'equals()' in Collections
        System.out.println("\n=== Equality in Collections ===");
        java.util.List<Person> personList = new java.util.ArrayList<>();
        personList.add(person1);
        personList.add(person3);
        System.out.println("List contains person3: " + personList.contains(person3)); // True, 'equals' used for comparison

        // Example 4: Equality with Different Types
        System.out.println("\n=== Comparing Objects of Different Types ===");
        System.out.println("person1.equals(new Car()): " + person1.equals(new Car())); // False, different types
    }
}

// Class representing a Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals() to check logical equality based on name and age
    @Override
    public boolean equals(Object obj) {
        // Check for self-equality
        if (this == obj) {
            return true;
        }
        // Check for null and type mismatch
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast the object to the appropriate type
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // Compare based on field values
    }

    @Override
    public int hashCode() {
        // Generate a hash code based on the fields for proper hash-based collections (like HashSet)
        return 31 * name.hashCode() + age;
    }
}

// Class representing a Car (for demonstrating different types comparison)
class Car {
    private String model;

    // Constructor
    public Car() {
        this.model = "Sedan";
    }

    // Not overriding equals() for Car, so it uses Object's equals() by default (reference equality)
    @Override
    public boolean equals(Object obj) {
        return false; // Cars are not equal to other objects by default
    }
}
```

## Abstraction

File: [_13_Abstraction.java](_13_Abstraction.java)

 * Abstraction in Java - Use Cases and Examples
 
 * Abstraction is the concept of hiding the complex implementation details of an object and exposing only the essential features.
 * In Java, abstraction is achieved using:
 1. **Abstract Classes**: Classes with abstract methods that must be implemented by subclasses.
 2. **Interfaces**: Define a contract that implementing classes must adhere to.

 * This example demonstrates:
 1. Using an **abstract class** to define common functionality.
 2. Using an **interface** to define a contract that classes can implement.

```java

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
```

## Comparable Interfaces

File: [_15_Comparables.java](_15_Comparables.java)

 * Comparable Interface in Java - Use Cases and Examples 
 * The Comparable interface is used to define the natural order of objects.
 * It allows us to specify how objects of a class should be compared and sorted.
 * This example demonstrates how to use Comparable to sort Employee objects by their salary.
 
 * Use Cases:
 1. Sorting objects in a collection (List, Set).
 2. Sorting custom objects based on a field or multiple fields.
 
```java

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
```

## Comparators

File: [_16_Comparators.java](_16_Comparators.java)

 * Comparator Interface in Java - Use Cases and Examples 
 * The Comparator interface allows us to define custom sorting logic for objects.
 * This example demonstrates how to use Comparator to sort Employee objects first by their name and then by their salary.
  
 * Use Cases:
 1. Custom sorting of objects in collections (List, Set).
 2. Sorting based on multiple fields (e.g., by name and salary).
 3. Flexible and reusable sorting logic.

```java

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
```

## Lambda and Functional Interfaces

File: [_17_LambdaFunctionInterfaces.java](_17_LambdaFunctionInterfaces.java)

 * Lambda Expressions and Functional Interfaces in Java 
 * This file demonstrates the use of lambda expressions and functional interfaces in Java.
 * Lambda expressions allow us to pass behavior as arguments to methods, making the code more concise and readable.
 * Functional interfaces are interfaces with exactly one abstract method. Lambda expressions are primarily used to implement these interfaces.
  
 * This file includes the following examples:
 1. Runnable Interface - Using lambda expression to create and run threads.
 2. Comparator Interface - Using lambda expression to sort a list of Employee objects.
 3. Predicate Interface - Using lambda expression to filter employees based on salary.
 4. Function Interface - Using lambda expression to transform employee salary into a different currency.

```java
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
```

## Method References

File: [_18_MethodReferences.java](_18_MethodReferences.java)

 * Method References in Java 
 * This file demonstrates the use of method references in Java.
 * Method references are used as a shorthand for lambda expressions when the lambda body is simply calling a method.
 * There are different types of method references:
 1. Static method reference.
 2. Instance method reference.
 3. Constructor reference.
 * The file contains examples to showcase all of these use cases.

```java
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
```

## ArrayList Operations

File: [_19_ArrayList.java](_19_ArrayList.java)

 * This program demonstrates how to use ArrayList with custom objects (Employee) and iterate through the ArrayList using an iterator.
 
 * It performs the following tasks:
 1. Creates an ArrayList of Employee objects.
 2. Adds Employee objects to the ArrayList.
 3. Iterates through the ArrayList using an iterator.
 4. Displays the employee details during iteration.
 5. Removes an employee object using the iterator if the salary is less than 50000.
 6. Displays the updated employee list after removal.
 

 * Key operations shown:
 1. Adding elements to an ArrayList.
 2. Accessing elements using indices.
 3. Removing elements by index.
 4. Checking the size and existence of an element.
 5. Iterating through the ArrayList using for-each loop.
 6. Clearing the ArrayList.

```java
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
```

## LinkedList Operations

File: [_20_LinkedList.java](_20_LinkedList.java)

 * This program demonstrates how to use LinkedList with custom objects (Employee) and iterate through the LinkedList using an iterator.
 
 * It performs the following tasks:
 1. Creates a LinkedList of Employee objects.
 2. Adds Employee objects to the LinkedList.
 3. Iterates through the LinkedList using an iterator.
 4. Displays the employee details during iteration.
 5. Removes an employee object from the LinkedList.
 6. Displays the updated employee list after removal.
 7. Modifies an employee's salary and displays the updated list.

```java
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
 
     // Setter for salary
     public void setSalary(double salary) {
         this.salary = salary;
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _20_LinkedList {
 
     public static void main(String[] args) {
         
         // Create a LinkedList of Employee objects
         LinkedList<Employee> employees = new LinkedList<>();
 
         // Add Employee objects to the LinkedList
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the LinkedList of employees
         System.out.println("Employee List:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Iterating through the LinkedList using an Iterator
         System.out.println("\nIterating using Iterator:");
         Iterator<Employee> iterator = employees.iterator();
         while (iterator.hasNext()) {
             Employee emp = iterator.next();
             System.out.println(emp);
         }
 
         // Example 2: Removing an employee from the LinkedList
         System.out.println("\nRemoving employee with name 'Bob':");
         iterator = employees.iterator(); // Resetting the iterator
         while (iterator.hasNext()) {
             Employee emp = iterator.next();
             if ("Bob".equals(emp.getName())) {
                 System.out.println("Removing: " + emp);
                 iterator.remove(); // Remove the element
             }
         }
 
         // Display the LinkedList after removal
         System.out.println("\nEmployee List after removal:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 3: Modifying an employee's salary
         System.out.println("\nModifying salary of 'Alice':");
         for (Employee emp : employees) {
             if ("Alice".equals(emp.getName())) {
                 emp.setSalary(65000); // Updating salary
                 System.out.println("Updated Salary: " + emp);
             }
         }
 
         // Display the LinkedList after salary update
         System.out.println("\nEmployee List after salary update:");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
     }
 }
```

## ArrayDeque Operations

File: [_21_ArrayDeque.java](_21_ArrayDeque.java)

 * This program demonstrates how to use ArrayDeque with custom objects (Employee) and perform various operations on the deque.
  
 * It performs the following tasks:
 1. Creates an ArrayDeque of Employee objects.
 2. Adds Employee objects to the front and back of the deque.
 3. Removes employees from the front and back.
 4. Displays the deque content after various operations.
 5. Peeks at the front and back elements.

```java

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
 
 public class _21_ArrayDeque {
 
     public static void main(String[] args) {
         
         // Create an ArrayDeque of Employee objects
         ArrayDeque<Employee> employees = new ArrayDeque<>();
 
         // Add Employee objects to the back of the deque
         employees.addLast(new Employee("John", 50000));
         employees.addLast(new Employee("Alice", 60000));
         employees.addLast(new Employee("Bob", 45000));
         employees.addLast(new Employee("Diana", 55000));
 
         // Display the ArrayDeque of employees
         System.out.println("Employee List (after addLast):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Adding an element to the front using addFirst()
         System.out.println("\nAdding an employee to the front:");
         employees.addFirst(new Employee("Eve", 70000));
 
         // Display the ArrayDeque after adding an employee at the front
         System.out.println("Employee List (after addFirst):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 2: Removing an element from the front using removeFirst()
         System.out.println("\nRemoving employee from the front:");
         Employee removedFirst = employees.removeFirst();
         System.out.println("Removed: " + removedFirst);
 
         // Display the ArrayDeque after removal from the front
         System.out.println("\nEmployee List (after removeFirst):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 3: Removing an element from the back using removeLast()
         System.out.println("\nRemoving employee from the back:");
         Employee removedLast = employees.removeLast();
         System.out.println("Removed: " + removedLast);
 
         // Display the ArrayDeque after removal from the back
         System.out.println("\nEmployee List (after removeLast):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 4: Peeking at the first and last elements
         System.out.println("\nPeeking at the first and last elements:");
         Employee first = employees.peekFirst();
         Employee last = employees.peekLast();
         System.out.println("First Employee: " + first);
         System.out.println("Last Employee: " + last);
     }
 }
```

## HashSet Operations

File: [_22_HashSet.java](_22_HashSet.java)

 * This program demonstrates how to use HashSet with custom objects (Employee) and perform set operations.
 * 
 * It performs the following tasks:
 1. Creates a HashSet of Employee objects.
 2. Adds Employee objects to the HashSet.
 3. Removes an Employee object from the HashSet.
 4. Checks if a specific Employee exists in the HashSet.
 5. Displays the size of the HashSet.
 6. Clears the HashSet and displays its content.
 
```java

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
 
     // Override equals() and hashCode() to ensure uniqueness in HashSet
     @Override
     public boolean equals(Object obj) {
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         Employee employee = (Employee) obj;
         return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
     }
 
     @Override
     public int hashCode() {
         return Objects.hash(name, salary);
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _22_HashSet {
 
     public static void main(String[] args) {
         
         // Create a HashSet of Employee objects
         HashSet<Employee> employees = new HashSet<>();
 
         // Add Employee objects to the HashSet
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the HashSet of employees
         System.out.println("Employee List (after add):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Attempting to add a duplicate employee
         System.out.println("\nAttempting to add a duplicate employee:");
         boolean isAdded = employees.add(new Employee("John", 50000));
         System.out.println("Was the duplicate added? " + isAdded); // Should be false, as 'John' already exists
 
         // Example 2: Checking if an employee exists
         System.out.println("\nChecking if 'Alice' is in the HashSet:");
         boolean exists = employees.contains(new Employee("Alice", 60000));
         System.out.println("Does Alice exist? " + exists); // Should be true
 
         // Example 3: Removing an employee from the HashSet
         System.out.println("\nRemoving employee 'Bob':");
         boolean isRemoved = employees.remove(new Employee("Bob", 45000));
         System.out.println("Was Bob removed? " + isRemoved); // Should be true
 
         // Display the HashSet after removal
         System.out.println("\nEmployee List (after remove):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 4: Displaying the size of the HashSet
         System.out.println("\nSize of the HashSet: " + employees.size()); // Should return the number of employees
 
         // Example 5: Clearing the HashSet
         System.out.println("\nClearing the HashSet...");
         employees.clear();
         System.out.println("Is the HashSet empty? " + employees.isEmpty()); // Should return true
     }
 }
```

## TreeSet Operations

File: [_23_TreeSet.java](_23_TreeSet.java)

 * This program demonstrates how to use TreeSet with custom objects (Employee) and perform set operations.
  
 * It performs the following tasks:
 1. Creates a TreeSet of Employee objects.
 2. Adds Employee objects to the TreeSet.
 3. Removes an Employee object from the TreeSet.
 4. Checks if a specific Employee exists in the TreeSet.
 5. Displays the size of the TreeSet.
 6. Displays the first and last elements in the TreeSet.
 7. Clears the TreeSet and displays its content.

```java
 import java.util.*;

 class Employee implements Comparable<Employee> {
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
 
     // Override compareTo() to define natural ordering by salary
     @Override
     public int compareTo(Employee other) {
         return Double.compare(this.salary, other.salary); // Sort by salary in ascending order
     }
 
     // Override toString() for displaying employee details
     @Override
     public String toString() {
         return "Employee{name='" + name + "', salary=" + salary + "}";
     }
 }
 
 public class _23_TreeSet {
 
     public static void main(String[] args) {
         
         // Create a TreeSet of Employee objects
         TreeSet<Employee> employees = new TreeSet<>();
 
         // Add Employee objects to the TreeSet
         employees.add(new Employee("John", 50000));
         employees.add(new Employee("Alice", 60000));
         employees.add(new Employee("Bob", 45000));
         employees.add(new Employee("Diana", 55000));
 
         // Display the TreeSet of employees (sorted by salary)
         System.out.println("Employee List (after add):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 1: Attempting to add a duplicate employee
         System.out.println("\nAttempting to add a duplicate employee:");
         boolean isAdded = employees.add(new Employee("John", 50000));
         System.out.println("Was the duplicate added? " + isAdded); // Should be false, as 'John' already exists
 
         // Example 2: Checking if an employee exists
         System.out.println("\nChecking if 'Alice' is in the TreeSet:");
         boolean exists = employees.contains(new Employee("Alice", 60000));
         System.out.println("Does Alice exist? " + exists); // Should be true
 
         // Example 3: Removing an employee from the TreeSet
         System.out.println("\nRemoving employee 'Bob':");
         boolean isRemoved = employees.remove(new Employee("Bob", 45000));
         System.out.println("Was Bob removed? " + isRemoved); // Should be true
 
         // Display the TreeSet after removal
         System.out.println("\nEmployee List (after remove):");
         for (Employee emp : employees) {
             System.out.println(emp);
         }
 
         // Example 4: Displaying the size of the TreeSet
         System.out.println("\nSize of the TreeSet: " + employees.size()); // Should return the number of employees
 
         // Example 5: Displaying the first and last elements in the TreeSet
         System.out.println("\nFirst Employee (lowest salary): " + employees.first()); // Should return employee with lowest salary
         System.out.println("Last Employee (highest salary): " + employees.last()); // Should return employee with highest salary
 
         // Example 6: Clearing the TreeSet
         System.out.println("\nClearing the TreeSet...");
         employees.clear();
         System.out.println("Is the TreeSet empty? " + employees.isEmpty()); // Should return true
     }
 }
```

## EnumSet Operations

File: [_24_EnumSet.java](_24_EnumSet.java)

 * This program demonstrates how to use EnumSet with an enum type (Day). 
 * It performs the following tasks:
 1. Creates an EnumSet of Day constants.
 2. Adds and removes elements from the EnumSet.
 3. Displays the contents of the EnumSet.
 4. Checks if a specific Day is present in the EnumSet.
 5. Clears the EnumSet and displays its content.

```java
 import java.util.EnumSet;

 enum Day {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }
 
 public class _24_EnumSet {
 
     public static void main(String[] args) {
         
         // Create an EnumSet containing Monday, Wednesday, and Friday
         EnumSet<Day> weekendDays = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
         EnumSet<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
         
         // Display the contents of the EnumSet
         System.out.println("Weekend Days: " + weekendDays);
         System.out.println("Work Days: " + workDays);
 
         // Example 1: Adding elements to the EnumSet
         workDays.add(Day.TUESDAY); // Adding a day to workDays
         System.out.println("\nAfter adding Tuesday to workDays: " + workDays);
 
         // Example 2: Removing elements from the EnumSet
         workDays.remove(Day.MONDAY); // Removing Monday from workDays
         System.out.println("\nAfter removing Monday from workDays: " + workDays);
 
         // Example 3: Checking if an element exists in the EnumSet
         boolean isSaturdayWorkday = workDays.contains(Day.SATURDAY); // Check if Saturday is a workday
         System.out.println("\nIs Saturday a workday? " + isSaturdayWorkday); // Should be false
 
         // Example 4: Creating an EnumSet with all elements of the Day enum
         EnumSet<Day> allDays = EnumSet.allOf(Day.class);
         System.out.println("\nAll Days of the Week: " + allDays);
 
         // Example 5: Clearing the EnumSet
         workDays.clear();
         System.out.println("\nWorkDays after clearing: " + workDays); // Should be empty
     }
 }
```

## LinkedHashSet Operations

File: [_25_LinkedHashSet.java](_25_LinkedHashSet.java)

* This program demonstrates how to use LinkedHashSet with custom objects (Employee).

* It performs the following tasks:
1. Creates a LinkedHashSet of Employee objects.
2. Adds Employee objects to the LinkedHashSet.
3. Removes an Employee object from the LinkedHashSet.
4. Checks if a specific Employee exists in the LinkedHashSet.
5. Displays the LinkedHashSet elements in insertion order.
6. Clears the LinkedHashSet and displays its content.

```java
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

   // Override equals() and hashCode() for comparing Employee objects
   @Override
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       Employee employee = (Employee) obj;
       return Double.compare(employee.salary, salary) == 0 &&
               name.equals(employee.name);
   }

   @Override
   public int hashCode() {
       return Objects.hash(name, salary);
   }
}

public class _25_LinkedHashSet {

   public static void main(String[] args) {
       
       // Create a LinkedHashSet to store Employee objects
       LinkedHashSet<Employee> employees = new LinkedHashSet<>();

       // Add Employee objects to the LinkedHashSet
       employees.add(new Employee("John", 50000));
       employees.add(new Employee("Alice", 60000));
       employees.add(new Employee("Bob", 45000));
       employees.add(new Employee("Diana", 55000));

       // Display the LinkedHashSet (in insertion order)
       System.out.println("Employee List (after add):");
       for (Employee emp : employees) {
           System.out.println(emp);
       }

       // Example 1: Adding a duplicate employee
       System.out.println("\nAttempting to add a duplicate employee:");
       boolean isAdded = employees.add(new Employee("John", 50000));
       System.out.println("Was the duplicate added? " + isAdded); // Should be false as 'John' already exists

       // Example 2: Checking if an employee exists
       System.out.println("\nChecking if 'Alice' is in the LinkedHashSet:");
       boolean exists = employees.contains(new Employee("Alice", 60000));
       System.out.println("Does Alice exist? " + exists); // Should be true

       // Example 3: Removing an employee from the LinkedHashSet
       System.out.println("\nRemoving employee 'Bob':");
       boolean isRemoved = employees.remove(new Employee("Bob", 45000));
       System.out.println("Was Bob removed? " + isRemoved); // Should be true

       // Display the LinkedHashSet after removal
       System.out.println("\nEmployee List (after remove):");
       for (Employee emp : employees) {
           System.out.println(emp);
       }

       // Example 4: Displaying the size of the LinkedHashSet
       System.out.println("\nSize of the LinkedHashSet: " + employees.size()); // Should return the number of employees

       // Example 5: Clearing the LinkedHashSet
       System.out.println("\nClearing the LinkedHashSet...");
       employees.clear();
       System.out.println("Is the LinkedHashSet empty? " + employees.isEmpty()); // Should return true
   }
}
```

## PriorityQueue Operations

File: [_26_PriorityQueue.java](_26_PriorityQueue.java)

 * This program demonstrates the usage of PriorityQueue in Java.
 
 * It performs the following tasks:
 1. Creates a PriorityQueue of integers using natural ordering.
 2. Creates a PriorityQueue of Employee objects using a custom comparator.
 3. Adds elements to the PriorityQueue.
 4. Removes elements from the PriorityQueue and prints them.
 5. Uses peek() to view the top element without removal.
 6. Demonstrates priority ordering using both natural ordering and comparator.

```java

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
 
 public class _26_PriorityQueue {
 
     public static void main(String[] args) {
 
         // PriorityQueue of integers using natural ordering (min-heap)
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         pq.offer(10);
         pq.offer(30);
         pq.offer(20);
         pq.offer(50);
         pq.offer(40);
 
         // Display elements in the PriorityQueue
         System.out.println("PriorityQueue (min-heap) of integers:");
         while (!pq.isEmpty()) {
             System.out.println(pq.poll()); // Remove and print the top (min) element
         }
 
         // PriorityQueue of Employee objects using a custom comparator (sort by salary)
         PriorityQueue<Employee> employeeQueue = new PriorityQueue<>(new Comparator<Employee>() {
             @Override
             public int compare(Employee e1, Employee e2) {
                 return Double.compare(e1.getSalary(), e2.getSalary()); // Sort by salary
             }
         });
 
         employeeQueue.offer(new Employee("John", 50000));
         employeeQueue.offer(new Employee("Alice", 70000));
         employeeQueue.offer(new Employee("Bob", 45000));
         employeeQueue.offer(new Employee("Diana", 60000));
 
         // Display elements in the PriorityQueue (sorted by salary)
         System.out.println("\nPriorityQueue of employees (sorted by salary):");
         while (!employeeQueue.isEmpty()) {
             System.out.println(employeeQueue.poll()); // Remove and print the top element (lowest salary)
         }
 
         // PriorityQueue with natural ordering for Strings
         PriorityQueue<String> stringQueue = new PriorityQueue<>();
         stringQueue.offer("Apple");
         stringQueue.offer("Banana");
         stringQueue.offer("Cherry");
         stringQueue.offer("Date");
 
         // Display elements in the PriorityQueue (sorted alphabetically)
         System.out.println("\nPriorityQueue of strings (sorted alphabetically):");
         while (!stringQueue.isEmpty()) {
             System.out.println(stringQueue.poll()); // Remove and print the top element
         }
 
         // Peek the top element without removal
         System.out.println("\nPeeking the top element in the integer PriorityQueue:");
         pq.offer(10);
         pq.offer(30);
         pq.offer(20);
         pq.offer(50);
         pq.offer(40);
         System.out.println("Top element (without removal): " + pq.peek()); // Should return 10
     }
 }
```

## HashMap Operations

File: [_27_HashMap.java](_27_HashMap.java)

 * This program demonstrates the usage of HashMap in Java.
 * It performs the following tasks:
 1. Creates a HashMap to store employee information with employee ID as the key and employee name as the value.
 2. Adds key-value pairs (employee ID and name) to the HashMap.
 3. Retrieves values using keys.
 4. Removes a key-value pair based on the key.
 5. Displays the size of the HashMap.
 6. Iterates over the HashMap using keySet(), values(), and entrySet().

```java

 import java.util.*;

 public class _27_HashMap {
 
     public static void main(String[] args) {
         
         // Create a HashMap to store employee ID and employee name
         HashMap<Integer, String> employees = new HashMap<>();
 
         // Add some employee ID and name pairs to the HashMap
         employees.put(101, "John");
         employees.put(102, "Alice");
         employees.put(103, "Bob");
         employees.put(104, "Diana");
         
         // Display the HashMap
         System.out.println("Initial HashMap:");
         System.out.println(employees);
 
         // Example 1: Retrieve a value using its key
         String employeeName = employees.get(102); // Get the employee with ID 102
         System.out.println("\nEmployee with ID 102: " + employeeName);
 
         // Example 2: Check if a key exists in the HashMap
         boolean hasEmployee = employees.containsKey(105); // Check if ID 105 exists
         System.out.println("\nDoes employee with ID 105 exist? " + hasEmployee);
 
         // Example 3: Remove a key-value pair
         System.out.println("\nRemoving employee with ID 103...");
         employees.remove(103); // Remove the employee with ID 103
         System.out.println("Updated HashMap: " + employees);
 
         // Example 4: Get the size of the HashMap
         System.out.println("\nSize of the HashMap: " + employees.size());
 
         // Example 5: Iterating over the HashMap using keySet()
         System.out.println("\nIterating over the HashMap (using keySet()):");
         for (Integer id : employees.keySet()) {
             System.out.println("Employee ID: " + id + ", Name: " + employees.get(id));
         }
 
         // Example 6: Iterating over the HashMap using values()
         System.out.println("\nIterating over the HashMap (using values()):");
         for (String name : employees.values()) {
             System.out.println("Employee Name: " + name);
         }
 
         // Example 7: Iterating over the HashMap using entrySet()
         System.out.println("\nIterating over the HashMap (using entrySet()):");
         for (Map.Entry<Integer, String> entry : employees.entrySet()) {
             System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
         }
     }
 }
```

## TreeMap Operations

File: [_28_TreeMap.java](_28_TreeMap.java)

 * This program demonstrates the usage of TreeMap in Java.
 
 * It performs the following tasks:
 1. Creates a TreeMap to store employee information with employee ID as the key and employee name as the value.
 2. Adds key-value pairs (employee ID and name) to the TreeMap.
 3. Retrieves values using keys.
 4. Removes a key-value pair based on the key.
 5. Displays the size of the TreeMap.
 6. Iterates over the TreeMap using keySet(), values(), and entrySet().
 7. Demonstrates custom sorting using a comparator.

```java

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
 
 public class _28_TreeMap {
 
     public static void main(String[] args) {
         
         // Create a TreeMap to store employee ID and employee name (sorted by employee ID)
         TreeMap<Integer, String> employees = new TreeMap<>();
 
         // Add some employee ID and name pairs to the TreeMap
         employees.put(101, "John");
         employees.put(102, "Alice");
         employees.put(103, "Bob");
         employees.put(104, "Diana");
         
         // Display the TreeMap (sorted by key - employee ID)
         System.out.println("Initial TreeMap (sorted by employee ID):");
         System.out.println(employees);
 
         // Example 1: Retrieve a value using its key
         String employeeName = employees.get(102); // Get the employee with ID 102
         System.out.println("\nEmployee with ID 102: " + employeeName);
 
         // Example 2: Check if a key exists in the TreeMap
         boolean hasEmployee = employees.containsKey(105); // Check if ID 105 exists
         System.out.println("\nDoes employee with ID 105 exist? " + hasEmployee);
 
         // Example 3: Remove a key-value pair
         System.out.println("\nRemoving employee with ID 103...");
         employees.remove(103); // Remove the employee with ID 103
         System.out.println("Updated TreeMap: " + employees);
 
         // Example 4: Get the size of the TreeMap
         System.out.println("\nSize of the TreeMap: " + employees.size());
 
         // Example 5: Iterating over the TreeMap using keySet()
         System.out.println("\nIterating over the TreeMap (using keySet()):");
         for (Integer id : employees.keySet()) {
             System.out.println("Employee ID: " + id + ", Name: " + employees.get(id));
         }
 
         // Example 6: Iterating over the TreeMap using values()
         System.out.println("\nIterating over the TreeMap (using values()):");
         for (String name : employees.values()) {
             System.out.println("Employee Name: " + name);
         }
 
         // Example 7: Iterating over the TreeMap using entrySet()
         System.out.println("\nIterating over the TreeMap (using entrySet()):");
         for (Map.Entry<Integer, String> entry : employees.entrySet()) {
             System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
         }
 
         // Example 8: Custom Sorting with a Comparator
         TreeMap<Integer, Employee> employeeMap = new TreeMap<>(new Comparator<Integer>() {
             @Override
             public int compare(Integer id1, Integer id2) {
                 // Custom sorting logic: reversing the order of employee IDs
                 return id2.compareTo(id1); // Descending order of IDs
             }
         });
 
         // Adding employees with IDs
         employeeMap.put(101, new Employee("John", 50000));
         employeeMap.put(102, new Employee("Alice", 60000));
         employeeMap.put(103, new Employee("Bob", 45000));
 
         // Display the TreeMap (sorted by employee ID in descending order)
         System.out.println("\nTreeMap (sorted by employee ID in descending order):");
         for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
             System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue().getName());
         }
     }
 }
```

## EnumMap Operations

File: [_29_EnumMap.java](_29_EnumMap.java)

 * This program demonstrates the usage of EnumMap in Java.
 
 * It performs the following tasks:
 1. Creates an EnumMap to store working hours for each day of the week.
 2. Adds key-value pairs to the EnumMap.
 3. Retrieves and displays the working hours for specific days.
 4. Removes key-value pairs from the EnumMap.
 5. Displays the size of the EnumMap.
 6. Iterates over the EnumMap and prints each day with its corresponding working hours.
 7. Shows how EnumMap is memory-efficient for enum-based keys.

```java
import java.util.EnumMap;

// Enum for Days of the Week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class _29_EnumMap {

    public static void main(String[] args) {
        
        // Create an EnumMap to store working hours for each day of the week
        EnumMap<Day, String> workingHours = new EnumMap<>(Day.class);

        // Add key-value pairs (Day -> Working hours)
        workingHours.put(Day.MONDAY, "9 AM - 5 PM");
        workingHours.put(Day.TUESDAY, "9 AM - 5 PM");
        workingHours.put(Day.WEDNESDAY, "9 AM - 5 PM");
        workingHours.put(Day.THURSDAY, "9 AM - 5 PM");
        workingHours.put(Day.FRIDAY, "9 AM - 5 PM");
        workingHours.put(Day.SATURDAY, "10 AM - 2 PM");
        workingHours.put(Day.SUNDAY, "Closed");

        // Display the EnumMap
        System.out.println("Working hours for each day of the week:");
        System.out.println(workingHours);

        // Example 1: Retrieve working hours for a specific day
        String mondayHours = workingHours.get(Day.MONDAY); // Get working hours for Monday
        System.out.println("\nWorking hours for MONDAY: " + mondayHours);

        // Example 2: Remove working hours for Sunday
        workingHours.remove(Day.SUNDAY); // Remove the entry for Sunday
        System.out.println("\nUpdated working hours (after removing Sunday):");
        System.out.println(workingHours);

        // Example 3: Check if a specific day has working hours
        boolean isSundayWorking = workingHours.containsKey(Day.SUNDAY);
        System.out.println("\nIs Sunday in the EnumMap? " + isSundayWorking);

        // Example 4: Iterate over the EnumMap using entrySet()
        System.out.println("\nIterating over the EnumMap (using entrySet()):");
        for (var entry : workingHours.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Example 5: Get the size of the EnumMap
        System.out.println("\nSize of the EnumMap: " + workingHours.size());
    }
}
```

## LinkedHashMap Operations

File: [_30_LinkedHashMap.java](_30_LinkedHashMap.java)

 * This program demonstrates the usage of LinkedHashMap in Java.
  
 * It performs the following tasks:
 1. Creates a LinkedHashMap to store employee names and their corresponding employee IDs.
 2. Adds key-value pairs to the LinkedHashMap.
 3. Retrieves values for specific keys.
 4. Removes an entry from the map.
 5. Iterates over the LinkedHashMap and prints each employee's details.
 6. Demonstrates insertion order and access order.
 
```java
import java.util.*;

public class _30_LinkedHashMap {

    public static void main(String[] args) {
        
        // Create a LinkedHashMap to store employee name and their ID
        LinkedHashMap<Integer, String> employeeMap = new LinkedHashMap<>();
        
        // Add employee IDs and their names
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");

        // Display the LinkedHashMap
        System.out.println("Employee details (Insertion Order):");
        System.out.println(employeeMap);
        
        // Example 1: Retrieve the employee name for a specific ID
        String employeeName = employeeMap.get(102); // Get the employee with ID 102
        System.out.println("\nEmployee with ID 102: " + employeeName);
        
        // Example 2: Remove an entry from the map
        employeeMap.remove(103); // Remove the employee with ID 103
        System.out.println("\nEmployee details after removing ID 103:");
        System.out.println(employeeMap);
        
        // Example 3: Iterate over the LinkedHashMap and print each employee's details
        System.out.println("\nIterating over the LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Example 4: Demonstrate insertion order (LinkedHashMap maintains insertion order)
        System.out.println("\nEmployee details (Insertion Order Maintained):");
        System.out.println(employeeMap);
        
        // Example 5: Create LinkedHashMap with access order
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put(201, "Eve");
        accessOrderMap.put(202, "Frank");
        accessOrderMap.put(203, "Grace");

        // Access some elements to change access order
        accessOrderMap.get(202); // Access Frank
        accessOrderMap.get(203); // Access Grace
        
        // Print the order after accessing
        System.out.println("\nEmployee details (Access Order Changed):");
        System.out.println(accessOrderMap);
    }
}
```

## WeakHashMap Operations

File: [_31_WeakHashMap.java](_31_WeakHashMap.java)

 * This program demonstrates the usage of WeakHashMap in Java.

 * It performs the following tasks:
 1. Creates a WeakHashMap to store weak references to objects.
 2. Adds key-value pairs to the WeakHashMap.
 3. Shows how the key is eligible for garbage collection when it is no longer in use.
 4. Prints the map before and after the garbage collection of keys.

```java
import java.util.*;

public class _31_WeakHashMap {

    public static void main(String[] args) throws InterruptedException {

        // Create a WeakHashMap to store weak references to objects
        WeakHashMap<SomeObject, String> weakMap = new WeakHashMap<>();
        
        // Create some objects (keys) to store in the map
        SomeObject key1 = new SomeObject("Object 1");
        SomeObject key2 = new SomeObject("Object 2");
        SomeObject key3 = new SomeObject("Object 3");

        // Add key-value pairs to the WeakHashMap
        weakMap.put(key1, "Data for Object 1");
        weakMap.put(key2, "Data for Object 2");
        weakMap.put(key3, "Data for Object 3");

        // Display the map before the keys are garbage collected
        System.out.println("WeakHashMap before GC:");
        System.out.println(weakMap);

        // Nullify the strong reference to key1 and key2
        key1 = null;
        key2 = null;

        // Suggest garbage collection (this is just a suggestion; actual GC happens at JVM's discretion)
        System.gc();
        
        // Wait for a brief moment to allow garbage collection to take place
        Thread.sleep(1000);

        // Display the map after garbage collection
        System.out.println("\nWeakHashMap after GC:");
        System.out.println(weakMap);
    }
}

// A simple class to use as a key in the WeakHashMap
class SomeObject {
    private String name;

    public SomeObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Override hashCode and equals to ensure correct behavior in collections
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SomeObject that = (SomeObject) obj;
        return name.equals(that.name);
    }
}
```

## IdentityHashMap Operations

File: [_32_IdentityHashMap.java](_32_IdentityHashMap.java)

 * This program demonstrates the usage of IdentityHashMap in Java.
  
 * It performs the following tasks:
 1. Creates an IdentityHashMap to store keys by reference equality.
 2. Adds key-value pairs to the IdentityHashMap.
 3. Shows how the map handles keys based on reference comparison (not logical equality).


```java
import java.util.*;

public class _32_IdentityHashMap {

    public static void main(String[] args) {
        
        // Create an IdentityHashMap to store keys based on reference equality
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();
        
        // Create some objects (keys)
        String key1 = new String("Java");
        String key2 = new String("Java"); // Different object with same value
        String key3 = key1;  // Same object as key1
        
        // Add key-value pairs to the IdentityHashMap
        identityMap.put(key1, "Programming Language");
        identityMap.put(key2, "Programming Language");
        identityMap.put(key3, "Programming Language");
        
        // Display the IdentityHashMap
        System.out.println("IdentityHashMap entries:");
        System.out.println(identityMap);
        
        // Check if key1 and key2 are considered the same key by IdentityHashMap
        System.out.println("\nAre key1 and key2 considered the same key?");
        System.out.println(identityMap.get(key1) == identityMap.get(key2));  // false (because they are different objects)
        
        // Check if key1 and key3 are considered the same key by IdentityHashMap
        System.out.println("\nAre key1 and key3 considered the same key?");
        System.out.println(identityMap.get(key1) == identityMap.get(key3));  // true (because they refer to the same object)
        
        // Demonstrate IdentityHashMap behavior with keys having the same logical value but being different objects
        System.out.println("\nSize of the IdentityHashMap:");
        System.out.println(identityMap.size()); // 2, because key1 and key3 are the same object
        
        // Iterate over the map and print the entries
        System.out.println("\nIterating over the IdentityHashMap:");
        for (Map.Entry<String, String> entry : identityMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
```

## Thread Basic Concepts

File: [_33_ThreadsBasic.java](_33_ThreadsBasic.java)

 * This program demonstrates how to create and use threads in Java.
 * It shows:
 1. How to extend the Thread class to create a thread.
 2. How to implement the Runnable interface to create a thread.
 3. How to start a thread, make it sleep, and join threads.

```java

 class MyThread extends Thread {
    @Override
    public void run() {
        // Task to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                Thread.sleep(1000); // Pauses the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Task to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                Thread.sleep(1000); // Pauses the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class _33_ThreadsBasic{
    public static void main(String[] args) throws InterruptedException {

        // Creating and starting a thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");
        thread1.start(); // Start the thread

        // Creating and starting a thread by implementing Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.setName("Thread-2");
        thread2.start(); // Start the thread

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Main thread finished.");
    }
}
```

## Using Synchronization methods in threads

File: [_34_ThreadSynchronization.java](_34_ThreadSynchronization.java)


```java

class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe operations
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class _34_ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Create two threads that will modify the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final count value
        System.out.println("Final count: " + counter.getCount());
    }
}
```

## Fixed Thread Pool

File: [_35_FixedThreadPool.java](_35_FixedThreadPool.java)

 * This example demonstrates the use of a FixedThreadPool.
 * A FixedThreadPool creates a pool of a fixed number of threads.
 * If there are more tasks than the number of threads in the pool,
 * the excess tasks are queued up until a thread becomes available.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}

public class _35_FixedThreadPool {
    public static void main(String[] args) {
        // Create a FixedThreadPool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit 5 tasks to the executor
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        // Initiates an orderly shutdown of the executor
        executorService.shutdown();
    }
}
```

## Cached Thread Pool

File: [_36_CachedThreadPool.java](_36_CachedThreadPool.java)

 * This example demonstrates the use of a CachedThreadPool.
 * A CachedThreadPool creates new threads as needed, but it will reuse 
 * previously created threads if they are idle and available.
 * This type of pool is suitable for handling a large number of short-lived tasks.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}

public class _36_CachedThreadPool {
    public static void main(String[] args) {
        // Create a CachedThreadPool that creates new threads as needed
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        // Gracefully shuts down the executor after completion of tasks
        executorService.shutdown();
    }
}
```

## Single Thread Executor

File: [_37_SingleThreadExecutor.java](_37_SingleThreadExecutor.java)

 * This example demonstrates the use of a SingleThreadExecutor.
 * A SingleThreadExecutor ensures that only one task is executed at a time,
 * and tasks are executed sequentially in the order they are submitted.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}

public class _37_SingleThreadExecutor {
    public static void main(String[] args) {
        // Create a SingleThreadExecutor to execute tasks sequentially
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit 5 tasks to the executor
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        // Gracefully shut down the executor
        executorService.shutdown();
    }
}
```

## Scheduled Thread Pool Executor

File: [_38_ScheduledThreadPool.java](_38_ScheduledThreadPool.java)

 * This example demonstrates the use of a ScheduledThreadPool.
 * A ScheduledThreadPool allows tasks to be scheduled for execution at a fixed rate
 * or with a fixed delay. This is useful for tasks that need to run periodically or with delays.

```java
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}

public class _38_ScheduledThreadPool {
    public static void main(String[] args) {
        // Create a ScheduledThreadPool with 2 threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Schedule tasks with a fixed delay
        scheduler.scheduleWithFixedDelay(new Task(1), 0, 2, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(new Task(2), 0, 3, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(new Task(3), 0, 1, TimeUnit.SECONDS);

        // Let the tasks run for some time before shutting down
        try {
            Thread.sleep(10000); // Let the tasks run for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Shut down the scheduler after tasks are completed
        scheduler.shutdown();
    }
}
```
