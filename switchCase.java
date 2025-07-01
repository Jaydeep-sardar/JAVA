import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a day number (1-7): ");
            int day = sc.nextInt();

            String dayName = switch (day) {
                case 1 -> "Sunday";
                case 2 -> "Monday";
                case 3 -> "Tuesday";
                case 4 -> "Wednesday";
                case 5 -> "Thursday";
                case 6 -> "Friday";
                case 7 -> "Saturday";
                default -> "Invalid day number.";
            };
            System.out.println(dayName);
        }
    }
}