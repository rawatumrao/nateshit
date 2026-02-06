/**
 * HelloJDK8.java
 * Compatible with JDK 1.8 (Java SE 8)
 * Features: Lambda expressions, Stream API, Default methods
 */
import java.util.Arrays;
import java.util.List;

public class HelloJDK8 {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList(
            "Hello from JDK 1.8!",
            "Features: Lambda expressions, Stream API, Default methods"
        );
        
        // Lambda expressions and Stream API (Java 8)
        messages.stream()
                .forEach(message -> System.out.println(message));
        
        // Method reference (Java 8)
        System.out.println("\nUsing method reference:");
        messages.stream()
                .forEach(System.out::println);
    }
}
