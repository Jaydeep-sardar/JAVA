import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
