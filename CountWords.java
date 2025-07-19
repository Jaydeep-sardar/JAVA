import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            String[] words = sentence.trim().split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
}
