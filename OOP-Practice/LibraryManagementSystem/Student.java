import java.util.ArrayList;

public class Student extends Borrower{

    public Student(String name, ArrayList<Book> borrowed_books, char type) {
        super(name, borrowed_books, type);
    }
}
