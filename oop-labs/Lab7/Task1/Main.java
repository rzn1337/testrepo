package Task1;

public class Main {

    public static void main(String[] args) {

        Author a = new Author("Gillian FLynn", "gflynn@bloomsbury.com", 'F');
        Book b = new Book("Gone Girl", a, 46.4, 4);
        System.out.println("Book Dteails:");
        System.out.println(b.toString());
        System.out.println("Author Details:");
        System.out.println(a.toString());
    }
}
