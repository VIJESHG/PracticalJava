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
