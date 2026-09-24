class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int res=0;
            if(nums[i]==i && i<10){
                return i;
            }
            if(nums[i]>i){
                int num=nums[i];
                while(num>0){
                    res+=num%10;
                    num/=10;
                }
                if(res==i){
                    return res;
                }
            }
        }return -1;
    }
}