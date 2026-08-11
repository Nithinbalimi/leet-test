class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int presum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                presum+=nums[i];
            }else{
                break;
            }
        }
        Set<Integer> nset=new HashSet<Integer>();
        for(int n : nums){
            nset.add(n);
        }
        int c=presum;
        while(nset.contains(c)){
            c++;
        }
        return c;
    }
}