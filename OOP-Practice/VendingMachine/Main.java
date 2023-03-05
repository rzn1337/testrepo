import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FoodVendingMachine fvm = new FoodVendingMachine(10, 0, new ArrayList<>());

        DrinkVendingMachine dvm = new DrinkVendingMachine(8, 0, new ArrayList<>());

        Item item1 = new Snack("Mars", 200.0, 2, 's');
        Item item2 = new Candy("Fanty", 50.0, 4, 'c');
        Item item3 = new Drink("Pepsi", 100.0, 2, 'd');
        Item item4 = new Drink("Coca-Cola", 150.0, 1, 'd');

        fvm.addItem(item1);
        fvm.addItem(item2);
        dvm.addItem(item3);
        dvm.addItem(item4);

        for (Item i : fvm.getItems()) {
            System.out.println(i.getInfo() + "\n");
        }

        for (Item i : dvm.getItems()) {
            System.out.println(i.getInfo() + "\n");
        }



    }
}