public class Stock {
    private String ticker;
    private String name;
    private double price;

    public Stock(String ticker, String name, double price){
        this.ticker = ticker;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getTicker() {
        return ticker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
