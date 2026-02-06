/**
 * HelloJDK24.java
 * Compatible with JDK 24 (Java SE 24) - Future Version
 * Features: Expected future enhancements and best practices
 */
import java.util.List;

public class HelloJDK24 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 24 (Future Version)!");
        System.out.println("Expected Features:");
        System.out.println("- Continued improvements in pattern matching");
        System.out.println("- Enhanced virtual threads and concurrency");
        System.out.println("- Foreign Function & Memory API improvements");
        System.out.println("- Vector API enhancements");
        
        // Modern Java best practices
        var messages = List.of(
            "Write clean code",
            "Use modern Java features",
            "Leverage type inference",
            "Embrace functional programming"
        );
        
        messages.stream()
               .map(String::toUpperCase)
               .forEach(System.out::println);
        
        // Pattern matching and switch expressions
        demonstrateModernJava("Java 24");
    }
    
    static void demonstrateModernJava(Object obj) {
        String result;
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 5) {
                result = "Long string: " + s;
            } else {
                result = "Short string: " + s;
            }
        } else if (obj instanceof Integer) {
            result = "Integer: " + obj;
        } else if (obj == null) {
            result = "Null value";
        } else {
            result = "Unknown type";
        }
        System.out.println(result);
    }
}
