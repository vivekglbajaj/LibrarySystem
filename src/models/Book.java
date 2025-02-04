package models;

public class Book {
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Initially, book is available
    }

    // Encapsulated methods (getters)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Methods to issue and return the book
    public void issueBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " has been returned.");
    }
}
