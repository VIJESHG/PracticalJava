import java.util.EnumMap;

/**
 * This program demonstrates the usage of EnumMap in Java.
 * 
 * It performs the following tasks:
 * 1. Creates an EnumMap to store working hours for each day of the week.
 * 2. Adds key-value pairs to the EnumMap.
 * 3. Retrieves and displays the working hours for specific days.
 * 4. Removes key-value pairs from the EnumMap.
 * 5. Displays the size of the EnumMap.
 * 6. Iterates over the EnumMap and prints each day with its corresponding working hours.
 * 7. Shows how EnumMap is memory-efficient for enum-based keys.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

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