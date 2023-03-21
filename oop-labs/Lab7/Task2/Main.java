package Task2;

public class Main {

    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Leigh", "leigh@yahoo.com", 'F');
        authors[1] = new Author("George", "george@ilovedaenerys.com", 'M');

        Book book = new Book("A Clash of Kings", authors, 9.99, 10);

        System.out.println(book.toString());

    }
}
