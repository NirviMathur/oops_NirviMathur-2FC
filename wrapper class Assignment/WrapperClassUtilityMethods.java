public class WrapperClassUtilityMethods {
    public static void main(String[] args) {
        int intValue = Integer.parseInt("123");
        double doubleValue = Double.parseDouble("3.14");
        boolean boolValue = Boolean.parseBoolean("true");
        String binaryValue = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upperCase = Character.toUpperCase('a');

        System.out.println( intValue);
        System.out.println(doubleValue);
        System.out.println(boolValue);
        System.out.println(binaryValue);
        System.out.println(isDigit);
        System.out.println(upperCase);
    }
}
