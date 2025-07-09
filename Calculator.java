import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Simple Calculator ===");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result = 0;
            boolean validOperation = true;
            
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = divide(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero!");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        }
    }
    
    static double add(double a, double b) {
        return a + b;
    }
    
    static double subtract(double a, double b) {
        return a - b;
    }
    
    static double multiply(double a, double b) {
        return a * b;
    }
    
    static double divide(double a, double b) {
        return a / b;
    }
}
