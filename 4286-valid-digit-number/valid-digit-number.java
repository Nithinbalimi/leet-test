class Solution {
    public boolean validDigit(int n, int x) {
       boolean b=false;
       int f=0;
       if(n==0){
        return false;
       }
       while(n>0){
        int digit=n%10;
        if(digit==x){
            b= true;
        }
        f=digit;
        n=n/10;
       } 
       return b && (f!=x);
    }
}