package oop;

/**
 * ClassesAndObjects - Demonstrates basic OOP concepts
 * Concepts: class definition, objects, constructors, methods
 */
public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating objects
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);
        
        // Calling methods
        person1.displayInfo();
        person2.displayInfo();
        
        person1.haveBirthday();
        person1.displayInfo();
    }
}

class Person {
    // Instance variables
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Method to increment age
    public void haveBirthday() {
        age++;
        System.out.println("Happy birthday " + name + "!");
    }
}
