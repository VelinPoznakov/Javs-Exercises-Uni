public class Trip extends Jorney implements CountNights {
    public int countHotels;

    public Trip(double distance, int days, double price, int countHotels) {
        super(distance, days, price);
        setCountHotels(countHotels);
    }

    @Override
    public int countDays(){
        return days - 2;
    }

    @Override
    public double fixPrice(double price) {
        return this.price += (price *0.1);
    }

    public void setCountHotels(int countHotels) {
        this.countHotels = countHotels;
    }

    public int getCountHotels() {
        return countHotels;
    }
}
