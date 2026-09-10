class Solution {
    public String reverseWords(String s) {
        String res="";
        String []a=s.trim().split("\\s+");
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            res +=a[i];
            if(i>0){
                res+=" ";
            }
        }
        return res.trim();
    }
}