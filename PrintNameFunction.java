import java.util.Scanner;

public class PrintNameFunction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            printName(name);
        }
    }
    
    static void printName(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
