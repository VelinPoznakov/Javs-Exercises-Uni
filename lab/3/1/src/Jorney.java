public abstract class Jorney {
    double distance;
    int days;
    double price;

    public Jorney(double distance, int days, double price) {
        setDistance(distance);
        setDays(days);
        setPrice(price);
    }

    abstract double fixPrice(double price);

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
