package cli;

import algorithms.SelectionSort;
import metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunnerBig {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        Random random = new Random();

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(n * 10);
            }

            PerformanceTracker tracker = new PerformanceTracker();

            long start = System.nanoTime();
            SelectionSort.sort(arr, tracker);
            long end = System.nanoTime();

            double timeMs = (end - start) / 1_000_000.0;

            System.out.printf("n = %d → time = %.3f ms | comparisons = %d | swaps = %d%n",
                    n, timeMs, tracker.getComparisons(), tracker.getSwaps());
        }
    }
}
