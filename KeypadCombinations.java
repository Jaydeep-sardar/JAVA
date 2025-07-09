import java.util.*;

public class KeypadCombinations {
    static String[] KEYPAD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter digits: ");
            String digits = sc.nextLine();
            System.out.println("Possible combinations:");
            printCombinations(digits, 0, "");
        }
    }

    static void printCombinations(String digits, int idx, String combination) {
        if (idx == digits.length()) {
            System.out.println(combination);
            return;
        }
        char digit = digits.charAt(idx);
        if (digit < '0' || digit > '9' || KEYPAD[digit - '0'].isEmpty()) {
            printCombinations(digits, idx + 1, combination);
            return;
        }
        String letters = KEYPAD[digit - '0'];
        for (int i = 0; i < letters.length(); i++) {
            printCombinations(digits, idx + 1, combination + letters.charAt(i));
        }
    }
}
