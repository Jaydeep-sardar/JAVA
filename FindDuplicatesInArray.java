import java.util.Scanner;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            boolean found = false;
            System.out.print("Duplicate elements: ");
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        found = true;
                        break;
                    }
                }
            }
            if (!found) System.out.print("None");
            System.out.println();
        }
    }
}
