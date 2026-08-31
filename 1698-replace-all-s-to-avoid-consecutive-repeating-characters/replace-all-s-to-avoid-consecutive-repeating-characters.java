class Solution {
    public String modifyString(String s) {
       char a[]=s.toCharArray();
       int n=a.length;
       for(int i=0;i<a.length;i++){
            if(a[i]=='?'){
                for(char c='a';c<='c';c++){
                    if(i>0 && a[i-1]==c)continue;
                    if(i<n-1 && a[i+1]==c)continue;
                    a[i]=c;
                    break;
                }
            }
       } return new String(a);
    }
}