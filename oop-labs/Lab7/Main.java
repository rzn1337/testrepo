package Task3;


public class Main {

    public static void main(String[] args) {

        Mammal platypus1 = new Platypus();
        Platypus platypus2 = new Platypus();

        Flyer bat1 = new Bat();
        Bat bat2 = new Bat();

        Flyer chimera1 = new Chimera();
        WaterBreather chimera2 = new Chimera();
        EggLayer chimera3 = new Chimera();
        MilkProvider chimera4 = new Chimera();

        platypus1.givesMilk();
        platypus2.givesMilk();

        // platypus1.laysEggs();
        platypus2.laysEggs();

        bat1.flies();
        bat2.flies();

        chimera1.flies();
        chimera2.waterBreathing();
        chimera3.laysEggs();
        chimera4.givesMilk();

    }
}
