/**
 * Equality Check in Java - Use Cases and Examples
 * 
 * Equality checks are crucial when comparing objects in Java. There are two types of equality:
 * 1. **Reference Equality**: Checking whether two references point to the same object in memory using `==`.
 * 2. **Logical Equality**: Checking whether the content of two objects is equal using the `equals()` method.
 * 
 * In this example, we demonstrate:
 * 1. Reference equality using `==`.
 * 2. Logical equality using an overridden `equals()` method.
 * 3. Equality checks in a `List` and `Set`.
 * 4. Comparing two objects of different types.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
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