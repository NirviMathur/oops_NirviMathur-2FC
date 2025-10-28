public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Book 1 details:");
        b1.display();

        System.out.println();

        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.50);
        System.out.println("Book 2 details:");
        b2.display();
    }
}
