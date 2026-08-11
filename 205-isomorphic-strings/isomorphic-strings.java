class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int i=0,j=0,count=0;
        while(i<s.length() || j<t.length()){
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(j))){
                break;
            }
            count++;
            i++;
            j++;
        }   
        return count==s.length();
    }
}