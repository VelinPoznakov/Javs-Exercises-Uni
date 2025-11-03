public abstract class Stocks {
    private double price;
    private String stockNumber;

    public Stocks(double price, String stockNumber) throws PriceExeption{
        setPrice(price);
        setStockNumber(stockNumber);
    }

    public abstract double checkPromo(double promo);


    public void setPrice(double price) throws PriceExeption{
        if(price < 0) {
            throw new PriceExeption("Price cannot be negative");
        }

        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockNumber() {
        return stockNumber;
    }
}
