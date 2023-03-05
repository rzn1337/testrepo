import java.util.ArrayList;

public class Garage {

    private String garage_name;

    private ArrayList<Vehicle> vehicles;

    public Garage(String garage_name, ArrayList<Vehicle> vehicles) {
        this.garage_name = garage_name;
        this.vehicles = vehicles;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void serviceAll() {
        for (Vehicle v : vehicles) {
            v.start();
            v.stop();
            System.out.println(v.getName() + " serviced!");
        }
    }

    public String getGarage_name() {
        return garage_name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
