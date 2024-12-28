/**
 * This program demonstrates how to use EnumSet with an enum type (Day).
 * 
 * It performs the following tasks:
 * 1. Creates an EnumSet of Day constants.
 * 2. Adds and removes elements from the EnumSet.
 * 3. Displays the contents of the EnumSet.
 * 4. Checks if a specific Day is present in the EnumSet.
 * 5. Clears the EnumSet and displays its content.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
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