import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

interface DateUtils {

    static String formatDate(Date date, String formatType) {
        String pattern;

        switch (formatType.toLowerCase()) {
            case "short":
                pattern = "dd/MM/yy";
                break;
            case "medium":
                pattern = "dd-MMM-yyyy";
                break;
            case "long":
                pattern = "EEEE, dd MMMM yyyy";
                break;
            case "timestamp":
                pattern = "yyyy-MM-dd HH:mm:ss";
                break;
            default:
                pattern = "dd-MM-yyyy"; 
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}

// Main class
public class DateFormatUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Date Format Utility ===");
        System.out.println("Choose format type:");
        System.out.println("1. Short (dd/MM/yy)");
        System.out.println("2. Medium (dd-MMM-yyyy)");
        System.out.println("3. Long (EEEE, dd MMMM yyyy)");
        System.out.println("4. Timestamp (yyyy-MM-dd HH:mm:ss)");
        System.out.print("Enter your choice (1–4): ");
        int choice = sc.nextInt();

        String formatType = switch (choice) {
            case 1 -> "short";
            case 2 -> "medium";
            case 3 -> "long";
            case 4 -> "timestamp";
            default -> "default";
        };

        Date currentDate = new Date();

        String formattedDate = DateUtils.formatDate(currentDate, formatType);
        System.out.println("\nFormatted Date: " + formattedDate);

        sc.close();
    }
}
