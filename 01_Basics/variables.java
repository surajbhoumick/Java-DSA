public class variables {
    public static void main(String[] args) {
         // Integer types
         byte byteVar = 127; // 8-bit signed integer (-128 to 127)
         short shortVar = 32767; // 16-bit signed integer (-32,768 to 32,767)
         int intVar = 2147483647; // 32-bit signed integer (-2^31 to 2^31-1)
         long longVar = 9223372036854775807L; // 64-bit signed integer (-2^63 to 2^63-1)
 
         // Floating point types
         float floatVar = 3.14f; // 32-bit floating point
         double doubleVar = 3.141592653589793; // 64-bit floating point
 
         // Character type
         char charVar = 'A'; // 16-bit Unicode character
 
         // Boolean type
         boolean boolVar = true; // Can be true or false
 
         // Reference type (String)
         String stringVar = "Hello, Java!"; // String object
 
         // Printing the values
         System.out.println("Byte value: " + byteVar);
         System.out.println("Short value: " + shortVar);
         System.out.println("Int value: " + intVar);
         System.out.println("Long value: " + longVar);
         System.out.println("Float value: " + floatVar);
         System.out.println("Double value: " + doubleVar);
         System.out.println("Char value: " + charVar);
         System.out.println("Boolean value: " + boolVar);
         System.out.println("String value: " + stringVar);
    }
}
