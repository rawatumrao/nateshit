package basics;

/**
 * ControlFlow - Demonstrates control flow statements
 * Concepts: if-else, else-if, switch-case
 */
public class ControlFlow {
    public static void main(String[] args) {
        // If-else statement
        int number = 15;
        if (number > 10) {
            System.out.println(number + " is greater than 10");
        } else {
            System.out.println(number + " is less than or equal to 10");
        }
        
        // Else-if ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        
        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
