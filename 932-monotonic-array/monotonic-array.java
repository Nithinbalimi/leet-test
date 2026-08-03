class Solution {
    public boolean isMonotonic(int[] nums) {
        int count1=1,count2=1;
        int i=0,j=1;
        while(i<nums.length-1 && j<nums.length){
            if(i<=j){
                if(nums[i]<=nums[j]){
                    count1++;
                }
                if(nums[i]>=nums[j]){
                    count2++;
                }
                i++;
                j++;
            }
        }
        if(count1==nums.length || count2==nums.length){
            return true;
        }
        return false;
    }    
}