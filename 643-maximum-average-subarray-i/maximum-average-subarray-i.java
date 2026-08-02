class Solution {
    public double findMaxAverage(int[] nums, int k) {
       if(k>nums.length) return -1;
       double cursum=0;
       for(int i=0;i<k;i++){
            cursum+=nums[i];
       } 
       double maxsum=cursum;
       for(int i=k;i<nums.length;i++){
            cursum+=nums[i]-nums[i-k];
            maxsum=Math.max(cursum,maxsum);
       } 
       return maxsum/k;
    }
}