public class Drink extends Item{

    public Drink(String name, double price, int quantity_available, char type) {
        super(name, price, quantity_available, type);
    }

    @Override
    public String getInfo() {
        return ("Name: " + super.getName() + ", Price: " + super.getPrice() + ", Quantity Available: " + super.getQuantity_available() + ", Type: " + super.getType());
    }

}
