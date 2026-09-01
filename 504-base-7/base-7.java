class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean isNeg=false;
        if(num<0){
            isNeg=true;
        }
        num=Math.abs(num);
        int ans=0;
        int pv=1;
        while(num>0){
            int digit=num%7;
            ans+=pv*digit;
            pv*=10;
            num/=7;
        }
        if(isNeg){
            return "-"+ans;
        }else{
            return ""+ans;
        }
    }
}