/**
 * HelloJDK18.java
 * Compatible with JDK 18 (Java SE 18)
 * Features: UTF-8 by default, Simple web server, Code snippets in Javadoc
 */
import java.nio.charset.Charset;

public class HelloJDK18 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 18!");
        System.out.println("Features:");
        System.out.println("- UTF-8 by default");
        System.out.println("- Simple web server (jwebserver command)");
        System.out.println("- Code snippets in Java API documentation");
        System.out.println("- Pattern matching for switch (2nd Preview)");
        
        // UTF-8 is the default charset in Java 18
        System.out.println("\nDefault Charset: " + Charset.defaultCharset());
        
        // Internet address resolution SPI
        System.out.println("Enhanced networking capabilities");
        
        // Note: Simple web server can be started with: jwebserver
        System.out.println("\nTo start simple web server:");
        System.out.println("$ jwebserver");
    }
}
