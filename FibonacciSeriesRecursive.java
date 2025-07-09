import java.util.Scanner;

public class FibonacciSeriesRecursive {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            
            System.out.println("Fibonacci series till " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        }
    }
    
    static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
