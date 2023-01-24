package lab2;

public class Person {

    public String Name;
    public int Age;
    Pet pet;
    
    public Person(String Name, int Age, Pet pet) {
        
        this.Name = Name;
        this.Age = Age;
        this.pet = pet;
        
    }
    
    public void getDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        pet.getDetails();
    }
    
    
}
