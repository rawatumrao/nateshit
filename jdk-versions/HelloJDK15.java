/**
 * HelloJDK15.java
 * Compatible with JDK 15 (Java SE 15)
 * Features: Text blocks (Standard), Sealed classes (Preview), Hidden classes
 */
public class HelloJDK15 {
    public static void main(String[] args) {
        // Text blocks became standard in Java 15
        String message = """
            Hello from JDK 15!
            Features:
            - Text blocks (Standard)
            - Sealed classes (Preview)
            - Hidden classes
            """;
        
        System.out.println(message);
        
        // Multi-line text block
        String json = """
            {
                "name": "Java 15",
                "type": "Programming Language",
                "year": 2020
            }
            """;
        System.out.println(json);
    }
}
