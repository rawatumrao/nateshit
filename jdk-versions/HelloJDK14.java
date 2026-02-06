/**
 * HelloJDK14.java
 * Compatible with JDK 14 (Java SE 14)
 * Features: Switch expressions (Standard), Records (Preview), Pattern matching for instanceof (Preview)
 */
public class HelloJDK14 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 14!");
        
        // Switch expressions became standard in Java 14
        int day = 3;
        String dayType = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid";
        };
        System.out.println("Day " + day + " is a " + dayType);
        
        System.out.println("Features:");
        System.out.println("- Switch expressions (Standard)");
        System.out.println("- Records (Preview)");
        System.out.println("- Pattern matching for instanceof (Preview)");
        
        // Helpful NullPointerExceptions (Java 14)
        Object obj = "Hello";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("Length: " + str.length());
        }
    }
}
