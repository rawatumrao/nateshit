package basics;

/**
 * DataTypes - Demonstrates primitive data types in Java
 * Concepts: byte, short, int, long, float, double, char, boolean
 */
public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        
        // Floating point types
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        
        // Character type
        char charVar = 'A';
        
        // Boolean type
        boolean boolVar = true;
        
        // Print all variables
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
    }
}
