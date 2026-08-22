class Solution {
    public boolean checkDivisibility(int n) {
       int sum=0,pro=1,t=n;
       while(n>0){
        int digit=n%10;
        sum+=digit;
        pro*=digit;
        n/=10;
       } 
       if(t%(sum+pro)==0){
        return true;
       }else{
        return false;
       }
    }
}