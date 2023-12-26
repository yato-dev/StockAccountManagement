import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();
        scanner.nextLine();

        StockPortfolio stockPortfolio = new StockPortfolio();

        for (int i = 0; i < numStocks; i++) {
            System.out.println("\nEnter details for Stock " + (i + 1) + ":");
            System.out.print("Enter Stock Name: ");
            String stockName = scanner.nextLine();
            System.out.print("Enter Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Enter Share Price: $");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine();

            Stock stock = new Stock(stockName, numberOfShares, sharePrice);
            stockPortfolio.addStock(stock);
        }

        stockPortfolio.printStockReport();

        scanner.close();
    }
}
