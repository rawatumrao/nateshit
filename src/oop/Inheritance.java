package oop;

/**
 * Inheritance - Demonstrates inheritance concept
 * Concepts: extends keyword, super keyword, method overriding
 */
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Tabby");
        
        dog.displayInfo();
        dog.makeSound();
        
        System.out.println();
        
        cat.displayInfo();
        cat.makeSound();
    }
}

class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
