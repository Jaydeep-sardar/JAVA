import java.util.Scanner;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int largest = arr[0], smallest = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > largest) largest = arr[i];
                if (arr[i] < smallest) smallest = arr[i];
            }
            System.out.println("Largest element: " + largest);
            System.out.println("Smallest element: " + smallest);
        }
    }
}
