/**
 * HelloJDK7.java
 * Compatible with JDK 1.7 (Java SE 7)
 * Features: Try-with-resources, Diamond operator
 */
public class HelloJDK7 {
    public static void main(String[] args) {
        // Diamond operator introduced in Java 7
        java.util.List<String> messages = new java.util.ArrayList<>();
        messages.add("Hello from JDK 1.7!");
        messages.add("Features: Try-with-resources, Diamond operator");
        
        // Try-with-resources introduced in Java 7
        try (java.io.StringWriter writer = new java.io.StringWriter()) {
            for (String message : messages) {
                System.out.println(message);
                writer.write(message + "\n");
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
