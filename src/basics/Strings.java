package basics;

/**
 * Strings - Demonstrates String operations and methods
 * Concepts: String manipulation, common String methods
 */
public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // String concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);
        
        // String length
        System.out.println("Length of '" + str1 + "': " + str1.length());
        
        // Character at index
        System.out.println("Character at index 1: " + str1.charAt(1));
        
        // Substring
        String text = "Java Programming";
        System.out.println("Substring: " + text.substring(0, 4));
        
        // To uppercase and lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // String comparison
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
        
        // String contains
        System.out.println("Contains 'Java': " + text.contains("Java"));
        
        // String replace
        System.out.println("Replace: " + text.replace("Programming", "Language"));
    }
}
