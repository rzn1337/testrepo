public class Car extends Vehicle {



    public Car(String name, int model, int engine_capacity) {
        setName(name);
        setModel(model);
        setEngine_capacity(engine_capacity);
    }

    @Override
    public void start() {
        System.out.println(getName() + " is started!");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is stopped!");
    }
}
