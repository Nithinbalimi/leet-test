class Solution {
    public String convertToTitle(int columnNumber) {
        char[] c=new char[7];
        int i=7;
        while(columnNumber>0){
            columnNumber--;
            c[--i]=(char)('A'+(columnNumber%26));
            columnNumber/=26;
        }
        return new String(c,i,7-i);
    }
}