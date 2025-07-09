import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();
            
            int[][] arr = new int[rows][cols];
            
            // Input elements
            System.out.println("Enter elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    arr[i][j] = sc.nextInt();
                }
            }
            
            // Display 2D array
            System.out.println("\n2D Array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
