/**
 * HelloJDK11.java
 * Compatible with JDK 11 (Java SE 11) - LTS Version
 * Features: var in lambda, String methods, HTTP Client API
 */
import java.util.List;

public class HelloJDK11 {
    public static void main(String[] args) {
        // var in lambda parameters (Java 11)
        List<String> messages = List.of(
            "Hello from JDK 11 (LTS)!",
            "Features: var in lambda, New String methods, HTTP Client API"
        );
        
        messages.forEach((var message) -> System.out.println(message));
        
        // New String methods (Java 11)
        var text = "   Hello World   ";
        System.out.println("Original: '" + text + "'");
        System.out.println("Stripped: '" + text.strip() + "'");
        System.out.println("Is blank: " + "   ".isBlank());
        
        var repeated = "Java ".repeat(3);
        System.out.println("Repeated: " + repeated);
    }
}
