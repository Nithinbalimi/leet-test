class Solution {
    public int countCommas(int n) {
        if(n<=999)return 0;
        int count=0;
        if(n>=1000 && n<=999999){
            count+=n-999;
        }else if(n>999999 && n<=Integer.MAX_VALUE){
            count+=2*(n-999);
        }
        return count;
    }
}