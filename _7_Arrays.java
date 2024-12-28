/**
 * Java Arrays - Use Cases and Examples
 * 
 * Arrays are a fundamental data structure in Java that allow you to store multiple values of the same type in a single variable.
 * Arrays in Java are indexed starting from 0 and can store elements of any data type (e.g., `int`, `String`, `double`, etc.).
 * Java arrays are fixed in size, meaning once they are created, their size cannot be changed.
 * 
 * The following examples demonstrate:
 * 1. Declaring and initializing arrays.
 * 2. Accessing elements in an array.
 * 3. Modifying elements in an array.
 * 4. Iterating over arrays.
 * 5. Array operations like finding the maximum, minimum, and calculating the sum.
 * 
 * Arrays are essential for storing data that needs to be processed in a linear fashion, such as in searching or sorting algorithms.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */
public class _7_Arrays {

    public static void main(String[] args) {
        
        // 1. Declare and Initialize an Array
        System.out.println("=== Use Case 1: Declare and Initialize an Array ===");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        // 2. Access Array Elements
        System.out.println("\n\n=== Use Case 2: Access Array Elements ===");
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        
        // 3. Modify Array Elements
        System.out.println("\n=== Use Case 3: Modify Array Elements ===");
        numbers[2] = 35; // Modifying the element at index 2
        System.out.println("Modified Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // 4. Array Operations: Sum of Elements
        System.out.println("\n\n=== Use Case 4: Sum of Array Elements ===");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of Array Elements: " + sum);

        // 5. Array Operations: Maximum and Minimum Elements
        System.out.println("\n=== Use Case 5: Find Maximum and Minimum Elements ===");
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);

        // 6. Array Operations: Find Index of Element
        System.out.println("\n=== Use Case 6: Find Index of Element ===");
        int elementToFind = 35;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found");
        }

        // 7. Multidimensional Arrays (2D Array)
        System.out.println("\n=== Use Case 7: Multidimensional Arrays (2D Array) ===");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("2D Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 8. Array Copy Example
        System.out.println("\n=== Use Case 8: Array Copy ===");
        int[] copiedArray = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);
        System.out.println("Copied Array: ");
        for (int number : copiedArray) {
            System.out.print(number + " ");
        }
    }
}