import java.util.Scanner;

interface SecurityUtils {

    static boolean isStrongPassword(String password) {
                if (password.length() < 8)
            return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password!");
        } else {
            System.out.println("Weak password! Must contain:");
            System.out.println("   - Minimum 8 characters");
            System.out.println("   - At least 1 uppercase letter");
            System.out.println("   - At least 1 lowercase letter");
            System.out.println("   - At least 1 digit");
            System.out.println("   - At least 1 special character");
        }

        sc.close();
    }
}
