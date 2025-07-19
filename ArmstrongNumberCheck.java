import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }

    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }
}
