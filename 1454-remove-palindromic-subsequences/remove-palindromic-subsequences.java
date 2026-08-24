class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()){
            return 0;
        }   
        if(isPalindrom(s)){
            return 1;
        }
        return 2;
    }
    public static boolean isPalindrom(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }return true;
    }
}