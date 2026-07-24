class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]==0){
                i++;
            }else{
                nums[j]=nums[i];
                j++;
                i++;
            }
        }while(j<nums.length){
            nums[j]=0;
            j++;
        }
        System.out.print("[");
        for( int x=0;x<nums.length;x++){
            System.out.print(nums[x]+",");
        }System.out.print("]");
    }
}