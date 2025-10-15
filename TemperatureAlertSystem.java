import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double threshold = 37.5;
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        System.out.print("Enter current temperature (°C): ");
        double currentTemp = sc.nextDouble();

        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! Temperature is above threshold.");
        } else {
            System.out.println("Temperature is normal.");
        }

        sc.close();
    }
}
