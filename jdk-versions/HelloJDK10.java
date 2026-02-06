/**
 * HelloJDK10.java
 * Compatible with JDK 10 (Java SE 10)
 * Features: Local variable type inference (var keyword)
 */
import java.util.List;

public class HelloJDK10 {
    public static void main(String[] args) {
        // Local variable type inference with var (Java 10)
        var message = "Hello from JDK 10!";
        var features = List.of(
            "Features: Local variable type inference (var keyword)",
            "Application class-data sharing"
        );
        
        System.out.println(message);
        features.forEach(System.out::println);
        
        // var can be used with collections
        var numbers = List.of(1, 2, 3, 4, 5);
        var sum = 0;
        for (var num : numbers) {
            sum += num;
        }
        System.out.println("Sum using var: " + sum);
    }
}
