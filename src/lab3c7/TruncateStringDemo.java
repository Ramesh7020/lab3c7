package lab3c7;
import java.util.Scanner;

public class TruncateStringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        String result = truncate(input, length);

        System.out.println("Truncated string: " + result);

        sc.close();
    }

    // User-defined function
    public static String truncate(String str, int maxLength) {

        if (str == null) return "";

        // If string is already short, return as it is
        if (str.length() <= maxLength) {
            return str;
        }

        // If maxLength is very small
        if (maxLength <= 3) {
            return str.substring(0, maxLength);
        }

        // Cut string and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }
}