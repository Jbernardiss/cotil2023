import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock("Impressora", 13, 6);
        Stock stock2 = new Stock("Monitor", 11, 13);
        Stock stock3 = new Stock("Mouse", 6, 2);

        stock1.subStock(5); // a
        stock2.restock(7); // b
        stock3.subStock(4); // c

        System.out.println("Needs restock:"); //d
        System.out.println("Stock 1: " + stock1.needsRestock());
        System.out.println("Stock 2: " + stock2.needsRestock());
        System.out.println("Stock 3: " + stock3.needsRestock());
        System.out.println();
        System.out.println(stock1.showStock()); //e
        System.out.println(stock2.showStock());
        System.out.println(stock3.showStock());
    }
}