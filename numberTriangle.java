public class numberTriangle {
    public static void main(String[] args) {
        int count = 1;
        int rows = 5; // You can change this value for more or fewer rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
