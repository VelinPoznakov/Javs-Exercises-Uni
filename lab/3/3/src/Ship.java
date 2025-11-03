public class Ship extends Vehicle implements IsSeaVessel{
    public int deadWeight;

    public Ship(int maxSpeed, String model, double price, int deadWeight) {
        super(maxSpeed, model, price);
        this.deadWeight = deadWeight;
    }

    @Override
    public void enterSea() {
        System.out.println("Ship entered sea!");
    }

    @Override
    public double checkPromo() {
        return this.price += this.price * 0.003;
    }
}
