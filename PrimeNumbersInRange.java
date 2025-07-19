import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter lower bound: ");
            int low = sc.nextInt();
            System.out.print("Enter upper bound: ");
            int high = sc.nextInt();
            System.out.print("Prime numbers: ");
            for (int i = low; i <= high; i++) {
                if (isPrime(i)) System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
