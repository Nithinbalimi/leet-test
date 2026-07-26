class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3){
            return -1;
        }
        int p1=nums[n-1]*nums[n-2]*nums[n-3];
        int p2=nums[n-1]*nums[0]*nums[1];
        int p3=nums[0]*nums[1]*nums[2];
        if(p1>=p3 && p1>=p2){
            return p1;
        }else if(p2>=p1 && p2>=p3){
            return p2;
        }else{
            return p3;
        }

    }
}