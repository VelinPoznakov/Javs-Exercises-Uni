public class HoverCraft extends Vehicle implements IsLandVehicle{
    public int countPassengers;

    public HoverCraft(int maxSpeed, String model, double price, int countPassengers) {
        super(maxSpeed, model, price);
        this.countPassengers = countPassengers;
    }

    @Override
    public void enterLand() {
        System.out.println("Land entered");
    }

    @Override
    public double checkPromo() {
        return this.price += this.price * 0.03;
    }
}
