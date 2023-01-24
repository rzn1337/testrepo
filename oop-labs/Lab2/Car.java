package lab2;

public class Car {
    
    public String make;
    public String model;
    public int year;
    public String color;
    public int wheels;
    public int doors;
    
    public Car (String make, String model, int year, String color, int wheels, int doors) {
        
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
        
    }
    
    public void details() {
        
        System.out.println("Make:" + make);
        System.out.println("Model :" + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Wheels:" + wheels);
        System.out.println("Doors: " + doors);
        
        
    }
    
}
