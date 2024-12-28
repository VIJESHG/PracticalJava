/**
 * Java Input and Output (I/O) - Concepts and Use Cases
 * 
 * Input and Output in Java allow programs to interact with users or external systems. 
 * 
 * Key Concepts:
 * 1. **Input**:
 *    - Reading data from the user or a file.
 *    - Classes: `Scanner`, `BufferedReader`.
 * 
 * 2. **Output**:
 *    - Displaying information to the user or writing to a file.
 *    - Classes/Methods: `System.out.print`, `System.out.println`, `System.out.printf`.
 * 
 * 3. **Use Cases Covered**:
 *    - Accepting user input for different data types.
 *    - Handling formatted output for better readability.
 *    - Reading multi-line input using `BufferedReader`.
 *    - Demonstrating formatted strings using `System.out.printf`.
 * 
 * Best Practices:
 * - Always close input streams (e.g., `Scanner`) to free resources.
 * - Handle exceptions when working with I/O classes like `BufferedReader`.
 
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 import java.util.Scanner;
 
 public class _4_InputOutputs {
     public static void main(String[] args) {
         // 1. Using Scanner for Basic Input
         System.out.println("=== Use Case 1: Basic Input using Scanner ===");
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
 
         // 2. Using BufferedReader for Multi-line Input
         System.out.println("\n=== Use Case 2: Multi-line Input using BufferedReader ===");
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         try {
             System.out.print("Enter your favorite quote: ");
             String quote = reader.readLine();
 
             System.out.println("Output:");
             System.out.println("Your favorite quote is: \"" + quote + "\"");
         } catch (IOException e) {
             System.out.println("Error reading input: " + e.getMessage());
         }
 
         // 3. Formatted Output using System.out.printf
         System.out.println("\n=== Use Case 3: Formatted Output ===");
         String title = "Learning Java";
         double price = 19.99;
         int quantity = 3;
 
         System.out.printf("Book: %s | Price: $%.2f | Quantity: %d\n", title, price, quantity);
         System.out.printf("Total cost: $%.2f\n", price * quantity);
 
         // 4. Demonstrating Special Cases with Input
         System.out.println("\n=== Use Case 4: Handling Special Input Cases ===");
 
         // Consuming leftover newline from previous input
         scanner.nextLine();
 
         System.out.print("Enter a single word (using Scanner): ");
         String singleWord = scanner.next();
         System.out.println("You entered: " + singleWord);
 
         System.out.print("Enter a blank string: ");
         String blankString = scanner.nextLine(); // Expected to be blank
         System.out.println("Is the input blank? " + blankString.isBlank());
 
         scanner.close();
     }
 }