public class multiplyAndFactorial {
    public static void main(String[] args) {
        int a = 5, b = 3; // Change numbers as needed
        int product = multiply(a, b);
        int factA = factorial(a);
        int factB = factorial(b);
        System.out.println("Product: " + product);
        System.out.println("Factorial of " + a + ": " + factA);
        System.out.println("Factorial of " + b + ": " + factB);
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
