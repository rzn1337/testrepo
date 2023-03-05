import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;

    public Library(ArrayList<Book> books, ArrayList<Borrower> borrowers) {
        this.books = books;
        this.borrowers = borrowers;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    public void removeBorrower(Borrower borrower) {
        borrowers.remove(borrower);
    }

    public void lendBook(Book book, Borrower borrower) {
        books.remove(book);
        borrower.addBorrowedBooks(book);
        book.setStatus('B');
        borrowers.add(borrower);
    }

    public void returnBook(Book book, Borrower borrower) {
        books.add(book);
        borrower.removeBorrowedBooks(book);
        book.setStatus('A');
        borrowers.remove(borrower);
    }

    public ArrayList<Borrower> getBorrowersList() {
        return borrowers;
    }

    public ArrayList<Book> getBooksList() {
        return books;
    }

    public Book getBookInfo(Book book) {
        return book;
    }

    public Borrower getBorrowerInfo(Borrower borrower) {
        return borrower;
    }

    public void searchBook(String title) {
        boolean flag = false;
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                System.out.println(title + " is Available!");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(title + " isn't Available!");
        }
    }

    public void searchBorrower(String name) {
        boolean flag = false;
        for (Borrower b : borrowers) {
            if (b.getName().equals(name)) {
                System.out.println(name + " exists!");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(name + " doesn't exist!");
        }
    }
}
