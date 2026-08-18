class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        int i=0;
        while(i<a.length){
            int j=0;
            while(j<nums.length){
                a[i]=nums[j];
                i++;j++;
            }
        }
        return a;
    }
}