/**
 * Java Conditional Statements - Use Cases and Examples
 * 
 * Conditional statements are a fundamental part of programming, allowing us to make decisions based on certain conditions.
 * In Java, we use:
 * 1. **if** - Executes a block of code if the condition is true.
 * 2. **if-else** - Executes one block of code if the condition is true, and another block if the condition is false.
 * 3. **else-if** - Used for multiple conditions, checks them in order.
 * 4. **switch** - Checks a variable against multiple possible values and executes a corresponding block of code.
 * 
 * Key Points:
 * - `if` is used when we need to execute a block based on a single condition.
 * - `if-else` helps in situations where we need to choose between two options.
 * - `else-if` is useful for checking multiple conditions in sequence.
 * - `switch` is ideal when you have multiple possible values for a variable and want to compare it against them.
 * 
 * The following program demonstrates all of these conditional statements through different examples.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
import java.util.Scanner;

public class _5_ConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. If Statement Example
        System.out.println("=== Use Case 1: If Statement ===");
        int number1 = 10;
        if (number1 > 5) {
            System.out.println("Number1 is greater than 5");
        }

        // 2. If-Else Statement Example
        System.out.println("\n=== Use Case 2: If-Else Statement ===");
        int number2 = 3;
        if (number2 > 5) {
            System.out.println("Number2 is greater than 5");
        } else {
            System.out.println("Number2 is less than or equal to 5");
        }

        // 3. Else-If Ladder Example
        System.out.println("\n=== Use Case 3: Else-If Ladder ===");
        int number3 = 15;
        if (number3 > 20) {
            System.out.println("Number3 is greater than 20");
        } else if (number3 > 10) {
            System.out.println("Number3 is greater than 10 but less than or equal to 20");
        } else {
            System.out.println("Number3 is less than or equal to 10");
        }

        // 4. Switch Statement Example
        System.out.println("\n=== Use Case 4: Switch Statement ===");
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

        // 5. Combining If-Else with Switch
        System.out.println("\n=== Use Case 5: Combining If-Else with Switch ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        String category;

        if (age < 13) {
            category = "Child";
        } else if (age < 20) {
            category = "Teenager";
        } else {
            category = "Adult";
        }

        // Switch example based on category
        switch (category) {
            case "Child":
                System.out.println("You are a child.");
                break;
            case "Teenager":
                System.out.println("You are a teenager.");
                break;
            case "Adult":
                System.out.println("You are an adult.");
                break;
            default:
                System.out.println("Invalid category");
                break;
        }

        scanner.close();
    }
}