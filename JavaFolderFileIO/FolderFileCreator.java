/**
 * FolderFileCreator.java
 * Program to create a folder structure with 3 depth levels
 * and create 2 files in each folder
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FolderFileCreator {
    
    public static void main(String[] args) {
        // Base folder name
        String baseFolderName = "Folder-free";
        
        try {
            // Create folder structure with 3 depth levels
            createFolderStructure(baseFolderName, 3, 0);
            System.out.println("Folder structure created successfully!");
        } catch (IOException e) {
            System.err.println("Error creating folder structure: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Recursively creates folder structure with specified depth
     * and creates 2 files in each folder
     * 
     * @param folderName Name of the folder to create
     * @param maxDepth Maximum depth of folder structure
     * @param currentDepth Current depth level (starts at 0)
     * @throws IOException if file/folder creation fails
     */
    private static void createFolderStructure(String folderName, int maxDepth, int currentDepth) throws IOException {
        // Create the folder
        File folder = new File(folderName);
        if (!folder.exists()) {
            if (folder.mkdirs()) {
                System.out.println("Created folder: " + folderName);
            } else {
                throw new IOException("Failed to create folder: " + folderName);
            }
        }
        
        // Create 2 files in the current folder
        for (int i = 1; i <= 2; i++) {
            String fileName = folderName + File.separator + "file" + i + ".txt";
            File file = new File(fileName);
            
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("This is file " + i + " in folder: " + folderName + "\n");
                writer.write("Depth level: " + currentDepth + "\n");
                writer.write("Created by FolderFileCreator program\n");
                System.out.println("Created file: " + fileName);
            }
        }
        
        // If we haven't reached max depth, create a subfolder
        if (currentDepth < maxDepth - 1) {
            String subFolderName = folderName + File.separator + "Folder-free-level" + (currentDepth + 1);
            createFolderStructure(subFolderName, maxDepth, currentDepth + 1);
        }
    }
}
