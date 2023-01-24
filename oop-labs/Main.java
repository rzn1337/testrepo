package lab2;

public class Main {
    
    public static void main(String[] args) {
        
        // Book
        
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "1234567890", 309 );
        
        book1.summary();
        
        System.out.println();
        
        // Car
        
        Car[] cararray = new Car[3];
        
        cararray[0] = new Car("Ford", "Mustang", 2020, "Red", 4, 2);
        cararray[1] = new Car("Honda", "Civic", 2019, "White", 4, 4);
        cararray[2] = new Car("Tesla", "Model S", 2018, "Black", 4, 4);
        
        for (int i = 0; i < cararray.length; i++) {
            cararray[i].details();
            System.out.println();
        }
        
        // Pet&Person
        
        Pet pet = new Pet("Fido", "Labrador", 5 );
        Person person = new Person("John", 25, pet);
        person.getDetails();
    }
}
