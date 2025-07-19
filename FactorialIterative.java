import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            long fact = 1;
            for (int i = 2; i <= n; i++) fact *= i;
            System.out.println("Factorial: " + fact);
        }
    }
}
