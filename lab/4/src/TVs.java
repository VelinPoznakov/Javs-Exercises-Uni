public class TVs extends Stocks implements ElectricalAppliance{
    public String manifacture;
    public String model;
    public int power;

    public TVs(double price, String stockNumber, String manifacture,
               String model, int power) throws PriceExeption {
        super(price, stockNumber);
        this.manifacture = manifacture;
        this.model = model;
        this.power = power;
    }

    @Override
    public double checkPromo(double promo) {
        return getPrice() - (getPrice() * promo);
    }

    @Override
    public double energyConsumption(int hours) {
        if(hours < 0) {
            throw new PowerExeption("Hours cannot be negative");
        }
        return hours * this.power;
    }
}
