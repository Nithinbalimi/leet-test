class Solution {
    public String reverseOnlyLetters(String s) {
        String t="";
        int f=0;
        int i=0,j=s.length()-1;
        while(i<s.length()){
            char c1=s.charAt(i);
            if((c1>='a' && c1<='z')||(c1>='A' && c1<='Z')){
                while(j>=0){
                    char c2=s.charAt(j);
                    if((c2>='a' && c2<='z')||(c2>='A' && c2<='Z')){
                        break;
                    }
                    j--;
                }
                t=t+s.charAt(j);
                j--;
                i++;
            }
            else{
                t=t+c1;
                i++;
               
            }
           
        }
        return t;
    }
}