import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class SalesTracker {
    private ConcurrentHashMap<String, Integer> sales = new ConcurrentHashMap<>();
    private double totalSum = 0;

    public void addSale(String item, double price) {
        sales.put(item, sales.getOrDefault(item, 0) + 1);
        totalSum += price;
    }

    public void showAllSales() {
        System.out.println("Проданные товары:");
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue() + " шт.");
        }
    }

    public void printTotalSum() {
        System.out.println("Общая выручка: " + totalSum);
    }

    public void printMostPopular() {
        String popular = null;
        int max = 0;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                popular = entry.getKey();
            }
        }
        System.out.println("Самый популярный товар: " + popular + " - "+ max);
    }

    public static void main(String[] args) {
        SalesTracker tracker = new SalesTracker();
        tracker.addSale("Хлеб белый", 50.0);
        tracker.addSale("Лаваш", 60.0);
        tracker.addSale("Лепешка", 59.0);
        tracker.addSale("Хлеб черный", 55.0);
        tracker.addSale("Хлеб белый", 50.0);

        tracker.showAllSales();
        tracker.printTotalSum();
        tracker.printMostPopular();
    }
}