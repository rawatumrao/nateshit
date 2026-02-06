/**
 * HelloJDK9.java
 * Compatible with JDK 1.9 (Java SE 9)
 * Features: Module system, Factory methods for collections, Private interface methods
 */
import java.util.List;

public class HelloJDK9 {
    public static void main(String[] args) {
        // Factory method for immutable collections (Java 9)
        List<String> messages = List.of(
            "Hello from JDK 1.9!",
            "Features: Module system (JPMS), Factory methods, Private interface methods"
        );
        
        messages.forEach(System.out::println);
        
        // Try-with-resources enhancement (Java 9) - resource can be effectively final
        java.io.StringWriter writer = new java.io.StringWriter();
        try (writer) {
            writer.write("Java 9 improvements!\n");
            System.out.println(writer.toString());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
