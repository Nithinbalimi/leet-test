class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int k=flowerbed.length;
        for(int i=0;i<k;i++){
            if(flowerbed[i]==0){
                boolean l=(i==0 || flowerbed[i-1]==0);
                boolean r=(i==k-1 || flowerbed[i+1]==0);
                if(l && r){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }if(count>=n){
            return true;
        }
        return false;
    }
}