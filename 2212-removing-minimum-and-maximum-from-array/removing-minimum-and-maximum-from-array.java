class Solution {
    public int minimumDeletions(int[] nums) {
        int minind=0;
        int maxind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[maxind]){
                maxind=i;
            }
            if(nums[i]<nums[minind]){
                minind=i;
            }
        }
        int l=Math.min(minind,maxind);
        int r=Math.max(minind,maxind);
        int rf=r+1;
        int rl=nums.length-l;
        int rb=(l+1)+(nums.length-r);
        return Math.min(rf,Math.min(rl,rb));
    }
}