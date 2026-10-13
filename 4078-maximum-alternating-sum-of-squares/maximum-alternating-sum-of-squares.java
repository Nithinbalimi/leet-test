import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squared = new long[n];
        for (int i = 0; i < n; i++) {
            long val = nums[i];
            squared[i] = val * val;
        }
        
        Arrays.sort(squared);
        
        long totalSum = 0;
        int mid = n / 2;
        
        for (int i = 0; i < mid; i++) {
            totalSum -= squared[i];
        }
        
        for (int i = mid; i < n; i++) {
            totalSum += squared[i];
        }
        
        return totalSum;
    }
}