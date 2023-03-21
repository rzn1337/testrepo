package Task3;

public class Platypus extends Mammal implements EggLayer{

    @Override
    public void laysEggs() {
        System.out.println("Platy Eggos");
    }

    @Override
    public void givesMilk() {
        System.out.println("Milk my Platypus");
    }
}
