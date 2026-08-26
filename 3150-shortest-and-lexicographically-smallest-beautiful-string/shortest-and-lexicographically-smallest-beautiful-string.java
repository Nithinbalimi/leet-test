class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       int x=0,c=0;
       while(x<s.length()){
            if(s.charAt(x)!='1'){
                c++;
            }x++;
       }
       if(c==s.length())return "";
       int min=Integer.MAX_VALUE;
       String ans="";
       for(int l=1;l<=s.length();l++){
        for(int i=0;i<=s.length()-l;i++){
            String t="";
            for(int j=i;j<i+l;j++){
                t=t+s.charAt(j);
            }if(isLexi(t,k)){
                if(t.length()<min){
                    min=t.length();
                    ans=t;
                }else if(t.length()==min && t.compareTo(ans)<0){
                    ans=t;
                }
            }
        }
       }
       return ans;
    }
    public static boolean isLexi(String t,int k){
        int count=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='1'){
                count++;
            }
        }return k==count;
    }
}