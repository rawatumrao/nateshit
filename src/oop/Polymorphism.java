package oop;

/**
 * Polymorphism - Demonstrates polymorphism concept
 * Concepts: method overloading, method overriding, runtime polymorphism
 */
public class Polymorphism {
    public static void main(String[] args) {
        // Method overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
        System.out.println("Sum of doubles: " + calc.add(5.5, 10.5));
        
        System.out.println();
        
        // Runtime polymorphism
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);
        
        shape1.draw();
        System.out.println("Area: " + shape1.calculateArea());
        
        System.out.println();
        
        shape2.draw();
        System.out.println("Area: " + shape2.calculateArea());
    }
}

class Calculator {
    // Method overloading - same name, different parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
    
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}
