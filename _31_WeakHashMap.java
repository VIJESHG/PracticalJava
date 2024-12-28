import java.util.*;

/**
 * This program demonstrates the usage of WeakHashMap in Java.
 * 
 * It performs the following tasks:
 * 1. Creates a WeakHashMap to store weak references to objects.
 * 2. Adds key-value pairs to the WeakHashMap.
 * 3. Shows how the key is eligible for garbage collection when it is no longer in use.
 * 4. Prints the map before and after the garbage collection of keys.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
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