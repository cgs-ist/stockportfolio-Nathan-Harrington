import java.util.*;
public class StockPortfolio {
    private HashMap <Stock, Integer> portfolio = new HashMap<Stock, Integer>();
    public StockPortfolio(){

    }

    public void addStock (Stock stock, int quantity){
        portfolio.put(stock, quantity);
    }

    public void viewPortfolio(){
        for(Stock stock : portfolio.keySet()){
            System.out.println("Stock: " + stock.getName() + " Ticker: " + stock.getTicker() + " Price: " + stock.getPrice()  + " Quantity: " + portfolio.get(stock) + "\n");
        }
    }


}
