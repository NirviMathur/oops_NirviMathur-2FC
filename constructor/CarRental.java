public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        totalCost = calculateTotalCost();
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.totalCost = other.totalCost;
    }

    private double calculateTotalCost() {
        double ratePerDay;

        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 2000;
                break;
            case "suv":
                ratePerDay = 3000;
                break;
            case "luxury":
                ratePerDay = 5000;
                break;
            default:
                ratePerDay = 1500;
        }

        return ratePerDay * rentalDays;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + totalCost);
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        r1.display();

        System.out.println();

        CarRental r2 = new CarRental("Alice", "SUV", 4);
        System.out.println("Rental 2 (Parameterized Constructor):");
        r2.display();

        System.out.println();

        CarRental r3 = new CarRental(r2);
        System.out.println("Rental 3 (Copy Constructor):");
        r3.display();
    }
}
