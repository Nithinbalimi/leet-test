class Solution {
    public boolean checkValidString(String s) {
        int lc=0,rc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                lc++;
                rc++;
            }
            else if(s.charAt(i)==')'){
                rc--;
                lc--;
            }
            else{
                lc++;
                rc--;
            }
        
        if(lc<0){
            return false;
        }
        else if(rc<0){
            rc=0;
        }
        }
        return rc==0;
    }
}