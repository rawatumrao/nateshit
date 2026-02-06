# Java Hello Programs - JDK 1.7 to JDK 1.25

This repository contains simple Java "Hello" programs demonstrating features specific to each JDK version from 1.7 to 1.25.

## Directory Structure

```
jdk-versions/
├── HelloJDK7.java    - JDK 1.7 (Diamond operator, Try-with-resources)
├── HelloJDK8.java    - JDK 1.8 (Lambda expressions, Stream API)
├── HelloJDK9.java    - JDK 1.9 (Module system, Factory methods)
├── HelloJDK10.java   - JDK 10 (Local variable type inference - var)
├── HelloJDK11.java   - JDK 11 LTS (var in lambda, String methods)
├── HelloJDK12.java   - JDK 12 (Switch expressions preview)
├── HelloJDK13.java   - JDK 13 (Text blocks preview)
├── HelloJDK14.java   - JDK 14 (Switch expressions standard)
├── HelloJDK15.java   - JDK 15 (Text blocks standard)
├── HelloJDK16.java   - JDK 16 (Records standard)
├── HelloJDK17.java   - JDK 17 LTS (Sealed classes)
├── HelloJDK18.java   - JDK 18 (UTF-8 by default)
├── HelloJDK19.java   - JDK 19 (Virtual threads preview)
├── HelloJDK20.java   - JDK 20 (Scoped values, Record patterns)
├── HelloJDK21.java   - JDK 21 LTS (Virtual threads standard)
├── HelloJDK22.java   - JDK 22 (Unnamed variables)
├── HelloJDK23.java   - JDK 23 (Primitive patterns)
├── HelloJDK24.java   - JDK 24 (Future version)
└── HelloJDK25.java   - JDK 25 (Future version)
```

## How to Compile and Run

### Prerequisites
- Install the appropriate JDK version for each program
- Ensure `javac` and `java` commands are in your PATH

### Compilation

Navigate to the `jdk-versions` directory and compile the program:

```bash
cd jdk-versions

# Compile a specific program
javac HelloJDK7.java
javac HelloJDK8.java
# ... and so on
```

### Execution

Run the compiled program:

```bash
# Run a specific program
java HelloJDK7
java HelloJDK8
# ... and so on
```

### Compile and Run All Programs

You can compile and run all programs using these commands:

```bash
cd jdk-versions

# Compile all programs
javac HelloJDK*.java

# Run all programs
for file in HelloJDK*.class; do
    classname=$(basename "$file" .class)
    echo "Running $classname..."
    java "$classname"
    echo "---"
done
```

## Key Features by Version

### JDK 1.7 (2011)
- Try-with-resources
- Diamond operator (`<>`)
- Multi-catch exception handling

### JDK 1.8 (2014) - LTS
- Lambda expressions
- Stream API
- Default methods in interfaces
- Method references

### JDK 1.9 (2017)
- Module system (JPMS)
- Factory methods for collections
- Private interface methods

### JDK 1.10 (2018)
- Local variable type inference (`var` keyword)
- Application class-data sharing

### JDK 1.11 (2018) - LTS
- `var` in lambda parameters
- New String methods (`strip()`, `isBlank()`, `repeat()`)
- HTTP Client API

### JDK 1.12 (2019)
- Switch expressions (Preview)
- Compact number formatting

### JDK 1.13 (2019)
- Text blocks (Preview)
- Switch expressions (2nd Preview)

### JDK 1.14 (2020)
- Switch expressions (Standard)
- Records (Preview)
- Pattern matching for instanceof (Preview)

### JDK 1.15 (2020)
- Text blocks (Standard)
- Sealed classes (Preview)
- Hidden classes

### JDK 1.16 (2021)
- Records (Standard)
- Pattern matching for instanceof (Standard)
- Sealed classes (2nd Preview)

### JDK 1.17 (2021) - LTS
- Sealed classes (Standard)
- Strong encapsulation of JDK internals
- Enhanced pseudo-random number generators

### JDK 1.18 (2022)
- UTF-8 by default
- Simple web server
- Code snippets in Java API documentation

### JDK 1.19 (2022)
- Virtual threads (Preview) - Project Loom
- Pattern matching for switch (3rd Preview)
- Structured concurrency (Incubator)

### JDK 1.20 (2023)
- Scoped values (Incubator)
- Record patterns (2nd Preview)
- Virtual threads (2nd Preview)

### JDK 1.21 (2023) - LTS
- Virtual threads (Standard)
- Sequenced collections
- Pattern matching for switch (Standard)
- Record patterns (Standard)

### JDK 1.22 (2024)
- Unnamed variables and patterns (`_`)
- String templates (2nd Preview)
- Foreign Function & Memory API

### JDK 1.23 (2024)
- Primitive patterns (Preview)
- Markdown documentation comments
- Class-File API

### JDK 1.24 (Future)
- Expected enhancements in pattern matching
- Virtual threads improvements
- Vector API enhancements

### JDK 1.25 (Future)
- Advanced pattern matching
- Enhanced Stream API
- Project Valhalla integration
- Cloud-native features

## Notes

- Some features mentioned are preview features and may require enabling with `--enable-preview` flag:
  ```bash
  javac --enable-preview --release 19 HelloJDK19.java
  java --enable-preview HelloJDK19
  ```

- JDK 24 and 25 programs are forward-looking and demonstrate expected best practices and patterns.

- LTS (Long Term Support) versions: JDK 8, 11, 17, and 21 are recommended for production use.

## Testing Your Environment

To check your Java version:

```bash
java -version
javac -version
```

## Learning Path

It's recommended to study these programs in order to understand the evolution of Java:

1. Start with JDK 7 and 8 to learn the fundamentals
2. Progress through JDK 9-11 to understand modularization and newer APIs
3. Study JDK 12-16 to learn about preview features and their progression
4. Focus on JDK 17 and 21 (LTS versions) for production-ready code
5. Explore JDK 22+ for cutting-edge features

## Additional Resources

- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [OpenJDK](https://openjdk.org/)
- [Java Version History](https://en.wikipedia.org/wiki/Java_version_history)

## License

These example programs are provided for educational purposes.
