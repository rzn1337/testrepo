import java.util.ArrayList;

public class VendingMachine {
    private int max_capacity;
    private int current_capacity;
    private ArrayList<Item> items;

    public VendingMachine(int max_capacity, int current_capacity, ArrayList<Item> items) {
        this.max_capacity = max_capacity;
        this.current_capacity = current_capacity;
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
        current_capacity++;
    }

    public ArrayList<Item> getItemsList() {
        return items;
    }

}
