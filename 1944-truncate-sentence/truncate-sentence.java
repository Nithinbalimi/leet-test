class Solution {
    public String truncateSentence(String s, int k) {
        String t[]=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
           ans=ans+t[i]+" ";
        }
        return ans.trim();
    }
}