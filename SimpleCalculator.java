import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);
            double result;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': result = b != 0 ? a / b : Double.NaN; break;
                default: System.out.println("Invalid operator"); return;
            }
            System.out.println("Result: " + result);
        }
    }
}
