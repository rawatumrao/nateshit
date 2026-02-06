/**
 * HelloJDK17.java
 * Compatible with JDK 17 (Java SE 17) - LTS Version
 * Features: Sealed classes (Standard), Pattern matching enhancements, Strong encapsulation
 */
public class HelloJDK17 {
    // Sealed classes became standard in Java 17
    sealed interface Shape permits Circle, Rectangle {
        double area();
    }
    
    static final class Circle implements Shape {
        private final double radius;
        
        Circle(double radius) {
            this.radius = radius;
        }
        
        public double area() {
            return Math.PI * radius * radius;
        }
    }
    
    static final class Rectangle implements Shape {
        private final double width, height;
        
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        public double area() {
            return width * height;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello from JDK 17 (LTS)!");
        System.out.println("Features:");
        System.out.println("- Sealed classes (Standard)");
        System.out.println("- Pattern matching enhancements");
        System.out.println("- Strong encapsulation of JDK internals");
        
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
