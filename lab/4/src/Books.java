import java.text.AttributedCharacterIterator;

public class Books extends Stocks{
    public String autor;
    public String title;

    public Books(double price, String stockNumber, String autor, String title) throws PriceExeption {
        super(price, stockNumber);
        this.autor = stockNumber;
        this.title = title;
    }

    @Override
    public double checkPromo(double promo) {
        return getPrice() - (getPrice() * promo);
    }
}
