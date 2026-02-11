# Java Programming Concepts

This repository contains Java programs demonstrating different concepts of the Java language. Each program is designed to be simple, well-commented, and focused on a specific concept.

## Structure

The repository is organized into three main directories:

- **basics/** - Fundamental Java concepts
- **oop/** - Object-Oriented Programming concepts
- **advanced/** - Advanced Java features

## Basic Concepts (`src/basics/`)

### 1. HelloWorld.java
- Basic Java program structure
- `main` method
- `System.out.println`

### 2. DataTypes.java
- Primitive data types: byte, short, int, long, float, double, char, boolean
- Variable declaration and initialization
- Type-specific literals (L for long, f for float)

### 3. ControlFlow.java
- if-else statements
- else-if ladder
- switch-case statements

### 4. Loops.java
- for loop
- while loop
- do-while loop
- enhanced for loop (for-each)

### 5. Arrays.java
- Single-dimensional arrays
- Array initialization and access
- Multi-dimensional arrays
- Array iteration

### 6. Strings.java
- String concatenation
- Common String methods (length, charAt, substring, etc.)
- String comparison (equals, equalsIgnoreCase)
- String manipulation (toUpperCase, toLowerCase, replace)

## Object-Oriented Programming (`src/oop/`)

### 1. ClassesAndObjects.java
- Class definition
- Object creation
- Constructors
- Instance variables and methods
- `this` keyword

### 2. Inheritance.java
- `extends` keyword
- `super` keyword
- Method overriding
- `@Override` annotation
- Parent-child class relationships

### 3. Polymorphism.java
- Method overloading (compile-time polymorphism)
- Method overriding (runtime polymorphism)
- Dynamic method dispatch

### 4. Encapsulation.java
- Private fields
- Getters and setters
- Data hiding
- Access control

### 5. Abstraction.java
- Abstract classes
- Abstract methods
- Interfaces
- `implements` keyword

## Advanced Concepts (`src/advanced/`)

### 1. ExceptionHandling.java
- try-catch-finally blocks
- Multiple catch blocks
- `throw` and `throws` keywords
- Custom exceptions

### 2. Collections.java
- ArrayList
- LinkedList
- HashSet
- HashMap
- Collection operations (add, remove, get, etc.)

### 3. FileHandling.java
- Reading from files (BufferedReader, FileReader)
- Writing to files (FileWriter)
- File operations (exists, delete, size)
- Try-with-resources

### 4. Multithreading.java
- Thread class
- Runnable interface
- Lambda expressions for Runnable
- `synchronized` keyword
- Thread lifecycle methods (start, join, sleep)

## How to Compile and Run

### Compile a specific program:
```bash
javac src/basics/HelloWorld.java
```

### Run the compiled program:
```bash
java -cp src basics.HelloWorld
```

### Compile all programs in a directory:
```bash
javac src/basics/*.java
javac src/oop/*.java
javac src/advanced/*.java
```

### Run any program:
```bash
# Basic concepts
java -cp src basics.HelloWorld
java -cp src basics.DataTypes
java -cp src basics.ControlFlow
java -cp src basics.Loops
java -cp src basics.Arrays
java -cp src basics.Strings

# OOP concepts
java -cp src oop.ClassesAndObjects
java -cp src oop.Inheritance
java -cp src oop.Polymorphism
java -cp src oop.Encapsulation
java -cp src oop.Abstraction

# Advanced concepts
java -cp src advanced.ExceptionHandling
java -cp src advanced.Collections
java -cp src advanced.FileHandling
java -cp src advanced.Multithreading
```

## Learning Path

For beginners, it's recommended to follow this order:

1. Start with **basics/** directory to understand fundamental Java syntax
2. Move to **oop/** directory to learn object-oriented programming
3. Finally, explore **advanced/** directory for more complex features

## Employee Training Requirement Analysis (Python)

This repository also includes a Python-based data analysis tool for determining employee training requirements based on performance ratings.

### Dataset
- **employee_data.csv**: Contains employee information from three cities (Mumbai, Bangalore, New Delhi)
  - Departments: Finance, HR, Marketing, Sales
  - Ratings: Out of 5
  
### Training Policy
Employees with a rating of 3.5 or below are required to attend training.

### Setup
1. Install required dependencies:
```bash
pip install -r requirements.txt
```

### Running the Analysis
```bash
python3 training_requirement.py
```

This will:
- Load the employee dataset
- Add a 'Training' column ('Yes' for rating ≤ 3.5, 'No' otherwise)
- Display comprehensive analysis including:
  - Complete employee data with training requirements
  - Summary statistics
  - Training requirements by city
  - Training requirements by department
- Save the processed data to `employee_data_with_training.csv`

### Output
The script generates `employee_data_with_training.csv` with an additional 'Training' column indicating whether each employee needs training.

## Contributing

Feel free to add more examples or improve existing ones!
