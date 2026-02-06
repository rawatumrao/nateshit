package basics;

/**
 * Loops - Demonstrates different types of loops
 * Concepts: for loop, while loop, do-while loop, enhanced for loop
 */
public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // While loop
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }
        
        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while (k <= 5);
        
        // Enhanced for loop (for-each)
        System.out.println("\nEnhanced for loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
