import java.util.Scanner;

interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}

public class UnitConversionTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Unit Conversion Tool ====");
        System.out.println("1. Km → Miles");
        System.out.println("2. Miles → Km");
        System.out.println("3. Kg → Lbs");
        System.out.println("4. Lbs → Kg");
        System.out.print("Choose an option (1–4): ");
        int choice = sc.nextInt();

        double input, result;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                input = sc.nextDouble();
                result = UnitConverter.kmToMiles(input);
                System.out.println(input + " km = " + result + " miles");
                break;
            case 2:
                System.out.print("Enter distance in miles: ");
                input = sc.nextDouble();
                result = UnitConverter.milesToKm(input);
                System.out.println(input + " miles = " + result + " km");
                break;
            case 3:
                System.out.print("Enter weight in kilograms: ");
                input = sc.nextDouble();
                result = UnitConverter.kgToLbs(input);
                System.out.println(input + " kg = " + result + " lbs");
                break;
            case 4:
                System.out.print("Enter weight in pounds: ");
                input = sc.nextDouble();
                result = UnitConverter.lbsToKg(input);
                System.out.println(input + " lbs = " + result + " kg");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
