import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
    
    static long factorial(int n) {
        if (n < 0) {
            return -1; // Factorial not defined for negative numbers
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
