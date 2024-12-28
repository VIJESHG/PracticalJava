/**
 * Java Strings and StringBuilder - Declaration and Operations
 * 
 * Strings in Java:
 * 1. Immutable: Once created, cannot be modified.
 * 2. Provides rich API for common string manipulations.
 * 
 * StringBuilder in Java:
 * 1. Mutable: Allows modification of strings without creating new objects.
 * 2. Optimized for scenarios with frequent string manipulations.
 * 
 * Key Features of StringBuilder:
 * - Faster for repeated modifications (e.g., append, insert, delete).
 * - Common methods include append(), insert(), replace(), delete(), reverse(), and more.
 * 
 * This program demonstrates both String and StringBuilder usage.
 * * Author: Vijesh Ghandare
 * Date: 28-Dec-2024
 */

 public class _3_StringBuilderOperations {
    public static void main(String[] args) {
        // String Operations
        System.out.println("String Operations:");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Java");

        // Concatenation
        String concatenated = str1 + " " + str2 + " " + str3;
        System.out.println("Concatenated String: " + concatenated);

        // Length
        System.out.println("Length of str1: " + str1.length());

        // Substring
        String subStr = concatenated.substring(6, 11);
        System.out.println("Substring: " + subStr);

        // Comparison
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

        System.out.println("\nStringBuilder Operations:");
        // StringBuilder Operations
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Reset to original
        sb.reverse(); // Reverse back to original order
        sb.delete(6, sb.length()).append("Java"); // Modify content
        System.out.println("Modified StringBuilder: " + sb);

        // StringBuilder Capacity and Length
        System.out.println("StringBuilder Capacity: " + sb.capacity());
        System.out.println("StringBuilder Length: " + sb.length());
    }
}