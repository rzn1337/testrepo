public abstract class Vehicle {

    private String name;
    private int model;
    private int engine_capacity;

    public abstract void start();
    public abstract void stop();

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setEngine_capacity(int engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public int getEngine_capacity() {
        return engine_capacity;
    }

    public int getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return ("Name: " + name + "\n" + "Model: " + model + "\n" + "Engine Capacity: " + engine_capacity + "\n\n\n");
    }

}
