package recursion;

import java.time.Duration;
import java.time.Instant;

public class TripleStep {

    public static void main(String[] args) {
        Instant start1 = Instant.now();
        System.out.println(count(36));
        Instant start2 = Instant.now();
        System.out.println("Time Taken : " + Duration.between(start1, start2).getNano());
        System.out.println(countWays_book(36));
        Instant start3 = Instant.now();
        System.out.println("Time Taken : " + Duration.between(start2, start3).getNano());
        System.out.println(countWays_memoization(36));
        Instant start4 = Instant.now();
        System.out.println("Time Taken : " + Duration.between(start3, start4).getNano());
    }


    public static int count(int n) {
        return hop(1, n) + hop(2, n) + hop(3, n);
    }

    private static int hop(int hopCount, int n) {
        n = n - hopCount;

        if (n < 0) {
            return 0;
        }

        switch (n) {
            case 0:
                return 1;
            case 1:
                return hop(1, n);
            case 2:
                return hop(1, n) + hop(2, n);
        }

        return hop(1, n) + hop(2, n) + hop(3, n);
    }


    public static int countWays_book(int n) {

        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }

        return countWays_book(n - 1) + countWays_book(n - 2) + countWays_book(n - 3);
    }

    public static int countWays_memoization(int n) {
        int[] results = new int[n + 1];
        for (int i = 0; i < results.length; i++) {
            results[i] = -1;
        }

        return countWays_memoization(n, results);
    }

    private static int countWays_memoization(int n, int[] results) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (results[n] < 0) {
            results[n] = countWays_memoization(n - 1, results)
                    + countWays_memoization(n - 2, results)
                    + countWays_memoization(n - 3, results);
        }

        return results[n];
    }
}
