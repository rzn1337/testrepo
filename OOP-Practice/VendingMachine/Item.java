public abstract class Item {
    private String name;
    private double price;
    private int quantity_available;
    private char type;

    public Item(String name, double price, int quantity_available, char type) {
        this.name = name;
        this.price = price;
        this.quantity_available = quantity_available;
        this.type = type;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setQuantity_available(int quantity_available) {
//        this.quantity_available = quantity_available;
//    }

    public double getPrice() {
        return price;
    }

    public int getQuantity_available() {
        return quantity_available;
    }

    public String getName() {
        return name;
    }

    public char getType() {
        return type;
    }

    public abstract String getInfo();
}
