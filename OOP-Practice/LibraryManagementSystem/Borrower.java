import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowed_books;
    private char type;

    public Borrower(String name, ArrayList<Book> borrowed_books, char type) {
        this.borrowed_books = borrowed_books;
        this.name = name;
        this.type = type;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowed_books;
    }

    public void addBorrowedBooks(Book book) {
        borrowed_books.add(book);
    }

    public void removeBorrowedBooks(Book book) {
        borrowed_books.remove(book);
    }

    public String getName() {
        return name;
    }

    public String searchBorrowedBook(Book book) {
        for (Book b : borrowed_books) {
            if (b.equals(book)) {
                return (b.getTitle() + " is with " + name + " currently.");
            } else {
                return (b.getTitle() + " is not with " + name + " currently.");
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", borrowed_books=" + borrowed_books +
                ", type=" + type +
                '}';
    }
}
