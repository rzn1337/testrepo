package Task3;

public class Chimera implements WaterBreather, Flyer, EggLayer, MilkProvider {

    @Override
    public void givesMilk() {
        System.out.println("Milk my Chimera");
    }

    @Override
    public void flies() {
        System.out.println("Chimera can't fly");
    }

    @Override
    public void laysEggs() {
        System.out.println("Chimera Eggos");
    }

    @Override
    public void waterBreathing() {
        System.out.println("Chimera breathes underwater");
    }
}
