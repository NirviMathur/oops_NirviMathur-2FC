// Base class
public class Book3 {
    public String ISBN;     
    protected String title; 
    private String author; 
    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book ISBN (Public): " + ISBN);
        System.out.println("E-Book Title (Protected): " + title); 
        System.out.println("E-Book Author (Private via getter): " + getAuthor());
        System.out.println("File Size: " + fileSizeMB + " MB");
    }

    public static void main(String[] args) {
        Book3 b1 = new Book3("978-81-265-1234-5", "Java Programming", "Herbert Schildt");
        System.out.println("=== Book Details ===");
        b1.displayBookDetails();

        System.out.println();
        b1.setAuthor("James Gosling");
        System.out.println("After Updating Author:");
        b1.displayBookDetails();

        System.out.println("\n=== EBook Details ===");
        EBook e1 = new EBook("978-81-265-5678-9", "Effective Java", "Joshua Bloch", 2.5);
        e1.displayEBookDetails();
    }
}
