 package models;

public class Member {
    private String name;

    // Constructor
    public Member(String name) {
        this.name = name;
    }

    // Encapsulated method (getter)
    public String getName() {
        return name;
    }

    // Borrow a book
    public void borrowBook(models.Book book) {
        if (book.isAvailable()) {
            book.issueBook();
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already issued.");
        }
    }

    // Return a book
    public void returnBook(models.Book book) {
        book.returnBook();
        System.out.println(name + " returned the book: " + book.getTitle());
    }
}
