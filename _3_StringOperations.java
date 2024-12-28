/**
 * Java Strings - Declaration and Operations
 * 
 * Strings in Java are objects that represent a sequence of characters.
 * They are widely used in Java programming because of their immutability and rich API for manipulation.
 * 
 * Key Concepts:
 * 1. String Declaration:
 *    a. Using String literals: Strings are stored in the String Pool.
 *    b. Using the 'new' keyword: Creates a new String object in the heap.
 * 
 * 2. Important Properties:
 *    a. Strings are immutable - once created, their values cannot be changed.
 *    b. Java provides methods for string operations like concatenation, comparison, and searching.
 * 
 * 3. Common Operations:
 *    - Concatenation: Combining two strings.
 *    - Length: Finding the length of a string.
 *    - Substring: Extracting parts of a string.
 *    - Comparison: Comparing strings (equals, compareTo, etc.).
 *    - Case Conversion: Converting to upper/lower case.
 *    - Searching: Finding characters or substrings.
 *    - Replacing: Replacing parts of a string.
 * 
 * This program demonstrates different string declarations and common operations.
 * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 public class _3_StringOperations {
    public static void main(String[] args) {
        // Declaration using String literals
        String str1 = "Hello";
        String str2 = "World";

        // Declaration using 'new' keyword
        String str3 = new String("Java");

        // String Concatenation
        String concatenated = str1 + " " + str2 + " " + str3;
        System.out.println("Concatenated String: " + concatenated);

        // Length of a string
        System.out.println("Length of str1: " + str1.length());

        // Substring
        String subStr = concatenated.substring(6, 11);
        System.out.println("Substring: " + subStr);

        // String Comparison
        String str4 = "JAVA";
        System.out.println("str3 equals str4 (case-sensitive): " + str3.equals(str4));
        System.out.println("str3 equalsIgnoreCase str4: " + str3.equalsIgnoreCase(str4));

        // Case Conversion
        System.out.println("str4 in lowercase: " + str4.toLowerCase());
        System.out.println("str3 in uppercase: " + str3.toUpperCase());

        // Searching
        System.out.println("Index of 'World': " + concatenated.indexOf("World"));
        System.out.println("Does concatenated contain 'Java'? " + concatenated.contains("Java"));

        // Replacing
        String replacedStr = concatenated.replace("World", "Universe");
        System.out.println("Replaced String: " + replacedStr);

        // Checking immutability
        System.out.println("Original String after replace: " + concatenated);

        // Empty and Blank checks
        String emptyString = "";
        String blankString = "   ";
        System.out.println("Is emptyString empty? " + emptyString.isEmpty());
        System.out.println("Is blankString blank? " + blankString.isBlank());
    }
}