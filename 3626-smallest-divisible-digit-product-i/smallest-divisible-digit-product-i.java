class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int i=n;
            int pro=1;
            while(i>0){
                int digit=i%10;
                pro=pro*digit;
                i=i/10;
            }
            if(pro%t==0){
                return n;
            }
            n++;
        }
    }
}