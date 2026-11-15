class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        long oddCount = 0;
        long evenCount = 1; // Base case: prefix sum 0 is even
        long currentPrefixSum = 0;
        long totalSubarrays = 0;

        for (int num : arr) {
            currentPrefixSum += num;
            
            if (currentPrefixSum % 2 != 0) {
                // If current prefix sum is odd, combine with previous even prefix sums
                totalSubarrays = (totalSubarrays + evenCount) % MOD;
                oddCount++;
            } else {
                // If current prefix sum is even, combine with previous odd prefix sums
                totalSubarrays = (totalSubarrays + oddCount) % MOD;
                evenCount++;
            }
        }

        return (int) totalSubarrays;   
    }
}