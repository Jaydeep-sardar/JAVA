import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num > 0) {
                System.out.println(num + " is positive.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
