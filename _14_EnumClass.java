/**
 * Enum Class in Java - Use Cases and Examples
 * 
 * An Enum in Java is a special class used to define collections of constants (fixed values). 
 * It is particularly useful when you have a fixed set of related constants, like days of the week, directions, etc.
 * 
 * This example demonstrates:
 * 1. How to define an enum representing the days of the week.
 * 2. Using fields, constructors, and methods in enums.
 * 3. Working with switch statements and enums.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _14_EnumClass {

    public static void main(String[] args) {
        
        // Use enum in a switch statement
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
        
        // Display working hours using enum method
        System.out.println("Working hours for " + today + ": " + today.getWorkingHours() + " hours.");
        
        // Loop through all enum values
        System.out.println("\nAll Days of the Week:");
        for (Day day : Day.values()) {
            System.out.println(day + " - Working Hours: " + day.getWorkingHours() + " hours");
        }
    }
}

// Enum to represent Days of the Week
enum Day {
    SUNDAY(0), // Sunday has 0 working hours
    MONDAY(8), // Monday has 8 working hours
    TUESDAY(8), // Tuesday has 8 working hours
    WEDNESDAY(8), // Wednesday has 8 working hours
    THURSDAY(8), // Thursday has 8 working hours
    FRIDAY(8), // Friday has 8 working hours
    SATURDAY(0); // Saturday has 0 working hours

    // Field to store working hours
    private final int workingHours;

    // Enum constructor
    Day(int workingHours) {
        this.workingHours = workingHours;
    }

    // Method to get working hours for each day
    public int getWorkingHours() {
        return this.workingHours;
    }
}