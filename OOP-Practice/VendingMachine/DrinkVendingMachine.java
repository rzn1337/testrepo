import java.util.ArrayList;

public class DrinkVendingMachine extends FoodVendingMachine {

    public DrinkVendingMachine(int max_capacity, int current_capacity, ArrayList<Item> items) {
        super(max_capacity, current_capacity, items);
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> x = super.getItemsList();
        ArrayList<Item> drinks = new ArrayList<>();
        for (Item i: x) {
            if (i.getType() == 'd' || i.getType() == 'D') {
                drinks.add(i);
            }
        }
        return drinks;
    }
}
