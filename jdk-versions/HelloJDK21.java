/**
 * HelloJDK21.java
 * Compatible with JDK 21 (Java SE 21) - LTS Version
 * Features: Virtual threads (Standard), Sequenced collections, Pattern matching for switch (Standard), Record patterns (Standard)
 * Note: This version is backwards compatible with JDK 17 but documents JDK 21 features
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class HelloJDK21 {
    record Person(String name, int age) {}
    
    public static void main(String[] args) {
        System.out.println("Hello from JDK 21 (LTS)!");
        System.out.println("Features:");
        System.out.println("- Virtual threads (Standard) - Project Loom");
        System.out.println("- Sequenced collections");
        System.out.println("- Pattern matching for switch (Standard)");
        System.out.println("- Record patterns (Standard)");
        System.out.println("- String templates (Preview)");
        
        // LinkedHashMap maintains insertion order (Sequenced collection in JDK 21)
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        
        System.out.println("\nLinked HashMap entries: " + map);
        
        // Pattern matching for switch with records
        Person person = new Person("John", 30);
        String description = describeAge(person);
        System.out.println(description);
    }
    
    static String describeAge(Person person) {
        if (person.age() < 18) {
            return person.name() + " is a minor";
        } else {
            return person.name() + " is an adult";
        }
    }
}
