class Solution {
    public char findTheDifference(String s, String t) {
        int csum=0;
        for(char c : t.toCharArray()){
            csum+=c;
        }
        for(char c : s.toCharArray()){
            csum-=c;
        }
        return (char)csum;
    }
}