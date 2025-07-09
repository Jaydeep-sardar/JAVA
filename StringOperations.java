import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            // String operations
            System.out.println("\n--- String Operations ---");
            System.out.println("Original string: " + str);
            System.out.println("Length: " + str.length());
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());
            System.out.println("First character: " + str.charAt(0));
            System.out.println("Last character: " + str.charAt(str.length() - 1));
            
            // Substring
            if (str.length() >= 3) {
                System.out.println("Substring (0 to 3): " + str.substring(0, 3));
            }
            
            // Check operations
            System.out.print("Enter another string to compare: ");
            String str2 = sc.nextLine();
            System.out.println("Are equal? " + str.equals(str2));
            System.out.println("Contains '" + str2 + "'? " + str.contains(str2));
            
            // Replace operation
            System.out.print("Enter character to replace: ");
            char oldChar = sc.next().charAt(0);
            System.out.print("Enter new character: ");
            char newChar = sc.next().charAt(0);
            System.out.println("After replacement: " + str.replace(oldChar, newChar));
        }
    }
}
