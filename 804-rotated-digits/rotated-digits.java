class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        // dp array to store the status of each number up to n:
        // 0: invalid, 1: valid and same as original, 2: valid and different (good)
        int[] dp = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            if (i < 10) {
                if (i == 0 || i == 1 || i == 8) {
                    dp[i] = 1;
                } else if (i == 2 || i == 5 || i == 6 || i == 9) {
                    dp[i] = 2;
                    count++;
                } else {
                    dp[i] = 0;
                }
            } else {
                int a = dp[i / 10];
                int b = dp[i % 10];
                
                // If either part is invalid (0)
                if (a == 0 || b == 0) {
                    dp[i] = 0;
                } 
                // If both parts are unchanged (1), the number is unchanged
                else if (a == 1 && b == 1) {
                    dp[i] = 1;
                } 
                // Otherwise, it's a good number
                else {
                    dp[i] = 2;
                    count++;
                }
            }
        }
        
        return count;
    }
}