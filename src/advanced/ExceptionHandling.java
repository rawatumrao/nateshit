package advanced;

/**
 * ExceptionHandling - Demonstrates exception handling
 * Concepts: try-catch-finally, throw, throws, custom exceptions
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        // Basic try-catch
        System.out.println("1. Basic try-catch:");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        
        // Multiple catch blocks
        System.out.println("\n2. Multiple catch blocks:");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Try-catch-finally
        System.out.println("\n3. Try-catch-finally:");
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        } finally {
            System.out.println("Finally block always executes");
        }
        
        // Custom exception
        System.out.println("\n4. Custom exception:");
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Method with throws
        System.out.println("\n5. Method with throws:");
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method that throws exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    
    // Method with custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        }
        System.out.println("Age is valid");
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
