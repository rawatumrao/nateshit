/**
 * HelloJDK22.java
 * Compatible with JDK 22 (Java SE 22)
 * Features: Unnamed variables and patterns, String templates (2nd Preview), Statements before super (Preview)
 * Note: This version is backwards compatible with JDK 17 but documents JDK 22 features
 */
import java.util.List;

public class HelloJDK22 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 22!");
        System.out.println("Features:");
        System.out.println("- Unnamed variables and patterns (_)");
        System.out.println("- String templates (2nd Preview)");
        System.out.println("- Statements before super() (Preview)");
        System.out.println("- Foreign Function & Memory API (Preview)");
        
        // List of items
        List<String> items = List.of("Java", "Python", "C++");
        
        // Traditional forEach
        items.forEach(item -> System.out.println("Item: " + item));
        
        // Note: In JDK 22, unnamed patterns allow: items.forEach(_ -> ...)
        System.out.println("\nTotal items: " + items.size());
        
        // Note: String templates (preview) would allow:
        // String message = STR."Hello from Java \{22}!";
        System.out.println("\nEnhanced string interpolation coming!");
    }
}
