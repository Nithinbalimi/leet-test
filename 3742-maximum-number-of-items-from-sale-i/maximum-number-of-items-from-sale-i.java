class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int maxFactor = 0;
        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
        }

        // Count frequency of each factor
        int[] factorCount = new int[maxFactor + 1];
        for (int[] item : items) {
            factorCount[item[0]]++;
        }

        // divisibleCount[f] stores how many items have factor divisible by f
        int[] divisibleCount = new int[maxFactor + 1];
        for (int f = 1; f <= maxFactor; f++) {
            for (int mult = f; mult <= maxFactor; mult += f) {
                divisibleCount[f] += factorCount[mult];
            }
        }

        // dp[w] = max total items obtained using cost w
        int[] dp = new int[budget + 1];

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];
            int firstCopyValue = divisibleCount[factor];

            if (price > budget) continue;

            // Step 1: Process buying the FIRST copy (0/1 Knapsack: loop backwards)
            for (int w = budget; w >= price; w--) {
                dp[w] = Math.max(dp[w], dp[w - price] + firstCopyValue);
            }

            // Step 2: Process buying ADDITIONAL copies (Unbounded Knapsack: loop forwards)
            for (int w = price; w <= budget; w++) {
                dp[w] = Math.max(dp[w], dp[w - price] + 1);
            }
        }

        int maxItems = 0;
        for (int w = 0; w <= budget; w++) {
            maxItems = Math.max(maxItems, dp[w]);
        }

        return maxItems;
    }
}