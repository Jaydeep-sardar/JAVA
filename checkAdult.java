import java.util.Scanner;

public class checkAdult {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Person is an adult.");
            } else {
                System.out.println("Person is not an adult.");
                    }
                }
            }
        }