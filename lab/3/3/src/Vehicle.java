public abstract class Vehicle {
    protected int maxSpeed;
    protected String model;
    protected double price;

    public Vehicle(int maxSpeed, String model, double price) {
        setMaxSpeed(maxSpeed);
        setModel(model);
        setPrice(price);
    }

    public abstract double checkPromo();

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
