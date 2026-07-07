class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long ne=0;
        long m=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sum+=digit;
                ne+=m*digit;
                m*=10;
            }
            n=n/10;
        }
        return ne*sum;
    }
}