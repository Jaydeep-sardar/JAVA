public class RecursivePrint {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 5 to 1 using recursion:");
        printNumbers(5);
    }
    
    static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        
        // Print current number
        System.out.println(n);
        
        // Recursive call with n-1
        printNumbers(n - 1);
    }
}
