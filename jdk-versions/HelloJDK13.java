/**
 * HelloJDK13.java
 * Compatible with JDK 13 (Java SE 13)
 * Features: Text blocks (Preview), Switch expressions (2nd Preview)
 */
public class HelloJDK13 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 13!");
        
        // Text blocks were preview in Java 13
        // Traditional multi-line string
        String message = "Features:\n" +
                        "- Text blocks (Preview)\n" +
                        "- Switch expressions (2nd Preview)\n" +
                        "- Reimplementation of legacy Socket API";
        
        System.out.println(message);
        
        // Note: With text blocks (preview), it would be:
        // String textBlock = """
        //     Features:
        //     - Text blocks (Preview)
        //     - Switch expressions
        //     """;
    }
}
