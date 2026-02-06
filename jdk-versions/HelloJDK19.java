/**
 * HelloJDK19.java
 * Compatible with JDK 19 (Java SE 19)
 * Features: Virtual threads (Preview), Pattern matching for switch (3rd Preview), Record patterns (Preview)
 */
public class HelloJDK19 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 19!");
        System.out.println("Features:");
        System.out.println("- Virtual threads (Preview) - Project Loom");
        System.out.println("- Pattern matching for switch (3rd Preview)");
        System.out.println("- Record patterns (Preview)");
        System.out.println("- Structured concurrency (Incubator)");
        
        // Traditional thread creation
        Thread traditionalThread = new Thread(() -> {
            System.out.println("Running in traditional thread");
        });
        traditionalThread.start();
        
        try {
            traditionalThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Note: Virtual threads (preview) would be created with:
        // Thread.ofVirtual().start(() -> { ... });
        System.out.println("\nVirtual threads enable lightweight concurrency!");
    }
}
