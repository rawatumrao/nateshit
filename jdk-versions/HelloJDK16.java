/**
 * HelloJDK16.java
 * Compatible with JDK 16 (Java SE 16)
 * Features: Records (Standard), Pattern matching for instanceof (Standard), Sealed classes (2nd Preview)
 */
public class HelloJDK16 {
    // Records became standard in Java 16
    record Message(String text, int version) {
        public void print() {
            System.out.println(text + " - Version: " + version);
        }
    }
    
    public static void main(String[] args) {
        Message msg = new Message("Hello from JDK 16!", 16);
        msg.print();
        
        System.out.println("Features:");
        System.out.println("- Records (Standard)");
        System.out.println("- Pattern matching for instanceof (Standard)");
        System.out.println("- Sealed classes (2nd Preview)");
        
        // Pattern matching for instanceof (Standard in Java 16)
        Object obj = "Java 16";
        if (obj instanceof String str) {
            System.out.println("String length: " + str.length());
        }
    }
}
