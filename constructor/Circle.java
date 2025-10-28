public class Circle {
    private double radius;

    public Circle() {
        this(1.0); 
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1 details:");
        c1.display();

        System.out.println();
        Circle c2 = new Circle(5.5);
        System.out.println("Circle 2 details:");
        c2.display();
    }
}
