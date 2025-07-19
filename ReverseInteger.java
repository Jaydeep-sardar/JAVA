import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            int reversed = 0;
            int temp = num;
            while (temp != 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }
            System.out.println("Reversed integer: " + reversed);
        }
    }
}
