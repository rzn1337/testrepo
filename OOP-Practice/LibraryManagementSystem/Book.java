public class Book {
    private String title;
    private String isbn;
    private String author;
    private char status;

    public Book(String title, String isbn, String author) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        status = 'A';
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}
