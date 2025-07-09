import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String reversed = reverse(str);
            System.out.println("Reversed string: " + reversed);
        }
    }

    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
