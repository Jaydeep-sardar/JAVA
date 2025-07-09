import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int result = multiply(num1, num2);
            System.out.println("Product: " + result);
        }
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
}
