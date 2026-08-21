class Solution {
    public String concatHex36(int n) {
       long s=n*n;
       long c=n*n*n;
       String hex=Long.toString(s,16).toUpperCase();
       String hextri=Long.toString(c,36).toUpperCase();
        return hex+hextri;
    }
}