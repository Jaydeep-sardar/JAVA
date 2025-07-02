import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);  // For 3-digit numbers
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
