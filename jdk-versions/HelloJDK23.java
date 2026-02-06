/**
 * HelloJDK23.java
 * Compatible with JDK 23 (Java SE 23)
 * Features: Primitive patterns (Preview), Markdown documentation comments, Module import declarations (Preview)
 */
public class HelloJDK23 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 23!");
        System.out.println("Features:");
        System.out.println("- Primitive patterns in instanceof and switch (Preview)");
        System.out.println("- Markdown documentation comments");
        System.out.println("- Module import declarations (Preview)");
        System.out.println("- Class-File API (Preview)");
        
        // Demonstrate primitive type handling
        Object value = 42;
        
        if (value instanceof Integer num) {
            System.out.println("Integer value: " + num);
            System.out.println("Doubled: " + (num * 2));
        }
        
        // Pattern matching with primitives
        processValue(100);
        processValue(3.14);
        processValue("Hello");
    }
    
    static void processValue(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("Processing integer: " + i);
        } else if (obj instanceof Double d) {
            System.out.println("Processing double: " + d);
        } else if (obj instanceof String s) {
            System.out.println("Processing string: " + s);
        }
    }
}
