import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String result = removeVowels(str);
            System.out.println("String after removing vowels: " + result);
        }
    }

    static String removeVowels(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}
