import java.util.Scanner;

public class KnapsackProblem {

    // Function to solve the knapsack problem
    public static int knapsack(int[] weights, int[] values, int capacity, int n) {
        int[][] dp = new int[n + 1][capacity + 1];

        // Building the DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    // Max of including or excluding the item
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w]; // Exclude the item
                }
            }
        }

        return dp[n][capacity]; // Maximum value that can be achieved
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of items and capacity
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        System.out.print("Enter the knapsack capacity: ");
        int capacity = sc.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        // Input weights and values
        System.out.println("Enter weights of the items: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.println("Enter values of the items: ");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        // Solve the knapsack problem
        int maxValue = knapsack(weights, values, capacity, n);

        System.out.println("Maximum value that can be achieved: " + maxValue);

        sc.close();
    }
}
