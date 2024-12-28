import java.util.*;

/**
 * This program demonstrates the usage of IdentityHashMap in Java.
 * 
 * It performs the following tasks:
 * 1. Creates an IdentityHashMap to store keys by reference equality.
 * 2. Adds key-value pairs to the IdentityHashMap.
 * 3. Shows how the map handles keys based on reference comparison (not logical equality).
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
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