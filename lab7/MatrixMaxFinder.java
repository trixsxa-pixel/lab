import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MatrixMaxFinder {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
                {1, 5, 12},
                {45, 2, 8},
                {199, 33, 7}
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int[] row : matrix) {
            futures.add(executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for (int val : row) if (val > max) max = val;
                return max;
            }));
        }

        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> f : futures) {
            globalMax = Math.max(globalMax, f.get());
        }

        System.out.println("Наибольший элемент в матрице: " + globalMax);
        executor.shutdown();
    }
}