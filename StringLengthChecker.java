import java.util.function.Function;
import java.util.Scanner;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Function<String, Integer> getLength = str -> str.length();

        int limit = 20;

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        int length = getLength.apply(message);

        System.out.println("Message length: " + length);

        if (length > limit) {
            System.out.println("Message exceeds the " + limit + "-character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }

        sc.close();
    }
}
