import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            int vowels = 0, consonants = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = Character.toLowerCase(str.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }
}
