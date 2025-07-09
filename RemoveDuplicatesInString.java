import java.util.Scanner;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String result = removeDuplicates(str);
            System.out.println("String after removing duplicates: " + result);
        }
    }

    static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // For ASCII characters
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }
}
