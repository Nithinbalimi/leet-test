class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
        k=k%nums.length;
        int i=0,j=nums.length-k,x=0;
        while(j<nums.length && x<ans.length){
            ans[x]=nums[j];
            j++;
            x++;
        }while(i<nums.length-k){
            ans[x]=nums[i];
            i++;
            x++;
        }
        for(int y=0;y<nums.length;y++){
            nums[y]=ans[y];
        }
        for(int y=0;y<ans.length;y++){
            System.out.print(ans[y]+" ");
        }
    }
}