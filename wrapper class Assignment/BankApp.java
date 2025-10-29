public class BankApp {
    public static double getRemainingLimit(Double limit) {
        if (limit == null) {
            return 0.0;
        }
        return limit.doubleValue();
    }

    public static void main(String[] args) {
        Double limitObj = 1000.50;
        Double nullLimit = null;
        double primitiveLimit = 500.25;

        System.out.println("Limit object: " + getRemainingLimit(limitObj));
        System.out.println("Null limit: " + getRemainingLimit(nullLimit));     
        System.out.println("Primitive limit: " + getRemainingLimit(primitiveLimit)); 
    }
}
