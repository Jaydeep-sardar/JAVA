import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (i == 1 || i == rows || j == 1 || j == cols) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
