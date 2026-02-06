/**
 * HelloJDK12.java
 * Compatible with JDK 12 (Java SE 12)
 * Features: Switch expressions (Preview), Compact number formatting
 */
public class HelloJDK12 {
    public static void main(String[] args) {
        System.out.println("Hello from JDK 12!");
        System.out.println("Features: Switch expressions (Preview), Compact number formatting");
        
        // Traditional switch
        int day = 3;
        String dayType;
        switch (day) {
            case 1: case 7:
                dayType = "Weekend";
                break;
            case 2: case 3: case 4: case 5: case 6:
                dayType = "Weekday";
                break;
            default:
                dayType = "Invalid";
                break;
        }
        System.out.println("Day " + day + " is a " + dayType);
        
        // Note: Switch expressions were preview in Java 12
        // They would look like: var result = switch(day) { case 1, 7 -> "Weekend"; ... }
    }
}
