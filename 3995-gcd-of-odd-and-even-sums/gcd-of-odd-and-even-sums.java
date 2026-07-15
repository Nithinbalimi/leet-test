class Solution {
    public int gcdOfOddEvenSums(int n) {
        int c1=0;
        int sum1=0;
        int c2=0;
        int sum2=0;
        for(int i=1;c1<n;i+=2){
            c1++;
            sum1+=i;
        }
        for(int i=2;c2<n;i+=2){
            c2++;
            sum2+=i;
        }
        int min=Math.min(sum1,sum2);
        for(int i=min;i>=1;i--){
            if(sum1%i==0 && sum2%i==0){
                return i;
            }
        }
        return 1;
    }
}