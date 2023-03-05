import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creating a Library
        Library lib1 = new Library(new ArrayList<>(), new ArrayList<>());

        //Creating Borrowers
        Borrower borrower1 = new Faculty("Tyrion Lannister", new ArrayList<>(), 'F');
        Borrower borrower2 = new Faculty("Ned Stark", new ArrayList<>(), 'F');
        Borrower borrower3 = new Faculty("Cersei Lannister", new ArrayList<>(), 'S');
        Borrower borrower4 = new Faculty("Arthur Dayne", new ArrayList<>(), 'S');
        Borrower borrower5 = new Faculty("Oberyn Martell", new ArrayList<>(), 'S');


        //Initializing Books
        Book book1 = new Book("Ugly Love", "1234567890123", "Colleen Hoover");
        Book book2 = new Book("Harry Potter and the Half-Blood Prince", "1234567890124", "J.K. Rowling");
        Book book3 = new Book("GOT: A Feast For Crows", "1234567890125", "George RR. Martin");
        Book book4 = new Book("Shadow and Bone", "1234567890126", "Leigh Bardugo");

        //Adding Books
        lib1.addBook(book1);
        lib1.addBook(book2);
        lib1.addBook(book3);
        lib1.addBook(book4);

        //Adding Borrowers
        lib1.addBorrower(borrower1);
        lib1.addBorrower(borrower2);
        lib1.addBorrower(borrower3);
        lib1.addBorrower(borrower4);
        lib1.addBorrower(borrower5);

        //Getting Book Info
        System.out.println(lib1.getBookInfo(book1));

        //Getting Borrower Info
        System.out.println(lib1.getBorrowerInfo(borrower3));

        //Getting Borrowers' List
        for (Borrower b : lib1.getBorrowersList()) {
            System.out.println(b);
        }

        //Getting Books' List
        for (Book b : lib1.getBooksList()) {
            System.out.println(b);
        }

        //Searching for Books
        lib1.searchBook("Ugly Love");
        lib1.searchBook("ABCD");

        //Searching for Borrowers
        lib1.searchBorrower("Tyrion Lannister");
        lib1.searchBorrower("Andrew Tate");

        //Lending a Book
        lib1.lendBook(book2, borrower1);

        //Returning a Book
        lib1.returnBook(book2, borrower1);

        //Removing a Book
        lib1.removeBook(book1);

        //Removing a Borrower
        lib1.removeBorrower(borrower5);

        //Verifying
        System.out.println(lib1.getBooksList());
        System.out.println(lib1.getBorrowersList());
    }
}