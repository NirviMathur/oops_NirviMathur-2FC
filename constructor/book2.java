public class book2 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public book2() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        available = true;
    }

    public book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed successfully!");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " has been returned and is now available.");
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        book2 b1 = new book2("The Great Gatsby", "F. Scott Fitzgerald", 299.0, true);

        System.out.println("Book Details:");
        b1.display();
        System.out.println();

        b1.borrowBook();
        System.out.println();

        b1.borrowBook();
        System.out.println();
        b1.returnBook();
        System.out.println();
        b1.display();
    }
}
