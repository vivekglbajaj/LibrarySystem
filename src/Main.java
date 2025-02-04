import models.Book;
import models.Member;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        // Create a member
        Member member = new Member("Vivek Kumar");

        // Borrowing and returning books
        member.borrowBook(book1);
        member.borrowBook(book1); // Trying to borrow again
        member.returnBook(book1);
        member.borrowBook(book1);

        // Borrow another book
        member.borrowBook(book2);
    }
}
