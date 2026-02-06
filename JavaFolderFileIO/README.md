# JavaFolderFileIO

This folder contains a Java program that demonstrates folder and file I/O operations.

## FolderFileCreator.java

A Java program that creates a folder structure with 3 depth levels and creates 2 files in each folder.

### Features
- Creates a base folder named "folder-tree"
- Creates a nested folder structure with 3 levels deep
- Creates 2 text files in each folder
- Each file contains metadata about its location and depth level

### Usage

1. Compile the program:
```bash
javac FolderFileCreator.java
```

2. Run the program:
```bash
java FolderFileCreator
```

### Output Structure

The program creates the following structure:
```
folder-tree/
├── file1.txt
├── file2.txt
└── folder-tree-level1/
    ├── file1.txt
    ├── file2.txt
    └── folder-tree-level2/
        ├── file1.txt
        └── file2.txt
```

Each file contains:
- File identification
- Folder path
- Depth level
- Creator information
