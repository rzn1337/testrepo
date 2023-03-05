public class Truck extends Vehicle {
    private String name;
    private String model;
    private String engine_capacity;
    private boolean state;

    public Truck(String name, int model, int engine_capacity) {
        setName(name);
        setModel(model);
        setEngine_capacity(engine_capacity);
    }

    @Override
    public void start() {
        System.out.println(getName() + " is started!");
        state = true;
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is stopped!");
        state = false;
    }

    public void unload() {
        if (!state) {
            System.out.println(getName() + " unloaded!");
        }
    }
}
