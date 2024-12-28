/**
 * Java Loops - Use Cases and Examples
 * 
 * Loops are a fundamental concept in programming that allow you to repeatedly execute a block of code based on certain conditions.
 * Java supports several types of loops:
 * 
 * 1. **for loop**: Used when you know beforehand how many times you want to execute a statement or a block of statements.
 * 2. **while loop**: Executes a block of code as long as the specified condition is true.
 * 3. **do-while loop**: Similar to the `while` loop, but ensures the block of code is executed at least once before checking the condition.
 * 
 * Loops are essential for tasks such as iterating over arrays, processing multiple items in a collection, or executing repetitive tasks.
 * 
 * The following program demonstrates the use of all three loops.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _6_Loops {

    public static void main(String[] args) {
        
        // 1. For Loop Example
        System.out.println("=== Use Case 1: For Loop ===");
        // For loop to print numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // 2. While Loop Example
        System.out.println("\n=== Use Case 2: While Loop ===");
        // While loop to print numbers 1 to 5
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // 3. Do-While Loop Example
        System.out.println("\n=== Use Case 3: Do-While Loop ===");
        // Do-while loop to print numbers 1 to 5
        int k = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k <= 5);

        // 4. Nested Loops Example
        System.out.println("\n=== Use Case 4: Nested Loops ===");
        // Nested for loop to print a 3x3 matrix
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row + "," + col + " ");
            }
            System.out.println();
        }

        // 5. Break and Continue with Loops
        System.out.println("\n=== Use Case 5: Break and Continue ===");
        // Using break to exit the loop
        System.out.println("Example of break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at i = " + i);
                break;  // Exit the loop when i is 6
            }
            System.out.println(i);
        }

        // Using continue to skip an iteration
        System.out.println("\nExample of continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;  // Skip the iteration when i is 6
            }
            System.out.println(i);
        }
    }
}