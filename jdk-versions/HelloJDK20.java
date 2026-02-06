/**
 * HelloJDK20.java
 * Compatible with JDK 20 (Java SE 20)
 * Features: Scoped values (Incubator), Record patterns (2nd Preview), Pattern matching for switch (4th Preview)
 */
public class HelloJDK20 {
    record Point(int x, int y) {}
    
    public static void main(String[] args) {
        System.out.println("Hello from JDK 20!");
        System.out.println("Features:");
        System.out.println("- Scoped values (Incubator)");
        System.out.println("- Record patterns (2nd Preview)");
        System.out.println("- Pattern matching for switch (4th Preview)");
        System.out.println("- Virtual threads (2nd Preview)");
        
        Point point = new Point(10, 20);
        System.out.println("\nPoint: (" + point.x() + ", " + point.y() + ")");
        
        // Note: Record patterns (preview) would allow:
        // if (obj instanceof Point(int x, int y)) {
        //     System.out.println("x: " + x + ", y: " + y);
        // }
        
        System.out.println("\nEnhanced pattern matching coming soon!");
    }
}
