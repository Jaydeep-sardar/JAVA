import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
            if (second == Integer.MIN_VALUE)
                System.out.println("No second largest element.");
            else
                System.out.println("Second largest: " + second);
        }
    }
}
