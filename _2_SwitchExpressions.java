/**
 * Switch expressions in Java, introduced in Java 12 as a preview feature and made standard in Java 14, 
 * provide a more concise and flexible way to handle multiple conditions
 * This program demonstrates the use of switch expressions in Java.
 * It evaluates different scenarios using switch expressions and
 * returns the corresponding results.
 *
 * Switch expressions provide a more concise and flexible way to handle
 * multiple conditions compared to traditional switch statements.
 *
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 public class _2_SwitchExpressions {
     // Enum declaration
     enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        // Use case 1: Day of the week
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

        // Use case 2: Grade evaluation
        char grade = 'B';
        String gradeDescription = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Good";
            case 'C' -> "Average";
            case 'D' -> "Below Average";
            case 'F' -> "Fail";
            default -> "Invalid grade";
        };
        System.out.println("Grade: " + gradeDescription);

        // Use case 3: Traffic light signal
        String trafficLight = "Green";
        String action = switch (trafficLight) {
            case "Red" -> "Stop";
            case "Yellow" -> "Caution";
            case "Green" -> "Go";
            default -> "Invalid signal";
        };
        System.out.println("Traffic light action: " + action);

        // Switch expression to evaluate day and assign a message
        String message = switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "It's a weekday.";
            case SATURDAY, SUNDAY -> "It's the weekend!";
        };

        System.out.println("Today is: " + message);
    }
}