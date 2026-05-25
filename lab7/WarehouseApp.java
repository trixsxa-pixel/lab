import java.util.concurrent.CountDownLatch;

class Product {
    private int weight;
    public Product(int weight) { this.weight = weight; }
    public int getWeight() { return weight; }
}

class Worker implements Runnable {
    private final int id;
    private final Product product;
    private final CountDownLatch latch;
    private final String action;

    public Worker(int id, Product product, CountDownLatch latch, String action) {
        this.id = id;
        this.product = product;
        this.latch = latch;
        this.action = action;
    }

    @Override
    public void run() {
        try {
            System.out.println("Грузчик #" + id + " " + action + " товар " + product.getWeight() + " кг.");
            Thread.sleep(1000);
            System.out.println("Грузчик #" + id + " закончил " + action + ".");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
        }
    }
}

public class WarehouseApp {
    public static void main(String[] args) {
        Product[] products = { new Product(50), new Product(50), new Product(50) };
        System.out.println("--- Ждем загрузку 150 кг. ---");

        CountDownLatch loadingLatch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            new Thread(new Worker(i + 1, products[i], loadingLatch, "ЗАГРУЗКА")).start();
        }

        try {
            loadingLatch.await();
            System.out.println("\n>>> Машина заполнена (150 кг) и выехала на склад разгрузки... >>>\n");

            Thread.sleep(2000);

            System.out.println("--- Машина приехала на склад Б. Требуется разгрузка. ---");
            CountDownLatch unloadingLatch = new CountDownLatch(3);
            for (int i = 0; i < 3; i++) {
                new Thread(new Worker(i + 1, products[i], unloadingLatch, "РАЗГРУЗКА")).start();
            }

            unloadingLatch.await();
            System.out.println("\n--- Машина пуста ---");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}