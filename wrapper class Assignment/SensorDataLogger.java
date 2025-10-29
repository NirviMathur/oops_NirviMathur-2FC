public class SensorDataLogger {
    public static void logTemperature(Double temp) {
        if (temp == null) {
            System.out.println("No temperature data received.");
        } else {
            double temperature = temp;
            System.out.println("Logged temperature: " + temperature);
        }
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double wrapperTemp = 37.2;
        Double nullTemp = null;

        logTemperature(primitiveTemp);
        logTemperature(wrapperTemp);
        logTemperature(nullTemp);
    }
}
