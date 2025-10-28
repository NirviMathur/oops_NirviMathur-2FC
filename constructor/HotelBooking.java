public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 (Default Constructor):");
        booking1.display();

        System.out.println();

        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Booking 2 (Parameterized Constructor):");
        booking2.display();

        System.out.println();

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 (Copy Constructor):");
        booking3.display();
    }
}
