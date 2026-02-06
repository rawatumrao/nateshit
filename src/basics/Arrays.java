package basics;

/**
 * Arrays - Demonstrates array declaration and operations
 * Concepts: single-dimensional arrays, multi-dimensional arrays
 */
public class Arrays {
    public static void main(String[] args) {
        // Single-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Single-dimensional array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Array initialization
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        
        System.out.println("\nString array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("\nMulti-dimensional array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
