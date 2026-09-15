class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int i=0,n=nums.length-1;
       while(i<n){
            if(nums[i]%2==0){
                i++;
            }
            else if(nums[n]%2!=0){
                n--;
            }
            else{
                int t=nums[i];
                nums[i]=nums[n];
                nums[n]=t;
                i++;
                n--;
            }
       } return nums;
    }
}