import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage("My Garage", new ArrayList<>());

        garage.addVehicle(new Car("Honda Civic", 2018, 1800));
        garage.addVehicle(new Motorcycle("Kawasaki Ninja H2R", 2015, 999));
        garage.addVehicle(new Truck("Hino Bandito", 2009, 5000));

//      garage.serviceAll();

        System.out.println(garage.getVehicles());
    }
}