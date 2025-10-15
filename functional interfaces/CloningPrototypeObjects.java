class Vehicle implements Cloneable {
    private String type;
    private int speed;

    Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    public void displayInfo() {
        System.out.println("Vehicle Type: " + type + ", Speed: " + speed + " km/h");
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) {
        try {
            Vehicle car = new Vehicle("Car", 100);
            System.out.println("Original Vehicle:");
            car.displayInfo();

            Vehicle clonedCar = (Vehicle) car.clone();
            System.out.println("\nCloned Vehicle:");
            clonedCar.displayInfo();

            System.out.println("\nAfter modifying cloned vehicle:");
            Vehicle modifiedClone = new Vehicle(clonedCar.getType(), 120); // new speed
            modifiedClone.displayInfo();
            System.out.println("Original remains unchanged:");
            car.displayInfo();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}
