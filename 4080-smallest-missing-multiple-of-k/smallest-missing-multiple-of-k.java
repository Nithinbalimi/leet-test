class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,ans=k;
        while(i<nums.length){
            if(nums[i]==ans){
                ans+=k;
            }
            i++;
        }
        return ans;
    }
}