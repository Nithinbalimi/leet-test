class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] a={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        char[] res=new char[8];
        int i=7;
        while(num!=0){
            int fbits=num&15;
            res[i]=a[fbits];
            i--;
            num=num>>>4;
        }
        return new String(res,i+1,7-i);
    }

}