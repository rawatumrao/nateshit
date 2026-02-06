package advanced;

import java.io.*;

/**
 * FileHandling - Demonstrates file I/O operations
 * Concepts: reading files, writing files, BufferedReader, FileWriter
 */
public class FileHandling {
    public static void main(String[] args) {
        String filename = "example.txt";
        
        // Writing to a file
        System.out.println("1. Writing to file:");
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, World!\n");
            writer.write("This is a Java file handling example.\n");
            writer.write("Writing to files is easy in Java.\n");
            System.out.println("Data written to file successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Reading from a file
        System.out.println("\n2. Reading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        // Check if file exists
        System.out.println("\n3. File operations:");
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File exists: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Absolute path: " + file.getAbsolutePath());
        }
        
        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
    }
}
