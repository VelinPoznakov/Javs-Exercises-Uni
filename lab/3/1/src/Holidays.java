public class Holidays extends Jorney {
    public String hotelName;

    public Holidays(double distance, int days, double price, String hotelName) {
        super(distance, days, price);
        setHotelName(hotelName);
    }

    @Override
    public double fixPrice(double price) {
        return this.price += (price * 0.4);
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }
}
