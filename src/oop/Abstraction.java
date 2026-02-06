package oop;

/**
 * Abstraction - Demonstrates abstraction concept
 * Concepts: abstract classes, abstract methods, interfaces
 */
public class Abstraction {
    public static void main(String[] args) {
        // Using abstract class
        Vehicle car = new Car("Toyota", "Camry");
        Vehicle bike = new Bike("Harley", "Davidson");
        
        car.start();
        car.displayInfo();
        car.stop();
        
        System.out.println();
        
        bike.start();
        bike.displayInfo();
        bike.stop();
        
        System.out.println();
        
        // Using interface
        Drawable circle = new DrawableCircle();
        Drawable square = new DrawableSquare();
        
        circle.draw();
        square.draw();
    }
}

// Abstract class
abstract class Vehicle {
    protected String brand;
    protected String model;
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    // Abstract method
    public abstract void start();
    
    // Abstract method
    public abstract void stop();
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void start() {
        System.out.println("Car is starting with a key");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping with brakes");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick");
    }
    
    @Override
    public void stop() {
        System.out.println("Bike is stopping with hand brakes");
    }
}

// Interface
interface Drawable {
    void draw();
}

class DrawableCircle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class DrawableSquare implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
