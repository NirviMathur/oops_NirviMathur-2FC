interface Vehicle {
    void displaySpeed();
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available for this vehicle.");
    }
}

class Car implements Vehicle {
    private int speed;

    Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void displaySpeed() {
        System.out.println("Car speed: " + speed + " km/h");
    }
}

class ElectricCar implements Vehicle {
    private int speed;
    private int batteryPercentage;

    ElectricCar(int speed, int batteryPercentage) {
        this.speed = speed;
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed() {
        System.out.println("Electric car speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery percentage: " + batteryPercentage + "%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle regularCar = new Car(80);
        Vehicle electricCar = new ElectricCar(90, 75);

        System.out.println("=== Regular Car ===");
        regularCar.displaySpeed();
        regularCar.displayBatteryPercentage(); 

        System.out.println("\n=== Electric Car ===");
        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}
