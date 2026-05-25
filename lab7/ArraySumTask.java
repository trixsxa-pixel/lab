import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ArraySumTask {
    public static void main(String[] args) throws Exception {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int chunkSize = array.length / numThreads;
        List<Future<Long>> results = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;

            results.add(executor.submit(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) sum += array[j];
                return sum;
            }));
        }

        long totalSum = 0;
        for (Future<Long> res : results) {
            totalSum += res.get();
        }

        System.out.println("Общая сумма массива: " + totalSum);
        executor.shutdown();
    }
}