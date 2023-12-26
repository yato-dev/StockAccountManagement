import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

    private List<Stock> stocks;

    public StockPortfolio() {
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        System.out.println("Stock Report:");
        for (Stock stock : stocks) {
            System.out.println("Stock Name: " + stock.getStockName());
            System.out.println("Number of Shares: " + stock.getNumberOfShares());
            System.out.println("Share Price: $" + stock.getSharePrice());
            System.out.println("Stock Value: $" + stock.calculateStockValue());
        }
        System.out.println("Total Portfolio Value: $" + calculateTotalValue());
    }

}
