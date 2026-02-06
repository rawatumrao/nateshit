package advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * Collections - Demonstrates Java Collections Framework
 * Concepts: ArrayList, LinkedList, HashSet, HashMap
 */
public class Collections {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("1. ArrayList:");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Size: " + fruits.size());
        
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        
        // LinkedList
        System.out.println("\n2. LinkedList:");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);
        numbers.addLast(40);
        
        System.out.println("Numbers: " + numbers);
        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());
        
        // HashSet
        System.out.println("\n3. HashSet:");
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Duplicate, won't be added
        
        System.out.println("Colors: " + colors);
        System.out.println("Contains Blue: " + colors.contains("Blue"));
        System.out.println("Size: " + colors.size());
        
        // HashMap
        System.out.println("\n4. HashMap:");
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        
        System.out.println("Scores: " + scores);
        System.out.println("Alice's score: " + scores.get("Alice"));
        
        System.out.println("\nAll entries:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
