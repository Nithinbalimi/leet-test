class Solution {
    public int minOperations(int[] nums, int x) {
       int tsum=0;
        for(int y : nums){
            tsum+=y;
        }
        int t=tsum-x;
        if(t==0)return nums.length;
        if(t<0)return -1;
        int mlen=-1;
        int csum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            csum+=nums[j];
            while(csum>t && i<=j){
                csum-=nums[i];
                i++;
            }
            if(csum==t){
                mlen=Math.max(mlen,j-i+1);
            }
        }
        return mlen==-1 ? -1 : nums.length-mlen;
    }
}