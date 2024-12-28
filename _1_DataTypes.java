public class _1_DataTypes {
    // Enum declaration
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Primitive data types

        // Integer types
        byte byteVar = 127;               // 8-bit signed integer
        short shortVar = 32000;           // 16-bit signed integer
        int intVar = 2147483647;          // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer

        // Floating-point types
        float floatVar = 3.14f;           // 32-bit floating-point
        double doubleVar = 3.141592653589793; // 64-bit floating-point

        // Character type
        char charVar = 'A';               // 16-bit Unicode character

        // Boolean type
        boolean boolVar = true;           // true or false

        // Non-primitive (Reference) type
        String stringVar = "Hello, World!";

        // Array (example of a reference type)
        int[] intArray = {10, 20, 30, 40, 50}; // Array of integers

        // Enum example
        Day today = Day.WEDNESDAY;

        // Output all data types
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);
        System.out.println("String Value: " + stringVar);

        // Output array elements
        System.out.print("Array Elements: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for better formatting

        // Output enum value
        System.out.println("Today is: " + today);
    }
}