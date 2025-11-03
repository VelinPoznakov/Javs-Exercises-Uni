public class Car extends Vehicle implements IsLandVehicle{
    public int kw;

    public Car(int maxSpeed, String model, double price, int kw) {
        super(maxSpeed, model, price);
        this.kw = kw;
    }

    @Override
    public void enterLand() {
        System.out.println("Land entered");
    }

    @Override
    public double checkPromo() {
        return this.price += this.price * 0.2;
    }
}
