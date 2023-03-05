import java.util.ArrayList;

public class FoodVendingMachine extends VendingMachine {

    public FoodVendingMachine(int max_capacity, int current_capacity, ArrayList<Item> items) {
        super(max_capacity, current_capacity, items);
    }

    public ArrayList<Item> getItems() {
        return super.getItemsList();
    }

}
